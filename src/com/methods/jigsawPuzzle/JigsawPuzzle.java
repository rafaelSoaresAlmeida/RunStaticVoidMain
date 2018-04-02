package com.methods.jigsawPuzzle;

import java.util.Stack;

public class JigsawPuzzle {
    public Piece[] piecesOfPuzzle;

    public JigsawPuzzle(Piece[] pieces) {
        this.piecesOfPuzzle = pieces;
    }

    public Piece[] piecesOfPuzzle() {
        return this.piecesOfPuzzle;
    }

    public boolean solve() {
        Piece aPiece = null;
        Piece anotherPiece = null;

        Stack<Piece> stackOfPieces = stackOfPieces();

        while (stackOfPieces.size() > 1) {
            aPiece = stackOfPieces.pop();

            while (!stackOfPieces.isEmpty()) {
                anotherPiece = stackOfPieces.pop();

                if (aPiece.fitsWith(anotherPiece)) {
                    Piece bigPiece = aPiece.joinWith(anotherPiece);

                    stackOfPieces.push(bigPiece);

                    break;
                }
            }
        }

        return stackOfPieces.size() == 1;
    }

    private Stack<Piece> stackOfPieces() {
        Stack<Piece> stackOfPieces = new Stack<Piece>();
        final int numPieces = piecesOfPuzzle.length;

        for (int i = numPieces - 1; i >= 0; i--) {
            stackOfPieces.push(piecesOfPuzzle[i]);
        }

        return stackOfPieces;
    }
}
