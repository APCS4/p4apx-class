import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class FadeIn extends JPanel implements ActionListener {

    private Image imagem;
    private Image image2;
    private Timer timer;
    private float alpha = 1f;

    public FadeIn() {
        imagem = (new ImageIcon(getClass().getResource("/resources/1stImage.jpg"))).getImage();
        image2 = (new ImageIcon(getClass().getResource("/resources/2ndImage.jpg"))).getImage();    
        timer = new Timer(20, this);
        timer.start();
    }
    // here you define alpha 0f to 1f

    public FadeIn(float alpha)
    {
        imagem = (new ImageIcon(getClass().getResource( "/resources/1stImage.jpg"))).getImage();
        this.alpha = alpha;
    }

    @Override
    public void paintComponent(Graphics g) 
    {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(imagem, 0, 0, 400, 300, null);
        g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER,alpha));
        g2d.drawImage(image2, 0, 0, 400, 300, null);
    }

    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("Fade out");
        frame.add(new FadeIn());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 330);
        // frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        alpha += -0.01f;
        if (alpha <= 0) 
        {
            alpha = 0;
            timer.stop();
        }
        repaint();
    }
}
