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

public class Rose extends Activity {
    InterstitialAd mInterstitialAd;
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rose);

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

        String[] roses = {
                "A single rose can be my garden... a single friend, my world. Happy Rose Day!",
                "The most magical moments are those when you forget yourself in the joy of someone’s presence Happy Rose Day!",
                "Red Rose for my true love I can’t live without you I love you very much and your my life. Happy Rose Day!",
                "When I miss you I re-read our old conversations and smile like an idiot. Happy Rose Day!",
                "I heard someone whisper your name but when I turned around to see who it was, I was alone then I realized that it was my heart telling me that I miss you darling. Happy Rose Day!",
                "During the day I keep myself busy and sometimes time passes. But at night, I really miss you. Happy Rose Day!",
                "I miss your cuddles, I miss your kisses but most of all I miss you! the love I have will never change as each day goes by I will love you till the day I die. Happy Rose Day!",
                "The Rose Speaks of Love Silently, in a language known only to the Heart. Happy Rose Day!",
                "Send a red rose which defines our beautiful relation. Happy Rose Day!",
                "Every love story is beautiful, but ours is my favorite. Happy Rose Day!",
                "Yes, I'm selfish because I will never share you with anyone else. Happy Rose Day!",
                "When I first saw you, I fell in love with you and you smiled because you knew. Happy Rose Day! ",
                "You have no idea how fast my heart beats when I see you. Happy Rose Day!",
                "Every morning would be perfect if I woke up next to you. Happy Rose Day!",
                "Someone asked me, how’s life? I just smiled & replied, she’s fine.Happy Rose Day!",
                "What's in a name? That which we call a rose by any other name would smell as sweet. Happy Rose Day!",
                "Love planted a rose, and the world turned sweet. Happy Rose Day!",
                "The rose and the thorn, and sorrow and gladness are linked together. Happy Rose Day!",
                "That which God said to the rose, and caused it to laugh in full-blown beauty, He said to my heart, and made it a hundred times more beautiful. Happy Rose Day!",
                "Since love first made the breast an instrument Of fierce lamenting, by its flame my heart Was molten to a mirror, like a rose I pluck my breast apart, that I may hang This mirror in your sight.Happy Rose Day!",
                "I want to be remembered like Pete Rose. 'Charlie Hustle.' I want people to say, 'Wherever he was, he was always giving it his all. Happy Rose Day!",
                "Rose is a rose is a rose is a rose. Happy Rose Day!",
                "Our eyes reflect light. Better that the lips are more like a rose petal. Happy Rose Day!",
                "I once had a rose named after me and I was very flattered. But I was not pleased to read the description in the catalogue: no good in a bed, but fine up against a wall. Happy Rose Day!",
                "Over the years, I had nurtured the hope to be able to fly; to handle a machine as it rose higher and higher in the stratosphere was my dearest dream. Happy Rose Day!",
                "In me the tiger sniffs the rose. Happy Rose Day!",
                "We have chased away the clouds, the sky is all 'rose.' Happy Rose Day!",
                "You look at a Pete Rose to be the terrific athlete he is and then he falls on hard times, but when he played the game, I got something from the way he played the game because he hustled every play, and just because he had one mistake in his life, am I supposed to throw back everything that I gained from him?Happy Rose Day!",
                "Only in art will the lion lie down with the lamb, and the rose grow without thorn. Happy Rose Day!",
                "Groups that rose from poverty to prosperity seldom did so by having their own racial or ethnic leaders to follow. Happy Rose Day!",
                "Do you think that revolutions are made with rose water? Happy Rose Day!",
                "All June I bound the rose in sheaves, Now, rose by rose, I strip the leaves. Happy Rose Day!",
                "My rose is red,Your eyes are blue,You love me,And I love u.Happy valentine’s day in advance. Happy Rose Day!",
                "When I First Felt Love For You,I Knew It Would Be Special And Forever.This Rose Day I Wish To Honour YouWith My Love As I Always DoBecause You Are Mine. Happy Rose Day!",
                "Believe me, you are the one, Whom my heart finds, Whom my mind reminds me of, Whom my destiny wants, Whom i love the most. Happy Rose Day.!",
                "Bunch of rose I am sending youYellow to show our happinessWhite to show our purityBlack to show our darkest secretsAnd red to show our love. Happy Rose Day.!",
                "Everything About You Is Interesting,Your Smile, Your Laughter, Your Beauty,Your Scent And Your Company.I Always Think Of You With A Smile On My Face.I Love You My Precious Rose. Happy Rose Day.!",
                "Sweeter than the candieslovelier than the red rosesmore hug-gable than soft toysthat’s what you’re here’s wishing you a Rose Day that’s as special as you’re. Happy Rose Day.!",
                "Whenever the occasion a rose, he rose to the occasion. Happy Rose Day.!",
                "One rose says more than the dozen. Happy Rose Day.!",
                "Love and a red rose can’t be hid. Happy Rose Day.!",
                "The Rose is without an explanation; She blooms, because She blooms. Happy Rose Day.!",
                "We have chased away the clouds, the sky is all rose. Happy Rose Day.!",
                "The fragrance always stays in the hand that gives the rose. Happy Rose Day.!",
                "If you enjoy the fragrance of a rose, you must accept the thorns which it bears. Happy Rose Day.!",
                "Can anyone remember love? It’s like trying to summon up the smell of roses in a cellar. You might see a rose, but never the perfume. Happy Rose Day.!",
                "Publishing a volume of verse is like dropping a rose petal down the Grand Canyon and waiting for the echo. Happy Rose Day.!",
                "Love thou the rose, yet leave it on its stem. Happy Rose Day.!",
                "A rose must remain with the sun and the rain or its lovely promise won’t come true. Happy Rose Day.!",
                "Not every bird can dance but peacock do it, Not every friend can patch my heart but you do it, Not every flower can express love but Roses do it. Happy Rose Day!",
                "Actual meaning of giving rose to someone:- R= Rare O=One S=Supporting E=Entire Life. Happy Rose Day!",
                "Morning is Lucky, because Sun is the, Sky is Lucky, because it has Star, Rose is Lucky, because she is Beautiful, I am Lucky, because you are my Friend. Happy Rose Day!",
                "When i ask God for a rose, & he gave me flowers. I ask God for an angel, & he gave me the best love ever! Happy Rose Day!",
                "I looked at a sweet, beautiful rose, and then I looked at you and I kept looking at you, for the rose isn't as beautiful as you.Happy Rose Day!",
                "Hope you found this a special rose! with love and care for the one you chose. Happy Rose day!",
                "The Rose Speaks of Love Silently, in a language known only to the Heart. Happy Rose Day!",
                "Be soft as flower Be strong as rock Be nice as me I know its difficult But just keep trying Be fresh as Rose. Happy Rose Day!",
                "The Rose Speaks of Love Silently,in a language known only to the Heart Happy Rose Day Sweetheart!",
                "A Single Rose for u for being in my life,Thank you so much to complete my Life.Happy Rose Day. Happy Rose Day!",
                "R is for Red, Red is for Blood, Blood is for Heart, Heart is for Love, Love is for You, You’re for Me Forever. Happy Rose Day Dear!",
                "A relationship is like a rose, How long it lasts no one knows Love can erase awful past Love can be yours, you’ll see at last, To feel that love, it makes you sigh To have it leave, you would rather die, You hope that you have found that special rose Cause you love and care for the special rose. Happy Rose Day Dear!",
                "24 hours makes a lovely day, 7 days makes a lovable weeks, 52 weeks make a lovely year and Knowing a person like you makes a lovely life. Happy Rose Day 2017",
                "One of the Best Moments in life is When you See Our Yellow Rose Turning Red Rose, hard to understand? So Read Again,your Friendship Turns into your Love. Happy Rose Day!",
                "In the Flower, My Rose is you, In the Diamond, My Kohinoor is you, In the Sky, My Moon is you, I m only Body, My Heart is you. That's why i always Miss You. Happy Rose Day!",
                "This rose day I wish that all the thorns on the path of your life be vanquished and your life path be filled with petals of love, friendship and blessings. Happy Rose Day!",
                "My eyes are blind without your eyes to see, similar to a rose without color. Love you forever. Happy Rose Day.!",
                "A rose is the visible result of an infinitude of complicated goings on in the bosom of the earth and in the air above, and similarly a work of art is the product of strange activities in the human mind. Happy Rose Day.!",
                "Give a red rose bouquet with a nice greeting card on it. On that you can write your feelings and can send it to love' s place or can give them directly. As it suits. That would be nice idea for rose day gift. Happy Rose Day.!",
                "You can give them rose with pictures on a cup of you both. Get it done by a expert and gift them to your loved one. They will feel so good. Happy Rose Day.!",
                "Some people grumble that roses have thorns; I am grateful that thorns have roses. Happy Rose Day.!",
                "Roses may say I love you, but the cactus says fuck off. Happy Rose Day.!",
                "Roses are exclusively for a nice person like you From a simple person like me keep this rose untill they DRY but keep my freindship until i die Happy Rose Day.!",
                "Love can be expressed in many ways. One way I know is to send it across the distance to the person who is reading this. Happy Rose Day!",
                "Every bird cannot dance But peacock do it Every friend can not reach my heart but you did it. Every Flower can not express love But rose do it. Happy Rose Day!",
                "The red rose whispers of passion and the white rose breathes of love. Happy Rose Day!",
                "This rose day I wish that all the thorns on the path of your life be vanquished and your life path be filled with petals of love, friendship and blessings. Happy Rose Day!",
                "Some people grumble that roses have thorns; I am grateful that thorns have roses. Happy Rose Day!",
                "Love flows like flowers, and grows like water. I’m so thirsty for romance I could drink a dozen roses. Happy Rose Day!",
                "I feel as if I had opened a book and found roses of yesterday sweet and fragrant, between its leaves. Happy Rose Day!",
                "What can I say about love that’s never been said by me or anyone else? Well, sometimes love smells like my farts, after I eat a dozen roses. Happy Rose Day!",
                "Love is like the wild rose-briar, Friendship like the holly-tree. The holly is dark when the rose-briar blooms, but which will bloom most constantly? Happy Rose Day!",
                "Rose, oh pure contradiction, joy of being No-one's sleep under so many lids. Happy Rose Day!",
                "Women show men beauty in things beyond their ambitions. Women tell men to stop and smell the roses. Happy Rose Day!",
                "There were crimson roses on the bench; they looked like splashes of blood. Happy Rose Day!",
                "She did not need anyone else's love when she had roses. Happy Rose Day!" ,
                "Roses, she thought sardonically, All trash, my dear. Happy Rose Day!",
                "The point is to turn your grief into love. The roses are helping you find grace. Happy Rose Day!",
                "Every summer, like the roses, childhood returns. Happy Rose Day!",
                "Real life isn't purely filled with roses and rainbows. Happy Rose Day!",
                "Rose spreads its fragrance His fragrance is his message. Happy Rose Day!",
                "It takes a loyal gardener to tend roses. Happy Rose Day!",
                "If you can love all who've betrayed you, you can taste sweetness in everything. Happy Rose Day!",
                "A vampire is like a Rose. They are beautiful, yet harmful. Happy Rose Day!",
                "The only mistake you have made is asking the wrong question. It isn't about what you did wrong. It's what you have not yet done. Happy Rose Day!",
                "For every thorn is just as essential to the longevity of the plant as the blossoms. Happy Rose Day!",
                "I'd love to have the whole place swimming in roses. Happy Rose Day!",
                "I believe in roses. Oh God, yes! I do believe in roses! And I believe in lots and lots and lots of them, too! Happy Rose Day!",
                "Happy Rose Day for Couples, Happy Rose Type day for all Singles. Happy Rose Day!",
                "Holi Comes With Colourr, Dusshaera Comes With Joy, Lohri Comess With Dance, But Rose Day Comes With Love. Happy Rose Day!",
                "Rose Means! Promise of a new beginning. Welcome Back,Joy, Gladness, Friendship, Delight, Remember Me, Jealousy, “I care” So I Love U With Rose. Happy Rose Day!",
                "Everyone likes the rose petals but not the green sepals which protects it in its budding stage, similarly everyone loves the beautiful faces but not those who spend life in making others beautiful. Happy Rose Day!"
        };
        ArrayAdapter<String> sagarlAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, roses);
        ListView rListView = (ListView) findViewById(R.id.rlv);
        rListView.setAdapter(sagarlAdapter);

        rListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
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
