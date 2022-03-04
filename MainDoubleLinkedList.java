import java.util.Scanner;

public class MainDoubleLinkedList{
     static LinkedList<Integer> lListP = new LinkedList<>();
     static void hapusData(){
     Scanner input = new Scanner(System.in);
		System.out.println("\n[--------------------------------]");
		System.out.println("**PILIHAN HAPUS DATA NODE**");
		System.out.println("1. Hapus Data Awal");
		System.out.println("2. Hapus Data Tengah");
		System.out.println("3. Hapus Data Akhir");
		System.out.println("4. Cetak Data");
		System.out.println("5. Kembali");
		System.out.print("Silakan pilih antara [1/2/3/4/5] : ");

		int pilih2 = input.nextInt();

		boolean x = true;
		switch (pilih2) {
		case 1:
			while (x == true) {
				System.out.println("[----Penghapusan Data---]");
				System.out.println("Yakin menghapus data awal? (y/n)");
				String yesNo2 = input.next();

				if (yesNo2.equalsIgnoreCase("y")) {
					lListP.removeFirst();
				} else {
					break;
				}
			}
			break;
		case 2:
			while (x == true) {
				System.out.println("[----Penghapusan Data---]");
				System.out.println("Yakin menghapus data Tengah? (y/n)");
				String yesNo2 = input.next();

				if (yesNo2.equalsIgnoreCase("y")) {
					lListP.removeFirst();
				} else {
					break;
				}
			}
			break;
		case 3:
			while (x == true) {
				System.out.println("[----Penghapusan Data---]");
				System.out.println("Yakin menghapus data akhir? (y/n)");
				String yesNo2 = input.next();
				if (yesNo2.equalsIgnoreCase("y")) {
					lListP.removeLast();
				} else {
					break;
				}
			}
			break;
		case 4:
			lListP.toArray();
			System.out.print("Kembali? (y)");
			String yesNo = input.next();
			break;
		default:
			break;
		}
     }

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
