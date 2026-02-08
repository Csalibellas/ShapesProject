package com.chicdion.shapes;

public class ShapeArray {
    public static void main(String[] args) {

        Shape sphere = new Sphere(2.0);
        Shape cylinder = new Cylinder(3.0, 6.0);
        Shape cone = new Cone(3.5, 5.0);

        Shape[] shapeArray = { sphere, cylinder, cone };

        for (int i = 0; i < shapeArray.length; i++) {
            System.out.println("----- Shape " + (i + 1) + " -----");
            System.out.println(shapeArray[i]);
            System.out.println();
        }

        // Test case idea
        // Shape bad = new Sphere(-2);
    }
}