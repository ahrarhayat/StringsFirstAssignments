
/**
 * Write a description of Part1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part1 {
 public String   findSimpleGene(String dna)
 {
  //Start codon is ATG
  //Stop codon is TAA
  int startCodon= dna.indexOf("ATG");
  int stopCodon= dna.indexOf("TAA",startCodon+3);
  String result=dna.substring(startCodon,stopCodon+3);
 return result;
    }
    public void testSimpleGene()
    {
        String dna = "AGTAATGAGGTAGGAATAAGGAATT";
        String result=findSimpleGene(dna);
        System.out.println("This is the dna: "+result);
        
        
    }
    public static void main(String args [])
    {
        Part1 p1= new Part1();
        p1.testSimpleGene();
    }
    
    

}
