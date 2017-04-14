// Imports: In order of appearance. 
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.Container; 
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.util.Random;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;

import java.util.ArrayList;

class XAndOTile extends JPanel {
    private int red, green, blue;
    private String letter;

    
    XAndOTile() {
        super();
        SetRandomValues();
    }

    final public void SetRandomValues() {
        red = GetNumberBetween(0,255);
        green = GetNumberBetween(0,255);
        blue = GetNumberBetween(0,255);

        letter = "A";
        if (GetNumberBetween(0,26) == 1) { letter = "B"; }  
        if (GetNumberBetween(0,26) == 2) { letter = "C"; }  
        if (GetNumberBetween(0,26) == 3) {letter = "D"; }  
        if (GetNumberBetween(0,26) == 4) {letter = "E"; }  
        if (GetNumberBetween(0,26) == 5) {letter = "F"; }
        if (GetNumberBetween(0,26) == 6) {letter = "G"; }  
        if (GetNumberBetween(0,26) == 7) {letter = "H";}  
        if (GetNumberBetween(0,26) == 8) {letter = "I"; }  
        if (GetNumberBetween(0,26) == 9) {letter = "J";}  
        if (GetNumberBetween(0,26) == 10) {letter = "K";}  
        if (GetNumberBetween(0,26) == 11) {letter = "L";}  
        if (GetNumberBetween(0,26) == 12) {letter = "M";}  
        if (GetNumberBetween(0,26) == 13) {letter = "N";}  
        if (GetNumberBetween(0,26) == 14) {letter = "O";}  
        if (GetNumberBetween(0,26) == 15) {letter = "P";}  
        if (GetNumberBetween(0,26) == 16) {letter = "Q";}  
        if (GetNumberBetween(0,26) == 17) {letter = "R";}
        if (GetNumberBetween(0,26) == 18) {letter = "S";}  
        if (GetNumberBetween(0,26) == 19) {letter = "T";}  
        if (GetNumberBetween(0,26) == 20) {letter = "U";}  
        if (GetNumberBetween(0,26) == 21) {letter = "V";}  
        if (GetNumberBetween(0,26) == 22) {letter = "W";}  
        if (GetNumberBetween(0,26) == 23) {letter = "X";}  
        if (GetNumberBetween(0,26) == 24) {letter = "Y";}  
        if (GetNumberBetween(0,26) == 25) {letter = "Z";}  
    }
    

    private static int GetNumberBetween(int min, int max) {
        Random myRandom = new Random();
        return min + myRandom.nextInt(max-min+1);
    }   

     public void paintComponent(Graphics g) {
        super.paintComponent(g); 

        int panelWidth = getWidth();
        int panelHeight = getHeight();

        g.setColor(new Color(red,green,blue));
        
        g.fillOval (10, 10, panelWidth-20, panelHeight-20);
        if (GetNumberBetween(0,1) == 1) {g.fillRect (10, 10, panelWidth-20, panelHeight-20);}
        //if (GetNumberBetween(0,2) == 2) {g.fillPolygon (10, 10, panelWidth-20, panelHeight-20);}
        //if (GetNumberBetween(0,1) == 0)  g.fillOval (10, 10, panelWidth-20, panelHeight-20);
        //g.fillRect (10, 10, panelWidth-20, panelHeight-20);
      

        g.setColor(new Color(GetContrastingColor(red),GetContrastingColor(green),GetContrastingColor(blue)));

        final int fontSize=40;
        g.setFont(new Font("Monospaced", Font.BOLD, fontSize));
        int stringX = (panelWidth/2)-15;
        int stringY = (panelHeight/2)+15;
        g.drawString(letter,stringX,stringY);
    }

    private static int GetContrastingColor(int colorIn) {
        return ((colorIn+128)%256);
    }
}

class MosaicLiteFrame extends JFrame implements ActionListener {
    private ArrayList<XAndOTile> tileList;

    public MosaicLiteFrame() {
        setBounds(200,200,1200,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        JPanel buttonPanel = new JPanel();
        contentPane.add(buttonPanel, BorderLayout.SOUTH);

        JButton randomize = new JButton("Randomize");
        buttonPanel.add(randomize);
        randomize.addActionListener(this);

        JPanel xAndOGridPanel = new JPanel();
        contentPane.add(xAndOGridPanel, BorderLayout.CENTER);
        xAndOGridPanel.setLayout(new GridLayout(10,10));

        tileList = new ArrayList<XAndOTile>();
        for(int i=1; i<101; i++) {
            XAndOTile tile = new XAndOTile();
            tileList.add(tile);
            xAndOGridPanel.add(tile);
        }
    }

    public void actionPerformed(ActionEvent e) {
        for(XAndOTile tile : tileList) {
            tile.SetRandomValues();
        }
        repaint();
    }
}

public class Mosaic {
    public static void main(String[] args) {
        System.out.println("MosaicLite Starting...");

        MosaicLiteFrame myMosaicLiteFrame = new MosaicLiteFrame();
        myMosaicLiteFrame.setVisible(true);
    }
}


