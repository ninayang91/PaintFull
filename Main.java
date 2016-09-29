import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class Main {
	
	public static void main(String[] args){
		

		
	}
	
	enum Color{
		Black,White,Red,Yellow, Purple,Green;
	}
	
	public static boolean paintFull(Color[][] screen, int x, int y, Color nc){
		if(screen[y][x]==nc)return false;//if it is already new color, we do nothing
		Color oc=screen[y][x];
		return paintFull(screen,x,y,oc,nc);
	}
	
	public static boolean paintFull(Color[][] screen, int x, int y, Color oc,Color nc){
		if(x<0||y<0||x>screen[0].length||y>screen.length)return false;
		if(screen[y][x]==oc){//if it is old color, paint it to new color, all paint its surroundings
			screen[y][x]=nc;
			paintFull(screen,x+1,y,oc,nc);
			paintFull(screen,x-1,y,oc,nc);
			paintFull(screen,x,y+1,oc,nc);
			paintFull(screen,x,y-1,oc,nc);
		}
		return true;
	}



}
