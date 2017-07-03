 package jl223vy_assign4.newsagency;

public class NewsAgencyMain {
	public static void main(String[] args){
		NewsAgency na=new NewsAgency();
		
		na.Register("The Guardian");
		na.Register("The Daily Mail");
		
		na.sendNews("The Guardian", "Can Latin America avoid the global vortex in 2017? "
				+"After a year of disaster for the left, isolation and weak strategic "
				+"importance could turn out to be blessings for the region.\n");
		
		na.sendNews("The Daily Mail", "Russian airlift: Moscow sends plane "
				+ "to ferry its 35 expelled diplomats and families out of U.S."
				+" as Putin REFUSES to retaliate against 'lame duck' Obama's punishment for hacking Hillary.\n");
		
		System.out.println(na.ToString("The Guardian"));  //why the "null" in front of news?
		System.out.println(na.ToString("The Daily Mail"));
	}

}
