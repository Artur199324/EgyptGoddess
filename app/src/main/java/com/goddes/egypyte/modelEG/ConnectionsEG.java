package com.goddes.egypyte.modelEG;

import android.os.AsyncTask;

import com.goddes.egypyte.settingsEG.DecodeEG;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class ConnectionsEG {

    private String statusEG;
    private String urlEG;
    private String fbTokenEG;
    private String fbIdEG;

    public ConnectionsEG() {
    }

    public String getStatusEG() {
        return statusEG;
    }

    public void setStatusEG(String statusEG) {
        this.statusEG = statusEG;
    }

    public String getUrlEG() {
        return urlEG;
    }

    public void setUrlEG(String urlEG) {
        this.urlEG = urlEG;
    }

    public String getFbTokenEG() {
        return fbTokenEG;
    }

    public void setFbTokenEG(String fbTokenEG) {
        this.fbTokenEG = fbTokenEG;
    }

    public String getFbIdEG() {
        return fbIdEG;
    }

    public void setFbIdEG(String fbIdEG) {
        this.fbIdEG = fbIdEG;
    }


    public void connectionsEG() {
        ConnectionsEGAsyncTask connectionsEGAsyncTask = new ConnectionsEGAsyncTask();
        connectionsEGAsyncTask.execute();

    }

    public class ConnectionsEGAsyncTask extends AsyncTask<Void, Void, Void> {

        @Override
        protected Void doInBackground(Void... voids) {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(DecodeEG.decodeEG("aHR0cHM6Ly9naXN0LmdpdGh1YnVzZXJjb250ZW50LmNvbS9BcnR1cjE5OTMyNC9iNDk5ZWY5MDI3Yzc2Y2NmMjQyM2JjZmVkZTMyN2IyOS9yYXcvRWd5cHRfR29kZGVzcw==")).openConnection();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                setStatusEG(bufferedReader.readLine());
                setUrlEG(bufferedReader.readLine());
                setFbTokenEG(bufferedReader.readLine());
                setFbIdEG(bufferedReader.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }
    }
}
