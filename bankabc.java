/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labexercise5;

/**
 *
 * @author Thiagarajan
 */
public class bankabc {
    public static void main(String[] args){
        bank bk=new bank();
        System.out.println("amount in bank:"+bk.getbalance());
        banka a=new banka();
        System.out.println("amount in bank A :"+a.getbalance());
        bankb b=new bankb();
        System.out.println("amount in bank B:"+b.getbalance());
        bankc c=new bankc();
        System.out.println("amount in bank C:"+c.getbalance());
    }
    
}
class bank
{
    int getbalance()
    {
        return 0;
    }
}
class banka extends bank
{
    @Override
    int getbalance()
    {
        return 1000;
    }
}
class bankb extends banka
{
    @Override
    int getbalance()
    {
        return 1500;
    }
}
class bankc extends bankb
{
    @Override
    int getbalance()
    {
        return 2000;
    }
}
