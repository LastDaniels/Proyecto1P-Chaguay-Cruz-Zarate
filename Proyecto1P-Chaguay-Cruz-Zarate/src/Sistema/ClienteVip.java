/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema;

import Archivos.ManejoArchivos;
import static Archivos.ManejoArchivos.LeerValidando;
import Enums.*;
import java.util.ArrayList;
import Elementos.*;

/**
 *
 * @author HP
 */
public class ClienteVip extends Cliente {

    private String rango;
    private int millas = +1000;
    ArrayList<String[]> datosClientes = LeerValidando("clientes.txt", true);

    //CONSTRUCTOR PARA CREAR OBJETOS CLIENTEVIP
    public ClienteVip(String cedula, String nombres, int edad, String correo, String usuario, String contrasena, tipoCategoria tipoCategoria) {
        super(cedula, nombres, edad, correo, usuario, contrasena, tipoCategoria);

        for (String[] dato : datosClientes) {
            if (dato[0].equals(cedula)) {
                this.rango = dato[2];
                this.millas = Integer.valueOf(dato[3]);
            }
        }
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public int getMillas() {
        return millas;
    }

    public void setMillas(int millas) {
        this.millas = millas;
    }

    @Override
    public String toString() {
        toString();
        return "Rango: " + rango + ",millas: " + millas;
    }

    //METODO PARA PAGAR CON MILLAS
    public String Pagar(int millas, int valorMillas, VueloReserva vuelo) {
        int valor = vuelo.getCodigoVueloReserva().getPrecioMillas();
        if (millas >= valor) {
            Reserva r = new Reserva(crearCodigoReserva(), vuelo.getCodigoVueloReserva(), nombres, vuelo.getCodigoVueloReserva().getFechaSalida(), millas);
            //CREACION DE OBJETO RESERVA
            ManejoArchivos.EscribirArchivo("reservas.txt", r.toString());
            //CREACION DE OBJETO PAGO
            Pago p = new Pago(crearCodigo(), r.getCodigo(), formaPago.M, valor);
            

            ManejoArchivos.EscribirArchivo("pagos.txt", p.toString());
            return r.getCodigo();
        } else {
            System.out.println("No tiene millas suficientes para su pago");
            System.out.print("Desea intentar con tarjeta de credito?(s/n)");
            String opc = sc.nextLine();
            return opc;

        }
        
    }

}
