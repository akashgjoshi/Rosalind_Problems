public class CountDNA
{

void countDNANucleotides(String DNA){
	char[] DNACharArray = DNA.toCharArray();
	int t = 0;
	int g = 0;
	int c = 0;
	int a = 0;
	for(int i =0; i<DNACharArray.length; i++)
	{
		if (DNACharArray[i]=='T')
			 t++;
		if (DNACharArray[i]=='G')
			 g++;
		if (DNACharArray[i]=='C')
			 c++;
		if (DNACharArray[i]=='A')
			 a++;
		
	}
	System.out.println("Count of T :"+t);
	System.out.println("Count of G :"+g);
	System.out.println("Count of C :"+c);
	System.out.println("Count of A :"+a);

}


public static void main(String arg[])
{
	String DNA="AGCTTTTCATTCTGACTGCAACGGGCAATATGTCTCTGTGTGGATTAAAAAAAGAGTGTCTGATAGCAGC";
	CountDNA CountDNA = new CountDNA();
	CountDNA.countDNANucleotides(DNA);
	

}

}
