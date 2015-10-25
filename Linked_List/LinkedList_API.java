/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shohan
 */
import java.util.*;

public class LinkedList_API {
    public static void main(String args[]){
        
        LinkedList mylist = new LinkedList();
        
        mylist.add("C");
        mylist.add("B");
        mylist.add("A");
        mylist.add("E");
        mylist.add("D");
        
        mylist.addLast("1A");
        mylist.sort(null); // sort list acording to ascii value (only works with jdk 1.8)
        
        System.out.print(mylist); // head node 
        
    }
}
