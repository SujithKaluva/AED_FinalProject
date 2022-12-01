/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Person;

import java.util.*;

/**
 *
 * @author sujithkaluva
 */
public class PersonDirectory {
    
    private ArrayList<Person> personList;
    private HashMap<String,Person> personMap;

    public PersonDirectory() {
        this.personList = new ArrayList<Person>();
        this.personMap = new HashMap<>();
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }

    public HashMap<String, Person> getPersonMap() {
        return personMap;
    }

    public void setPersonMap(HashMap<String, Person> personMap) {
        this.personMap = personMap;
    }
    
    public void addPerson(Person pObj){
        this.personList.add(pObj);
        this.personMap.put(pObj.getEmailId(),pObj);
    }
    
    public void deletePerson(String pEmail){
        this.personMap.remove(pEmail);
        for(Person pObj:personList){
            if(pObj.getEmailId().equals(pEmail)){
                personList.remove(pObj);
                break;
            }
        }
    }
    
    
}
