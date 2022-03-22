package Exercising;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class CsvFileWriter {

	public static void csv(String input) {

		 File csv = new File("C:\\WebCrawling\\result.csv");
	        BufferedWriter bw = null; // ��� ��Ʈ�� ����
	        try {
	            bw = new BufferedWriter(new FileWriter(csv, true));
	            // csv������ ���� ���� �̾���� ��ó�� true�� �����ϰ�, ���� ���� ������� true�� �����Ѵ�

	                
	                // �� �ٿ� ���� �� ������ ���̿� ,�� �ִ´�
	                bw.write(input);
	                // �ۼ��� �����͸� ���Ͽ� �ִ´�
	                bw.newLine(); // ����
	            
	            
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                if (bw != null) {
	                    bw.flush(); // �����ִ� �����ͱ��� ���� �ش�
	                    bw.close(); // ����� BufferedWriter�� �ݾ� �ش�
	                }
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
	}
}
