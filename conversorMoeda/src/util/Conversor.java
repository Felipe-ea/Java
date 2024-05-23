package util;

public class Conversor {
	
	public static final double IOF = 0.06;
	
	public static double conversorDolar(double cotacao ,double quantidadeComprada) {
		return (quantidadeComprada + (quantidadeComprada * IOF)) * cotacao; 
	}

}
