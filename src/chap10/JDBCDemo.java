package chap10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCDemo {

    public static void main(String[] args) {
        new JDBCDemo().findAll();
        new JDBCDemo().createEmployee();
    }

    public void findAll(){

        String path = "C:\\Users\\TMY\\Desktop\\Java React Training\\training.db";
        Statement stmt = null;
        try{
            Connection conn = DriverManager.getConnection("jdbc:sqlite:" + path); //change the db name
            stmt = conn.createStatement();
            String sql = "SELECT * FROM employee";

            //ResultSet only for Select stat
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                System.out.println(rs.getString("name"));
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public Statement getConn(){
        String path = "C:\\Users\\TMY\\Desktop\\Java React Training\\training.db";
        Statement stmt = null;

        try{
            Connection conn = DriverManager.getConnection("jdbc:sqlite:" + path); //change the db name
            stmt = conn.createStatement();

            //ResultSet only for Select stat
//            ResultSet rs = stmt.executeQuery(sql);
//            while(rs.next()){
//                System.out.println(rs.getString("name"));
//            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public void createEmployee(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a name");
        String name = scanner.next();
        System.out.println("Please enter a age");
        int age = scanner.nextInt();

        try{
            Statement stmt = getConn();
            String sql = "INSERT INTO employee(name, age) VALUES('"+name+"', '"+age+"')";
            stmt.execute(sql);

        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

    //update
    public void updateEmployee(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a name");
        String name = scanner.next();
        System.out.println("Please enter a id");
        int id = scanner.nextInt();

        try{
            Statement stmt = getConn();
            String sql = "UPDATE employee SET name = '" + name + "'WHERE id = " + id;
            stmt.execute(sql);

        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

    public void deleteEmployee(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a id");
        int id = scanner.nextInt();

        try{
            Statement stmt = getConn();
            String sql = "DELETE from employee WHERE id = " + id;
            stmt.execute(sql);

        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

}
