/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prison_management;

/**
 *
 * @author Deshan
 */
public class Model_Person {
    private int ID;
    private String name;
    private String Age;
    private String Gender;
    private String Details;
    public Model_Person(){
        
    }
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String Age) {
        this.Age = Age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getDetails() {
        return Details;
    }

    public void setDetails(String Details) {
        this.Details = Details;
    }

    public Model_Person(int ID, String name, String Age, String Gender, String Details) {
        this.ID = ID;
        this.name = name;
        this.Age = Age;
        this.Gender = Gender;
        this.Details = Details;
    }

}