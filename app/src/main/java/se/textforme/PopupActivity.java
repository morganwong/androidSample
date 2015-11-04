package se.textforme;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;

public class PopupActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // The activity is being created.
        Intent intent = getIntent();//get message here
        String strMessage = intent.getStringExtra("strMessage");
        //NOW YOU CAN SHOW THIS MESSAGE IN POPUP

        final Dialog dialog = new Dialog(this); // context, this etc.
        dialog.setContentView(R.layout.dialog);
        dialog.setTitle("Respond...?");
        dialog.show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        this.finish();
        // The activity is no longer visible (it is now "stopped")
    }
}