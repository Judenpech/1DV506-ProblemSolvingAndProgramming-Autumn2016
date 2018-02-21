package jl223vy_assign2;

public class Reverse {
	public static void main(String[] args){
		char[] text={'!', 'y', 's', 'a', 'E', ' ', 's', 'a', 'w', ' ', 's', 'i', 'h', 'T' };
		for(char element: text){
			System.out.print(element);
		}
		System.out.println();
		char temp;
		for(int i=0,j=text.length-1; i<text.length/2; i++,j--){
			temp=text[j];
			text[j]=text[i];
			text[i]=temp;
		}
/* method 2
		for(int i=text.length-1; i>=0; i--){
			for(int j=0; j<=i-1; j++){
				temp =text[j];  
                text[j]=text[j+1];  
                text[j+1]=temp;
			}
		}
*/
		for(int i=0; i<text.length; i++){
			System.out.print(text[i]);
		}
	}

}
