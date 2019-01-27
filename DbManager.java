/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pubquiz;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class DbManager {

    private static final String USERNAME = "sql7275406";
    private static final String PASSWORD = "BYnWtNf9Eq";
    private static final String CONN_STRING = "jdbc:mysql://sql7.freemysqlhosting.net:3306/sql7275406";
    
    private Connection conn;
    
    public Connection getConn() {
        return conn;
    }
    
    
    void Connect(){
        conn = null;
        try{
             conn = DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD) ;
             System.out.println("Connected");
             
        }catch(SQLException e){
            System.err.println(e);
        }
    }
    
    boolean insert(Team team) //wprowadza nowy rekord do tabeli
    {
        String insert;
        String name = team.getNazwa();
        int points =team.getPunkty();
        insert = "INSERT INTO Test(Nazwa, Punkty) VALUES (\""+name+"\","+points+")";
        try{
            Statement stm = (Statement) getConn().createStatement();
            stm.executeUpdate(insert);
            
         }catch(SQLException e){
           
            return false;
        }
       return true;
    }
    
    boolean Select(Team team){ //sam select w SQL wybiera określone wiersze z tabeli,
                                //w przypadku tej f. najpierw jest wyszukiwanie czy dana nazwa druż. istnieje w bazie, 
                                //jeśli nie, to do bazy jest dodawana nowa drużyna o danej nazwie,
                                //jeśli istnieje, to w bazie danych zostaje zaktualizowana il. pkt, podanej wyżej drużyny
        String name=team.getNazwa();
        String select;
        int points=0;
        select = "Select * from Test where (Nazwa=\""+name+"\")"; //* = wszystko, where = watunek gdzie nazwa=name
        try{   
            Statement stm = (Statement) getConn().createStatement(); 
            ResultSet rs = stm.executeQuery(select);//z jednej tabeli wybierane są rekordy o podanych kryteriach (where) (rezultat tej komendy wyżej)
            if(!rs.next()) //rs=wszystkie rekordy, nie ma żadnego rekordu
            {
            
                insert(team);   
                return false;
            }
            else
            {
                 points = rs.getInt("Punkty");
                 System.out.println(points);
                 points +=team.getPunkty();
                 System.out.println(points);
                 update(team,points);
                    
             
            }
         }catch(SQLException e){
            return false;
        }
        return true;
    }
    
    boolean update(Team team, int points){
        String name = team.getNazwa();
        //String update = "Update Test Set Punkty = "+points+" where Nazwa=\""+name+"\")";
        String update = String.format("Update Test Set Punkty ='%d' where Nazwa = '%s'",points,name );
        try{   
            Statement stm = (Statement) getConn().createStatement();
            stm.executeUpdate(update);
         }catch(SQLException e){
           
            return false;
        }
       return true;
    }
}
