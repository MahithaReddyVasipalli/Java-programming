# Java-programming
import java.util.Scanner;


class Employee{
    Scanner sc=new Scanner(System.in);
    String Emp_name,Mail_id,Address;
    int Emp_Id,Mobile_number;
    
    public Employee(){
        System.out.println("Enter the Employee Name");
        Emp_name= sc.next();
        System.out.println("Enter the Employee Id");
        Emp_Id= sc.nextInt();
        System.out.println("Enter the Employee Mail");
        Mail_id= sc.next();
        System.out.println("Enter the Employee Address");
        Address= sc.next();
        System.out.println("Enter the Employee Mobile number");
        Mobile_number= sc.nextInt();
    }
    public void Emp_details(){
        System.out.println("------------------------PAY SLIP----------------------------");
        
        System.out.println("Employee Name \n\t"+Emp_name);
        
        System.out.println("Employee Id\n\t"+Emp_Id);
        
        System.out.println("Employee Mail\n\t"+Mail_id);
       
        System.out.println("Employee Address\n\t"+Address);
       
        System.out.println("Mobile number\n\t"+Mobile_number);
       
    }
}


class Programmer extends Employee{
    double da,hra,pf,stf,basic_pay,Net_Salary,Gross_salary;
    
    public Programmer(){
        System.out.println("Enter the Basic Pay of Employee");
        basic_pay=sc.nextDouble();
        da=0.97*basic_pay;
        hra=0.1*basic_pay;
        pf=0.12*basic_pay;
        stf=0.1*basic_pay;
        Net_Salary=(basic_pay+da+hra);
        Gross_salary=(basic_pay-(pf+stf));
    }
    public void payslip(){
        System.out.println("Basic pay of the Employee = "+basic_pay);
        System.out.println("DA = "+da);
        System.out.println("HRA = "+hra);
        System.out.println("PF = "+pf);
        System.out.println("Staff Club Fund = "+stf);
        System.out.println("NET SALARY = "+Net_Salary);
        System.out.println("GROSS SALARY = "+Gross_salary);
    }
}

class AssociateProfessor extends Employee{
    double da,hra,pf,stf,basic_pay,Net_Salary,Gross_salary;
    
    public AssociateProfessor(){
        System.out.println("Enter the Basic Pay of Employee");
        basic_pay=sc.nextDouble();
        da=0.97*basic_pay;
        hra=0.1*basic_pay;
        pf=0.12*basic_pay;
        stf=0.1*basic_pay;
        Net_Salary=(basic_pay+da+hra);
        Gross_salary=(basic_pay-(pf+stf));
    }
    public void payslip(){
        System.out.println("Basic pay of the Employee = "+basic_pay);
        System.out.println("DA = "+da);
        System.out.println("HRA = "+hra);
        System.out.println("PF = "+pf);
        System.out.println("Staff Club Fund = "+stf);
        System.out.println("NET SALARY = "+Net_Salary);
        System.out.println("GROSS SALARY = "+Gross_salary);
    }
}

class AssistantProfessor extends Employee{
    double da,hra,pf,stf,basic_pay,Net_Salary,Gross_salary;
    
    public AssistantProfessor(){
        System.out.println("Enter the Basic Pay of Employee");
        basic_pay=sc.nextDouble();
        da=0.97*basic_pay;
        hra=0.1*basic_pay;
        pf=0.12*basic_pay;
        stf=0.1*basic_pay;
        Net_Salary=(basic_pay+da+hra);
        Gross_salary=(basic_pay-(pf+stf));
    }
    public void payslip(){
        System.out.println("Basic pay of the Employee = "+basic_pay);
        System.out.println("DA = "+da);
        System.out.println("HRA = "+hra);
        System.out.println("PF = "+pf);
        System.out.println("Staff Club Fund = "+stf);
        System.out.println("NET SALARY = "+Net_Salary);
        System.out.println("GROSS SALARY = "+Gross_salary);
    }
}

class Professor extends Employee{
    double da,hra,pf,stf,basic_pay,Net_Salary,Gross_salary;
    
    public Professor(){
        System.out.println("Enter the Basic Pay of Employee");
        basic_pay=sc.nextDouble();
        da=0.97*basic_pay;
        hra=0.1*basic_pay;
        pf=0.12*basic_pay;
        stf=0.1*basic_pay;
        Net_Salary=(basic_pay+da+hra);
        Gross_salary=(basic_pay-(pf+stf));
    }
    public void payslip(){
        System.out.println("Basic pay of the Employee = "+basic_pay);
        System.out.println("DA = "+da);
        System.out.println("HRA = "+hra);
        System.out.println("PF = "+pf);
        System.out.println("Staff Club Fund = "+stf);
        System.out.println("NET SALARY = "+Net_Salary);
        System.out.println("GROSS SALARY = "+Gross_salary);
    }
}


public class Experiment_9{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("For which Designation Do you like calculate pay slip");
        System.out.println("programmer \t assistantprofressor \t associateprofressor \t profressor");
        System.out.println("\n\t\tPlease type the name in small letters");
        String design = sc.next(); 
        
        switch(design){
            
            case "programmer":{
                Programmer pr=new Programmer();
                pr.Emp_details();
                pr.payslip();
                break;
            }
            case "assistantprofessor":{
                AssistantProfessor asstpr=new AssistantProfessor();
                asstpr.Emp_details();
                asstpr.payslip();
                break;
            }
            case "associateprofessor":{
                AssociateProfessor asspr=new AssociateProfessor();
                asspr.Emp_details();
                asspr.payslip();
                break;
            }
            case "professor":{
                Professor pro=new Professor();
                pro.Emp_details();
                pro.payslip();
                break;
            }
            
        }
        
    }
}
