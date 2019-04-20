package bb;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acn00
 */
public class Student_info {
    private int ID, Year, Race, Sex;
    private String Name;

    public Student_info(int id, String name, int year, int race, int sex ){
    this.ID = id;
    this.Year = year;
    this.Race = race;
    this.Sex = sex;
    this.Name = name;
}
    
    public int getID(){
        return this.ID;
    }
    public String getName(){
        return this.Name;
    }

        public String getYear(){
  
        switch (this.Year){
            case 1:
                return "Freshman";
            case 2:
                return "Sophmore";
            case 3: 
                return "Junior";
            case 4:
                return "Senior";
                
            default:
                return null;
        }
    }
            public String getRace(){
  
        switch (this.Year){
            case 1:
                return "Native American";
            case 2:
                return "African American/ African";
            case 3: 
                return "White";
            case 4:
                return "Hispanic/Latino";
                
            case 5:
                return "Asian";
                
            default:
                return null;
        }
    }
        public String getSex(){
  
        switch (this.Sex){
            case 1:
                return "Female";
            case 2:
                return "Male";
            default:
                return null;
        }
    }
}
