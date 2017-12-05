package com.example.drillness.testtask;

import android.os.Bundle;
import android.app.Activity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<ListEntry> image_details = getSearchResults();

        final ListView lv1 = (ListView) findViewById(R.id.listV_main);
        lv1.setAdapter(new ListEntryAdapter(this, image_details));

    }

    private ArrayList<ListEntry> getSearchResults() {
        ArrayList<ListEntry> results = new ArrayList<>();

        ListEntry list_entry = new ListEntry();
        list_entry.setName("Cleaner");
        list_entry.setImgId(1);
        results.add(list_entry);

        list_entry = new ListEntry();
        list_entry.setName("Defeatist");
        list_entry.setImgId(2);
        results.add(list_entry);

        list_entry = new ListEntry();
        list_entry.setName("Flumber");
        list_entry.setImgId(3);
        results.add(list_entry);

        list_entry = new ListEntry();
        list_entry.setName("Humanist");
        list_entry.setImgId(4);
        results.add(list_entry);

        list_entry = new ListEntry();
        list_entry.setName("Invulnerable");
        list_entry.setImgId(5);
        results.add(list_entry);

        list_entry = new ListEntry();
        list_entry.setName("Irresponsible");
        list_entry.setImgId(6);
        results.add(list_entry);

        list_entry = new ListEntry();
        list_entry.setName("Sloth");
        list_entry.setImgId(7);
        results.add(list_entry);

        list_entry = new ListEntry();
        list_entry.setName("Sniper");
        list_entry.setImgId(8);
        results.add(list_entry);

        list_entry = new ListEntry();
        list_entry.setName("Stormtrooper");
        list_entry.setImgId(9);
        results.add(list_entry);

        list_entry = new ListEntry();
        list_entry.setName("Victim");
        list_entry.setImgId(10);
        results.add(list_entry);

        return results;
    }
}
