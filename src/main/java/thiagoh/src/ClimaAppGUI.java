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

        // imagem de clima
        JLabel climaLabel = new JLabel(loadImage("src\\main\\java\\thiagoh\\src\\assets\\cloudy.png"));
        climaLabel.setBounds(0, 125, 450, 217);
        add(climaLabel);

        // temperatura
        JLabel temperaturaTexto = new JLabel("10 C");
        temperaturaTexto.setBounds(0, 350, 450, 54);
        temperaturaTexto.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 33));
        temperaturaTexto.setHorizontalAlignment(SwingConstants.CENTER);
        add(temperaturaTexto);

        // Codição do clima
        JLabel condicaoTexto = new JLabel("Nublado");
        condicaoTexto.setBounds(0, 405, 450, 30);
        condicaoTexto.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 28));
        condicaoTexto.setHorizontalAlignment(SwingConstants.CENTER);
        add(condicaoTexto);

        // Umidade
        JLabel umidadeImagem = new JLabel(loadImage("src\\main\\java\\thiagoh\\src\\assets\\humidity.png"));
        umidadeImagem.setBounds(15, 500, 75, 66);
        add(umidadeImagem);

        JLabel umidadeTexto = new JLabel("<html> <b>Umidade </b>  100%  </html> ");
        umidadeTexto.setBounds(95, 500, 80, 55);
        umidadeTexto.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 16));
        add(umidadeTexto);

        // vento

        JLabel ventoImagem = new JLabel(loadImage("src\\main\\java\\thiagoh\\src\\assets\\windspeed.png"));
        ventoImagem.setBounds(220, 500, 75, 66);
        add(ventoImagem);

        JLabel ventoTexto = new JLabel("<html> <b>Velocidade do vento </b>  20km  </html> ");
        ventoTexto.setBounds(300, 500, 85, 55);
        ventoTexto.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 16));
        add(ventoTexto);

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
