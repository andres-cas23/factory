package Pack3;

import Pack2.IConexion;

public class ConexionMysql implements IConexion {

    private String host;
    private String puerto;
    private String usuario;
    private String contrasena;

    public ConexionOracle(){
        this.host = "localhost";
        this.puerto = "1234";
        this.usuario = "admin";
        this.contrasena = "133";

    }
    public void conectar(){
        System.out.println("Se Conecto a MySQL");

    }
    public void desconectar(){
        System.out.println("Se Desconecto de MySQL");

        public String toString(){
            return "Conexion MySQL [Host= " + host + ", Puerto= "+ puerto + ",Usuario= "+ usuario + ", Contrasena= " + contrasena + "]";

        }

    }
}
