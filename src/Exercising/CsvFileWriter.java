package Exercising;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class CsvFileWriter {

	public static void csv(String input) {
		String filePath = "C:\\WebCrawling/traffic.csv";
			
		
		File file = null;
		BufferedWriter bw =null;
		String NewLine = System.lineSeparator();
		
		try {
			file = new File(filePath);
			
			//��� ���� �� �ֵ��� true�� ����
			bw = new BufferedWriter(new FileWriter(file, true));
			bw.newLine();
//			bw.write("��¥, ����� ��ü�ӵ�(km/h), ���� ��ü�ӵ�(km/h)");
//			bw.newLine();
			bw.write(input);
			bw.flush();
			bw.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
