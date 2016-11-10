package game;

public class GameText {
	public static String[] fieldTitles={
/*(001)*/	"Tribe Encampment",
/*(002)*/	"Crater",
/*(003)*/	"Mountain",
/*(004)*/	"Cold Desert",
/*(005)*/	"Black cave",
/*(006)*/	"The Werewall",
/*(007)*/	"Mountain village",
/*(008)*/	"South Citadel",
/*(009)*/	"Palace gates",
/*(010)*/	"Tower",
/*(011)*/	"Castle",
/*(012)*/	"Walled city",
/*(013)*/	"Monastery",
/*(014)*/	"Huts in the  mountain",
/*(015)*/	"The pit",
/*(016)*/	"Goldmine",
/*(017)*/	"Caravan",
/*(018)*/	"Second Sail",
/*(019)*/	"Sea Grover",
/*(020)*/	"The Buccaneers",
/*(021)*/	"Privateer armade"};
	public static String[] fieldSubText={
/*(101)*/	"1000",
/*(102)*/	"1500",
/*(103)*/	"2000",
/*(104)*/	"3000",
/*(105)*/	"4000",
/*(106)*/	"4300",
/*(107)*/	"4750",
/*(108)*/	"5000",
/*(109)*/	"5500",
/*(110)*/	"6000",
/*(111)*/	"8000",
/*(112)*/	"+5000",
/*(113)*/	"+500",
/*(114)*/	"2500",
/*(115)*/	"2500",
/*(116)*/	"-2000(tax)",
/*(117)*/	"-4000(tax)",
/*(118)*/	"4000",
/*(119)*/	"4000",
/*(120)*/	"4000",
/*(121)*/	"4000"};
	

	public static String[] fieldShortDescription={
/*(201)*/	"Tribe Encampment has a price of 1000, and a rent of 100",
/*(202)*/	"Crater has a price of 1500, and a rent of 300",
/*(203)*/	"Mountain has a price of 2000, and a rent of 500",
/*(204)*/	"Cold Desert has a price of 3000, and a rent of 700",
/*(205)*/	"Black Cave has a price of 4000, and a rent of 1000",
/*(206)*/	"The Werewall has a price of 4300, and a rent of 1300",
/*(207)*/	"Crater has a price of 4750, and a rent of 1600",
/*(208)*/	"South Citadel has a price of 5000, and a rent of 2000",
/*(209)*/	"Palace gates has a price of 5500, and a rent of 2600",
/*(210)*/	"Tower has a price of 6000, and a rent of 3200",
/*(211)*/	"Castle has a price of 8000, and a rent of 4000",
/*(212)*/	"When you land on the Walled city you receive a bonus of 5000",
/*(213)*/	"When you land on the Monastery you receive a bonus of 5000",
/*(214)*/	"2500",
/*(215)*/	"2500",
/*(216)*/	"-2000(tax)",
/*(217)*/	"-4000(tax)",
/*(218)*/	"4000",
/*(219)*/	"4000",
/*(220)*/	"4000",
/*(221)*/	"4000"};
	
	
	/**
	 * The method enterPlayerNames returns a string Which asks the players to enter their names.
	 * @param  The number of the player
	 * @return String
	 */
	
	public static String enterPlayerNameText(int number)
	{
		return "Please enter the name of player " + number;
	}
	
	/**
	 * The method welcomeText returns a string which contains the welcome text of the game.
	 * @return String
	 */
	
	public static String welcomeText()
	{	
		return "Welcome to 'A Tale of Tales' \n";
	}
	
	
	/**
	 * The method gameRules returns a string which contains the game rules.
	 * @return String
	 */
	public static String gameRulesText()
	{
		String gameRules = "";
		gameRules = "The game rules are as follows: \n";
		gameRules = gameRules 
			      + "- All players start with 1000 gold coins. \n"
				  + "- The first player to achieve 3000 gold coins wins the game. \n"
				  + "- A players funds are affected each turn. The amount depends on which field you land on in the current turn. \n"
				  + "- A player always lands on the field number corresponding to the sum of the dice. \n";
		return gameRules;
	}
	
	/**
	 * The firstTurn method returns a string which contains which player has 
	 * been randomly selected to start the game. 
	 * @param playerName The name of the player
	 * @return String
	 */
	public static String firstTurnText()
	{
		return "A player has been randomly selected to start the game. \n"; 
	}
	
	/**
	 * The method turn returns a string which contains whose turn it is.
	 * @param playerName The name of the player
	 * @return String
	 */
	public static String turnText(String playerName)
	{
		return "It is " + playerName + "'s turn \n";
	}
	
	/**
	 * The method extraTurn returns a string which tell who has got an extra turn.
	 * @param playerName The name of the player
	 * @return String
	 */
	public static String extraTurnText(String playerName)
	{
		return playerName + " has gained an extra turn \n";
	}
	
	/**
	 * The method rollText returns a String which contains what a particular player has rolled with the dice.
	 * @param playerName The name of the player (String).
	 * @param value A array of two dice values (Int[])
	 * @return String 
	 */
	public static String rollText(String playerName, int[] value)
	{
		return playerName + " has rolled a " + value[0] + " and a " + value[1] + "."+ "\n";
	}
	
	/**
	 * The method winnerText returns a String which contains which player has won the game
	 * @param playerName The name of the player.
	 * @return String
	 */
	public static String winnerText(String playerName)
	{
		return "Congratulations " + playerName + " has won the game! \n";
	}
}
