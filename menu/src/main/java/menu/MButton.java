package menu;

import javax.swing.*;
import java.awt.*;

class MButton extends JButton {

    MButton(String text){
        this.setText(text);
        this.setPreferredSize(new Dimension(400, 150));
        this.setFont(new Font("Consolas", Font.PLAIN, 40));
        this.setBackground(Color.decode("#d8276b"));
        this.setForeground(Color.decode("#F6F6F6"));
        this.setFocusPainted(false);
    }

}
