package kolekcjetest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class KolekcjeTest
{
    
    static String PrzykladowyString = "PrzykladowyTekst";
    

    public static void main(String[] args) {

        List arrayList = new ArrayList();
        List linkedList = new LinkedList();
          
        arrayList.add("aa");
        linkedList.add("bb");

        
        List currnetList = arrayList;
        
        
        
        Long[] wyniki = new Long[18];//polozenie, operacja, lista
        Long start;
       
        int j = 0;
        for(int i = 0; i<2; i++){
            
        
            start = System.nanoTime();
            currnetList.add(0,PrzykladowyString);
            wyniki[j++] = (System.nanoTime() - start);

            start = System.nanoTime();
            currnetList.add(1,PrzykladowyString);
            wyniki[j++] = (System.nanoTime() - start);

            start = System.nanoTime();
            currnetList.add(PrzykladowyString);
            wyniki[j++] = (System.nanoTime() - start);

            

            start = System.nanoTime();
            currnetList.get(0);
            wyniki[j++] = (System.nanoTime() - start);
        
            start = System.nanoTime();
            currnetList.get(1);
            wyniki[j++] = (System.nanoTime() - start);
        
            start = System.nanoTime();
            currnetList.get(3);
            wyniki[j++] = (System.nanoTime() - start);
            


        
            start = System.nanoTime();
            currnetList.remove(0);
            wyniki[j++] = (System.nanoTime() - start);
        
            start = System.nanoTime();
            currnetList.remove(1);
            wyniki[j++] = (System.nanoTime() - start);
        
            start = System.nanoTime();
            currnetList.remove(1);
            wyniki[j++] = (System.nanoTime() - start);
  
            
            currnetList = linkedList;
        }
       

        System.out.println("         ArrayList    LinkedList");
        System.out.println("              Początek");
        System.out.println("add      "+wyniki[0]+"        "+wyniki[9]);
        System.out.println("get      "+wyniki[3]+"         "+wyniki[12]);
        System.out.println("remove   "+wyniki[6]+"         "+wyniki[15]);
        System.out.println("              Środek");
        System.out.println("add      "+wyniki[1]+"        "+wyniki[10]);
        System.out.println("get      "+wyniki[4]+"        "+wyniki[13]);
        System.out.println("remove   "+wyniki[7]+"        "+wyniki[16]);
        System.out.println("              Koniec");
        System.out.println("add      "+wyniki[2]+"        "+wyniki[11]);
        System.out.println("get      "+wyniki[5]+"        "+wyniki[14]);
        System.out.println("remove   "+wyniki[8]+"        "+wyniki[17]);


    }
    
}
