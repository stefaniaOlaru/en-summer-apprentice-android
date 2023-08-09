package com.example.ticketmanagementsystem;

import android.animation.LayoutTransition;
import android.os.Build;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<ModelClass> arrayList;
    RecyclerView recyclerView;
    Adapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        arrayList = new ArrayList<>();
        arrayList.add(new ModelClass("UNTOLD", "În 2015, Untold a atras atenția printr-o campanie de promovare a evenimentului numită \"Pay with Blood\", în care donatorii de sânge primeau bilete gratuite la festival. Astfel, în luna iulie 2015, cei care donau sânge la caravana mobilă din Parcul Herăstrău București sau la Centrul de Transfuzie Sangvină din Cluj-Napoca, primeau pe loc bilete la festival. Inițiativa de a asocia Transilvania, Vlad Țepeș, vampirii și donarea de sânge a fost remarcată internațional", false));
        arrayList.add(new ModelClass("NEVERSEA", "Neversea Festival este cel mai mare festival de muzică care are loc pe o plajă din România. Acesta se desfășoară în fiecare an pe Neversea Beach din Constanța, în apropierea plajei Modern. Prima ediție a avut loc în anul 2017, iar festivalul atinge noi recorduri în fiecare an.", false));
        arrayList.add(new ModelClass("CHAMPIONS LEAGUE", "Liga Campionilor UEFA (engleză UEFA Champions League; numită Cupa Campionilor Europeni până în 1992), abreviată deseori UCL, este prima competiție fotbalistică inter-cluburi europeană ca valoare, peste Liga Europa, fiind organizată de UEFA. Ea reprezintă una dintre cele mai prestigioase trofee de cluburi în sport, alături de Copa Libertadores a Americii de Sud.", false));
        arrayList.add(new ModelClass("ELECTRIC CASTLE", "Electric Castle este un festival de muzică din România, care se desfășoară în fiecare an la Castelul Bánffy din comuna Bonțida, județul Cluj.[1] Festivalul îmbină în lineup zone muzicale variate cum ar fi rock, reggae, hip hop, trap, muzică electronică sau indie cu tehnologia, cu arta alternativă, arta stradală și cultura.", false));

        recyclerView = findViewById(R.id.recyclerView);
        adapter = new Adapter(arrayList, this);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//        recyclerView.setAdapter(adapter);
//
//        adapter.notifyDataSetChanged();

        ((SimpleItemAnimator) recyclerView.getItemAnimator()).setSupportsChangeAnimations(false);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);


        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu, menu);
        return true;
    }

}
