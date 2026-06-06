public class MarkerInterface {
    public static void main (String args[]) {
        Report report = new Report();
        String str = "Hi how are you";
        markerdemo(str);//I am not instance of marker
        markerdemo(report);//Hi i am Marker interface Instance
    }

    public static void  markerdemo(Object obj){
        if(obj instanceof important) {
            System.out.println("Hi i am Marker interface Instance");
        }else{
            System.out.println("I am not instance of marker");
        }
    }
}




interface  important {}

class Report implements important{
    public void show(){
        System.out.println("Hi i am checking Marker interface");
    }
}