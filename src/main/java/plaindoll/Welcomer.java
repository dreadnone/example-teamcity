package plaindoll;

public class Welcomer{
	// Если хочешь больше веселья и информации про ДевОпс - приходи в мои каналы NotOps (telegram, YT, Boosty, Patreon)
	// https://t.me/notopsofficial
	public String sayWelcome() {
		return "Welcome home, good hunter. What is it your desire?";
	}
	public String sayFarewell() {
		return "Farewell, good hunter. May you find your worth in waking world.";
	}
	public String sayNeedGold(){
		return "Not enough gold";
	}
	public String saySome(){
		return "something in the way";
	}
}
public String getHunterReply() {
    String[] replies = {
        "The hunter stalks its prey in the digital jungle",
        "A true hunter never gives up the chase",
        "The night is dark and full of hunters"
    };
    return replies[new java.util.Random().nextInt(replies.length)];
}