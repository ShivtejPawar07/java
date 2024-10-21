package sy;

public class SYMarks {
    public int comptot;
    public int mathtot;
    public int electronics;

    public SYMarks(int ct, int mt, int et) {
        comptot = ct;
        mathtot = mt;
        electronics = et;
    }

    public String toString() {
        return comptot + "\t" + mathtot + "\t" + electronics;
    }
}
