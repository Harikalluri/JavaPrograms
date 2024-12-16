package ProgramsRelatedTojava;
import java.lang.*;
import java.util.Arrays;


class rod implements Comparable<rod>
{
	int eid;
	String ename;
	double esal;
	public rod(int eid, String ename, double esal) {
		
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}
	public String toString()
	{
		return eid+" "+ename+" "+esal;
				
	}
	public int compareTo(rod o1) {
		return this.eid-o1.eid;
//		return (int) (this.esal-o1.esal);
//		return this.ename.compareTo(o1.ename);
	}
	
	
}
public class ComparableProgram {
	public static void main(String[] args) {
		rod r1=new rod(5,"ntr", 89553245.25);
		rod r2=new rod(6,"mahesh", 893245.25);
		rod r3=new rod(4,"ram",   953245.25);
		rod r4=new rod(1,"dhanush", 553245.25);
		rod r5=new rod(2,"karhti", 9553245.25);
		rod []arr= {r1,r2,r3,r4,r5};
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
