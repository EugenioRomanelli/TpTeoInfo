package Tp1;

import java.io.File;
import java.io.IOException;

class senial {

	public static void main(String[] args) throws IOException {
		
		File ETH = new File("ETH");
		File BTC = new File("BTC");
		if (ETH.exists() && BTC.exists()) {
			System.out.print("hola");
		}
		}

	}
	


