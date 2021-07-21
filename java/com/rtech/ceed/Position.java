package com.rtech.ceed;

public class Position {
	
	private Piece piece;
	
	Position(Piece piece ) {
		
		this.piece = piece;
		
	}
	
	public Piece getPiece() {
		
		return piece;
		
	}
	
	void setPiece(Piece piece) {
		
		this.piece = piece;
		
	}
	
}
