package com.example.validateform.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.*;

@Entity
public class User {
    @Id
    private int id;

    @NotEmpty
    @Size(min = 5 , max = 45 , message = "{User.firstName.size}")
    private String firstName;

    @NotEmpty
    @Size(min = 5 , max = 45 , message = "{User.lastName.size}")
    private String lastName;

    @Pattern(regexp = "(84|0[3|5|7|8|9])+([0-9]{8})", message = "{User.phoneNumber}")
    @Size(min = 10 , max = 10 ,message = "{User.phoneNumber.size}")
    private String phoneNumber;

    @Min(value = 18 , message = "Tuổi phải lớn hớn 18")
    private int age;

    @NotBlank
    @Email(message = "Your Email not Valid")
    private String email;

    public User() {
    }

    public User(int id, String firstName, String lastName, String phoneNumber, int age, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
