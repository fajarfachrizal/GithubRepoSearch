package de.example.fajar.githubreposearch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.et_search_box) TextView mSearchBoxEditText;
    @BindView(R.id.tv_url_display) TextView mUrlDisplayTextView;
    @BindView(R.id.tv_github_search_result_json) TextView mSearchResultsTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);



    }
}
