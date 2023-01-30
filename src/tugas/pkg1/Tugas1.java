
package tugas.pkg1;

import java.util.Scanner;



public class Tugas1 {
    static void menu (){
        Scanner input=new Scanner(System.in);
        Scanner str=new Scanner(System.in);
        int menu, cek, limit;
        String pilihan, hasil;
        
        System.out.println("=========================");
        System.out.println("=========================");
        System.out.println("Muhamad Fajar");
        System.out.println("    Muhamad Fajar");
        System.out.println("        Muhamad Fajar");
        System.out.println("    Muhamad Fajar");
        System.out.println("Muhamad Fajar");
        System.out.println("=========================");
        System.out.println("=========================");
        System.out.println("");
        System.out.println("Menu Ganjil Genap");
        System.out.println("1. Cek Ganjil Genap");
        System.out.println("2. Print Genap/Ganjil (dgn limit)");
        System.out.println("3. Exit");
        System.out.print("Pilihan :");
        menu=input.nextInt();
        switch (menu){
            case 1 :  
                    System.out.print("Masukan bilangan yang ingin dicek : ");
                    cek=input.nextInt();
                    if (cek <=0){
                        System.err.println("Invalid Input !!");
                        
                    }
                    else {
                        hasil = cekGanjilGenap(cek);
                        System.out.println(hasil); 
                    }
                    break;
            case 2 :
                    System.out.print("Pilih (Ganjil/Genap) : ");
                    pilihan=str.nextLine();
                    System.out.print("Limit : ");
                    limit=input.nextInt();
                    if ("Ganjil".equals(pilihan) || "Genap".equals(pilihan)){
                        if (limit <=0){
                        System.err.println("Input limit tidak valid !!");
                        }
                        else {
                        printGanjilGenap(limit, pilihan);
                        }
                    }
                    else {
                        System.err.println("Input pilihan tidak valid !!");
                    }
                        
                    break;
            case 3 :
                    System.out.println("===========================================");
                    System.out.println("Terima kasih sudah menggunakan program ini :)");
                    System.out.println("===========================================");
                    
                    break;
        }
    
    }
    
    static void printGanjilGenap(int limit, String pilihan){
        if ("Genap".equals(pilihan)){
            System.out.println("Print bilangan genap antara 1 - " + limit + " !!");
            for(int i=1;i<=limit;i++){
                        if (i%2==0)
                        System.out.print(i+" ");
                    }
        } 
        else {
            System.out.println("Print bilangan ganjil antara 1 - " + limit + " !!");
            for(int i=1;i<=limit;i++){
                        if (i%2==1)
                        System.out.print(i+" ");
                    }
        }
    }

    static String cekGanjilGenap(int input){
        String hasil = null;
        if (input%2 ==0){
            hasil = "Genap";
            //System.out.println("Genap");
        }
        else if (input%2 ==1){
            //System.out.println("Ganjil");
            hasil = "Ganjil";
        }
    return hasil;
    }
    
    public static void main(String[] args) {
        menu();
    }
    
}
