package com.workintech.Monster;

public class MonsterMain {
    public static void main(String[] args) {
        Monster monster1 = new Troll("BigTroll",300,12);
        Monster monster2 = new Werewolf("KillerWolf",400,50);

        System.out.println("Monster1 attack: " + monster1.attack());
        System.out.println("Monster2 attack: " + monster2.attack());

    }
}
