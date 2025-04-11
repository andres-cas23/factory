package Pack3;

import Pack2.IConexion;

public class ConexionOracle implements IConexion {

    private String host;
    private String puerto;
    private String usuario;
    private String contrasena;

    public ConexionOracle(){
        this.host = "localhost";
        this.puerto = "1234";
        this.usuario = "admin";
        this.contrasena = "123";

    }
    public void conectar(){
        System.out.println("Se Conecto a Oracle");

    }
    public void desconectar(){
        System.out.println("Se Desconecto de Oracle");

        public String toString(){
            return "Conexion Oracle [Host= " + host + ", Puerto= "+ puerto + ",Usuario= "+ usuario + ", Contrasena= " + contrasena + "]";

        }

    }
}
