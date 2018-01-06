
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    public boolean larger(Apartment otherApartment){
        if (this.squareMeters > otherApartment.squareMeters){
            return true;
        }
        return false;
    }

    public int priceDifference(Apartment otherApartment){
        int currentPrice = this.squareMeters * this.pricePerSquareMeter;
        int otherPrice = otherApartment.squareMeters * otherApartment.pricePerSquareMeter;

        if(currentPrice > otherPrice){
            return currentPrice - otherPrice;
        }
        return otherPrice - currentPrice;

    }


    public boolean moreExpensiveThan(Apartment otherApartment){
        int currentPrice = this.squareMeters * this.pricePerSquareMeter;
        int otherPrice = otherApartment.squareMeters * otherApartment.pricePerSquareMeter;

        if (currentPrice > otherPrice){
            return true;
        }
        return false;
    }
}
