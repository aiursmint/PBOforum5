/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.forum5_2;

/**
 *
 * @author LENOVO
 */
public class Actor extends Agency {
    String actorName;

    public Actor(String agencyName, String actorName) {
        super(agencyName);
        this.actorName = actorName;
    }

    public void act() {
        System.out.println(actorName + " is acting in a new movie.");
    }
}
