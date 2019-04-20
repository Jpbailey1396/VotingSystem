/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bb;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author acn00
 */
public class Test {
    public static ArrayList<Student_info> student = new ArrayList();
    public static void main (String [] args ) throws IOException{
        Generate generate = new Generate();
        student = generate.getGenerated();
                   System.out.println("Array size: "+ student.size());
           for(int i = 0; i<student.size(); i++){
               System.out.println("ID " + student.get(i).getID() + " Name: " + student.get(i).getName()+ " Year: "+ student.get(i).getYear());
           }
    }
}
