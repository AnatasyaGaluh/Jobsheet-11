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
        
        private static String vocal2Angka(String kalimat){
            char [][] arCovert = {{'a','4'}, {'i','1'}, {'u','2'}, {'e','3'}, {'o','0'}};
            kalimat = kalimat.toLowerCase();
            for(int i = 0; i < arCovert.length; i++)
                kalimat = kalimat.replace(arCovert[i][0], arCovert[i][i]);
            return kalimat;
        }
        String convert = vocal2Angka(kalimat);
        
        
}
