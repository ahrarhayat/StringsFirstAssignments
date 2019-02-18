
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
  
  if(startCodon==-1)//no ATG
  {
      return "There is no gene";
    }
    int stopCodon= dna.indexOf("TAA",startCodon+3);
    if(stopCodon==-1)
    {
        return "There is no gene";
    }
    
  String result=dna.substring(startCodon,stopCodon+3);
  if(dna.length()%3==0)
  {
      return result;
    }
    return "There is no gene";
 
    }
    public void testSimpleGene()
    {
        String dna = "AGTAATGAGGTAGGAATAAGGAATT";
        String result=findSimpleGene(dna);
        System.out.println("Result: "+result);
        
        
    }
    public static void main(String args [])
    {
        Part1 p1= new Part1();
        p1.testSimpleGene();
    }
    
    

}
