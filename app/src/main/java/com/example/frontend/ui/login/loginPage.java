package com.example.frontend.ui.login;

import static android.content.ContentValues.TAG;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.example.frontend.R;
import com.kakao.sdk.common.KakaoSdk;
import com.kakao.sdk.user.UserApiClient;
import com.kakao.sdk.auth.AuthApiClient;
import com.kakao.sdk.user.model.Account;
import com.kakao.sdk.user.model.User;

import java.security.MessageDigest;
import java.security.Signature;

public class loginPage extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainlogin);

        KakaoSdk.init(this, getString(R.string.kakao_app_key));


        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }




        findViewById(R.id.kakaologinbutton).setOnClickListener(v -> {
            Log.d(TAG, "카카오 로그인 버튼 클릭됨");
            if (UserApiClient.getInstance().isKakaoTalkLoginAvailable(this)) {
                // 카카오톡으로 로그인
                UserApiClient.getInstance().loginWithKakaoTalk(this, (oAuthToken, error) -> {
                    if (error != null) {
                        Log.e(TAG, "카카오톡 로그인 실패", error);
                        Toast.makeText(this, "카카오톡 로그인 실패", Toast.LENGTH_SHORT).show();
                    } else if (oAuthToken != null) {
                        Log.d(TAG, "카카오톡 로그인 성공");
                        getUserInfo();
                        Intent intent = new Intent(getApplicationContext(), RegisterRegion.class);
                        startActivity(intent);
                    }
                    return null;
                });
            } else {
                // 카카오 계정으로 로그인 (웹 브라우저 이용)
                UserApiClient.getInstance().loginWithKakaoAccount(this, (oAuthToken, error) -> {
                    if (error != null) {
                        Log.e(TAG, "카카오 계정 로그인 실패", error);
                        Toast.makeText(this, "카카오 계정 로그인 실패", Toast.LENGTH_SHORT).show();
                    } else if (oAuthToken != null) {
                        Log.d(TAG, "카카오 계정 로그인 성공");
                        getUserInfo();
                        Intent intent = new Intent(getApplicationContext(), RegisterRegion.class);
                        startActivity(intent);
                    }

                    return null;
                });
            }
        });
    }

    private void getUserInfo() {
        UserApiClient.getInstance().me((user, error) -> {
            if (error != null) {
                Log.e(TAG, "사용자 정보 요청 실패", error);
                Toast.makeText(this, "사용자 정보 요청 실패", Toast.LENGTH_SHORT).show();
            } else if (user != null) {
                Log.d(TAG, "사용자 정보 요청 성공");
                String nickname = user.getKakaoAccount().getProfile().getNickname();
                String email = user.getKakaoAccount().getEmail();
                Log.d(TAG, "닉네임: " + nickname + ", 이메일: " + email);
                // 사용자 정보 활용
            }
            return null;
        });
    }
}