public class ReverseComplementDNA{

// This program finds the reverse Complement of a DNAStrand

public static void main(String arg[]){

String DNA="AAAACCCGGT";
char[] DNAarray=DNA.toCharArray();
char[] DNAComplement= new char[DNAarray.length];
char[] DNAComplementReverse = new char[DNAarray.length];
for(int i=1;i<=DNAarray.length;i++)
{
	DNAComplement[DNAComplement.length-i]= DNAarray[i-1];
	
	
}
for(int i=0;i<DNAComplement.length;i++)
{
	if(DNAComplement[i]=='T')
		DNAComplementReverse[i]='A';
	if(DNAComplement[i]=='G')
		DNAComplementReverse[i]='C';
	if(DNAComplement[i]=='C')
		DNAComplementReverse[i]='G';
	if(DNAComplement[i]=='A')
		DNAComplementReverse[i]='T';
	
}

System.out.println(" ");
for(int i=0;i<DNAComplement.length;i++){

System.out.print(DNAComplementReverse[i]);
}
	
}




}
