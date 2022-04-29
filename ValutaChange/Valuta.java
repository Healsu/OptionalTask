public class Valuta {
    static double returningValue;

    public static double toEuroes(int value){
    double euro = 7.44;

    returningValue = value*euro;

        return returningValue;
    }
    public static double toDollars(int value){
    double dollar = 6.77;
    returningValue = dollar*value;

        return returningValue;
    }
}
