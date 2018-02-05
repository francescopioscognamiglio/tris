/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tris;

import java.awt.event.*;

/**
 *
 * @author AntoFra
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tris Game = new Tris (); //Attribute of the Class Tris
        WindowEvent e_Event = null; //Attribute for calling Method (windowOpened)
        Game.windowOpened(e_Event); //calling Method (windowOpened)
    }
}