package Exercising;

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
	static HashSet<String> address = new HashSet<String>();
	
	
	public static String[] str;
	public static Object[] arr;
//	public void parsing() {
	public static void main(String[] args) {
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("C:\\WebCrawling\\(1��)����Ʈ(�Ÿ�)_�ǰŷ���_20220322.csv"));
			String line;
			while ((line = br.readLine()) != null) {
				list.add(line);
				str = line.split(",");
				address.add(str[11]);
			}
			
			arr =address.toArray();
//			System.out.println(Arrays.toString(arr)); //[õȣ��� 1077, ȭ���18�� 24, ���ѷ�26���� 3, �������24�� 16, ����� 31, ������ 125, ������7�� 76, ������56�� 64, ���Ϸ� 28, �󵵷�15�� 131, �ż���3�� 23, ������3�� 32, ���� 82, �ø��ȷ�70�� 61, ����õ�� 103, �幮�� 141, ���ǰ�����1�� 44
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}


}