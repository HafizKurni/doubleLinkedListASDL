import java.util.Scanner;

public class MainDoubleLinkedList{

     public static void main(String[] args){
         Double2LinkedList lList = new Double2LinkedList();

         Scanner input = new Scanner(System.in);
         int pilih = input.nextInt();

         if(pilih == 1){
             lList.manual();
         }else{
             lList.pustaka(); // Belum ada function nya
         }

         

     
     
     }
}