package com.example.user.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Word_Counter extends AppCompatActivity {

    EditText inputEditText;
    Button wordCounterButton;
    TextView wordCounterView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word__counter);

        inputEditText = (EditText) findViewById(R.id.insert_text_box);
        wordCounterButton = (Button) findViewById(R.id.word_counter_button);
        wordCounterView = (TextView) findViewById(R.id.counted_words_box);

    }

        public void onButtonClicked(View button) {
        int words = Counter.countWords(inputEditText.getText().toString())  ;
            wordCounterView.setText("There are " + String.valueOf(words) + " words!");
    }
}
