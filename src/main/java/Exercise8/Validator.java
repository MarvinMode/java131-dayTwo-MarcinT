package Exercise8;

public class Validator {
    public void isDimentionValiable(Parcel parcel){
        if(parcel.getxLength() + parcel.getyLength() + parcel.getzLength() <= 300){
            System.out.println("Paczka " + parcel.toString() + "ma dobre wymiary");
        }else {
            System.out.println("Paczka " + parcel.toString() + "ma złe wymiary");
        }
    }
}
