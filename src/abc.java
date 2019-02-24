import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class abc {
    LinkedList<String> linkedList = new LinkedList<String>();

//    public void disp() {
//        Iterator<String> i = linkedList.iterator();
//        while (i.hasNext()) {
//            System.out.println(i.next());
//
//
//
//        }
//    }
//}
    public int addCity(String newCity){
        ListIterator<String> listIterator=linkedList.listIterator();
        while(listIterator.hasNext()){
            int x=listIterator.next().compareToIgnoreCase(newCity);
            if(x==0){
                System.out.println("Nothing to enter");
                return 1;
            }
            if(x>0)
            {
                listIterator.previous();
                listIterator.add(newCity);
                return 1;
            }
            if(x<0){}

        }
        listIterator.add(newCity);
        return 1;


    }

    public void printList()
    {
        Iterator<String> i=linkedList.iterator();
        while (i.hasNext()){
            System.out.println(i.next());


        }
    }
}
