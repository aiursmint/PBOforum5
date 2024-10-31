/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.forum5_2;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author LENOVO
 */
public class Agency {
    String name;
    List<Manager> managers;           
    List<Staff> staffMembers;         
    List<Brand> associatedBrands;     

    public Agency(String name) {
        this.name = name;
        this.managers = new ArrayList<>();
        this.staffMembers = new ArrayList<>();
        this.associatedBrands = new ArrayList<>();
    }

    public void addManager(Manager manager) {
        managers.add(manager);
    }

    public void addStaff(Staff staff) {
        staffMembers.add(staff);
    }

    public void addBrand(Brand brand) {
        associatedBrands.add(brand);
    }

    public void showInfo() {
        System.out.println("Agency Name: " + name);
        System.out.println("Managers:");
        for (Manager manager : managers) {
            System.out.println("- " + manager.getManagerName());
        }
        System.out.println("Staff Members:");
        for (Staff staff : staffMembers) {
            System.out.println("- " + staff.getStaffName());
        }
        System.out.println("Associated Brands:");
        for (Brand brand : associatedBrands) {
            System.out.println("- " + brand.getBrandName());
        }
    }
}
