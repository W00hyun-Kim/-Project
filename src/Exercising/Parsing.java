package Exercising;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Parsing {
	static ArrayList<String> list = new ArrayList<String>();
	static ArrayList<String> address = new ArrayList<String>();
	
   public void parsing() {// ���� �о����
	  
	  //https://m.map.naver.com/
		try {
			BufferedReader br = new BufferedReader(new FileReader("C:\\WebCrawling\\����Ư���� �������� ����Ʈ ����_20220321.csv"));

			String line;
			while ((line = br.readLine()) != null) {
				list.add(line);
				String[] str = line.split(",");
				address.add(str[3]);
			}
						

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		

		
	}

}