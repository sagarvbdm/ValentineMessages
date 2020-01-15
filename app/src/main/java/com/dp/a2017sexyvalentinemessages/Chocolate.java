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

public class Chocolate extends Activity {
    InterstitialAd mInterstitialAd;
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chocolate);

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

        String[] chocos = {
                "All you need is love. But a little chocolate now and then doesn't hurt. Happy Chocolate Day!",
                "Let's face it, a nice creamy chocolate cake does a lot for a lot of people; it does for me.Happy Chocolate Day!",
                "There is nothing better than a friend, unless it is a friend with chocolate.Happy Chocolate Day!",
                "Look, there's no metaphysics on earth like chocolates. Happy Chocolate Day!",
                "If there's no chocolate in Heaven, I'm not going. Happy Chocolate Day!",
                "The greatest tragedies were written by the Greeks and Shakespeare neither knew chocolate. Happy Chocolate Day!",
                "Will looked horrified. What kind of monster could possibly hate chocolate? Happy Chocolate Day!",
                "Happiness. Simple as a glass of chocolate or tortuous as the heart. Bitter. Sweet. Alive. Happy Chocolate Day!",
                "Chocolate says  I'm sorry so much better than words. Happy Chocolate Day!",
                "Your hand and your mouth agreed many years ago that, as far as chocolate is concerned, there is no need to involve your brain. Happy Chocolate Day!",
                "Anything is good if it's made of chocolate. Happy Chocolate Day!",
                "What you see before you, my friend, is the result of a lifetime of chocolate. Happy Chocolate Day!",
                "Always serve too much hot fudge sauce on hot fudge sundaes. It makes people overjoyed, and puts them in your debt. Happy Chocolate Day!",
                "Chemically speaking, chocolate really is the world's perfect food. Happy Chocolate Day!",
                "Coffee and chocolate—the inventor of mocha should be sainted. Happy Chocolate Day!",
                "I was like a chocolate in a box, looking well behaved and perfect in place, all the while harboring a secret center.Happy Chocolate Day!",
                "May your life be filled, as mine has been, with love and laughter; and remember, when things are rough all you need is Chocolate. Happy Chocolate Day!",
                "It was like having a box of chocolates shut in the bedroom drawer. Until the box was empty it occupied the mind too much. Happy Chocolate Day!",
                "Chocolate symbolizes, as does no other food, luxury, comfort, sensuality, gratification, and love. Happy Chocolate Day!",
                "It was an indulgence, learning last words. Other people had chocolate; I had dying declarations.  Happy Chocolate Day!",
                "Chocolate is like my best friend and the most intense pleasure at the same time, perhaps not the most intense, but the most regular and reliable one. Happy Chocolate Day!",
                "I'm pretty sure that eating chocolate keeps wrinkles away because I have never seen a 10 year old with a Hershey bar and crows feet. Happy Chocolate Day!",
                "The Duchess set about studying Annette and shortly found her adversary's tragic flaw.Chocolate.Happy Chocolate Day!",
                "When we don't have the words chocolate can speak volumes. Happy Chocolate Day!",
                "Remember the days when you let your child have some chocolate if he finished his cereal? Now, chocolate is one of the cereals.Happy Chocolate Day!",
                "Everyone needs fudge, Hildy. It's how God helps us cope. Happy Chocolate Day!",
                "If Warren Buffet made chocolate, I’ll bet it’d be really rich. And corrupt. Happy Chocolate Day!",
                "Chocolate is a perfect food, as wholesome as it is delicious, a beneficent restorer of exhausted power it is the best friend of those engaged in literary pursuits.Happy Chocolate Day!",
                "You are trying to lure us into revealing information you're not entitled to? With chocolate and wine? Are you amateurs?Happy Chocolate Day!",
                "A little chocolate a day keeps the doctor at bay. Happy Chocolate Day!",
                "Nobody knows the truffles I've seen. Happy Chocolate Day!",
                "When I have bad days, I just eat lots of chocolate ice cream and dance to the 'Lion King' soundtrack. It's really odd, but it's true.Happy Chocolate Day!",
                "Venice is like eating an entire box of chocolate liqueurs in one go. Happy Chocolate Day!",
                "Anything is good if it's made of chocolate. Happy Chocolate Day!",
                "You know an odd feeling? Sitting on the toilet eating a chocolate candy bar. Happy Chocolate Day!",
                "When it comes to chocolate, resistance is futile. Happy Chocolate Day!",
                "Chocolate is not cheating! After a salty meal, you need a little bit of sweet. This is living, not cheating.Happy Chocolate Day!",
                "I love chocolate, and I love to shop - just give me a good boutique. I like mall scenarios, too, because there's more right there at hand. I think Nashville could use some better shopping! Happy Chocolate Day!",
                "Chocolate is the first luxury. It has so many things wrapped up in it: deliciousness in the moment, childhood memories, and that grin-inducing feeling of getting a reward for being good. Happy Chocolate Day!",
                "Every day, without fail, I eat some dark chocolate. Happy Chocolate Day!",
                "Wanna be always Happy? Always carry some chocolate with you ;) Happy Chocolate Day!",
                "You may have noticed we have no sex lives. As a result there's lots of chocolate in this house. Happy Chocolate Day!",
                "Life without books, chocolate & coffee is just useless. Happy Chocolate Day!",
                "I hope your only rocky road is chocolate. Happy Chocolate Day!",
                "Love is like a hollowed out piece of chocolate, filled with melted music. Happy Chocolate Day!",
                "Chocolate is not just a food, it's also apart of my life! Makes me happy and tastes real good. Happy Chocolate Day!",
                "It does seem like the chocolate brings good luck. Happy Chocolate Day!",
                "When you eat too much chocolate, you get sick of it. When you drink too much champagne, you get sick of it. Gorge yourself on fear. Happy Chocolate Day!",
                "I guess if I'm a product, either you're chocolate, you're vanilla or you're butterscotch. You can't be all three. Happy Chocolate Day!",
                "Everywhere in the world there are tensions - economic, political, religious. So we need chocolate.Happy Chocolate Day!",
                "Whenever I have even a spare second, I'm in the kitchen whipping up a batch of cookies. I make a mean batch of chocolate chippers.Happy Chocolate Day!",
                "War is a bazaar where lives are traded like any other commodity: chocolate or bullets or parachute silk. Happy Chocolate Day!",
                "War is a bazaar where lives are traded like any other commodity: chocolate or bullets or parachute silk. Happy Chocolate Day!",
                "Sometime all you need is love. Oh wait! And ice cream, and chocolate to go along with it as nowadays love is anything but sweet. Happy Chocolate Day!",
                "Some people smoked crack in alleyways. Franny ate chocolate. On the scale of things, it seemed entirely reasonable. Happy Chocolate Day!",
                "When I was a child, I used to eat sugar Frosted Flakes with chocolate milk, but I digest, I mean digress. Happy Chocolate Day!",
                "I'm all over the place with muffins. Carrots are great. Banana, chocolate chip, they rock, too. Happy Chocolate Day!",
                "I just love to bake chocolate cakes and anything unhealthy. It makes me very popular. Happy Chocolate Day!",
                "If kept dry, a chocolate with a high cacao content, I've discovered, rarely spoils. Happy Chocolate Day!",
                "I love dark chocolate, but I will have a piece just occasionally. Happy Chocolate Day!",
                "I'm always, all the time, eating chocolate. I eat pretty healthy, but then I go all out when it has to do with chocolate. Happy Chocolate Day!",
                "I particularly like Hershey's chocolate, the kind which has almonds in it. Happy Chocolate Day!",
                "I'm not into fad diets; I'm not into depriving. I like fast food, and I like chocolate. Happy Chocolate Day!",
                "I love chocolate. Black chocolate with marshmallow inside, caramel inside. If I could only have two foods, I'd take some fantastic chocolate. And some terrible chocolate. I love the Clark Bar.Happy Chocolate Day!",
                "Cocoa boosts brain serotonin. Almost every single antidepressant aims at either enhancing serotonin or keeping it in the brain longer. Chocolate or cocoa does that very well. Happy Chocolate Day!",
                "If it's not chocolate, it's not breakfast. Happy Chocolate Day!",
                "I'm passionate about anything I align myself with. You want to talk about chocolate chip cookies? I'm not going to open a chocolate chip cookie store, but I will talk your ear off about it.Happy Chocolate Day!",
                "I'm a woman who wants her chocolate. Happy Chocolate Day!",
                "It's not a struggle to be on a diet. You feel lighter, and your spirit is lighter, too. But I love chocolate, and I allow myself to have chocolate. That doesn't go against a diet for me.Happy Chocolate Day!",
                "It's not exactly under the radar, but when I'm in London, I love to visit Liberty. It's my favorite department store, and they have a room entirely dedicated to chocolate and truffles. Happy Chocolate Day!",
                "I like pastels and lighter shades on darker skins. I feel like it lifts everything and accentuates being chocolate. Happy Chocolate Day!",
                "Look at bread, and see it as a Dairy Milk Cadbury's chocolate bar, and say to yourself, 'OK, you don't need that.' Bread is bad. Happy Chocolate Day!",
                "I eat a lot of chocolate. Happy Chocolate Day!",
                "I have one chocolate Lab named Jasmine. I also had a rat named Sky. Happy Chocolate Day!",
                "My fans have great senses of humor and eat too much chocolate. Happy Chocolate Day!",
                "I really love my food. My favorite thing is artichokes. I am not so much interested in desserts or chocolate, though. I also like to cook with my husband Damian.Happy Chocolate Day!",
                "I might be able to walk away from sexy, dangerous sifters, but chocolate had me at its beck and call. Happy Chocolate Day!",
                "Money can't buy happiness. But, it can buy a chocolate, which is pretty much the same thing. Happy Chocolate Day!",
                "If chocolate is the answer. the question is irrelevant. unknown Happy Chocolate Day!",
                "Nothing says I love you like the gift of a half-eaten candy bar. I ate my half two weeks before I remembered to give it to her Happy Chocolate Day!",
                "Also, vampires don't eat food. You never get to eat chocolate again. Ever. I'd rather die. Happy Chocolate Day!",
                "Chocolate is a true friend, a trusted confidant, and faithful lover. Happy Chocolate Day!",
                "Chocolate craving your lips, melts at your touch, and savors the moment. Happy Chocolate Day!",
                "Mom always said too much chocolate is like having too much love you can't get enough-Geraldine Solon, Chocolicious Happy Chocolate Day!",
                "A dark-chocolate truffle melts in my mouth, and I forget about everything else even the fact that I'm on a diet. Happy Chocolate Day!",
                "Chocolate is medicinal. I just did another study that confirms it.Happy Chocolate Day!",
                "To me, chocolate was the sole reason we on this earth.Happy Chocolate Day!",
                "Theo nodded slowly. You love Balanchine chocolate like I love cacao.Happy Chocolate Day!",
                "Synthetic chocolate sounds wrong.Happy Chocolate Day!",
                "My favourite word? I think, delicious, because it sounds so delicious. You say it, and you just wanna eat a chocolate bar.Happy Chocolate Day!",
                "I like all sorts of chocolate. Milk chocolate, dark chocolate, anything.Happy Chocolate Day!",
                "I particularly like Hershey's chocolate - the kind which has almonds in it.Happy Chocolate Day!",
                "I travel with chocolate - Godiva with caramel. When the craving hits, I have to have it. I share, but if I'm on my last one, I've been known to say, 'Sorry, I'm out! Happy Chocolate Day!",
                "I never got a chocolate birthday cake; I got a carob one. And when I went to other kids' houses, I was very covetous of things like Cheez Whiz that I'd find in their refrigerators.Happy Chocolate Day!",
                "I love nothing more than a good, rich, dark chocolate. It exhilarates. It satisfies.Happy Chocolate Day!",
                "I love dark chocolate. I'm also a peanut butter and chocolate fanatic. That's pretty much the greatest invention of the last century.Happy Chocolate Day!",
                "If I weren't acting, I would own my own chocolate shop in Paris. I would be a nice, overweight person that makes chocolate all day long.'Happy Chocolate Day!",
                "The older I get, the harder it is to splurge without consequences. I love food. Chocolate and cheese and anything that's bad for me. I'll be really good when I'm at home so I can eat what I want to when I'm out with friends.'Happy Chocolate Day!",
                "My weakness is chocolate - especially butterscotch and nut varieties. Happy Chocolate Day!",
                "I need God’s grace and something baked with peanut butter and chocolate.Happy Chocolate Day!",
        };
        ArrayAdapter<String> sagarlAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, chocos);
        ListView cListView = (ListView) findViewById(R.id.clv);
        cListView.setAdapter(sagarlAdapter);

        cListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
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
