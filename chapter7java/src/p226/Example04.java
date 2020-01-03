package p226;
import java.io.*;

public class Example04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream in = null;
		OutputStream out = null;
		try {
			in = new FileInputStream("example.txt");
			out = new FileOutputStream("des");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error");
		}
		int data;
		long begintime = System.currentTimeMillis();
		try {
			while((data = in.read()) != -1) {
				out.write(data);
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		long endtime = System.currentTimeMillis();
		System.out.println("time: " + (endtime - begintime));
		try {
			in.close();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
