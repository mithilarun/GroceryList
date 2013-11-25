package com.lollipop.grocerylist;


import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.lollipop.grocerylist.loginendpoint.Loginendpoint;
import com.lollipop.grocerylist.loginendpoint.model.LogIn;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import java.io.IOException;


public class MainActivity extends Activity {

  
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    Button b1 = (Button) findViewById (R.id.button1);
    
    b1.setOnClickListener(new View.OnClickListener(){
             public void onClick(View v){
                     //Context context = getApplicationContext();
                     
                     Intent intent = new Intent(getApplicationContext(), ListActivity.class);
                        startActivity(intent);
             }
    });
    new LogInTask().execute();

  }
  
  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.main, menu);
    return true;
  }

  /**
* AsyncTask for calling Mobile Assistant API for checking into a place (e.g., a store)
*/
  private class LogInTask extends AsyncTask<Void, Void, Void> {

    /**
* Calls appropriate CloudEndpoint to indicate that user checked into a place.
*
* @param params the place where the user is checking in.
*/
    @Override
    protected Void doInBackground(Void... params) {
      LogIn login = new LogIn();
      
      // Set the ID of the store where the user is.
      // This would be replaced by the actual ID in the final version of the code.
      login.setPlaceId("StoreNo123");

      Loginendpoint.Builder builder = new Loginendpoint.Builder(
          AndroidHttp.newCompatibleTransport(), new JacksonFactory(),
          null);
          
      builder = CloudEndpointUtils.updateBuilder(builder);
      

      Loginendpoint endpoint = builder.build();
      

      try {
        endpoint.insertLogIn(login).execute();
      } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }

      return null;
    }
  }
}