package ru.job4j.oop;

public class Student {

    public void music() {
        System.out.println("Tra ta ta");
    }

    public void sing() {
        System.out.println("I believe I an fly");
    }

    public static void main(String[] args) {
        Student petya = new Student();
        for (int i = 0; i < 3; i++) {
            petya.music();
        }
        for (int i = 0; i < 3; i++) {
            petya.sing();
        }
    }
}
