package p223;
import java.io.*;

public class Example01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream in = null;
		try {
			in = new FileInputStream("example.txt");
			int b = 0;
			char a;
			while (true) {
				b = in.read();
				if (b == -1) {
					break;
				}
				System.out.print(b);
				a = (char)b;
				System.out.println(a);
			} 
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error");
		}finally {
			try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
