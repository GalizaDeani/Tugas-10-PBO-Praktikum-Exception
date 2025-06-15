/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.*;
/**
 *
 * @author galiz
 */
public class Percobaan8 {
    public void methodA (){
        System.out.println("Method A");
    }
    public void methodB () throws IOException 
    {
        System.out.println(20/0);
        System.out.println("Method B");
    }
}
class Utama 
{
    public static void main(String[] args) 
    {
        Percobaan8 o=new Percobaan8();
        o.methodA();
        try 
        {
            o.methodB();
        }
        catch (Exception e) 
        {
            System.out.println("Error di Method B");
        }
        finally
        {
            System.out.println("Ini selalu dicetak");
        };
        
    }
}
