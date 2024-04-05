package com.example.workflowmanagementandroid.Model;

import java.util.Date;
import java.util.List;


public class TaskMember {


    private long id;

    private Date dateFinish;

    private boolean isFinish;

    private String content;

    private Task task;


    private User user;


    private List<DetailTaskMember> listDetalDetailTaskMember;


    private List<Media> listMedia;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDateFinish() {
        return dateFinish;
    }

    public void setDateFinish(Date dateFinish) {
        this.dateFinish = dateFinish;
    }

    public boolean isFinish() {
        return isFinish;
    }

    public void setFinish(boolean finish) {
        isFinish = finish;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<DetailTaskMember> getListDetalDetailTaskMember() {
        return listDetalDetailTaskMember;
    }

    public void setListDetalDetailTaskMember(List<DetailTaskMember> listDetalDetailTaskMember) {
        this.listDetalDetailTaskMember = listDetalDetailTaskMember;
    }

    public List<Media> getListMedia() {
        return listMedia;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setListMedia(List<Media> listMedia) {
        this.listMedia = listMedia;
    }
}
