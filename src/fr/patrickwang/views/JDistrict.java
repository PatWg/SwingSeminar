package fr.patrickwang.views;

import fr.patrickwang.models.Alibi;
import fr.patrickwang.models.District;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Random;

public class JDistrict extends JButton {
    private District district;
    private BufferedImage image;

    public JDistrict(BufferedImage image, String alibiName) {
        super();
        this.image = image;
        BufferedImage initialRotation = rotate(new Random().nextInt(4));
        this.setImage(initialRotation);
        if (alibiName.equals("Inspecteur Lestrade")) district = new District(new Alibi(alibiName, 0));
        this.setBorder(BorderFactory.createEmptyBorder());
        this.setContentAreaFilled(false);
    }

    @Override
    public String getName() {
        return district.getName();
    }

    public void setImage(BufferedImage image) {
        this.setIcon(new ImageIcon(image));
        this.image = image;
    }

    public BufferedImage rotate(int quarterTurn) {
        int w = image.getWidth();
        int h = image.getHeight();

        BufferedImage rotated = new BufferedImage(w, h, image.getType());
        Graphics2D graphic = rotated.createGraphics();
        graphic.rotate(Math.toRadians(quarterTurn * 90), w/2, h/2);
        graphic.drawImage(image, null, 0, 0);
        graphic.dispose();
        return rotated;
    }
}
