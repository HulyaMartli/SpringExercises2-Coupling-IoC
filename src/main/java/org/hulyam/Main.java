package org.hulyam;

public class Main {
    public static void main(String[] args) {
        // Calculator class is tight coupled with shape classes (Square, Triangle)

        // var shape = new Square();
        var shape = new Triangle();
        var calculator = new Calculator(shape);
        calculator.calculate();
    }
}