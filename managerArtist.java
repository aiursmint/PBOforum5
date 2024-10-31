/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.forum5_1;

/**
 *
 * @author LENOVO
 */
public class managerArtist extends agency {
    String artistName;

    public managerArtist(String name, String location, String artistName) {
        super(name, location); // Menggunakan constructor dari Agency
        this.artistName = artistName;
    }

    public void manageArtist() {
        System.out.println("Managing artist: " + artistName);
    }
}
