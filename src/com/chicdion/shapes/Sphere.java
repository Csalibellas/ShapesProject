package com.chicdion.shapes;

public class Sphere extends Shape {
    private double radius;

    public Sphere(double radius) {
        if (radius <= 0) throw new IllegalArgumentException("Radius must be greater than 0.");
        this.radius = radius;
    }

    @Override
    public double surface_area() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double volume() {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }

    @Override
    public String toString() {
        return "Sphere (radius=" + radius + ")\n"
                + "Surface Area: " + String.format("%.4f", surface_area()) + "\n"
                + "Volume: " + String.format("%.4f", volume());
    }
}
