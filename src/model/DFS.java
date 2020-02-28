package model;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DFS {



	/*
	 * 
	 * Busqueda en anchura... 
	 * 
	 * Crear una Queue agregar cada hijo, manteniendo el padre. 
	 * 
	 * Al finalizar, buscar cual fue el camino para recrearlo y arrojar el resultado 
	 * 
	 */

	Stack<Node> cola;
	Queue<Node> tree;
	String answere;
	String problem;
	Node root;

	public DFS() {
		super(); 
		this.cola = new Stack<Node>();
		this.tree = new LinkedList<Node>();
		this.answere = "";
		this.problem = "";
		this.root = null;
	}

	/*Generar 20 mov sobre el tablero*/

	private void addToQueue(Node node) {
		this.cola.add(node);
	};

	public void roat() {

		Node auxRoat = this.cola.pop();

		while (auxRoat != root) {
			//System.out.println(auxRoat.getMov());
			this.answere += auxRoat.getMov();
			auxRoat = auxRoat.getNodeFather();

		}
		this.answere = this.answere.substring(0, this.answere.length() - 1);
	}

	public void randomMov(Node cubeToMove) {

		int x;
		x = (int)(Math.random()*((12-1)+1));
		System.out.println("el resultado de tablero es: "+ x);
		switch (x) {
		case 0:
			cubeToMove.cubeToPlay.f();
			this.problem += 'f';
			break;
		case 1:
			cubeToMove.cubeToPlay.r();
			this.problem += 'r';
			break;
		case 2:
			cubeToMove.cubeToPlay.d();
			this.problem += 'd';
			break;
		case 3:
			cubeToMove.cubeToPlay.b();
			this.problem += 'b';
			break;
		case 4:
			cubeToMove.cubeToPlay.l();
			this.problem += 'l';
			break;
		case 5:
			cubeToMove.cubeToPlay.u();
			this.problem += 'u';
			break;
		case 6:
			cubeToMove.cubeToPlay.F();
			this.problem += 'F';
			break;
		case 7:
			cubeToMove.cubeToPlay.R();
			this.problem += 'R';
			break;
		case 8:
			cubeToMove.cubeToPlay.D();
			this.problem += 'D';
			break;
		case 9:
			cubeToMove.cubeToPlay.B();
			this.problem += 'B';
			break;
		case 10:
			cubeToMove.cubeToPlay.L();
			this.problem += 'L';
			break;
		case 11:
			cubeToMove.cubeToPlay.U();
			this.problem += 'U';
			break;
		default:
			break;
		}

	}

	void run(Cube cubeToPlay) {

		/* 1.Recibir el cubo a jugar
		 * 2.Crear nodo con cubo original, será el root
		 *  
		 * 3.Comparar si el cubo recibido es el cubo Ordenado: 
		 * 		V-> TERMINAR JUEGO F-> GENERAR HIJOS
		 * 4. when 3 is V -> GENERATE A STEPS
		 * 5.
		 * */
		System.out.println("*******START GAME************");

		Node root = new Node( null, 'O', cubeToPlay);
		this.addToQueue(root);

		for (int numMov= 1; numMov<=5; numMov++) {
			this.randomMov(this.cola.peek());
		}
		cubeToPlay.printCube();


		/*while false*/
		while ( !this.cola.peek().compare() ) {
			/*
			 * 
			 * generar los 12 hijos 
			 * agregarlos a la cola
			 * sacar de la pila principal al nodo examinado meterno en la cola aux
			 * 
			 * */
			//this.cola.peek().cubeToPlay.printCube();

			//generar los 12 hijos
			this.generateMov(this.cola.peek());

			//agregar a la lista de explorados

			this.tree.add(this.cola.pop());
			//System.out.println("size queue="+ this.cola.size());
			//System.out.println("size tree="+ this.tree.size());
		}
		System.out.println("size queue="+ this.cola.size());
		System.out.println("size tree="+ this.tree.size());

		System.out.println("se encontró el nodo solución");

		this.roat();

		System.out.println("problem");
		System.out.println("\n"+ this.problem);

		System.out.println(" camino");
		System.out.println("\n"+ this.answere);
		
		System.out.println("PORCENTAJE: " + ((this.tree.size()*100)/this.cola.size()));
	}

	public void generateMov(Node headNode){
		/*
		 * Cracion de 12 hijos NODOS
		 * aplicar respectivos movimientos y 
		 * agregar a la cola
		 * 
		 * TODO: podar el arbol
		 * */

		Node  f = new Node(headNode, 'f', headNode.cubeChild());
		Node  r = new Node(headNode, 'r', headNode.cubeChild());
		Node  d = new Node(headNode, 'd', headNode.cubeChild());
		Node  b = new Node(headNode, 'b', headNode.cubeChild());
		Node  l = new Node(headNode, 'l', headNode.cubeChild());
		Node  u = new Node(headNode, 'u', headNode.cubeChild());
		Node  F = new Node(headNode, 'F', headNode.cubeChild());
		Node  R = new Node(headNode, 'R', headNode.cubeChild());
		Node  D = new Node(headNode, 'D', headNode.cubeChild());
		Node  B = new Node(headNode, 'B', headNode.cubeChild());
		Node  L = new Node(headNode, 'L', headNode.cubeChild());
		Node  U = new Node(headNode, 'U', headNode.cubeChild());

		f.mov('f');
		this.cola.add(f);
		r.mov('r');
		this.cola.add(r);
		d.mov('d');
		this.cola.add(d);
		b.mov('b');
		this.cola.add(b);
		l.mov('l');
		this.cola.add(l);
		u.mov('u');
		this.cola.add(u);
		F.mov('F');
		this.cola.add(F);
		R.mov('R');
		this.cola.add(R);
		D.mov('D');
		this.cola.add(D);
		B.mov('B');
		this.cola.add(B);
		L.mov('L');
		this.cola.add(L);
		U.mov('U');
		this.cola.add(U);
		
	};

	public boolean nonDuplicate(Node nodeToCompare) {
		boolean is = false;
		for (Node item: this.cola) {
			is = Arrays.equals(item.cubeToPlay.rubikCube, 
					nodeToCompare.cubeToPlay.rubikCube);
			if (is) {
				return is;
			}
		}

		if (is) {
			return is;
		}else {
			for (Node item: this.tree) {
				is = Arrays.equals(item.cubeToPlay.rubikCube, 
						nodeToCompare.cubeToPlay.rubikCube);

				if (is) return is;
			}
		}
		return is;

	}

	public static void main(String[] args) {
		char g = 'j';
		System.out.println();
		Cube cubo = new Cube();
		BFS play = new BFS();
		play.run(cubo);
	}
	
	public void distancia() {
		
	}

}

