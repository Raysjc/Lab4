class ExampleTwo{

    public static void main(String args[]){

        Person p1 = new Person("Noah", 27);
        Employee e1 = new Employee(39548, "Myke", 37);
        Animal a1 = new Animal("Koa");
        Employee e2 = new Employee(13243, "NayNay", 43);
        Animal a2 = new Animal("Luna");

        System.out.println(p1.getName() + " " + p1.getAge());
        System.out.println(e1.getName() + " " + e1.getAge() + " " + e1.getSalary());

        a1.attack(e1);
        a1.attack(e2);
        a2.attack(e1);
        a2.attack(e2);
    }
}