package com.workintech.Monster;

public class Werewolf extends Monster implements Bleedable, Poisonable {
    public Werewolf(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    public double attack() {
        return getDamage() + bleed() + poison();
    }


    @Override
    public double bleed() {
        return getDamage() * 0.4;
    }

    @Override
    public double poison() {
        return getDamage() * 0.3;
    }
}
