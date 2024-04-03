import java.io.*;
class code_conversion 
{

	// Helper function to xor
	// two characters
	char xor_c(char a, char b)
	{
		return (a == b) ? '0' : '1';
	}

	// Helper function to flip the bit
	char flip(char c)
	{
		return (c == '0') ? '1' : '0';
	}

	// function to convert binary
// string to gray string
	String binarytoGray(String binary)
	{
		String gray = "";

		// MSB of gray code is same
		// as binary code
		gray += binary.charAt(0);

		// Compute remaining bits, next bit is
		// computed by doing XOR of previous
		// and current in Binary
		for (int i = 1; i < binary.length(); i++) 
		{

			// Concatenate XOR of previous bit
			// with current bit
			gray += xor_c(binary.charAt(i - 1),
						binary.charAt(i));
		}
	return gray;
	}

	// function to convert gray code
	// string to binary string
	String graytoBinary(String gray)
	{
		String binary = "";

		// MSB of binary code is same
		// as gray code
		binary += gray.charAt(0);

		// Compute remaining bits
		for (int i = 1; i < gray.length(); i++) 
		{
		
			// If current bit is 0,
			// concatenate previous bit
			if (gray.charAt(i) == '0')
				binary += binary.charAt(i - 1);
		
		// Else, concatenate invert of
			// previous bit
			else
				binary += flip(binary.charAt(i - 1));
		}

		return binary;
	}

	// Driver program to test above functions
	public static void main(String args[])
		throws IOException
	{
		code_conversion ob = new code_conversion();
		String binary = "1111";
		System.out.println("Gray code of " +
						binary + " is " + 
						ob.binarytoGray(binary));

		String gray = "010110";
		System.out.println("Binary code of " + 
						gray + " is " + 
						ob.graytoBinary(gray));
	}
}

