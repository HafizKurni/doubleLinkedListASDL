package doubleLinkedListASDL;
import java.util.Scanner;
import java.util.LinkedList;
public class MainDoubleLinkedList{
     static LinkedList<Integer> lListP = new LinkedList<>();
     static void menuUtama() {
		Scanner input = new Scanner(System.in);
		System.out.println("\n[--------Pilih Cara Pengerjaan----------]");
		System.out.println("1. Secara Manual ");
		System.out.println("2. Secara Pustaka ");
		System.out.print("Silakan pilih antara [1/2] : ");
		int pilihUtama = input.nextInt();
		if (pilihUtama == 1) {
			Double2LinkedList lList = new Double2LinkedList();
			lList.manual();
		} else {
			menuPustaka();
		}
	}
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
			     tambahData();
		     case 2:
			     hapusData();
		     case 3:
			     cariTukarData();
		     default:
			     menuUtama();
		}

	static void tambahData() {
		Scanner input = new Scanner(System.in);
		boolean x = true;
		System.out.println("\n[--------------------------------]");
		System.out.println("**PILIHAN TAMBAHAN DATA NODE**");
		System.out.println("1. Tambah Data Awal");
		System.out.println("2. Tambah Data Tengah");
		System.out.println("3. Tambah Data Akhir");
		System.out.println("4. Cetak Data");
		System.out.println("5. Kembali");
		System.out.print("Silakan pilih antara [1/2/3/4/5] : ");
		int pilih1 = input.nextInt();
		switch (pilih1) {
		case 1:
			System.out.println("\n[----Penambahan Data---]");
			System.out.println("Masukan Nilai Data Awal");
			System.out.println("Masukan Nilai Data 0 Untuk Berhenti ");
			while (x == true) {
				for (int i = 0; i < i + 1; i++) {
					System.out.print("DATA KE-" + (i + 1) + ": ");
					int dataInput = input.nextInt();
					if (dataInput == 0) {
						x = false;
						break;
					}
					lListP.addFirst(dataInput);
				}
			}
			tambahData();
			break;
		case 2:
			while (x == true) {
				System.out.println("\n[--------------------------------]");
				System.out.println("Masukan Nilai Data Tengah");
				System.out.println("Memasukan Nilai Data 0 Untuk Berhenti ");
				int ukuran = lListP.size();
				int mid = ukuran / 2;
				for (int i = 0; i < i + 1; i++) {
					System.out.print("DATA KE-" + (mid+1) + ": ");
					int dataInput = input.nextInt();
					if (dataInput == 0) {
						x = false;
						tambahData();
						break;
					}
					lListP.add(mid,dataInput);
					mid++;
				}
			}
			tambahData();
			break;
		case 3:
			System.out.println("\n[--------------------------------]");
			System.out.println("Masukan Nilai Data Akhir");
			System.out.println("Memasukan Nilai Data 0 Untuk Berhenti ");
			int ukuran = lListP.size();
			while (x == true) {
				for (int i = 0; i < i + 1; i++) {
					System.out.print("DATA KE-" + (ukuran+1) + ": ");
					int dataInput = input.nextInt();
					if (dataInput == 0) {
						x = false;
						break;
					}
					lListP.add(dataInput);
					ukuran++;
				}
			}
			tambahData();
			break;
		case 4:
			System.out.print(lListP);
			System.out.print("\nKembali? (y)");
			String yesNo = input.next();
			tambahData();
			break;
		default:
			menuPustaka();
		}
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
					hapusData();
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
					hapusData();
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
					hapusData();
					break;
				}
			}
			break;
		case 4:
			System.out.print(lListP);
			System.out.print("Kembali? (y)");
			String yesNo = input.next();
			hapusData();
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
         menuUtama();
     }
}
