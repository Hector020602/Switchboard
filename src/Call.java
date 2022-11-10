public class Call {
    private String sourceCall;
    private String destinationNumber;
    private int callDuration;
    private int band;
    private boolean wasLocal;
    private long cost;

    public static final int LOCAL_PRICE_CENT_PER_SEC = 15;
    public static final int BAND1_PRICE_CENT_PER_SEC = 20;
    public static final int BAND2_PRICE_CENT_PER_SEC = 25;
    public static final int BAND3_PRICE_CENT_PER_SEC = 30;

    public Call(String sourceCall, String  destinationNumber, int callDuration, int band, boolean wasLocal) {
        this.sourceCall = sourceCall;
        this.destinationNumber = destinationNumber;
        this.callDuration = callDuration;
        this.band = band;
        if (this.band < 1) {
            band = 1;
            this.band = band;
        }
        if (this.band > 3) {
            band = 3;
            this.band = band;
        }
        this.wasLocal = wasLocal;
    }

    public long getCost() {
        if (wasLocal == true){
            cost = LOCAL_PRICE_CENT_PER_SEC*callDuration;
            return cost;
        }
        if (band == 1){
            cost = BAND1_PRICE_CENT_PER_SEC*callDuration;
            return cost;
        } else if (band == 2) {
            cost = BAND2_PRICE_CENT_PER_SEC*callDuration;
            return cost;
        } else {
            cost = BAND3_PRICE_CENT_PER_SEC*callDuration;
            return cost;
        }
    }

    @Override
    public String toString() {
        return "(Incoming number: " + sourceCall +
                ", Destination number: " + destinationNumber +
                ", Call Duration: " + callDuration +
                ", Band: " + band + ", Local: " + wasLocal; }
}