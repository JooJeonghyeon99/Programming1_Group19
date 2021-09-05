

import java.awt.*;
import java.awt.event.*;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JFrame;

public class MenuUI {
    JTextArea output;
    JScrollPane scrollPane;

    public JMenuBar createMenuBar() {
        JMenuBar menuBar;
        JMenu menu, submenu;
        JMenuItem menuItem;

        //Create the menu bar.
        menuBar = new JMenuBar();

        //Build the Data menu.
        menu = new JMenu("Data Menu");
        menu.setMnemonic(KeyEvent.VK_A);
        menuBar.add(menu);

        //Build item of menu
        menu.addSeparator();
        submenu = new JMenu("Data Information");
        submenu.setMnemonic(KeyEvent.VK_S);

        //Build part of Data
        menuItem = new JMenuItem("Range");
        submenu.add(menuItem);

        menuItem = new JMenuItem("Area");
        submenu.add(menuItem);
        menu.add(submenu);

        //Build Summary menu in the menu bar.
        menu = new JMenu("Summary Menu");
        menu.setMnemonic(KeyEvent.VK_N);
        menuBar.add(menu);

        //Build item of Summary menu
        menu.addSeparator();
        submenu = new JMenu("Grouping");
        submenu.setMnemonic(KeyEvent.VK_S);

        //Build part of Grouping Display
        menuItem = new JMenuItem("No grouping");
        submenu.add(menuItem);
        menuItem = new JMenuItem("Number of groups");
        submenu.add(menuItem);
        menu.add(submenu);
        //Build item of Summary menu
        menu.addSeparator();
        submenu = new JMenu("Metrics");
        submenu.setMnemonic(KeyEvent.VK_S);

        //Build part of Metrics Display
        menuItem = new JMenuItem("Positive cases");
        submenu.add(menuItem);
        menuItem = new JMenuItem("Deaths");
        submenu.add(menuItem);
        menuItem = new JMenuItem("Vaccinated people");
        submenu.add(menuItem);
        menu.add(submenu);

        //Build item of Summary menu
        menu.addSeparator();
        submenu = new JMenu("New total Calculation");
        submenu.setMnemonic(KeyEvent.VK_S);

        //Build part of Calculation Display
        menuItem = new JMenuItem("Total new cases");
        submenu.add(menuItem);
        menuItem = new JMenuItem("Total new deaths");
        submenu.add(menuItem);
        menuItem = new JMenuItem("Total new vaccinated");
        submenu.add(menuItem);
        menu.add(submenu);

        //Build item of Summary menu
        menu.addSeparator();
        submenu = new JMenu("Up to Calculation");
        submenu.setMnemonic(KeyEvent.VK_S);

        //Build part of Calculation Display
        menuItem = new JMenuItem("Total cases");
        submenu.add(menuItem);
        menuItem = new JMenuItem("Total deaths");
        submenu.add(menuItem);
        menuItem = new JMenuItem("Total vaccinated");
        submenu.add(menuItem);
        menu.add(submenu);

        //Build the Display menu.
        menu = new JMenu("Display Menu");
        menu.setMnemonic(KeyEvent.VK_A);
        menuBar.add(menu);

        //Build item of menu
        menu.addSeparator();
        submenu = new JMenu("Data Display");
        submenu.setMnemonic(KeyEvent.VK_S);

        //Build part of Data Display
        menuItem = new JMenuItem("Tabular Display");
        submenu.add(menuItem);

        menuItem = new JMenuItem("Chart Display");
        submenu.add(menuItem);
        menu.add(submenu);

        return menuBar;
    }

    public Container createContentPane() {

        JPanel contentPane = new JPanel(new BorderLayout());
        contentPane.setOpaque(true);

        output = new JTextArea(5, 30);
        output.setEditable(false);
        scrollPane = new JScrollPane(output);

        contentPane.add(scrollPane, BorderLayout.CENTER);

        return contentPane;
    }


    static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("MenuUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MenuUI demo = new MenuUI();
        frame.setJMenuBar(demo.createMenuBar());
        frame.setContentPane(demo.createContentPane());

        //Display the window.
        frame.setSize(1000, 500);
        frame.setVisible(true);
    }

    
}
