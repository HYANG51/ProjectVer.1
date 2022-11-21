package Project;

import java.util.Scanner;

public class BoardContent implements BoardAction {

	@Override
	public BoardCommand execute(Scanner sc) {
		System.out.print("조회할 게시글 번호>");
		int see = sc.nextInt();
		
		if (((BoardCommand) arr.get(see - 1)).equals(null)) {
			System.out.println("게시글이 없습니다.");
			return null;
		} else {
			System.out.println("---------------내용---------------");
			System.out.println(((BoardCommand) arr.get(see - 1)).getTitle());
			System.out.println(((BoardCommand) arr.get(see - 1)).getContent());
			System.out.println(((BoardCommand) arr.get(see - 1)).getName());
			System.out.println();
		}
		
/*
		if (arr.isEmpty()) {
			
		}

		System.out.print("조회할 게시글 번호 >");
		see = sc.nextInt();
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i).equals(see-1)) {
				System.out.println(arr.get(i));
			}
		}
		if (true){
			
			System.out.println();
			
		}
		else if (arr.size() != see){
			System.out.println("조회할 내용이 없습니다.");
		}
		*/
		return null;
	}
}
