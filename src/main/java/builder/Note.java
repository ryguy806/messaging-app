package builder;

import org.apache.tomcat.jni.Local;

import java.time.LocalDate;
import java.util.UUID;

public class Note {
    private UUID id;
    private String author;
    private String message;
    private LocalDate posted;

    public Note(String author, String message, LocalDate posted) {
        id = UUID.randomUUID();
        this.author = author;
        this.message = message;
        this.posted = posted;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDate getPosted() {
        return posted;
    }

    public void setPosted(LocalDate posted) {
        this.posted = posted;
    }
}
