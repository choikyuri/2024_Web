package chapter20.inputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputStreamTest05 {

	public static void main(String[] args) {
        //true:������ �����ϸ� �����Ͱ� �߰��� �����
		try(FileOutputStream fos=new FileOutputStream("resource.txt", true);
			 FileInputStream fis=new FileInputStream("resource.txt")) {
			
			fos.write(71);
			fos.write(72);
			fos.write(73);
			fos.write(74);
			fos.write(75);
			
			System.out.print((char)fis.read()+" ");
			System.out.print((char)fis.read()+" ");
			System.out.print((char)fis.read()+" ");
			System.out.print((char)fis.read()+" ");
			System.out.print((char)fis.read()+" ");
			System.out.print((char)fis.read()+" ");
			System.out.print((char)fis.read()+" ");
			System.out.print((char)fis.read()+" ");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}