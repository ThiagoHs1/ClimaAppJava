package thiagoh.src;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ClimaAppGUI extends JFrame {

    public ClimaAppGUI() {
        // Config do GUI
        super("Clima");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(450, 650);
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);

        AdicionarGuiElementos();

    }

    private void AdicionarGuiElementos() {
        // Config dos elementos do gui
        JTextField sField = new JTextField();
        sField.setBounds(15, 15, 351, 25);
        add(sField);

        sField.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 16));
        add(sField);

        JButton BuscarBotao = new JButton(loadImage("src\\main\\java\\thiagoh\\src\\assets\\search.png"));
        BuscarBotao.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        BuscarBotao.setBounds(375, 13, 47, 45);
        add(BuscarBotao);

    }

    private ImageIcon loadImage(String path) {
        try {
            // read the image file from the path given
            BufferedImage image = ImageIO.read(new File(path));

            // returns an image icon so that our component can render it
            return new ImageIcon(image);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Could not find resource");
        return null;
    }
}
