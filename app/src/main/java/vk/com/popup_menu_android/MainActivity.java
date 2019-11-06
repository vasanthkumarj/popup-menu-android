package vk.com.popup_menu_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.widget.PopupMenu;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void chooseUser(View view) {


        PopupMenu popupMenu = new PopupMenu(this, view);
        MenuInflater menuInflater = popupMenu.getMenuInflater();
        menuInflater.inflate(R.menu.popup_items, popupMenu.getMenu());
        PopupMenuEventHandler popupMenuEventHandler = new PopupMenuEventHandler(getApplicationContext());
        popupMenu.setOnMenuItemClickListener(popupMenuEventHandler);
        popupMenu.show();

    }
}
