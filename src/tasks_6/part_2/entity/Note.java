package tasks_6.part_2.entity;

public class Note {
    private String topic;
    private String date;
    private String email;
    private String message;

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Note(String topic, String date, String email, String message) {
        this.topic = topic;
        this.date = date;
        this.email = email;
        this.message = message;
    }

    @Override
    public String toString() {
        return "Topic: " + topic + "  Date: " + date + "  Email: " + email + "  Message: " + message;
    }
}


