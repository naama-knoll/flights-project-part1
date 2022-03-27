package daoPackage;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public interface DAO<T> {
    public String url="//localhost:5432/FLIGHTS_MANAGEMENT";
    public Repository repository =new Repository();
    public Connection connection= repository.getConnection(url);
    public Statement stm=repository.getStatement();

    public T get(long id);
    public List getAll();
    public boolean add(T t);
    public boolean remove(T t);
    public boolean update(T t);

    //close all the connections
    public default void close(){
        try {
            connection.close();
            stm.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
