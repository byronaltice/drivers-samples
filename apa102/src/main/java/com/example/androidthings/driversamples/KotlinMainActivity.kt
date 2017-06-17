package com.example.androidthings.driversamples

import android.app.Activity
import com.google.android.things.contrib.driver.apa102.Apa102
import android.os.Handler
import android.os.HandlerThread

/**
 * Created by lgleason on 6/17/17.
 */
class KotlinMainActivity : Activity() {
    // please ignore this mess :)
/*
    val TAG : String? = MainActivity::class.simpleName

    // LED configuration.
    val NUM_LEDS : Int = 100
    val LED_BRIGHTNESS : Int = 5
    val LED_MODE : Apa102.Mode = Apa102.Mode.BGR

    // Animation configuration.
    val FRAME_DELAY_MS : Int = 50

    private lateinit var mLedstrip : Apa102
    private lateinit var mLedColors : Array<Int>
    private var mFrame : Int = 0;
    private var mHandler : Handler = Handler()
    private lateinit var mPioThread : HandlerThread

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "APA102 MainActivity created");

        mPioThread = new HandlerThread("pioThread");
        mPioThread.start();

        mHandler = new Handler(mPioThread.getLooper());

        mLedColors = new int[NUM_LEDS];
        try {
            Log.d(TAG, "Initializing LED strip");
            mLedstrip = new Apa102(BoardDefaults.getSPIPort(), LED_MODE);
            mLedstrip.setBrightness(LED_BRIGHTNESS);
            mHandler.post(mAnimateRunnable);
        } catch (IOException e) {
            Log.e(TAG, "Error initializing LED strip", e);
        }
    }
*/

}
