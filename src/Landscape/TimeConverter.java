package Landscape;
public class TimeConverter {

	public static String TimeConverter (String input) {
		
		String time=input.replace(" ", "");
		if(time.contains("�ð�")) {
			String[] str = time.split("�ð�");
			int sigan=Integer.parseInt(str[0])*60;
			System.out.println(sigan);
					
			int bun = Integer.parseInt(str[1].split("��")[0]);
			System.out.println(bun);
			int timeconverter = sigan + bun;
			time = ""+timeconverter;
		} else {
			String[] str2 = time.split("��");
			time = str2[0];
		}		
		return time;
	}
		
}
