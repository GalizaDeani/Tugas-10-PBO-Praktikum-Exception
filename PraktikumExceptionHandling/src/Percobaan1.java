/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author galiz
 */
public class Percobaan1 {
    public static void main(String[] args) {
        int a[] = new int [5];
        try {
            a[5] = 100;
        } 
        catch (Exception e) 
        {
            System.out.println("Terjadi pelanggaran memory");
        }
    }
}
