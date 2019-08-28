class Animal{
    public String name;

    public Animal(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void attack(Employee e){
        System.out.println(this.name + " attacks " + e.getName());
    }

    public void attack(Person p){
        System.out.println(this.name + " attacks " + p.getName());
    }

    public void attack(Animal a){
        System.out.println(this.name + " attacks " + a.getName());
    }
}