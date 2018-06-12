/*
 * Created by JFormDesigner on Tue Jun 12 15:44:40 BST 2018
 */

package ui;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * @author Shannon Turnbull
 */
public class UI {
    public UI() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner non-commercial license
        frame = new JFrame();
        tabs = new JTabbedPane();
        mainTab = new JPanel();
        panel1 = new JPanel();
        label1 = new JLabel();
        radioButton1 = new JRadioButton();

        //======== frame ========
        {
            frame.setTitle("Litt AIO Fighter");
            Container frameContentPane = frame.getContentPane();
            frameContentPane.setLayout(new GridBagLayout());
            ((GridBagLayout)frameContentPane.getLayout()).columnWidths = new int[] {0, 0};
            ((GridBagLayout)frameContentPane.getLayout()).rowHeights = new int[] {0, 0};
            ((GridBagLayout)frameContentPane.getLayout()).columnWeights = new double[] {1.0, 1.0E-4};
            ((GridBagLayout)frameContentPane.getLayout()).rowWeights = new double[] {1.0, 1.0E-4};

            //======== tabs ========
            {
                tabs.setTabPlacement(SwingConstants.LEFT);
                tabs.setBorder(new EmptyBorder(15, 15, 15, 15));

                //======== mainTab ========
                {
                    mainTab.setBorder(new EmptyBorder(15, 15, 15, 15));
                    mainTab.setLayout(new GridBagLayout());
                    ((GridBagLayout)mainTab.getLayout()).columnWidths = new int[] {0, 0};
                    ((GridBagLayout)mainTab.getLayout()).rowHeights = new int[] {0, 0, 0};
                    ((GridBagLayout)mainTab.getLayout()).columnWeights = new double[] {1.0, 1.0E-4};
                    ((GridBagLayout)mainTab.getLayout()).rowWeights = new double[] {0.0, 1.0, 1.0E-4};

                    //======== panel1 ========
                    {
                        panel1.setBorder(new TitledBorder("NPC's to fight"));
                        panel1.setLayout(new GridBagLayout());
                        ((GridBagLayout)panel1.getLayout()).columnWidths = new int[] {0, 0, 0};
                        ((GridBagLayout)panel1.getLayout()).rowHeights = new int[] {334, 0};
                        ((GridBagLayout)panel1.getLayout()).columnWeights = new double[] {1.0, 0.0, 1.0E-4};
                        ((GridBagLayout)panel1.getLayout()).rowWeights = new double[] {1.0, 1.0E-4};

                        //---- label1 ----
                        label1.setText("Rat (lvl 2)");
                        panel1.add(label1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 0, 0), 0, 0));
                        panel1.add(radioButton1, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 0, 0), 0, 0));
                    }
                    mainTab.add(panel1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 0), 0, 0));
                }
                tabs.addTab("NPC Settings:", mainTab);
            }
            frameContentPane.add(tabs, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 0), 0, 0));
            frame.pack();
            frame.setLocationRelativeTo(frame.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner non-commercial license
    private JFrame frame;
    private JTabbedPane tabs;
    private JPanel mainTab;
    private JPanel panel1;
    private JLabel label1;
    private JRadioButton radioButton1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
