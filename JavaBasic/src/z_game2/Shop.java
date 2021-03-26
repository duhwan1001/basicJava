package z_game2;

public class Shop {

	Item[] items = Item.getItems();
	
	void showItem() {
		System.out.println("---------------------------------------");
		for (int i = 0; i < items.length; i++) {
			System.out.println(i + 1 + " : " + items[i].itemInfo());
		}
		System.out.println("---------------------------------------");
		System.out.println("구매 : 아이템 번호 입력(1~10)");
		System.out.println("상점 나가기 : 0");
	}
		
	boolean buyItem(Character c, int num) {
		Item item = items[num - 1];
		if (item.coin > c.coin) {
			System.out.println("코인이 부족합니다. 구매 가능한 아이템을 선택해주십시오.");
			return true;
		} else {
			c.getItem(items[num - 1]);
			return false;
		}
		
	}
	
}
