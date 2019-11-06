package vk.com.popup_menu_android;

import android.content.Context;
import android.view.MenuItem;
import android.widget.PopupMenu;
import android.widget.Toast;

public class PopupMenuEventHandler implements PopupMenu.OnMenuItemClickListener {

    private Context context;

    public PopupMenuEventHandler(Context context) {
        this.context = context;
    }

    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {
        if(menuItem.getItemId()==R.id.admin)
        {
            Toast.makeText(context,"Logging in as Admin",Toast.LENGTH_LONG).show();
            return true;
        }
        if(menuItem.getItemId()==R.id.user)
        {
            Toast.makeText(context,"Logging in as User",Toast.LENGTH_LONG).show();
            return true;
        }
        return false;
    }
}
