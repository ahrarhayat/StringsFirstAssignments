
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
  String Result=null;
  
  if(startCodon==-1)//no ATG
  {
     Result="It's not a DNA";
     if(dna.length()%3==0 )
        {
        Result="Gene: " +"DNA: "+dna;
        return Result;
        }
     return Result;
    
    }
    int stopCodon= dna.indexOf("TAA",startCodon+3);
    if(stopCodon==-1)//no TAA
    {
        Result="It's not a DNA";
        if(dna.length()%3==0 )
        {
        Result="Gene: " +"DNA: "+dna;
        return Result;
        }
        return Result;
    }
    
  Result="Gene: "+dna.substring(startCodon,stopCodon+3)+"  DNA: "+dna;
  
    return Result;
}
    
    public void testSimpleGene()
    {
        String dna = "AGTAATGAGGTAGGAATAGGATAA";
        String result=findSimpleGene(dna);
        System.out.println("Result: "+result);
        
        
    }
    public static void main(String args [])
    {
        Part1 p1= new Part1();
        p1.testSimpleGene();
    }
    
    

}
