import java.util.LinkedList;

import edu.princeton.cs.algs4.BinaryStdIn;
import edu.princeton.cs.algs4.BinaryStdOut;

public class MoveToFront {
	
	// apply move-to-front encoding, reading from standard input and writing to standard output
   public static void encode() {
	   LinkedList<Integer> alphabet = new LinkedList<>();	   
	   // initializes alphabet
	   for(int i = 0; i < 256; i++) {
		   alphabet.push(i);
	   }
	   // gets the input
	   String s = BinaryStdIn.readString();
	   char[] input = s.toCharArray();
	   for(int i = 0; i < s.length(); i++) {
		   int last = input[i];
		   Integer lastWrapVersion = last;
		   //might not be as efficient as we want but does the trick
		   int out = alphabet.indexOf(lastWrapVersion);
		   alphabet.remove(out);
		   alphabet.addFirst(lastWrapVersion);
		   BinaryStdOut.write(out);
 	   }
	   
	   
	   
   }

    // apply move-to-front decoding, reading from standard input and writing to standard output
//    public static void decode()

    // if args[0] is '-', apply move-to-front encoding
    // if args[0] is '+', apply move-to-front decoding

	public static void main(String[] args) {
	

	}

}
