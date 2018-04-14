import java.util.LinkedList;

import edu.princeton.cs.algs4.BinaryStdIn;
import edu.princeton.cs.algs4.BinaryStdOut;

public class MoveToFront {
	
	// apply move-to-front encoding, reading from standard input and writing to standard output
   public static void encode() {
	   LinkedList<Integer> alphabet = new LinkedList<>();	   
	   // initializes alphabet
	   for(int i = 0; i < 256; i++) {
		   alphabet.add(i);
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
	   BinaryStdOut.close();
	   
	   
	   
   }

    // apply move-to-front decoding, reading from standard input and writing to standard output
    public static void decode() {
       LinkedList<Integer> alphabet = new LinkedList<>();	   
  	   // initializes alphabet
  	   for(int i = 0; i < 256; i++) {
  		   alphabet.add(i);
  		 
  	   }
  	   // gets the input
  	   while (!BinaryStdIn.isEmpty()) {
  		   int out = BinaryStdIn.readInt();
  		   int last = alphabet.remove(out); //the character retrieved in the alphabet list
  		   alphabet.addFirst(last);
  		   BinaryStdOut.write((char) last);
  	   }
  	   BinaryStdOut.close();
    }

    // if args[0] is '-', apply move-to-front encoding
    // if args[0] is '+', apply move-to-front decoding

	public static void main(String[] args) {
		if (args[0].equals("-")) encode();
    	else if (args[0].equals("+")) decode();

	}

}
