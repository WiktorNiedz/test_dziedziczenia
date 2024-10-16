class Employee{
    private String name;
    private String second_name;
    private int station;
    private int age;
    private String email;
    public Employee(String name,String second_name, String email,int station,int age ){
        this.age=age;
        this.name=name;
        this.second_name=second_name;
        this.station=station;
        this.email=email;
    }
    public void log(){
        System.out.println("loguje");
    }
    public void praca(){
        System.out.println("sprawdza czy pracownik pracuje");
    }

    public int getAge() {
        return age;
    }

    public int getStation() {
        return station;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getSecond_name() {
        return second_name;
    }
}

class Manager extends Employee {
    private int employ;
    private boolean log;

    public Manager(String name, String second_name, String email, int station, int age, int employ, boolean log) {
        super(name, second_name, email, station, age);
        this.employ = employ;
        this.log = log;
    }

    public boolean Log() {
        return log;
    }

    public int getEmploy() {
        return employ;
    }

    public void raport() {
        System.out.println("wyswietla raport");
    }


}







public class Main {
    public static void main(String[] args) {
    Manager adam=new Manager("adam","brzeczyszczykiewicz","xyz",2,21,10,true);
    System.out.println("name: "+adam.getName());
    System.out.println("ilosc pracownikow: "+adam.getEmploy());
        System.out.println("czy zalogowano:?"+adam.Log());
        System.out.println("wiek"+adam.getAge());
        System.out.println("email: "+adam.getEmail());
        System.out.println("nazwisko: "+adam.getSecond_name());
        System.out.println("stanowisko: "+adam.getStation());
    }
}