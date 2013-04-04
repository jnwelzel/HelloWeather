package com.jonwelzel.helloweather.tasks;

import java.io.IOException;
import java.util.Set;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import com.jonwelzel.helloweather.pojos.Location;

import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;

public class FindLocationTask extends AsyncTask<String, Void, Set<Location>> {

  @Override
  protected Set<Location> doInBackground(String... params) {
    String query = Uri.encode("select * from geo.placefinder where text=\"" + params[0] + "\"");
    HttpClient client = new DefaultHttpClient();
    HttpGet get = new HttpGet("http://query.yahooapis.com/v1/public/yql?q=" + query);
    
    try {
      HttpResponse response = client.execute(get);
      Log.i("FindLocationTask", "HTTP STATUS " + response.getStatusLine());
    } catch (ClientProtocolException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return null;
  }
  
  @Override
  protected void onPostExecute(Set<Location> result) {
    // TODO Update UI now bro
  }

}
