
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public Money plus(Money added){
        int euroTotal = this.euros + added.euros;
        int centsTotal = 0;
        if( this.cents + added.cents >= 100){
            euroTotal++;
            centsTotal = (this.cents + added.cents) - 100;
        }else {
            centsTotal = this.cents + added.cents;
        }

        Money total = new Money(euroTotal, centsTotal);
        return total;
    }

    public boolean less(Money compared){
        if (this.euros == compared.euros){
            if(this.cents < compared.cents) {
                return true;
            }
        }
        if(this.euros < compared.euros){
            return true;
        }
        return false;
    }

    public Money minus(Money decremented){
        int newCents = 0;
        int newEuros = this.euros - decremented.euros;
        if(this.cents - decremented.cents < 0){
            newCents = 100 +(this.cents - decremented.cents);
            newEuros--;
        }else{
            newCents = this.cents - decremented.cents;
        }

        if(newEuros < 0){
            newEuros = 0;
            newCents = 0;
        }
        Money total = new Money(newEuros, newCents);

        return total;

    }


    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

}
