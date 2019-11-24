package com.greenleaf.project.desktop_organizer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Created by User on 11/23/2019.
 */
@Configuration
public class DesktopOrganizerConfig {

    @Bean
    @Scope("prototype")
    public DesktopManager desktopManager() {
        System.out.println("INSTANTIATION A NEW DESKTOP MANAGER");
        return new DesktopManager();
    }

}
