/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.org.tictac;

/**
 *
 * @author s201093540
 */
public class TicTacToe extends javax.swing.JApplet {

    /**
     * Initializes the applet TicTacToe
     */
    String board[] = new String[10];
    boolean ai = true;
    int turns = 1, xwins = 0, owins = 0, ties = 0;
    boolean gameover = false;

    public boolean checkwinner(int num) {
        turns++;

        if (turns % 2 == 0) {
            board[num] = "X";
        } else {
            board[num] = "O";

        }
        if (board[1] == board[2] && board[2] == board[3] && board[1] == "X") {
            xwins++;
            jTextField1.setEnabled(false);
            jTextField1.setText(xwins + " time(s)");
            jTextField1.setEnabled(false);
            jTextField4.setText("Player X Wins");
            gameover = true;
        }
        if (board[4] == board[5] && board[5] == board[6] && board[4] == "X") {
            xwins++;
            jTextField1.setEnabled(false);
            jTextField1.setText(xwins + " time(s)");
            jTextField1.setEnabled(false);
            jTextField4.setText("Player X Wins");
            gameover = true;
        }
        if (board[7] == board[8] && board[8] == board[9] && board[7] == "X") {
            xwins++;
            jTextField1.setEnabled(false);
            jTextField1.setText(xwins + " time(s)");
            jTextField1.setEnabled(false);
            jTextField4.setText("Player X Wins");
            gameover = true;
        }
        if (board[1] == board[4] && board[4] == board[7] && board[1] == "X") {
            xwins++;
            jTextField1.setEnabled(false);
            jTextField1.setText(xwins + " time(s)");
            jTextField1.setEnabled(false);
            jTextField4.setText("Player X Wins");
            gameover = true;
        }
        if (board[2] == board[5] && board[5] == board[8] && board[2] == "X") {
            xwins++;
            jTextField1.setEnabled(false);
            jTextField1.setText(xwins + " time(s)");
            jTextField1.setEnabled(false);
            jTextField4.setText("Player X Wins");
            gameover = true;
        }
        if (board[3] == board[6] && board[6] == board[9] && board[3] == "X") {
            xwins++;
            jTextField1.setEnabled(false);
            jTextField1.setText(xwins + " time(s)");
            jTextField1.setEnabled(false);
            jTextField4.setText("Player X Wins");
            gameover = true;
        }
        if (board[1] == board[5] && board[5] == board[9] && board[1] == "X") {
            xwins++;
            jTextField1.setEnabled(false);
            jTextField1.setText(xwins + " time(s)");
            jTextField1.setEnabled(false);
            jTextField4.setText("Player X Wins");
            gameover = true;
        }
        if (board[3] == board[5] && board[5] == board[7] && board[3] == "X") {
            xwins++;
            jTextField1.setEnabled(false);
            jTextField1.setText(xwins + " time(s)");
            jTextField1.setEnabled(false);
            jTextField4.setText("Player X Wins");
            gameover = true;
        }
        if (board[1] == board[2] && board[2] == board[3] && board[1] == "O") {
            owins++;
            jTextField2.setEnabled(false);
            jTextField2.setText(owins + " time(s)");
            jTextField2.setEnabled(false);
            jTextField4.setText("Player O Wins");
            gameover = true;
        }
        if (board[4] == board[5] && board[5] == board[6] && board[4] == "O") {
            owins++;
            jTextField2.setEnabled(false);
            jTextField2.setText(owins + " time(s)");
            jTextField2.setEnabled(false);
            gameover = true;
        }
        if (board[7] == board[8] && board[8] == board[9] && board[7] == "O") {
            owins++;
            jTextField2.setEnabled(false);
            jTextField2.setText(owins + " time(s)");
            jTextField2.setEnabled(false);
            jTextField4.setText("Player O Wins");
            gameover = true;
        }
        if (board[1] == board[4] && board[4] == board[7] && board[1] == "O") {
            owins++;
            jTextField2.setEnabled(false);
            jTextField2.setText(owins + " time(s)");
            jTextField2.setEnabled(false);
            jTextField4.setText("Player O Wins");
            gameover = true;
        }
        if (board[2] == board[5] && board[5] == board[8] && board[2] == "O") {
            owins++;
            jTextField2.setEnabled(false);
            jTextField2.setText(owins + " time(s)");
            jTextField2.setEnabled(false);
            jTextField4.setText("Player O Wins");
            gameover = true;
        }
        if (board[3] == board[6] && board[6] == board[9] && board[3] == "O") {
            owins++;
            jTextField2.setEnabled(false);
            jTextField2.setText(owins + " time(s)");
            jTextField2.setEnabled(false);
            jTextField4.setText("Player O Wins");
            gameover = true;
        }
        if (board[1] == board[5] && board[5] == board[9] && board[1] == "O") {
            owins++;
            jTextField2.setEnabled(false);
            jTextField2.setText(owins + " time(s)");
            jTextField2.setEnabled(false);
            jTextField4.setText("Player O Wins");
            gameover = true;
        }
        if (board[3] == board[5] && board[5] == board[7] && board[3] == "O") {
            owins++;
            jTextField2.setEnabled(false);
            jTextField2.setText(owins + " time(s)");
            jTextField2.setEnabled(false);
            jTextField4.setText("Player O Wins");
            gameover = true;
        }

        if (gameover == true) {
            board[1] = "a";
            board[2] = "b";
            board[3] = "c";
            board[4] = "d";
            board[5] = "e";
            board[6] = "f";
            board[7] = "g";
            board[8] = "h";
            board[9] = "i";
            jButton2.setText("");
            jButton3.setText("");
            jButton4.setText("");
            jButton5.setText("");
            jButton6.setText("");
            jButton7.setText("");
            jButton8.setText("");
            jButton9.setText("");
            jButton10.setText("");
            jButton12.setText("AI");
            jButton2.setEnabled(true);
            jButton3.setEnabled(true);
            jButton4.setEnabled(true);
            jButton5.setEnabled(true);
            jButton6.setEnabled(true);
            jButton7.setEnabled(true);
            jButton8.setEnabled(true);
            jButton9.setEnabled(true);
            jButton10.setEnabled(true);
            turns = 1;
            int computerpick = 0;
            gameover = false;
        }

        if (board[1] != "a" && board[2] != "b" && board[3] != "c" && board[4] != "d" && board[5] != "e" && board[6] != "f" && board[7] != "g" && board[8] != "h" && board[9] != "i" && gameover == false) {
            ties++;
            jTextField3.setEnabled(false);
            jTextField3.setText(ties + " time(s)");
            jTextField3.setEnabled(false);
            jTextField4.setText("It's a Tie!");
            board[1] = "a";
            board[2] = "b";
            board[3] = "c";
            board[4] = "d";
            board[5] = "e";
            board[6] = "f";
            board[7] = "g";
            board[8] = "h";
            board[9] = "i";
            jButton2.setText("");
            jButton3.setText("");
            jButton4.setText("");
            jButton5.setText("");
            jButton6.setText("");
            jButton7.setText("");
            jButton8.setText("");
            jButton9.setText("");
            jButton10.setText("");
            jButton12.setText("AI");
            jButton2.setEnabled(true);
            jButton3.setEnabled(true);
            jButton4.setEnabled(true);
            jButton5.setEnabled(true);
            jButton6.setEnabled(true);
            jButton7.setEnabled(true);
            jButton8.setEnabled(true);
            jButton9.setEnabled(true);
            jButton10.setEnabled(true);
            turns = 0;
            int computerpick = 0;
            gameover = false;
        }
        if (ai == true) {
            computerplayer();
        }
        return gameover;
    }

    public void computerplayer() {
        turns++;
        int computerpick = 0;

        if (board[5] == "e") {
            computerpick = 5;
        }

        if (board[2] == board[3] && board[1] == "a" && board[2] == "O") {
            computerpick = 1;
        }
        if (board[5] == board[9] && board[1] == "a" && board[5] == "O") {
            computerpick = 1;
        }
        if (board[4] == board[7] && board[1] == "a" && board[4] == "O") {
            computerpick = 1;
        }
        if (board[1] == board[3] && board[2] == "b" && board[5] == "O") {
            computerpick = 2;
        }
        if (board[5] == board[8] && board[2] == "b" && board[5] == "O") {
            computerpick = 2;
        }
        if (board[1] == board[2] && board[3] == "c" && board[1] == "O") {
            computerpick = 3;
        }
        if (board[6] == board[9] && board[3] == "c" && board[6] == "O") {
            computerpick = 3;
        }
        if (board[5] == board[7] && board[3] == "c" && board[5] == "O") {
            computerpick = 3;
        }
        if (board[1] == board[7] && board[4] == "d" && board[1] == "O") {
            computerpick = 4;
        }
        if (board[5] == board[6] && board[4] == "d" && board[5] == "O") {
            computerpick = 4;
        }
        if (board[1] == board[9] && board[5] == "e" && board[1] == "O") {
            computerpick = 5;
        }
        if (board[3] == board[7] && board[5] == "e" && board[3] == "O") {
            computerpick = 5;
        }
        if (board[2] == board[8] && board[5] == "e" && board[2] == "O") {
            computerpick = 5;
        }
        if (board[4] == board[6] && board[5] == "e" && board[4] == "O") {
            computerpick = 5;
        }
        if (board[3] == board[9] && board[6] == "f" && board[3] == "O") {
            computerpick = 6;
        }
        if (board[4] == board[5] && board[6] == "f" && board[4] == "O") {
            computerpick = 6;
        }
        if (board[1] == board[4] && board[7] == "g" && board[1] == "O") {
            computerpick = 7;
        }
        if (board[8] == board[9] && board[7] == "g" && board[8] == "O") {
            computerpick = 7;
        }
        if (board[3] == board[5] && board[7] == "g" && board[3] == "O") {
            computerpick = 7;
        }
        if (board[2] == board[5] && board[8] == "h" && board[2] == "O") {
            computerpick = 8;
        }
        if (board[7] == board[9] && board[8] == "h" && board[7] == "O") {
            computerpick = 8;
        }
        if (board[1] == board[5] && board[9] == "i" && board[1] == "O") {
            computerpick = 9;
        }
        if (board[7] == board[8] && board[9] == "i" && board[7] == "O") {
            computerpick = 9;
        }
        if (board[3] == board[6] && board[9] == "i" && board[3] == "O") {
            computerpick = 9;
        }



        if (board[2] == board[3] && board[1] == "a" && board[2] == "X") {
            computerpick = 1;
        }
        if (board[5] == board[9] && board[1] == "a" && board[5] == "X") {
            computerpick = 1;
        }
        if (board[4] == board[7] && board[1] == "a" && board[4] == "X") {
            computerpick = 1;
        }
        if (board[1] == board[3] && board[2] == "b" && board[5] == "X") {
            computerpick = 2;
        }
        if (board[5] == board[8] && board[2] == "b" && board[5] == "X") {
            computerpick = 2;
        }
        if (board[1] == board[2] && board[3] == "c" && board[1] == "X") {
            computerpick = 3;
        }
        if (board[6] == board[9] && board[3] == "c" && board[6] == "X") {
            computerpick = 3;
        }
        if (board[5] == board[7] && board[3] == "c" && board[5] == "X") {
            computerpick = 3;
        }
        if (board[1] == board[7] && board[4] == "d" && board[1] == "X") {
            computerpick = 4;
        }
        if (board[5] == board[6] && board[4] == "d" && board[5] == "X") {
            computerpick = 4;
        }
        if (board[1] == board[9] && board[5] == "e" && board[1] == "X") {
            computerpick = 5;
        }
        if (board[3] == board[7] && board[5] == "e" && board[3] == "X") {
            computerpick = 5;
        }
        if (board[2] == board[8] && board[5] == "e" && board[2] == "X") {
            computerpick = 5;
        }
        if (board[4] == board[6] && board[5] == "e" && board[4] == "X") {
            computerpick = 5;
        }
        if (board[3] == board[9] && board[6] == "f" && board[3] == "X") {
            computerpick = 6;
        }
        if (board[4] == board[5] && board[6] == "f" && board[4] == "X") {
            computerpick = 6;
        }
        if (board[1] == board[4] && board[7] == "g" && board[1] == "X") {
            computerpick = 7;
        }
        if (board[8] == board[9] && board[7] == "g" && board[8] == "X") {
            computerpick = 7;
        }
        if (board[3] == board[5] && board[7] == "g" && board[3] == "X") {
            computerpick = 7;
        }
        if (board[2] == board[5] && board[8] == "h" && board[2] == "X") {
            computerpick = 8;
        }
        if (board[7] == board[9] && board[8] == "h" && board[7] == "X") {
            computerpick = 8;
        }
        if (board[1] == board[5] && board[9] == "i" && board[1] == "X") {
            computerpick = 9;
        }
        if (board[7] == board[8] && board[9] == "i" && board[7] == "X") {
            computerpick = 9;
        }
        if (board[3] == board[6] && board[9] == "i" && board[3] == "X") {
            computerpick = 9;
        }



        if (computerpick == 0) {
            if (board[1] == "X" && board[9] == "X" && board[8] == "h") {
                computerpick = 8;
            } else if (board[3] == "X" && board[7] == "X" && board[8] == "h") {
                computerpick = 8;
            } else {
                if (board[1] == "a") {
                    computerpick = 1;
                } else if (board[3] == "c") {
                    computerpick = 3;
                } else if (board[7] == "g") {
                    computerpick = 7;
                } else if (board[9] == "i") {
                    computerpick = 9;
                } else if (board[2] == "b") {
                    computerpick = 2;
                } else if (board[4] == "d") {
                    computerpick = 4;
                } else if (board[6] == "f") {
                    computerpick = 6;
                } else if (board[8] == "h") {
                    computerpick = 8;
                }
            }
        }


        System.out.println("Computer Picks: " + computerpick);

        if (computerpick == 1) {
            board[1] = "O";
            jButton2.setText("O");
            jButton2.setEnabled(false);
            computerpick = 0;
        }
        if (computerpick == 2) {
            board[2] = "O";
            jButton3.setText("O");
            jButton3.setEnabled(false);
            computerpick = 0;
        }
        if (computerpick == 3) {
            board[3] = "O";
            jButton4.setText("O");
            jButton4.setEnabled(false);
            computerpick = 0;
        }
        if (computerpick == 4) {
            board[4] = "O";
            jButton5.setText("O");
            jButton5.setEnabled(false);
            computerpick = 0;
        }
        if (computerpick == 5) {
            board[5] = "O";
            jButton6.setText("O");
            jButton6.setEnabled(false);
            computerpick = 0;
        }
        if (computerpick == 6) {
            board[6] = "O";
            jButton7.setText("O");
            jButton7.setEnabled(false);
            computerpick = 0;
        }
        if (computerpick == 7) {
            board[7] = "O";
            jButton8.setText("O");
            jButton8.setEnabled(false);
            computerpick = 0;
        }
        if (computerpick == 8) {
            board[8] = "O";
            jButton9.setText("O");
            jButton9.setEnabled(false);
            computerpick = 0;
        }
        if (computerpick == 9) {
            board[9] = "O";
            jButton10.setText("O");
            jButton10.setEnabled(false);
            computerpick = 0;
        }

        if (board[1] == board[2] && board[2] == board[3] && board[1] == "X") {
            xwins++;
            jTextField1.setEnabled(false);
            jTextField1.setText(xwins + " time(s)");
            jTextField1.setEnabled(false);
            jTextField4.setText("Player X Wins");
            gameover = true;
        }
        if (board[4] == board[5] && board[5] == board[6] && board[4] == "X") {
            xwins++;
            jTextField1.setEnabled(false);
            jTextField1.setText(xwins + " time(s)");
            jTextField1.setEnabled(false);
            jTextField4.setText("Player X Wins");
            gameover = true;
        }
        if (board[7] == board[8] && board[8] == board[9] && board[7] == "X") {
            xwins++;
            jTextField1.setEnabled(false);
            jTextField1.setText(xwins + " time(s)");
            jTextField1.setEnabled(false);
            jTextField4.setText("Player X Wins");
            gameover = true;
        }
        if (board[1] == board[4] && board[4] == board[7] && board[1] == "X") {
            xwins++;
            jTextField1.setEnabled(false);
            jTextField1.setText(xwins + " time(s)");
            jTextField1.setEnabled(false);
            jTextField4.setText("Player X Wins");
            gameover = true;
        }
        if (board[2] == board[5] && board[5] == board[8] && board[2] == "X") {
            xwins++;
            jTextField1.setEnabled(false);
            jTextField1.setText(xwins + " time(s)");
            jTextField1.setEnabled(false);
            jTextField4.setText("Player X Wins");
            gameover = true;
        }
        if (board[3] == board[6] && board[6] == board[9] && board[3] == "X") {
            xwins++;
            jTextField1.setEnabled(false);
            jTextField1.setText(xwins + " time(s)");
            jTextField1.setEnabled(false);
            jTextField4.setText("Player X Wins");
            gameover = true;
        }
        if (board[1] == board[5] && board[5] == board[9] && board[1] == "X") {
            xwins++;
            jTextField1.setEnabled(false);
            jTextField1.setText(xwins + " time(s)");
            jTextField1.setEnabled(false);
            jTextField4.setText("Player X Wins");
            gameover = true;
        }
        if (board[3] == board[5] && board[5] == board[7] && board[3] == "X") {
            xwins++;
            jTextField1.setEnabled(false);
            jTextField1.setText(xwins + " time(s)");
            jTextField1.setEnabled(false);
            jTextField4.setText("Player X Wins");
            gameover = true;
        }
        if (board[1] == board[2] && board[2] == board[3] && board[1] == "O") {
            owins++;
            jTextField2.setEnabled(false);
            jTextField2.setText(owins + " time(s)");
            jTextField2.setEnabled(false);
            jTextField4.setText("Player O Wins");
            gameover = true;
        }
        if (board[4] == board[5] && board[5] == board[6] && board[4] == "O") {
            owins++;
            jTextField2.setEnabled(false);
            jTextField2.setText(owins + " time(s)");
            jTextField2.setEnabled(false);
            gameover = true;
        }
        if (board[7] == board[8] && board[8] == board[9] && board[7] == "O") {
            owins++;
            jTextField2.setEnabled(false);
            jTextField2.setText(owins + " time(s)");
            jTextField2.setEnabled(false);
            jTextField4.setText("Player O Wins");
            gameover = true;
        }
        if (board[1] == board[4] && board[4] == board[7] && board[1] == "O") {
            owins++;
            jTextField2.setEnabled(false);
            jTextField2.setText(owins + " time(s)");
            jTextField2.setEnabled(false);
            jTextField4.setText("Player O Wins");
            gameover = true;
        }
        if (board[2] == board[5] && board[5] == board[8] && board[2] == "O") {
            owins++;
            jTextField2.setEnabled(false);
            jTextField2.setText(owins + " time(s)");
            jTextField2.setEnabled(false);
            jTextField4.setText("Player O Wins");
            gameover = true;
        }
        if (board[3] == board[6] && board[6] == board[9] && board[3] == "O") {
            owins++;
            jTextField2.setEnabled(false);
            jTextField2.setText(owins + " time(s)");
            jTextField2.setEnabled(false);
            jTextField4.setText("Player O Wins");
            gameover = true;
        }
        if (board[1] == board[5] && board[5] == board[9] && board[1] == "O") {
            owins++;
            jTextField2.setEnabled(false);
            jTextField2.setText(owins + " time(s)");
            jTextField2.setEnabled(false);
            jTextField4.setText("Player O Wins");
            gameover = true;
        }
        if (board[3] == board[5] && board[5] == board[7] && board[3] == "O") {
            owins++;
            jTextField2.setEnabled(false);
            jTextField2.setText(owins + " time(s)");
            jTextField2.setEnabled(false);
            jTextField4.setText("Player O Wins");
            gameover = true;
        }

        if (gameover == true) {
            board[1] = "a";
            board[2] = "b";
            board[3] = "c";
            board[4] = "d";
            board[5] = "e";
            board[6] = "f";
            board[7] = "g";
            board[8] = "h";
            board[9] = "i";
            jButton2.setText("");
            jButton3.setText("");
            jButton4.setText("");
            jButton5.setText("");
            jButton6.setText("");
            jButton7.setText("");
            jButton8.setText("");
            jButton9.setText("");
            jButton10.setText("");
            jButton12.setText("AI");
            jButton2.setEnabled(true);
            jButton3.setEnabled(true);
            jButton4.setEnabled(true);
            jButton5.setEnabled(true);
            jButton6.setEnabled(true);
            jButton7.setEnabled(true);
            jButton8.setEnabled(true);
            jButton9.setEnabled(true);
            jButton10.setEnabled(true);
            turns = 1;
            computerpick = 0;
            gameover = false;
        }

        if (board[1] != "a" && board[2] != "b" && board[3] != "c" && board[4] != "d" && board[5] != "e" && board[6] != "f" && board[7] != "g" && board[8] != "h" && board[9] != "i" && gameover == false) {
            ties++;
            jTextField3.setEnabled(false);
            jTextField3.setText(ties + " time(s)");
            jTextField3.setEnabled(false);
            jTextField4.setText("It's a Tie!");
            board[1] = "a";
            board[2] = "b";
            board[3] = "c";
            board[4] = "d";
            board[5] = "e";
            board[6] = "f";
            board[7] = "g";
            board[8] = "h";
            board[9] = "i";
            jButton2.setText("");
            jButton3.setText("");
            jButton4.setText("");
            jButton5.setText("");
            jButton6.setText("");
            jButton7.setText("");
            jButton8.setText("");
            jButton9.setText("");
            jButton10.setText("");
            jButton12.setText("AI");
            jButton2.setEnabled(true);
            jButton3.setEnabled(true);
            jButton4.setEnabled(true);
            jButton5.setEnabled(true);
            jButton6.setEnabled(true);
            jButton7.setEnabled(true);
            jButton8.setEnabled(true);
            jButton9.setEnabled(true);
            jButton10.setEnabled(true);
            turns = 1;
            computerpick = 0;
            gameover = false;
        }
    }

    @Override
    public void init() {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the applet
         */
        resize(600, 600);

        board[1] = "a";
        board[2] = "b";
        board[3] = "c";
        board[4] = "d";
        board[5] = "e";
        board[6] = "f";
        board[7] = "g";
        board[8] = "h";
        board[9] = "i";

        try {
            java.awt.EventQueue.invokeAndWait(new Runnable() {

                public void run() {
                    initComponents();
                }
            });
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * This method is called from within the init() method to initialize the
     * form. WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 51, 51));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 44)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TicTacToe");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton1.setFont(new java.awt.Font("Times New Roman", 2, 11)); // NOI18N
        jButton1.setText("Quit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setFont(new java.awt.Font("Times New Roman", 2, 11)); // NOI18N
        jButton11.setText("Reset");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jTextField1.setEnabled(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 11)); // NOI18N
        jLabel2.setText("\"X\" Wins:\n");

        jTextField2.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jTextField2.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 11)); // NOI18N
        jLabel3.setText("\"O\" Wins:\n");

        jTextField3.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jTextField3.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 11)); // NOI18N
        jLabel4.setText("Ties:\n");

        jButton12.setFont(new java.awt.Font("Times New Roman", 2, 11)); // NOI18N
        jButton12.setText("AI = ON");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jTextField4.setFont(new java.awt.Font("Times New Roman", 3, 11)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton11)
                                .addGap(3, 3, 3)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton12)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton1))))
                        .addContainerGap(383, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (turns % 2 == 1) {
            jButton2.setText("X");
        } else {
            jButton2.setText("O");
        }
        jButton2.setEnabled(false);
        gameover = checkwinner(1);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (turns % 2 == 1) {
            jButton3.setText("X");
        } else {
            jButton3.setText("O");
        }
        jButton3.setEnabled(false);
        gameover = checkwinner(2);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (turns % 2 == 1) {
            jButton4.setText("X");
        } else {
            jButton4.setText("O");
        }
        jButton4.setEnabled(false);
        gameover = checkwinner(3);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (turns % 2 == 1) {
            jButton5.setText("X");
        } else {
            jButton5.setText("O");
        }
        jButton5.setEnabled(false);
        gameover = checkwinner(4);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if (turns % 2 == 1) {
            jButton6.setText("X");
        } else {
            jButton6.setText("O");
        }
        jButton6.setEnabled(false);
        gameover = checkwinner(5);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if (turns % 2 == 1) {
            jButton7.setText("X");
        } else {
            jButton7.setText("O");
        }
        jButton7.setEnabled(false);
        gameover = checkwinner(6);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if (turns % 2 == 1) {
            jButton8.setText("X");
        } else {
            jButton8.setText("O");
        }
        jButton8.setEnabled(false);
        gameover = checkwinner(7);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if (turns % 2 == 1) {
            jButton9.setText("X");
        } else {
            jButton9.setText("O");
        }
        jButton9.setEnabled(false);
        gameover = checkwinner(8);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        if (turns % 2 == 1) {
            jButton10.setText("X");
        } else {
            jButton10.setText("O");
        }
        jButton10.setEnabled(false);
        gameover = checkwinner(9);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        board[1] = "a";
        board[2] = "b";
        board[3] = "c";
        board[4] = "d";
        board[5] = "e";
        board[6] = "f";
        board[7] = "g";
        board[8] = "h";
        board[9] = "i";
        jButton2.setText("");
        jButton3.setText("");
        jButton4.setText("");
        jButton5.setText("");
        jButton6.setText("");
        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");
        jButton10.setText("");
        jButton12.setText("AI");
        jTextField4.setText("");
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton4.setEnabled(true);
        jButton5.setEnabled(true);
        jButton6.setEnabled(true);
        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
        jButton9.setEnabled(true);
        jButton10.setEnabled(true);
        turns = 1;
        int computerpick = 0;
        gameover = false;
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        if (ai == false) {
            ai = true;
            jButton12.setText("AI");
        } else if (ai == true) {
            ai = false;
            jButton12.setText("AI");
            int computerpick = 0;
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
