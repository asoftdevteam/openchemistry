public class Chem {
	String[] elName = {"H", "He", "Li", "Be", "B", "C", "N", "O", "F", "Ne", "Na", "Mg", "Al", "Si", "P", "S", "Cl", "Ar", "K", "Ca", "Sc", "Ti", "V", "Cr", "Mn", "Fe", "Co", "Ni", "Cu", "Zn", "Ga", "Ge", "As", "Se", "Br", "Kr", "Rb", "Sr", "Y", "Zr", "Nb", "Mo", "Tc", "Ru", "Rh", "Pd", "Ag", "Cd", "In", "Sn", "Sb", "Te", "I", "Xe", "Cs", "Ba", "La", "Ce", "Pr", "Nd", "Pm", "Sm", "Eu", "Gd", "Tb", "Dy", "Ho", "Er", "Tm", "Yb", "Lu", "Hf", "Ta", "W", "Re", "Os", "Ir", "Pt", "Au", "Hg", "Tl", "Pb", "Bi", "Po", "At", "Rn", "Fr", "Ra", "Ac", "Th", "Pa", "U", "Np", "Pu", "Am", "Cm", "Bk", "Cf", "Es", "Fm", "Md", "No", "Lr", "Rf", "Db", "Sg", "Bh", "Hs", "Mt", "Ds"};
	double[] elAr = {1, 4, 7, 9, 11, 12, 14, 16, 19, 20, 23, 24, 27, 28, 31, 32, 35.5, 40, 39, 40, 45, 48, 51, 52, 55, 56, 59, 59, 64, 65, 70, 73, 75, 79, 80, 84, 85, 88, 89, 91, 93, 96, 99, 101, 103, 106, 108, 112, 115, 119, 122, 128, 127, 131, 133, 137, 139, 140, 141, 144, 145, 150, 152, 157, 159, 162.5, 165, 167, 169, 173, 175, 178, 181, 184, 186, 190, 192, 195, 197, 201, 204, 207, 209, 209, 210, 222, 223, 226, 227, 232, 231, 238, 237, 244, 243, 247, 247, 251, 254, 257, 258, 259, 260, 261, 262, 263, 262, 265, 266, 269};
	
	public int groupDet(int num) {
		if(num == 1 || num == 3 || num == 11 || num == 19 || num == 29 || num == 37 || num == 47 || num == 55 || num == 79 || num == 87 ){
			return 1;
		}else if(num == 4 || num == 12 || num == 20 || num == 30 || num == 38 || num == 48 || num == 56 || num == 80 || num == 88) {
			return 2;
		}else if(num == 5 || num == 13 || num == 21 || num == 31 || num == 39 || num == 49 || num == 57 || num == 81 || num == 89) {
			return 3;
		}else if(num == 6 || num == 14 || num == 22 || num == 32 || num == 40 || num == 50 || num == 72 || num == 82 || num == 104) {
			return 4;
		}else if(num == 7 || num == 15 || num == 23 || num == 33 || num == 41 || num == 51 || num == 73 || num == 83 || num == 105) {
			return 5;
		}else if(num == 8 || num == 16 || num == 24 || num == 34 || num == 42 || num == 52 || num == 74 || num == 84 || num == 106) {
			return 6;
		}else if(num == 9 || num == 17 || num == 25 || num == 35 || num == 43 || num == 53 || num == 75 || num == 85 || num == 107) {
			return 7;
		}else if(num == 2 || num == 10 || num == 18 || num == 26 || num == 27 || num == 28 || num == 36 || num == 44 || num == 45 || num == 46 || num == 54 || num == 76 || num == 77 || num == 78 || num == 86 || num == 108 || num == 109 || num == 110) {
			return 8;
		}else if(57 < num && num < 72) {
			return 9;
		}else if(89 < num && num < 104) {
			return 10;
		}else {
			return 0;
		}
	}
	public int periodDet(int num) {
		if(0 < num && num < 3) {
			return 1;
		}else if(2 < num && num < 11) {
			return 2;
		}else if(10 < num && num < 19) {
			return 3;
		}else if(18 < num && num < 37) {
			return 4;
		}else if(36 < num && num < 55) {
			return 5;
		}else if(54 < num && num < 87) {
			return 6;
		}else if(86 < num && num < 111) {
			return 7;
	    }else {
	        return 0;
	    }
	}
	public int rowDet(int num) {
		if(0 < num && num <3) {
			return 1;
		}else if(3 < num && num < 11) {
			return 2;
		}else if(10 < num && num < 19) {
			return 3;
		}else if(18 < num && num < 29) {
			return 4;
		}else if(28 < num && num < 37) {
			return 5;
		}else if(36 < num && num < 47) {
			return 6;
		}else if(46 < num && num < 55) {
			return 7;
		}else if(54 < num && num  < 79) {
			return 8;
		}else if(78 < num && num < 87) {
			return 9;
		}else if(86 < num && num < 111) {
			return 10;
		}else {
			return 0;
		}
	}
}

