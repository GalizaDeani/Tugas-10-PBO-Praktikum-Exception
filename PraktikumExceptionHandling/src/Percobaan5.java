/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author galiz
 */
public class Percobaan5 {
    public static void main(String[] args) {
        int bil=10;
        
        try 
        {
            System.out.println(bil/0);
        }
        catch (ArithmeticException e) 
        {
            System.out.println("Pesan error:");
            System.out.println(e.getMessage());
            System.out.println("Info stack trace:");
            e.printStackTrace();
            e.printStackTrace(System.out);
        }
        catch (Exception e) 
        {
            System.out.println("Ini menghandle error yang terjadi");
        }
    }
}
