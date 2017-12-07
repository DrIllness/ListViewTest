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

        ArrayList<ImageEntry> imageList = createImageList();

        final ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(new ImageEntryAdapter(this, imageList));
    }

    private ArrayList<ImageEntry> createImageList() {
        ArrayList<ImageEntry> imageList = new ArrayList<>();
        int index = 0;

        ImageEntry imageEntry = new ImageEntry();
        imageEntry.setName(getString(R.string.cleaner));
        imageEntry.setImageId(R.drawable.cleaner);
        imageList.add(imageEntry);

        imageEntry = new ImageEntry();
        imageEntry.setName(getString(R.string.defeatist));
        imageEntry.setImageId(R.drawable.defeatist);
        imageList.add(imageEntry);

        imageEntry = new ImageEntry();
        imageEntry.setName(getString(R.string.flumber));
        imageEntry.setImageId(R.drawable.flumber);
        imageList.add(imageEntry);

        imageEntry = new ImageEntry();
        imageEntry.setName(getString(R.string.humanist));
        imageEntry.setImageId(R.drawable.humanist);
        imageList.add(imageEntry);

        imageEntry = new ImageEntry();
        imageEntry.setName(getString(R.string.invulnerable));
        imageEntry.setImageId(R.drawable.invulnerable);
        imageList.add(imageEntry);

        imageEntry = new ImageEntry();
        imageEntry.setName(getString(R.string.irrepressible));
        imageEntry.setImageId(R.drawable.irrepressible);
        imageList.add(imageEntry);

        imageEntry = new ImageEntry();
        imageEntry.setName(getString(R.string.sloth));
        imageEntry.setImageId(R.drawable.sloth);
        imageList.add(imageEntry);

        imageEntry = new ImageEntry();
        imageEntry.setName(getString(R.string.sniper));
        imageEntry.setImageId(R.drawable.sniper);
        imageList.add(imageEntry);

        imageEntry = new ImageEntry();
        imageEntry.setName(getString(R.string.stormtrooper));
        imageEntry.setImageId(R.drawable.stormtrooper);
        imageList.add(imageEntry);

        imageEntry = new ImageEntry();
        imageEntry.setName(getString(R.string.victim));
        imageEntry.setImageId(R.drawable.victim);
        imageList.add(imageEntry);

        return imageList;
    }
}
