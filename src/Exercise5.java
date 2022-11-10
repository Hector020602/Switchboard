public class MainSwitchBoard {
    public static void main(String[] args) {
        Call call1 = new Call("123-45-67-89","987-65-43-21",20,3,true);
        System.out.println(call1);
        System.out.println(call1.getCost() + " cent");
        Call call2 = new Call("615-15-50-70","676-42-06-08",60,4,false);
        System.out.println(call2);
        System.out.println(call2.getCost() + " cent");
        Call call3 = new Call("676-42-06-08","659-09-79-47",120,2,false);
        System.out.println(call3);
        System.out.println(call3.getCost() + " cent");
        SwitchBoard switchboard = new SwitchBoard(100);
        switchboard.registerCall(call1);
        switchboard.registerCall(call2);
        switchboard.registerCall(call3);
        switchboard.printCalls();
        switchboard.printCall(2);
        switchboard.printCall(1);


    }
}