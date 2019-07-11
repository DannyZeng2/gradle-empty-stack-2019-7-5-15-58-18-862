public class Person {

    public void sentMessage(Mobile mobile, String message, int limitLength) {

        if(message.length()>limitLength){
            mobile.call("<"+mobile.getName()+">Message :Message cannot be sent");
        }else {
            mobile.call("<" + mobile.getName() + ">Message :" + message);
        }
    }

    public void iphoneRobot(IPhone iPhone, String message, int limitLength) {

        if(message.length()>limitLength){
            iPhone.call("<"+iPhone.getName()+">Message :Message cannot be sent");
        }else {
            iPhone.call("<" + iPhone.getName() + ">Message :" + message);
        }
    }

    public void changePhone(Mobile mobile,String name) {
        mobile.setName(name);

    }
}
