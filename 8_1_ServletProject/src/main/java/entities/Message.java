package entities;

public class Message {

    private String email;
    private String phone;
    private String message;

    public Message(String email, String phone, String message) {
        this.email = email;
        this.phone = phone;
        this.message = message;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "entities.Message{" +
                "email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
