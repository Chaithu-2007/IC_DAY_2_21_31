interface Alert{
    void sendAlert(String message);
}
class EmailAlert implements Alert{
     public void sendAlert(String message){
        System.out.println("Email Alert: " + message
);
    }
}
class MobileAlert implements Alert{
    public void sendAlert(String message){
        System.out.println( "Mobile Alert: " + message);
    }
}
public class Innotification {
    public static void main(String[] args) {
        EmailAlert a=new EmailAlert();
        MobileAlert m=new MobileAlert();
        a.sendAlert("Your payment was successful!");
        m.sendAlert("Your order has been shipped!");
    }
    
}
