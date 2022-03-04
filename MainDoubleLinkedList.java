import java.util.Scanner;

public class MainDoubleLinkedList{
     static LinkedList<Integer> lListP = new LinkedList<>();
	
	
     static void menuPustaka() {
     Scanner input = new Scanner(System.in);
	     System.out.println("\n[--------------------------------]");
	     System.out.println("*****Berada di Pilihan Awal Manual*****");
	     System.out.println("1. Tambah Data");
	     System.out.println("2. Hapus Data");
	     System.out.println("3. Pencarian/Pengubahan Data");
	     System.out.println("4. Kembali");
	     System.out.print("Silakan pilih antara [1/2/3/4] : ");

	     int pilih = input.nextInt();
	     boolean x = true;
	     switch (pilih) {
		     case 1:
			     //tambahData();
		     case 2:
			     hapusData();
		     case 3:
			     //cariTukarData();
		}

	
	
	
	
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
					hapusData()
					break;
				}
			}
			break;
		case 2:
			while (x == true) {
				System.out.println("[----Penghapusan Data---]");
				System.out.println("Yakin menghapus data Tengah? (y/n)");
				String yesNo2 = input.next();
				
				int ukuran = lListP.size();
				int mid = ukuran/2;

				if (yesNo2.equalsIgnoreCase("y")) {
					lListP.remove(mid);
				} else {
					hapusData()
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
					hapusData()
					break;
				}
			}
			break;
		case 4:
			System.out.print(lListP);
			System.out.print("Kembali? (y)");
			String yesNo = input.next();
			hapusData()
			break;
		default:
			menuPustaka();
			break;
		}
     }
	     
	static void cariTukarData() {
		Scanner input = new Scanner(System.in);
		System.out.println("\n[--------------------------------]");
		System.out.println("**PILIHAN PENCARIAN DAN PENGHAPUSAN DATA NODE**");
		System.out.println("1. Cari Data");
		System.out.println("2. Ubah Data");
		System.out.println("3. Cetak Data");
		System.out.println("4. Kembali");
		System.out.print("Silakan pilih antara [1/2/3/4] : ");
		int pilih3 = input.nextInt();

		switch (pilih3) {
		case 1:
			System.out.println("\n[----Pencarian Data---]");
			System.out.print("Masukkan data yang ingin dicari : ");
			int pencarian = input.nextInt();
			int hasil = lListP.get(pencarian);
			if (hasil < lListP.size()) {
				System.out.println("Data yang dicari ditemukan");
				System.out.println(lListP.get(pencarian-1));
			} else {
				System.out.print("[Data yang dicari tidak ditemukan]");
				System.out.print("\nKembali? (y)");
				String yesN = input.next();
				cariTukarData();
				break;
			}
			cariTukarData();
			break;
		case 2: {
			System.out.print("\nMasukkan data ke berapa yang ingin diubah :");
			int dataKe = input.nextInt();
			System.out.print("Masukan nilai data yang di inginkan :");
			int ubah = input.nextInt();
			lListP.set(dataKe-1, ubah);
			cariTukarData();
			break;
		}
		case 3: {
			System.out.print(lListP);
			System.out.print("Kembali? (y)");
			String yesN = input.next();
			cariTukarData();
			break;
		}
		case 4:
			menuPustaka();
			break;
		default:
			System.out.print("Silakan pilih antara [1/2/3/4] : ");
			cariTukarData();
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
             menuPustaka(); 
         }

         

     
     
     }
}
