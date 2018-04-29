# Algorithms_2_Princeton_Assignment_5


A particular challenge on this assignment was the impossibility of usinng the traditional debugging tools on Eclipse. Testing the program was done directly on the coomand line. The reference solution was the 
Abracadabra text (abra.txt). See file "EssentialCommandLine.txt". The printing of traditional characters
when using the BinaryStdOut library from the course works fine, but not when youi need to print integers.
For that, a HexDump is used. Moreover, when printing integers, it's important to understand you need to 
use the char version type. Otherwise, a "3" becomes a "00 00 00 03" when doing BinaryStdOut.write(integer)
instead of a simple "03", which is what you are looking for.

For the inverseTransform method in BurrowsWheeler.java, the RadixSrot is used an inspiration. 

Other good insights were made in the CircularSuffixArray.java class (see comments in the class)
