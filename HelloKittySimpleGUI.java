import javax.swing.*;

import java.awt.*;
public class HelloKittySimpleGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello Kitty GUI");
        frame.setSize(400,450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.getContentPane().setBackground(
            new Color(255, 229, 238)
        );

        JLabel title = new JLabel("Hello, Olivia! ♡");
        title.setBounds(95, 40, 250, 40);
        title.setFont(new Font("Serif", Font.BOLD, 27));
        title.setForeground(new Color(198, 71, 117));
        frame.add(title);

        JLabel subtitle = new JLabel("Welcome to your Hello Kitty GUI!");
        subtitle.setBounds(100, 95, 250, 30);
        subtitle.setForeground(new Color(166, 106, 129));
        frame.add(subtitle);

        JLabel heart = new JLabel("♥");

        heart.setBounds(35,40,40,40);
        heart.setFont(new Font("Serif", Font.BOLD, 30));
        heart.setForeground(new Color(237,131,166));
        frame.add(heart);

        JLabel heart2 = new JLabel("♥");

heart2.setBounds(340, 40, 40, 40);
heart2.setFont(new Font("Serif", Font.BOLD, 30));
heart2.setForeground(new Color(237, 131, 166));

frame.add(heart2);


JLabel sparkles = new JLabel("✿  ♡  ✿");

sparkles.setBounds(155, 255, 120, 30);
sparkles.setFont(new Font("Serif", Font.BOLD, 20));
sparkles.setForeground(new Color(198, 71, 117));

frame.add(sparkles);


        JButton button = new JButton("Let's Start ♡");
        button.setBounds(110, 310, 170, 45);
        button.setBackground(new Color(237, 131, 166));
        button.setForeground(Color.WHITE);
        button.setFont(new Font("SansSerif", Font.BOLD, 15));
        button.setFocusPainted(false);
        frame.add(button);

        button.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "Hello, Olivia! Welcome to your Hello Kitty GUI!");
        });
   

ImageIcon kitty = new ImageIcon("kitty.png");
System.out.println("Image width: " + kitty.getIconWidth());

Image scaled = kitty.getImage().getScaledInstance(
    130, 130, Image.SCALE_SMOOTH
);

JLabel kittyLabel = new JLabel(new ImageIcon(scaled));

kittyLabel.setBounds(130, 125, 130, 130);

frame.add(kittyLabel);



        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
