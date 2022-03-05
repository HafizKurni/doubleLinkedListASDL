import java.util.Scanner;
public class Double2LinkedList extends MainDoubleLinkedList {
	Node head;
	Node tail;
	int length;
	boolean flag;
	class Node {
	  int data;
	  Node prev;
	  Node next;
	  Node(int d) {
		data = d;
	  	}
	  }
	public boolean isEmpty() {
		return length == 0;
	}
	public int length() {
		return length;
	}
// 	Method menambah tambah data
	public void addFirst(char data) {
		Node newNode = new Node(data);
		if (isEmpty()) {
			tail = newNode;
		} else {
			head.prev = newNode;
		}
		newNode.next = head;
		head = newNode;
		length++;
	}
	public void add(int position, int data) {
		Node node = new Node(data);
		if (position == 0) {
			node.next = head;
			head = node;
		} else {
			Node prev = head;
			int count = 1;
			while (count < position) {
				prev = prev.next;
				count++;
			}
			Node current = prev.next;
			prev.next = node;
			node.next = current;
		}
	}
	public void addLast(int data) {
		Node newNode = new Node(data);
		Node tail = head;
		newNode.next = null;
		if (head == null) {
			newNode.prev = null;
			head = newNode;
			return;
		}
		while (tail.next != null) {
			tail = tail.next;
		}
		tail.next = newNode;
		newNode.prev = tail;
	}
//Method Hitung Bilangan Node
    int countOfNode(Node head) {
		int count = 0;
		while (head != null) {
			head = head.next;
			count++;
		}
		return count;
	}
//Method Hapus Data Awal
    public void removeFirst() {
		Node node = head.next;
		node.prev = null;
		head = node;
	}
// Method Hapus Data Tengah
    Node removeMid(Node head) {
		if (head == null) {
			return head;
		}
		if (head.next == null) {
			return null;
		}
		Node copyHead = head;
		int count = countOfNode(head);
		int mid = count / 2;
		while (mid-- > 1) {
			head = head.next;
		}
		head.next = head.next.next;
		return copyHead;
	}
//Method Hapus Data Akhir
    public Node removeLast() {
		if (head == null) {
			return null;
		}
		if (head.next == null) {
			return null;
		}
		Node second_last = head;
		while (second_last.next.next != null) {
			second_last = second_last.next;
		}
		second_last.next = null;

		return head;
	}	
//method pencarian data
	public boolean find(int data) {
	        flag = false;
		Node n = head;
		while (n!= null) {
			if (n.data == data) {
			flag = true;
			break;
		}
		n = n.next;
	}
	return flag;
	}
//method pengubahan data
	public void replace(Node node, int data) {
		Node current = head;
		Node prev = null;

		while (current != null && node >= 0) {
			node--;
			prev = current;
			current = current.next;
		}
		if (prev != null)
			prev.data = data;
		System.out.println("DATA TELAH BERHASIL DIUBAH");
	}
//Method Print LinkedList
    public void printList(boolean asc) {
		Node n = null;
		if (asc)
			n = head;
		else
			n = tail;
		System.out.print("[ ");

		while (n != null) {
			System.out.print(n.data + " ");
			if (asc)
				n = n.next;
			else
				n = n.prev;
		}
		System.out.println("]");
	}
//Menu Utama
    public void manual() {
		System.out.println("\n[----------Berada di Pilihan Awal Manual----------]");
		System.out.println("1. Tambah Data");
		System.out.println("2. Hapus Data");
		System.out.println("3. Pencarian/Pengubahan Data");
		System.out.println("4. Kembali");
		System.out.print("Silakan pilih antara [1/2/3/4] : ");
		Scanner input = new Scanner(System.in);
		int pilih = input.nextInt();
		switch (pilih) {
		case 1:
			menuPenambahanNode();
			break;
		case 2:
			menuPenghapusanNode();
			break;
		case 3:
			menu_Pencarian_penghapusan_data();
			break;
		default:
			menuUtama();
		}
	}
//Menu Penambahan Data
	public void menuPenambahanNode() {
		Scanner input = new Scanner(System.in);
		System.out.println("\n[------------PILIHAN TAMBAH DATA NODE----------]");
		System.out.println("1. Tambah Data Awal");
		System.out.println("2. Tambah Data Tengah");
		System.out.println("3. Tambah Data Akhir");
		System.out.println("4. Cetak Data");
		System.out.println("5. Kembali");
		System.out.print("Silakan pilih antara [1/2/3/4/5] : ");
		int pilih = input.nextInt();
		boolean x = true;
		switch (pilih) {
		case 1:
			System.out.println("\nMasukan Nilai Data Awal");
			System.out.println("Masukan Nilai Data 0 Untuk Berhenti ");
			for (int i = 0; i <= i + 1; i++) {
				System.out.print("Masukan Data Ke " + (i + 1) + " : ");
				int dataMasuk = input.nextInt();
				if (dataMasuk == 0) {
					menuPenambahanNode();
					break;
				}
				addFirst(dataMasuk);
			}
		case 2: {
			System.out.println("Masukan Nilai Data Tengah");
			int pos;
			int value;
			while (x == true) {
			System.out.print("Masukkan posisi yang ingin ditambah : ");
			pos = input.nextInt();
			System.out.print("Masukkan data yang ingin ditambah : ");
			value = input.nextInt();
			add(pos - 1, value);
			System.out.print("Kembali? (y/n)");
			String lanjut = input.next();
			if ((lanjut.equalsIgnoreCase("y"))) {
				menuPenambahanNode();
				break;
			}
		    }
		}
			break;
		case 3:
			System.out.println("Masukan Nilai Data Akhir");
			System.out.println("Masukan Nilai Data 0 Untuk Berhenti ");
			int panjang = countOfNode(head);
			for (int i = 0; i <= i + 1; i++) {
				System.out.print("Masukan Data  " + (panjang + 1) + " : ");
				int dataMasuk = input.nextInt();
				if (dataMasuk == 0) {
					menuPenambahanNode();
					break;
				}
				addLast(dataMasuk);
				panjang++;
			}
		case 4: {
			printList(true);
			System.out.print("Kembali? (y/n)");
			String yesNo = input.next();
			menuPenambahanNode();
			break;
		}
		case 5:
			manual();
			break;
		default:
			System.out.print("Silakan pilih antara [1/2/3/4/5] : ");
			menuPenambahanNode();
		}
	}
//Menu Penghapus Data
	public void menuPenghapusanNode() {
		Scanner input = new Scanner(System.in);

		System.out.println("\n[----------PILIHAN HAPUS DATA NODE-----------]");
		System.out.println("1. Hapus Data Awal");
		System.out.println("2. Hapus Data Tengah");
		System.out.println("3. Hapus Data Akhir");
		System.out.println("4. Cetak Data");
		System.out.println("5. Kembali");
		System.out.print("Silakan pilih antara [1/2/3/4/5] : ");
		int pilih = input.nextInt();

		boolean x = true;
		switch (pilih) {
		case 1:
			while (x == true) {
				System.out.print("Apakah anda yakin ingin menghapus data pertama? (y/n)");
				String yesNo = input.next();
				if (yesNo.equalsIgnoreCase("y")) {
					removeFirst();
				} else {
					menuPenghapusanNode();
					break;
				}
			}
		case 2: {
			System.out.print("Apakah anda yakin ingin menghapus data tengah? (y/n)");
			String yesNo2 = input.next();
			if (yesNo2.equalsIgnoreCase("y")) {
				removeMid(head);
			} else {
				menuPenghapusanNode();
				break;
			}
		}
		case 3:
			while (x == true) {
				System.out.print("Apakah anda yakin ingin menghapus data terakhir? (y/n)");
				String yesNo1 = input.next();
				if (yesNo1.equalsIgnoreCase("y")) {
					removeLast();
				} else {
					menuPenghapusanNode();
					break;
				}
			}
		case 4: {
			printList(true);
			System.out.print("Kembali?");
			String yesNo = input.next();
			menuPenghapusanNode();
			break;
		}
		case 5:
			manual();
			break;
		default:
			System.out.print("Silakan pilih antara [1/2/3/4/5]");
			menuPenghapusanNode();
		}

	}
//Menu Pencarian dan Pengubahan Data Node 	
	public void menu_Pencarian_penghapusan_data() {
		Scanner input = new Scanner(System.in);

		System.out.println("\n[-----PILIHAN PENCARIAN DAN PENGHAPUSAN DATA NODE-----]");
		System.out.println("1. Cari Data");
		System.out.println("2. Ubah Data");
		System.out.println("3. Cetak Data");
		System.out.println("4. Kembali");
		System.out.print("Silakan pilih antara [1/2/3/4] : ");
		int pilih = input.nextInt();

		boolean x = true;
		switch (pilih) {
		case 1:
			System.out.print("Masukkan data yang ingin dicari : ");
			int pencarian = input.nextInt();
			find(pencarian);
			if(flag == true){
				System.out.print("Data yang dicari DITEMUKAN");
			}else{
				System.out.print("Data yang dicari TIDAK DITEMUKAN");
			}
			menu_Pencarian_penghapusan_data();
			break;
		case 2: 
			System.out.print("Masukkan data ke berapa yang ingin diubah :");
			int dataKe = input.nextInt();
			System.out.print("Masukan nilai data yang di inginkan :");
			int ubah = input.nextInt();
			replace(dataKe-1, ubah);
			menu_Pencarian_penghapusan_data()
			break;
		case 3: {
			printList(true);
			System.out.print("Kembali?");
			String yesNo = input.next();
			menu_Pencarian_penghapusan_data()
			break;
		}
		case 4:
			manual();
			break;
		default:
			System.out.print("Silakan pilih antara [1/2/3/4]");
			menu_Pencarian_penghapusan_data()
		}

	}
}
