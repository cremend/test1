package com.xperad.contact.model;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: xperad
 * Date: 2013/07/26
 * Time: 1:03
 * To change this template use File | Settings | File Templates.
 */
public class Task {
    private String taskId;
    private String taskName;
    private Date deadTime;
    private Integer taskSize;

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public Date getDeadTime() {
        return deadTime;
    }

    public void setDeadTime(Date deadTime) {
        this.deadTime = deadTime;
    }

    public Integer getTaskSize() {
        return taskSize;
    }

    public void setTaskSize(Integer taskSize) {
        this.taskSize = taskSize;
    }
}
