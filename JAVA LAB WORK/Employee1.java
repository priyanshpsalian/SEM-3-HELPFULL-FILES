import java.util.Scanner;

class emp{
    int id,hours,wages;
    String name;
}

public class Employee1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=5,maxWage=0;
        emp[] e = new emp[n];

        for(int i=0;i<n;i++){
            e[i]=new emp();
            System.out.print("\nEnter your name : ");
            e[i].name=sc.next();
            System.out.print("Enter your ID : ");
            e[i].id=sc.nextInt();
            System.out.print("Enter no. of hours worked : ");
            e[i].hours=sc.nextInt();
        }
        System.out.println("\nId\tName\t\tHours\tWages\n");
        for(int i=0;i<n;i++){
            e[i].wages=e[i].hours*100;
            System.out.println(e[i].id+"\t"+e[i].name+"\t\t"+e[i].hours+"\t"+e[i].wages);
            maxWage=(e[i].wages>e[maxWage].wages) ? i : maxWage;
        }
        System.out.println("\nDetails of employee with highest wage");
        System.out.println("Name : "+e[maxWage].name+"\nId : "+e[maxWage].id+"\nNo of hours : "+e[maxWage].hours+"\nWage : "+e[maxWage].wages);

    }
}
