package model;

import java.util.Arrays;

public class Node {

	Node nodeFather;
	char mov;
	Cube cubeToPlay;
	
	
	
	public Node(Node tableroPadre, char mov, Cube tableroMov) {
		super();
		this.nodeFather = tableroPadre;
		this.mov = mov;
		this.cubeToPlay = tableroMov;
	};
	
	public char getMov() {
		return mov;
	}


	public void setMov(char mov) {
		this.mov = mov;
	}

	public Node getNodeFather() {
		return nodeFather;
	}


	public void setNodeFather(Node nodeFather) {
		this.nodeFather = nodeFather;
	}


	public Cube getCubeToPlay() {
		return cubeToPlay;
	}


	public void setCubeToPlay(Cube cubeToPlay) {
		this.cubeToPlay = cubeToPlay;
	}

	
	public Cube cubeChild() {
		return new Cube(this.cubeToPlay.rubikCube.clone());
	}

	public boolean compare() {
		Cube cubeOrdered = new Cube();
		
		/*
		 * cubeOrdered.printCube(); 
		 * System.out.println(); 
		 * this.currentBoard.printCube();
		 * 
		 */
		
		
		if ( Arrays.equals(this.cubeToPlay.gettercube(), cubeOrdered.gettercube()) ) {
			return true;
		}else {
			return false;
		}
	}
	
	public void mov(char play){
		
		switch (play) {
		case 'f':
			this.cubeToPlay.f();
			break;
		case 'r':
			this.cubeToPlay.r();
			break;
		case 'd':
			this.cubeToPlay.d();
			break;
		case 'b':
			this.cubeToPlay.b();
			break;
		case 'l':
			this.cubeToPlay.l();
			break;
		case 'u':
			this.cubeToPlay.u();
			break;
		case 'F':
			this.cubeToPlay.F();
			break;
		case 'R':
			this.cubeToPlay.R();
			break;
		case 'D':
			this.cubeToPlay.D();
			break;
		case 'B':
			this.cubeToPlay.B();
			break;
		case 'L':
			this.cubeToPlay.L();
			break;
		case 'U':
			this.cubeToPlay.U();
			break;
		default:
			System.out.println("no se encuentra jugada");
			
			
		}
		
	}
	
}
