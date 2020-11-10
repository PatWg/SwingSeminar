package fr.patrickwang;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_COLOR_BURNPeer;
import fr.patrickwang.widgets.District;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ceci est le titre de ma fenêtre");

        JButton jLabel = new JButton("Texte à afficher");
        jLabel.setIcon(new ImageIcon("0.png"));
        jLabel.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        jLabel.setPreferredSize(new Dimension(500, 500));
        jLabel.setVerticalTextPosition(SwingConstants.TOP);
        jLabel.setVerticalAlignment(SwingConstants.CENTER);
        frame.add(jLabel);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

