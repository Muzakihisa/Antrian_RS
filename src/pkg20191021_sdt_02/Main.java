package pkg20191021_sdt_02;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static Queue q = new Queue (100);

	public static void process(String argA)
	{
		if (argA.equals("1"))
		{
			System.out.print("Nama: ");
			q.enqueue(sc.nextLine());
			System.out.println("Berhasil!\n");
		}
		
		else if (argA.equals("2"))
		{
			System.out.println("Giliran " + q.dequeue() + "\n");
		}
		
		else System.err.println("Input tidak valid!\n");
		
	}
	
	public static void main(String[] args) {		
		System.out.println("Antrian RS\n[1] Tambah Antrian\n[2] Antrian Berikutnya\n");

		while (true)
		{
			System.out.print("> ");
			String userInput = sc.nextLine();
			
			process(userInput);
		}
		
	}

}
