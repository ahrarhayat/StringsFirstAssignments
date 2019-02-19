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
       for(String lines:url.lines())
       {
           int start=lines.indexOf("\"",0);
           int end=lines.lastIndexOf("\"",lines.length());
           String results= "null";
           if(start==-1)
           {
               return "No youtube";
               
            }
            else
            { results=lines;
                
                return results;
            }
           
           
        }
       return null;
       
        
    }
    public void test()
    {
        URLResource url = new URLResource("http://www.dukelearntoprogram.com/course2/data/manylinks.html");
        String results=FindYoutube(url);
        
    }
    public static void main(String args [])
    {
        Part4 p4= new Part4();
        p4.test();
    }

}
