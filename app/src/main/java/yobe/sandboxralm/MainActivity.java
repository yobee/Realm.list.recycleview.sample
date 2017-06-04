package yobe.sandboxralm;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


import io.realm.examples.adapters.R;
import yobe.sandboxralm.ui.listview.ListViewExampleActivity;
import yobe.sandboxralm.ui.recycleview.RecyclerViewExampleActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupButton(R.id.button_listview, ListViewExampleActivity.class);
        setupButton(R.id.button_recyclerview, RecyclerViewExampleActivity.class);
    }

    void startActivity(Class<? extends Activity> activityClass) {
        startActivity(new Intent(this, activityClass));
    }

    private void setupButton(int id, final Class<? extends Activity> activityClass) {
        findViewById(id).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(activityClass);
            }
        });
    }
}
