package GUIPackage;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.*;
import java.io.IOException;
import java.awt.*;
import javax.swing.*; 
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
 
public class CreateProfile extends JFrame implements ActionListener
{
     
	private String[] characters = {
		    "Loki", "Bellatrix", "Cersei Lannister", "Joker", "Regina",
		    };
	private JLabel labelUsername = new JLabel("Enter username: ");
    private JLabel labelStatus = new JLabel("Enter status: ");
    private JLabel labelCharacter = new JLabel("Select character");
    private JTextField textUsername = new JTextField(20);
    private JComboBox drop = new JComboBox(); 
    private JTextField fieldStatus = new JTextField(20);
    private JButton buttonLogin = new JButton("Login");
     
    public CreateProfile() {
        super("Welcome to FriendFinder.!");
         
        for(int i = 0; i < characters.length; i++)
        	   drop.addItem(characters[i]);
        buttonLogin.addActionListener(this);
        
        // create a new panel with GridBagLayout manager
        JPanel newPanel = new JPanel(new GridBagLayout());
         
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(10, 10, 10, 10);
         
        // add components to the panel
        constraints.gridx = 0;
        constraints.gridy = 0;     
        newPanel.add(labelUsername, constraints);
 
        constraints.gridx = 1;
        newPanel.add(textUsername, constraints);
         
        constraints.gridx = 0;
        constraints.gridy = 1;     
        newPanel.add(labelStatus, constraints);
         
        constraints.gridx = 1;
        newPanel.add(fieldStatus, constraints);
         
        constraints.gridx = 0;
        constraints.gridy = 2;     
        newPanel.add(labelCharacter, constraints);
         
        constraints.gridx = 1;
        newPanel.add(drop, constraints);
        
        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        newPanel.add(buttonLogin, constraints);
         
        newPanel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "Create account to Join"));
         
        add(newPanel);
         
        pack();
        setLocationRelativeTo(null);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
    	SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() 
            {
            	try {
					new MainProfilePage().setVisible(true);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
    }
}