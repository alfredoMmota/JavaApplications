package clases;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Escenario {
	
	private static int [][] Contorno = {{0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0},
			                            {0,0,0,0,0,0,0,0,0,0,0},{0,0,1,1,1,1,1,1,0,0,0,0,0,0},{0,0,1,1,0,0,1,1,0,0,0,0,0,0},
			                            {0,0,1,1,0,0,1,1,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0},
			                            {0,0,0,0,0,1,1,1,0,0,0},{0,0,0,0,0,1,1,1,0,0,0}};
	private static char Agente = 'G';   
	private static int xMovAgente;
	private static int yMovAgente;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		
		System.out.println("Matriz Inicial sin Agente");
		System.out.println();
        for (int[] num : Contorno) {
            for (int elem : num) {
            	if(elem == 0) {

                System.out.print("|__|" + "\t"); // Tabulador
            	}
            	else {
            		if(elem == 1)
            			System.out.print("    " + "\t"); // Tabulador
            	}
            }
            System.out.print("\n"); // Salto de Línea
        }
        System.out.println();
        System.out.println("Seleccione Y si desea insertar el agente");
        Scanner scann = new Scanner(System.in);
        String entrada = scann.next(); 
        System.out.println("Matriz Inicial insertando Agente");
		System.out.println();
		int pos1 = (int)(11.0 * Math.random());
		int pos2 = (int)(14.0 * Math.random());
		if(Contorno[pos1][pos2]==0) {
		Contorno[pos1][pos2] = 7;
		}else {
			if(Contorno[pos1][pos2]==1)
				System.out.println("La generación de la posición aleatoria del agente está fuera de rango");
			    System.out.println("Vuelva a empezar");
		}
        for (int[] num : Contorno) {
            for (int elem : num) {
            		if(elem == 7)
            			System.out.print("|"+Agente+" |" + "\t"); // Tabulador
           
            	if(elem == 0) {

                System.out.print("|__|" + "\t"); // Tabulador
            	}
            	else {
            		if(elem == 1)
            			System.out.print("    " + "\t"); // Tabulador
            	}
            }
            System.out.print("\n"); // Salto de Línea
        }
        
        System.out.println();
        System.out.println("Seleccione Y si desea visualizar el movimiento del agente");
        Scanner scann1 = new Scanner(System.in);
        String entrada1 = scann.next();

        ArrayList<Integer> result = new ArrayList<Integer>();
        ArrayList<Integer> newresult = new ArrayList<Integer>();
        result =  MovimientoAgente(pos1, pos2);
        xMovAgente =  result.get(0);
		yMovAgente = result.get(1);
		boolean flag = true;
        	do {
        	           		
        		result = MovimientoAgente(xMovAgente,yMovAgente);
        		xMovAgente =  result.get(0);
        		yMovAgente = result.get(1);
        		newresult = PosAgente(xMovAgente, yMovAgente); 
        		if(Contorno[newresult.get(0)][newresult.get(1)] == 7 ) {
        			flag = false;
        		}
        		
			} while (flag);
     
        System.out.println();
        for (int[] num : Contorno) {
            for (int elem : num) {
            		if(elem == 7)
            			System.out.print("|"+Agente+" |" + "\t"); // Tabulador
           
            	if(elem == 0) {

                System.out.print("|__|" + "\t"); // Tabulador
            	}
            	else {
            		if(elem == 1)
            			System.out.print("    " + "\t"); // Tabulador
            	}
            }
            System.out.print("\n"); // Salto de Línea
        }
        

	}
	
	public static int PosS1(int p, int p1) {
		int pos=0;
		try {
			if(Contorno[p-1][p1-1] != 1 || Contorno[p-1][p1-1] != 7) {
				pos = Contorno[p-1][p1-1];
			}
		} catch (Exception e) {
			// TODO: handle exception
			pos=1;
		}
		
		return pos;
	}

	public static int PosS2(int p, int p1) {
		int pos=0;
		try {
			if(Contorno[p - 1][p1] != 1 || Contorno[p - 1][p1] != 7) {
				pos = Contorno[p - 1][p1];
			
			}
		} catch (Exception e) {
			// TODO: handle exception
			pos=1;
		}
		
		return pos;

	}

	public static int PosS3(int p, int p1) {
		int pos=0;
		try {
			if(Contorno[p - 1][p1 + 1] != 1 || Contorno[p - 1][p1 + 1] != 7) {
				pos = Contorno[p - 1][p1 + 1];
			
			}
		} catch (Exception e) {
			// TODO: handle exception
			pos=1;
		}
		
		return pos;

	}

	public static int PosS4(int p, int p1) {
		int pos=0;
		try {
			if(Contorno[p][p1 + 1] != 1 || Contorno[p][p1 + 1] != 7) {
				pos = Contorno[p][p1 + 1];
			
			}
		} catch (Exception e) {
			// TODO: handle exception
			pos=1;
		}
		
		return pos;
		
	}

	public static int PosS5(int p, int p1) {
		int pos=0;
	   try {
		   if(Contorno[p + 1][p1 + 1] != 1 || Contorno[p + 1][p1 + 1] != 7) {
				pos = Contorno[p + 1][p1 + 1];
			
			}
	} catch (Exception e) {
		// TODO: handle exception
		pos=1;
	}      
		return pos;
	}

	public static int PosS6(int p, int p1) {
		int pos=0;
		try {
			if(Contorno[p + 1][p1] != 1 || Contorno[p + 1][p1] != 7) {
				pos = Contorno[p + 1][p1];
			
			}
		} catch (Exception e) {
			// TODO: handle exception
			pos=1;
		}
		
		return pos;
	}

	public static int PosS7(int p, int p1) {
		int pos=0;
		try {
			if(Contorno[p + 1][p1 - 1] != 1 || Contorno[p + 1][p1 - 1] != 7) {
				pos = Contorno[p + 1][p1 - 1];
			
			}
		} catch (Exception e) {
			// TODO: handle exception
			pos=1;
		}
		return pos;
	
	}

	public static int PosS8(int p, int p1) {
		int pos=0;
		try {
			if(Contorno[p][p1 - 1] != 1 || Contorno[p][p1 - 1] != 7) {
				pos = Contorno[p][p1 - 1];
			
			}
		} catch (Exception e) {
			// TODO: handle exception
			pos=1;
		}
		
		return pos;

	}
	
	public static ArrayList<Integer> MovimientoAgente(int x, int y) {
		
		ArrayList<Integer> pos = new ArrayList<Integer>();
		
		int x1 = 0;
		int x2 = 0;
		int x3 = 0;
		int x4 = 0;
		
		int S1 = PosS1(x, y);
		int S2 = PosS2(x, y);
		int S3 = PosS3(x, y);
		int S4 = PosS4(x, y);
		int S5 = PosS5(x, y);
		int S6 = PosS6(x, y);
		int S7 = PosS7(x, y);
		int S8 = PosS8(x, y);
		
		if( S2 == 1 || S3 == 1) {
		x1 = 1;
		}
		if(S4 == 1 || S5 == 1) {
			x2 = 1;
			}
		if(S6== 1 || S7 == 1) {
			x3 = 1;
			}
		if(S8== 1 || S1 == 1) {
			x4 = 1;
			}
		
		if(x1 == 1 && x2 == 0) {
			//Movimiento hacia el Este
			if(Contorno[x][y+1] == 0) {
			Contorno[x][y+1] = 7;
			pos.add(0, x);
			pos.add(1,y+1);
			}
		}
		if(x2 == 1 && x3 == 0) {
			// Movimiento hacia el Sur
			if(Contorno[x+1][y] == 0) {
			Contorno[x+1][y] = 7;
			pos.add(0, x+1);
			pos.add(1,y);
			}
		}
		if(x3 == 1 && x4 == 0) {
			// Movimiento hacia el Oeste
           if(Contorno[x][y-1] == 0) {
			Contorno[x][y-1] = 7;
			pos.add(0, x);
			pos.add(1,y-1);
           }
		}
		if(x4 == 1 && x1 == 0) {
			// Movimiento hacia el Norte
			if(Contorno[x-1][y] == 0) {
			Contorno[x-1][y] = 7;
			pos.add(0, x-1);
			pos.add(1,y);
			}
		}
		else {
			//Si ninguna de las caracterisiticas entonces Norte
			if(x1 != 1 && x2 != 1 && x3 != 1 && x4 != 1 ) {
			if(Contorno[x-1][y] == 0) {
			Contorno[x-1][y] = 7;
			pos.add(0, x-1);
			pos.add(1,y);
			}
		  }
		}
		return pos;
	}
	
public static ArrayList<Integer> PosAgente(int x, int y) {
		
		ArrayList<Integer> pos = new ArrayList<Integer>();
		
		int x1 = 0;
		int x2 = 0;
		int x3 = 0;
		int x4 = 0;
		
		int S1 = PosS1(x, y);
		int S2 = PosS2(x, y);
		int S3 = PosS3(x, y);
		int S4 = PosS4(x, y);
		int S5 = PosS5(x, y);
		int S6 = PosS6(x, y);
		int S7 = PosS7(x, y);
		int S8 = PosS8(x, y);
		
		if( S2 == 1 || S3 == 1) {
		x1 = 1;
		}
		if(S4 == 1 || S5 == 1) {
			x2 = 1;
			}
		if(S6== 1 || S7 == 1) {
			x3 = 1;
			}
		if(S8== 1 || S1 == 1) {
			x4 = 1;
			}
		
		if(x1 == 1 && x2 == 0) {
			//Movimiento hacia el Este
			if(Contorno[x][y+1] == 0 || Contorno[x][y+1] == 7) {
			
			pos.add(0, x);
			pos.add(1,y+1);
			}
		}
		if(x2 == 1 && x3 == 0) {
			// Movimiento hacia el Sur
			if(Contorno[x+1][y] == 0 || Contorno[x+1][y] == 7) {
			
			pos.add(0, x+1);
			pos.add(1,y);
			}
		}
		if(x3 == 1 && x4 == 0) {
			// Movimiento hacia el Oeste
           if(Contorno[x][y-1] == 0 || Contorno[x][y-1] == 7) {
			
			pos.add(0, x);
			pos.add(1,y-1);
           }
		}
		if(x4 == 1 && x1 == 0) {
			// Movimiento hacia el Norte
			if(Contorno[x-1][y] == 0 || Contorno[x-1][y] == 7) {
			
			pos.add(0, x-1);
			pos.add(1,y);
			}
		}
		else {
			//Si ninguna de las caracterisiticas entonces Norte
			if(x1 != 1 && x2 != 1 && x3 != 1 && x4 != 1 ) {
			if(Contorno[x-1][y] == 0) {
			
			pos.add(0, x-1);
			pos.add(1,y);
			}
		  }
		}
		return pos;
	}

}
