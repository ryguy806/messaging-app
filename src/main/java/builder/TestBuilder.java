package builder;

public class TestBuilder {

    public static void main(String[] args){
        Movie ninjaAssassin = new MovieBuilder()
                .title("Ninja Assassin")
                .genre("Action")
                .length(99)
                .ninjas(true)
                .build();

        System.out.println(ninjaAssassin);
    }
}
