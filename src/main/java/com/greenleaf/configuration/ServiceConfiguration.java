package com.greenleaf.configuration;

import com.greenleaf.service.WebScraperService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by User on 10/19/2019.
 */
@Configuration
public class ServiceConfiguration {


    @Bean
    public WebScraperService webScraperService() {
        return new WebScraperService();
    }
}
