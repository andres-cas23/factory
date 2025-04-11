package Pack1;
import Pack2.IConexion;
import Pack3.ConexionMysql;
import Pack3.ConexionOracle;
import Pack3.ConexionPostgreSQL;
import Pack3.ConexionSQL;
import Pack3.ConexionVacia;

public class ConexionFabrica {
    public IConexion getConexion(String motor) {
        if (motor == null) {
            return new ConexionVacia();
        }
        if (motor.equalsIgnoreCase("MYSQL")) {
            return new ConexionMysql();
        }
        else if (motor.equalsIgnoreCase("ORACLE")) {
            return new ConexionOracle();
        }
        else if (motor.equalsIgnoreCase("POSTGRE")) {
            return new ConexionPostgreSQL();
        }
        else if (motor.equalsIgnoreCase("SQL")) {
            return new ConexionSQL();
            {
                return new ConexionVacia();
            }
        }
    }
}