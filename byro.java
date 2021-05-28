public class byro extends rabot{
public String name2;
    public String kvalif2;
    public String address2;
    public String prof2;
    

public void set_name2 (String name2){
        this.name2 = name2;
    }
    public void set_kvalif2 (String kvalif2){
        this.kvalif2 = kvalif2;
    } 
    public void set_address2 (String address2){
        this.address2 = address2;
    } 
    public void set_prof2 (String prof2){
        this.prof2 = prof2;
    } 
    

public String get_name2() {
        return name2;
    }
    public String get_kvalif2() {
        return kvalif2;
    }
    public String get_address2() {
        return address2;
    }
    public String get_prof2() {
        return prof2;
    }
   









  public byro ( String name1, String kvalif1, String address1, String prof1, String name2, String kvalif2, String address2, String prof2 ) {
        
        
        super.name1 = name1;
        super.kvalif1 = kvalif1;
        super.address1 = address1;
        super.prof1 = prof1;
        this.name2 = name2;
        this.kvalif2 = kvalif2;
        this.address2 = address2;
        this.prof2 = prof2;
        
        

    }
public void output () {
         System.out.println("");
         System.out.println("Информация о работодателе:");
         System.out.println("");
        System.out.println("Название - " + this.name1);
        System.out.println("Вид дейтесльности - " + this.kvalif1);
        System.out.println("Адресс - " + this.address1);
        System.out.println("Телефон - " + this.prof1);
        System.out.println("");
        System.out.println("Документ найма");
        System.out.println("");
        System.out.println("Соискатель - " + this.name2);
         System.out.println("Работодатель - " + this.kvalif2);
        System.out.println("Должность - " + this.address2);
        System.out.println("Комиссионные - " + this.prof2);
}

}