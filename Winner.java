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
public class Winner implements ActionListener, WindowListener {
    
    //Objects for winner's Frame
    JFrame F_winner = new JFrame (); //Frame (F_winner) is composed by Panel (P_winner)
    JPanel P_winner = new JPanel (); //Panel (P_winner) is composed by Button (b_out) and Label (l_winner)
    JLabel l_winner = new JLabel (); //Label (l_winner) is composed by a message for the winner
    
    //Objects for exit's Frame
    JLabel l_in_out = new JLabel ("Vuoi avviare una nuova partita?");
    JButton b_in = new JButton ("Avvia Nuova Partita");
    
    //Builder or Constructor
    public Winner () {
        
        Image im = Toolkit.getDefaultToolkit().getImage("C:\\tris\\icona_frame.gif");
        F_winner.setIconImage(im);
        F_winner.setBounds(100, 100, 650, 180); //set parameters of the Frame (F_game): x, y, width, height
        F_winner.addWindowListener(this);
        P_winner.setBackground(Color.white);
        l_winner.setFont(new Font(" ", Font.LAYOUT_NO_LIMIT_CONTEXT, 30));
        l_winner.setForeground(Color.black);
        l_in_out.setFont(new Font(" ", Font.LAYOUT_NO_LIMIT_CONTEXT, 30));
        b_in.addActionListener(this);
        b_in.setFont(new Font(" ", Font.LAYOUT_NO_LIMIT_CONTEXT, 20)); //set Font of the exit's Button (b_out)
        b_in.setCursor(new Cursor(12)); //set Cursor of the exit's Button (b_out)
        b_in.setBackground(Color.white);
    }
    
    //Control the winner
    public void Risultato (String control, String name1, String name2) {
        if (control==null)
             l_winner.setText("La partita è finita con un pareggio.");
        else
        {
            if (control.charAt(0)=='O')
            {
                l_winner.setForeground(Color.red);
                l_winner.setText(name1 +" ha vinto. Complimenti!");
            }
            else
            {
                l_winner.setForeground(Color.blue);
                l_winner.setText(name2 +" ha vinto. Complimenti!");
            }
        }
        l_winner.setFont(new Font(" ", Font.LAYOUT_RIGHT_TO_LEFT, 30)); //set Font of the Label (l_winner)
        P_winner.add(l_winner, "Center"); //add Label (l_winner) in north's position at Panel (P_winner)
        P_winner.add(l_in_out);
        F_winner.add(P_winner); //add Panel (P_winner) at Frame (F_winner)
        F_winner.add(b_in, "South");
        F_winner.setVisible(true); //see Frame (F_winner)
    }

    //control if the exit's Button (b_out) was pressed
    public void actionPerformed(ActionEvent e) {
        String button = e.getActionCommand();
        if (button.equals("Avvia Nuova Partita"))
        {
            F_winner.setVisible(false); //Make invisible the Frame that says the winner (F_winner)
            //Start new match
            Tris Game = new Tris (); //Attribute of the Class Tris
            WindowEvent e_Event = null; //Attribute for calling Method (windowOpened)
            Game.windowOpened(e_Event); //calling Method (windowOpened)
        }
    }

    public void windowOpened(WindowEvent e) {
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
