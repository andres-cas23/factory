package Pack3;

import Pack2.IConexion;

public class ConexionSQL implements IConexion {

    private String host;
    private String puerto;
    private String usuario;
    private String contrasena;

    public ConexionSQL(){
        this.host = "localhost";
        this.puerto = "1234";
        this.usuario = "admin";
        this.contrasena = "123";

    }
    public void conectar(){
        System.out.println("Se Conecto a SQL");

    }
    public void desconectar(){
        System.out.println("Se Desconecto de SQL");

        public String toString(){
            return "Conexion SQL [Host= " + host + ", Puerto= "+ puerto + ",Usuario= "+ usuario + ", Contrasena= " + contrasena + "]";

        }

    }
}
