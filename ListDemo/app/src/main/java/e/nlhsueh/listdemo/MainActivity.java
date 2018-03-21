package e.nlhsueh.listdemo;

import android.app.ListActivity;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity {


    String[] FCU_snack = {"甘丼 養生烏梅湯","燒鳥串燒","燒鳥串炸","朴大哥韓式炸雞",
            "多士號","黃G紅炸雞","古紅瓦早味米血","造堡", "木巷咖啡"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter adapter = new ArrayAdapter<>(this,
//                android.R.layout.simple_list_item_1,
                R.layout.list_item,
                R.id.textView,
                FCU_snack);

        setListAdapter(adapter);
    }

    protected void onListItemClick (ListView l, View v, int position, long id) {
        String msg = "就是要吃" + FCU_snack[position];
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}
