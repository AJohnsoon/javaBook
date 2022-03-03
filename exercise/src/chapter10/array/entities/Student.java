package chapter10.array.entities;

public class Student {
    public String name;
    private String email;
    private int room;

    public Student() {
    }

    public Student(String name, String email, int room) {
        this.name = name;
        this.email = email;
        this.room = room;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "\n Busy rooms:\n { name: " + name +
                ", email: " + email +
                ", room: " + room +
                " }";
    }

}
