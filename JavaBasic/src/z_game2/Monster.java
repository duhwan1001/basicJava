package z_game2;

public class Monster {

	String name;	// 이름
	int maxHp;		// 최대 체력
	int hp; 		// 체력
	int att; 		// 공격력
	int exp;
	int coin;
	
	Monster(String name, int hp, int att, int exp, int coin) {
		this.name = name;
		this.maxHp = hp;
		this.hp = this.maxHp;
		this.att = att;
		this.exp = exp;
		this.coin = coin;
	}
	
	public static Monster getMonster() {
		
		Monster[] monsters = new Monster[9];
		
		monsters[0] = new Monster("가시슬라임", 20, 20, 20, 20);
		monsters[1] = new Monster("산성슬라임", 30, 20, 30, 30);
		monsters[2] = new Monster("공벌레", 40, 25, 40, 40);
		monsters[3] = new Monster("그렘린", 55, 25, 50, 50);
		monsters[4] = new Monster("어두미", 60, 25, 50, 60);
		monsters[5] = new Monster("스네코", 70, 30, 70, 70);
		monsters[6] = new Monster("도적단", 80, 30, 80, 80);
		monsters[7] = new Monster("아귀", 90, 30, 90, 90);
		monsters[8] = new Monster("꿈틀이", 100, 40, 150, 120);
		
		int ran = (int)(Math.random() * 9);
		
		return monsters[ran];
	}
	
	void attack(Character c){
		int damage = att - c.def;
		damage = damage <= 0 ? 1 : damage;
		c.hp = c.hp < damage ? c.hp - c.hp : c.hp - damage;
		System.out.println(name + "가 공격으로 " + c.name + "에게"
				+ damage + "만큼 데미지를 주었습니다.");
		System.out.println(c.name + "의 남은 HP : " + c.hp);
	}
	
}
