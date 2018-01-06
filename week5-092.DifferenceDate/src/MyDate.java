public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public int differenceInYears(MyDate comparedDate){
        int daysInThisDate = ((this.year) *360) + ((this.month)*30) + this.day;
        int daysInComparedDate = ((comparedDate.year) * 360) + ((comparedDate.month)*30) + comparedDate.day;

        int result = Math.max(daysInThisDate, daysInComparedDate) - Math.min(daysInThisDate, daysInComparedDate);
        int year = 0;


           while (result >= 360) {
               year++;
               result -= 360;
           }


        return year;
    }

}
