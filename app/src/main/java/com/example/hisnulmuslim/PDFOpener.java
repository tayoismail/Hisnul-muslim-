package com.example.hisnulmuslim;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class PDFOpener extends AppCompatActivity {

    PDFView myPDFViewer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfopener);

        myPDFViewer = (PDFView) findViewById(R.id.pdfViewer);

        String getItem = getIntent().getStringExtra("pdfFileName");

        getSupportActionBar().setTitle(getItem);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        if (getItem.equals("When waking up"))
        {
            myPDFViewer.fromAsset("Copy of When waking up.pdf").load();
        }

        if (getItem.equals("When wearing a garment"))
        {
            myPDFViewer.fromAsset("When wearing a garment.pdf").load();
        }

        if (getItem.equals("When wearing a new garment"))
        {
            myPDFViewer.fromAsset("Supplication said when wearing a new garment.pdf").load();
        }

        if (getItem.equals("Supplication said to someone wearing a new garment"))
        {
            myPDFViewer.fromAsset("Supplication said to someone wearing a new garment.pdf").load();
        }

        if (getItem.equals("Before undressing"))
        {
            myPDFViewer.fromAsset("Before undressing.pdf").load();
        }

        if (getItem.equals("Before entering the toilet"))
        {
            myPDFViewer.fromAsset("Before entering the toilet.pdf").load();
        }

        if (getItem.equals("After leaving the toilet"))
        {
            myPDFViewer.fromAsset("After leaving the toilet.pdf").load();
        }

        if (getItem.equals("When starting ablution"))
        {
            myPDFViewer.fromAsset("When starting ablution.pdf").load();
        }

        if (getItem.equals("Upon completing the ablution"))
        {
            myPDFViewer.fromAsset("Upon completing the ablution.pdf").load();
        }

        if (getItem.equals("When leaving the home"))
        {
            myPDFViewer.fromAsset("When leaving the home.pdf").load();
        }

        if (getItem.equals("When entering the home"))
        {
            myPDFViewer.fromAsset("Upon entering the home.pdf").load();
        }

        if (getItem.equals("Going to the mosque"))
        {
            myPDFViewer.fromAsset("Supplication when going to mosque.pdf").load();
        }

        if (getItem.equals("Upon entering the mosque"))
        {
            myPDFViewer.fromAsset("Supplication upon entering the mosque.pdf").load();
        }

        if (getItem.equals("Upon leaving the mosque"))
        {
            myPDFViewer.fromAsset("Upon leaving the mosque.pdf").load();
        }

        if (getItem.equals("Upon hearing the adhan"))
        {
            myPDFViewer.fromAsset("Supplication related to the athan.pdf").load();
        }

        if (getItem.equals("Supplication at the start of the prayer [after takbeer]"))
        {
            myPDFViewer.fromAsset("Supplication at the start of the prayer.pdf").load();
        }

        if (getItem.equals("While bowing in prayer [rukoo]"))
        {
            myPDFViewer.fromAsset("While bowing in prayer (rukoo).pdf").load();
        }

        if (getItem.equals("Upon rising from the rukoo"))
        {
            myPDFViewer.fromAsset("Upon rising from the bowing position.pdf").load();
        }

        if (getItem.equals("Supplication while prostrated [sujood]"))
        {
            myPDFViewer.fromAsset("Supplication whilst prostrating (sujood).pdf").load();
        }

        if (getItem.equals("Sitting between two prostrations"))
        {
            myPDFViewer.fromAsset("Supplication between the two prostrations.pdf").load();
        }

        if (getItem.equals("While prostrated due to recitation of the Quran"))
        {
            myPDFViewer.fromAsset("Supplication when prostrating due to recitation of the Quran.pdf").load();
        }

        if (getItem.equals("The Tashahhud"))
        {
            myPDFViewer.fromAsset("The Tashahhud.pdf").load();
        }

        if (getItem.equals("Prayers upon the Prophet [PBUH] after the tashahhud"))
        {
            myPDFViewer.fromAsset("Prayers upon the Prophet (SAW)  after the tashahhud.pdf").load();
        }

        if (getItem.equals("Supplication said after the last tashahhud and before tasleem"))
        {
            myPDFViewer.fromAsset("Supplication said after the last tashahhud and before salam.pdf").load();
        }

        if (getItem.equals("Remembrance after the tasleem [prayer]"))
        {
            myPDFViewer.fromAsset("Remembrance after salam.pdf").load();
        }

        if (getItem.equals("Seeking guidance in forming a decision or choosing the proper course [Istikhara]"))
        {
            myPDFViewer.fromAsset("Seeking guidance in forming a decision (Al-Istikharah).pdf").load();
        }

        if (getItem.equals("Remembrance in the morning and evening"))
        {
            myPDFViewer.fromAsset("Remembrance in the morning and evening.pdf").load();
        }

        if (getItem.equals("Remembrance before sleeping"))
        {
            myPDFViewer.fromAsset("Remembrance before sleeping.pdf").load();
        }

        if (getItem.equals("Supplication when turning over during the night"))
        {
            myPDFViewer.fromAsset("Supplication when turning over during the night.pdf").load();
        }

        if (getItem.equals("Upon experiencing fear, unrest, apprehensiveness during sleep"))
        {
            myPDFViewer.fromAsset("Upon experiencing unrest, fear, apprehensiveness and the like during sleep.pdf").load();
        }

        if (getItem.equals("Upon seeing good or bad dream"))
        {
            myPDFViewer.fromAsset("Upon seeing a good dream or a bad dream.pdf").load();
        }

        if (getItem.equals("Qunoot in the Witr prayer"))
        {
            myPDFViewer.fromAsset("Qunoot in Witr.pdf").load();
        }

        if (getItem.equals("After the tasleem of the Witr prayer"))
        {
            myPDFViewer.fromAsset("Remembrance immediately after salam of the witr prayer.pdf").load();
        }

        if (getItem.equals("For anxiety and sorrow"))
        {
            myPDFViewer.fromAsset("Supplication for anxiety and sorrow.pdf").load();
        }

        if (getItem.equals("For someone in distress"))
        {
            myPDFViewer.fromAsset("Supplication for one in distress.pdf").load();
        }

        if (getItem.equals("Upon encountering an enemy or those of authority"))
        {
            myPDFViewer.fromAsset("Upon encountering an enemy or those of authority.pdf").load();
        }

        if (getItem.equals("For someone afflicted with doubt in his faith"))
        {
            myPDFViewer.fromAsset("Supplication for one afflicted with doubt in his faith.pdf").load();
        }

        if (getItem.equals("For settling debt"))
        {
            myPDFViewer.fromAsset("Settling a debt.pdf").load();
        }

        if (getItem.equals("Supplication for one afflicted by whispering in prayer or recitation"))
        {
            myPDFViewer.fromAsset("Supplication for one afflicted by whispering in prayer or recitation.pdf").load();
        }

        if (getItem.equals("Supplication for someone whose affairs have become difficult"))
        {
            myPDFViewer.fromAsset("Supplication for one whose affairs have become difficult.pdf").load();
        }

        if (getItem.equals("Upon committing a sin"))
        {
            myPDFViewer.fromAsset("Upon committing a sin.pdf").load();
        }

        if (getItem.equals("For expelling the devil and his whispering"))
        {
            myPDFViewer.fromAsset("Supplication for expelling the devil and his whispering.pdf").load();
        }

        if (getItem.equals("When stricken with mishap or overtaken by an affair"))
        {
            myPDFViewer.fromAsset("Supplication when stricken with a mishap or overtaken by an affair.pdf").load();
        }

        if (getItem.equals("Placing children under the protection of Allah"))
        {
            myPDFViewer.fromAsset("Placing children under Allah's protection.pdf").load();
        }

        if (getItem.equals("When visiting the sick"))
        {
            myPDFViewer.fromAsset("When visiting the sick.pdf").load();
        }

        if (getItem.equals("Excellence of visiting the sick"))
        {
            myPDFViewer.fromAsset("Excellence of visiting the sick.pdf").load();
        }

        if (getItem.equals("Supplication of the sick who have renounced all hope of life"))
        {
            myPDFViewer.fromAsset("Supplication of the sick who have renounced all hope of life.pdf").load();
        }

        if (getItem.equals("Instruction for one nearing death"))
        {
            myPDFViewer.fromAsset("Instruction for the one nearing death.pdf").load();
        }

        if (getItem.equals("Supplication for someone afflicted by a calamity"))
        {
            myPDFViewer.fromAsset("Supplication for one afflicted by a calamity.pdf").load();
        }

        if (getItem.equals("When closing the eye of the deceased"))
        {
            myPDFViewer.fromAsset("When closing the eyes of the deceased.pdf").load();
        }

        if (getItem.equals("Supplication for the deceased at the funeral prayer"))
        {
            myPDFViewer.fromAsset("Supplication for the deceased at the funeral prayer.pdf").load();
        }

        if (getItem.equals("When the deceased is a child"))
        {
            myPDFViewer.fromAsset("When the deceased is a child.pdf").load();
        }

        if (getItem.equals("Condolence"))
        {
            myPDFViewer.fromAsset("Condolence.pdf").load();
        }

        if (getItem.equals("Placing the deceased in the grave"))
        {
            myPDFViewer.fromAsset("Placing the deceased in the grave.pdf").load();
        }

        if (getItem.equals("After burying the deceased"))
        {
            myPDFViewer.fromAsset("After burying the deceased.pdf").load();
        }

        if (getItem.equals("When visiting the grave"))
        {
            myPDFViewer.fromAsset("Visiting the graves.pdf").load();
        }

        if (getItem.equals("Supplication during a wind storm"))
        {
            myPDFViewer.fromAsset("Prayer said during a wind storm.pdf").load();
        }

        if (getItem.equals("Upon hearing the thunder"))
        {
            myPDFViewer.fromAsset("Supplication upon hearing thunder.pdf").load();
        }

        if (getItem.equals("Supplication for rain"))
        {
            myPDFViewer.fromAsset("Supplication for rain.pdf").load();
        }

        if (getItem.equals("Supplication when it rains"))
        {
            myPDFViewer.fromAsset("Supplication said when it rains.pdf").load();
        }

        if (getItem.equals("Supplication after rain"))
        {
            myPDFViewer.fromAsset("After rainfall.pdf").load();
        }

        if (getItem.equals("Supplication when asking for clear skies"))
        {
            myPDFViewer.fromAsset("Asking for clear skies.pdf").load();
        }

        if (getItem.equals("Upon sighting the crescent moon"))
        {
            myPDFViewer.fromAsset("Upon sighting the crescent moon.pdf").load();
        }

        if (getItem.equals("Supplication upon breaking fast"))
        {
            myPDFViewer.fromAsset("Upon breaking fast.pdf").load();
        }


        if (getItem.equals("Supplication before eating"))
        {
            myPDFViewer.fromAsset("Supplication before eating.pdf").load();
        }

        if (getItem.equals("Upon completing the meal"))
        {
            myPDFViewer.fromAsset("Upon completing the meal.pdf").load();
        }

        if (getItem.equals("Supplication of the guest for the host"))
        {
            myPDFViewer.fromAsset("Supplication of the guest for the host.pdf").load();
        }

        if (getItem.equals("Supplication said to one offering a drink/meal or one who intended to do that"))
        {
            myPDFViewer.fromAsset("Supplication said to one offering a drink_meal or to one who intended to do that.pdf").load();
        }

        if (getItem.equals("When breaking fast in someone's home"))
        {
            myPDFViewer.fromAsset("Supplication said when breaking fast in someone's home.pdf").load();
        }

        if (getItem.equals("Supplication said by one fasting when presented with food and does not break his fast"))
        {
            myPDFViewer.fromAsset("Supplication said by one fasting when presented with food and does not break his fast.pdf").load();
        }

        if (getItem.equals("Supplication said upon seeing the early or premature fruit"))
        {
            myPDFViewer.fromAsset("Supplication said upon seeing the early or premature fruit.pdf").load();
        }

        if (getItem.equals("Upon sneezing"))
        {
            myPDFViewer.fromAsset("Supplication said upon sneezing.pdf").load();
        }

        if (getItem.equals("Supplication said to the newlywed"))
        {
            myPDFViewer.fromAsset("Supplication said to the newlywed.pdf").load();
        }

        if (getItem.equals("The groom's supplication on wedding night or when buying a ride"))
        {
            myPDFViewer.fromAsset("The groom's supplication on the wedding night or when buying an animal.pdf").load();
        }

        if (getItem.equals("Before sexual intercourse"))
        {
            myPDFViewer.fromAsset("Supplication before sexual intercourse.pdf").load();
        }

        if (getItem.equals("When angry"))
        {
            myPDFViewer.fromAsset("When angry.pdf").load();
        }

        if (getItem.equals("Supplication said upon seeing someone in trial or tribulation"))
        {
            myPDFViewer.fromAsset("Supplication said upon seeing someone in trial or tribulation.pdf").load();
        }

        if (getItem.equals("Remembrance said at a sitting or gathering"))
        {
            myPDFViewer.fromAsset("Remembrance said at a sitting or gathering.pdf").load();
        }

        if (getItem.equals("Supplication for the expiation of sin said at the conclusion of sitting or gathering"))
        {
            myPDFViewer.fromAsset("Supplication for the expiation of sins said at the conclusion of a sitting or gathering.pdf").load();
        }

        if (getItem.equals("Returning a supplication of forgiveness"))
        {
            myPDFViewer.fromAsset("Returning a supplication of forgiveness.pdf").load();
        }

        if (getItem.equals("Supplication said to someone who does you a favour"))
        {
            myPDFViewer.fromAsset("Supplication said to one who does you a favor.pdf").load();
        }

        if (getItem.equals("Protection from the Dajjal"))
        {
            myPDFViewer.fromAsset("Protection from the Dajjal.pdf").load();
        }

        if (getItem.equals("Supplication said to someone who pronounces his love for you, for Allah's sake"))
        {
            myPDFViewer.fromAsset("Supplication said to one who pronounces his love for you, for Allah's sake.pdf").load();
        }

        if (getItem.equals("Supplication said to someone who has offered you some of his wealth"))
        {
            myPDFViewer.fromAsset("Supplication said to one who has offered you some of his wealth.pdf").load();
        }

        if (getItem.equals("Supplication said to the debtor when his debt is settled"))
        {
            myPDFViewer.fromAsset("Supplication said to the debtor when his debt is settled.pdf").load();
        }

        if (getItem.equals("Supplication for fear shirk"))
        {
            myPDFViewer.fromAsset("Supplication for fear of shirk.pdf").load();
        }

        if (getItem.equals("Returning a supplication after having bestowed a gift or charity upon someone"))
        {
            myPDFViewer.fromAsset("Returning a supplication after having bestowed a gift or charity upon someone.pdf").load();
        }

        if (getItem.equals("Forbiddance of ascribing things to omen"))
        {
            myPDFViewer.fromAsset("Forbiddance of ascribing things to omens.pdf").load();
        }

        if (getItem.equals("When mounting an animal or any means of transport"))
        {
            myPDFViewer.fromAsset("Supplication said when mounting an animal or any means of transport.pdf").load();
        }

        if (getItem.equals("Supplication for travel"))
        {
            myPDFViewer.fromAsset("Supplication for travel.pdf").load();
        }

        if (getItem.equals("Supplication upon entering a town or village"))
        {
            myPDFViewer.fromAsset("Supplication upon entering a town or village.pdf").load();
        }

        if (getItem.equals("Supplication when entering the market"))
        {
            myPDFViewer.fromAsset("When entering the market.pdf").load();
        }

        if (getItem.equals("Supplication when the mounted animal [or other means of transport] stumbles"))
        {
            myPDFViewer.fromAsset("Supplication for when the mounted animal (or mean of transport) stumbles.pdf").load();
        }

        if (getItem.equals("Supplication of the the traveller for the resident"))
        {
            myPDFViewer.fromAsset("Supplication of the traveler for the resident.pdf").load();
        }

        if (getItem.equals("Supplication of the resident for the traveller"))
        {
            myPDFViewer.fromAsset("Supplication of the resident for the traveler.pdf").load();
        }

        if (getItem.equals("Remembrance while ascending or descending"))
        {
            myPDFViewer.fromAsset("Remembrance while ascending or descending.pdf").load();
        }

        if (getItem.equals("Prayer of the traveller as dawn approaches"))
        {
            myPDFViewer.fromAsset("Prayer of the traveler as dawn approaches.pdf").load();
        }

        if (getItem.equals("Stopping or lodging somewhere"))
        {
            myPDFViewer.fromAsset("Stopping or lodging somewhere.pdf").load();
        }

        if (getItem.equals("While returning from travel"))
        {
            myPDFViewer.fromAsset("While returning from travel.pdf").load();
        }

        if (getItem.equals("What to say upon receiving good or bad news"))
        {
            myPDFViewer.fromAsset("What to say upon receiving pleasing or displeasing news.pdf").load();
        }

        if (getItem.equals("Excellence of sending prayers upon the Prophet[PBUH]"))
        {
            myPDFViewer.fromAsset("Excellence of sending prayers upon the Prophet.pdf").load();
        }

        if (getItem.equals("Excellence of spreading the Islamic greetings"))
        {
            myPDFViewer.fromAsset("Excellence of spreading the Islamic greeting.pdf").load();
        }

        if (getItem.equals("Supplication upon hearing a rooster crow or the braying of an ass"))
        {
            myPDFViewer.fromAsset("Supplication said upon hearing a rooster crow or the braying of an ass.pdf").load();
        }

        if (getItem.equals("Upon hearing the barking of dogs at night"))
        {
            myPDFViewer.fromAsset("Supplication upon hearing the barking of dogs at night.pdf").load();
        }

        if (getItem.equals("Supplication said for someone you have insulted"))
        {
            myPDFViewer.fromAsset("Supplication said for one you have insulted.pdf").load();
        }

        if (getItem.equals("The etiquette of praising a fellow Muslim"))
        {
            myPDFViewer.fromAsset("The etiquette of praising a fellow Muslim.pdf").load();
        }

        if (getItem.equals("Supplication said between the yemeni corner and the black stone [at the Ka'bah]"))
        {
            myPDFViewer.fromAsset("Supplication said between the Yemeni corner and the black stone (at the Ka'bah).pdf").load();
        }

        if (getItem.equals("Supplication said when at Mount Safa & Mount Marwah"))
        {
            myPDFViewer.fromAsset("Supplication said when at Mount Safa & Mount Marwah.pdf").load();
        }

        if (getItem.equals("The Day of Arafah"))
        {
            myPDFViewer.fromAsset("The Day of Arafah.pdf").load();
        }

        if (getItem.equals("At the sacred site [Al-Mash'al-Haraam]"))
        {
            myPDFViewer.fromAsset("At the Sacred Site (Al-Mash-a Al-Haram).pdf").load();
        }

        if (getItem.equals("When throwing each pebble at the Jamarat"))
        {
            myPDFViewer.fromAsset("When throwing each pebble at the Jamarat.pdf").load();
        }

        if (getItem.equals("At the black stone"))
        {
            myPDFViewer.fromAsset("At the black stone.pdf").load();
        }

        if (getItem.equals("Supplication made against an enemy"))
        {
            myPDFViewer.fromAsset("Supplication made against an enemy.pdf").load();
        }

        if (getItem.equals("What to say when in fear of a people"))
        {
            myPDFViewer.fromAsset("What to say when in fear of a people.pdf").load();
        }

        if (getItem.equals("What to say at times of amazement and delight"))
        {
            myPDFViewer.fromAsset("What to say at times of amazement and delight.pdf").load();
        }

        if (getItem.equals("What to do upon receiving pleasant news"))
        {
            myPDFViewer.fromAsset("What to do upon receiving pleasant news.pdf").load();
        }

        if (getItem.equals("What to say or do when feeling some pain in the body"))
        {
            myPDFViewer.fromAsset("What to say and do when feeling some pain in the body.pdf").load();
        }

        if (getItem.equals("What to say when in fear of afflicting something or someone with one's eye"))
        {
            myPDFViewer.fromAsset("What to say when in fear of afflicting something or someone with one's eye.pdf").load();
        }

        if (getItem.equals("Etiquette of retiring for the night"))
        {
            myPDFViewer.fromAsset("Etiquette of retiring for the night.pdf").load();
        }

        if (getItem.equals("The Talbiyah for Hajj or Umrah"))
        {
            myPDFViewer.fromAsset("The Talbiyah.pdf").load();
        }

        if (getItem.equals("What to say when startled"))
        {
            myPDFViewer.fromAsset("What to say when startled.pdf").load();
        }

        if (getItem.equals("What is said to a kaafir when he sneezes"))
        {
            myPDFViewer.fromAsset("What is said to a Kafir when he sneezes.pdf").load();
        }

        if (getItem.equals("Returning a greeting to a kaafir"))
        {
            myPDFViewer.fromAsset("Returning a greeting to a Kafir.pdf").load();
        }

        if (getItem.equals("When insulted while fasting"))
        {
            myPDFViewer.fromAsset("When insulted while fasting.pdf").load();
        }

        if (getItem.equals("When slaughtering or offering a sacrifice"))
        {
            myPDFViewer.fromAsset("When slaughtering or offering a sacrifice.pdf").load();
        }

        if (getItem.equals("To ward off the deception of the of the obstinate shaytaan"))
        {
            myPDFViewer.fromAsset("What is said to ward off the deception of the Obstinate Shaytan.pdf").load();
        }

        if (getItem.equals("Seeking forgiveness and repentance"))
        {
            myPDFViewer.fromAsset("Seeking forgiveness and repentance.pdf").load();
        }

        if (getItem.equals("Excellence of remembrance and glorification of Allah"))
        {
            myPDFViewer.fromAsset("Excellence of remembrance and glorification of Allah.pdf").load();
        }

        if (getItem.equals("How the Prophet made tasbeeh"))
        {
            myPDFViewer.fromAsset("How the prophet [PBUH] made tasbeeh.pdf").load();
        }

    }
}