package com.feedback;

public class Feedback {
    private String name;
    private String email;
    private String course;
    private String rating;
    private String message;

    public void setName(String name) { this.name = name; }
    public void setEmail(String email) { this.email = email; }
    public void setCourse(String course) { this.course = course; }
    public void setRating(String rating) { this.rating = rating; }
    public void setMessage(String message) { this.message = message; }

    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getCourse() { return course; }
    public String getRating() { return rating; }
    public String getMessage() { return message; }
}
