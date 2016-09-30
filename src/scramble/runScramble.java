package scramble;

public class runScramble{
	
	
	public static String scrambleWord(String word){
		
		String scrambled = "";
		for(int i = 0; i < word.length() - 1; i++){
			
			if (word.substring(i, i+2).equals("AA")){
				scrambled = scrambled + "A";
				//System.out.println("A");
			} else if (word.substring(i, i+1).equals("A")){
				scrambled = scrambled + word.substring(i+1, i+2) + word.substring(i, i+1);
				//System.out.println(word.substring(i+1, i+2) + word.substring(i, i+1));
				i++;
			} else {
				scrambled = scrambled + word.substring(i, i+1);
				//System.out.println(word.substring(i, i+1));
			}
		}
		
		System.out.println(scrambled.substring(scrambled.length()-1).equals("A"));
		
		return scrambled ;
	}
	
	
	public static void main(String[] args){
		
		System.out.println(scrambleWord("TAAN"));
		System.out.println(scrambleWord("TAANB"));
		System.out.println(scrambleWord("AARDVARK"));
		System.out.println(scrambleWord("ABRACADABRA"));
		
	}
}