/** Adapted from journaldev.com */

public class Dollar20Dispenser extends Dispenser{

    public void dispense(Currency cur) {
        int denomination = 20;
        if(cur.getAmount() >= denomination){
            int num = cur.getAmount()/denomination;
            int remainder = cur.getAmount() % denomination;
            System.out.println("Dispensing "+num+" $" + denomination + " bill");
            if(remainder !=0) dispenser.dispense(new Currency(remainder));
        }else{
            dispenser.dispense(cur);
        }
    }

}