package model;

public class Cube {

	char[] rubikCube;

	public Cube () {

		this.rubikCube = new char[54];


		/*
		 *   		    0r	r	r
		 * 	 		    3r	r	r
		 *   		    6r	r	r
		 * 9b  b	b	12w	w	w	15g	 g	g	18y	y	y   
		 *21b  b	b	24w	w	w	27g	 g	g	30y	y	y 
		 *33b  b	b	36w	w	w	39g	 g	g	42y	y	y  
		 *   			45o	o	o
		 *   			48o	o	o
		 *   			51o	o	o
		 * */
		/*
		 *				 0	 1	 2
		 *				 3	 4	 5
		 *   		     6	 7	 8
		 *9   	10	11	12	13	14  15	16	17	18	19	20   
		 *21  	22	23	24	25	26	27	28	29	30	31	32 
		 *33  	34	35	36	37	38  39	40	41	42	43	44  
		 *   			45	46	47
		 *   			48	49	50
		 *   			51	52	53
		 * */

		this.rubikCube[0] = 'r';
		this.rubikCube[1] = 'r';
		this.rubikCube[2] = 'r';
		this.rubikCube[3] = 'r';
		this.rubikCube[4] = 'r';
		this.rubikCube[5] = 'r';
		this.rubikCube[6] = 'r';
		this.rubikCube[7] = 'r';
		this.rubikCube[8] = 'r';

		this.rubikCube[9] = 'b';
		this.rubikCube[10] = 'b';
		this.rubikCube[11] = 'b';

		this.rubikCube[12] = 'w';
		this.rubikCube[13] = 'w';
		this.rubikCube[14] = 'w';

		this.rubikCube[15] = 'g';
		this.rubikCube[16] = 'g';
		this.rubikCube[17] = 'g';

		this.rubikCube[18] = 'y';
		this.rubikCube[19] = 'y';
		this.rubikCube[20] = 'y';

		this.rubikCube[21] = 'b';
		this.rubikCube[22] = 'b';
		this.rubikCube[23] = 'b';

		this.rubikCube[24] = 'w';
		this.rubikCube[25] = 'w';
		this.rubikCube[26] = 'w';

		this.rubikCube[27] = 'g';
		this.rubikCube[28] = 'g';
		this.rubikCube[29] = 'g';

		this.rubikCube[30] = 'y';
		this.rubikCube[31] = 'y';
		this.rubikCube[32] = 'y';

		this.rubikCube[33] = 'b';
		this.rubikCube[34] = 'b';
		this.rubikCube[35] = 'b';

		this.rubikCube[36] = 'w';
		this.rubikCube[37] = 'w';
		this.rubikCube[38] = 'w';

		this.rubikCube[39] = 'g';
		this.rubikCube[40] = 'g';
		this.rubikCube[41] = 'g';

		this.rubikCube[42] = 'y';
		this.rubikCube[43] = 'y';
		this.rubikCube[44] = 'y';

		this.rubikCube[45] = 'o';
		this.rubikCube[46] = 'o';
		this.rubikCube[47] = 'o';
		this.rubikCube[48] = 'o';
		this.rubikCube[49] = 'o';
		this.rubikCube[50] = 'o';
		this.rubikCube[51] = 'o';
		this.rubikCube[52] = 'o';
		this.rubikCube[53] = 'o';

	}

	public  Cube( char[] cubeDesordenado ) {
		this.rubikCube = cubeDesordenado;
	}

	public void printCube() {
		/*
		 *				 1	 2	 3
		 *				 4	 5	 6
		 *   		     7	 8	 9
		 *10   	11	12	13	14	15  16	17	18	19	20	21   
		 *22  	23	24	25	26	27	28	29	30	31	32	33 
		 *34  	35	36	37	38	39	40	41	42	43	44	45  
		 *   			46	47	48
		 *   			49	50	51
		 *   			52	52	53
		 * */
		System.out.print("----cube---\n   ");
		for (int i = 0; i < this.rubikCube.length; i++) {
			System.out.print(this.rubikCube[i]);

			if ( i == 2 || i == 5 || i == 8 || i == 20 
					|| i == 32 || i == 44 || i == 47 || i == 50
					|| i == 53 )
				System.out.println("\n");
			
			if ( i == 2 || i == 5 || i == 44 || i == 47  || i == 50
					 )
				System.out.print("   ");
		}

	}


	public char[] gettercube() {
		return this.rubikCube;
	}

	public void f() {
		/*
		 * Rota la cara blanca hacia la izquerda
		 * */

		/*
		 *   		    0b	b	b
		 * 	 		    3b	b	b
		 *   		    6b	b	b
		 * 9o  o	o	12w	w	w	15r	r	r	18y	y	y   
		 *21o  o	o	24w	w	w	27r	r	r	30y	y	y 
		 *33o  o	o	36w	w	w	39r	r	r	42y	y	y  
		 *   			45g	g	g
		 *   			48g	g	g
		 *   			51g	g	g
		 * */
		
		char d1 = this.rubikCube[12];
		this.rubikCube[12] = this.rubikCube[14];
		this.rubikCube[14] = this.rubikCube[38];
		this.rubikCube[38] = this.rubikCube[36];
		this.rubikCube[36] = d1;

		d1 = this.rubikCube[13];
		this.rubikCube[13] = this.rubikCube[26];
		this.rubikCube[26] = this.rubikCube[37];
		this.rubikCube[37] = this.rubikCube[24];
		this.rubikCube[24] = d1;

		d1 = this.rubikCube[6];
		char d2 = this.rubikCube[7];
		char d3 = this.rubikCube[8];

		this.rubikCube[6] = this.rubikCube[15];
		this.rubikCube[7] = this.rubikCube[27];
		this.rubikCube[8] = this.rubikCube[39];

		this.rubikCube[15] = this.rubikCube[47];
		this.rubikCube[27] = this.rubikCube[46];
		this.rubikCube[39] = this.rubikCube[45];

		this.rubikCube[47] = this.rubikCube[35];
		this.rubikCube[46] = this.rubikCube[23];
		this.rubikCube[45] = this.rubikCube[11];

		this.rubikCube[11] = d3;
		this.rubikCube[23] = d2;
		this.rubikCube[35] = d1;

	}

	public void r() {
		/*
		 * Rota la cara derecha
		 * */
		/*
		 *   		    0b	b	b
		 * 	 		    3b	b	b
		 *   		    6b	b	b
		 * 9o  o	o	12w	w	w	15r	 r	r	18y	y	y   
		 *21o  o	o	24w	w	w	27r	 r	r	30y	y	y 
		 *33o  o	o	36w	w	w	39r	 r	r	42y	y	y  
		 *   			45g	g	g
		 *   			48g	g	g
		 *   			51g	g	g
		 * */

		char d1 = this.rubikCube[15];
		this.rubikCube[15] = this.rubikCube[17];
		this.rubikCube[17] = this.rubikCube[41];
		this.rubikCube[41] = this.rubikCube[39];
		this.rubikCube[39] = d1;

		d1 = this.rubikCube[16];
		this.rubikCube[16] = this.rubikCube[29];
		this.rubikCube[29] = this.rubikCube[40];
		this.rubikCube[40] = this.rubikCube[27];
		this.rubikCube[27] = d1;

		d1 = this.rubikCube[2];
		char d2 = this.rubikCube[5];
		char d3 = this.rubikCube[8];

		this.rubikCube[8] = this.rubikCube[18];
		this.rubikCube[5] = this.rubikCube[30];
		this.rubikCube[2] = this.rubikCube[42];

		this.rubikCube[18] = this.rubikCube[53];
		this.rubikCube[30] = this.rubikCube[50];
		this.rubikCube[42] = this.rubikCube[47];

		this.rubikCube[53] = this.rubikCube[38];
		this.rubikCube[50] = this.rubikCube[26];
		this.rubikCube[47] = this.rubikCube[14];

		this.rubikCube[38] = d3;
		this.rubikCube[26] = d2;
		this.rubikCube[14] = d1;

	}

	public void d() {
		/*
		 * Rota la cara bottom hacia la izquerda
		 * */
		/*
		 *   		    0b	b	b
		 * 	 		    3b	b	b
		 *   		    6b	b	b
		 * 9o  o	o	12w	w	w	15r	r	r	18y	y	y   
		 *21o  o	o	24w	w	w	27r	r	r	30y	y	y 
		 *33o  o	o	36w	w	w	39r	r	r	42y	y	y  
		 *   			45g	g	g
		 *   			48g	g	g
		 *   			51g	g	g
		 * */

		char d1 = this.rubikCube[45];
		this.rubikCube[45] = this.rubikCube[47];
		this.rubikCube[47] = this.rubikCube[53];
		this.rubikCube[53] = this.rubikCube[51];
		this.rubikCube[51] = d1;

		d1 = this.rubikCube[46];
		this.rubikCube[46] = this.rubikCube[50];
		this.rubikCube[50] = this.rubikCube[52];
		this.rubikCube[52] = this.rubikCube[48];
		this.rubikCube[48] = d1;

		d1 = this.rubikCube[36];
		char d2 = this.rubikCube[37];
		char d3 = this.rubikCube[38];

		this.rubikCube[36] = this.rubikCube[39];
		this.rubikCube[37] = this.rubikCube[40];
		this.rubikCube[38] = this.rubikCube[41];

		this.rubikCube[39] = this.rubikCube[42];
		this.rubikCube[40] = this.rubikCube[43];
		this.rubikCube[41] = this.rubikCube[44];

		this.rubikCube[42] = this.rubikCube[33];
		this.rubikCube[43] = this.rubikCube[34];
		this.rubikCube[44] = this.rubikCube[35];

		this.rubikCube[33] = d1;
		this.rubikCube[34] = d2;
		this.rubikCube[35] = d3;

	}

	public void b() {
		/*
		 * Rota la cara Roja hacia la izquerda
		 * */
		/*
		 *   		    0b	b	b
		 * 	 		    3b	b	b
		 *   		    6b	b	b
		 * 9o  o	o	12w	w	w	15r	r	r	18y	y	y   
		 *21o  o	o	24w	w	w	27r	r	r	30y	y	y 
		 *33o  o	o	36w	w	w	39r	r	r	42y	y	y  
		 *   			45g	g	g
		 *   			48g	g	g
		 *   			51g	g	g
		 * */

		char d1 = this.rubikCube[18];
		this.rubikCube[18] = this.rubikCube[20];
		this.rubikCube[20] = this.rubikCube[44];
		this.rubikCube[44] = this.rubikCube[42];
		this.rubikCube[42] = d1;

		d1 = this.rubikCube[19];
		this.rubikCube[19] = this.rubikCube[32];
		this.rubikCube[32] = this.rubikCube[43];
		this.rubikCube[43] = this.rubikCube[30];
		this.rubikCube[30] = d1;

		d1 = this.rubikCube[0];
		char d2 = this.rubikCube[1];
		char d3 = this.rubikCube[2];

		this.rubikCube[0] = this.rubikCube[33];
		this.rubikCube[1] = this.rubikCube[21];
		this.rubikCube[2] = this.rubikCube[9];

		this.rubikCube[9] = this.rubikCube[51];
		this.rubikCube[21] = this.rubikCube[52];
		this.rubikCube[33] = this.rubikCube[53];

		this.rubikCube[51] = this.rubikCube[41];
		this.rubikCube[52] = this.rubikCube[29];
		this.rubikCube[53] = this.rubikCube[17];

		this.rubikCube[17] = d1;
		this.rubikCube[29] = d2;
		this.rubikCube[41] = d3;

	}

	public void l() {
		/*
		 * Rota la cara Roja hacia la izquerda
		 * */
		/*
		 *   		    0b	b	b
		 * 	 		    3b	b	b
		 *   		    6b	b	b
		 * 9o  o	o	12w	w	w	15r	r	r	18y	y	y   
		 *21o  o	o	24w	w	w	27r	r	r	30y	y	y 
		 *33o  o	o	36w	w	w	39r	r	r	42y	y	y  
		 *   			45g	g	g
		 *   			48g	g	g
		 *   			51g	g	g
		 * */

		char d1 = this.rubikCube[9];
		this.rubikCube[9] = this.rubikCube[11];
		this.rubikCube[11] = this.rubikCube[35];
		this.rubikCube[35] = this.rubikCube[33];
		this.rubikCube[33] = d1;

		d1 = this.rubikCube[10];
		this.rubikCube[10] = this.rubikCube[23];
		this.rubikCube[23] = this.rubikCube[34];
		this.rubikCube[34] = this.rubikCube[21];
		this.rubikCube[21] = d1;

		d1 = this.rubikCube[0];
		char d2 = this.rubikCube[3];
		char d3 = this.rubikCube[6];

		this.rubikCube[0] = this.rubikCube[12];
		this.rubikCube[3] = this.rubikCube[24];
		this.rubikCube[6] = this.rubikCube[36];

		this.rubikCube[12] = this.rubikCube[45];
		this.rubikCube[24] = this.rubikCube[48];
		this.rubikCube[36] = this.rubikCube[51];

		this.rubikCube[45] = this.rubikCube[20];
		this.rubikCube[48] = this.rubikCube[32];
		this.rubikCube[51] = this.rubikCube[44];

		this.rubikCube[20] = d3;
		this.rubikCube[32] = d2;
		this.rubikCube[44] = d1;
	}

	public void u() {
		/*
		 * Rota la cara Roja hacia la izquerda
		 * */
		/*
		 *   		    0b	b	b
		 * 	 		    3b	b	b
		 *   		    6b	b	b
		 * 9o  o	o	12w	w	w	15r	r	r	18y	y	y   
		 *21o  o	o	24w	w	w	27r	r	r	30y	y	y 
		 *33o  o	o	36w	w	w	39r	r	r	42y	y	y  
		 *   			45g	g	g
		 *   			48g	g	g
		 *   			51g	g	g
		 * */

		char d1 = this.rubikCube[0];
		this.rubikCube[0] = this.rubikCube[2];
		this.rubikCube[2] = this.rubikCube[8];
		this.rubikCube[8] = this.rubikCube[6];
		this.rubikCube[6] = d1;

		d1 = this.rubikCube[1];
		this.rubikCube[1] = this.rubikCube[5];
		this.rubikCube[5] = this.rubikCube[7];
		this.rubikCube[7] = this.rubikCube[3];
		this.rubikCube[3] = d1;

		d1 = this.rubikCube[12];
		char d2 = this.rubikCube[13];
		char d3 = this.rubikCube[14];

		this.rubikCube[12] = this.rubikCube[9];
		this.rubikCube[13] = this.rubikCube[10];
		this.rubikCube[14] = this.rubikCube[11];

		this.rubikCube[9] = this.rubikCube[18];
		this.rubikCube[10] = this.rubikCube[19];
		this.rubikCube[11] = this.rubikCube[20];

		this.rubikCube[18] = this.rubikCube[15];
		this.rubikCube[19] = this.rubikCube[16];
		this.rubikCube[20] = this.rubikCube[17];

		this.rubikCube[15] = d1;
		this.rubikCube[16] = d2;
		this.rubikCube[17] = d3;
	}

	public void F() {
		f();
		f();
		f();
	}

	public void R() {
		r();
		r();
		r();
	}

	public void D() {
		d();
		d();
		d();
	}

	public void B() {
		b();
		b();
		b();
	}

	public void L() {
		l();
		l();
		l();
	}

	public void U() {
		u();
		u();
		u();
	}
	
	/*
	 * public static void main(String[] args) {
	 * 
	 * Cube cube = new Cube();
	 * 
	 * cube.printCube();
	 * 
	 * cube.f();
	 * 
	 * cube.printCube();
	 * 
	 * }
	 */

}








