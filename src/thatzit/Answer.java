package thatzit;

import java.util.List;
import java.util.LinkedList;

public class Answer {
    private int id;
    private String description;
    private String password;
    private int status;
    private int likes;
    private boolean deleted=false;

    public Answer(int id) {
        this.id = id;
        status = 1;
        likes = 0;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public int getLike() {
        return likes;
    }

    public void like() {
        likes++;
    }

    public void report() {
        status = 3;
    }

    public void delete() {
        this.deleted=true;
    }
    public boolean isDeleted(){
    	return deleted;
    }
}
