
package com.poly.lab6;

public class HinhTruDemo {

    public static void main(String[] args) {

        Cylinder cy = new Cylinder(2, "Xanh", 3);

        System.out.println(cy);

        cy.setHeight(0);

        System.out.println(cy);
    }
}
