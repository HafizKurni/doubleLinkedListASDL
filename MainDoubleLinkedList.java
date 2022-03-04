import java.util.Scanner;

public class MainDoubleLinkedList{
     static LinkedList<Integer> lListP = new LinkedList<>();
     

     public static void main(String[] args){
         
         Scanner input = new Scanner(System.in);
          
         System.out.println("[--------Pilih Cara Pengerjaan----------]");
	    System.out.println("1. Secara Manual ");
	    System.out.println("2. Secara Pustaka ");
	    System.out.print("Silakan pilih antara [1/2] : ");
         int pilih = input.nextInt();

         if(pilih == 1){
              Double2LinkedList lList = new Double2LinkedList();
             lList.manual();
         }else{
             lList.pustaka(); // Belum ada function nya
         }

         

     
     
     }
}
