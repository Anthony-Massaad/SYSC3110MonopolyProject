package View.Controllers;

import javax.swing.*;

public class LocationController {

    public int LocationNoOwnerController(JFrame frame, String name, int cost){
        return JOptionPane.showConfirmDialog(
                frame,
                "You landed on " + name + ", cost is $" + cost + "\nWould you like to purchase this property?",
                "Purchase?",
                JOptionPane.YES_NO_OPTION);
    }



}