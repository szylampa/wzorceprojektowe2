package com.sda.builder.Example;

public class Hero {
    private int hp, power, attackPower, defencePower, mana, stamina, weight, height, footSize;
    private String name, surname, mothersName, fathersName, grandMothersName;

    private Hero(int hp, int power, int attackPower, int defencePower, int mana, int stamina, int weight, int height, int footSize, String name,
                 String surname, String mothersName, String fathersName, String grandMothersName) {
        this.hp = hp;
        this.power = power;
        this.attackPower = attackPower;
        this.defencePower = defencePower;
        this.mana = mana;
        this.stamina = stamina;
        this.weight = weight;
        this.height = height;
        this.footSize = footSize;
        this.name = name;
        this.surname = surname;
        this.mothersName = mothersName;
        this.fathersName = fathersName;
        this.grandMothersName = grandMothersName;
    }

    public static class Builder {

        private int hp;
        private int power;
        private int attackPower;
        private int defencePower;
        private int mana;
        private int stamina;
        private int weight;
        private int height;
        private int footSize;
        private String name;
        private String surname;
        private String mothersName;
        private String fathersName;
        private String grandMothersName;

        public Builder setHp(int hp) {
            this.hp = hp;
            return this;
        }

        public Builder setPower(int power) {
            this.power = power;
            return this;
        }

        public Builder setAttackPower(int attackPower) {
            this.attackPower = attackPower;
            return this;
        }

        public Builder setDefencePower(int defencePower) {
            this.defencePower = defencePower;
            return this;
        }

        public Builder setMana(int mana) {
            this.mana = mana;
            return this;
        }

        public Builder setStamina(int stamina) {
            this.stamina = stamina;
            return this;
        }

        public Builder setWeight(int weight) {
            this.weight = weight;
            return this;
        }

        public Builder setHeight(int height) {
            this.height = height;
            return this;
        }

        public Builder setFootSize(int footSize) {
            this.footSize = footSize;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder setMothersName(String mothersName) {
            this.mothersName = mothersName;
            return this;
        }

        public Builder setFathersName(String fathersName) {
            this.fathersName = fathersName;
            return this;
        }

        public Builder setGrandMothersName(String grandMothersName) {
            this.grandMothersName = grandMothersName;
            return this;
        }

        public Hero createHero() {
            return new Hero(hp, power, attackPower, defencePower, mana, stamina, weight, height, footSize, name, surname, mothersName, fathersName, grandMothersName);
        }
    }
}
