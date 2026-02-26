package plaindoll;

import java.util.Random;

public class Welcomer {
    
    private static final String[] HUNTER_REPLIES = {
        "The hunter stalks its prey in the digital jungle",
        "A true hunter never gives up the chase",
        "The night is dark and full of hunters"
    };
    
    private static final Random RANDOM = new Random();
    
    public String sayWelcome() {
        return "Welcome";
    }
    
    public String sayFarewell() {
        return "Farewell";
    }
    
    public String sayHunter() {
        return "Hunter";
    }
    
    public String saySilver() {
        return "Silver";
    }
    
    public String getHunterReply() {
        return HUNTER_REPLIES[RANDOM.nextInt(HUNTER_REPLIES.length)];
    }
}