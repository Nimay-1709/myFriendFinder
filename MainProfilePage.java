package GUIPackage;

import mainPackage.*;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.*;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class MainProfilePage  extends JFrame
{
	
	private JLabel labelHeading = new JLabel("My Profile : ");
	private JLabel labelPicture = new JLabel();
    private JLabel labelUserName = new JLabel("Name :  Nimay Patel ");
    private JLabel labelStatus = new JLabel("Status: LIVE IN PEACE..!");
    private JLabel labelFriends = new JLabel("Current Friends: 0");
    private JButton modifyButton = new JButton("Modify Profile");
    private JButton LeaveButton = new JButton("Leave Network");
    private JButton newFriendsButton = new JButton("Find new Friends");
    private JButton SearchButton = new JButton("Search friends");
    
    @SuppressWarnings("deprecation")
	public MainProfilePage() throws IOException 
    {
        super("Profile Page myFriendFinder..!");
       
       
        labelHeading.setFont(new Font("Times New Roman", Font.PLAIN, 16));
       
        resize("C:/Pictures/Loki.jpg","C:/Pictures/Loki.jpg",250,150);
        labelPicture.setIcon(new ImageIcon("C:/Pictures/Loki.jpg"));
        JPanel newPanel = new JPanel(new GridBagLayout());
        
        
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(10, 10, 10, 10);
         
        constraints.gridx = 0;
        constraints.gridy = 2;     
        newPanel.add(labelUserName, constraints);
         
        constraints.gridx = 1;
        newPanel.add(labelStatus, constraints);
         
        constraints.gridx = 2;
        newPanel.add(labelFriends, constraints);
        
        constraints.gridy = 3; 
        
        constraints.gridx = 0;    
        newPanel.add(modifyButton, constraints);
         
        constraints.gridx = 1;
        newPanel.add(SearchButton, constraints);
         
        constraints.gridx = 2;
        newPanel.add(newFriendsButton, constraints);
           
        constraints.gridx = 1;
        constraints.gridy = 4;
        constraints.anchor = GridBagConstraints.CENTER;
        newPanel.add(LeaveButton, constraints);
        
        constraints.gridwidth = 2;
        
        constraints.gridx = 0;
        constraints.gridy = 0;
        newPanel.add(labelHeading, constraints);
 
        constraints.gridy = 1;
        newPanel.add(labelPicture, constraints);
 
        
        newPanel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "Your profile page, Nimay Patel..!"));
         
        add(newPanel);
         
        pack();
        setLocationRelativeTo(null);
    }
    
    public static void resize(String inputImage, String outputImage, int Width, int Height)
            throws IOException {
        // reads input image
        File inputFile = new File(inputImage);
        BufferedImage input = ImageIO.read(inputFile);
 
        // creates output image
        BufferedImage output = new BufferedImage(Width, Height, input.getType());
 
        // scales the input image to the output image
        Graphics2D g2d = output.createGraphics();
        g2d.drawImage(input, 0, 0, Width, Height, null);
        g2d.dispose();
 
        // extracts extension of output file
        String formatName = outputImage.substring(outputImage.lastIndexOf(".") + 1);
 
        // writes to output file
        ImageIO.write(output, formatName, new File(outputImage));
    }
}
