package code;

public class Member {

    String name;
    int age;
    String phone;

    Member(String name, int age, String phone) {

        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public String toString() {

        return "Name: " + name +
               ", Age: " + age +
               ", Phone: " + phone;
    }
}