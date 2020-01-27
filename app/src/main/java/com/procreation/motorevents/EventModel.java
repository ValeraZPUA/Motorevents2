package com.procreation.motorevents;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EventModel {

    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("title_red")
    @Expose
    private String titleRed;

    @SerializedName("description")
    @Expose
    private String description;

    @SerializedName("startDate")
    @Expose
    private int startDate;

    @SerializedName("endDate")
    @Expose
    private int endDate;

    @SerializedName("eventLogo")
    @Expose
    private String eventLogo;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitleRed() {
        return titleRed;
    }

    public void setTitleRed(String titleRed) {
        this.titleRed = titleRed;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStartDate() {
        return startDate;
    }

    public void setStartDate(int startDate) {
        this.startDate = startDate;
    }

    public int getEndDate() {
        return endDate;
    }

    public void setEndDate(int endDate) {
        this.endDate = endDate;
    }

    public String getEventLogo() {
        return eventLogo;
    }

    public void setEventLogo(String eventLogo) {
        this.eventLogo = eventLogo;
    }
}
