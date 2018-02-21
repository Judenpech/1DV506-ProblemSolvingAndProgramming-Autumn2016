package jl223vy_assign3;

public class AlarmMain {
	public static void main(String[] args){
		AlarmClock ac=new AlarmClock(23,48);
		ac.displayTime();
		ac.setAlarm(6,15);
		for(int i=1; i<=500; i++){
			ac.timeTick();
		}
		ac.displayTime();
	}

}
