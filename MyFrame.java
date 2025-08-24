import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;

public class MyFrame extends JFrame {
    MyFrame(){
        this.setVisible(true); //to make frame visible
        this.setSize(420,420); //to set its size
        this.setTitle("JFrame testing");//to set title
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this closes the program and the jframe when u close the jframe window
        this.setResizable(false); //prevent window from resizing

        ImageIcon image = new ImageIcon("C:\\Users\\shivy\\OneDrive\\Pictures\\images\\smart-cat.jpg");
        this.setIconImage(image.getImage()); //to set an logo to your jframe

        //frame.getContentPane().setBackground(Color.RED);
        this.getContentPane().setBackground(new Color(0x123456));
    }
    public static void main(String[] args){
        MyFrame obj = new MyFrame();
    }
}
