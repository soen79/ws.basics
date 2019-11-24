package com.greenleaf.domain;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Optional;

/**
 * Created by User on 3/1/2019.
 */
public class Main_Processing_Date {


    public static void main(String[] args){
        Date today = new Date();
        System.out.println(today);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("LocalDateTime: " + localDateTime);

        Optional<Activity> activity = getTask();

        //activity.filter(x -> x.getTask() == null).ifPresent( y -> System.out.println("Throw exception"));
        //activity.map(Activity::getTask)
                //.filter(x -> x != null)
               // .orElseThrow(y -> System.out.println("Throw exception"));


    }

    public static Optional<Activity> getTask() {

        return Optional.ofNullable(null);  // executes the if present
        //return Optional.of(new Activity("batman"));  // executes the if present
        //return Optional.empty(); // does not execute  the if present
    }
}
