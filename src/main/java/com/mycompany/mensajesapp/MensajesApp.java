/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mensajesapp;

import java.sql.Connection;

/**
 *
 * @author Carol
 */
public class MensajesApp {

    public static void main(String[] args) {    
        Conexion conexion = new Conexion();
        try(Connection cnx = conexion.get_conConnection() ){
            
        }catch(Exception e){
            System.out.println(e);
            
        }
    }
}
