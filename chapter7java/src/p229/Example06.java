package p229;
import java.io.*;

public class Example06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		try {
			bis = new BufferedInputStream(new FileInputStream("example.txt"));
			bos = new BufferedOutputStream(new FileOutputStream("des"));
			int data;
			while ((data = bis.read()) != -1) {
				bos.write(data);
			} 
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error");
		}finally {
			if(bis != null) {
				try {
					bis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(bos != null) {
				try {
					bos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

}
