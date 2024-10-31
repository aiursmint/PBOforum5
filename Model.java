/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.forum5_2;

/**
 *
 * @author LENOVO
 */
public class Model extends Agency {
    String modelName;

    public Model(String agencyName, String modelName) {
        super(agencyName);
        this.modelName = modelName;
    }

    public void walk() {
        System.out.println(modelName + " is walking the runway.");
    }
}
