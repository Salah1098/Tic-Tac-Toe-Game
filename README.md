# Tic-Tac-Toe Game

This JavaFX application is a simple and engaging implementation of the classic Tic-Tac-Toe game. It provides a straightforward and interactive experience for two players, with clear indicators for whose turn it is and enhanced aesthetics for a more enjoyable game.

## Features

1. **Two-Player Mode**: Allows two players to play against each other.
2. **Player Turn Indicator**: Displays whose turn it is to make a move.
3. **Winner Detection**: Automatically detects and announces the winner.
4. **Game Reset**: Resets the board for a new game after a winner is declared.
5. **Enhanced Aesthetics**: Clean and modern user interface with large, easy-to-read buttons.

## Project Structure

```
- src
  - main
    - java
      - Main.java
      - TicTacToeController.java
    - resources
      - TicTacToe.fxml
```

## How to Run

1. **Clone the repository**:
    ```bash
    git clone https://github.com/salah1098/tic-tac-toe-game.git
    cd tic-tac-toe-game
    ```

2. **Compile and run the application**:
    - If you are using an IDE like IntelliJ IDEA or Eclipse, open the project and run `Main.java`.
    - If you prefer to use the command line, navigate to the `src` directory and run:
        ```bash
        javac main/java/Main.java
        java main.java.Main
        ```

## Usage

1. **Start the Game**:
    - Run the application, and the game window will appear.
2. **Take Turns**:
    - Players take turns clicking on the buttons to place their marks (X or O).
3. **Win the Game**:
    - The first player to get three of their marks in a row (horizontally, vertically, or diagonally) wins.
4. **Restart**:
    - After a winner is announced, the game board resets automatically for a new game.

## Dependencies

This project requires JavaFX. Ensure that JavaFX is properly installed and configured in your development environment.

## Contributing

If you would like to contribute to this project, please fork the repository and submit a pull request. We welcome all contributions, including bug fixes, feature additions, and documentation improvements.

## License

This project is licensed under the MIT License. See the `LICENSE` file for more details.

