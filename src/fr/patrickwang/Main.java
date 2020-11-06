package fr.patrickwang;

import fr.patrickwang.widgets.District;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints constraints = new GridBagConstraints();

        JFrame frame = new JFrame("Ceci est le titre de ma fenêtre");
        frame.setSize(1500, 800);
        frame.setResizable(false);
        frame.setLayout(layout);

        constraints.fill = GridBagConstraints.BOTH;

        constraints.gridwidth = 3;
        constraints.weightx = 1.0;
        constraints.weighty = 6.0;
        JPanel leftPanel = new JPanel();
        leftPanel.setBorder(BorderFactory.createLineBorder(Color.black));
        leftPanel.add(new JLabel("Left"));
        layout.setConstraints(leftPanel, constraints);
        frame.add(leftPanel);

        constraints.weightx = 3.0;
        JPanel centerPanel = new JPanel();
        centerPanel.setBorder(BorderFactory.createLineBorder(Color.black));
        centerPanel.setLayout(new GridLayout(5, 5));
        for (int i = 0; i < 25; i++) {
            BufferedImage buttonIcon = ImageIO.read(new File(i % 8 + ".png"));
            District district = new District(new ImageIcon(buttonIcon));
            centerPanel.add(district);
        }
        layout.setConstraints(centerPanel, constraints);
        frame.add(centerPanel);

        constraints.weightx = 1.0;
        constraints.gridwidth = GridBagConstraints.REMAINDER;
        JPanel rightPanel = new JPanel();
        rightPanel.setBorder(BorderFactory.createLineBorder(Color.black));
        layout.setConstraints(rightPanel, constraints);
        frame.add(rightPanel);

        constraints.weightx = 0.0;
        constraints.weighty = 1.0;
        constraints.gridx = 0;
        constraints.gridy = 1;
        JPanel bottomPanel = new JPanel();
        bottomPanel.setBorder(BorderFactory.createLineBorder(Color.black));
        bottomPanel.add(new JLabel("Bottom"));
        layout.setConstraints(bottomPanel, constraints);
        frame.add(bottomPanel);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

