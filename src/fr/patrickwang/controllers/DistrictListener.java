package fr.patrickwang.controllers;

import fr.patrickwang.views.JDistrict;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

public class DistrictListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().getClass().equals(JDistrict.class)) {
            JDistrict district = (JDistrict) e.getSource();
            BufferedImage image = district.rotate(1);
            district.setImage(image);
        }
    }
}
