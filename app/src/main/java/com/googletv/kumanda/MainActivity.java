package com.googletv.kumanda;
import android.os.Bundle; import android.widget.*; import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    int vol=24, ch=7;
    protected void onCreate(Bundle b){
        super.onCreate(b);
        LinearLayout l=new LinearLayout(this); l.setOrientation(1); l.setPadding(40,40,40,40);
        TextView t=new TextView(this); t.setTextSize(22); t.setText("GTV Kumanda\nSes:"+vol+" Kanal:"+ch); l.addView(t);
        Button b1=new Button(this); b1.setText("Ses +"); b1.setOnClickListener(v->{vol++; t.setText("Ses:"+vol+" Kanal:"+ch);}); l.addView(b1);
        Button b2=new Button(this); b2.setText("Ses -"); b2.setOnClickListener(v->{if(vol>0)vol--; t.setText("Ses:"+vol+" Kanal:"+ch);}); l.addView(b2);
        Button b3=new Button(this); b3.setText("Kanal +"); b3.setOnClickListener(v->{ch++; t.setText("Ses:"+vol+" Kanal:"+ch);}); l.addView(b3);
        Button b4=new Button(this); b4.setText("Kanal -"); b4.setOnClickListener(v->{if(ch>1)ch--; t.setText("Ses:"+vol+" Kanal:"+ch);}); l.addView(b4);
        setContentView(l);
    }
}
