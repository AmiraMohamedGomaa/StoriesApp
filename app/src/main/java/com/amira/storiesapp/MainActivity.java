package com.amira.storiesapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
  ListView items;
  TextView title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
   // to hide status bar
        getWindow().setFlags( WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        items=(ListView)findViewById( R.id.listView );
        title=(TextView)findViewById( R.id.textViewTitle );

        Typeface typeface=Typeface.createFromAsset( getAssets(),"font.otf" );
        title.setTypeface( typeface );

        String []stories=getResources().getStringArray( R.array.index );

        ArrayAdapter arrayAdapter=new ArrayAdapter<String>(this,R.layout.item,R.id.textitem,stories);
        items.setAdapter( arrayAdapter );
    }
}
