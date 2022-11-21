package Project;

import java.util.Scanner;

public class BoardContent implements BoardAction {

	@Override
	public BoardCommand execute(Scanner sc) {
		/*	System.out.print("조회할 게시글 번호>");
		int see = sc.nextInt();
		for (see = 0; see < arr.size(); see++) {
			if(see > 0) {
				System.out.print(((BoardCommand) arr.get(see)).getContent());
				System.out.println();
			}else if(see <= 0){
				System.out.println("조회할 내용이 없습니다.");
			}
		}
		return null;
	}*/

		if (arr.isEmpty()) {
			System.out.println("게시글이 없습니다.");
			return null;
		}

		System.out.print("조회할 게시글 번호 >");
		int see = sc.nextInt();
		for (int i = 0; i < arr.size(); i++) {
			if (arr[i].) {
				
			}
		}
		/*if (){
			System.out.println("---------------내용---------------");
			System.out.println();
			
		}
		else if (arr.size() != see){
			System.out.println("조회할 내용이 없습니다.");
		}
		return null;*/
	}
}
