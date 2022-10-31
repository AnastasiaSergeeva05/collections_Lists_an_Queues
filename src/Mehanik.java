public class Mehanik {
    private final String fullName;
    private final String company;
    private final boolean fixesCars;
    private final boolean fixesBus;
    private final boolean fixesTruck;

    public Mehanik(String fullName,
                   String company,
                   boolean fixesCars,
                   boolean fixesBus,
                    boolean fixesTruck) {
        this.fullName = fullName;
        this.company = company;
        this.fixesCars = fixesCars;
        this.fixesBus = fixesBus;
        this.fixesTruck = fixesTruck;
    }

    public void service(Transport transport){

    }

    public void fixTransport(Transport transport){

    }

    public String getFullName() {
        return fullName;
    }

    public String getCompany() {
        return company;
    }

    public boolean isFixesCars() {
        return fixesCars;
    }

    public boolean isFixesBus() {
        return fixesBus;
    }

    public boolean isFixesTruck() {
        return fixesTruck;
    }
}
