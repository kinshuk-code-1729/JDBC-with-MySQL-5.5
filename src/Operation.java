
import java.sql.*;
import java.util.Scanner;

public class Operation extends DBCON{

    void insert() {
        try {
//            int id = 6;
//            String name = "Muskan";
//            int age = 21;
//            String gender = "Female";
//            String course = "AIML";
//            int fees = 57000;
            Scanner s = new Scanner(System.in);
            System.out.print("Enter Student ID : ");
            int id = s.nextInt();
            
            System.out.print("Enter Student Name : ");
            String name = s.next();
            
            System.out.print("Enter Student Age : ");
            int age = s.nextInt();
            
            System.out.print("Enter Student Gender : ");
            String gender = s.next();
            
            System.out.print("Enter Student Course : ");
            String course = s.next();
            
            System.out.print("Enter Student Fees : ");
            int fees = s.nextInt();
            
            String insertquery = "INSERT INTO STUDENT VALUES(?,?,?,?,?,?);";
            
            PreparedStatement ps = con.prepareStatement(insertquery);
            ps.setInt(1,id);
            ps.setString(2,name);
            ps.setInt(3,age);
            ps.setString(4,gender);
            ps.setString(5,course);
            ps.setInt(6,fees);
            
            ps.executeUpdate();
            
            System.out.println("Row inserted successfully.....");
        }
        catch (Exception i) {
            System.out.println("Cannot insert the data...."+i);
        }
    }

    void delete() {
        try {
            Scanner s = new Scanner(System.in);
            System.out.print("Enter ID which you want to remove .... ? : ");
//            int id = 6;
            int id = s.nextInt();
            String delquery = "DELETE FROM STUDENT WHERE sid="+id;
            PreparedStatement ps2 = con.prepareStatement(delquery);
            ps2.executeUpdate();
            
            System.out.println("Row deleted successfully.....");
        } 
        catch (Exception d) {
            System.out.println("Cannot delete the row"+d);
        }
    }

    void truncate() {
        try {
            String trunquery = "TRUNCATE STUDENT";
            PreparedStatement ps3 = con.prepareStatement(trunquery);
            ps3.executeUpdate();
            
            System.out.println("Table truncated successfully.....");
        } 
        catch (Exception t) {
            System.out.println("Cannot empty table........."+t);
        }
    }

    void update() {
        try {
//            String name = "Manish";
//            String course="MTECH";
            Scanner s = new Scanner(System.in);
            System.out.print("Whose updation ?? : ");
            String name = s.next();
            System.out.print("What is updated course ? : ");
            String course = s.next();
            String updatequery = "UPDATE STUDENT SET scourse='"+course+"' WHERE sname='"+name+"'";
            PreparedStatement ps4 = con.prepareStatement(updatequery);
            ps4.executeUpdate();
            
            System.out.println("Record updated successfully.....");
        } 
        catch (Exception u) {
            System.out.println("Cannot update the record"+u);
        }
    }

    void view() {
        try {
            String viewquery = "SELECT * FROM student"; // all records
//            by int search
//            int id = 4;
//            String viewquery = "SELECT * FROM student where sid="+id;
//            String course = "IT";
            Statement st = con.createStatement();
//            String viewquery = "SELECT * FROM student where scourse='"+course+"'";
            ResultSet rs = st.executeQuery(viewquery);
            while(rs.next()){
                System.out.print("| "+rs.getInt(1)+" |");
                System.out.print(" "+rs.getString(2)+" |");
                System.out.print(" "+rs.getInt(3)+" |");
                System.out.print(" "+rs.getString(4)+" |");
                System.out.print(" "+rs.getString(5)+" |");
                System.out.println(" "+rs.getInt(6)+" |");
                System.out.println("+----------------------------------------------+");
        }
        }
        catch(Exception v){
            System.out.println("Cannot fetch the data "+v);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Operation obj = new Operation();
        while(true){
            System.out.println("PRESS 1 for INSERT .......");
            System.out.println("PRESS 2 for DELETE .......");
            System.out.println("PRESS 3 for TRUNCATE .......");
            System.out.println("PRESS 4 for UPDATE .......");
            System.out.println("PRESS 5 for VIEW .......");
            System.out.println("PRESS 6 for EXIT .......");
            
            System.out.print("Enter your choice : ");
            int choice = sc.nextInt();
            
            switch(choice){
                case 1 :
                    obj.insert();
                    break;
                case 2 :
                    obj.delete();
                    break;
                case 3 :
                    obj.truncate();
                    break;
                case 4 :
                    obj.update();
                    break;
                case 5 :
                    System.out.println("+----------------------------------------------+");
                    System.out.println("|sid| sname | sage | sgender | scourse | sfees |");
                    System.out.println("+----------------------------------------------+");
                    obj.view();
                    break;
                case 6 :
                    System.exit(0);
                default :
                    System.out.println("Invalid Choice Detected !!!!!!");
            }
        }
    }
}
