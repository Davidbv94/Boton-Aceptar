/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author David
 */
public class Control implements ActionListener
{

    @Override
    public void actionPerformed(ActionEvent e) {
       
        if(e.getActionCommand().equals("Aceptar"))
        {
        System.out.println("Usted preciono Aceptar");
        }
    }
    
    
}
