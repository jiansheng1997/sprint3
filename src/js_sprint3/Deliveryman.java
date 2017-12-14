package js_sprint3;


public class Deliveryman {
String deliveryman_name;
String deliveryman_status;
String deliveryman_code;

public Deliveryman(){}
public Deliveryman(String deliveryman_name, String deliveryman_status,String deliveryman_code){
    this.deliveryman_name = deliveryman_name;
    this.deliveryman_status = deliveryman_status;
    this.deliveryman_code = deliveryman_code;
}
public String getDeliveryman_name() {
        return deliveryman_name;
    }
public void setDeliveryman_name(String deliveryman_name) {
        this.deliveryman_name = deliveryman_name;
    }

public void setDeliveryman_Status (String deliveryman_status){
    this.deliveryman_status = deliveryman_status;
}
public void setDeliveryman_Code(String deliveryman_code){
    this.deliveryman_code= deliveryman_code;
}
public String getDeliveryman_Status(){
    return deliveryman_status;
}
public String getDeliveryman_Code(){
    return deliveryman_code;
}
public String toString(){
    return "Name: "+deliveryman_name+" Employee ID: "+deliveryman_code+
            " Status: "+deliveryman_status;
}
}
