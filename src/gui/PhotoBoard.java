package gui;

import javax.swing.*;
import java.awt.*;

public class PhotoBoard extends JFrame {
    private JPanel mainPanel;
    private JTable photosTable = new JTable();

    public PhotoBoard() {
        $$$setupUI$$$();
        getContentPane().add(mainPanel);
        setLocationRelativeTo(null);
        pack();
    }

    public void display() {
        //loadData();
        setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        createUIComponents();
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridBagLayout());
        final JScrollPane scrollPane1 = new JScrollPane();
        GridBagConstraints gbc;
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.BOTH;
        mainPanel.add(scrollPane1, gbc);
        scrollPane1.setViewportView(photosTable);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return mainPanel;
    }

}