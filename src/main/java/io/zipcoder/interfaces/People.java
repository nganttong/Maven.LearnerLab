package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class People <Someone extends Person> implements Iterable<Person> {

    List<Someone> personList = new ArrayList<Someone>();

    public void add(Someone person) {
        personList.add(person);
    }

    public Someone findById(long id) {
        for (Someone person : personList) {
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }

    public boolean contains(Someone person) {
        for (Someone personToLookFor : personList) {
            if (personToLookFor.getId() == person.getId()
                    && personToLookFor.getName().equals(person.getName())) {
                return true;
            }
        }
        return false;
    }

    public void remove(Someone person) {
        personList.remove(person);
    }

    public void remove(long id) {
        remove(findById(id));
    }

    public void removeAll() {
        personList.clear();
    }

    public int count() {
        return personList.size();
    }

    public abstract Someone[] toArray();

    public Iterator<Person> iterator() {
        Iterator iterator = personList.iterator();
        return iterator;
    }
}
