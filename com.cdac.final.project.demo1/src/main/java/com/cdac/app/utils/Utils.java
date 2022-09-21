package com.cdac.app.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectInputStream;
import com.amazonaws.util.IOUtils;

@Component
public class Utils {
	@Value("${application.bucket.name}")
	private String bucketName;

	@Autowired
	private AmazonS3 s3Client;

	public String uploadFileAddress(String imagePath, String fileName) {
		FileInputStream convertedFile;
		try {
			convertedFile = new FileInputStream(imagePath);
			s3Client.putObject(new PutObjectRequest(bucketName,fileName,convertedFile,new ObjectMetadata()));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return fileName;
	}

	public String downloadFile(String fileName) {
        S3Object s3Object = s3Client.getObject(bucketName, fileName);
        S3ObjectInputStream objectContent = s3Object.getObjectContent();
        String path = "D://upload//" + fileName;
        try {
			IOUtils.copy(objectContent, new FileOutputStream(path));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return path;
    }
}
