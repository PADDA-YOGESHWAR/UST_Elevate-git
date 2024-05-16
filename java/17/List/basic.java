import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;


public class basic {
    public static void main(String args[]){  
        //Creating Array  
        String[] array={"Java","Python","PHP","C++"};  
        System.out.println("Printing Array: "+Arrays.toString(array));  
        //Converting Array to List  
        List<String> list=new ArrayList<String>();  
        for(String lang:array){  
        list.add(lang);  
        }  
        System.out.println("Printing List: "+list); 

        List<String> fruitList = new ArrayList<>();    
        fruitList.add("Mango");    
        fruitList.add("Banana");    
        fruitList.add("Apple");    
        fruitList.add("Strawberry");    
        //Converting ArrayList to Array  
        String[] array2 = fruitList.toArray(new String[fruitList.size()]);    
        System.out.println("Printing Array: "+Arrays.toString(array2));  
        System.out.println("Printing List: "+fruitList);  

        //accessing the element    
        System.out.println("Returning element: "+list.get(1));//it will return the 2nd element, because index starts from 0  
        //changing the element  
        list.set(1,"Dates");  
        //Iterating the List element using for-each loop  
        for(String fruit:list)  
        System.out.println(fruit);  
        Collections.sort(list);  
        //Traversing list through the for-each loop  
       for(String number:list)  
         System.out.println(number);  

         List<String> al=new ArrayList<String>();    
        al.add("Amit");    
        al.add("Vijay");    
        al.add("Kumar");    
        al.add(1,"Sachin");    
        ListIterator<String> itr=al.listIterator();    
        System.out.println("Traversing elements in forward direction");    
        while(itr.hasNext()){    
              
        System.out.println("index:"+itr.nextIndex()+" value:"+itr.next());    
        }    
        System.out.println("Traversing elements in backward direction");    
        while(itr.hasPrevious()){    
          
        System.out.println("index:"+itr.previousIndex()+" value:"+itr.previous());    
        }    
    }
}
