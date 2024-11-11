package com.example.tictactoe;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    String turn;
    String[][] board;
    int count;

    private void onNewGame() {
        board = new String[3][3];
        for (int row=0; row < 3; row++)
            for (int col=0; col < 3; col++)
                board[row][col] = new String();

        turn = "X";
        count = 0;
    }

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;


        });

    }

    public void onButtonClick(View view) {
        if(view.getId() == R.id.btn_00)
            handleClick(0,0,R.id.btn_00);
        
        if(view.getId() == R.id.btn_01)
            handleClick(0,0,R.id.btn_01);

        if(view.getId() == R.id.btn_02)
            handleClick(0,0,R.id.btn_02);

        if(view.getId() == R.id.btn_10)
            handleClick(0,0,R.id.btn_10);

        if(view.getId() == R.id.btn_11)
            handleClick(0,0,R.id.btn_11);

        if(view.getId() == R.id.btn_12)
            handleClick(0,0,R.id.btn_12);

        if(view.getId() == R.id.btn_20)
            handleClick(0,0,R.id.btn_20);

        if(view.getId() == R.id.btn_21)
            handleClick(0,0,R.id.btn_21);

        if(view.getId() == R.id.btn_22)
            handleClick(0,0,R.id.btn_22);
    }

    private void handleClick(int row, int col, int id) {
        if (board[row][col].equals("")) {
            board[row][col] = turn;
            Button btn = findViewById(id);
            btn.setText(turn);
            onTurnEnd();
        }
    }

    private void onTurnEnd() {
    }

}