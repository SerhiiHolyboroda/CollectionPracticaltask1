import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args)throws IOException {
        // Practical Task 1
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList myCollection = new ArrayList();

        ArrayList newCollection  = new ArrayList();

//
        for(int i =0; i < 10; i++){
            myCollection.add(i, Integer.parseInt(br.readLine()));

        }

//      Task 1

        for  (Object element: myCollection) {
            if( (Integer) element > 5 ){
                newCollection.add(myCollection.indexOf(element));



            }

        }
        System.out.println("Task 1 newCollection: " + Arrays.toString(newCollection.toArray()) );

//      Task 2
        Iterator<Integer> iter = myCollection.iterator();
        while(iter.hasNext()){
           int str = iter.next();
            if(  str   > 20 ){
                iter.remove();
            }
        }



        System.out.println("Removing elements > 20 from  myCollection: " + Arrays.toString(myCollection.toArray()) );
        // Task 3

        myCollection.set(2, 1);
        if(myCollection.size() >= 8) {
            myCollection.set(8, -3);
        }
        myCollection.set(5, -4);
        System.out.println("inserting elements into myCollection: " + Arrays.toString(myCollection.toArray()) );


        Arrays.sort(myCollection.toArray());

        myCollection.sort(Comparator.naturalOrder());
        System.out.print("  myCollection is sorted: " + Arrays.toString(myCollection.toArray())   );




}}
