import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class MyFrame extends JFrame implements MouseListener{

    JLabel points;
    ImageIcon image;
    JButton addPoints;
    JButton upGradeClicker;
    JButton upGradeClicker2;
    JButton upGradeClicker3;

    int startingPoints = 0;

    MyFrame(){
        image = new ImageIcon("D:\\Code shit\\test\\src\\pngimg.com_-_cookie_PNG13656_20.png");
        JLabel cookie = new JLabel(image);
        cookie.addMouseListener(this);

        points = new JLabel();
        points.setText("cookies: " + startingPoints);

        addPoints = new JButton();
        addPoints.setPreferredSize(new Dimension(120,240));
        addPoints.setText("Auto clicker +1");

        upGradeClicker = new JButton();
        upGradeClicker.setPreferredSize(new Dimension(120,240));
        upGradeClicker.setText("Clicker +1");

        upGradeClicker2 = new JButton();
        upGradeClicker2.setPreferredSize(new Dimension(120,240));
        upGradeClicker2.setText("Clicker +10");

        upGradeClicker3 = new JButton();
        upGradeClicker3.setPreferredSize(new Dimension(120,240));
        upGradeClicker3.setText("Clicker +50");


        JPanel mainScreen = new JPanel();
        mainScreen.setBackground(Color.LIGHT_GRAY);
        mainScreen.setBounds(0,0,500,500);
        mainScreen.setLayout(new FlowLayout());

        JPanel lUpgradePanel = new JPanel();
        lUpgradePanel.setBackground(Color.BLUE);
        lUpgradePanel.setBounds(0,500,125,250);

        JPanel mLUpgradePanel = new JPanel();
        mLUpgradePanel.setBackground(Color.CYAN);
        mLUpgradePanel.setBounds(125,500,125,250);

        JPanel mRUpgradePanel = new JPanel();
        mRUpgradePanel.setBackground(Color.MAGENTA);
        mRUpgradePanel.setBounds(250,500,125,250);

        JPanel rUpgradePanel = new JPanel();
        rUpgradePanel.setBackground(Color.PINK);
        rUpgradePanel.setBounds(375,500,125,250);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(500,750);
        frame.setVisible(true);
        frame.add(mainScreen);
        frame.add(lUpgradePanel);
        frame.add(mLUpgradePanel);
        frame.add(mRUpgradePanel);
        frame.add(rUpgradePanel);

        lUpgradePanel.add(addPoints);
        mLUpgradePanel.add(upGradeClicker);
        mRUpgradePanel.add(upGradeClicker2);
        rUpgradePanel.add(upGradeClicker3);

        mainScreen.add(points);
        mainScreen.add(cookie);
    }


    @Override
    public void mouseClicked(MouseEvent e){
        startingPoints++;
        points.setText("cookies: " + startingPoints + "");
    }

    @Override
    public void mousePressed(MouseEvent e) {

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
