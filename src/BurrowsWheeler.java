import edu.princeton.cs.algs4.BinaryStdIn;
import edu.princeton.cs.algs4.BinaryStdOut;

public class BurrowsWheeler {

	
	
	// apply Burrows-Wheeler transform, reading from standard input and writing to standard output
    public static void transform() {
    	String s = BinaryStdIn.readString();
    	int[] t = new int[s.length()];
    	CircularSuffixArray cs = new CircularSuffixArray(s);
    	for (int i = 0; i < s.length(); i++) {
    		t[i] = s.charAt(cs.index(i));
    	}
    	BinaryStdOut.write(s);
    	BinaryStdOut.close(); //closes output stream as per the API instructions
    }

    // apply Burrows-Wheeler inverse transform, reading from standard input and writing to standard output
//    public static void inverseTransform()

    // if args[0] is '-', apply Burrows-Wheeler transform
    // if args[0] is '+', apply Burrows-Wheeler inverse transform
    public static void main(String[] args) {
    	transform();
    	
    }

}
