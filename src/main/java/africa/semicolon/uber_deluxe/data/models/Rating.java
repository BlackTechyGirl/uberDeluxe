package africa.semicolon.uber_deluxe.data.models;

public enum Rating {
    BAD(1),
    EXCELLENT(2),
    GOOD(3),
    SATISFACTORY(4);

    private int rating;
    public int getRating(){
        return rating;
    }
    Rating(int rating){
        this.rating = rating;
    }
}
