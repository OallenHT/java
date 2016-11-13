import java.util.*;
import java.util.Random;
public class ht {

	public ht() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("请出拳（1剪刀，2石头，3布）");		
		int player=in.nextInt();
		int computer=( new Random().nextInt(3)+1);
		if(player==computer){
			System.out.print("平局");
		}
		else if(((player<computer)&&(computer-player==1))||(player-computer==2)){
			System.out.print("电脑赢");
		}
		else{
			System.out.print("玩家赢");
			
			//Add from local
			System.out.println("Add from local");
		}

	}

}
