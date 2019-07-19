import java.util.*;

public class  Str
{
		public static void main(String args[])
		{
				Scanner s=new Scanner(System.in);

			System.out.println("Enter string 1 = ");
			String x=s.nextLine();
			System.out.println("Enter string 2 = ");
			String y=s.nextLine();
			String s1=new String();
			System.out.println("String() "+s1);

			char[] ch={'P','A','R','I'};
			String s3=new String(ch);
			System.out.println("String(ch[]) ="+s3);
			String s4=new String(ch,1,3);
			System.out.println("String(ch,int,int) ="+s4);
			byte[] ascii={65,66,67,68,69};

			String s6=new String(ascii);
			System.out.println("String(byte[])="+s6);
			String s5=new String(x);
			System.out.println("toUppercase() = "+x.toUpperCase());
			System.out.println("toLowercase() = "+x.toLowerCase());
			System.out.println("indexOf(int ch) = "+s5.indexOf('e'));
			System.out.println("indexOf(int ch,int) = "+s5.indexOf('e',2));
			System.out.println("lastIndexOf(int ch) = "+s5.lastIndexOf('i'));
			System.out.println("lastIndexOf(int ch,int) = "+s5.lastIndexOf('i',3));
			System.out.println("replace(ch,ch) = "+s5.replace('i','w'));
			System.out.println("concat(string) = "+s5.concat("RDH"));
			System.out.println("compareTo(string) = "+s5.compareTo(y));

		}
}