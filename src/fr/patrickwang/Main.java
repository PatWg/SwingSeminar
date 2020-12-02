package fr.patrickwang;

import fr.patrickwang.models.Game;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        try {
            game.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

