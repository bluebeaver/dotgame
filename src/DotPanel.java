import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DotPanel extends JPanel implements MouseListener, MouseMotionListener, ActionListener {

    private DotGrid dotGrid;
    private Color color;
    public Timer timer;

    public DotPanel() {
        setSize(600,600);
        dotGrid = new DotGrid(getHeight());

        timer=new Timer(250,this);

        addMouseListener(this);
        addMouseMotionListener(this);

    }

    public void actionPerformed(ActionEvent actionEvent){
        //dotGrid.nextLife();
        repaint();
    }


    public void paint(Graphics g){
        Graphics2D g2 = (Graphics2D)g;
        g2.clearRect(0,0, getWidth(), getHeight());
        g2. setColor(new Color(175, 255, 233));
        g2.fillRect(0,0,700,700);

        //dotGrid.paint(g);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        int x = e.getX();
        int y = e.getY();

        //if(startButton.isMe(x, y))
        //    timer.start();

        //if (clearButton.isMe(x, y))
        //    dotGrid.clear();

        repaint();

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        //dotGrid.fillCell(e.getX(), e.getY());
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        //dotGrid.changeColor(e.getX(), e.getY());
        repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }


}