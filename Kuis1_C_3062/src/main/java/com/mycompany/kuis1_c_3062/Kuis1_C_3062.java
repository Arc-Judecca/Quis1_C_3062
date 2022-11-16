/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.kuis1_c_3062;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 *
 * @author Judecca_GilangFibarkah_21103062 
 */
public class Kuis1_C_3062 {

    public static void main(String[] args) {
        Nelayan_3062 n1 = new Nelayan_3062();
        Nelayan_3062 n2 = new Nelayan_3062();
        Dokter_3062 d1 = new Dokter_3062();
        Dokter_3062 d2 = new Dokter_3062();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
        try {
            System.out.println("=========== INPUT DATA NELAYAN ===========");
            System.out.println("======== DATA NELAYAN 1 ========");
            System.out.print("NIK : ");
            n1.nik = br.readLine();
            System.out.print("Nama : ");
            n1.nama = br.readLine();
            System.out.print("Umur : ");
            n1.umur = Integer.parseInt(br.readLine());
            System.out.print("Alamat : ");
            n1.alamat = br.readLine();
            System.out.print("Jml Berat Ikan : ");
            n1.jmlBeratIkan = Integer.parseInt(br.readLine());
            System.out.print("Jml Pakai Solar : ");
            n1.jmlSolar = Integer.parseInt(br.readLine());
          
            System.out.println();
            System.out.println("======== DATA NELAYAN 2 ========");
            System.out.print("NIK : ");
            n2.nik = br.readLine();
            System.out.print("Nama : ");
            n2.nama = br.readLine();
            System.out.print("Umur : ");
            n2.umur = Integer.parseInt(br.readLine());
            System.out.print("Alamat : ");
            n2.alamat = br.readLine();
            System.out.print("Jml Berat Ikan : ");
            n2.jmlBeratIkan = Integer.parseInt(br.readLine());
            System.out.print("Jml Pakai Solar : ");
            n2.jmlSolar = Integer.parseInt(br.readLine());
            
            System.out.println("=========== DATA NELAYAN KESELURUHAN ===========");
            n1.DataNelayan();
            System.out.println();
            
            n2.DataNelayan();
            System.out.println("");
            
            System.out.println("");
            System.out.println("=========== INPUT DATA DOKTER ===========");
            System.out.println("======== DATA DOKTER 1 ========");
            System.out.print("NIK : ");
            d1.nik = br.readLine();
            System.out.print("Nama : ");
            d1.nama = br.readLine();
            System.out.print("Umur : ");
            d1.umur = Integer.parseInt(br.readLine());
            System.out.print("Alamat : ");
            d1.alamat = br.readLine();
            System.out.print("Jml Pasien : ");
            d1.jmlPasien = Integer.parseInt(br.readLine());
            System.out.print("Jml Obat : ");
            d1.jmlObat = Integer.parseInt(br.readLine());
        
            System.out.println();
            System.out.println("======== DATA DOKTER 2 ========");
            System.out.print("NIK : ");
            d2.nik = br.readLine();
            System.out.print("Nama : ");
            d2.nama = br.readLine();
            System.out.print("Umur : ");
            d2.umur = Integer.parseInt(br.readLine());
            System.out.print("Alamat : ");
            d2.alamat = br.readLine();
            System.out.print("Jml Pasien : ");
            d2.jmlPasien = Integer.parseInt(br.readLine());
            System.out.print("Jml Obat : ");
            d2.jmlObat = Integer.parseInt(br.readLine());
       
            
            System.out.println("=========== DATA DOKTER KESELURUHAN ===========");
            d1.DataDokter();
            System.out.println();
            
            d2.DataDokter();
            System.out.println("");

        } catch (IOException eox) // menangkap kesalahan
        {
            System.out.println(eox);
        }
    }

    }

