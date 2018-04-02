import java.util.Arrays;

import edu.princeton.cs.algs4.BinaryStdIn;
import edu.princeton.cs.algs4.BinaryStdOut;

public class BurrowsWheeler {

	
	
	// apply Burrows-Wheeler transform, reading from standard input and writing to standard output
    public static void transform() {    	
//    	String s = StdIn.readString(); // can use this for QA    	
    	int first = 0;
    	String s = BinaryStdIn.readString();
    	char[] t = new char[s.length()];
    	CircularSuffixArray cs = new CircularSuffixArray(s);
    	for (int i = 0; i < s.length(); i++) {
    		t[i] = lastCharInCircularSuffix(s, cs.index(i));
    		if (cs.index(i) == 0) {
    			first = i;
    		}    		
    	}
    	// prints out the transform
    	BinaryStdOut.write(first);
    	for (int i = 0; i < s.length(); i++) {
    		BinaryStdOut.write(t[i]);    		  		
    	} 
    	
    	BinaryStdOut.close();
    }
    
    //based on the charAt method in CircularSuffic
    private static char lastCharInCircularSuffix(String s, int index) {
    	return s.charAt((index + (s.length() - 1)) % s.length()); // a bit tricky
    }

    // apply Burrows-Wheeler inverse transform, reading from standard input and writing to standard output
    public static void inverseTransform() {
    	int first = BinaryStdIn.readInt();  //first suffix when in sorted order 
    	String s = BinaryStdIn.readString();
    	char[] t = s.toCharArray();
    	char[] firstLetters = s.toCharArray();
    	Arrays.sort(firstLetters);
    	BinaryStdOut.write(firstLetters[0]);
    	BinaryStdOut.close();
    	
    }

    // if args[0] is '-', apply Burrows-Wheeler transform
    // if args[0] is '+', apply Burrows-Wheeler inverse transform
    public static void main(String[] args) {
    	if (args[0].equals("-")) transform();
    	else if (args[0].equals("+")) inverseTransform();
//    	char c = lastCharInCircularSuffix("ABRACADABRA",3);
//    	System.out.println(c);
    }

}
