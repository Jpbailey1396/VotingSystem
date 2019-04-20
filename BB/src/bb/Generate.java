package bb;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acn00
 */
public class Generate {
   
    public static ArrayList<String> Names = new ArrayList();
    public static ArrayList<Student_info> student = new ArrayList();
    public static File file = new File("Names.txt");
public static String path = file.getAbsolutePath();
     public static File file2 = new File(path);
    
 /*    public static void main(String[]args) throws IOException{
  
            GetNames();
            initiate();
           // System.out.println(Names.toString());
           System.out.println("Array size: "+ student.size());
           for(int i = 0; i<student.size(); i++){
               System.out.println("ID " + student.get(i).getID() + " Name: " + student.get(i).getName()+ " Year: "+ student.get(i).getYear());
           }
            
     }*/
   public static void initiate() throws IOException{
      /* 	FileWriter fw;
        //fw = new FileWriter("C:\\Users\\acn00\\OneDrive\\Pictures\\CS230\\out.txt");
 
    	//File fout = new File("C:\\Users\\acn00\\OneDrive\\Pictures\\CS230\\Student_temp_database.txt");
        FileOutputStream fos = new FileOutputStream(fout);
 
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
 */
       //80014758
       String Name = "";
       int id = 0;
       int Election_id = 0;
       int Year = 0;
       int Race = 0;
       int sex = 0;
       for (int i = 0; i<Names.size(); i++){
           
       Random rand = new Random(); 
       //id = 10000 + (int) (Math.random()*99999);
       id = i+1;
       //System.out.println("Random Number: "+id);
       //////////////////////////////////////////////////////////
      // id = 80000000 + id;
       Name = Names.get(i);
       Election_id = 1 + (int) (Math.random()*100);
       Year = 1 + (int) (Math.random()*4);
       Race = 1 + (int) (Math.random()*4);
       sex = 1 + (int) (Math.random()*2);
       Student_info student_profile = new Student_info(id, Name, Year, Race, sex);
       student.add(student_profile);
       /*
       fw.write("ID " + id +" Name" + Name+" Electiton_id " +Election_id +" Year " +Year+" Race " +Race + " Sex " + sex);
       //fw.write("Test");
       bw.write("ID " + id +" Name" + Name+" Electiton_id " +Election_id +" Year " +Year+" Race " +Race + " Sex " + sex);
       bw.newLine();
       }
       fw.close();
       bw.close();
       */
       }//
                
       Student_info student_profile1 = new Student_info(800198285, "Andrew Solomon", 3, 5, 2);
       student.add(student_profile1);
       Student_info student_profile2 = new Student_info(800133730, "Josiah Bailey", 3, 3, 2);
       student.add(student_profile2);
       Student_info student_profile3 = new Student_info(800242959, "Joseph Mahiya", 3, 2, 2);
       student.add(student_profile3);
       Student_info student_profile4 = new Student_info(800198078, "Albert Nunez", 3, 2, 2);
       student.add(student_profile4);
   }
   public static void GetNames(){
       
              try {

        Scanner sc = new Scanner(file2);
        int start = 0;
        String Name = "";
        while (sc.hasNext()) { 
            start++;
            String i = sc.next();
            if(start == 1){
            Name += i;
            }
            if(start == 2){
                Name += " " + i;
                Names.add(Name);
                Name = "";
                start=0;
            }
        }
        sc.close();
    } 
    catch (FileNotFoundException e) {
        //e.printStackTrace();
        System.out.println("File doesn't exist!  Generate.Java");
    }
   }
   public ArrayList getGenerated() throws IOException{
            GetNames();
            initiate();
       return student;
   }
}
