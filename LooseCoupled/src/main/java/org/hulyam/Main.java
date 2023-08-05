package org.hulyam;

public class Main {
    public static void main(String[] args) {
        // Since we added the IShape interface now Calculator class is not tight coupled with shape classes
        // It is loose coupled.

        // var shape = new Triangle();
        var shape = new Rectangular();
        var calculator = new Calculator(shape);
        calculator.calculate();
    }
}