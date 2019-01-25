package p225;
import java.io.*;

public class Example03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OutputStream out = null;
		try {
			out = new FileOutputStream("example.txt", true);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String str = "欢迎您！";
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
