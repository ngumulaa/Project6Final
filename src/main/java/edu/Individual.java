package edu;

import javafx.scene.control.DatePicker;

public class Individual {
    // Four attributes for name, email, phone, and birthday
    private String name;
    private String email;
    private int phone;
    private int age;
    private String date;

    // Constructor that gives the default data 
    public Individual() {
        // Set the name attribute to "John Doe"
        name = "John Doe";
        // Set the email attribute to "jdoe@guilford"
        email = "jdoe@guilford.edu";
        // Set the phone attribute to "555-555-5555"
        phone = 555555555;
        // Set the birthday attribute to "01/01/2000"
        age = 19;
        // preset the date picker
        date = "12/12/12";
    }

    // Constructor with parameters
    public Individual(String name, String email, int phone, int age, String date) {
        // Set the name attribute to the name parameter
        this.name = name;
        // Set the email attribute to the email parameter
        this.email = email;
        // Set the phone attribute to the phone parameter
        this.phone = phone;
        // Set the birthday attribute to the birthday parameter
        this.age = age;
        // Set the date
        this.date = date;
    }

    // getters and setters
    // getter for name 
    public String getName() {
        // return the name attribute
        return name;
    }

    // setter for name
    public void setName(String name) {
        // set the name attribute to the name parameter
        this.name = name;
    }

    // getter for email
    public String getEmail() {
        // return the email attribute
        return email;
    }

    // setter for email
    public void setEmail(String email) {
        // set the email attribute to the email parameter
        this.email = email;
    }

    // getter for phone
    public int getPhone() {
        // return the phone attribute
        return phone;
    }

    // setter for phone
    public void setPhone(int phone) {
        // set the phone attribute to the phone parameter
        this.phone = phone;
    }

    // getter for age
    public int getAge() {
        // return the birthday attribute
        return age;
    }

    // setter for age
    public void setAge(int age) {
        // set the birthday attribute to the birthday parameter
        this.age = age;
    }

    // getter for date
    public String getDate() {
        // return the date attribute
        return date;
    }

    // setter for date
    public void setDate(String date) {
        // set the date attribute to the date parameter
        this.date = date;
    }

    // toString method
    @Override
    public String toString() {
        // return a string with the name, email, phone, and birthday attributes
        return "Name: " + name + "\nEmail: " + email + "\nPhone: " + phone + "\nAge: " + age + "\nDate: " + date;
    }
}
