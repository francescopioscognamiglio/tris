/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tris;

import java.awt.Button;
import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author AntoFra
 */
public class Set_Control implements ActionListener, WindowListener {
    boolean controllore; //Attribute for control that value inserting (O or X)
    
    //Attributes for checking winner
    Winner Win;
    String control;
    int cont;
    
    //Builder or Constructor
    public Set_Control () {
        controllore = false;
        cont = 0;
        Win = new Winner ();
    }
    
    public void Set (ActionEvent e, JFrame F_game, JFrame F_welcome, Button b1, Button b2, Button b3, Button b4, Button b5, Button b6, Button b7, Button b8, Button b9, String name1, String name2, JLabel l_game) {
        String bottone = e.getActionCommand();
        if((bottone.equals("Avvia Partita!"))&&((name1.charAt(0)!=' ')||(name1.charAt(1)!=' '))&&((name2.charAt(0)!=' ')||(name2.charAt(1)!=' ')))
        {
            F_welcome.setVisible(false); //don't see Frame (F_welcome)
            F_game.addWindowListener(this);
            F_game.setVisible(true); //see Frame (F_game)
            l_game.setForeground(Color.red);
            l_game.setText(name1+ " Tocca a te. Sei la O."); //set Text of the Label (l_game). It is composed by the name of the player that must insert the value 'O'
        }
        else
        {
            //switch for control many cases (which Button is pressed) and change the name of the player that must insert a value ('O' or 'X') with setText of the Label (l_game)
            switch (bottone)
            {
                case "1":
                    if (controllore==false)
                    {
                        b1.setLabel("O");
                        b1.setForeground(Color.red);
                        controllore=true;
                        cont++;
                        l_game.setForeground(Color.blue);
                        l_game.setText(name2+ " Tocca a te. Sei la X.");
                    }
                    else
                    {
                        b1.setLabel("X");
                        b1.setForeground(Color.blue);
                        controllore=false;
                        cont++;
                        l_game.setForeground(Color.red);
                        l_game.setText(name1+ " Tocca a te. Sei la O.");
                    }
                    break;
                case "2":
                    if (controllore==false)
                    {
                        b2.setLabel("O");
                        b2.setForeground(Color.red);
                        controllore=true;
                        cont++;
                        l_game.setForeground(Color.blue);
                        l_game.setText(name2+ " Tocca a te. Sei la X.");
                    }
                    else
                    {
                        b2.setLabel("X");
                        b2.setForeground(Color.blue);
                        controllore=false;
                        cont++;
                        l_game.setForeground(Color.red);
                        l_game.setText(name1+ " Tocca a te. Sei la O.");
                    }
                    break;
                case "3":
                    if (controllore==false)
                    {
                        b3.setLabel("O");
                        b3.setForeground(Color.red);
                        controllore=true;
                        cont++;
                        l_game.setForeground(Color.blue);
                        l_game.setText(name2+ " Tocca a te. Sei la X.");
                    }
                    else
                    {
                        b3.setLabel("X");
                        b3.setForeground(Color.blue);
                        controllore=false;
                        cont++;
                        l_game.setForeground(Color.red);
                        l_game.setText(name1+ " Tocca a te. Sei la O.");
                    }
                    break;
                case "4":
                    if (controllore==false)
                    {
                        b4.setLabel("O");
                        b4.setForeground(Color.red);
                        controllore=true;
                        cont++;
                        l_game.setForeground(Color.blue);
                        l_game.setText(name2+ " Tocca a te. Sei la X.");
                    }
                    else
                    {
                        b4.setLabel("X");
                        b4.setForeground(Color.blue);
                        controllore=false;
                        cont++;
                        l_game.setForeground(Color.red);
                        l_game.setText(name1+ " Tocca a te. Sei la O.");
                    }
                    break;
                case "5":
                    if (controllore==false)
                    {
                        b5.setLabel("O");
                        b5.setForeground(Color.red);
                        controllore=true;
                        cont++;
                        l_game.setForeground(Color.blue);
                        l_game.setText(name2+ " Tocca a te. Sei la X.");
                    }
                    else
                    {
                        b5.setLabel("X");
                        b5.setForeground(Color.blue);
                        controllore=false;
                        cont++;
                        l_game.setForeground(Color.red);
                        l_game.setText(name1+ " Tocca a te. Sei la O.");
                    }
                    break;
                case "6":
                    if (controllore==false)
                    {
                        b6.setLabel("O");
                        b6.setForeground(Color.red);
                        controllore=true;
                        cont++;
                        l_game.setForeground(Color.blue);
                        l_game.setText(name2+ " Tocca a te. Sei la X.");
                    }
                    else
                    {
                        b6.setLabel("X");
                        b6.setForeground(Color.blue);
                        controllore=false;
                        cont++;
                        l_game.setForeground(Color.red);
                        l_game.setText(name1+ " Tocca a te. Sei la O.");
                    }
                    break;
                case "7":
                    if (controllore==false)
                    {
                        b7.setLabel("O");
                        b7.setForeground(Color.red);
                        controllore=true;
                        cont++;
                        l_game.setForeground(Color.blue);
                        l_game.setText(name2+ " Tocca a te. Sei la X.");
                    }
                    else
                    {
                        b7.setLabel("X");
                        b7.setForeground(Color.blue);
                        controllore=false;
                        cont++;
                        l_game.setForeground(Color.red);
                        l_game.setText(name1+ " Tocca a te. Sei la O.");
                    }
                    break;
                case "8":
                    if (controllore==false)
                    {
                        b8.setLabel("O");
                        b8.setForeground(Color.red);
                        controllore=true;
                        cont++;
                        l_game.setForeground(Color.blue);
                        l_game.setText(name2+ " Tocca a te. Sei la X.");
                    }
                    else
                    {
                        b8.setLabel("X");
                        b8.setForeground(Color.blue);
                        controllore=false;
                        cont++;
                        l_game.setForeground(Color.red);
                        l_game.setText(name1+ " Tocca a te. Sei la O.");
                    }
                    break;
                case "9":
                    if (controllore==false)
                    {
                        b9.setLabel("O");
                        b9.setForeground(Color.red);
                        controllore=true;
                        cont++;
                        l_game.setForeground(Color.blue);
                        l_game.setText(name2+ " Tocca a te. Sei la X.");
                    }
                    else
                    {
                        b9.setLabel("X");
                        b9.setForeground(Color.blue);
                        controllore=false;
                        cont++;
                        l_game.setForeground(Color.red);
                        l_game.setText(name1+ " Tocca a te. Sei la O.");
                    }
                    break;
            }
        }
    }

    public void Control (JFrame F_game, Button b1, Button b2, Button b3, Button b4, Button b5, Button b6, Button b7, Button b8, Button b9, String name1, String name2) {
        //control if one of the lines is equal
        if ((b1.getLabel().equals(b2.getLabel()))&&(b1.getLabel().equals(b3.getLabel())))
        {
            control=b1.getLabel();
            F_game.setVisible(false);
            Win.Risultato(control, name1, name2);
            cont=1;
        }
        if ((b4.getLabel().equals(b5.getLabel()))&&(b4.getLabel().equals(b6.getLabel())))
        {
            control=b4.getLabel();
            F_game.setVisible(false);
            Win.Risultato(control, name1, name2);
            cont=1;
        }
        if ((b7.getLabel().equals(b8.getLabel()))&&(b7.getLabel().equals(b9.getLabel())))
        {
            control=b7.getLabel();
            F_game.setVisible(false);
            Win.Risultato(control, name1, name2);
            cont=1;
        }
            
        //control if one of the columns is equal
        if ((b1.getLabel().equals(b4.getLabel()))&&(b1.getLabel().equals(b7.getLabel())))
        {
            control=b1.getLabel();
            F_game.setVisible(false);
            Win.Risultato(control, name1, name2);
            cont=1;
        }
        if ((b2.getLabel().equals(b5.getLabel()))&&(b2.getLabel().equals(b8.getLabel())))
        {
            control=b2.getLabel();
            F_game.setVisible(false);
            Win.Risultato(control, name1, name2);
            cont=1;
        }
        if ((b3.getLabel().equals(b6.getLabel()))&&(b3.getLabel().equals(b9.getLabel())))
        {
            control=b3.getLabel();
            F_game.setVisible(false);
            Win.Risultato(control, name1, name2);
            cont=1;
        }
            
        //control if line (\ or /) is equal
        if ((b1.getLabel().equals(b5.getLabel()))&&(b1.getLabel().equals(b9.getLabel())))
        {
            control=b1.getLabel();
            F_game.setVisible(false);
            Win.Risultato(control, name1, name2);
            cont=1;
        }
        if ((b3.getLabel().equals(b5.getLabel()))&&(b3.getLabel().equals(b7.getLabel())))
        {
            control=b3.getLabel();
            F_game.setVisible(false);
            Win.Risultato(control, name1, name2);
            cont=1;
        }
        if (cont>8) //if all values were inserted
        {
            control=null;
            F_game.setVisible(false);
            Win.Risultato(control, name1, name2);
        }
    }
    
    public void actionPerformed(ActionEvent e) {
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
