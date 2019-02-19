import edu.duke.*;
/**
 * Write a description of Part4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part4 {
    public String FindYoutube(URLResource url)
    {
       String id_text="\"" +"youtube.com"+"\"";
       String results="null";
       for(String lines:url.lines())
       {
           lines.toLowerCase();
           int start=lines.indexOf("youtube.com");
           int end=lines.lastIndexOf("\"",lines.length());
           
           if(start==-1)
           {
               results= "No youtube";
               
            }
            else
            { results=lines;
                
                 
            }
           
           
        }
        return results;
       
       
        
    }
    public void test()
    {
        URLResource url = new URLResource("http://www.dukelearntoprogram.com/course2/data/manylinks.html");
        String results=FindYoutube(url);
        System.out.println(results);
        
    }
    public static void main(String args [])
    {
        Part4 p4= new Part4();
        p4.test();
    }

}
