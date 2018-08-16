/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CobaOperasiString;

import java.util.Scanner;
public class praktikum2 {
    private static void tampilJudul(String identitas){
        System.out.println("Identitas : " + identitas);
        System.out.println("\nCovert Kalimat Alay Angka (Vokal Ke Angka)\n");
    }
       public static void main(String[] args){
        String identitas = "anatasya galuh risamita dewi salsadila / xrpl2 /05";
        tampilJudul(identitas);
        }
       
       private static String tampilInput(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Masukkan Kalimat : ");
            String kalimat = scanner.nextLine();
            System.out.println("Kalimat Asli : " + kalimat);
            return kalimat;
        }

   
    
        String kalimat = tampilInput();
        
        
}
