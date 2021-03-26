package z_game2;

public class StartRelic {

	String name;	//이름
	int maxHp;			//체력
	int att;		//공격력
	int def;		//방어력
	
	StartRelic(String name, int maxHp, int att, int def){
		this.name = name;
		this.maxHp = maxHp;
		this.att = att;
		this.def = def;
	}
	
	String itemInfo(){
		String info = name + " :";
		if(0 < maxHp) info += " 최대 체력+" + maxHp;
		if(0 < att) info += " 공격+" + att;
		if(0 < def) info += " 방어+" + def;
		return info;
	}
	
public static StartRelic getRelic() {
		
		StartRelic[] startrelic = new StartRelic[3];
		
		startrelic[0] = new StartRelic("피의 근원", 10, 0,0);
		startrelic[1] = new StartRelic("힘의 근원", 0, 10,0);
		startrelic[2] = new StartRelic("철의 근원", 0, 0,10);
		
		int ran = (int)(Math.random() * 3);
		
		return startrelic[ran];
		
		
	}
	

}
