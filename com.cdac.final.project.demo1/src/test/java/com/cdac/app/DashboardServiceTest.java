package com.cdac.app;

import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import com.cdac.app.bean.DashboardServiceImpl;

@Profile("test")
@Configuration
public class DashboardServiceTest {
   @Bean
   @Primary
   public DashboardServiceImpl dashboardService() {
      return Mockito.mock(DashboardServiceImpl.class);
   }
}
