import java.util.Scanner;
import java.util.Calendar;

public class DetailsVerification {
	public static boolean numCheck(String num) {
		
		int count=1;
		if(num.length()>4 ||num.length()<4) {
			count=0;
			return false;
		}
		for(int i=0;i<num.length();i++) {
			if(Character.isAlphabetic(num.charAt(i))){
				count=0;
				return false;
			}
			if(num.charAt(i)>=32 && num.charAt(i)<=47 ||num.charAt(i)>=58 && num.charAt(i)<=64) {
				count=0;
				return false;
			}
		}
		//returning
		if(count==1) {
			return true;
		}
		else {
			return false;
		}	
		
	}
	public static boolean nameCheck(String name) {
		String t="";
		int count=0;
		int val=1;
		if(name.length()>20 && name.length()<5) {
			val=0;
			return false;
		}
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)>='0'&& name.charAt(i)<='9') {
				val=0;
				return false;
			}
			if((name.charAt(i)>=33 && name.charAt(i)<=45 && name.charAt(i)==47 ) ||name.charAt(i)>=58 && name.charAt(i)<=64) {
				val=0;
				return false;
			}
			if(!(t.contains(name.substring(i,i+1)))) {
				t+=name.charAt(i);
			}
		}
		
		for(int i=0;i<t.length();i++) {
			count=0;
			for(int j=0;j<name.length();j++) {
				if(t.charAt(i)==name.charAt(j)) {
					count++;
				}
			}
			if(count>=3) {
				val=0;
				return false;
			}
		}
		//returning 
		if(val==1) {
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean dateCheck(String date) {
		int count=0;
		int val=1;
		for(int i=0;i<date.length();i++) {
			if(Character.isAlphabetic(date.charAt(i))){
				val=0;
				return false;
			}
			if(date.charAt(i)>=32 && date.charAt(i)<47 ||date.charAt(i)>=58 && date.charAt(i)<=64) {
				val=0;
				return false;
			}
		}
		
		for(int i=0;i<date.length();i++) {
			
			if(date.charAt(i)=='/') {
				count++;
			}
		}
		if(count>2 ||count<2) {
			val=0;
			return false;
		}
		String s[]=date.split("/");
		if(!(s[0].length()==2 && s[1].length()==2 && s[2].length()==4)){
			val=0;
			return false;
		}
		if(!(Integer.parseInt(String.valueOf(s[0]))<32)){
					val=0;
					return false;
				}
		if(!(Integer.parseInt(String.valueOf(s[1]))<13)){
			val=0;
			return false;
		}

		 
		int year = Calendar.getInstance().get(Calendar.YEAR);
		
		
		int yy=Integer.parseInt(s[2]);

		if((year-yy)<18 && (year-yy)>60) {
			val=0;
			return false;
		}
		//returning
		if(val==1) {
			return true;
		}
		else {
			return false;
		}
		   
		
			
		}
		
		public static boolean joinCheck(String join) {
			int val=0;
			int count=0;
			for(int i=0;i<join.length();i++) {
				if(Character.isAlphabetic(join.charAt(i))){
					val=0;
					return false;
				}
				if(join.charAt(i)>=32 && join.charAt(i)<47 ||join.charAt(i)>=58 && join.charAt(i)<=64) {
					val=0;
					return false;
				}
			}
			for(int i=0;i<join.length();i++) {
				
				if(join.charAt(i)=='/') {
					count++;
				}
			}
			if(count>2 ||count<2) {
				val=0;
				return false;
			}
			String s[]=join.split("/");
			if(!(s[0].length()==2 && s[1].length()==2 && s[2].length()==4)){
				val=0;
				return false;
			}
			if(!(Integer.parseInt(String.valueOf(s[0]))<32)){
						val=0;
						return false;
					}
			if(!(Integer.parseInt(String.valueOf(s[1]))<13)){
				val=0;
				return false;
			}

			 
			int year = Calendar.getInstance().get(Calendar.YEAR);
			
			
			int yy=Integer.parseInt(s[2]);

			if((year-yy)<18 && (year-yy)>60) {
				val=0;
				return false;
			}
			//returning
			if(val==1) {
				return true;
			}
			else {
				return false;
			}
			
		}
		
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int count = 0;
		boolean flag=false;
		while(!flag) {
			if(count>=3) {
				System.out.println("your are Wrong");
				break;
			}
			if(count==0) {
		System.out.println("Enter the Valid Emp Number");
			}
			else {
				System.out.println("Please Enter the Correct format");
			}
		String empNum=scan.next();
		flag=numCheck(empNum);
		if(flag) {
			System.out.println("Thanks for entering valid Number");
			break;
		}
		else {
			count++;
			continue;
		}
			
	}
		//Employee name checking
		flag=false;
		count=0;
		while(!flag) {
			if(count>=3) {
				System.out.println("your are Wrong");
				break;
			}
			if(count==0) {
				System.out.println("Enter Your name");
					}
					else {
						System.out.println("Please Enter the Correct format");
					}
		String empName=scan.next();
		flag=nameCheck(empName);
		if(flag) {
			System.out.println("Thanks for entering valid name");
			break;
		}
		else {
			count++;
			continue;
		}
		}
		//Employee DOB checking
		flag=false;
		count=0;
		while(!flag) {
			if(count>=3) {
				System.out.println("your are Wrong");
				break;
			}
			if(count==0) {
				System.out.println("Enter Your DOB");
					}
					else {
						System.out.println("Please Enter the Correct format");
					}
		String empDOB=scan.next();
		flag=dateCheck(empDOB);
		if(flag) {
			System.out.println("Thanks for entering valid Date");
			break;
		}
		else {
			count++;
			continue;
		}
		}
		//Employee joining date
		flag=false;
		count=0;
		while(!flag) {
			if(count>=3) {
				System.out.println("your are Wrong");
				break;
			}
			if(count==0) {
				System.out.println("Enter Your joining date");
					}
					else {
						System.out.println("Please Enter the Correct format");
					}
		String empJoin=scan.next();
		flag=joinCheck(empJoin);
		if(flag) {
			System.out.println("Thanks for entering valid Date");
			break;
		}
		else {
			count++;
			continue;
		}
		}
		
		
		
	

}
}
