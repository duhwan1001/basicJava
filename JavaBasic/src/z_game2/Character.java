package z_game2;

public class Character {
	
	String name;		//이름
	int maxHp;			//최대 체력
	int hp;				//체력
	int att;			//공격력	
	int def;			//방어력
	int level;			//레벨
	int exp;			//경험치
	int coin;			//코인
	Item[] items;		//보유 아이템	
	StartRelic startRelic;	//유물
	
	Character(String name, int hp, int att, int def){
		this.name = name;
		this.maxHp = hp;
		this.hp = this.maxHp;
		this.att = att;
		this.def = def;
		this.level = 1;
		this.exp = 0;
		this.items = new Item[5];
	}
	
	public static Character getCharacter(int num) {
		switch (num) {
		case 1:
			return new Character("아이언 클래드", 120, 15, 5);
		case 2:
			return new Character("사일런트", 100, 18, 5);
		case 3:
			return new Character("왓쳐", 95, 20, 5);
		}
		return null;
	}
	
	void showInfo(){
		System.out.println("==========================");
		System.out.println("---------- 상태 -----------");
		System.out.println("이름 : " + name);
		System.out.println("레벨 : " + level + "(" + exp + "/" + (100 * level) + ")");
		System.out.println("체력 : " + hp + "/" + maxHp);
		System.out.println("공격 : " + att);
		System.out.println("방어 : " + def);
		System.out.println("코인 : " + coin);
		System.out.println("------- 사용한 아이템 -------");
		for(int i = 0; i < items.length; i++){
			if(items[i] != null){
				System.out.println(i + 1 + ". " + items[i].name);
			}
		}
		System.out.println("---------- 유  물 ----------");
		System.out.println(startRelic.itemInfo());
		System.out.println("==========================");
	}
	
	void relicEffect(StartRelic startRelic){
		this.startRelic = startRelic;
		if(0 < startRelic.maxHp) {
			this.maxHp += startRelic.maxHp;
			this.hp = this.maxHp;
			System.out.println("최대 체력이 " + startRelic.maxHp + "만큼 올랐습니다.");
			System.out.println("---------------------------------------");
		}
		if(0 < startRelic.att) {
			this.att += startRelic.att;
			System.out.println("공격력이 " + startRelic.att + "만큼 올랐습니다.");
			System.out.println("---------------------------------------");
		}
		if(0 < startRelic.def) {
			this.def += startRelic.def;
			System.out.println("방어력이 " + startRelic.def + "만큼 올랐습니다.");
			System.out.println("---------------------------------------");
		}
	}
	
	void attack(Monster m){
		int damage = att;
		damage = damage <= 0 ? 1 : damage;
		m.hp = m.hp < damage ? m.hp - m.hp : m.hp - damage;
		System.out.println(name + "가 공격으로 " + m.name + "에게"
				+ damage + "만큼 데미지를 주었습니다.");
		System.out.println(m.name + "의 남은 HP : " + m.hp);
	}
	
	void getExp(Monster m){
		System.out.println(m.exp + "의 경험치를 획득하였습니다.");
		this.exp += m.exp;
		while(100 * level <= this.exp){
			this.exp -= 100 * level;
			levelUp();
		}
	}
	
	void getCoin(Monster m){
		System.out.println(m.coin + "코인을 획득하였습니다.");
		this.coin += m.coin;
	}
	
	
	void levelUp(){
		level++;
		maxHp *= 1.1;
		att *= 1.1;
		def *= 1.1;
		hp = maxHp;
		System.out.println("★  L E V E L   U P ★");
	}
	
	void sleep(){
		int charge = (int)(maxHp * 0.3);
		hp += charge;
		if (maxHp < hp) {
			hp = maxHp;
			System.out.println("체력이 모두 회복되었습니다.");
		} else {
			System.out.println("체력이 " + charge + " 회복되었습니다.");
		}
	}
	
	void getItem(Item item){
		coin -= item.coin;
		System.out.println(item.name + "을 획득하였습니다.");
		for(int i = 0; i < items.length; i++){
			if(items[i] == null){
				items[i] = item;
				break;
			}
		}
		hp += item.hp;
		maxHp += item.maxHp;
		att += item.att;
		def += item.def;
	}
	
}


