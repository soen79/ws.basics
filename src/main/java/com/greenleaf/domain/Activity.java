package com.greenleaf.domain;

/**
 * Created by User on 3/6/2019.
 */
public class Activity {

    private String task;


    public Activity(String task){
        this.task = task;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }
}
