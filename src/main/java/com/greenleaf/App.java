package com.greenleaf;

import com.greenleaf.configuration.ServiceConfiguration;
import com.greenleaf.service.WebScraperService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by User on 10/19/2019.
 */
public class App {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ServiceConfiguration.class);

        WebScraperService webScraperService = (WebScraperService)ctx.getBean("WebScraperService");

        webScraperService.getMessage();
    }
}
