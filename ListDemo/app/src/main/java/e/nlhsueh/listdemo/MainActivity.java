package e.nlhsueh.listdemo;

import android.app.ListActivity;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity {


    String[] mobileArray = {"Android","IPhone","WindowsMobile","Blackberry",
            "WebOS","Ubuntu","Windows7","Max OS X"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,
//                R.layout.list_item,
//                R.id.textView,
                mobileArray);

        setListAdapter(adapter);
    }

    protected void onListItemClick (ListView l, View v, int position, long id) {
        Toast.makeText(this, Integer.toString(position), Toast.LENGTH_SHORT).show();

    }
}
