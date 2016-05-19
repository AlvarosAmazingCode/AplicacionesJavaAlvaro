package arrays;

public class Arrays {

	public static void main(String[] args) {
		int x[] = new int[1000000];
		int plazas = 0;
		while( plazas > 101){
			
			 plazas ++;
		}
		for(int i=0; i < 101;i++){
			x[plazas] = i;
			System.out.println(x[plazas]);
		}
	}

}
