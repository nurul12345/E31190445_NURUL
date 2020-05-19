/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e31190445.nurul;
import java.util.Stack;
// import library stack

/**
 *
 * @author NURUL FATIMAH
 */
public class E31190445NURUL {
    public static void main(String[] args) {
      Stack kotor = new Stack();
      //deklarasi objek Stack kotor
      Stack bersih = new Stack();
      //deklarasi objek Stack kotor
      
      for (int i=1; i<=5; i++) { // perulangan for
          kotor.push("pakaian" + i); //proses memasukkan data pada stack
      }
        System.out.println("SEBELUM DI CUCI" + "\nJumlah pakaian kotor :" + kotor.size() +"\nJumlah pakaian bersih :" +bersih.size() + "\ntumpukan pakaian bersih :");
        //menampilkan jumlah pakaian kotor
        
      for(int i=1; i<=5; i++) { //perulangan for
          System.out.println(kotor.peek());
          bersih.push(kotor.pop()); // proses pengeluaran data pada stack
      }
      System.out.println("SETELAH DI CUCI" + "\nJumlah pakaian kotor :" + kotor.size() +"\nJumlah pakaian bersih :" +bersih.size() + "\ntumpukan pakaian bersih :");
      //menampilkan jumlah pakaian bersih dan pakaian yang telah di cuci
      
      for (int i=4; i>=0; i--){
          System.out.println(bersih.elementAt(i));
      }
    }
    
}
