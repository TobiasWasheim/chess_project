Tests for Pieces
================
Testing class EmptySquare
-------------------------
- [X] Should have 0 value
- [X] Should never be allowed to move
- [X] getPieceType should return "Empty-Square" String
- [X] Should have color NON
 
Testing class Pawn
=================
- [X] Should have value 1
- [X] Should be piece type "Pawn"
- [X] A white pawn should have color WHITE
- [X] A black pawn should have color BLACK 
- [X] A white pawn can only move one square forward
- [X] A Black pawn can only move one square backward

Testing class Rook
==================
- [X] Should be able to move forward/backwards
- [X] Should be able to move to the side
- [X] Should not be able to move both foward/backwards+to the side
- [X] Should have value 5
- [X] Should have piecetype "Rook"
- [X] A white rook should have color WHITE
- [X] A black rook should have color BLACK

Testing class Knight
====================
- [X] Should be able to move two columns and one row
- [X] Should be able to move one column and two rows
- [X] Should not be able to move diagonally
- [X] Should be piece type "Knight"
- [X] Should have value 3
- [X] A white knight should have color WHITE
- [X] A black knight should have color BLACK

Testing class Bishop
===================
- [X] Should not be able to move straight
- [X] Should be able to move diagonally
- [X] Should be piece type "Bishop"
- [X] Should have value 3
- [X] A white bishop should have color WHITE
- [X] A black bishop should have color BLACK

Testing class Queen
===================
- [X] Should be able to move straight
- [X] Should be able to move to the side
- [X] Should be able to move diagonally
- [X] Should not be able to move like a knight
- [X] Should be piece type "Queen"
- [X] Should have value 9
- [X] A white Queen should have color WHITE
- [X] A black Queen should have color BLACK

Testing class King
==================
- [X] Should not be able to move two squares forward
- [X] Should be able to move one diagonally 
- [X] Should be able to move one square backwards
- [X] Should be piece type "King"
- [X] Should have value 0
- [X] A white King should have color WHITE
- [X] A black King should have color BLACK