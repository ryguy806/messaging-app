package builder;

import java.time.LocalDate;

public class NoteBuilder {

    private String author;
    private String message;
    private LocalDate posted;

    public NoteBuilder(){
        //do nothing
    }

    public NoteBuilder author(String author){
        this.author = author;
        return this;
    }

    public NoteBuilder message(String message){
        this.message = message;
        return this;
    }
    public NoteBuilder posted(LocalDate posted){
        this.posted = posted;
        return this;
    }

    public Note build(){
        return new Note(author, message, posted);
    }
}
