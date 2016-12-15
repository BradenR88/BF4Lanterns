import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JToggleButton;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import javax.swing.JCheckBox;
import javax.swing.AbstractAction;
import javax.swing.Action;


public class LightsWindow {

	private JFrame frame;
	private JTextField textA;
	private JTextField textB;
	private JTextField textC;
	private JTextField textD;
	private JTextField textE;
	private JTextField textF;
	private JTextField textG;
	private JTextField textDef;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LightsWindow window = new LightsWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LightsWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 616, 389);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
JLabel[] light = new JLabel[20];
		
		light[0] = new JLabel("1: off");
		light[0].setBounds(24, 273, 40, 14);
		frame.getContentPane().add(light[0]);
		
		light[1] = new JLabel("2: off");
		light[1].setBounds(72, 273, 40, 14);
		frame.getContentPane().add(light[1]);
		
		light[2] = new JLabel("3: off");
		light[2].setBounds(124, 273, 40, 14);
		frame.getContentPane().add(light[2]);
		
		light[3] = new JLabel("4: off");
		light[3].setBounds(171, 273, 40, 14);
		frame.getContentPane().add(light[3]);
		
        light[4] = new JLabel("5: off");
		light[4].setBounds(219, 273, 40, 14);
		frame.getContentPane().add(light[4]);
		
		light[5] = new JLabel("6: off");
		light[5].setBounds(268, 273, 40, 14);
		frame.getContentPane().add(light[5]);
		
		light[6] = new JLabel("7: off");
		light[6].setBounds(325, 273, 40, 14);
		frame.getContentPane().add(light[6]);
		
		light[7]= new JLabel("8: off");
		light[7].setBounds(383, 273, 40, 14);
		frame.getContentPane().add(light[7]);
		
		light[8] = new JLabel("9: off");
		light[8].setBounds(444, 273, 40, 14);
		frame.getContentPane().add(light[8]);
		
		light[9] = new JLabel("10: off");
		light[9].setBounds(497, 273, 40, 14);
		frame.getContentPane().add(light[9]);
		
		light[10] = new JLabel("11: off");
		light[10].setBounds(497, 298, 40, 14);
		frame.getContentPane().add(light[10]);
		
		light[11] = new JLabel("12: off");
		light[11].setBounds(444, 298, 40, 14);
		frame.getContentPane().add(light[11]);
		
		light[12] = new JLabel("13: off");
		light[12].setBounds(383, 298, 40, 14);
		frame.getContentPane().add(light[12]);
		
		light[13] = new JLabel("14: off");
		light[13].setBounds(325, 298, 40, 14);
		frame.getContentPane().add(light[13]);
		
		light[14] = new JLabel("15: off");
		light[14].setBounds(268, 298, 40, 14);
		frame.getContentPane().add(light[14]);
		
		light[15] = new JLabel("16: off");
		light[15].setBounds(219, 298, 40, 14);
		frame.getContentPane().add(light[15]);
		
		light[16] = new JLabel("17: off");
		light[16].setBounds(171, 298, 40, 14);
		frame.getContentPane().add(light[16]);
		
		light[17] = new JLabel("18: off");
		light[17].setBounds(124, 298, 40, 14);
		frame.getContentPane().add(light[17]);
		
		light[18] = new JLabel("19: off");
		light[18].setBounds(72, 298, 40, 14);
		frame.getContentPane().add(light[18]);
		
		light[19] = new JLabel("20: off");
		light[19].setBounds(24, 298, 40, 14);
		frame.getContentPane().add(light[19]);
		
		JLabel allSelect = new JLabel("All Selected: ");
		allSelect.setBounds(501, 112, 89, 14);
		frame.getContentPane().add(allSelect);
		
		JButton buttonA = new JButton("A: Planter");
		buttonA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String defLights = textA.getText();
				String[] lightsArr = defLights.split(" ");
				for(String s: lightsArr)
				{
					int i = (Integer.parseInt(s)-1);
					String lblValue = light[i].getText();
					if(lblValue.charAt(lblValue.length()-1) == 'f')
					{
						light[i].setText(i+1 +": on");
					}
					else
					{
						light[i].setText(i+1 +": off");
					}
				}
				int count = 0;
				for(int i = 0; i < 20; i++)
				{
					if(light[i].getText().charAt(light[i].getText().length()-1) == 'n')
					{
						count++;
					}
				}
				if(count == 20)
					allSelect.setText("YES!!!");
				else 
					allSelect.setText("All Selected: ");
					
			}
		});
		buttonA.setBounds(-2, 35, 101, 23);
		frame.getContentPane().add(buttonA);
		
		JButton buttonB = new JButton("B: Rock");
		buttonB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String defLights = textB.getText();
				String[] lightsArr = defLights.split(" ");
				for(String s: lightsArr)
				{
					int i = (Integer.parseInt(s)-1);
					String lblValue = light[i].getText();
					if(lblValue.charAt(lblValue.length()-1) == 'f')
					{
						light[i].setText(i+1 +": on");
					}
					else
					{
						light[i].setText(i+1 +": off");
					}					
				}
				int count = 0;
				for(int i = 0; i < 20; i++)
				{
					if(light[i].getText().charAt(light[i].getText().length()-1) == 'n')
					{
						count++;
					}
				}
				if(count == 20)
					allSelect.setText("YES!!!");
				else 
					allSelect.setText("All Selected: ");
					
			}
			}
		);
		buttonB.setBounds(-2, 69, 101, 23);
		frame.getContentPane().add(buttonB);
		
		JButton buttonC = new JButton("C: Furnace");
		buttonC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String defLights = textC.getText();
				String[] lightsArr = defLights.split(" ");
				for(String s: lightsArr)
				{
					int i = (Integer.parseInt(s)-1);
					String lblValue = light[i].getText();
					if(lblValue.charAt(lblValue.length()-1) == 'f')
					{
						light[i].setText(i+1 +": on");
					}
					else
					{
						light[i].setText(i+1 +": off");
					}
				}
				int count = 0;
				for(int i = 0; i < 20; i++)
				{
					if(light[i].getText().charAt(light[i].getText().length()-1) == 'n')
					{
						count++;
					}
				}
				if(count == 20)
					allSelect.setText("YES!!!");
				else 
					allSelect.setText("All Selected: ");
					
			}
			}
		);
		buttonC.setBounds(-2, 103, 101, 23);
		frame.getContentPane().add(buttonC);
		
		JButton buttonD = new JButton("D: Dock");
		buttonD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String defLights = textD.getText();
				String[] lightsArr = defLights.split(" ");
				for(String s: lightsArr)
				{
					int i = (Integer.parseInt(s)-1);
					String lblValue = light[i].getText();
					if(lblValue.charAt(lblValue.length()-1) == 'f')
					{
						light[i].setText(i+1 +": on");
					}
					else
					{
						light[i].setText(i+1 +": off");
					}
				}
				int count = 0;
				for(int i = 0; i < 20; i++)
				{
					if(light[i].getText().charAt(light[i].getText().length()-1) == 'n')
					{
						count++;
					}
				}
				if(count == 20)
					allSelect.setText("YES!!!");
				else 
					allSelect.setText("All Selected: ");
					
			}
			}
		);
		buttonD.setBounds(-2, 137, 101, 23);
		frame.getContentPane().add(buttonD);
		
		JButton buttonE = new JButton("E: Waterfall");
		buttonE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String defLights = textE.getText();
				String[] lightsArr = defLights.split(" ");
				for(String s: lightsArr)
				{
					int i = (Integer.parseInt(s)-1);
					String lblValue = light[i].getText();
					if(lblValue.charAt(lblValue.length()-1) == 'f')
					{
						light[i].setText(i+1 +": on");
					}
					else
					{
						light[i].setText(i+1 +": off");
					}
				}
				int count = 0;
				for(int i = 0; i < 20; i++)
				{
					if(light[i].getText().charAt(light[i].getText().length()-1) == 'n')
					{
						count++;
					}
				}
				if(count == 20)
					allSelect.setText("YES!!!");
				else 
					allSelect.setText("All Selected: ");
					
			}
			}
		);
		buttonE.setBounds(-2, 171, 101, 23);
		frame.getContentPane().add(buttonE);
		
		JButton buttonF = new JButton("F: Tower");
		buttonF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String defLights = textF.getText();
				String[] lightsArr = defLights.split(" ");
				for(String s: lightsArr)
				{
					int i = (Integer.parseInt(s)-1);
					String lblValue = light[i].getText();
					if(lblValue.charAt(lblValue.length()-1) == 'f')
					{
						light[i].setText(i+1 +": on");
					}
					else
					{
						light[i].setText(i+1 +": off");
					}
				}
				int count = 0;
				for(int i = 0; i < 20; i++)
				{
					if(light[i].getText().charAt(light[i].getText().length()-1) == 'n')
					{
						count++;
					}
				}
				if(count == 20)
					allSelect.setText("YES!!!");
				else 
					allSelect.setText("All Selected: ");
					
				
			}
		});
		buttonF.setBounds(-2, 205, 101, 23);
		frame.getContentPane().add(buttonF);
		
		JButton buttonG = new JButton("G: Tree");
		buttonG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String defLights = textG.getText();
				String[] lightsArr = defLights.split(" ");
				for(String s: lightsArr)
				{
					int i = (Integer.parseInt(s)-1);
					String lblValue = light[i].getText();
					if(lblValue.charAt(lblValue.length()-1) == 'f')
					{
						light[i].setText(i+1 +": on");
					}
					else
					{
						light[i].setText(i+1 +": off");
					}
				}
				int count = 0;
				for(int i = 0; i < 20; i++)
				{
					if(light[i].getText().charAt(light[i].getText().length()-1) == 'n')
					{
						count++;
					}
				}
				if(count == 20)
					allSelect.setText("YES!!!");
				else 
					allSelect.setText("All Selected: ");
					
			}
		});
		buttonG.setBounds(-2, 239, 101, 23);
		frame.getContentPane().add(buttonG);
		
		
		
		textA = new JTextField();
		textA.setBounds(125, 36, 347, 20);
		frame.getContentPane().add(textA);
		textA.setColumns(10);
		
		textB = new JTextField();
		textB.setColumns(10);
		textB.setBounds(124, 70, 347, 20);
		frame.getContentPane().add(textB);
		
		textC = new JTextField();
		textC.setColumns(10);
		textC.setBounds(124, 104, 347, 20);
		frame.getContentPane().add(textC);
		
		textD = new JTextField();
		textD.setColumns(10);
		textD.setBounds(125, 138, 347, 20);
		frame.getContentPane().add(textD);
		
		textE = new JTextField();
		textE.setColumns(10);
		textE.setBounds(124, 172, 347, 20);
		frame.getContentPane().add(textE);
		
		textF = new JTextField();
		textF.setColumns(10);
		textF.setBounds(124, 206, 347, 20);
		frame.getContentPane().add(textF);
		
		textG = new JTextField();
		textG.setColumns(10);
		textG.setBounds(125, 240, 347, 20);
		frame.getContentPane().add(textG);
		
		JButton buttonDef = new JButton("Default");
		buttonDef.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String defLights = textDef.getText();
				String[] lightsArr = defLights.split(" ");
				for(String s: lightsArr)
				{
					int i = (Integer.parseInt(s)-1);
					String lblValue = light[i].getText();
					if(lblValue.charAt(lblValue.length()-1) == 'f')
					{
						light[i].setText(i+1 +": on");
					}
					else
					{
						light[i].setText(i+1 +": off");
					}
				}
			}
		});
		buttonDef.setBounds(-2, 11, 101, 23);
		frame.getContentPane().add(buttonDef);
		
		textDef = new JTextField();
		textDef.setColumns(10);
		textDef.setBounds(124, 12, 347, 20);
		frame.getContentPane().add(textDef);
		
		JButton buttonClr = new JButton("CLR");
		buttonClr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int i = 0; i< 20; i++)
				{
					light[i].setText(i+1 +": off");
				}
				allSelect.setText("All Selected: ");
			}
		});
		buttonClr.setBounds(481, 11, 79, 23);
		frame.getContentPane().add(buttonClr);
		
		
		
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	
}

