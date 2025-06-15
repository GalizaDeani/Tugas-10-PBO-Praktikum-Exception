/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author galiz
 */
public class Percobaan6 {
    static void demo() 
    {
        NullPointerException t;
        t=new NullPointerException("Coba Throw");
        throw t;
        
        // Baris ini tidak lagi dikerjakan;
        //System.out.println("Ini tidak lagi dicetak");
    }
    public static void main(String[] args) {
        try 
        {
            demo();
            System.out.println("Selesai");
        }
        catch (NullPointerException e) 
        {
            System.out.println("Ada pesan error:"+e);
        }
    }
}
