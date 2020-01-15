package com.dp.a2017sexyvalentinemessages;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class Teddy extends Activity {
    InterstitialAd mInterstitialAd;
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teddy);

        MobileAds.initialize(this, "ca-app-pub-7341848752460960/6494867938");
        mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();
        mAdView.loadAd(adRequest);

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-7341848752460960/7971601131");

        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                requestNewInterstitial();
            }
        });

        requestNewInterstitial();

        String[] teddys = {
                "I am sorry I am away, I am sorry on this special day, I just sent a special teddy, To wish you Happy Teddy Bear Day!",
                "Teddies are just another reason, Just another way to say I care, I will be there forever, No matter the good and bad times we share! Happy Teddy Bear Day!",
                "Hug a bear day is not how long you've been together; not how much you've given or receive; not how many times you've helped each other. Happy Teddy Bear Day!",
                "Life is a journey, and love is what makes that journey worthwhile. Happy Teddy Bear Day!",
                "By gifting you this teddy I want to show am ready to make you mine and fill my life with sunshine...",
                "A cute teddy bear, to my cute friend, on a cute occasions, just to say. Happy Teddy Bear Day",
                "Love can’t be described, It’s meant to be felt through the way we care, Wish you a happy teddy day, Hope there are more such days that we share.",
                "Never could tell you my love, never could I share the things of my heart, but on this special teddy day, will you be mine on this valentine ’s day?",
                "A cute teddy bear, to my cute friend, on a cute occasions, just to say. Happy Teddy Bear Day!",
                "By gifting you this teddy, I want to show you that I'm ready to make you mine, and fill my life with sunshine!",
                "What I need to live has been given to me. By the earth why I need to live has been given to me. Happy Teddy Bear Day!",
                "In this special valentine week, On this special teddy day, I want to confess my love for you, There never was, there never will be another you!",
                "Teddy bear day. I love my teddy. Happy teddy bear day You are my sweetest teddy bear. Happy Teddy Bear Day My Dear...",
                "You are eternal like love, You are cute as the stuffed toy, Take this teddy as my heart, It’s filled with my love and my joy!",
                "To my cutest cuddly love, who is certainly my life, this teddy bear is a sign, that you will be forever mine. Happy Teddy Bear Day!",
                "A teddy bear is a faithful friend you can pick him up at either end, his fur is the colour of breakfast toast, and he's always there when you need him most. Happy Teddy Bear Day!",
                "The Teddy Bear is the last toy that we part with. He is all that is left of that lost world where solutions seemed possible and a friend who saw no fault and made no reproach, waited forever in the old armchair",
                "The teddy bear is the last toy that we part with. He is all that is left of that lost world where solutions seemed possible and a friend who saw no fault and made no reproach, waited forever in the old armchair.",
                "To be always with you a life with you, I hope, I dream; to be always with you, how wonderful, it does seem Happy Teddy Bear Day!",
                "Boy: I am sure you love to cuddle, your teddy at night. Girl: Yeah, he is surely my cutey pie. Boy: How about this big teddy (me) replacing him for the rest of your life?",
                "Teddy bears don't need hearts as they are already stuffed with love.I m ur Teddy with a big heart. Happy Teddy Day...",
                "Teddy bear day is a day of love,  it's a day when you find your true love. A day of hearts and yummy candies. A day when cupid hits you with a love arrow. A day when you find your teddy bear, will you be mine?",
                "A teddy bear is like a friend you hug it, and cry to it when you are sad you talk to it when you feel alone! it doesnt matter what color, size or condition its in, its there for you no matter what. Happy Teddy Bear Day!",
                "Tell me I am good, tell me I love you more, tell me you got my gift, just see the teddy at your door! Happy Teddy Bear Day!",
                "On teddy bear day, we think of people who have cheered and encouraged us, who go out of their way to be kind and caring, who have enriched our lives just by being themselves. You are such a person. I’m so happy you’re my love. Happy Teddy Bear Day!",
                "You are my teddy bear I love to be your teddy bear I love to hug you. Happy Teddy Bear Day!",
                "By gifting you this teddy, I want to show you that I am ready to make you mine, and fill my life with sunshine! Happy Teddy Bear Day!",
                "A bedroom without a teddy is like a face without a smile. ",
                "You are the twinkle of my eyes; the smile on my lips; the joy of my face; without you I am incomplete. Happy Teddy Bear Day!",
                "Every day is a teddy day, when I am with you, but yet its worthy to celebrate, and the reason is you!",
                "Love can’t be described, It’s meant to be felt through the way we care, Wish you a happy teddy day, Hope there are more such days that we share!",
                "On teddy bear day we think of those who make our lives worthwhile, those gracious, friendly people who we think of with a smile. I am fortunate to know you, that's why I want to say, to a rare and special person: Happy Teddy Bear Day!",
                "I wish I were a cell in your blood, so I would be sure I was somewhere in your heart. Happy Teddy Bear Day!",
                "Are you missing me? Are you feeling lonely and gloomy? I have something for you, I just sent you a nice teddy, Happy Teddy Day!",
                "It’s Teddy Bear Day, and I’m thinking of someone cute and huggable who is you. Happy Teddy Bear Day!",
                "Love me love my teddy bear, kiss me kiss me my teddy bear, hug me hug me my teddy bear. Happy Teddy Bear Day!",
                "You are smile of my lips twinkle of my eyes and joy of my face without you I am nothing. Happy Teddy Bear Day 2017!",
                "Teddy bear day is a day of love, It's a day when you find your true love. A day of hearts and Yummy Candies. A day when cupid hits you with a love arrow. A day when you find your teddy bear, will you be mine?",
                "This is what I want to do, as my love is my virtue, you are special on every single day, wish you a happy teddy day!",
                "On teddy bear day, we think of people who have cheered and encouraged us, who go out of their way to be kind and caring, who have enriched our lives just by being themselves. You are such a person. I’m so happy you’re my love. Happy Teddy Bear Day...",
                "You are in my heart and mind wherever I go, on teddy bear day I would like to say, I care more than you know. Happy Teddy Bear Day!",
                "I wish I were a cell in your blood, so I would be sure I was somewhere in your heart. Happy Teddy Bear Day!",
                "Love knows no reason, love knows no lies. Love defies all reasons, love has no eyes. But love is not blind, love sees but doesn't mind. Happy Teddy Day To All!",
                "Wake in the deepest dark of night and hear the driving rain. Reach out a hand and take a paw and go to sleep again.",
                "To be always with you a life with you, I hope, I dream; to be always with you, how wonderful, it does seem. Happy Teddy Day!",
                "Don’t miss to see my gift, open it with the love and bond we share, you will like this small teddy, that reflects my passion and care!",
                "You are always my darling, you will be my date now and ever, this teddy is just for you, to express my love forever! Happy Teddy Day!",
                "I wish I was a teddy bear, that lay upon your bed. So every time you cuddled it, you cuddled me instead. Happy Teddy Bear Day!",
                "Love doesn’t know the rules, love just knows how to shine, happy teddy day sweetheart, I am yours and you are mine!",
                "Sitting on the beach a cottage small near a beautiful sea side sitting on the beach we will watch the coming tide. Each moment with you, as long as I am living; a life with you, is the only thing, I am dreaming. Happy Teddy Bear Day!",
                "Let the world stop turning, let the sun stop burning, let them tell me love's not worth going through. If it all falls apart, I will know deep in my heart, the only dream that mattered had come true in this life I was loved by you. Happy Teddy Bear Day!",
                "I am sweet and you are sour. So just shut up and give me flower! Happy Teddy Bear Day!",
                "Love me love my teddy bear,Kiss me kiss me my teddy Bear hug me hug me my teddy,Bear happy teddy bear day.",
                "You are in my heart and mind,Wherever I go,On teddy bear day I would,Like to say,I care more than you know.Happy Teddy Bear Day!",
                "A bedroom without a teddy,Is like a face without smile...By gifting this teddy I want,To show I love you, and want,The same response from you!",
                "I wish I was a teddy bear,That lay upon your bed.So every time you cuddled it,You cuddled me instead.Happy Teddy Bear Day!",
                "By gifting you this teddy,I want to show you that I am,Ready to make you mine,And fill my life with sunshine.Happy Teddy Bear Day My Dear!",
                "A teddy bear is like a friend,You hug it, and cry to it when,You are sad you talk to it when,You feel alone! it doesnt matter,What color, size or condition,It's in, it's there for you noMatter What. Teddy Bear Day!",
                "A teddy bear is a faithful friend,You can pick him up at either,End, his fur is the colour ofBreakfast toast, and he’sAlways there when you need himMost, Happy Teddy Bear Day!",
                "Love me Love ma teddy bear,Kiss me kiss me ma teddy bear,Hug me hug me ma teddy bear,Happy Teddy Bear Day!",
                "I am sending a teddy to you.Love my teddy bear, kiss my,Teddy bear, hug my teddy bear,Keep that teddy carefully,Because teddy has.My Heart Happy Teddy Day!",
                "To be always with you,A life with you, I Hope, I Dream,To be always with you, how wonderful,It does seem. Happy Teddy Bear Day!",
                "On teddy bear day, we think,Of people who have cheered and,Encouraged us, who go out of,Their way to be kind and caring,Who have enriched our lives just,By being themselvesYou are such a person.I’m so happy you’re...My Love Happy Teddy Bear Day!",
                "Teddy bear day is a day,Of love it’s a day when,You find your true love,A day of hearts and yummy,Candies a day when cupidHits you with a love arrow,A day when you find your teddy bear,Will you be mine.",
                "The soft cuddly teddyIs there to show,I will always be there,This you should know Happy Teddy Day!",
                "A cute teddy bear, To my cute friend,On a cute occasions,Just to say,Happy Teddy Bear Day!",
                "Without a bear,A bedroom without a teddy,Is like a face without a smile.Happy Teddy Bear Day!",
                "By gifting you this teddy,I want to show you I’m ready that,To make you mine and fill my life,With sunshine!",
                "It’s teddy bear day,And I’m thinking,Of someone cute and huggable,Who is you.Happy Teddy Bear Day!",
                "A sweet teddy bear,To my sweet mate,On a sweet events,Just to say,Happy Teddy Bear Day!",
                "The soft cuddly teddy,Is there to show,I will always be there,This you should know,Happy Teddy Bear Day!",
                "To my cutest cuddly wife,Who is certainly my life,This teddy bear is a sign,That you will be forever mine,Happy Teddy Bear Day!",
                "On teddy bear day, we think of people,Who have cheered and encouraged us,Who go out of their way,To be kind and caringWho have enriched our lives,Just by being themselves.You are such a person.I’m so happy you’re my love,Happy Teddy Bear Day!",
                "Teddy bear day,I love my teddy.Happy teddy bear day.You are my sweetest teddy bear Happy Teddy Bear Day!",
                "You’re in my thoughts and in my heart,Wherever I may go,On teddy bear day I’d like to say,I care more than you know!Cutest Teddy Bear Day!",
                "Teddy bear day is a day of love,It’s a day when you find your true love,A day of hearts and yummy candies,A day when cupid hits you with a love arrow,A day when you find your teddy bear.Will you be mine?",
                "Be mine teddy bear day,I am sending you this,Valentine wish with hugs and kisses too;Because there, is a place,Here in my heart that, is mad for only you!",
                "Even if the sun refused to shine,Even if romance ran out of rhyme,You would still have my heart until,The end of time you’re all,I need, my love,Happy Teddy Bear Day!",
                "You are the twinkle of my eyes, the smile on my lips, the joy of my face, without you I am incomplete, Happy Teddy Bear Day!",
                "I wish I were a cell in your blood,so I would be sure I was,Somewhere in your heart.Happy Teddy Bear Day!",
                "You are my sweetest lovable cutest teddy bear...Happy Teddy Bear Day!",
                "It’s Teddy Bear Day,And I’m thinking,Of someone cute and huggable,Who is you.Happy Teddy Bear Day!",
                "WITHOUT A BEAR: A bedroom without a teddy is like a face without a smile.",
                "A cute teddy bear,To my cutest friend,On a cute occasions,Happy Teddy Bear Day!",
                "You are Smile of my Lips,Twinkle of my eyes,and joy of my face,Without you I am nothing,Happy Teddy Bear Day!",
                "Boy: Do you hug your teddy bear while sleeping at night?Girl: Yes!Boy: Can I replace it for the rest of your life? :-)Happy Teddy Bear Day!To my cutest wife,Who is my life This teddy bear is a sign,That you will be forever mine...Happy Teddy Bear Day!",
                "The soft cuddly teddy is there to show,I will always be there,This you should know,Happy Teddy Bear Day!",
                "A true love is a durable fire,In the mind ever burningNever sick, never old, never deadFrom itself never turning.Happy Teddy Bear!",
                "Love knows no reason,Love knows no lies.Love defies all reasons,Love has no eyesBut love is not blind,Love sees but doesn’t mind Happy Teddy Day To All!",
                "Boy to Girl: I love you!Girl: I'm engaged and someone and I have a boyfriend too! Boy: (After thinking a lot) Please, I request you to check again. I'm ready for required adjustments. Happy Teddy Day!",
                "This message is to thank all the people who have spread their cuteness as like a teddy to my life. Hoping to keep this relationship cutest forever.",
                "It’s Teddy Bear Day Today ,and I’m thinking of someone cute and huggable who is you. Happy Teddy Bear Day.",
                "Teddy bears don’t need hearts as they are already stuffed with love. I'm your Teddy with a big heart. Happy Teddy Day!",
                "Love me Love my Teddy Bear, Kiss me Kiss me my Teddy Bear, Hug me Hug me my Teddy Bear, Happy Teddy Bear Day.",
                "To my cutest cuddly wife, Who is certainly my life, This teddy bear is a sign That you will be forever mine.",
                "The soft cuddly teddy is there to show, I will always be there this you should know. Happy Teddy Day!",
        };
        ArrayAdapter<String> sagarlAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, teddys);
        ListView tListView = (ListView) findViewById(R.id.tlv);
        tListView.setAdapter(sagarlAdapter);

        tListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String name = String.valueOf(adapterView.getItemAtPosition(position));
                Intent intent= new Intent(view.getContext(), lcp.class);
                intent.putExtra("status",name);
                startActivity(intent);
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
            }
        });
    }
    private void requestNewInterstitial() {
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice("SEE_YOUR_LOGCAT_TO_GET_YOUR_DEVICE_ID")
                .build();

        mInterstitialAd.loadAd(adRequest);
    }
    @Override
    public void onPause() {
        if (mAdView != null) {
            mAdView.pause();
        }
        super.onPause();
    }
    @Override
    public void onResume() {
        super.onResume();
        if (mAdView != null) {
            mAdView.resume();
        }
    }
    @Override
    public void onDestroy() {
        if (mAdView != null) {
            mAdView.destroy();
        }
        super.onDestroy();
    }
}
