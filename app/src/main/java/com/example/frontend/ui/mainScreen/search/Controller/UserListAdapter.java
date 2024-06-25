package com.example.frontend.ui.mainScreen.search.Controller;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.frontend.R;

import java.util.List;

public class UserListAdapter extends BaseAdapter {
    private Context context;
    private List<User> userList;

    public UserListAdapter(Context context, List<User> userList){
        this.context = context;
        this.userList = userList;
    }

    //출력할 총갯수를 설정하는 메소드
    @Override
    public int getCount() {
        return userList.size();
    }

    //특정한 유저를 반환하는 메소드
    @Override
    public Object getItem(int i) {
        return userList.get(i);
    }

    //아이템별 아이디를 반환하는 메소드
    @Override
    public long getItemId(int i) {
        return i;
    }

    //가장 중요한 부분
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = View.inflate(context, R.layout.item_job, null);

        //뷰에 다음 컴포넌트들을 연결시켜줌
        TextView JobTitle = (TextView)v.findViewById(R.id.jobTitle);
        TextView AgeGender = (TextView)v.findViewById(R.id.ageGender);
        TextView WorkLocation = (TextView)v.findViewById(R.id.workLocation);

        JobTitle.setText(userList.get(i).getJobTitle());
        AgeGender.setText(userList.get(i).getAgeGender());
        WorkLocation.setText(userList.get(i).getWorkLocation());


        //만든뷰를 반환함
        return v;
    }
}
