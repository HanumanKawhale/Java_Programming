//getter and setter

class Student {
    private String name;
    private int rollNumber;

    //getter and setter

    public String getName() {   //getter
        return name;
    }

    public void setName(String name) {  // setter
        this.name = name;
    }

    public int getRollNumber() {     //getter
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {    //setter
        if(rollNumber < 0) {

           throw new IllegalArgumentException("invalid Argument");
        }

        this.rollNumber = rollNumber;
    }

    public void display() {
        System.out.println(this.name);
        System.out.println(this.rollNumber);
    }
}

public class GetSet {
    public static void main(String[] args) {
        
        Student st = new Student();

        st.setName("Mahesh");
        st.setRollNumber(111);
        st.display();
        

    }
}

