package noteBook;

import java.util.ArrayList;

/**
 * Created by Jack on 2017/4/4.
 */
public class NoteBook {

    private ArrayList<String> notes = new ArrayList<String>();

    public void add(String s) {
        notes.add(s);
    }
    public void add(String s , int location){
        notes.add(location,s);
    }

    public int getSize(){
        return notes.size();
    }
    public void remove(int index){
        notes.remove(index);
    }

    public String[] list(){

        String a[]=new String[notes.size()];
        notes.toArray(a);
        return a;
    }


    public static void main(String[] args){

        NoteBook nb = new NoteBook();
        nb.add("first");
        nb.add("second");
        System.out.println(nb.getSize());
        nb.add("zero",0);
        nb.remove(2);
        System.out.println(nb.getSize());
        String a[];
        a=nb.list();
        for(String s : a){
            System.out.println(s);
        }
    }

}
