package Exercise8;

public class Validator {
    public void isDimentionValiable(Parcel parcel){
        if(parcel.getxLength() + parcel.getyLength() + parcel.getzLength() <= 300){
            System.out.println("Paczka " + parcel.toString() + "ma dobre wymiary");
        }else {
            System.out.println("Paczka " + parcel.toString() + "ma złe wymiary");
        }
    }

    public void isWeightValid(Parcel parcel){
        if (parcel.getWeight() <= 30 && !parcel.isExpress()){
            System.out.println("Paczka" + parcel + "jest dobrej wagi i nie jest ekspresowa");
        } else if (parcel.getWeight() <= 15 && parcel.isExpress()) {
            System.out.println("Paczka" + parcel + "jest dobrej wagi i jest ekspresowa");
        }else {
            System.out.println("Paczka" + parcel + "jest złej wagi");
        }
    }
}
