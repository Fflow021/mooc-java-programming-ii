
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
    private List<Person> employees;

    public Employees() {
        this.employees = new ArrayList<>();
    }
    
    public void add(Person personToAdd){
        this.employees.add(personToAdd);      
    }
    
    public void add(List<Person> peopleToAdd){
        for(Person person: peopleToAdd){
            this.employees.add(person);
        }
    }
    
    public void print(){
        Iterator<Person> iterator = this.employees.iterator();

        while (iterator.hasNext()) {
            Person personToPrint = iterator.next();
            System.out.println(personToPrint);
        }
    }
    
    public void print(Education education) {
        Iterator<Person> iterator = this.employees.iterator();
        
        while(iterator.hasNext()) {
            Person printperson = iterator.next();
            
            if(printperson.getEducation() == education) {
                System.out.println(printperson);
            }
        }
    }
    
    public void fire(Education education) {
        Iterator<Person> iterator = this.employees.iterator();
        
        while(iterator.hasNext()) {
            Person printperson = iterator.next();
            
            if(printperson.getEducation() == education) {
                iterator.remove();
            }
        }        
    }
}
