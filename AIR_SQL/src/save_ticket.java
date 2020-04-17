import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class save_ticket extends JPanel
{

    public save_ticket()
    {
        JFrame frame = new JFrame("show_booking");
        frame.add(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setVisible(true);

        try
        {
            BufferedImage image = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_RGB);
            Graphics2D graphics2D = image.createGraphics();
            frame.paint(graphics2D);
            ImageIO.write(image,"png", new File("C:/Users/patel/Desktop/CLG/Sem - 4/DBMS/Air-sql/TICKETS"));
        }
        catch(Exception exception)
        {
            System.out.println("heeheheeh");
        }
    }

    protected void paintComponent(Graphics g)
    {
        g.drawRect(50,50,50,50);
    }

    public static void main(String[] args)
    {
        new save_ticket();
    }
}