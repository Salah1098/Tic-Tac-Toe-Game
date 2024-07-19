package com.company;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class TicTacToeController {

    @FXML
    private Label lblStatus;
    @FXML
    private Button btn00, btn01, btn02, btn10, btn11, btn12, btn20, btn21, btn22;

    private boolean isXTurn = true;
    private Button[][] board;

    @FXML
    public void initialize() {
        board = new Button[][]{
                {btn00, btn01, btn02},
                {btn10, btn11, btn12},
                {btn20, btn21, btn22}
        };
        updateStatus();
    }

    @FXML
    private void handleButtonClick(javafx.event.ActionEvent event) {
        Button clickedButton = (Button) event.getSource();
        if (clickedButton.getText().isEmpty()) {
            clickedButton.setText(isXTurn ? "X" : "O");
            isXTurn = !isXTurn;
            updateStatus();
            checkWinner();
        }
    }

    private void updateStatus() {
        lblStatus.setText("Player " + (isXTurn ? "X" : "O") + "'s turn");
    }

    private void checkWinner() {
        // Check rows
        for (int i = 0; i < 3; i++) {
            if (!board[i][0].getText().isEmpty()
                    && board[i][0].getText().equals(board[i][1].getText())
                    && board[i][0].getText().equals(board[i][2].getText())) {
                showWinner(board[i][0].getText());
                return;
            }
        }

        // Check columns
        for (int i = 0; i < 3; i++) {
            if (!board[0][i].getText().isEmpty()
                    && board[0][i].getText().equals(board[1][i].getText())
                    && board[0][i].getText().equals(board[2][i].getText())) {
                showWinner(board[0][i].getText());
                return;
            }
        }

        // Check diagonals
        if (!board[0][0].getText().isEmpty()
                && board[0][0].getText().equals(board[1][1].getText())
                && board[0][0].getText().equals(board[2][2].getText())) {
            showWinner(board[0][0].getText());
            return;
        }

        if (!board[0][2].getText().isEmpty()
                && board[0][2].getText().equals(board[1][1].getText())
                && board[0][2].getText().equals(board[2][0].getText())) {
            showWinner(board[0][2].getText());
        }
    }

    private void showWinner(String winner) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Tic-Tac-Toe");
        alert.setHeaderText("We have a winner!");
        alert.setContentText("Congratulations! " + winner + " wins!");
        alert.showAndWait();
        resetBoard();
    }

    private void resetBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j].setText("");
            }
        }
        isXTurn = true;
        updateStatus();
    }
}
