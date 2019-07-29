package com.enfrausa.recyclerview;

public class Event {

    private String Title;
    private String Category;
    private String Description;
    private int Thumbnail;

    public Event() {
    }

    public Event(String title, String category, String description, int thumbnail) {
        Title = title;
        Category = category;
        Description = description;
        Thumbnail = thumbnail;
    }
}
