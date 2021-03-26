package z_game2;

public class Relic {

	String name;		//이름
	int maxHp;			//최대체력
	int maxMp;			//최대마나
	int att;			//공격력	
	int def;			//방어력
	
	Relic(String name, int maxHp, int maxMp, int att, int def){
		this.name = name;
		this.maxHp = maxHp;
		this.maxMp = maxMp;
		this.att = att;
		this.def = def;
	}
	
	String itemInfo(){
		String info = name + " :";
		if(0 < maxHp) info += " 체력+" + maxHp;
		if(0 < maxMp) info += " 마나+" + maxMp;
		if(0 < att) info += " 공격+" + att;
		if(0 < def) info += " 방어+" + def;
		return info;
	}
	
}

class BurningBlood extends Relic{
	BurningBlood(String name, int maxHp, int maxMp, int att, int def) {
		super("불타는 혈액", 20, 0, 0, 0);
	}
}

class SnakeRing extends Relic{
	SnakeRing(String name, int maxHp, int maxMp, int att, int def) {
		super("뱀의 반지", 0, 20, 0, 0);
	}
}

class CrackedCore extends Relic{
	CrackedCore(String name, int maxHp, int maxMp, int att, int def) {
		super("부서진 핵", 0, 0, 5, 0);
	}
}

class PureWater extends Relic{
	PureWater(String name, int maxHp, int maxMp, int att, int def) {
		super("순수한 물", 0, 0, 0, 5);
	}
}
























