package org.example;

public class User {

    int id;
    String f_Name;
    String e_Name;
    int age;
    String email;

    /**
     * Getter
     *
     */
    public int getId() {
        return id;
    }

    public String getF_Name() {
        return f_Name;
    }

    public String getE_Name() {
        return e_Name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    /**
     * Getter end*
     */

    /**
     * Setter
     *
     */
    public void setId(int id) {
        this.id = id;
    }

    public void setF_Name(String f_Name) {
        this.f_Name = f_Name;
    }

    public void setE_Name(String e_Name) {
        this.e_Name = e_Name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Setter end*
     */

    /**
     * Create a class constructor for User*
     */

    public User(int id, String f_Name, String e_Name, int age, String email) {
        this.id = id;
        this.f_Name = f_Name;
        this.e_Name = e_Name;
        this.age = age;
        this.email = email;

    }//User constructor


    @Override
    public String toString() {
        return "User{"
                + "id=" + id
                + ", f_Name='" + f_Name + '\''
                + ", e_Name='" + e_Name + '\''
                + ", age=" + age + '\''
                + ", email='" + email + '\''
                + '}';
    }
}//User
