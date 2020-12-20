package fallmerayer.enums;


/**
 *  Enum CandyType
 *
 *  Contains 7 enums for types of candy
 *  <p></p>
 *  Also contains 1 enum for triggering an error message
 *  With the constructor parameter it defines the addiction of a type of candy {@link CandyType#candy_addiction}
 */
public enum CandyType {
    CARAMELS(9),
    CHOCOLATE(5),
    GUMMIES(4),
    LICORICE(3),
    LOLLIPOPS(2),
    CHEWING_GUMS(3),
    COTTON_CANDY(1),
    ERROR;

    /**
     * contains the amount of addiction the candy has.
     * The higher the number, the more addictive the candy is
     */
    private int candy_addiction;

    /**
     * This constructor initializes the candy with a certain value that defines the addiction to the respective candy
     *
     * @param candy_addiction addiction of a type of candy
     */
    // Konstruktor mit Parameter
    CandyType(int candy_addiction){
        this.candy_addiction = candy_addiction;
    }

    /**
     * Constructor for initializing ERROR enum.
     * It doesn't need a parameter because it doesn't have an addiction value @see candy_addiction
     */
    // Konstruktor ohne Parameter
    // Für das Enum "ERROR"
    CandyType(){
    }

    /**
     * To return the enum for a respective string
     * eg. String input = "chocolate" -- candy = CHOCOLATE
     * @param input gets a String from Application to convert to enum
     * @return CandyType (enum) eg. COTTON_CANDY
     */
    public static CandyType fromName(String input) {
        for (CandyType candy : CandyType.values()){
            if (candy.toString().equals(input.toUpperCase()))
                return candy;
        }
        return ERROR;
    }

    /**
     * Returns a random enum from CandyType
     *
     * @return random enum eg. GUMMIES
     */
    public static CandyType random(){
        int zahl = (int) (Math.random()*(7-1)+1);

        return CandyType.values()[zahl];
    }


    /**
     * Function to get the addictive quality of a type of candy
     * @return candy addiction variable
     */
    public int addictiveQuality(){
        return candy_addiction;
    }

    /**
     * Function to find the next more addictive candy than the given type of candy.
     * With an if statements the function excludes the types of candy
     * that have a lower addictive quality or are the same as the given type of candy
     * then it chooses the candy with the lowest addictive quality
     *
     * @return returns a type of candy
     */
    public CandyType next(){
        CandyType returnCandy = null;
        for(CandyType candy : CandyType.values()){
            int prev = 10;

            if (candy_addiction == 9)
                return CARAMELS;

            if (candy_addiction < candy.addictiveQuality()) {
                if (candy.addictiveQuality() <= prev){
                    prev = candy.candy_addiction;
                    returnCandy = candy;
                }
            }


        }

        return returnCandy;
    }
}
