package com.cdac.app.utils;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.PutObjectRequest;

@Component
public class Utils {
	@Value("${application.bucket.name}")
	private String bucketName;

	@Autowired
	private AmazonS3 s3Client;

	public String uploadFileAddress(String imagePath, String fileName) {
		File convertedFile = new File(imagePath);
		s3Client.putObject(new PutObjectRequest(bucketName, fileName, convertedFile));
		convertedFile.delete();
		return fileName;
	}
}
