package com.allmycode.p01_05_01;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends Activity {
  CheckBox pepBox, cheeseBox;
  TextView textView;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    pepBox = (CheckBox) findViewById(R.id.checkBox);
    cheeseBox = (CheckBox) findViewById(R.id.checkBox2);
    textView = (TextView) findViewById(R.id.textView2);
  }

  public void onButtonClick(View view) {
    StringBuilder str = new StringBuilder("");
    if (pepBox.isChecked()) {
      str.append("Pepperoni ");
    }
    if (cheeseBox.isChecked()) {
      str.append("Extra cheese");
    }
    if (str.length() == 0) {
      str.append("Plain");
    }
    textView.setText(str);
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.menu_main, menu);
    return true;
  }

  @Override
  public boolean onOptionsItemSelected(MenuItem item) {
    // Handle action bar item clicks here. The action bar will
    // automatically handle clicks on the Home/Up button, so long
    // as you specify a parent activity in AndroidManifest.xml.
    int id = item.getItemId();

    //noinspection SimplifiableIfStatement
    if (id == R.id.action_settings) {
      return true;
    }

    return super.onOptionsItemSelected(item);
  }
}
