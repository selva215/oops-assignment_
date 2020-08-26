/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labexercise5;

import java.util.Scanner;

/**
 *
 * @author Thiagarajan
 */
public class hierachy {
    public static void main(String[] args){
        Scanner obj=new Scanner (System.in);
        System.out.println("enter number of students:");
        int n=obj.nextInt();
        stud obj1[]=new stud[n];
        dept obj2[]=new dept[n];
        for(int i=0;i<n;i++)
        {
            obj2[i]=new dept();
            obj2[i].getdept();
            obj1[i]=new stud();
            obj1[i].getstudent();
            obj1[i].displaystud();
             obj2[i].displaydep();
            
                               
        }
       
    }
    
}
class clg
{
    String cname;
    int code;
    Scanner obj=new Scanner(System.in);
    public void getclgdetails()
    {
        System.out.println("enter college name:");
        cname=obj.next();
        System.out.println("enter college code:");
        code=obj.nextInt();
    }
    public void displayclg()
    {
        System.out.println("COLLEGE DETAILS");
        System.out.println("college name:"+cname);
        System.out.println("college code:"+code);
    }
}
class dept extends clg
{
    String dep;
    public void getdept()
    {
        super.getclgdetails();
        System.out.println("enter department:");
        dep=obj.next();
        
    }
    public void displaydep()
    {
        System.out.println("DEPARTMENT DETAILS");
        System.out.println("department:"+dep);
        super.displayclg();
    }
    
    
}
class stud extends dept
{
    String name;
    int m,c,j,roll,d,e,avg,tot;
    public void getstudent()
    {
        System.out.println("enter student name:");
        name=obj.next();
        System.out.println("enter student roll number:");
        roll=obj.nextInt();
        System.out.println("enter maths mark:");
        m=obj.nextInt();
        System.out.println("enter java mark:");
        j=obj.nextInt();
        System.out.println("enter c mark:");
        c=obj.nextInt();
        System.out.println("enter dpsd mark:");
        d=obj.nextInt();
        System.out.println("enter ce mark:");
        e=obj.nextInt();
        tot=m+j+c+d+e;
        avg=tot/5;        
       
            
    }
    public void displaystud()
    {
        System.out.println("STUDENT DETAILS");
        System.out.println("student name:"+name);
        System.out.println("roll number:"+roll);
        System.out.println("maths mark:"+m);
        System.out.println("java mark:"+j);
        System.out.println("c mark:"+c);
        System.out.println("dpsd mark:"+d);
        System.out.println("ce mark:"+e);
        System.out.println("total:"+tot);
        System.out.println("average:"+avg);
        
        
    }              
}
