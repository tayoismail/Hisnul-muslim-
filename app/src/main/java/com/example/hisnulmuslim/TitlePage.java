package com.example.hisnulmuslim;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.github.barteksc.pdfviewer.PDFView;

public class TitlePage extends AppCompatActivity { ListView ListView;
    String mTitle[] = {"When waking up","When wearing a garment","When wearing a new garment","Supplication said to someone wearing a new garment",
            "Before undressing", "Before entering the toilet","After leaving the toilet", "When starting ablution", "Upon completing the ablution",
            "When leaving the home", "When entering the home", "Going to the mosque", "Upon entering the mosque", "Upon leaving the mosque", "Upon hearing the adhan",
            "Supplication at the start of the prayer [after takbeer]", "While bowing in prayer [rukoo]", "Upon rising from the rukoo", "Supplication while prostrated [sujood]",
            "Sitting between two prostrations", "While prostrated due to recitation of the Quran", "The Tashahhud", "Prayers upon the Prophet [PBUH] after the tashahhud",
            "Supplication said after the last tashahhud and before tasleem", "Remembrance after the tasleem [prayer]", "Seeking guidance in forming a decision or choosing the proper course [Istikhara]",
            "Remembrance in the morning and evening", "Remembrance before sleeping", "Supplication when turning over during the night", "Upon experiencing fear, unrest, apprehensiveness during sleep",
            "Upon seeing good or bad dream", "Qunoot in the Witr prayer", "After the tasleem of the Witr prayer", "For anxiety and sorrow", "For someone in distress", "Upon encountering an enemy or those of authority",
            "For someone afflicted with doubt in his faith", "For settling debt", "Supplication for one afflicted by whispering in prayer or recitation", "Supplication for someone whose affairs have become difficult",
            "Upon committing a sin", "For expelling the devil and his whispering", "When stricken with mishap or overtaken by an affair", "Placing children under the protection of Allah",
            "When visiting the sick", "Excellence of visiting the sick", "Supplication of the sick who have renounced all hope of life", "Instruction for one nearing death", "Supplication for someone afflicted by a calamity",
            "When closing the eye of the deceased", "Supplication for the deceased at the funeral prayer", "When the deceased is a child", "Condolence", "Placing the deceased in the grave","After burying the deceased",
            "When visiting the grave","Supplication during a wind storm", "Upon hearing the thunder", "Supplication for rain", "Supplication when it rains","Supplication after rain",
            "Supplication when asking for clear skies", "Upon sighting the crescent moon", "Supplication upon breaking fast", "Supplication before eating", "Upon completing the meal",
            "Supplication of the guest for the host", "Supplication said to one offering a drink/meal or one who intended to do that", "When breaking fast in someone's home",
            "Supplication said by one fasting when presented with food and does not break his fast", "Supplication said upon seeing the early or premature fruit", "Upon sneezing",
            "Supplication said to the newlywed", "The groom's supplication on wedding night or when buying a ride", "Before sexual intercourse", "When angry",
            "Supplication said upon seeing someone in trial or tribulation", "Remembrance said at a sitting or gathering", "Supplication for the expiation of sin said at the conclusion of sitting or gathering",
            "Returning a supplication of forgiveness", "Supplication said to someone who does you a favour","Protection from the Dajjal", "Supplication said to someone who pronounces his love for you, for Allah's sake",
            "Supplication said to someone who has offered you some of his wealth", "Supplication said to the debtor when his debt is settled", "Supplication for fear shirk", "Returning a supplication after having bestowed a gift or charity upon someone",
            "Forbiddance of ascribing things to omen", "When mounting an animal or any means of transport", "Supplication for travel", "Supplication upon entering a town or village",
            "Supplication when entering the market", "Supplication when the mounted animal [or other means of transport] stumbles", "Supplication of the the traveller for the resident","Supplication of the resident for the traveller",
            "Remembrance while ascending or descending", "Prayer of the traveller as dawn approaches", "Stopping or lodging somewhere", "While returning from travel", "What to say upon receiving good or bad news",
            "Excellence of sending prayers upon the Prophet[PBUH]", "Excellence of spreading the Islamic greetings", "Supplication upon hearing a rooster crow or the braying of an ass",
            "Upon hearing the barking of dogs at night", "Supplication said for someone you have insulted", "The etiquette of praising a fellow Muslim", "Supplication said between the yemeni corner and the black stone [at the Ka'bah]",
            "Supplication said when at Mount Safa & Mount Marwah", "The Day of Arafah", "At the sacred site [Al-Mash'al-Haraam]", "When throwing each pebble at the Jamarat", "At the black stone",
            "Supplication made against an enemy","What to say when in fear of a people", "What to say at times of amazement and delight", "What to do upon receiving pleasant news",
            "What to say or do when feeling some pain in the body", "What to say when in fear of afflicting something or someone with one's eye", "Etiquette of retiring for the night","The Talbiyah for Hajj or Umrah",
            "What to say when startled", "What is said to a kaafir when he sneezes", "Returning a greeting to a kaafir", "When insulted while fasting", "When slaughtering or offering a sacrifice",
            "To ward off the deception of the of the obstinate shaytaan", "Seeking forgiveness and repentance","Excellence of remembrance and glorification of Allah", "How the Prophet made tasbeeh"};


    int images[] = {R.drawable.wake, R.drawable.cloth, R.drawable.garment, R.drawable.garment2, R.drawable.cloth, R.drawable.toilet2, R.drawable.toilet,
            R.drawable.wudhu, R.drawable.wudu, R.drawable.home, R.drawable.house, R.drawable.mosque, R.drawable.musk, R.drawable.mosque, R.drawable.ayasolah, R.drawable.general,R.drawable.ruku,
            R.drawable.bow, R.drawable.sujud, R.drawable.prayer1, R.drawable.quran, R.drawable.tashaud, R.drawable.muhammad2, R.drawable.tashaud, R.drawable.prayer3, R.drawable.istikara,
            R.drawable.prayer4,R.drawable.sick3, R.drawable.gotobed,R.drawable.sick, R.drawable.dream, R.drawable.prayer4, R.drawable.prayer2, R.drawable.sorrow, R.drawable.prayer1,
            R.drawable.prayer3, R.drawable.doubt, R.drawable.debt, R.drawable.prayer4, R.drawable.prayer1, R.drawable.sin, R.drawable.prayer4,R.drawable.prayer2, R.drawable.children,
            R.drawable.sick2, R.drawable.getwell, R.drawable.sick,R.drawable.death, R.drawable.trial, R.drawable.eyeclosed, R.drawable.prayer4, R.drawable.prayer3, R.drawable.itwillbefine, R.drawable.dead, R.drawable.dead,
            R.drawable.graveyard, R.drawable.wind, R.drawable.thunder, R.drawable.prayer4,R.drawable.rain, R.drawable.rain2, R.drawable.night, R.drawable.night3, R.drawable.fasting, R.drawable.food, R.drawable.food,
            R.drawable.prayer4,R.drawable.prayer3, R.drawable.fasting,R.drawable.prayer4, R.drawable.fruit, R.drawable.sneeze, R.drawable.weded, R.drawable.marriagelife, R.drawable.marriage,
            R.drawable.angry,R.drawable.trial, R.drawable.prayer4, R.drawable.prayer3,R.drawable.forgiveme1, R.drawable.praise1, R.drawable.dajjal,R.drawable.praises, R.drawable.money,
            R.drawable.debt, R.drawable.tawheed, R.drawable.prayer4, R.drawable.no,R.drawable.ride, R.drawable.travel3, R.drawable.town, R.drawable.market1, R.drawable.ride,R.drawable.gudbye,
            R.drawable.gudbye1, R.drawable.general,R.drawable.night,R.drawable.stopover, R.drawable.travel4, R.drawable.badnew, R.drawable.muhammad2, R.drawable.assalaam,R.drawable.prayer4,
            R.drawable.prayer3,R.drawable.no,R.drawable.praises,R.drawable.blackstone,R.drawable.sofa, R.drawable.arafa, R.drawable.hajj1,R.drawable.jamarat, R.drawable.blackstone,
            R.drawable.enemy,R.drawable.fear, R.drawable.happy, R.drawable.gudnews, R.drawable.pain,R.drawable.eye,R.drawable.night3,R.drawable.hajj1, R.drawable.surprise, R.drawable.sneeze,
            R.drawable.hello, R.drawable.no, R.drawable.eid, R.drawable.lies, R.drawable.forgiveme1, R.drawable.general, R.drawable.muhammad2};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title_page);

        ListView = (ListView) findViewById(R.id.listview);

        myAdapter adapter = new myAdapter(this, mTitle, images);
        ListView.setAdapter(adapter);


        ListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                String item = ListView.getItemAtPosition(position).toString();

                Intent start = new Intent(getApplicationContext(), PDFOpener.class);
                start.putExtra("pdfFileName", item);
                startActivity(start);

            }
        });



    }
    class myAdapter extends ArrayAdapter<String>
    {
        Context context;
        String rTitle[];
        int rImg[];

        myAdapter(Context c,String title[],int img[])
        {
            super(c, R.layout.row, R.id.textView,title);
            this.context = c;
            this.rTitle = title;
            this.rImg = img;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
        {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            View row = layoutInflater.inflate(R.layout.row, parent, false);
            ImageView imageView = row.findViewById(R.id.image);
            TextView myTitle = row.findViewById(R.id.textView);


            imageView.setImageResource(rImg[position]);
            myTitle.setText(rTitle[position]);

            return row;


        }
    }
}
