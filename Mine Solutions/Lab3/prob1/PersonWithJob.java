package Lab3.prob1;

public class PersonWithJob {
    private Person person;
    private Integer salary;

    public Person getPerson() {
        return person;
    }


    public void setPerson(Person person) {
        this.person = person;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    PersonWithJob(String n, Integer sal){
        person = new Person(n);
        salary = sal;
    }


    public static void main(String[] args) {
        PersonWithJob p1 = new PersonWithJob("Joe", 30000);
        Person p2 = new Person("Joe");
        //As PersonsWithJobs, p1 should be equal to p2
        System.out.println("p1.equals(p2)? " + p1.equals(p2));
        System.out.println("p2.equals(p1)? " + p2.equals(p1));
    }
}
