package chapter13.entities.example02;

public class Department {
    private String departmentName;

    public Department(String name){
        this.departmentName = name;
    }

    public String getName() {
        return departmentName;
    }

    public void setName(String name) {
        this.departmentName = name;
    }

    @Override
    public String toString() {
        return  departmentName;
    }
}
