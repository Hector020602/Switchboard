public class SwitchBoard {
    public static final int NUM_CALLS = 10;
    private Call[] calls;
    private int numRegisteredCalls;

    public SwitchBoard(int numMaxCalls) {
        numRegisteredCalls = 0;
        calls = new Call[numMaxCalls];
        for (int i =0; i < calls.length; i ++) {
            calls[i] = null;
        }
    }

    public void registerCall(Call call) {
        calls[numRegisteredCalls] = call;
        numRegisteredCalls++;
    }

    public void printCalls(){
        for (int i = 0; i <numRegisteredCalls; i++) {
            System.out.println("---------------------------------------");
            System.out.println(calls[i]);
        }
        System.out.println("Total calls: " + numRegisteredCalls);
    }

    public void printCall(int index) {
        for (;index <= numRegisteredCalls;) {
            System.out.println("The call " + index + " is: " + calls[index-1]);
            index = numRegisteredCalls+1;
        }
    }

    public double getTotalCost() {
        int totalCost = 0;
        for (int i = 0; i < numRegisteredCalls; i ++) {
            totalCost += calls[i].getCost();
        }
        return totalCost;
    }
}