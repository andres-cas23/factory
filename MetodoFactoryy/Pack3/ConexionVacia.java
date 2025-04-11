package Pack3;

import Pack2.IConexion;

public class ConexionVacia implements IConexion {

    @Override
    public void conectar() {
        System.out.println("Conexion vacia: No se puede conectar");

    }
    public void desconectar() {
        System.out.println("Conexion vacia: No se puede desconectar");

    }
    public String toString(){
        return "ConexionVacia: No se estableció conexion.";
    }
}
