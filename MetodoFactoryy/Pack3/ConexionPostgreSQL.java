package Pack3;

import Pack2.IConexion;

public class ConexionPostgreSQL implements IConexion {

    private String host;
    private String puerto;
    private String usuario;
    private String contrasena;

    public ConexionPostgreSQL(){
        this.host = "localhost";
        this.puerto = "1234";
        this.usuario = "admin";
        this.contrasena = "123";

    }
    public void conectar(){
        System.out.println("Se Conecto a PostgreSQL");

    }
    public void desconectar(){
        System.out.println("Se Desconecto de PostgreSQL");

        public String toString(){
            return "Conexion PostgreSQL [Host= " + host + ", Puerto= "+ puerto + ",Usuario= "+ usuario + ", Contrasena= " + contrasena + "]";

        }

    }
}
