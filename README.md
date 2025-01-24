Chess Project
==============
**Developer**: Tobias Washeim

I've played chess for many years, 
so I've always been interested in 
coding my own chess game. I'm 
developing multiple variations of 
the chess game. I'm planning the 
following gamemodes
- **AlphaChess**: A game mode where you 
have to kill the king to win. The setup
is like classical chess. But there's no
castling allowed, no checks on the king, 
and no en passant.
- **Pawn chess**: White starts with eight
pawns on the 2nd row. Black starts with 
eight pawns on the 7th rank. The first 
player to get a pawn on the 1st or 8th 
rank 3wins. 
- **Classical chess**: Normal chess with 
all the standard rules. 
- **Fischer chess** The figures are placed
in random order on the 1st and 8th rank. 
Everything else follows the standard rules
of classical chess.
- **Archer chess** Chess board is 8x10. 
White and black has two extra pawns and
two archers each. The archers can move one
square in each direction and shoot an 
arrow with a range of two squares. A move 
is used on either moving the piece or 
shooting. 
### Status on Development
Currently developing and testing all the 
pieces.
### Thoughts on Future Features
- Adding two buttons to surrender and
offer draw to opponent.
- Adding a clock with customizable times.
### Current Thoughts
**24/01/2025**

I've so far developed the empty square,
the rook, and the knight. I'm working on the
others. I have long thought that I should
implement castling into the rook object.
However, since castling is a game rule I've
changed my mind. I'm going to implement
that feature in the game implementation
object which is responsible for the rules
of the game. 

I've been thinking about should the pieces be responsible for defining their movement? My current thought: Yes. 
Maybe later no. I can always refactor in the future...

Another thought: The king and and pawn depends on the chess board.... They are not like the other pieces.
I don't want any special functions to assert if it is a pawn piece in my game. Have to come up with a solution later...
