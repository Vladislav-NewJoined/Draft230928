package task1_3_Case3_TETRIS_OSNOVNOI;

import javax.swing.*;
import java.awt.*;

public class Main_copy3_Example_Tolko_reshetka_Exam2 {
    static class Field extends JFrame {
        int width = 10;
        int height = 10;

        {
            getContentPane().setLayout(new GridLayout(height, width));
            for (int currentX = 0; currentX < width; currentX++)
                for (int currentY = 0; currentY < height; currentY++)
                    add(new JButton() {{
                        setFocusable(false);
                    }});

            //настройки окна
            setVisible(true);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setSize(420, 430);

            clear();
        }

        void clear() {
            for (Component currentComponent : getContentPane().getComponents())
                currentComponent.setBackground(Color.WHITE);
        }
    }

    static Field field = new Field();
    public static void main(String[] args) throws Exception {
    }
}
