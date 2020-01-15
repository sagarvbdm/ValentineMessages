package com.dp.a2017sexyvalentinemessages;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class lcp extends Activity {


    InterstitialAd mInterstitialAd;
    private AdView mAdView;

    TextView tx;
    Button sb,cb,mb,rb;
    ClipboardManager clipboardManager;
    ClipData clipData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lcp);

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

        final TextView textView = (TextView)findViewById(R.id.tv);
        final Intent intent= getIntent();
        String name = intent.getStringExtra("status");
        textView.setText(name);

        tx=(TextView)findViewById(R.id.tv);
        cb=(Button)findViewById(R.id.button1);
        sb=(Button)findViewById(R.id.button);
        mb=(Button)findViewById(R.id.more);
        rb=(Button)findViewById(R.id.rate);

        rb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    lcp.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + lcp.this.getPackageName())));
                    return;
                }
                catch (ActivityNotFoundException localActivityNotFoundException)
                {
                    lcp.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://play.google.com/store/apps/details?id=" + lcp.this.getPackageName())));
                }
            }
        });

        mb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    lcp.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/developer?id=sagarvbdm")));
                    return;
                }
                catch (ActivityNotFoundException localActivityNotFoundException)
                {
                    lcp.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/developer?id=sagarvbdm")));
                }
            }
        });


        sb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = tx.getText().toString();
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_SUBJECT,"MyApp");
                intent.putExtra(Intent.EXTRA_TEXT, text);
                startActivity(Intent.createChooser(intent, "Share via"));
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
            }
        });

        clipboardManager=(ClipboardManager)getSystemService(CLIPBOARD_SERVICE);
        cb.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String text = tx.getText().toString();
                clipData = ClipData.newPlainText("text",text);
                clipboardManager.setPrimaryClip(clipData);
                Toast.makeText(getApplicationContext(),"Text Copied",Toast.LENGTH_SHORT).show();
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