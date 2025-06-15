/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author galiz
 */
public class Percobaan11 extends Throwable {
    public Percobaan11 (String s) 
    {
        super(s);
    }
    public static void main(String[] args) {
        int position=1;
        try 
        {
            if(position>0)
            {
                throw new Percobaan11 ("Position " +position);
            }
        }
        catch (Percobaan11 e)
        {
            System.out.println("Range error: " +e.getMessage());
        }
        System.out.println("This is the last program.");
    }
}
