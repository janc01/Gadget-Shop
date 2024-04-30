
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GadgetShop implements ActionListener {
    //GUI components declaration
    private JFrame frame;
    private JTextField modelTextbox, priceTextbox, weightTextbox, sizeTextbox,creditTextbox;
    private JTextField memoryTextbox, phoneNumberTextbox,durationTextbox, downloadSizeTextbox, displayNumberTextbox;
    private JButton addMobileButton, addMP3Button, makeACallButton, viewAllButton, downloadMusicButton, clearButton;
    //ArrayList to store the gadgets
    private ArrayList<TheGadget> gadgets = new ArrayList<>();
    //Constructor initializes the GUI frame and components
    public GadgetShop() {
        initializeFrame();
        initializeComponents();
    }
    //Initializes the main JFrame properties
    private void initializeFrame() {
        frame = new JFrame("Gadget Shop");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setSize(800, 400); //Set the size of the frame
        frame.setLocationRelativeTo(null); //Center the frame on the screen
        frame.setVisible(true); //Make the frame visible
    }
    //Initializes all GUI components and layouts
    private void initializeComponents() {
        JPanel panelWest = new JPanel(new GridLayout(6, 2, 5, 5)); //Create the west panel for input fields
        panelWest.setBackground(new Color(204, 236, 239)); //Set a light blue background
        frame.add(panelWest, BorderLayout.WEST);
        //Adding labels and text fields for various gadget attributes
        panelWest.add(new JLabel("Model:"));
        modelTextbox = new JTextField(10);
        panelWest.add(modelTextbox);

        panelWest.add(new JLabel("Price:"));
        priceTextbox = new JTextField(10);
        panelWest.add(priceTextbox);

        panelWest.add(new JLabel("Weight:"));
        weightTextbox = new JTextField(10);
        panelWest.add(weightTextbox);

        panelWest.add(new JLabel("Size:"));
        sizeTextbox = new JTextField(10);
        panelWest.add(sizeTextbox);

        panelWest.add(new JLabel("Credit:"));
        creditTextbox = new JTextField(10);
        panelWest.add(creditTextbox);

        panelWest.add(new JLabel("Memory:"));
        memoryTextbox = new JTextField(10);
        panelWest.add(memoryTextbox);
        
        //Create the south panel for buttons
        JPanel panelSouth = new JPanel(new GridLayout(3, 3, 10, 10)); //Grid layout for equal sizing and spacing
        frame.add(panelSouth, BorderLayout.SOUTH);
        //Setup for the south panel(buttons)
        addMobileButton = new JButton("Add Mobile");
        addMobileButton.addActionListener(this);
        panelSouth.add(addMobileButton);

        addMP3Button = new JButton("Add MP3");
        addMP3Button.addActionListener(this);
        panelSouth.add(addMP3Button);

        makeACallButton = new JButton("Make a Call");
        makeACallButton.addActionListener(this);
        panelSouth.add(makeACallButton);

        viewAllButton = new JButton("View All");
        viewAllButton.addActionListener(this);
        panelSouth.add(viewAllButton);
        
        downloadMusicButton = new JButton("Download Music");
        downloadMusicButton.addActionListener(this);
        panelSouth.add(downloadMusicButton);
        
        clearButton = new JButton("Clear");
        clearButton.addActionListener(this);
        panelSouth.add(clearButton);
        
        JLabel emptyLabel = new JLabel(""); //Placeholder for aligment
        panelSouth.add(emptyLabel);
        
        //Create east panel for additional inputs
        JPanel panelEast = new JPanel(new GridLayout(4, 2, 5, 5)); 
        panelEast.setBackground(new Color(255, 228, 196)); //Set a light orange background
        frame.add(panelEast, BorderLayout.EAST);
        //Setup for the east panel
        panelEast.add(new JLabel("Phone Number:"));
        phoneNumberTextbox = new JTextField(10);
        panelEast.add(phoneNumberTextbox);

        panelEast.add(new JLabel("Duration:"));
        durationTextbox = new JTextField(10);
        panelEast.add(durationTextbox);

        panelEast.add(new JLabel("Download Size:"));
        downloadSizeTextbox = new JTextField(10);
        panelEast.add(downloadSizeTextbox);

        panelEast.add(new JLabel("Display Number:"));
        displayNumberTextbox = new JTextField(10);
        panelEast.add(displayNumberTextbox);
    }
    
    //Handles action events from buttons
     public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == addMobileButton) {
            addMobile();
        } else if (source == addMP3Button) {
            addMP3();
        } else if (source == makeACallButton) {
            makeACall();
        } else if (source == viewAllButton) {
            viewAll();
        } else if (source == clearButton) {
            clearFields();
        } else if (source == downloadMusicButton) {
            downloadMusic();
        }
    }
    
    //Add a new mobile object to the collection
    private void addMobile() {
        try {
            String model = modelTextbox.getText();
            double price = Double.parseDouble(priceTextbox.getText());
            int weight = Integer.parseInt(weightTextbox.getText());
            String size = sizeTextbox.getText();
            int credit = Integer.parseInt(creditTextbox.getText());
            Mobile newMobile = new Mobile(model, price, weight, size, credit);
            gadgets.add(newMobile);
            JOptionPane.showMessageDialog(frame, "Mobile added successfully!");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(frame, "Please enter valid numerical values for price, weight, and credit.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //Add a new MP3 object to the collection
    private void addMP3() {
        try {
            String model = modelTextbox.getText();
            double price = Double.parseDouble(priceTextbox.getText());
            int weight = Integer.parseInt(weightTextbox.getText());
            String size = sizeTextbox.getText();
            double memory = Double.parseDouble(memoryTextbox.getText());
            MP3 newMP3 = new MP3(model, price, weight, size, memory);
            gadgets.add(newMP3);
            JOptionPane.showMessageDialog(frame, "MP3 added successfully!");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(frame, "Please enter valid numerical values for price, weight, and memory.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void makeACall() {
        // Implement making a call, ensure the selected gadget is a Mobile
    }

    private void downloadMusic() {
        // Implementation needed
    }
    //Display all gadgets
    private void viewAll() {
        gadgets.forEach(TheGadget::display);
    }
    //Clears all input fields in the GUI
    private void clearFields() {
        modelTextbox.setText("");
        priceTextbox.setText("");
        weightTextbox.setText("");
        sizeTextbox.setText("");
        creditTextbox.setText("");
        memoryTextbox.setText("");
        phoneNumberTextbox.setText("");
        durationTextbox.setText("");
        downloadSizeTextbox.setText("");
        displayNumberTextbox.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(GadgetShop::new);
    }
}

