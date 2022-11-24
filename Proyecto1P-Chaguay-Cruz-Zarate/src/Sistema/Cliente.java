/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema;

import Enums.*;
import Elementos.*;

/**
 *
 * @author HP
 */
public class Cliente extends Usuario {
    private int numTarjetaCredito;
    
    

    public Cliente( String cedula, String nombres, String apellidos, int edad, String correo,String usuario, String contrasena, tipoCategoria tipoCategoria, int numTarjetaCredito) {
        super(cedula, nombres, apellidos, edad, correo,usuario, contrasena, tipoCategoria);
        this.numTarjetaCredito = numTarjetaCredito;
    }

    
    public int getNumTarjetaCredito() {
        return numTarjetaCredito;
    }

    public void setNumTarjetaCredito(int numTarjetaCredito) {
        this.numTarjetaCredito = numTarjetaCredito;
    }
    
    @Override
    public String toString(){
        toString();
        return "Num T/C: "+numTarjetaCredito;
    }
        
    
    @Override
    public void consultarReservas(){
        
    }
    public void comprarTickets(){
        System.out.println("----ORIGEN----");
        System.out.println("1. Guayaquil");
        System.out.println("2. Lima");
        System.out.println("Elige punto de partida: ");
        
        System.out.println("----DESTINO----");
        System.out.println("1. Guayaquil");
        System.out.println("2. Lima");
        System.out.println("Elige punto de destino: ");
        
        System.out.println("Fecha de salida: " +"/"+" / ");
        System.out.println("Fecha de retorno: " +"/ "+"/ ");
    }
//    @Override
//    public void elegirOpcion(){
//        
//    }
    public void pagar(int numTarjetaCredito){
        
    }
    public void crearReserva(){
        
    }
    public void mostrarMenuCliente(){
        System.out.println("1. Comprar tickets aereos");
        System.out.println("2. Consultar reservas");
        System.out.println("3. Salir");
    }
}
