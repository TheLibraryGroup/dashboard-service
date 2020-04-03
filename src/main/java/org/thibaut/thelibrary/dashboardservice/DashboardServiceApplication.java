package org.thibaut.thelibrary.dashboardservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
@EnableEurekaClient
public class DashboardServiceApplication {

	public static void main( String[] args ) {
		SpringApplication.run( DashboardServiceApplication.class, args );
	}

}
