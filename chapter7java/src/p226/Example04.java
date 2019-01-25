package p226;
import java.io.*;

public class Example04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream in = null;
		OutputStream out = null;
		try {
			in = new FileInputStream("C:\\Users\\yrc\\Pictures\\云字夕頭\\hello-world.png");
			out = new FileOutputStream("C:\\Users\\yrc\\Desktop\\hello.png");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error");
		}
		int len;
		long begintime = System.currentTimeMillis();
		try {
			while((len = in.read()) != -1) {
				out.write(len);
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
