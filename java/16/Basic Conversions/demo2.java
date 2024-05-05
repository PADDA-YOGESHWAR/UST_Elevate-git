//import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;  

public class demo2 {
    public static void main(String[] args) throws ParseException {
        //string to float
        String s="23.6";  
        float f=Float.parseFloat(s);  
        System.out.println(f); 

        //float to string
        float f1=12.3F;//F is the suffix for float  
        String s1=String.valueOf(f1);  
        System.out.println(s1);  
        
        float f2=89.7F;  
        String s2=Float.toString(f2);  
        System.out.println(s2);  

        //String to double 
        String s3="23.6";  
        double d3=Double.parseDouble(s3);  
        System.out.println(d3);  

        //double to string
        double d4=12.3;  
        String s4=String.valueOf(d4);  
        System.out.println(s4);

        double d5=89.7;  
        String s5=Double.toString(d5);  
        System.out.println(s5);  

        //string to date
        String sDate1="31/12/1998";  
        String sDate2 = "31-Dec-1998";  
        String sDate3 = "12 31, 1998";  
        String sDate4 = "Thu, Dec 31 1998";  
        String sDate5 = "Thu, Dec 31 1998 23:37:50";  
        String sDate6 = "31-Dec-1998 23:37:50";  
        SimpleDateFormat formatter1=new SimpleDateFormat("dd/MM/yyyy");  
        SimpleDateFormat formatter2=new SimpleDateFormat("dd-MMM-yyyy");  
        SimpleDateFormat formatter3=new SimpleDateFormat("MM dd, yyyy");  
        SimpleDateFormat formatter4=new SimpleDateFormat("E, MMM dd yyyy");  
        SimpleDateFormat formatter5=new SimpleDateFormat("E, MMM dd yyyy HH:mm:ss");  
        SimpleDateFormat formatter6=new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");  
        Date date1=formatter1.parse(sDate1);  
        Date date2=formatter2.parse(sDate2);  
        Date date3=formatter3.parse(sDate3);  
        Date date4=formatter4.parse(sDate4);  
        Date date5=formatter5.parse(sDate5);  
        Date date6=formatter6.parse(sDate6);  
        System.out.println(sDate1+"\t"+date1);  
        System.out.println(sDate2+"\t"+date2);  
        System.out.println(sDate3+"\t"+date3);  
        System.out.println(sDate4+"\t"+date4);  
        System.out.println(sDate5+"\t"+date5);  
        System.out.println(sDate6+"\t"+date6);  


        //date to string
        Date date = Calendar.getInstance().getTime();  
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
        String strDate = dateFormat.format(date);  
        System.out.println("Converted String: " + strDate);

        Date date7 = new Date();  
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");  
        String strDate1 = formatter.format(date7);  
        System.out.println("Date Format with MM/dd/yyyy : "+strDate1);  
    
        formatter = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");  
        strDate = formatter.format(date7);  
        System.out.println("Date Format with dd-M-yyyy hh:mm:ss : "+strDate);  
    
        formatter = new SimpleDateFormat("dd MMMM yyyy");  
        strDate = formatter.format(date7);  
        System.out.println("Date Format with dd MMMM yyyy : "+strDate);  
    
        formatter = new SimpleDateFormat("dd MMMM yyyy zzzz");  
        strDate = formatter.format(date7);  
        System.out.println("Date Format with dd MMMM yyyy zzzz : "+strDate);  
    
        formatter = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");  
        strDate = formatter.format(date7);  
        System.out.println("Date Format with E, dd MMM yyyy HH:mm:ss z : "+strDate);  
    }
}
