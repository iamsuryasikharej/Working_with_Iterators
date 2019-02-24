public class mainclass
{
    public static void main(String [] args){
        abc obj=new abc();
        obj.linkedList.add("delhi");
        obj.linkedList.add("pune");
        obj.linkedList.add("kolkata");
        obj.addCity("adi");
        obj.addCity("zurich");
        obj.addCity("jacky");
        obj.addCity("zzzzzurich");
        obj.printList();
    }
}
