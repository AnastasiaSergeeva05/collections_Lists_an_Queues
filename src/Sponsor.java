public class Sponsor {
    private final String name;
    private final float sponsorSum;
    private final boolean physical;

    public Sponsor(String name, float sponsorSum, boolean physical) {
        this.name = name;
        this.sponsorSum = sponsorSum;
        this.physical = physical;
    }

    public String getName() {
        return name;
    }

    public float getSponsorSum() {
        return sponsorSum;
    }

    public boolean isPhysical() {
        return physical;
    }
}
