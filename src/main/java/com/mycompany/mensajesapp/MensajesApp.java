/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mensajesapp;

import vistas.Opciones;

/**
 *
 * @author Carol
 */
public class MensajesApp {

    public static void main(String[] args) {
        // Lanza la ventana Opciones como el punto de entrada principal
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Opciones().setVisible(true);
            }
        });
    }
}
