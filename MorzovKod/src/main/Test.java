package main;

public class Test {

	public static void main(String[] args) {
		
		CvorStabla poc = new CvorStabla('e');
		CvorStabla T = new CvorStabla('T');
		CvorStabla E = new CvorStabla('E');
		CvorStabla M = new CvorStabla('M');
		CvorStabla N = new CvorStabla('N');
		CvorStabla A = new CvorStabla('A');
		CvorStabla I = new CvorStabla('I');
		CvorStabla O = new CvorStabla('O');
		CvorStabla G = new CvorStabla('G');
		CvorStabla K = new CvorStabla('K');
		CvorStabla D = new CvorStabla('D');
		CvorStabla W = new CvorStabla('W');
		CvorStabla R = new CvorStabla('R');
		CvorStabla U = new CvorStabla('U');
		CvorStabla S = new CvorStabla('S');
		CvorStabla Q = new CvorStabla('Q');
		CvorStabla Z = new CvorStabla('Z');
		CvorStabla Y = new CvorStabla('Y');
		CvorStabla C = new CvorStabla('C');
		CvorStabla X = new CvorStabla('X');
		CvorStabla B = new CvorStabla('B');
		CvorStabla J = new CvorStabla('J');
		CvorStabla P = new CvorStabla('P');
		CvorStabla L = new CvorStabla('L');
		CvorStabla F = new CvorStabla('F');
		CvorStabla V = new CvorStabla('V');
		CvorStabla H = new CvorStabla('H');
		
		
		poc.levoDete = T;
		poc.desnoDete = E;
		T.levoDete = M;
		T.desnoDete = N;
		E.levoDete = A;
		E.desnoDete = I;
		M.levoDete = O;
		M.desnoDete = G;
		N.levoDete = K;
		N.desnoDete = D;
		A.levoDete = W;
		A.desnoDete = R;
		I.levoDete = U;
		I.desnoDete = S;
		G.levoDete = Q;
		G.desnoDete = Z;
		K.levoDete = Y;
		K.desnoDete = C;
		D.levoDete = X;
		D.desnoDete = B;
		W.levoDete = J;
		W.desnoDete = P;
		R.desnoDete = L;
		U.desnoDete = F;
		S.levoDete = V;
		S.desnoDete = H;
		
		
		Stablo std = new Stablo();
		char nzz[] = new char[15];
		nzz = std.unosReci();
		
		std.ispisiNiz(nzz);
		
		
		
		

	}

}
