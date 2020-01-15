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

public class Propose extends Activity {
    InterstitialAd mInterstitialAd;
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_propose);

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

        String[] proposes = {
                "Your eyes are like the blue ocean, your lips are like the sweetest part of nature. I want to be with you all the time. Happy Propose Day to My Love <3",
                "Love is like a cloud. Love is like a dream. Love is one word and everything in between. Love is a fairytale come true. Because I found Love when I found You. Happy Propose Day to My Love <3",
                "Come live in my heart and I'll not charge a penny from you. Happy Propose Day!",
                "You are like the Sunshine so Warm. You are like Sugar so Sweet. You are like you and that's the reason why I Love You Very Much <3",
                "All I wanted was someone to care for me, All I wanted was someone who there for me, All I ever wanted was someone who true, All I ever wanted was someone like you. Happy Propose Day!",
                "Excuse me, do you have a band Aid, because I scrapped my heart when I fell in love with you. Will you be mine? Happy Propose Day!",
                "You are the happiness of my life, you are the smile of my lips, I'm alive to see you anytime, your cute smile give me power please don't ever leave me. Happy Propose Day!",
                "I must have been born under a lucky star, to find a friend as nice as you are. I will follow the rainbow to the end, if you promise to remain my friend! Happy Propose Day!",
                "When I dream, I dream of you may be one day, dreams will come true. Happy Propose Day to My Love <3",
                "Love is passionate, love is blind, there is no better promise I can make, that I will be the best you can find. Happy Propose Day!",
                "If I know what love is, it is because of you. Happy Propose Day to My Love <3",
                "Good time or bad times, I'll always be there to cheer you up, or just to hold your hand and say, I know how you feel and I care for me. Happy Propose Day!",
                "My life's beautiful words I ever read. We promise according to our hopes and perform according to our fears. Happy Propose Day!",
                "Promise me that we are true friends. I am moon, you are my light. I am cloud, you are the Rain. I am track, you are the train. if I am moisture, you are the Baadal. I am Normal and you are the Pagal. Happy Propose Day!",
                "Friendship is a promise made in the heart. Silent. Unwritten. Unbreakable by distance. Unchangeable by time. It's lovely to have u as one! Happy Propose Day!",
                "With no big dreams in my eyes, I just want to say that I care, Let you feel the love of the world, And promise you to be right there! Happy Propose Day!",
                "You know why people say that you don't feel sleepy when you are in love? because for the first time you are finding reality more beautiful than dreams. Happy Propose Day!",
                "The say that Love is something that is universal, and is a feeling that is not bound by spatial boundaries, be it language or geography. Happy Propose Day!",
                "From the moment I heard first Love story,Then I started looking for you,Even I don't know how blind I was for you.But its also very true that, real lovers finally meet somewhere.Wish you a Happy Propose Day!",
                "When I dream, I dream of you may be one day, dreams will come true. Love You Very Much!",
                "Speaking without egos, loving without intentions, caring without expectations, I promise you that you will be mine always. Happy Propose Day!",
                "We have known each other, for a long time, but I never really noticed, all the magic in your eyes, I have been around you, a thousand times before, and you have always been a friend to me, but now I am wanting more think about it. Happy Propose Day!",
                "Somebody whom you loved more than life somebody whom you loved more than life, come in your life for either of the two reasons, for loving you forever or, for teaching you not to love again ever. Happy Propose Day!",
                "There will never be someone or something that can make me feel the way that you do, nothing and no one will ever make me love as much as I love you. It's impossible. Happy Propose Day!",
                "A friend loves you, makes you feel alright, troubles are not troubles when you talk, listen and accept you as you are, because you will feel the same and love the same. Happy Propose Day!",
                "If I found you alone, will propose you. If I found life 7 times will be with you if I reached for your hand, will you hold it. If I hold out my arms, will you hug me. If I go for your lips, will you kiss me. If I capture your heart, will you love me. Happy Propose Day!",
                "Love is a gift, If you receive it, open and appreciate it. If not, don't worry. Sum one Sum where is still wrapping it for you. Happy Propose Day!",
                "Each day I love you more, Today more than yesterday and less than tomorrow, Happy Propose Day!",
                "Love is passionate, love is blind, there is no better promise I can make, that I will be the best you can find. Happy Propose Day!",
                "Love is to see someone even with closed eyes, love is to find someone in every thought, love is to live for someone in every moment, please let that someone always be me. Happy Propose Day My Love...",
                "There will never be someone or something that can make me feel the way that you do, nothing and no one will ever make me love as much as I love you. It's impossible... Happy Propose Day!",
                "Love is not made by the time. It's made with person with whom the time is spent... Happy Propose Day!",
                "You are my answered prayer, my fulfilled wish, my realized dream. Will you marry me?",
                "My heart is your heart it doesn't beat when we're apart! Happy Propose Day!",
                "I don't fear to die, but my fear is that if I die who will love her as much as I do! Happy Propose Day!",
                "On this special day, best wishes go to you, that this wonderful love you, share lasts your lifetime through. Happy Propose Day!",
                "Forever is not today, not tomorrow or a century that will come, but a lifetime. and I promise to love you forever. Happy Propose Day!",
                "Good time or bad times, I'll always be there to cheer you up, or just to hold your hand and say I know How you feel and I care for me. Happy Propose Day!",
                "The most important things are the hardest to say, because words diminish them. Forever yours. Happy Propose Day!",
                "Friendship is a promise made in the heart, silent, unwritten, unbreakable by distance, unchangeable by time, it's lovely to have you as one... Happy Propose Day!",
                "If at any time life is like a candle in the wind, then I'll put my hands around you so that, all burns are mine and all light is yours. It's a promise my dear. Happy Propose Day!",
                "On this very auspicious day, I give to you all my trust wishes and promise that I will remain forever true, everything we do throughout our lives will be an everlasting testament to our devotion to each other. Happy Propose Day to My Love <3",
                "God didn't promise days without pain, laughter without sorrow, nor sunshine without rain, but he did promise strength for the day and light for the way... Happy Propose Day!",
                "Will you do me the honor of becoming my wife?",
                "I have one problem, can you tell me the solution? I am not getting proper way to propose you. I am not kidding. I am serious...",
                "Always take care of three things in life: 1) Trust 2) Promise 3) Relation. Because they don't make noise when they break! Happy Propose Day!",
                "Love is a promise, love is a souvenir, once given never forgotten, never let it disappear. Happy Propose Day!",
                "Who will cry when you die? Who will die when you cry? Simple question but if you have someone as the answer you are the luckiest person. Happy Propose Day!",
                "After I fell in love with you, I fell in love with my life. Be with me always <3",
                "No poems no fancy words I just want the world to know that I Love You my princess with all my heart <3",
                "No one in the world without love but there may be people without proposing that love. Happy Propose Day!",
                "Losers make promises, they often break, winners make commitments, they always keep... Happy Propose Day!",
                "I Love You! Will You Marry Me?",
                "No one in the world without love but there may be people without proposing that love. Happy Propose Day!",
                "Let’s show some love, let’s make a promise to stay, let’s just forget the world, kiss, hug and seal the special day! Happy Propose Day!",
                "When I dream, I dream of you may be one day, dreams will come true. Love You! Happy Propose Day!",
                "I Love You! the three magic words words that never fail to make an impact never have, since times immemorial. Happy Propose Day!",
                "My heart is your heart it doesn't beat when we're apart. Happy Propose Day!",
                "Boy: you are the second most beautiful girl I ever known. Girl: who is the first? Boy: it you, when you smile... Happy Propose Day!",
                "Love is not made by the time. It's made with person with whom the time is spent... Happy Propose Day!",
                "Good time or bad times, I'll always be there to cheer you up, or just to hold your hand and say I know How you feel and I care for me. Happy Propose Day!",
                "I don't know why I like you, I don't know why I feel sad on a day when I don't see you face I only know one thing that I don't bear any meaning without you... Happy Propose Day!",
                "Somebody whom you loved more than life somebody whom you loved more than life, come in your life for either of the two reasons, for loving you forever or, for teaching you not to love again ever... Happy Propose Day!",
                "No poems no fancy words I just want the world to know that I LOVE YOU my Princess with all my heart. Happy Propose Day!",
                "Your unique, your caring and your the best. And I am the luckiest to have you in my life! Happy Propose Day My Sweet Heart!",
                "love puts the fun in together, the sad in apart, and the joy in a heart. Happy Propose Day My Love.",
                "Love is missing someone whenever you're apart, but somehow feeling warm inside because you're close in heart. As we are, Happy Propose Day Sweet Heart.",
                "What greater thing is there for two human souls that to feel that they are joined.To strengthen each other,To be at one with each other in silent unspeakable memories,Let us make memories of a lifetime on this propose day!",
                "I Love You For Not What You Are But What I become when I am there with You. SO be with me forever. Happy Propose Day!",
                "Your eyes are soft and tender,As sweet as they can be,There is one thing you must remember,You are the one for me.Happy Propose Day!",
                "If roses were Black and violets were brown,My love for you would never be found,But roses r red and violets are blue,All I want to say is - I Love You!Happy Propose Day!",
                "I am opening an emotional bank account for you sweetheart. So deposit your love in it and you will get the interest. Be mine! Happy Propose Day!",
                "Grow old along with me, the best is yet to be. Will you spend the rest of your life with me? Happy Propose Day!",
                "I never saw so sweet a face as that I stood before. My heart has left it's dwelling place and can return no more. Be with me forever. Happy Propose Day!",
                "I have a heart and that is true, but now it has gone from me to you, so care for it just like I do, because I have no heart and you have two. Happy Propose Day!",
                "If I reached for your hand, will you hold it If I go for your lips, will you kiss me?If I hold out my arms, will you hug me?If I capture your heart, will you love me?",
                "The sweetest way to propose: Excuse me, do you have a band aid, because I scrapped my knee when I fell in love with you. Happy Propose Day!",
                "Did you know they changed the alphabet? They put you and I together. Happy Propose Day!",
                "I have spent many sleepless nights,In your love and I don’t want,My son to do same for your daughter,So lets make them brother and sister...",
                "Boy: Would you mind sharing your address with me.Girl: Why? Boy: Because that is where I would take my marriage vows one day!",
                "Are you free for the rest of your life?",
                "(”)….(”) ( ‘ o ‘ ) (”)–(”) (””’)-(””’)I Love You...Happy Propose Day!",
                "I can’t imagine a life without you in it, I want to grow old with you, let’s spend the rest of our lives together. Happy Propose Day!",
                "I'm opening an emotional bank account,For you sweetheart,So deposit your love in itAnd you will get the interest.Be my valentine!Happy Propose Day!",
                "I wish I was one of your tears,So I could be born in your eye,Run down your cheek,And die on your lips!",
                "I love you for not what you are but what I become when I am there with you. So be with me forever... Happy Propose Day!",
                "High when I see you I know the reason why so let me hold your hand and make you mine for that would intoxicate me like sweet wine.. Happy Propose Day!",
                " I can’t imagine a life without you in it,I want to grow old with you,Let’s spend the rest of our lives together.",
                "I promise to hold your hand regardless of what happens till death do us part will you marry me?",
                "Life tallies every one of the streets we travel. Some are smooth, some are harsh. Total I would rather overlook. Be that as it may, there is one street I wont lament the street where we met and got to be companions. Happy Propose Day",
                "Today 8th February is the second day of Valentine week, which just started two days back. Love has started floating in the atmosphere and igniting everybody’s heart for their true love. Happy Propose Day!",
                "Love is to express and not to impress people. Happy Propose Day!",
                "I always lose control when you by my side, you have become the light of my life. I always enjoy the time I spend with you, I think I’m falling in love with you...",
                "I never saw so sweet a face as that I stood before. My heart has left its dwelling place and can return no more. Be with me forever. Happy Propose Day!'",
                "On this special day I want to  say: Grow old along with me, The best is yet to be. Will you spend the rest of your life with me?",
                "You are the happiness of my life, you are the smile of my lips, I am alive to see you anytime, your cute smile give me power please don’t ever leave me. Happy Propose Day!",
                "I propose all my friends for lifetime friendship with full dedication no demands no complaints what do you say. Happy Propose Day!",
                "My eyes are eager to see you, my ears are eager to listen you, my lips are eager to kiss you and my dreams in night are eager to welcome you! Happy Propose Day!",
                "Grow old along with me, the best is yet to be. Will you spend the best of your life with me?",
                "Set a place for me in your heart and not in your mind for the mind easily forgets but the heart always remembers. I Love You. Happy Propose Day!",
                "Affection assembles the enjoyment in, the tragic in separated, and the delight in a heart. Cheerful Propose Day my affection!",
        };
        ArrayAdapter<String> sagarlAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, proposes);
        ListView pListView = (ListView) findViewById(R.id.plv);
        pListView.setAdapter(sagarlAdapter);

        pListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
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
