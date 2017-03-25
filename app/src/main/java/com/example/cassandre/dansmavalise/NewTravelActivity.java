package com.example.cassandre.dansmavalise;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.cassandre.dansmavalise.Database.Service;
import com.example.cassandre.dansmavalise.Enum.Enums;
import com.example.cassandre.dansmavalise.Tools.Tools;
import com.google.android.gms.maps.MapView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class NewTravelActivity extends AppCompatActivity {

    private AutoCompleteTextView destination;
    private Spinner sexe;
    private DatePicker dateDepart;
    private DatePicker dateFin;
    private Button valider;
    private View container;

    private Date dd;
    private Date df;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_travel);

        initGraphicsElements();
    }

    private void initGraphicsElements(){
        destination = (AutoCompleteTextView) findViewById(R.id.activity_new_travel_destination);
        sexe = (Spinner) findViewById(R.id.activity_new_travel_sexe);
        dateDepart = (DatePicker) findViewById(R.id.activity_new_travel_datedepart);
        dateFin = (DatePicker) findViewById(R.id.activity_new_travel_datedefin);
        valider = (Button) findViewById(R.id.activity_new_travel_valider);
        container = (View) findViewById(R.id.activity_new_travel);

        String[] dests = Service.getSingleton()
                .getArrayStringPays("")
                .toArray(new String[0]);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (getBaseContext() ,android.R.layout.simple_list_item_1, dests);
        destination.setThreshold(1);//will start working from first character
        destination.setAdapter(adapter);//setting the adapter data into the AutoCompleteTextView

        destination.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                String[] dests = Service.getSingleton()
                        .getArrayStringPays(destination.getText().toString())
                        .toArray(new String[0]);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>
                        (getBaseContext() ,android.R.layout.simple_list_item_1, dests);
                destination.setThreshold(1);//will start working from first character
                destination.setAdapter(adapter);//setting the adapter data into the AutoCompleteTextView

                return false;
            }
        });

        adapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, Tools.getNames(Enums.Sexe.class));
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sexe.setAdapter(adapter);

        dateDepart.setMinDate(System.currentTimeMillis() - 1000);
        dateFin.setMinDate(System.currentTimeMillis() - 1000);

        valider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate();
            }
        });
    }

    private void validate(){
        hideKeyBoard();

        //On vérifie le formulaire, et on instancie le message d'erreur(s) quand il y en a.
        String message = "";
        if(!Service.getSingleton()
                .checkLocation(destination.getText().toString())){
            message += getString(R.string.DestinationNonValide);
        }

        if(sexe.getSelectedItem().toString().equals(Enums.Sexe.unisexe.name())){
            if(!message.isEmpty()){
                message += "\n";
            }
            message += getString(R.string.SexeNonValide);
        }

        dd = new Date(dateDepart.getYear(), dateDepart.getMonth(), dateDepart.getDayOfMonth());
        df = new Date(dateFin.getYear(), dateFin.getMonth(), dateFin.getDayOfMonth());

        if(dd.after(df)){
            if(!message.isEmpty()){
                message += "\n";
            }
            message += getString(R.string.DateDepartApresFin);
        }

        if(!message.isEmpty()){
            Toast.makeText(this, message, Toast.LENGTH_LONG)
            .show();
            return;
        }

        showPopup(container);
    }

    private void hideKeyBoard(){
        View view = this.getCurrentFocus();
        InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    private void showPopup(View anchorView) {

        View popupView = getLayoutInflater().inflate(R.layout.confirmation_travel_popup, null);

        PopupWindow popupWindow = new PopupWindow(popupView,
                  LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);

        TextView dates = (TextView) popupView.findViewById(R.id.confirmation_travel_popup_dates);
        TextView jours = (TextView) popupView.findViewById(R.id.confirmation_travel_popup_nbJours);
        TextView sexeTv = (TextView) popupView.findViewById(R.id.confirmation_travel_popup_sexe);
        //MapView map = (MapView) findViewById(R.id.confirmation_travel_popup_mapView);

        dates.setText(dd.toString() + " - " + df.toString());
        int diff = (int)Math.abs(dd.getTime() - df.getTime()/ (24 * 60 * 60 * 1000));
        jours.setText(String.valueOf(diff));
        sexeTv.setText(sexe.getSelectedItem().toString());

        popupWindow.setFocusable(true);
        //popupWindow.setBackgroundDrawable(new ColorDrawable());
        popupWindow.showAtLocation(anchorView, Gravity.NO_GRAVITY,
                0, 0);

    }
}
