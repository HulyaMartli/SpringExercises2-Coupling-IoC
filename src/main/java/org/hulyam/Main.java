package org.hulyam;

public class Main {
    public static void main(String[] args) {
        // Calculator class is tight coupled with shape classes (Square, Triangle)

        // var shape = new Square();
        var shape = new Triangle(); // Creating object
        var calculator = new Calculator(shape); // Creating object + Wiring of Dependencies
        // Here, shape is a dependency for calculator.
        // shape object is injected in calculator object. ==> DI: Dependency Injection
        calculator.calculate();
    }
}