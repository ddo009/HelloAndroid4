package com.choinisae.nisaechoi.myapplication.networkcheck;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;

/**
 * Created by donghaechoi on 2016. 7. 27..
 */
public class NetworkUtil {

    public static int CONNECTED = 1;
    public static int NOT_CONNECTED = 0;

    public static int getConnectivityStatus(Context context) {
        // 해당 로직을 통해 현재 내 핸드폰의 인터넷 연결 상황에 대해 알 수 있음.
        ConnectivityManager cm = (ConnectivityManager) context
                .getSystemService(Context.CONNECTIVITY_SERVICE);

        TelephonyManager tm = (TelephonyManager) context
                .getSystemService(Context.TELEPHONY_SERVICE);

        // 네트워크 정보 가져오기 (연결상태)
        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();

        // 현재 네트워크 정보가 null이 아닐때.
        if (activeNetwork != null) {
            // 네트워크 에서 가지고온 정보의 타입이 == WIFI 이거나 타입이 == MOBILE 일 경우 연결이 되어있는 상태임.
            if (activeNetwork.getType() == ConnectivityManager.TYPE_WIFI || activeNetwork.getType() == ConnectivityManager.TYPE_MOBILE)
                return CONNECTED;
        }
        // 두가지 모두 해당하지 않으면. 연결 되어 있지 않음.
        return NOT_CONNECTED;
    }
}
