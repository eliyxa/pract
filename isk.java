public class isk{ 
public String name;
    public String kvalif;
    public String address;
    public String prof;
    public String age;

public void set_name (String name){
        this.name = name;
    }
    public void set_kvalif (String kvalif){
        this.kvalif = kvalif;
    } 
    public void set_address (String address){
        this.address = address;
    } 
    public void set_prof (String prof){
        this.prof = prof;
    } 
    public void set_age (String age){
        this.age = age;
    } 

public String get_name() {
        return name;
    }
    public String get_kvalif() {
        return kvalif;
    }
    public String get_address() {
        return address;
    }
    public String get_prof() {
        return prof;
    }
    public String get_age() {
        return age;
    }
public isk ( String name, String kvalif, String address, String prof, String age) {
        
        this.name = name;
        this.kvalif = kvalif;
        this.address = address;
        this.prof = prof;
        this.age = age;
        

    }
void take () {
         System.out.println("");
         System.out.println("Информация о карточке искателя:");
        System.out.println("Ф.И.О - " + this.name);
        System.out.println("Квалификация - " + this.kvalif);
        System.out.println("Адресс - " + this.address);
        System.out.println("Профессия - " + this.prof);
        System.out.println("Возвраст - " + this.age);
}

}