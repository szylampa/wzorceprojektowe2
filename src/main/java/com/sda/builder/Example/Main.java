package com.sda.builder.Example;

public class Main {
    public static void main(String[] args) {
        Hero.Builder builder = new Hero.Builder();
        Hero bohater = builder.setHp(100).setPower(100).setMothersName("Ania").setAttackPower(300).setHeight(2).createHero();
    }
}
