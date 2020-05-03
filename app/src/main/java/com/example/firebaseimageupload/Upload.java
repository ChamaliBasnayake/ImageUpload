package com.example.firebaseimageupload;

import android.net.Uri;

import com.google.android.gms.tasks.Task;

public class Upload {
    private String mName;
    private String mPhone;
    private String mAddress;
    private String mWeek;
    private String mImageUrl;

    public Upload(String name, String phone, String address, String trim, Task<Uri> downloadUrl){
        //empty constructor needed

    }
    public Upload(String address, String imageUrl, String name,String phone, String week){

        mName = name;
        mPhone = phone;
        mAddress = address;
        mWeek =week;
        mImageUrl = imageUrl;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getPhone() {
        return mPhone;
    }

    public void setPhone(String phone) {
        mPhone = phone;
    }

    public String getAddress() {
        return mAddress;
    }

    public void setAddress(String address) {
        mAddress = address;
    }

    public String getWeek() {
        return mWeek;
    }

    public void setWeek(String week) {
        mWeek = week;
    }

    public String getImageUrl() {
        return mImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        mImageUrl = imageUrl;
    }
}
