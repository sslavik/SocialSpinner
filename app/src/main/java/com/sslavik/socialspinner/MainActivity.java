package com.sslavik.socialspinner;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import com.sslavik.socialspinner.adapter.SocialAdapter;
import com.sslavik.socialspinner.model.Social;
import com.sslavik.socialspinner.model.SocialComparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    // CAMPOS
    private Spinner spSocial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spSocial = findViewById(R.id.spinner);
        // CREAMOS EL ADAPTER
        SocialAdapter socialAdapter = new SocialAdapter(this, getSocialList());
        // Indicamos que tipo de vista queremos usar en el Spinner
        socialAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Indicamos al Spinner un
        spSocial.setAdapter(socialAdapter);

        spSocial.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(parent.getContext(), parent.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    private List<Social> getSocialList() {
        List<Social> socialList = new ArrayList<>();
        socialList.add(new Social(R.drawable.ic_google_brands, "Google",123,0));
        socialList.add(new Social(R.drawable.ic_facebook_f_brands, "Facebook",1234,2));
        socialList.add(new Social(R.drawable.ic_linkedin_brands, "Linkedin",22,23));
        socialList.add(new Social(R.drawable.ic_twitter_brands, "Twitter",22,25));
        socialList.sort(new SocialComparator());
        return socialList;
    }
}
