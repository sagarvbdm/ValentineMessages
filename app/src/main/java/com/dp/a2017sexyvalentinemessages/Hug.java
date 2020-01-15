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

public class Hug extends Activity {
    InterstitialAd mInterstitialAd;
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hug);

        MobileAds.initialize(this, "ca-app-pub-7341848752460960/3541401539");
        mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();
        mAdView.loadAd(adRequest);

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-7341848752460960/9448334338");

        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                requestNewInterstitial();
            }
        });

        requestNewInterstitial();

        String[] hugs = {
                "Do you know? There is one gift which can't be given without taking it back That is why I give you hug which can't be giving without taking it back. Happy Hug Day!",
                "Let me live and die in your arms. Just like this, let me continue to Love you. Let me live and die in your arms.Happy Hug Day!",
                "No matter where you are I’ll always find my way to ? Hug you tight and shower you with my kisses. I love only for you.Happy Hug Day!",
                "Never wait until tomorrow to hug someone you could hug today, Because when you give one, you get one right back your way. Happy Hug Day!",
                "Sometimes a hug is all you need. Happy Hug Day!",
                "I’m sending you this hug IT’S FREE! A special hug for you FROM ME!Happy Hug Day!",
                "A hug is not hug till it is warm and little tight Give and take a hug, it's your birth right. It conveys the affection which you hold inside So let's hug before it's banned outright!Happy Hug Day!",
                "Hug me when I'm there, miss me when I'm not, kiss me every day, and love me for all eternity. Happy Hug day !",
                "Love is a circular emotion that surrounds you, like a hug. Or a noose. Happy Hug Day!",
                "Let us embrace each other like we have the arms of two chairs. Let us dance like our legs are those of a table. We should do dinner sometime.Happy Hug Day!",
                "I didn’t tackle him. I gave him a flying hug. Sometimes love is up in the air until it hits you. Happy Hug Day!",
                "I just invented a hug machine. It’s solar powered so you can use it when you feel depressed, like on a cloudy day. Shit.Happy Hug Day!",
                "A windmill has arms, but does not hug. Where’s the love? Happy Hug Day!",
                "I love firm hugs. Statues are so affectionate. Well, at least compared to my ex wife.Happy Hug Day!",
                "My mom smiled at me. Her smile kind of hugged me. Happy Hug Day!",
                "Professional wrestling is a lot like cuddling, I thought as I hugged a tree. As far as lumberjacks go, I’m slow, but when the tree finally falls for me, it falls hard.Happy Hug Day!",
                "I have two hands, so when I’m networking and I meet two new people, is it OK to shake both their hands at once? Or would it be more appropriate to organize a group hug? Happy Hug Day!",
                "I want to sprint into her open arms, but I run as fast as two shoes tied together and thrown over a telephone wire. I’m like Roger Bannister, now that he’s in a wheelchair.Happy Hug Day!",
                "Granddaddy Cove, it’s where all the lost hugs are. I know where the treasure is buried, and I’ll take you there for a small finder’s fee. Happy Hug Day!",
                "Squeeze out the competition—with hugs. I’m giving out FREE hugs while samples last. After that I’ll have to charge an arm and a leg—or maybe just two arms. Happy Hug Day!",
                "Love is a peaceful feeling, like a flower hugging a butterfly. Happy Hug day !",
                "Plunders is the palate I gift to you, openly I hug the universe of our friendship expanding its outer limit. Happy Hug Day!",
                "And if you see me, smile and maybe give me a hug. That's important to me too. Happy Hug Day!",
                "Once the bear's hug has got you, it is apt to be for keeps. Happy Hug Day!",
                "I love hugging people. I still hug everybody in my meet-and-greet lines. Happy Hug Day!",
                "I like pencil skirts because they hug me in all the right places. Happy Hug Day!",
                "You know, food is such - it's a hug for people. Happy Hug Day!",
                "If you hug to yourself any resentment against anybody else, you destroy the bridge by which God would come to you.Happy Hug Day!",
                "My kids don't watch my movies. What I want to do is go home and hug my kids, talk to them and engage with them. Happy Hug Day!",
                "I had embraced you long before i hugged you. Happy Hug Day!",
                "We all have to have something to hold on to, even if it’s our own torso. Happy Hug Day!",
                "A hug a day keeps the bad boys away. Happy Hug Day!",
                "Hug while you can. Happy Hug Day!",
                "You've got some power, Jakkin said. One hug—and the lights go out!Happy Hug Day!",
                "Give yourself a hug, and while you are embracing yourself, use that time to hold yourself together.Happy Hug Day!",
                "I want to stay curled and cosied and chocolated forever in my mother’s arms. Happy Hug Day!",
                "I will admit, I once launched myself at Julie Garwood for a hug, hoping some of her magic would rub off on me... and I have fangirl crushes on Susan Elizabeth Phillips, Linda Howard, and Kresley Cole, among many others.Happy Hug Day!",
                "With age, you get to a place where you don't want to knock people out. You just want to give people a hug. Happy Hug Day!",
                "I have learned that there is more power in a good strong hug than in a thousand meaningful words. Happy Hug Day!",
                " A hug is like a boomerang - you get it back right away. Happy Hug Day!",
                "To be honest, I think I'd become a bit selfish with memories of my father. I wanted to hug them close to me. Happy Hug Day!",
                "Laughing together is as close as you can get to a hug without touching. Happy Hug Day!",
                "Children are not unforgiving. You can punish them and they will hug you in a few minutes. Happy Hug Day!",
                "Where I live if someone gives you a hug it's from the heart. Happy Hug Day!",
                "Hug the shore; let others try the deep. Happy Hug Day!",
                "I have a kind heart, I’m in love. It gets deeper with every kiss and every hug. Happy Hug Day!",
                "If I see my fans crying, I just want to give them a hug and tell them I love them. Happy Hug Day!",
                "To be honest, I think I'd become a bit selfish with memories of my father. I wanted to hug them close to me. Happy Hug Day!",
                "When I come home, my daughter will run to the door and give me a big hug, and everything that's happened that day just melts away. Happy Hug Day!",
                "We smile but I want more. I want her to hug me. Happy Hug Day!",
                "Humans are very strange. When you need a hug, they throw you away, when you need condolence , they insult you, and when you need love, they betray you.Happy Hug Day!",
                "Relax. Refresh. Renew. Play. Sing. Laugh. Enjoy. Forgive. Dance. Love. Hug. Share. Kiss. Create. Explore. Hope. Listen. Dare. Trust. Dream. Learn. TODAY! Happy Hug Day!",
                "It breaks my heart that I don't see my daughters every day, don't get to hug them and brush their hair. Happy Hug Day!",
                "I got the famous Oprah hug! Happy Hug Day!",
                "One word can end a fight; One hug can start a friendship; One smile can bring Unity; One person can change your entire life!Happy Hug Day!",
                "I know virtually no one of my age who can remember a hug, or a smile from their father, or a 'Let's go play football. Happy Hug Day!",
                "I don't ever wanna come across too intimidating, so as long as I look like you can come up and give me a hug, that's good. Happy Hug Day!",
                "Hug is the loving gift that costs no money and can be distributed for free to make the love grow. Happy Hug Day!",
                "The good part of having six kids is, there's always one who wants to hug you and say, Daddy, I love you. Happy Hug Day!",
                "Cute is when a person's personality shines through their looks. Like in the way they walk, every time you see them you just want to run up and hug them.Happy Hug Day!",
                "Hug me. Hug me. Hug me. Happy Hug Day!",
                "I'm very Southern in the way I walk in the world. I love to laugh. I love to eat. I love to hug people. But if somebody makes me mad, my neck may roll. I can be aggressive with a Southern twang.Happy Hug Day!",
                "Love more, hurt less. Laugh more, cry less. Live more, worry less. Give more, take less. Hug more, fight less. And most important.. Remember that we are all one! We are love! I LOVE YOU ALL! Happy Hug Day!",
                "Laughing together is as close as you can get to a hug without touching. Happy Hug Day!",
                "A hug is like a boomerang - you get it back right away. Happy Hug Day!",
                "My only self-confidence and satisfaction comes from the people that I do meet; I have fondness for people. I mean, I like to hug. And I also like to be hugged.Happy Hug Day!",
                "The decisions that Ellen made on her show were between her and her producers. I supported her decisions. I was there to hug her when she got home. Happy Hug Day!",
                "Again, I find it difficult to be taken care of and rarely acknowledge it, and every act he does registers, but I also just need to verbally acknowledge him and hug him.Happy Hug Day!",
                "Seattle is a place I've lived only a couple of years, but I feel like I've been adopted by this city. It's like a hug. I've been recognized on planes, in the airport and by cabdrivers. I don't get that anywhere else in the country.Happy Hug Day!",
                "Hollywood has given me a great, warm hug. Happy Hug Day!",
                "People I've never spoken to before come up to me and give me a hug. Happy Hug Day!",
                "I have yet to meet a person whose favorite movie is 'Gigi', but I hope to meet them one day and give them a hug. Happy Hug Day!",
                "My dad doesn't hug me enough! Happy Hug Day!",
                "I'm a huge dog person; I love to hug and kiss them. Happy Hug Day!",
                "If beautiful movies can influence you to go out and hug your children, then we have to be honest and say that other movies can inspire you to do bad things.Happy Hug Day!",
                "Love is like encountering a forest and having to chop down every tree but one. Oh, and you have to chop down each tree by hugging it until it falls. Happy Hug Day!",
                "I laugh with them because it is one of the worst things to be in a room full of people and not laughting when everybody else is. Happy Hug Day!",
                "Be the first to hug and you will be the most to be the hugged. Happy Hug Day!",
                "I never realized the warmth of his hug, until he was not around when I need it. 'Oh Dad! I miss you. Happy Hug Day!",
                "My boss said she had to let me go. I was sad, but it was OK, because we’d been hugging for over an hour. Happy Hug Day!",
                "I couldn't remember anyone hugging me like that before. Happy Hug Day!",
                "Hold my hands; kiss my forehead, hug me and look in my eyes; maybe today is the last day you can do this.Happy Hug Day!",
                "Love is not complicated—just smile, hug, kiss, be kind, and repeat. Happy Hug Day!",
                "The police called it choking, but I called it a two-handed neck hug. That’s how I knew she really loved me. Happy Hug Day!",
                "May we embrace one another with love, a smile and a warm hug? Happy Hug Day!",
                "I hug employees all the time. I'm a huge contact person. Touch is an extremely important part of the human condition.Happy Hug Day!",
                "To keep the meeting professional, I called him Hughie Bear. Then I opted for a hug, rather than a formal introductory handshake. Happy Hug Day!",
                "A hug makes you feel good all day. Happy Hug Day!",
                "I wish I could just hug you all, but I'm not gonna. Happy Hug Day!",
                "Did you know that, if you visualize, you can actually hug on the phone? Happy Hug Day! ",
                "She gave her a long embrace, like pie baking in the warmth of an oven. Happy Hug Day!",
                "My beautiful son I can't wait to see his face, hug him, and spend time with him. Happy Hug Day!",
                "A hug it’s been holding me back from achieving my goals. Happy Hug Day!",
                "Hug your customers but also offer handshake to your competitors. Happy Hug Day!",
                "I wanted my home to be a haven, like coming in from the cold to a big warm hug. Happy Hug Day!",
                "For as long as it takes for the sorrow and pain to transfer into acceptance. I’ll stay here. With you. By your side. I won’t leave. Promise? Vow. I placed his hands gently on the piano. I vow.Happy Hug Day!",
                "Take time to laugh, to talk, to hug, and to cry. These are the human relief valves. Happy Hug Day!",
                "Never underestimate the power of the words 'I love you' or the comfort of a simple hug. Grow your love daily. Happy Hug Day!",
                "Sometimes all you can do is hug a friend tightly and wish that their pain could be transferred by touch to your own emotional hard drive. Happy Hug Day!",
        };
        ArrayAdapter<String> sagarlAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, hugs);
        ListView hListView = (ListView) findViewById(R.id.hlv);
        hListView.setAdapter(sagarlAdapter);

        hListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
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
