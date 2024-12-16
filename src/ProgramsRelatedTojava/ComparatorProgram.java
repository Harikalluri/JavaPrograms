package ProgramsRelatedTojava;

import java.util.Arrays;
import java.util.Comparator;


final class foul {
	int eid;
	String ename;
	double esal;

	public foul(int eid, String ename, double esal) {

		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}

	public String toString() {
		return eid + " " + ename + " " + esal;
	}
}
public class ComparatorProgram implements Comparator<foul>{

	public static void main(String[] args) {
		foul e1 = new foul(5, "ntr", 96857.25);
		foul e2 = new foul(6, "mahesh", 92857.25);
		foul e3 = new foul(3, "ravi", 86857.25);
		foul e4 = new foul(1, "ram", 76857.25);
		foul[] arr = { e1, e2, e3, e4 };
		Arrays.sort(arr,new ComparatorProgram());
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	public int compare(foul o1, foul o2) {
//		return o1.eid-o2.eid;
//		return (int) (o1.esal-o2.esal);
		return o1.ename.compareTo(o2.ename);
	}

}
