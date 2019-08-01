package Fnlo.Test.BreakpointResume;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author 31228
 * RandomAccessFile class Test.
 */
public class BreakpointResume {

	
	public static void main(String[] args) {
		BreakpointResume bpr = new BreakpointResume();
		bpr.write();
	}

	public void write(){
		String folderPath = getAbsolutePath();
		System.out.println(folderPath);
		File fileIn = new File(folderPath, "FileIn.txt");
		File fileOut = new File(folderPath, "FileOut.txt");
		
		byte[] byt = new byte[1];
		// the position should be presisted.
		int position = 0;
		try {
			System.out.println("start write ...");
			FileInputStream fis = new FileInputStream(fileIn);
			FileOutputStream fos = new FileOutputStream(fileOut);
			while(fis.read(byt) != -1){
				fos.write(byt);
				position ++;
				//Analog interrupt signal
				if(position == 3){
					throw new InterruptedException();
				}
			}
			
		} catch (InterruptedException e) {
			System.out.println("interrupt.");
			keepWrite(fileIn, fileOut, position);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	/**
	 * @param fileIn
	 * @param fileOut
	 * @param position <br>
	 * 		Mark of the breakpoint
	 */
	public void keepWrite(File fileIn, File fileOut, int position){
		try {
			System.out.println("waiting 10s ...");
			Thread.sleep(10 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		RandomAccessFile rafIn = null;
		RandomAccessFile rafOut = null;
		try {
			System.out.println("continue write...");
			rafIn = new RandomAccessFile(fileIn, "rw");
			rafOut = new RandomAccessFile(fileOut, "rw");
			rafIn.seek(position);
			rafOut.seek(position);
			byte[] byt = new byte[1];
			while(rafIn.read(byt) != -1){
				rafOut.write(byt);
			}
			System.out.println("write done.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				rafIn.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			try {
				rafOut.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
	}
	
	
	public String getAbsolutePath(){
		File file = new File("src/Fnlo/Test/BreakpointResume/testFile/");
		return file.getAbsolutePath();
	}
}
