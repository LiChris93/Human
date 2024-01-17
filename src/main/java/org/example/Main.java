package org.example;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("LiChris93",15,"男");
        human.introduce();
        human.eat();
        human.eat("只因");
        human.walk();
        human.walk(1145.14);
        human.play();
        human.play("原神");

    }
}