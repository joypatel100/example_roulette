# example_roulette
Program to refactor that plays a game of roulette

Students: Joy Patel (jhp21) and Tina Liang (tl150)

1. The refactored code gets rid of the "if" statements.  It also allows one to make new Bet games by extending the Bet abstract class.

2. We had to extend the Bet class to create subclasses which made the code more complex.  We also had to think about abstract methods that all Bet type classes should have versus methods unique to the specific types of Bets.  

3. We made more classes which required more coding than just the original "if" statements.  However, we split the code into more classes all extending from a single abstract class which improved the readability of the code.

4. We would prefer the refactored code because it hides the implementation of each Bet game from the Game class into it's own Bet class.  This also allows us to easily make new types of Bet games which have their own unique gameplay (e.g., probabilities of winning, description, etc.).

