package com.chicdion.shapes;

public class Cylinder extends Shape {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        if (radius <= 0 || height <= 0) throw new IllegalArgumentException("Radius and height must be greater than 0.");
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double surface_area() {
        return 2 * Math.PI * radius * (height + radius);
    }

    @Override
    public double volume() {
        return Math.PI * radius * radius * height;
    }

    @Override
    public String toString() {
        return "Cylinder (radius=" + radius + ", height=" + height + ")\n"
                + "Surface Area: " + String.format("%.4f", surface_area()) + "\n"
                + "Volume: " + String.format("%.4f", volume());
    }
}