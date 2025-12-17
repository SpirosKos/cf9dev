package gr.aueb.cf.cf9.ch16.copy_constructor;

public final class Student {
    private final String name;
    private final City city;

    public Student() {
        this.name = " ";
        this.city = new City();

    }


    public Student(Student student) {
        this.name = student.name;
        this.city = new City(student.getCity());
    }

    public Student(String name, City city){
        this.name = name;
        this.city = city;
    }


    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public City getCity() {
        return new City(this.city); //Immutable now  if it was return city -->> Mutable
    }

//    public void setCity(City city) {
//        this.city = new City(city);
//    }
}
