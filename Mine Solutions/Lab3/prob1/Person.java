package Lab3.prob1;

public class Person {
    public String name;
    Person(String _name){this.name=_name;};



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null || !(obj instanceof Person)) return false;

        Person x = (Person)obj;
        if (x.getName().equals(name)) return true;
        return false;
    }
}
