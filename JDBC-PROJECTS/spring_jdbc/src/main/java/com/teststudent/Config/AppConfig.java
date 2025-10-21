package com.teststudent.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.teststudent.model", "com.teststudent.Dao", "com.teststudent.DaoImpl","com.teststudent.Database", "com.teststudent.Service", "com.teststudent.ServiceImpl"})

public class AppConfig {

}
