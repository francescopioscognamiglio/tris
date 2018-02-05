/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tris;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author AntoFra
 */
public class Tris implements ActionListener, WindowListener {
    
    //Objects for welcome's frame
    JFrame F_welcome = new JFrame ("Gioco del Tris"); //Frame (F_welcome) is composed by Panel (P_welcome)
    JPanel P_welcome = new JPanel(); //Panel (P_welcome) is composed by Objects (Button b_go, Label l_welcome)
    JButton b_go = new JButton("Avvia Partita!"); //Button for exit
    JLabel l_welcome = new JLabel ("Inserire il nome dei giocatori:"); //welcome's message
    JTextField name1 = new JTextField(15); //TextField for inserting the first user's name
    JTextField name2 = new JTextField(15); //TextField for inserting the second user's name
    String name_1, name_2; //Strings (name_1)(name_2) for say the winner's name
    
    GridBagLayout layout = new GridBagLayout ();
    GridBagConstraints g = new GridBagConstraints ();
    
    //Objects for game's frame
    JFrame F_game = new JFrame("TRIS"); //Frame (F_game) is composed by Panels P_game and P_out
    JPanel P_game = new JPanel(); //Panel (P_game) is composed by Buttons from b1 to b9
    //Buttons of game
    Button b1 = new Button("1");
    Button b2 = new Button ("2");
    Button b3 = new Button("3");
    Button b4 = new Button ("4");
    Button b5 = new Button("5");
    Button b6 = new Button ("6");
    Button b7 = new Button("7");
    Button b8 = new Button ("8");
    Button b9 = new Button("9");
    JLabel l_game = new JLabel(); //create a new Label (l_game) that is composed by the name of the player that must play
    GridLayout tabella = new GridLayout(3, 3, 5, 5); //Table (tabella) that has Buttons from b1 to b9
    
    
    //Attribute for inserting values and control if there are a winner
    Set_Control SetControl;
    
    
    //Builder or Constructor
    public Tris(){
        
        Image im = Toolkit.getDefaultToolkit().getImage("C:\\tris\\icona_frame.gif");
        F_welcome.setIconImage(im);
        F_game.setIconImage(im);
        //Objects for welcome's frame
        F_welcome.setBounds(10, 10, 720, 150); //set parameters of the Frame (F_welcome): x, y, width, height
        F_welcome.addWindowListener(this); //add a Frame Window Listener for the Frame (F_welcome)
        P_welcome.setBackground(Color.white);
        //l_welcome.setForeground(Color.red);
        l_welcome.setFont(new Font(" ", Font.BOLD, 20)); //set Font of the Label (l_welcome)
        b_go.addActionListener(this); //add a Listener for the start's Button (b_go)
        b_go.setBackground(Color.white);
        b_go.setForeground(Color.black);
        b_go.setFont(new Font(" ", Font.BOLD, 17)); //set Font of the start's Button (b_go)
        b_go.setCursor(new Cursor(12)); //set Cursor of the start's Button (b_go)
        name1.setFont(new Font(" ", Font.BOLD, 22)); //set Font of the TextField (name1)
        name1.setForeground(Color.red);
        name2.setFont(new Font(" ", Font.BOLD, 22)); //set Font of the TextField (name2)
        name2.setForeground(Color.blue);
        //P_welcome.add(l_welcome); //add Label (l_welcome) at Panel (P_welcome)
        
        F_welcome.add(P_welcome); //add Panel (P_welcome) at Frame (F_welcome)
        g.gridx = 0;
        g.gridy = 0;
        layout.setConstraints(l_welcome, g);
        P_welcome.add(l_welcome);
        P_welcome.setLayout(layout);
        g.gridx = 0;
        g.gridy = 2;
        layout.setConstraints(name1, g);
        P_welcome.add(name1); //add TextField (name1) at Panel (P_welcome)
        g.gridx = 1;
        g.gridy = 2;
        layout.setConstraints(name2, g);
        g.anchor = GridBagConstraints.WEST;
        P_welcome.add(name2); //add TextField (name2) at Panel (P_welcome)
        g.gridx = 1;
        g.gridy = 3;
        g.anchor = GridBagConstraints.CENTER;
        layout.setConstraints(b_go, g);
        P_welcome.add(b_go); //add start's Button (b_go) in position south at Frame (F_welcome)
        
        //Objects for game's frame
        F_game.setBackground(Color.BLACK); //set Background of Frame (F_game)
        F_game.setBounds(100, 100, 500, 600); //set parameters of the Frame (F_game): x, y, width, height
        P_game.setLayout(tabella); //set Layout of Panel (P_game) with Table (tabella)
        P_game.setBackground(Color.black);
        b1.addActionListener(this); //add a Listener for the Button b1
        b1.setFont(new Font (" ", Font.LAYOUT_LEFT_TO_RIGHT, 60)); //set the Font of the Button (b1)
        b1.setCursor(new Cursor(12)); //set Cursor of the Button (b1)
        b1.setBackground(Color.white);
        b1.setForeground(Color.white);
        b2.addActionListener(this); //add a Listener for the Button (b2)
        b2.setFont(new Font (" ", Font.LAYOUT_LEFT_TO_RIGHT, 60)); //set the Font of the Button (b2)
        b2.setCursor(new Cursor(12)); //set Cursor of the Button (b2)
        b2.setBackground(Color.white);
        b2.setForeground(Color.white);
        b3.addActionListener(this); //add a Listener for the Button (b3)
        b3.setFont(new Font (" ", Font.LAYOUT_LEFT_TO_RIGHT, 60)); //set the Font of the Button (b3)
        b3.setCursor(new Cursor(12)); //set Cursor of the Button (b3)
        b3.setBackground(Color.white);
        b3.setForeground(Color.white);
        b4.addActionListener(this); //add a Listener for the Button (b4)
        b4.setFont(new Font (" ", Font.LAYOUT_LEFT_TO_RIGHT, 60)); //set the Font of the Button (b4)
        b4.setCursor(new Cursor(12)); //set Cursor of the Button (b4)
        b4.setBackground(Color.white);
        b4.setForeground(Color.white);
        b5.addActionListener(this); //add a Listener for the Button (b5)
        b5.setFont(new Font (" ", Font.LAYOUT_LEFT_TO_RIGHT, 60)); //set the Font of the Button (b5)
        b5.setCursor(new Cursor(12)); //set Cursor of the Button (b5)
        b5.setBackground(Color.white);
        b5.setForeground(Color.white);
        b6.addActionListener(this); //add a Listener for the Button (b6)
        b6.setFont(new Font (" ", Font.LAYOUT_LEFT_TO_RIGHT, 60)); //set the Font of the Button (b6)
        b6.setCursor(new Cursor(12)); //set Cursor of the Button (b6)
        b6.setBackground(Color.white);
        b6.setForeground(Color.white);
        b7.addActionListener(this); //add a Listener for the Button (b7)
        b7.setFont(new Font (" ", Font.LAYOUT_LEFT_TO_RIGHT, 60)); //set the Font of the Button (b7)
        b7.setCursor(new Cursor(12)); //set Cursor of the Button (b7)
        b7.setBackground(Color.white);
        b7.setForeground(Color.white);
        b8.addActionListener(this); //add a Listener for the Button (b8)
        b8.setFont(new Font (" ", Font.LAYOUT_LEFT_TO_RIGHT, 60)); //set the Font of the Button (b8)
        b8.setCursor(new Cursor(12)); //set Cursor of the Button (b8)
        b8.setBackground(Color.white);
        b8.setForeground(Color.white);
        b9.addActionListener(this); //add a Listener for the Button (b9)
        b9.setFont(new Font (" ", Font.LAYOUT_LEFT_TO_RIGHT, 60)); //set the Font of the Button (b9)
        b9.setCursor(new Cursor(12)); //set Cursor of the Button (b9)
        b9.setBackground(Color.white);
        b9.setForeground(Color.white);
        l_game.setBackground(Color.lightGray); //set Background of the Label (l_game)
        l_game.setFont(new Font (" ", Font.LAYOUT_LEFT_TO_RIGHT, 35)); //set Font of the Label (l_game)
        l_game.setText(" "); //set Text of the Label (l_game)
        F_game.add(l_game, "North"); //add Label (l_game) in position north at Frame (F_game)
        //add many Buttons at P_game
        P_game.add(b1);
        P_game.add(b2);
        P_game.add(b3);
        P_game.add(b4);
        P_game.add(b5);
        P_game.add(b6);
        P_game.add(b7);
        P_game.add(b8);
        P_game.add(b9);
        F_game.add(P_game); //add Panel (P_game) at Frame (F_game)
        
        //Attribute for inserting values and control if there are a winner
        SetControl = new Set_Control();
    }

    public void actionPerformed(ActionEvent e) {
        name_1 = null;
        name_2 = null;
        boolean error1 = false, error2 = false;
        try{
            if ((name1.getText().equals(""))||(name2.getText().equals("")))
            {
                JOptionPane.showMessageDialog(F_welcome, "Inserire tutti i campi correttamente.", "Errore", JOptionPane.ERROR_MESSAGE);
                name1.setText("");
                name2.setText("");
            }
            else
            {
                for (int i=0; i<name1.getText().length(); i++)
                {
                    if ((name1.getText().charAt(i) == ' ')||((name1.getText().charAt(i) < 65)||((name1.getText().charAt(i) > 90)&&(name1.getText().charAt(i) < 97))||(name1.getText().charAt(i) > 122)))
                        error1 = true;
                }
                for (int i=0; i<name2.getText().length(); i++)
                {
                    if ((name2.getText().charAt(i) == ' ')||((name2.getText().charAt(i) < 65)||((name2.getText().charAt(i) > 90)&&(name2.getText().charAt(i) < 97))||(name2.getText().charAt(i) > 122)))
                        error2 = true;
                }
                if ((!error1)&&(!error2))
                {
                    name_1=name1.getText(); //String (name_1) take the text of the TextField (name1)
                    name_2=name2.getText(); //String (name_2) take the text of the TextField (name2)boolean error1 = false, error2 = false, error3 = false, error4 = false;
                    F_welcome.setVisible(false);
                    F_game.setVisible(true);
                    SetControl.Set(e, F_game, F_welcome, b1, b2, b3, b4, b5, b6, b7, b8, b9, name_1, name_2, l_game); //Method for Set the values
                    SetControl.Control(F_game, b1, b2, b3, b4, b5, b6, b7, b8, b9, name_1, name_2); //Method for Control if there are a winner
                }
                else
                {
                    JOptionPane.showMessageDialog(F_welcome, "Inserire tutti i campi correttamente.", "Errore", JOptionPane.ERROR_MESSAGE);
                    name1.setText("");
                    name2.setText("");
                }
            }
        }catch (StringIndexOutOfBoundsException e1) {
            JOptionPane.showMessageDialog(F_welcome, "Inserire tutti i correttamente.", "Errore", JOptionPane.ERROR_MESSAGE);
            name1.setText("");
            name2.setText("");
        }
    }

    public void windowOpened(WindowEvent e) {
        F_welcome.setVisible(true); //see welcome's Frame (F_welcome)
    }

    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    public void windowClosed(WindowEvent e) {
        
    }

    public void windowIconified(WindowEvent e) {
    }

    public void windowDeiconified(WindowEvent e) {
    }

    public void windowActivated(WindowEvent e) {
    }

    public void windowDeactivated(WindowEvent e) {
    }
}
