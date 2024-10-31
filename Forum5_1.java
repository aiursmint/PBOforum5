/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.forum5_1;

/**
 *
 * @author LENOVO
 */
public class Forum5_1 {

    public static void main(String[] args) {
        // Membuat objek ManagerArtist
        managerArtist manager = new managerArtist("hitam kuning", "seoul", "haruto");
        System.out.println("=== ManagerArtist Info ===");
        manager.showInfo();
        manager.manageArtist();

        // Membuat objek Contract
        contract contract = new contract("hitam kuning", "seoul", 12);
        System.out.println("\n=== Contract Info ===");
        contract.showInfo();
        contract.showContractDetails();
    }
}
