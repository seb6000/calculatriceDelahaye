package com.example.calcdelahaye;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    Button bouton0, bouton1, bouton2, bouton3, bouton4, bouton5, bouton6,
            bouton7, bouton8, bouton9, boutonPlus, boutonMoins, boutonDiv,
            boutonFois, boutonPoint, boutonC, boutonEgal, boutonPourcent, boutonEffacer;
    EditText nombre;
    TextView historique;

    float nb1, nb2;

    boolean calcPlus, calcMoins, calcMul, calcDiv;

    final DecimalFormat decimalFormat = new DecimalFormat("#.##########");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bouton0 = (Button) findViewById(R.id.bouton0);
        bouton1 = (Button) findViewById(R.id.bouton1);
        bouton2 = (Button) findViewById(R.id.bouton2);
        bouton3 = (Button) findViewById(R.id.bouton3);
        bouton4 = (Button) findViewById(R.id.bouton4);
        bouton5 = (Button) findViewById(R.id.bouton5);
        bouton6 = (Button) findViewById(R.id.bouton6);
        bouton7 = (Button) findViewById(R.id.bouton7);
        bouton8 = (Button) findViewById(R.id.bouton8);
        bouton9 = (Button) findViewById(R.id.bouton9);
        boutonPoint = (Button) findViewById(R.id.boutonPoint);
        boutonPlus = (Button) findViewById(R.id.boutonPlus);
        boutonMoins = (Button) findViewById(R.id.boutonMoins);
        boutonFois = (Button) findViewById(R.id.boutonFois);
        boutonDiv = (Button) findViewById(R.id.boutonDiv);
        boutonPourcent = (Button) findViewById(R.id.boutonPourcent);
        boutonC = (Button) findViewById(R.id.boutonC);
        boutonEgal = (Button) findViewById(R.id.boutonEgal);
        boutonEffacer = (Button) findViewById(R.id.boutonEffacer);
        nombre = (EditText) findViewById(R.id.nombre);
        historique = (TextView) findViewById(R.id.historique);


        bouton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nombre.setText(nombre.getText() + "1");
            }
        });

        bouton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nombre.setText(nombre.getText() + "2");
            }
        });

        bouton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nombre.setText(nombre.getText() + "3");
            }
        });

        bouton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nombre.setText(nombre.getText() + "4");
            }
        });

        bouton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nombre.setText(nombre.getText() + "5");
            }
        });

        bouton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nombre.setText(nombre.getText() + "6");
            }
        });

        bouton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nombre.setText(nombre.getText() + "7");
            }
        });

        bouton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nombre.setText(nombre.getText() + "8");
            }
        });

        bouton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nombre.setText(nombre.getText() + "9");
            }
        });

        bouton0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nombre.setText(nombre.getText() + "0");
            }
        });

        boutonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nombre == null) {
                    nombre.setText("");
                } else {
                    nb1 = Float.parseFloat(nombre.getText() + "");
                    calcPlus = true;
                    nombre.setText(null);
                }
            }
        });

        boutonMoins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String testNombre = String.valueOf(nombre.getText());
                if (!testNombre.equals("")) {
                    nb1 = Float.parseFloat(nombre.getText() + "");
                    calcMoins = true;
                    nombre.setText(null);
                }
            }
        });

        boutonFois.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String testNombre = String.valueOf(nombre.getText());
                if (!testNombre.equals("")) {
                    nb1 = Float.parseFloat(nombre.getText() + "");
                    calcMul = true;
                    nombre.setText(null);
                }
            }
        });

        boutonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String testNombre = String.valueOf(nombre.getText());
                if (!testNombre.equals("")){
                    nb1 = Float.parseFloat(nombre.getText() + "");
                    calcDiv = true;
                    nombre.setText(null);
                }
            }
        });

        boutonPourcent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                div100();
            }
        });

        boutonEffacer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                effacer();
            }
        });

        boutonEgal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nb2 = Float.parseFloat(nombre.getText() + "");

                if (calcPlus == true) {
                    nombre.setText(nb1 + nb2 + "");
                    historique.setText(nb1+"+"+nb2);
                    calcPlus = false;
                }

                if (calcMoins == true) {
                    nombre.setText(nb1 - nb2 + "");
                    historique.setText(nb1+"-"+nb2);
                    calcMoins = false;
                }

                if (calcMul == true) {
                    nombre.setText(nb1 * nb2 + "");
                    historique.setText(nb1+"*"+nb2);
                    calcMul = false;
                }

                if (calcDiv == true) {
                    nombre.setText(nb1 / nb2 + "");
                    historique.setText(nb1+"/"+nb2);
                    calcDiv = false;
                }
            }
        });

        boutonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nombre.setText("");
                historique.setText("");
            }
        });

        boutonPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nombre.setText(nombre.getText() + ".");
            }
        });

    }
    private void div100() {
        nb1 = Float.parseFloat(String.valueOf(nombre.getText()));
        historique.setText(nb1+"/100");
        nb1 = (nb1/100);
        nombre.setText(decimalFormat.format(nb1));
    }

    private void effacer(){
        String remplacement = String.valueOf(nombre.getText());
        if (!remplacement.equals("")){
            nombre.setText(remplacement.substring(0, remplacement.length()-1));
        }
    }
}