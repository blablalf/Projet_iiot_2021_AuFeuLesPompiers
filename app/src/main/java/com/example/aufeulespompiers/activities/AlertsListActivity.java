package com.example.aufeulespompiers.activities;

import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.aufeulespompiers.R;
import com.example.aufeulespompiers.Services.DataManager;
import com.example.aufeulespompiers.adapters.AlertAdapter;
import com.example.aufeulespompiers.model.Alert;

import java.util.ArrayList;

// Activity not used
public class AlertsListActivity extends AppCompatActivity {

    ListView alertsList;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_list);
        alertsList = findViewById(R.id.alert_list);
        ArrayList<Alert> alerts = DataManager.getAlerts();
        AlertAdapter alertAdapter = new AlertAdapter(this, alerts);
        alertsList.setAdapter(alertAdapter);
    }

}
