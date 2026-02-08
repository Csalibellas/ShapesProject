package com.chicdion.shapes;

public class Cone extends Shape {
    private double radius;
    private double height;

    public Cone(double radius, double height) {
        if (radius <= 0 || height <= 0) throw new IllegalArgumentException("Radius and height must be greater than 0.");
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double surface_area() {
        double slantHeight = Math.sqrt(radius * radius + height * height);
        return Math.PI * radius * (radius + slantHeight);
    }

    @Override
    public double volume() {
        return (1.0 / 3.0) * Math.PI * radius * radius * height;
    }

    @Override
    public String toString() {
        return "Cone (radius=" + radius + ", height=" + height + ")\n"
                + "Surface Area: " + String.format("%.4f", surface_area()) + "\n"
                + "Volume: " + String.format("%.4f", volume());
    }
}