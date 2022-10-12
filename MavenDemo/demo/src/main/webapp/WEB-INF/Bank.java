// iii)Create a Bank class with methods deposit & withdraw. 
//     The deposit method would accept attributes amount & balance 
//    ( returns the new balance which is the sum of amount & balance)
// Similarly the withdraw method would accept the attributes amount & balance & returns the new balance
// if(balance >=amount or return 0 otherwise

public class Bank {
    
    public int withdraw(int amount, int balance){

        int newBalance = 0;
        newBalance = amount + balance;
        if(newBalance >= amount){
           return newBalance;
        }else{
            return 0;
        }
    }

    public int deposit(int amount, int balance){
        return amount + balance;
    }

}
