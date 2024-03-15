package ktra.de1;

public class TourMain {
    
    public static void main(String[] args) {
        Tour a =  Tour.Builder.getInstance()
                .addName("Nha Trang")
                .addDS("Vin").addDS("Island")
                .addPrices(5000)
                .addTime(20)
                .build();
        Tour b =  Tour.Builder.getInstance()
        .addName("Nha Trang")
        .addDS("Vin").addDS("Island")
        .addPrices(6000)
        .addTime(40)
        .build();
        // Tour c =  Tour.Builder.getInstance()
        // .addName("Nha Trang")
        // .addDS("Vin").addDS("Island")
        // .addPrices(6000)
        // .addTime(40)
        // .build();
        a.display();
        b.display();
        // c.display();
    }
}
