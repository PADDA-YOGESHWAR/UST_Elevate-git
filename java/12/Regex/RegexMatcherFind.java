import java.util.regex.Pattern;  
import java.util.Scanner;  
import java.util.regex.Matcher;    
public class RegexMatcherFind {
    public static void main(String[] args){    
        Scanner sc=new Scanner(System.in);  
        while (true) {    
            System.out.println("Enter text:");  
            String text = sc.nextLine();
            System.out.println("Enter regex pattern:");
            String regex = sc.nextLine();
            Pattern pattern = Pattern.compile(regex);    
            Matcher matcher = pattern.matcher(text);    
            boolean found = false;    
            while (matcher.find()) {    
                System.out.println("I found the text "+matcher.group()+" starting at index "+    
                 matcher.start()+" and ending at index "+matcher.end());    
                found = true;    
            }    
            if(!found){    
                System.out.println("No match found.");    
            }    
        }    
    }    
}
