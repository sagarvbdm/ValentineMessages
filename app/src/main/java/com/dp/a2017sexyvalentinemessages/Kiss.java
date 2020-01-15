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

public class Kiss extends Activity {
    InterstitialAd mInterstitialAd;
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kiss);

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

        String[] kisss = {
                "A kiss is a lovely trick designed by nature to stop speech when words become superfluous. Happy Kiss Day!",
                "Kiss me, and you will see how important I am. Happy Kiss Day!",
                "One day you will kiss a man you can't breathe without, and find that breath is of little consequence.Happy Kiss Day!",
                "I'm oxygen and he's dying to breathe. Happy Kiss Day!",
                "The mouth is made for communication, and nothing is more articulate than a kiss.Happy Kiss Day!",
                "A kiss is a rosy dot over the 'I' of loving. Happy Kiss Day!",
                "A kiss is a secret which takes the lips for the ear. Happy Kiss Day!",
                "Happiness is like a kiss. You must share it to enjoy it. Happy Kiss Day!",
                "Expressions of affection, like putting your arm around someone's shoulder, holding hands, or giving a kiss good night, involve the principle of honesty.Happy Kiss Day!",
                "What is a kiss?Why this, as some approve: The sure, sweet cement, glue, and lime of love.",
                "When my time on earth is gone, and my activities here are passed, I want they bury me upside down, and my critics can kiss my ass!Happy Kiss Day!",
                "A friend is always good to have, but a lover's kiss is better than angels raining down on me.",
                "Any man who can drive safely while kissing a pretty girl is simply not giving the kiss the attention it deserves. Happy Kiss Day!",
                "Some are kissing mothers and some are scolding mothers, but it is love just the same, and most mothers kiss and scold together. Happy Kiss Day!",
                "Drink to me only with thine eyes, And I will pledge with mine; Or leave a kiss but in the cup And I'll not look for wine. Happy Kiss Day!",
                "Let the rain kiss you. Let the rain beat upon your head with silver liquid drops. Let the rain sing you a lullaby. Happy Kiss Day!",
                "A kiss that is never tasted, is forever and ever wasted. Happy Kiss Day!",
                "It's the kind of kiss that inspires stars to climb into the sky and light up the world. Happy Kiss Day!",
                "She is free in her wildness, she is a wanderess, a drop of free water. She knows nothing of borders and cares nothing for rules or customs. 'Time' for her isn’t something to fight against. Her life flows clean, with passion, like fresh water. Happy Kiss Day!",
                "Close your eyes and I'll kiss you, Tomorrow I'll miss you. Happy Kiss Day!",
                "I wish you could be kissed, Jane,' he said. 'Because I would beg just one off you. Under all this.' He flailed an arm toward the stars.Happy Kiss Day!",
                "You must give everything to make your life as beautiful as the dreams that dance in your imagination. Happy Kiss Day!",
                "Always kiss your children goodnight, even if they're already asleep. Happy Kiss Day!",
                "How far away the stars seem, and how far is our first kiss, and ah, how old my heart. Happy Kiss Day!",
                "Every girl on TV, in real life, sure you want to meet that soul mate and fall in love and have the big thing, but until that happens, you gotta kiss a lot of frogs.Happy Kiss Day!",
                "It is the passion that is in a kiss that gives to it its sweetness; it is the affection in a kiss that sanctifies it. Happy Kiss Day!",
                "The human race tends to remember the abuses to which it has been subjected rather than the endearments. What's left of kisses? Wounds, however, leave scars. Happy Kiss Day!",
                "I was going to kiss him, and I was going to regret it. But at that moment, I couldn't bring myself to care. Happy Kiss Day!",
                "It's a smile, it's a kiss, it's a sip of wine it's summertime! Happy Kiss Day!",
                "A kiss on the beach when there is a full moon is the closest thing to heaven.",
                "Well, it's either kiss me or kill me, that's how I see it.Happy Kiss Day!",
                "Earthquakes just happen. Tornadoes just happen. Your tongue does not just happen to fall into some other girls mouth! Happy Kiss Day!",
                "I have liquid lips, and my kisses are smooth as wine. Why pour you a glass when you can drink from the bottle? Happy Kiss Day!",
                "The best part about being a writer is being able to communicate with people without moving my lips. The mouth is better used for kissing. Happy Kiss Day!",
                "Before I could lose my courage, I said, Don't I get a kiss for luck? It's kind of a tradition, right? Happy Kiss Day!",
                "Then she was kissing him as she had never kissed him before and it was blissful oblivion, better than firewhisky; she was the only real thing in the world.Happy Kiss Day!",
                "Such a little thing really, a kiss. most people don't give it a moment's consideration. They kiss on meeting, they kiss on parting, that simple touching of flesh is taken entirely for granted as a basic human right.Happy Kiss Day!",
                "I kissed a mystery, and it tasted like a woman. Lips are always full of delicious secrets. Happy Kiss Day!",
                "With eyes closed, a kiss is gender-less. Now that mustaches are in fashion, some women are finding more hipster love. Happy Kiss Day!",
                "He kisses me like he's giving me every kiss he wishes he could have given me the past, and every kiss he'll wish he could give me in the future. All at once. Happy Kiss Day!",
                "You can use your mouth to speak the words I love you, or you can use your mouth to kiss me and transport love from your mind to my heart. Happy Kiss Day!",
                "I'm going to kiss you now, and I don't know if I'll ever stop. Happy Kiss Day!",
                "The first kiss can be as terrifying as the last. Happy Kiss Day!",
                "The reason I play music is to touch people - for selfish reasons, as well. It feels good to make someone else feel something, whether it's a kiss, a painting, good idea or it's a song.Happy Kiss Day!",
                "Golden slumbers kiss your eyes, Smiles awake you when you rise. Happy Kiss Day!",
                "A kiss makes the heart young again and wipes out the years. Happy Kiss Day!",
                "I like kisses that aren't too fast or rushed - that's what makes a good kiss. Happy Kiss Day!",
                "A first kiss is hard to fake on screen. It's tempting to practice before you shoot, but why blow that natural awkwardness on a rehearsal? There's something so beautiful about it that can't be faked.Happy Kiss Day!",
                "You should be kissed and by someone who knows how. Happy Kiss Day!",
                "The kiss itself is immortal. It travels from lip to lip, century to century, from age to age. Men and women garner these kisses, offer them to others and then die in turn.Happy Kiss Day!",
                "Cole sat back up, slowly, and I opened my eyes. His expression, as ever, was blank, the face he wore when something mattered. He said, That's how I would kiss you, if I loved you. Happy Kiss Day!",
                "Impulsively, I lean forward and kiss him, stopping his word. This is probably overdue anyway since he’s right, we are supposed to be madly in love. Happy Kiss Day!",
                "I was born when you kissed me. I died when you left me. I lived a few weeks while you loved me. Happy Kiss Day!",
                "If we spoke with our ears, and listened through our mouth, then a kiss might be the most romantic sound in the world. Happy Kiss Day!",
                "Besides, if one little kiss makes her a slut, I'd hate to know what that makes you. Happy Kiss Day!",
                "Then he kissed her. At his lips' touch she blossomed for him like a flower and the incarnation was complete. Happy Kiss Day!",
                "I told you we were meant to be, he says, still smiling, still so Finn, who was always here but who I just didn't see and now Well, now I kiss him. Happy Kiss Day!",
                "She is so lovely she could kill you without you even noticing it. A monster girl who knows when to kiss and when to kill. Happy Kiss Day!",
                "Kiss me until I forget how terrified I am of everything wrong with my life. Happy Kiss Day!",
                "Grey rocks, and greyer sea, And surf along the shore And in my heart a name My lips shall speak no more. Happy Kiss Day!",
                "Don't you want me to kiss you goodbye, sweetie? Kiss a cow farm boy. Happy Kiss Day!",
                "I want to touch with my mouth. His mouth, with my mouth. Maybe his neck, too. But first things first: Make him aware I exist. Happy Kiss Day!",
                "You and I, it's as though we have been taught to kiss in heaven and sent down to earth together, to see if we know what we were taught. Happy Kiss Day!",
                "He nodded and leaned down to kiss me. I let him, Dad be damned. Happy Kiss Day!",
                "Kiss someone like kissing is the only way you have to communicate. There is no conversation. There is no sex. There are only two sets of lips that are ravenous to be recognized and treasured.Happy Kiss Day!",
                "He took her into his arms again, using all his strength to be gentle, and let his lips touch hers so lightly he could hardly feel it. Happy Kiss Day!",
                "His kisses tapped into deep mines of memory, and the years that had separated us fell away as if they were nothing. Happy Kiss Day!",
                "For one entire day I let his kiss burn on my cheek and into my blood and I don't push the memory away... This kiss, these words, they feel like beginning.Happy Kiss Day!",
                "It seems that I have been held in some dreaming state A tourist in the waking world world, never quite awake. No kiss, no gentle word could wake me from this slumber, Until I realised that it was you who held me under.Happy Kiss Day!",
                "I recently heard of a group called The Lipsticks who only sing Kiss hits, which reminds me of something weird ?I saw yesterday. ?I saw Elvis. And he was impersonating me. Happy Kiss Day!",
                "The song This Kiss was definitely my breakthrough song. After that, Breathe was my breakthrough album. Happy Kiss Day!",
                "I kiss, but I don't tell. Happy Kiss Day!",
                "It was the kiss of a man who had waited years for the moment, and feared that it would never come again.Happy Kiss Day!",
                "He had kissed her good night that night, and she had tasted like strawberry daiquiris, and he had never wanted to kiss anyone else again.Happy Kiss Day!",
                "To expect to be kissed having bad breath is the secret of a fool. Happy Kiss Day!",
                "The only foreplay I really need is for a guy to kiss my hip bone. The hip is the most erotic and neglected body part. Kiss the hip bone with your lips.Happy Kiss Day!",
                "If anyone tells you it's impossible to be fabulous and smart and make a ton of money using math, well, they can just get in line behind you - and kiss your math. Happy Kiss Day!",
                "The bottom line is the Kiss Army is growing by leaps and bounds. Happy Kiss Day!",
                "Kissing a stranger because that is what is done presages an unhappy year not for any supernatural reason, but because you are unsatisfied enough with your lot in life to put your lips on the line for a fallacy.Happy Kiss Day!",
                "I want to kiss you so thoroughly that you lose your ability to stand. Happy Kiss Day!",
                "I’d waited an eternity for this. I’d have waited all over again if I had to. I was meant to kiss this boy, designed to be held by him.Happy Kiss Day!",
                "Our mouths fit together so perfectly. Every time we kiss, I fall even more in love with him, and it has nothing to do with sex or lust. It's him. His closeness and his scent and the way he soothes me.Happy Kiss Day!",
                "My first real kiss was actually on the set of 'The Vampire's Assistant' with Jessica Carlson who plays my crush in the movie. I was 15, she was 14. It was actually her first kiss too, so it was an interesting situation!Happy Kiss Day!",
                "My very first kiss happened when I was 6, underneath some desks during 'nap time', but my first real kiss happened when I was 15 in the parking lot at a Mexican food restaurant. Happy Kiss Day!",
                "Even at an early age, I rebelled against my strict upbringing. When I was 9, I built myself a 'make-out fort' in our backyard from wood, filled it with candy, and invited my blond, blue-eyed neighbor over to kiss.Happy Kiss Day!",
                "A first kiss is the demarcation line: the same information that a moment ago felt private, all of a suddens seems unfair to withhold. And with that exchange came more. Happy Kiss Day!",
                "I think most of the people, once you see a Kiss show, you kinda get spoiled because I don't think there's anybody out there that's doing a bigger or a better show than us. Happy Kiss Day!",
                "My first kiss. A new kind of kiss, like the new kind of music still playing, softly, in the distance - wild and arrhythmic, desperate. Passionate. Happy Kiss Day!",
                "I have a lot of boyfriends, I want you to write that. Every country I visit, I have a different boyfriend. And I kiss them all. Happy Kiss Day!",
                "Long Kiss Goodnight has a huge cult following. They could make another version of that movie right now and make a lot of money Happy Kiss Day!",
                "The kiss intimately relates to the most primitive kind of human contact, which can satisfy all of our needs, like: feeding, enjoying pleasure, tasting, wanting, rejecting, everything we associate with love.Happy Kiss Day!",
                "I kiss her. I kiss her and kiss her. I try not to bite her lip. She tastes like vodkahoney. Happy Kiss Day!",
                "He pulled her close kissing her mouth taking her by surprise. He stepped back passion smoldering in his eyes. She looked at him touching her mouth where his kiss still burned.Happy Kiss Day!",
                "I liked this girl in my sixth grade class. I dared her to kiss me but she didn't! Happy Kiss Day!",
                "Life can make you do many things, even kiss a man with a runny nose. Happy Kiss Day!",
                "My first kiss was when I was 13. I was so nervous that I was shaking. Unfortunately, the girl I kissed never spoke to me again.Happy Kiss Day!",
                "I kiss like a skyscraper meets the sky, only with less scraping and more vertigo. Happy Kiss Day!",
                "You’d kiss me back right now if I kissed you,” he said, and I tried to decide whether to even attempt denial. “But then you’d remember him and you’d feel bad for it.Happy Kiss Day!",
                "Had I truly thought I would not die when he kissed me? But I did. For a moment the breath and life went out of me and there was no time and no tomorrow but only my lips against his. Happy Kiss Day!",
                "The first kiss between two people is something really good in life. Happy Kiss Day!",
        };
        ArrayAdapter<String> sagarlAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, kisss);
        ListView kListView = (ListView) findViewById(R.id.klv);
        kListView.setAdapter(sagarlAdapter);

        kListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
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
