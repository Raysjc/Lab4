class Employee extends Person{

    private double salary;
    
    public double getSalary(){
        return salary;
    }

    public Employee(double salary, String name, int age){
        super(name,age); //calls the constructor or Person*
        this.salary = salary;
    }
}