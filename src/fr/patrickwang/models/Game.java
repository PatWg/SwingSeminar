package fr.patrickwang.models;

import fr.patrickwang.controllers.DistrictListener;
import fr.patrickwang.views.JDistrict;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

public class Game {
    DistrictListener districtListener = new DistrictListener();

    public void start() throws IOException {
        JFrame frame = new JFrame("Ceci est le titre de ma fenêtre");
        frame.setPreferredSize(new Dimension(1500, 900));

//        BufferedImage image = ImageIO.read(new File("InspLestrade-recto.png"));
//        JDistrict district = new JDistrict(image, "Inspecteur Lestrade");
//        district.setPreferredSize(new Dimension(150, 150));
//        district.addActionListener(districtListener);
//        frame.add(district);
//        frame.pack();
//        frame.setVisible(true);

        JPanel leftPanel = new JPanel();
        leftPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        leftPanel.setPreferredSize(new Dimension(500, 750));
        leftPanel.add(new JLabel("<html>Panneau de gauche, <br/>peut-être pour les cartes Alibis?</html>"));
        frame.add(leftPanel, BorderLayout.LINE_START);

        JPanel centerPanel = new JPanel();
        centerPanel.setBorder(BorderFactory.createLineBorder(Color.RED));
        centerPanel.setPreferredSize(new Dimension(750, 750));
        centerPanel.setLayout(new GridLayout(5, 5));
        for (int i = 0; i < 25; i++) {
            BufferedImage buttonIcon = ImageIO.read(new File(i % 8 + ".png"));
            JDistrict JDistrict = new JDistrict(buttonIcon, String.valueOf(i));
            JDistrict.addActionListener(districtListener);
            centerPanel.add(JDistrict);
        }

        frame.add(centerPanel, BorderLayout.CENTER);

        JPanel rightPanel = new JPanel();
        rightPanel.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        rightPanel.setPreferredSize(new Dimension(250, 750));
        rightPanel.add(new JLabel("<html>Panneau de droite, <br/> peut-être pour les " +
                "jetons de tours?</html>"));
        frame.add(rightPanel, BorderLayout.LINE_END);

        JPanel bottomPanel = new JPanel();
        bottomPanel.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        bottomPanel.setPreferredSize(new Dimension(1500, 150));
        bottomPanel.add(new JLabel("Panneau du bas, peut-être pour les actions des jetons et " +
                "éventuellement les cartes Alibis de Mr Jack."));
        frame.add(bottomPanel, BorderLayout.PAGE_END);

        frame.setResizable(false);
        frame.pack();
        // Je centre par rapport au bureau
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
