package jl223vy_assign4.newsagency;

public class NewsAgency {
	private int size=0;
	private int length=8;
	private String[] newspaper;
	private String[] news;
	
	public NewsAgency(){
		newspaper=new String[length];
		news=new String[length];
	}
	
	public void Register(String newspaperName){
		if(size==length)
			Resize();
		newspaper[size++]=newspaperName;
	}
	
	private void Resize(){
		length=2*length;
		String[] tmpP=new String[length];
		String[] tmpN=new String[length];
		for(int i=0; i<size; i++){
			tmpP[i]=newspaper[i];
			tmpN[i]=news[i];
		}
		newspaper=tmpP;
		news=tmpN;
		
	}
	public void sendNews(String newspaperName, String news){
		for(int i=0; i<size; i++){
			if(newspaper[i]==newspaperName){
				this.news[i]=this.news[i]+news;
				agencyBroadcast(i, news);
				break;	
			}
		}
	}
	
	private void agencyBroadcast(int exp, String news){
		for(int i=0; i<size; i++){
			if(i==exp)
				continue;
			this.news[i]=this.news[i]+news;
		}
	}
	
	public String ToString(String newspaperName){ 
		int j=0;
		for(; j<size; j++){
			if(newspaper[j]==newspaperName)
				break;
		}
		return newspaper[j]+":\n"+news[j]+"\n";
	}

}
