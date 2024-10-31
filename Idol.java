/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.forum5_2;

/**
 *
 * @author LENOVO
 */
public class Idol extends Agency{
    String idolName;

    public Idol(String agencyName, String idolName) {
        super(agencyName);
        this.idolName = idolName;
    }

    public void perform() {
        System.out.println(idolName + " is performing on stage.");
    }
}
