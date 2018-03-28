

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
	
	// circular suffix array of s
	public CircularSuffixArray(String s) {
		 
	 }
	
	// length of s
	public int length() {
		return s.length();
	}
	
	// returns index of ith sorted suffix
	public int index(int i) {
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
