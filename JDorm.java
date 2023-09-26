// -------------------------------------------------------------
// JDorm - Allows the user to select option for a dorm room with
// check boxes that different room options, displays choices
// in a common text area when boxes are checked/unchecked.
//       Naomi Nash - Saint Leo University - 19 June 2021
// -------------------------------------------------------------
// Imports java.awt, javax.swing, and java.awt.event
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class JDorm extends JFrame implements ItemListener 
{
    // Declares necessary variables
    FlowLayout flow = new FlowLayout();
    JCheckBox privateRm = new JCheckBox("Private");
    JCheckBox internet = new JCheckBox("Internet");
    JCheckBox cable = new JCheckBox("Cable TV");
    JCheckBox microwave = new JCheckBox("Microwave");
    JCheckBox refrigerator = new JCheckBox("Refrigerator");
    JTextArea outArea = new JTextArea(5, 10);
    String dormOption;
    String output;
    public JDorm() 
    {
        // Displays room options to the user and default response
        super("Dorm Room Options");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flow);
        add(privateRm);
        privateRm.addItemListener(this);
        add(internet);
        internet.addItemListener(this);
        add(cable);
        cable.addItemListener(this);
        add(microwave);
        microwave.addItemListener(this);
        add(refrigerator);
        refrigerator.addItemListener(this);
        outArea.append("Shared room \nNo cable \nNo Internet");
        outArea.append("\nNo microwave \nNo refrigerator");
        add(outArea);
    }
    public static void main(String[] arguments) 
    {
        // Sets size of Frame for options and reponse
        JDorm dFrame = new JDorm();
        dFrame.setSize(450,300);
        dFrame.setVisible(true);
    }
    @Override
    public void itemStateChanged(ItemEvent check) 
    {
        Object source = check.getItem();
        // Declares what to be displayed whether
        //  or not Private is selected
        if(source == privateRm)
        {
            int select = check.getStateChange();
            if(select == ItemEvent.SELECTED)
                dormOption = "\nPrivate Room";
            else
                dormOption = "\n Shared room";
        }
        // Declares what to be displayed whether
        //  or not Internet is selected
        if(source == internet)
        {
            int select = check.getStateChange();
            if(select == ItemEvent.SELECTED)
                dormOption = "\nInternet Connection";
            else
                dormOption = "\nNo Internet";
        }
        // Declares what to be displayed whether
        //  or not Cable TV is selected
        if(source == cable)
        {
            int select = check.getStateChange();
            if(select == ItemEvent.SELECTED)
                dormOption = "\nCable TV";
            else
                dormOption = "\nNo cable";
        }
        // Declares what to be displayed whether
        //  or not Microwave is selected
        if(source == microwave)
        {
            int select = check.getStateChange();
            if(select == ItemEvent.SELECTED)
                dormOption = "\nMicrowave";
            else
                dormOption = "\nNo microwave";
        }
        // Declares what to be displayed whether
        //  or not Refrigerator is selected
        if(source == refrigerator)
        {
            int select = check.getStateChange();
            if(select == ItemEvent.SELECTED)
                dormOption = "\nRefrigerator";
            else
                dormOption = "\nNo refrigerator";
        }
        output = " " + dormOption;
        outArea.append(output);
    }
}
