/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad3parte1ejercicionumero4;

/**
 *
 * @author Knoknozo
 */
public class Calculos {
    public static double Pago(double PAT,int EST){
        double PAGMAT;
        PAGMAT = 50000;
        if(PAT>2000000 && EST>3){
        PAGMAT = PAGMAT+(0.03*PAT);
        }
        else{
            PAGMAT = 50000;
        }
        return PAGMAT;
    }
    
}
