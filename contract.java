/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.forum5_1;

/**
 *
 * @author LENOVO
 */
public class contract extends agency {
    int contractDuration; // dalam bulan

    public contract(String name, String location, int contractDuration) {
        super(name, location); // Menggunakan constructor dari Agency
        this.contractDuration = contractDuration;
    }

    public void showContractDetails() {
        System.out.println("Contract Duration: " + contractDuration + " months");
    }
}

