package JavaBasedConfig;

import org.springframework.beans.factory.annotation.Value;

public class Student {
    @Value("Your Name")
    private  String book;

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public void study(){
        System.out.println("The student is studying " + book);
    }

    public String toString(){
        study();
        return "";
    }
}
