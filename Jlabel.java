import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
public class Jlabel {
    public static void main(String[] args) {

        //JLabel
        JLabel label = new JLabel();
        Border border = BorderFactory.createLineBorder(Color.BLUE, 3);
        label.setText("Ryoike Tenkai?");
        ImageIcon image = new ImageIcon("C:\\Users\\shivy\\OneDrive\\Pictures\\images\\SUKUNA.jpg");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(0xFFFF0000));
        label.setFont(new Font("MV Boli",Font.PLAIN,20));
        label.setIconTextGap(-5);
        label.setBackground(Color.BLACK);
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(0, 0, 350, 350);
        //basic Jframe
        JFrame frame = new JFrame(); 
        frame.setLayout(null);
        frame.setVisible(true);
        //frame.setResizable(false);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(0x123456));

        frame.add(label);
    }
}
