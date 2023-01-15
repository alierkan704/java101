public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;


    Employee(String name,int salary,int workHours,int hireYear ) {
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }
    void tax(){
        double taxSalary=0;
        if(salary+bonus()<1000){
            System.out.println("Vergi kesintisine girmediniz!");
            System.out.println("Toplam ödenecek maaş:"+(salary+bonus()));
        }
        else{
           taxSalary=(((salary+bonus())*3)/100);
            System.out.println("Mesai+Net ücretiniz:"+(salary+bonus())+" TL");
            System.out.println("Toplam ücretinizden dolayı vergi kesintisine girdiniz!");
            System.out.println("Vergi:"+taxSalary+" TL");
            System.out.println("Kesintili maaşınız:"+(salary+bonus()-taxSalary)+" TL");
        }
    }
   int bonus(){
        int overtimeSalary=0;
        if(workHours>40){
            overtimeSalary=(workHours-40)*30;
            return overtimeSalary;
        }else
            return 0;

    }
    void raiseSalary() {
       double extra=0;
        if((2022-hireYear)<10){
            extra=(salary*5)/100;
        }
        if((2022-hireYear)>9&&(2022-hireYear)<20) {
            extra=(salary*10)/100;
        }
        if((2022-hireYear)>20){
            extra=(salary*15)/100;
        }
        System.out.println("Maaş artışı:"+extra+" TL");
    }
    void info() {
        System.out.println("--------------------------------------------");
        System.out.println("Adı:"+this.name);
        System.out.println("Başlangıç yılı:"+this.hireYear);
        System.out.println("Net Maaşı:"+this.salary+" TL");
        System.out.println("Çalışma saati:"+this.workHours);
        tax();
        raiseSalary();
        bonus();
    }

}
