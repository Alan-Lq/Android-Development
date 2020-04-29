package com.example.vkontakte_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.vkontakte_recyclerview.RecyclerViewAdapterFeed;
import com.example.vkontakte_recyclerview.FeedModel;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity{

    BottomNavigationView bottomNavigation;
    RecyclerView recView;
    ArrayList<FeedModel>feedModelArrayList=new ArrayList<>();
    RecyclerViewAdapterFeed adapterFeed;
    private TypeFaceUtil TypefaceUtil;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bottomNavigation = findViewById(R.id.bottom_navigation);
        TypefaceUtil.overrideFont(getApplicationContext(), "SANS_SERIF", "fonts/MontserratSemiBold.ttf");

        populaterecyclerview();

        recView = (RecyclerView) findViewById(R.id.recy_feed);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recView.setLayoutManager(layoutManager);

        adapterFeed = new RecyclerViewAdapterFeed(this,feedModelArrayList);
        recView.setAdapter(adapterFeed);


    }


    private void populaterecyclerview() {
        FeedModel fm1 = new FeedModel("_Pakita" , "час назад" , "" ,"10K" , R.drawable.pakkita , R.drawable.angell ,"951" , "59", "30K");
        FeedModel fm2 = new FeedModel("kbtu_official" ,"1 день назад", " Приглашаем Вас принять участие в бесплатном вебинаре : Оценка конкурентспособности поставщиков и подрятчиков","777",R.drawable.kbtu,R.drawable.angell,"52","12","500");
        FeedModel fm3 = new FeedModel("izi-mobile","Реклама","","2337",R.drawable.izii,R.drawable.izi,"421","4","5K");
        FeedModel fm4 = new FeedModel("elim_zherim","","Индияда Амир Хан бір қыстақ тұрғындарына қайырымдылық жасапты.","2122",R.drawable.kazz,R.drawable.kaz,"214","16","21K");
        FeedModel fm5 = new FeedModel("shymkent_city17", "Шымкент"," Сегодняшний закат в Шымкенте","1482",R.drawable.shymm,R.drawable.shym,"160","40","41K");
        FeedModel fm6 = new FeedModel("baigenews","","Опасность болезни преуменьшать... ещё","715",R.drawable.baigee,R.drawable.baige,"216","125","44K");
        FeedModel fm7 = new FeedModel("marveldcparadise","","Oof......" ,"7185",R.drawable.mranddcc,R.drawable.mranddc,"457","17","90K");
        FeedModel fm8 = new FeedModel("success_concept","","@biz_top\n" +
                "","1205",R.drawable.success,R.drawable.succes,"17","104","4К");
        FeedModel fm9 = new FeedModel("best facts","15 минут назад","Первые 750 лайкнувших самые... ещё","2149",R.drawable.bestt,R.drawable.best,"677","34","60K");
        FeedModel fm10 = new FeedModel("allmems","",null,"4K",R.drawable.all,R.drawable.all,"433","72","18K");



        feedModelArrayList.add(fm1);
        feedModelArrayList.add(fm2);
        feedModelArrayList.add(fm3);
        feedModelArrayList.add(fm4);
        feedModelArrayList.add(fm5);
        feedModelArrayList.add(fm6);
        feedModelArrayList.add(fm7);
        feedModelArrayList.add(fm8);
        feedModelArrayList.add(fm9);
        feedModelArrayList.add(fm10);

    }

}