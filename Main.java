public class Main {
	public static void main(String[] args) {
		Table tbl1 = new Table(5);
		tbl1.insert(0);
		tbl1.insert(0);
		tbl1.insert(2);
		tbl1.insert(2);
		tbl1.insert(3);
		tbl1.print();
		try{tbl1.insert(12);} catch(Exception err) {System.out.println("yay!");}
		System.out.println(tbl1.search(3) == 4);
		System.out.println(tbl1.search(12) == -1);
	}
}