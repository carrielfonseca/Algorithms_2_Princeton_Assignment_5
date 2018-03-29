import java.util.Arrays;
import java.util.Comparator;

/**
 * 
 * @author ffonseca
 * 
 * Since as of java 1.7, the substring function no longer takes constant time, the mains insight 
 * for this class is how to have a data structure that will have the same String reference of the original 
 * String provided in the constructor. The idea is to have a private inner class (CirucularSufix), that will
 * implement the Comparable interface. This inner class will have a String that will be the same as the
 * outer class and an integer (index), that will indicate the first letter of the circular sufix.
 * This is enough to identify the entire circular suffix.
 * 
 *  Tha main inspiration for this is the old substring implementation java that was shown in the lectures notes 
 * 
 * A more update version of the checklist can be found in the Princeton course website:
 * http://www.cs.princeton.edu/courses/archive/spring18/cos226/assignments.php. It has a good hint on 	
 * the checklist for how to sort the CircularArray
 * 
 * 
 */
public class CircularSuffixArray {
	
	private String s;
	private int length;
	private CircularSuffix[] cs;
	
	
	// circular suffix array of s
	public CircularSuffixArray(String s) {
		this.s = s;
		length = s.length();
		cs = new CircularSuffix[length];
		for(int i=0;i<length;i++) {
			cs[i] = new CircularSuffix(i);
		}
		Arrays.sort(cs);
	 }
	
	// length of s
	public int length() {
		return s.length();
	}
	
	// returns index of ith sorted suffix
	public int index(int i) {
		return 0;
	}
	
	private class CircularSuffix implements Comparable<CircularSuffix> {
		private int index; // temporary for testing
		
		public CircularSuffix(int index) {
			this.index = index;
		}
		
		//character in the ith position of the suffix
		public char charAt(int i) {
			return s.charAt((index+i) % length); // a bit tricky
		}
		
		public int compareTo(CircularSuffix cs) {
			int i = 0;
			while (i < length) {
				if (this.charAt(i) < cs.charAt(i)) {
					return -1;
				}
				else if (this.charAt(i) > cs.charAt(i)) {
					return 1;
				}
				i++;
			}
			return 0; //TODO: make on return
		}
	}
	
	public static void main(String[] args) {
//		System.out.println(11%11);
		CircularSuffixArray cs = new CircularSuffixArray("ABRACADABRA");
//		System.out.println(cs.length);
		
		CircularSuffix csinner = cs.new CircularSuffix(0);
		CircularSuffix csinner2 = cs.new CircularSuffix(1);		
		
		System.out.println(csinner2.compareTo(csinner));

	}

}
