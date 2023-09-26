// ------------------------------------------------------------
// JInsurance - Lets the user choose one of two insurance plan
// options, HMO or PPO, and choose additional options of dental
// and vision. Displays chosen options and their cost in the 
// textbox below the checkboxes.
//       Naomi Nash - Saint Leo University 20 June 2021
// ------------------------------------------------------------
// Imports java.awt, javax.swing, and java.awt.event
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class JInsurance extends JFrame implements ItemListener 
{
    // Declares necessary variables
    FlowLayout flow = new FlowLayout();
    ButtonGroup insGrp = new ButtonGroup();
    JCheckBox hmo = new JCheckBox("HMO", false);
    JCheckBox ppo = new JCheckBox("PPO", false);
    JCheckBox dental = new JCheckBox("Dental", false);
    JCheckBox vision = new JCheckBox("Vision", false);
    JTextField insChoice = new JTextField(20);
    String output, insChosen;
    public JInsurance() 
    {
        // Adds checkbox options and adds hmo and ppo
        //  to insGrp button group
        super("Check Box");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flow);
        insGrp.add(hmo);
        add(hmo);
        hmo.addItemListener(this);
        insGrp.add(ppo);
        add(ppo);
        ppo.addItemListener(this);
        add(dental);
        dental.addItemListener(this);
        add(vision);
        vision.addItemListener(this);
        // insChoice.append(" "); // error: cannot find symbol .
        add(insChoice);
    }
    public static void main(String[] arguments) 
    {
        // Sets size of Frame for options and reponse
        JInsurance iFrame = new JInsurance();
        iFrame.setSize(400, 100);
        iFrame.setVisible(true);
    }
    @Override
    public void itemStateChanged(ItemEvent check) 
    {
        Object source = check.getItem();
        // Declares what to be displayed when hmo
        //  is selected
        if(source == hmo)
        {
            int select = check.getStateChange();
            if(select == ItemEvent.SELECTED)
                insChosen = "hmo costs $200 per month ";
            else
                insChosen = " ";
        }
        // Declares what to be displayed when ppo
        //  is selected
        if(source == ppo)
        {
            int select = check.getStateChange();
            if(select == ItemEvent.SELECTED)
                insChosen = "ppo costs $600 per month ";
            else
                insChosen = " ";
        }
        // Declares what to be displayed when dental
        //  is selected
        if(source == dental)
        {
            int select = check.getStateChange();
            if(select == ItemEvent.SELECTED)
                insChosen = "dental $75 additional ";
            else
                insChosen = " ";
        }
        // Declares what to be displayed when vision
        //  is selected
        if(source == vision)
        {
            int select = check.getStateChange();
            if(select == ItemEvent.SELECTED)
                insChosen = "vision $20 additional ";
            else
                insChosen = " ";
        }
        output = " " + insChosen;
        // insChoice.append(output); // error: cannot find symbol .
    }
}
