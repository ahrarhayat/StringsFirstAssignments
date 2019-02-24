import edu.duke.*;
import edu.duke.URLResource;
/**
 * Write a description of Part4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part4 {
    public String FindYoutube(URLResource url)
    {
       
      
       
       String results="null";
       for(String words:url.words())
       {
          String itemLower= words;
          String youtubeUp= "YouTube.com";
          String youtubeLo= "youtube.com";
          String youtubeUpful="YOUTUBE";
       
          int pos= words.indexOf(youtubeLo);
          int pos2=words.indexOf(youtubeUp);
          int pos3=words.indexOf(youtubeUpful);
          
          
         
           if(pos!=-1 && words.contains("youtube.com")== true)
           {
               int beg = itemLower.lastIndexOf("\"",pos);
               int end = itemLower.indexOf("\"",pos+1);
               System.out.println(itemLower.substring(beg+1,end));
            }
           else if(pos!=-1 && words.contains("YouTube.com")== true)
            {
               int beg = itemLower.lastIndexOf("\"",pos2);
               int end = itemLower.indexOf("\"",pos2+1);
               System.out.println(itemLower.substring(beg+1,end));
            }
           else if(pos!=-1 && words.contains("YOUTUBE")== true)
            {
             int beg = itemLower.lastIndexOf("\"",pos3);
              int end = itemLower.indexOf("\"",pos3+1);
              System.out.println(itemLower.substring(beg+1,end));   
            }
            
           
           
        }
        return "";
       
       
        
    }
    public void test()
    {
        URLResource url = new URLResource("http://www.dukelearntoprogram.com/course2/data/manylinks.html ");
     
        String results=FindYoutube(url);
        System.out.println(results);
        
    }
    public static void main(String args [])
    {
        Part4 p4= new Part4();
        p4.test();
    }

}