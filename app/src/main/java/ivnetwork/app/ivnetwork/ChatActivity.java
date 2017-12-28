package ivnetwork.app.ivnetwork;

import android.os.Bundle;

public class ChatActivity extends MenuActivity {

    @Override
    int getContentViewId() {
        return R.layout.activity_chat;
    }

    @Override
    int getNavigationMenuItemId() {
        return R.id.navigation_chat;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
