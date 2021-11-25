package io.zipcoder.interfaces;

public final class Students extends People<Student> {
    private static final Students INSTANCE = new Students();

    private Students(){
        this.add(new Student(1, "Mike"));
        this.add(new Student(2, "Carnell"));
        this.add(new Student(3, "Tra"));
        this.add(new Student(4, "John"));
        this.add(new Student(5, "Dave"));
        this.add(new Student(6, "Jacob"));
        this.add(new Student(7, "Paul"));
        this.add(new Student(8, "Amanda"));
        this.add(new Student(9, "Junior"));
        this.add(new Student(10, "Keerthana"));
    }


    public static Students getInstance(){
        return INSTANCE;
    }

    @Override
    public Student[] toArray() {
        return new Student[0];
    }
}
