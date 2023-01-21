package Exercise8;

public class Ex8Main {
    public static void main(String[] args) {
        Parcel parcel1 = new Parcel(10,100,10,30,true);
        Parcel parcel2 = new Parcel(100,101,100,30,true);

        Validator validator = new Validator();
        validator.isDimentionValiable(parcel1);
        validator.isDimentionValiable(parcel2);
    }
}
