package p224;
import java.io.*;

public class Example02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "传智播客";
		
		FileOutputStream out = null;
		try {
			out = new FileOutputStream("example.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		byte[] b = str.getBytes();
		for(int i = 0; i < b.length; i++) {
			try {
				out.write(b[i]);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
