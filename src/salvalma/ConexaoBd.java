/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salvalma;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Fernando Araujo Nascimento, Thais Andrade Couto, Juliana Ferreira Damascena, Gisele Gomes Oliveira, Alesson Silva Boges  431
 */
public class ConexaoBd {
    
    private final String URL = "jdbc:firebirdsql:localhost/3050:C:\\PADARIA.FDB";
    final private String USUARIO = "sysdba";
    final private String SENHA = "masterkey";
    
    public Connection getConnection(){
        
        try {
            
            Class.forName("org.firebirdsql.jdbc.FBDriver");
            
            return DriverManager.getConnection(URL, USUARIO, SENHA);
        
        } catch (SQLException | ClassNotFoundException ex) {
            throw new RuntimeException("Erro:\n" + ex);
        }        
    }    
}
