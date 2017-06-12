/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jualbelimotor;

import java.util.Scanner;

/**
 *
 * @author ASUS-PC
 */
public class Jualbelimotor {

    public static void main(String[] args) {
        // TODO code application logic here
        motor entityObjk =new motor();
        Querymotor update = new Querymotor();
        Scanner input=new Scanner(System.in);
        String a,b,c,d,e,jwb;
        long id = 0;
        
        
         System.out.println("=============================");
        System.out.println("JUAL BELI MOTOR BANG OTONG");
        System.out.println("=============================");
        
        System.out.println("1.User Baru | 2. Edit User | 3.Delete User");
                
        System.out.print("1.User Baru...? y/t : ");jwb=input.nextLine();
        if(jwb.equals("y")) {
            System.out.print("Nama Lengkap :"); b =input.nextLine();
            System.out.print("Alamat :"); c =input.nextLine();
            System.out.print("No Telepon :"); d = input.nextLine();
            System.out.print("Merk motor :"); e =input.nextLine();
            System.out.print("ID User :"); a =input.nextLine();
            entityObjk.setIduser(a);
            entityObjk.setNama(b);
            entityObjk.setAlamat(c);
            entityObjk.setNoTelpon(d);
            entityObjk.setMerkmotor(e);
            update.Add(entityObjk);
            {update.Show();}
        } else {
            {update.Show();}
            System.out.print("2.Edit User...? y/t : ");jwb=input.nextLine();
            if(!jwb.equals("t")){
                System.out.print("ID User :"); a = input.nextLine();
                System.out.print("Nama Lengkap :");b = input.nextLine();
                System.out.print("Alamat :");c = input.nextLine();
                System.out.print("No Telepon :");d =input.nextLine();
                System.out.print("Merk motor :");e =input.nextLine();
                update.update(id, a, b, c, d, e);System.out.println("User "+a+" berhasil Dirubah");{
                update.Show();}
        } else {    
                System.out.print("3.Hapus User..? y/t : ");jwb=input.nextLine();
                if(jwb.equals("y")){
                    System.out.print("ID user :"); a = input.nextLine();
                    update.Delete(a);System.out.println("User "+a+" berhasil dihapus");{
                    update.Show();}
                    System.out.println("User "+a+" berhasil dihapus");
             }
        }
       }
    }
}