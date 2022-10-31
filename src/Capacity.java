public enum Capacity {
    EXSTRA_SMALL(0,10),
    SMALL(0,25),
    MEDIUM(40,50),
    LARGE(60,80),
    ESPECIALLY_LARGE(100,120);

    private int capacityFrom;
    private int capacityTo;

    Capacity(int capacityFrom, int capacityTo) {
        this.capacityFrom = capacityFrom;
        this.capacityTo = capacityTo;
    }

    @Override
    public String toString() {
        String capacity = capacityFrom > 0 ? capacityFrom + " - " + capacityTo : String.valueOf(capacityTo);
        return "Вместимость: " +capacity + " мест.";
     }
}
