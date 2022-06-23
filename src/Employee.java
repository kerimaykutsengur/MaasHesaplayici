public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;


    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (this.salary > 1000) {
            double salaryTax = this.salary * 0.03;
            return salaryTax;
        } else {
            return 0;
        }
    }

    public int bonus() {
        if (this.workHours > 40) {
            int bonusHours = (this.workHours - 40) * 30;
            return bonusHours;
        } else {
            return 0;
        }
    }

    public double raiseSalary() {
        int year = 2021;
        int raiseYear = 2021 - this.hireYear;
        double raiseSalary;
        if (raiseYear < 10) {
            raiseSalary = this.salary * 0.05;
            return raiseSalary;
        } else if (raiseYear < 20) {
            raiseSalary = this.salary * 0.1;
            return raiseSalary;
        } else {
            raiseSalary = this.salary * 0.15;
            return raiseSalary;
        }
    }


    public String toString() {
        double toplam = salary - tax() + bonus() + raiseSalary();
        double withTax = salary + bonus() - tax();
        System.out.println("Adı :" + this.name);
        System.out.println("Maaş :" + this.salary);
        System.out.println("Çalışma Saati :" + this.workHours);
        System.out.println("Başlangıç Yılı :" + this.hireYear);
        System.out.println("Vergi :" + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Maaş Artışı :" + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile Birlikte Maaş :" + withTax);
        System.out.println("Toplam net maaş :" + toplam);


        return null;
    }


}


