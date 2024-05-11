package Main;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import Data.data;

public class main {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		List<data> list = List.of(new data("北海道", "札幌市", 83424),
				 new data("青森県", "青森市", 9646),
				 new data("岩手県", "盛岡市", 15275),
				 new data("宮城県", "仙台市", 7282),
				 new data("秋田県", "秋田市", 11638),
				 new data("山形県", "山形市", 9323),
				 new data("福島県", "福島市", 13784),
				 new data("茨城県", "水戸市", 6097),
				 new data("栃木県", "宇都宮市", 6408),
				 new data("群馬県", "前橋市", 6362),
				 new data("埼玉県", "さいたま市", 3798));
		
		String[] array = scanner.nextLine().split(" ");
		List<Integer> noList = Stream.of(array[0].split(",")).mapToInt(Integer::parseInt).boxed().toList();
		Comparator<data> order = "降順".equals(array[1]) ? Comparator.reverseOrder() : Comparator.naturalOrder();
		list.stream().filter(p -> noList.contains(p.getNo())).sorted(order).forEach(System.out::println);
	}
}
