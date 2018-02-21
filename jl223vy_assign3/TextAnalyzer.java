package jl223vy_assign3;

public class TextAnalyzer {
	private String text="";
	public TextAnalyzer(String newT){
		text=newT;
	}
	public int charCount(){
		int count=0;
		for(int i=0; i<text.length(); i++){
			count++;
		}
		return count;
	}
	public int upperCaseCount(){
		int countUC=0;
		for(int i=0; i<text.length(); i++){
			if(Character.isUpperCase(text.charAt(i)))
					countUC++;
		}
		return countUC;
	}
    public int whitespaceCount(){
    	int countW=0;
    	for(int i=0; i<text.length(); i++){
    		if(Character.isWhitespace(text.charAt(i)))
    			countW++;
		}
    	return countW;
	}
    public int digitCount(){
    	int countD=0;
    	for(int i=0; i<text.length(); i++){
    		if(Character.isDigit(text.charAt(i)))
    			countD++;
		}
    	return countD;
	}
    public boolean containsChar(char ch){
    		return text.contains(Character.toString(ch));
    }
    public boolean containsString(String str){
    		return text.contains(str);
    }

}
