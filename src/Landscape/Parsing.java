package Landscape;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Parsing {
	static ArrayList<String> list = new ArrayList<String>();
	static ArrayList<String> address = new ArrayList<String>();	
	
	public static String[] str;
	public void parsing() {
//	public static void main(String[] args) {
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("C:\\WebCrawling\\(1��)����Ʈ(�Ÿ�)_�ǰŷ���_20220322.csv"));
			String line;
			while ((line = br.readLine()) != null) {
				list.add(line);
				str = line.split(",");
				address.add(str[11]);
			}
						
						
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}


}