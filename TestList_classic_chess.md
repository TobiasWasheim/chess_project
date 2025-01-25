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
- [ ] Should have value 1
- [ ] Should be piece type "Pawn"
- [ ] A white pawn should have color WHITE
- [ ] A black pawn should have color BLACK 
- [ ] A white pawn can only move one square forward
- [ ] A Black pawn can only move one square backward
- [ ] If a white pawn is on the second row, it can move two squares forwards
- [ ] If a black pawn is on the second last row, it can move two squares backwards
- [ ] attack diagonally...

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
- [ ] Should not be able to move two squares forward
- [ ] Should be able to move one diagonally 
- [ ] Should be able to move one square backwards
- [ ] Should be piece type "King"
- [ ] Should have value 0
- [ ] A white King should have color WHITE
- [ ] A black King should have color BLACK