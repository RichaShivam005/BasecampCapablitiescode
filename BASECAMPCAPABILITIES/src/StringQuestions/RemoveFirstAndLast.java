package StringQuestions;
import java.util.Scanner;
public class RemoveFirstAndLast {
	public String RemoveFirstAndLast(String str)
	{
		String result="";
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				count++;
			}
		}
		String[] array=new String[count+1];
		String str1="";
		int j=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			{
				str1=str1+str.charAt(i);
				array[j]=str1;
			}
			else
			{
				j++;
				str1="";
			}
		}
		
		for(int i=0;i<array.length;i++)
		{
			//System.out.println(array[i]);
		}
		for(int i=array.length-1;i>=0;i--)
		{
			
			if(i !=0 && i!=array.length-1)
			{
				 result=result+array[i];
			}
		}
		

		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		RemoveFirstAndLast obj=new RemoveFirstAndLast();
		String result=obj.RemoveFirstAndLast(str);
		System.out.println(result);
		
	}

}
