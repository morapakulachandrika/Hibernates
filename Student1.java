package org.example;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
@Entity
public class Student1 {
    @Id
    private int rollNo;
    private String sName;
    private int sAge;
    public int getsAge() {
        return sAge;
    }
    public void setsAge(int sAge) {
        this.sAge = sAge;
    }
    public String getsName() {
        return sName;
    }
    public void setsName(String sName) {
        this.sName = sName;
    }
    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public String toString(){
        return "Student{" +
                "rollNo = "+ rollNo +
                ",sName = '"+sName + '\'' +
                ",sAge = "+ sAge +
                '}';
    }
}
