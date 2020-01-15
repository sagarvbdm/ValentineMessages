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

public class Promise extends Activity {
    InterstitialAd mInterstitialAd;
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promise);

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

        String[] promises = {
                "Some things you don't have to promise. You just do!",
                "God of my life, I welcome this new day. It is Your gift to me, a new creation, a promise of resurrection.",
                "If you are cold at night, let the promise of my love cover you like a warm blanket.",
                "If one day you feel like crying, call me. I can't promise to make you laugh, but I'll be cry with you. Happy Promise Day!",
                "I promise one day you will regret losing me you'll look back and say, 'Dammn... that guy really did love me. Happy Promise Day!",
                "I want to be with you until the sun falls from the sky. Happy Promise Day!",
                "Promise is a big word. It either makes something or breaks everything!",
                "Difference Between PROMISES And MEMORIES PROMISE: We Break Them MEMORIES: They Break Us!",
                "But I have promises to keep, and miles to go before I sleep, and miles to go before I sleep...",
                "Never promise to make pie and fail to deliver on that promise...",
                "I can’t promise to solve all your problems, I can promise, that I will never let you face them alone. Happy Promise Day Love <3",
                "Oaths are but words,and words but wind.",
                "Never promise to make pie and fail to deliver on that promise.",
                "I promise to still find you attractive when you're bloated from the Valentine's Day meal and candy I buy you.",
                "A promise created gives hope, a promise kept is commitment.",
                "It is much better to promise nothing and try and give everything... than promise everything and give nothing at all.",
                "Promises are like crying babies in a theater, they should be carried out at once.",
                "Love is a promise delivered already broken.",
                "True faith is never found alone;it is always accompanied by expectation.The man who believes the promises of God expects to see them fulfilled. Where there is no expectation, there is no faith...",
                "If you really someone, you will never make any promise because you know how it feels when someone broke a promise.",
                "I promise that, one day, everything's going to be better for you...",
                "Change? start by keeping a small promise.",
                "God of my life, I welcome this new day. It is Your gift to me, a new creation, a promise of resurrection.",
                "A promise made is just like a unpaid debit. You'll have to pay for it. Either complete it OR loose your trust.",
                "I want someone who promise me nothing but tries to give everything for me. Happy Promise Day...",
                "Friendship is a language spoken by heart, not written on paper, it is a promise on this promise day, to renewed every time we keep in touch. Happy Promise Day!",
                "Friendship is a promise spoken by the heart It not written in Book!",
                "You can't expect for me to let it go that easily. One day we're making plans the next day girl you're leaving me...",
                "Promises were a lot like impressions. The second one didn't count for much.",
                "If you want to keep your promise at any cost then the only way to do so is Never give a promise to someone.",
                "If you really someone, you will never make any promise because you know how it feels when someone broke a promise.",
                "Promise to you You have filled my world with life. Happy Promise Day!",
                "No cause of action arises from a bare promise.",
                "Everyone is a millionaire where promises are concerned.",
                "I promise to walk 1000 miles with you. Just promise you will walk back with me.",
                "If you are cold at night, let the promise of my love cover you like a warm blanket.",
                "Never promise to make pie and fail to deliver on that promise.",
                "Promise more than what you can deliver and deliver more than you can promise.",
                "Promises are like crying babies in a theater,they should be carried out at once.",
                "If you want to keep your promise at any cost then the only way to do so is Never give a promise to someone.",
                "Some people don't understand the promises they're making when they make them.",
                "I never promised you a rose garden.I never promised you perfect justice.",
                "Speaking without egos, Loving without intentions, Caring without expectations, I promise you that you will be mine always. Happy Promise Day!",
                "I must have been born under a lucky star, To find a friend as nice as you are. I will follow the rainbow to the end, If you promise to remain my friend!",
                "Friendship is a promise spoken by the heart is not given by plege, nor written. Happy Promise Day!",
                "Do today what you want to, what you like to but promise for a better you tomorrow.",
                "Promise day is special promise to person, means make promise controller or promise driver of promise life because all relationship depends on promise transaction.",
                "Promise to you You have filled my world with life. Happy Promise Day!",
                "We met it was Luck! We talked it was CHANCE! We became friends it was DESTINY! We are still friends it is FAITH! We will always be friends its a PROMISE! On this Promise Day!",
                "Speaking without Egos, Loving without Intentions, Caring without Expectations, I promise you that you will be mine always. Happy Promise Day!",
                "Love is the happiness of today, And promise of tomorrow, So this warm note comes to you, To say that live life with a heart full of love. Happy Promise Day!",
                "Friendship is a language spoken by heart, Not written on paper, Not given by pledge, It is a promise on this promise day, To renewed every time we keep in touch.",
                "Friends are a promise made in the heart, Silent - Unwritten - Unbreakable By Distance! Unchangeable by Time. It’s lovely yo have you as one! Happy Promise Day!",
                "One must have a good memory to be able to keep the promises that one makes.",
                "I promise to still find you attractive when you're bloated from the valentine's day meal and candy I buy you...",
                "God of my life, I welcome this new day. It is your gift to me, a new creation, a promise of resurrection.",
                "I promise to be an excellent husband, but give me a wife who, like the moon,will not appear every day in my sky.",
                "If at any time life is like a candle in the wind, Then I’ll put my hands around you so that all burns are mine and all light is yours. It’s a promise!",
                "I promise one day you'll regret losing me you'll look back and say, 'Dammn...dat guy really did love me.",
                "This Friendship Day, I promise to focus mostly on your good qualities when talking behind your back.",
                "If you are good you will keep your oath (words/promise) and will live in worst situation but if you are best you will break you oath to live a fine life.",
                "At fifteen, beauty and talent do not exist; there can only be promise of the coming woman.",
                "Speaking without egos, loving without intentions, caring without expectations, I promise you that you will be mine always...",
                "Don’t promise me the moon or the stars. Just promise me. You’ll stay under them with me...",
                "I want to be the greatest of me, For this is all I can do. It is my wish that you promise me this, You be the greatest of you. Happy Promise Day!",
                "I want someone who promise me nothing but tries to give me everything.",
                "I swear to you on everything I'm and I dedicate to you all that I have and I promise u that I'll stand right by your side forever and always until that day I die.",
                "If one day you feel like crying, call me. I can't promise to make you laugh, but I'll be cry with you.",
                "I won't promise to be your friend forever because I won't live that long. But let me be your friend as long as I live.",
                "True faith is never found alone; it is always accompanied by expectation. The man who believes the promises of God expects to see them fulfilled. Where there is no expectation, there is no faith.",
                "I promise, Speaking without egos, Loving without intentions, Caring without expectations, I promise you that you will be mine always.",
                "I promise you, No matter, What happens, I will be there, With you always.",
                "Love is a promise that can last forever.",
                "Promise me you'll always remember. You're braver than you believe and stronger than you seem, and smarter than you think.",
                "Love is a promise love is souvenir, Once given never forgotten, Never let is disappear.",
                "Promise day! If you are cold at night. Let the promise of my love cover you like a warm blanket.",
                "Love comes with a lots of responsibilities, commitments and promises. Make some new promises and try to fulfill old ones to concrete your relationship. Promise little and do much.",
                "I can not promise to solve all your problems,I can only promise that I will never let you face them alone.",
                "I want to be the greatest of me, For this is all I can do. It is my wish that you promise me this, You be the greatest of you.",
                "We met it was luck, We talked it was chance, We became friends it was destiny, We are still friends it is faith, We'll always be friends its a promise...",
                "Loving without intentions, Caring without expectations, I promise you that you will be mine always. Happy Promise Day!",
                "I must have been born under a lucky star, to find a friend as nice as you are. I will follow the rainbow to the end, if you promise to remain my friend!",
                "I must have been born under a lucky star, To find a friend as sweet as you are. I will follow the rainbow to the end, On a condition that you’ll remain my friend forever! I want to be the greatest of me, for this is all I can do. It is my wish that you promise me this, you be the greatest of You...",
                "Love is the happiness of today, and promise of tomorrow, so this warm note comes to you, to say that live life with a heart full of love. Happy Promise Day!",
                "I must have been born under a lucky star, to find a friend as nice as you are. I will follow the rainbow to the end, if you promise to remain my friend! Happy Promise Day!",
                "I promise to hold your hand regardless of what happens till death do us part will you marry me?",
                "Let’s show some love, let’s make a promise to stay, let’s just forget the world, kiss, hug and seal the special day! Happy Promise Day!",
                "Love is a promise, love is a souvenir, once given never forgotten, never let it disappear. Happy Promise Day!",
                "Always take care of three things in life: 1) Trust 2) Promise 3) Relation. Because they don't make noise when they break! Happy Promise Day!",
                "God didn't promise days without pain, laughter without sorrow, nor sunshine without rain, but he did promise strength for the day and light for the way. Happy Promise Day!",
                "On this very auspicious day, I give to you all my trust wishes and promise that I will remain forever true, everything we do throughout our lives will be an everlasting testament to our devotion to each other. Happy Promise Day to My Love <3",
                "If at any time life is like a candle in the wind, then I'll put my hands around you so that, all burns are mine and all light is yours. It's a promise my dear. Happy Promise Day!",
                "Friendship is a promise made in the heart, silent, unwritten, unbreakable by distance, unchangeable by time, it's lovely to have you as one. Happy Promise Day!",
                "Forever is not today, not tomorrow or a century that will come, but a lifetime. and I promise to love you forever. Happy Promise Day!",
                "Love is passionate, love is blind, there is no better promise I can make, that I will be the best you can find. Happy Promise Day!",
                "Speaking without egos, loving without intentions, caring without expectations, I promise you that you will be mine always. Happy Promise Day!",
                "With no big dreams in my eyes, I just want to say that I care, Let you feel the love of the world, And promise you to be right there! Happy Promise Day!",
                "Friendship is a promise made in the heart. Silent. Unwritten. Unbreakable by distance. Unchangeable by time. It's lovely to have you as one! Happy Promise Day!",
                "Promise me that we are true friends. I am moon, you are my light. I am cloud, you are the Rain. I am track, you are the train. if I am moisture, you are the Baadal. I am Normal and you are the Pagal. Happy Promise Day!",
                "Love is passionate, love is blind, there is no better promise I can make, that I will be the best you can find. Happy Promise Day!",
        };
        ArrayAdapter<String> sagarlAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, promises);
        ListView ppListView = (ListView) findViewById(R.id.pplv);
        ppListView.setAdapter(sagarlAdapter);

        ppListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
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
