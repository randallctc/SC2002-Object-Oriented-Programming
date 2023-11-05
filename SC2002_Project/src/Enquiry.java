import java.util.*;
public class Enquiry {
    String studentName;
    String content;
    String reply;
    String camp;
    public Enquiry(String string, String name){
        this.content = string;
        this.reply = null;
        this.camp = name;
    }
    void setContent(String string){
        this.content = string;
    }
    String getContent(){
        return this.content;
    }
    void setReply(String string){
        this.reply = string;
    }
    String getReply(){
        return this.reply;
    }
    String getStudentName(){
        return this.studentName;
    }
    void setStudentName(String name){
        this.studentName = name;
    }
    String getCamp(){
        return this.studentName;
    }
    void setCamp(String name){
        this.camp = name;
    }
}
