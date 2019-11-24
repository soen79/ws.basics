package com.greenleaf.project.desktop_organizer;

import javafx.beans.NamedArg;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class DesktopManager {

    public void execute() throws IOException {

        // This gets every file in the desktop - recursively goes in each folder until the file is reached
        Stream<Path> pathStream = Files.walk(Paths.get("C:\\Users\\User\\Desktop"));

        //pathStream.forEach(x -> System.out.println(x));


        pathStream.filter(Files::isRegularFile)
                .forEach(x -> System.out.println(x));

    }
}
