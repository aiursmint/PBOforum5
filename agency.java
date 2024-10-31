/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.forum5_1;

/**
 *
 * @author LENOVO
 */
public class agency {
    String name;
    String location;

    public agency(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public void showInfo() {
        System.out.println("Agency Name: " + name);
        System.out.println("Location: " + location);
    }
}
