/**
 * Created by Bill on 1/6/18.
 */
import java.util.ArrayList;
public class Phonebook {
    private ArrayList<Person> personList;


    public Phonebook(){
        this.personList = new ArrayList<Person>();
    }

    public void add(String name, String number){
        Person newPerson = new Person(name, number);
        this.personList.add(newPerson);
    }

    public void printAll(){
        for (Person person : this.personList){
            System.out.println(person);
        }
    }
    public String searchNumber(String name){

        for (Person person : personList) {
            if (person.getName().contains(name)) {
                return person.getNumber();
            }
        }
        return "number not known";
    }
}
