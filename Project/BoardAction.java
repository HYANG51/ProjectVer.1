package Project;

import java.util.ArrayList;
import java.util.Scanner;

public interface BoardAction {
	ArrayList<Object> arr = new ArrayList<>();
	public BoardCommand execute(Scanner sc);
}

