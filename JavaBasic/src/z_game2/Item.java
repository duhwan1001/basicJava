package z_game2;

public class Item {
	
	String name;	//이름
	int hp;			//체력
	int maxHp;
	int att;		//공격력
	int def;		//방어력
	int coin;
	
	Item(String name, int hp, int maxHp, int att, int def, int coin){
		this.name = name;
		this.hp = hp;
		this.maxHp = maxHp;
		this.att = att;
		this.def = def;
		this.coin = coin;
	}
	
	public static Item[] getItems() {
		
		Item[] items = new Item[10];
		
		items[0] = new Item("체력 포션 +30", 30, 0, 0, 0, 50);
		items[1] = new Item("체력 포션 +50", 50, 0, 0, 0, 80);
		items[2] = new Item("체력 포션 +100", 100, 0, 0, 0, 100);
		items[3] = new Item("공격 버프 +10", 0, 0, 10, 0, 50);
		items[4] = new Item("공격 버프 +30", 0, 0, 30, 0, 100);
		items[5] = new Item("방어 상승 +10", 0, 0, 0, 10, 50);
		items[6] = new Item("방어 상승 +30", 0, 0, 0, 30, 100);
		items[7] = new Item("불타는 혈액 (최대 HP +20)", 0, 20, 0, 0, 200);
		items[8] = new Item("부서진 핵 (공격력 +5)", 0, 0, 5, 0, 200);
		items[9] = new Item("순수한 물 (방어력 +5)", 0, 0, 0, 5, 200);
		
		
		return items;
		
	}
		
	String itemInfo(){
		String info = coin + "코인  \t> " + name;
//		if(0 < hp) info += " 체력+" + hp;
//		if(0 < maxHp) info += "최대 체력+" + maxHp;
//		if(0 < att) info += " 공격+" + att;
//		if(0 < def) info += " 방어+" + def;
		return info;
	}
	
}	
