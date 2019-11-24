package com.greenleaf.project.desktop_organizer;

import com.greenleaf.configuration.ServiceConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

/**
 * Created by User on 11/23/2019.
 */
public class MainApp {

    public static void main(String[] args) throws IOException {
       //
        // ApplicationContext ctx = new AnnotationConfigApplicationContext(ServiceConfiguration.class);

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(DesktopOrganizerConfig.class);
        DesktopManager manager = (DesktopManager)ctx.getBean("desktopManager");
        manager.execute();

        System.out.println("-------2nd printout ------------");
        DesktopManager manager2 = (DesktopManager)ctx.getBean("desktopManager");
        manager2.execute();

        ctx.close();
    }

}
