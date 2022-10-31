public enum TypeBody {
    SEDAN(" седан"),
    KYPE("куппе"),
    UNIWERSAL("универсал"),
    VNEDOROCHNIK("внедорожник"),
    CROSSOVEW("кроссовер"),
    PIKAP("пикап"),
    FURGON("фургон"),
    MINIWEN("минивен");

    private String name;

    TypeBody(String name) {
        this.name = name;
    }

     public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return " тип кузова: "+ this.name;
    }
}
