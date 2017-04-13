import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



// Create frame and panel for Mosaic 
public class Mosaic {
	
	private JFrame frame;
	private JPanel panel;
	private JButton button;
	
	
	public Mosaic()
	{
		gui();
				
	}
		
	public void gui()
	{
		
		frame= new JFrame("Mosaic");
		frame.setVisible(true);
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setBackground(Color.gray);
		
		button = new JButton("Randomize");
		
		panel.add(button);
	
		frame.add(panel,BorderLayout.SOUTH);
		
		
		
		
		
		
		
	}

//}
	
//class Tile {
	
//}	

	
//class TileFrame {
	
//}	
//class TilePanel {
	
	
//}

// RandomizePanel{
	
//}

//class TileRandomizer {

/*class ShapeDrawFrame extends JFrame implements ActionListener {
	  private ShapeDrawPanel myShapeDrawPanel;

	    public ShapeDrawFrame() {
	         assert false:"Unexpected call to ShapeDrawFrame default constructor.";       
	    }

	    public ShapeDrawFrame() {
	        setBounds(100,100,400,100);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        Container contentPane = getContentPane();
	        contentPane.setLayout(new BorderLayout());

	        JPanel myButtonPanel = new JPanel();
	        myButtonPanel.setLayout(new FlowLayout());

	        JButton newOvalButton = new JButton("Add Random Oval");
	        newOvalButton.addActionListener(this);
	        myButtonPanel.add(newOvalButton);

	        contentPane.add(myButtonPanel, BorderLayout.SOUTH);

	        myShapeDrawPanel = new ShapeDrawPanel(OvalDrawListIn);
	        contentPane.add(myShapeDrawPanel, BorderLayout.CENTER);
	    }
*/

	
	public static void main(String[] args) {
		System.out.println("Mosaic");

		new Mosaic();
		
	}


	}


