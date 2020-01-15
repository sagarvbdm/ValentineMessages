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

public class Valentine extends Activity {
    InterstitialAd mInterstitialAd;
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_valentine);

        MobileAds.initialize(this, "ca-app-pub-7341848752460960/8250802732");
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

        String[] vals = {
                "Happy Valentine's Day to the most special person in my life. You are my love, my heart and my joy.",
                "I love you for not what you are, but what I have become when I am there with you. So be with me forever. Happy Valentine's Day!",
                "Love is not finding someone to live with; it's finding someone you can't live without.” ? Rafael Ortiz",
                "“Love is composed of a single soul inhabiting two bodies.” ? Aristotle",
                "“Where there is love there is life.” ? Gandhi",
                "“Love is our true destiny. We do not find the meaning of life by ourselves alone - we find it with another.” ? Thomas Merton",
                "“Love is missing someone whenever you're apart, but somehow feeling warm inside because you're close in heart.” ? Kay Knudsen",
                "Anyone can catch your eye, but it takes someone special to catch your heart.",
                "Today I like you. Tomorrow I will love you through the frights. Through the cold nights. ",
                "I love you always and forever. Happy Valentine’s Day!",
                "When love is not madness, it is not love.Pedro Calderon de la Barca",
                "“It was love at first sight, at last sight, at ever and ever sight.” ? Vladimir Nabokov",
                "Love is the happiness of today, and promise of tomorrow, so this warm note comes to U, to say that you must live life with a heart full of love. Happy Valentine's Day my love!",
                "Trip over love, you can get up. Fall in love and you fall forever.",
                "“A true lover always feels in debt to the one he loves.” ? Ralph W. Sockman",
                "All I wanted was someone to care for me. All I wanted was someone who would be there for me. All I ever wanted was someone who would be true. All I ever wanted was someone like you. Happy Valentine's Day to my inspiration",
                "You've always been my sunshine on a cloudy day, my shoulder to cry on and a helpful hand when I needed you. You deserve this special day as a reminder of the impact you've made on my life. Happy Valentine's Day to my one and only.",
                "“For it was not into my ear you whispered, but into my heart. It was not my lips you kissed, but my soul.” ? Judy Garland",
                "“For you see, each day I love you more, today more than yesterday and less than tomorrow.” ? Rosemonde Gerard",
                "“The art of love... is largely the art of persistence.” ? Albert Ellis",
                "“Love is the condition in which the happiness of another person is essential to your own.” ? Robert Heinlein",
                "“You know you're in love when you can't fall asleep because reality is finally better than your dreams.” ? Dr. Seuss",
                "“Each moment of a happy lover's hour is worth an age of dull and common life.” ? Aphra Behn",
                "“Where there is love there is life.” ? Mahatma Gandhi ",
                "There is only happiness in life, to love and be loved.",
                "Anyone can catch your eye, but it takes someone special to catch your heart.",
                "Love is when a girl puts on perfume and a boy puts on shaving cologne and they go out and smell each other.",
                "No matter what has happened. No matter what you’ve done. No matter what you will do. I will always love you. I swear it.",
                "You are a pure fresh flower in the garden of my heart.",
                "We spend too much time looking for the perfect person to love instead of perfecting the love we give!",
                "Don't wait until it's too late to tell someone how much you love, how much you care.",
                "Every time you texts me my cheeks hurt! I guess I smile too big.",
                "When the angels ask what I most loved about life, I’ll say you.",
                "Find someone worth your tears, worth your laughter, worth your heart and that loves you as much as you love them. ",
                "There’s nothing in life that makes me happier than loving you. You’re my sunshine in the morning and my starlight in the night.",
                "Every moment I spent with you.. is like beautiful dream come true.",
                "I’m the girl who will put her head on your shoulder, not because she’s sleepy, but because she wants to be closer to you.",
                "Happiness is falling asleep next to you and waking up thinking I’m still in my dreams.",
                "A real guy is not a guy who loves a million girls, he only loves one girl in a million ways.",
                "I don’t like waiting, I’m so impatient. But I’ll wait forever, as long as I end up with you.",
                "If a girl leans toward you, kiss her. If her hand is free, hold it. If she’s upset, hug her until she is okay.",
                "When; a girl is in-love, you can see it in her smile. When; a guy is in-love you can see it in his eyes",
                "He has the most adorable eyes you could ever fall for and the cutest smile that takes your breath away. He has the ability to make you laugh every time he speaks and whenever you look into his eyes its so hard to turn away.",
                "It feels so good to wake up with you in the morning.",
                "I wanna be the reason behind your smile because surely you are the reason behind mine.",
                "When you are with me, you make me perfect. I love you!",
                "For once in my life, I don’t have to try to be happy. When I’m with you, it just happens.",
                "No matter how far we go, our hearts will always stay closest to each other.",
                "I don’t want to be your favorite or your best. I want to be your only and forget the rest.",
                "Every girl needs a good guy who can help her laugh when she thinks she’ll never smile again.",
                "I want you to look at me like you’ve never looked at anyone else. I want you to look at me like I have something other girls don’t.",
                "The first thing I imagined when I saw the word ‘love’ is you.",
                "If I had a flower for every time I thought of you, I could walk in my garden forever.",
                "Hey, I cant live without you. I need you in my life. Everyday I want to see your eyes. Hold your hands n walk with you. Every night I want sleep on your chest. Wanna make love with you. Wanna be a good mother to your kids. Wanna be a good wife to you. I want your love forever.Then one day i will die on your lab.But my love will never die for you.I LOVE YOU...",
                "I Love my eyes when u look into them; I Love my name when u say it; I Love my heart when u Love it; I Love my life when you are in it. Happy Valentine’s Day!",
                "I’m enthralled by your beauty, mesmerized by your charisma and spellbound by your love. No wonder I am always thinking about you. I wish to celebrate every Valentine with you. Happy Valentine’s Day!",
                "Sweeter than chocolates, Sweeter than wind, Sweeter than just about everything, You are my Valentine, Happy I Love You Day!",
                "“Loving is not just looking at each other, it's looking in the same direction.” ? Antoine de Saint-Exupery",
                "“Many are the stars I see, but in my eye no starr like thee.” ? English saying used on poesy rings",
                "Because each little wish of mine You’ve tried to make come true (On Valentine’s Day), I want to say  How dearly I love you.",
                "Our love is like a lovely bridge Between your heart and mine A bridge we’ve built down through the years Just to our own design.",
                "The best and most beautiful things in the world can’t be seen or even touched – they must be felt with the heart. As my love for you...",
                "You are unique You are caring and You are the Best.",
                "And I am the luckiest to have you in my life! Happy Valentine’s Day my sweet heart!",
                "Thinking of you, Dreaming of You, Hugging you, Missing you, Wishing you, I Love You, Happy Valentine’s Day!",
                "Every time I see you I fall in love all over again",
                "I want a cute, long relationship where everyone is like damn they’re still together?",
                "I’m not perfect. I’ll annoy you, make fun of you, say stupid things, but you’ll never find someone who loves you as much as I do.",
                "We spend most of our time talking about nothing but I just want to let you know that all these nothings mean so much more to me than so many somethings.",
                "I’ve fallen in love many times… always with you.",
                "Before I met you, I never knew what it was like to look at someone and smile for no reason.",
                "You are the best thing that’s ever been. ",
                "When I tell you I love you, I don’t say it out of habit. I say to remind you that you’re the best thing that ever happened to me. ",
                "I want a hug from you. A hug where you wrap your arms around me so tight and assure me that everything will be okay. ",
                "The best relationship is when you two can act like lovers and best friends.",
                "I love you for who your from the inside. The lovely looking outside is just a bonus.",
                "Everyone says you only fall in love once, but that's not true. Every time I hear you voice I fall in Love all over again.",
                "A successful relationship requires falling in love many times, always with the same person.",
                "Happiness means you. I Love You <3",
                "I fall in love with you, I don't know why or how. I just did...",
                "Meeting you was fate, becoming your friend, was a choice, but falling in love with you was beyond my control.",
                "The first time I saw you, my heart whispered: That's the one.",
                "Let me love you if not for the rest of your life then for the rest of mine.",
                "Being someone's first love may be great but to be their last is beyond perfect.",
                "I smile like an idiot when I'm talking to you. Doesn't matter if it's a person or through text or anything else. I just smile because it's you.",
                "One day I caught myself smiling for no reason then I realized I was thinking of you.",
                "When I first saw you, I fell in love with you and you smiled because you knew.",
                "Any person can say that they love you. Only a few will actually prove it. ",
                "Being someone's first love may be great, but to be their last is beyond perfect." ,
                "Falling in love with you is the second best thing in the world. Finding you is the first." ,
                "Once in awhile, night in the middle of an ordinary life, love gives us a fairy tale. ",
                "I promise you no one will ever love you like I do. ",
                "Some love one, some love two. I love one - that is you." ,
                "A successful relationship requires falling in love many times, always with the same person. ",
                "The best kind of kiss is when you have to stop because you can't help but smile." ,
                "The happiest I've ever felt was that moment I discovered you loved me too." ,
                "Every love story is beautiful, but our is my favorite. ",
                "“Being deeply loved by someone gives you strength, while loving someone deeply gives you courage.” ? Lao Tzu",
        };
        ArrayAdapter<String> sagarlAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, vals);
        ListView vListView = (ListView) findViewById(R.id.vlv);
        vListView.setAdapter(sagarlAdapter);

        vListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
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
