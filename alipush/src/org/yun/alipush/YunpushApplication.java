package org.yun.alipush;

import android.app.Application;
import android.util.Log;

import com.alibaba.sdk.android.AlibabaSDK;
import com.alibaba.sdk.android.callback.InitResultCallback;

/**
 * For developer startup JPush SDK
 * 
 * 一般建议在自定义 Application 类里初始化。也可以在主 Activity 里。
 */
public class YunpushApplication extends Application {
    private static final String TAG = "Init";

    @Override
        public void onCreate() {
        super.onCreate();

        AlibabaSDK.asyncInit(YunpushApplication.this,new InitResultCallback() {

            @Override
            public void onSuccess() {
                Log.d(TAG, "init onesdk success");
            }

            @Override
            public void onFailure(int code, String message) {
                Log.e(TAG, "init onesdk failed : " + message);
            }
        });
    }
}
