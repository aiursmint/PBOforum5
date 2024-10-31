/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.forum5_2;

/**
 *
 * @author LENOVO
 */
public class Forum5_2 {

    public static void main(String[] args) {
        Agency agency = new Agency("hitam kuning");

        Manager manager1 = new Manager("Woo Zi");
        Manager manager2 = new Manager("Shin yu");
        agency.addManager(manager1);
        agency.addManager(manager2);

        Staff staff1 = new Staff("Beom Gyu");
        Staff staff2 = new Staff("Soo bin");
        agency.addStaff(staff1);
        agency.addStaff(staff2);

        Brand brand1 = new Brand("Gucci");
        Brand brand2 = new Brand("Nike");
        agency.addBrand(brand1);
        agency.addBrand(brand2);

        System.out.println("=== Agency Info ===");
        agency.showInfo();

        Idol idol = new Idol("hitam kuning", "Treasure");
        Actor actor = new Actor("hitam kuning", "Lee Jehoon");
        Model model = new Model("hitam kuning", "Ha Yujin");

        System.out.println("\n=== Talent Activities ===");
        idol.perform();
        actor.act();
        model.walk();
    }
}
