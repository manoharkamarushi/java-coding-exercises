package strings;


import java.net.MalformedURLException;
import java.net.URL;

//💭 Mental Notes
//For simple parsing → prefer split(), substring(), indexOf()
//For pattern-based extraction → prefer regex
//Use Matcher.group() for regex matches.
//Remember: regex groups use parentheses () which you can reference via .group(1), .group(2) etc.

public class String_Regex {

	public static void sumIntegers() {
	    
		String[] array = {"5", "2", "9", "a", "1", "6", "#", "3"};
		int sum = 0;
	    for (String element : array) {
	        if (element.matches("\\d+")) { // regex: one or more digits
	            sum += Integer.parseInt(element);
	        }
	    }
	    System.out.println(sum);
	    
// \\d+ one or more digits
//  \\s+ one or more whitespaces
	    
	    
	}


	public void understand_regex() {
		String s= "";
//		gives only letters: 
		String clean = s.replaceAll("[a-zA-Z]", "");
			
//			[a-zA-Z0-9] → gives only letters and numbers
//			[^a-zA-Z] → gives not letters
//  		[^a-zA-Z0-9] → gives special characters	
// 			s.replaceAll("\\s", "")  - removes spaces
		
		char[] ch = s.toCharArray();
		Character.isLetter(ch[0]);
		Character.isDigit(ch[0]);
		Character.isLetterOrDigit(ch[0]);
	
	}
	
	public void extract_fileExtension() {
		String path = "C:/Users/Mano/Documents/resume.pdf";
		
		String fileName = path.substring(path.lastIndexOf("/") + 1);
		String extension = fileName.substring(fileName.lastIndexOf(".") + 1);
		
//		File name: resume.pdf  
//		Extension: pdf


	}
	public void extract_url() throws MalformedURLException {
		
		String url = "https://blog.education.example.com/page";  

// Java Built-in way
		URL u = new URL(url);
        System.out.println("Protocol: " + u.getProtocol()); //Protocol: https
        System.out.println("Host: " + u.getHost());//Host: blog.education.example.com
        System.out.println("Path: " + u.getPath());//Path: /page

//💭 Mental note	
//Use replaceFirst() or substring() to strip protocol manually.
//replaceFirst("https?://", "")
        
//Strip anything after /
//.split("/")[0]  returns full domain
        
//split by (.) gives all parts combine or print individually
//.split("\\.")	        
        
  		 
		 String protocol = url.substring(0, url.indexOf(":")); //https  or http
		 String domainPart = url.replaceFirst("https?://", ""); //replace with nothing
		 
//		 http followed by optional 's' (s?),  then ://   so matches either http:// or https://.
//		 replaceFirst() removes it only once from the beginning.
//		 domainPart = "blog.education.example.com/page";
		 
			 
		 String domain = domainPart.split("/")[0]; // splits by / and returns first par
		 //domainPart = "blog.education.example.com
		 String[] parts = domain.split("\\.");
		 // whenever we need to match any character we use (.) in regex we mention as (\\.)
		 //parts = ["blog", "education", "example", "com"]

		 System.out.println("Full domain: " + domain);//blog.education.example.com
		 System.out.println("Subdomain: " + parts[0]); //blog
		 System.out.println("Second-level domain: " + parts[1]);//education
		 System.out.println("Main domain: " + parts[parts.length - 2]);//example
		 System.out.println("Extension: " + parts[parts.length - 1]);//com
	}
}
