import java.util.*;
import java.util.Random;
public class ht {

	public ht() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("���ȭ��1������2ʯͷ��3����");		
		int player=in.nextInt();
		int computer=( new Random().nextInt(3)+1);
		if(player==computer){
			System.out.print("ƽ��");
		}
		else if(((player<computer)&&(computer-player==1))||(player-computer==2)){
			System.out.print("����Ӯ");
		}
		else{
			System.out.print("���Ӯ");
			
			//Add from local
			System.out.println("Add from local");
		}

	}

}
