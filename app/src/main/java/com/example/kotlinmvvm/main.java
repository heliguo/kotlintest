package com.example.kotlinmvvm;

import android.os.Handler;

/**
 * @author lgh on 2020/6/21 18:39
 * @description
 */
class main {

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        }).start();

    }

    int getLength(String text) {
        return text == null ? 0 : text.length();
    }

}
