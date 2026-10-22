
package com.poly.lab6;

import java.util.Locale;

public class Circle {

    protected double radius = 1.0;
    protected String color = "Trang";

    public Circle() {
        radius = 1.0;
        color = "Trang";
    }

    public Circle(double radius, String color) {
        setRadius(radius);
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("Ban kinh khong hop le");
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return String.format(
                Locale.US,
                "Hinh tron [ban kinh=%.2f, mau=%s, chu vi=%.2f, dien tich=%.2f]",
                radius, color, getPerimeter(), getArea()
        );
    }
}
