package com.example.vkfragmentlike;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    public static ArrayList<String> avatars = new ArrayList<>();
    public static ArrayList<String> names = new ArrayList<>();
    public static ArrayList<String> images = new ArrayList<>();
    public static ArrayList<String> descriptions = new ArrayList<>();
    public static ArrayList<Boolean> liked = new ArrayList<>();
    static ViewPager viewPager;
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate: ");

        initImageBitmaps();

        initFragmentPagerAdapter();

        initBottomNavigation();
    }

    private void initFragmentPagerAdapter() {

        viewPager = findViewById(R.id.viewPager);
        PagerAdapter ViewPagerAdapter = new PagerAdapter(getSupportFragmentManager(), 2);
        viewPager.setAdapter(ViewPagerAdapter);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position) {
                    case 0:
                        bottomNavigationView.getMenu().findItem(R.id.nav_home).setChecked(true);
                        break;
                    case 1:
                        bottomNavigationView.getMenu().findItem(R.id.nav_favorite).setChecked(true);
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }

    private void initBottomNavigation() {
        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        viewPager.setCurrentItem(0);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.nav_home:
                        //if(!(selectedFragment instanceof HomeFragment)) {
                        viewPager.setCurrentItem(0);
                        //}
                        break;
                    case R.id.nav_favorite:
                        //if(!(selectedFragment instanceof FavoriteFragment)) {
                        viewPager.setCurrentItem(1);
                        //}
                        break;
                }
                return true;
            }
        });
    }

    private void ClearAllData() {
        avatars.clear();
        names.clear();
        images.clear();
        descriptions.clear();
        liked.clear();
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        liked.clear();
        boolean[] likedArray = savedInstanceState.getBooleanArray("liked");
        for (int i = 0; i < likedArray.length; i++) {
            liked.add(likedArray[i]);
        }
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        boolean[] likedArray = new boolean[10];
        for (int i = 0; i < liked.size(); i++) {
            likedArray[i] = liked.get(i);
        }
        outState.putBooleanArray("liked", likedArray);
    }

    private void initImageBitmaps() {
        Log.d(TAG, "initImageBitmaps: ");

        ClearAllData();

        avatars.add("https://www.gandex.ru/upl/oboi/gandex.ru-26_418c9496c23395168a7e6abc869e9010.jpg");
        names.add("Anna");
        images.add("https://w-dog.ru/wallpapers/16/17/471309284013678.jpg");
        descriptions.add(" ");
        liked.add(false);

        avatars.add("https://oboi.ws/filters/lomo_17_8165_oboi_oboi_star_wars_1920x1080.jpg");
        names.add("Fitness life");
        images.add("https://ivasi.news/wp-content/uploads/2017/10/1413791682_100657702_3185107_sovremennoe_rabstvo.png");
        descriptions.add("");
        liked.add(false);

        avatars.add("https://cs13.pikabu.ru/post_img/big/2019/08/01/7/1564656020171875882.jpg");
        names.add("Assasins");
        images.add("https://i.playground.ru/i/pix/1057582/image.jpg");
        descriptions.add("");
        liked.add(false);

        avatars.add("https://otatuirovkah.ru/img/stati/1-tatuirovki-mayka-taysona.jpg");
        names.add("Mike");
        images.add("https://vokrug.tv/pic/news/8/d/e/b/8deb38e4b69429bb7e48708aa9375a53.jpeg");
        descriptions.add("Жастык шак");
        liked.add(false);

        avatars.add("https://sun9-63.userapi.com/c852232/v852232919/13a829/-K2f3q1V06Y.jpg  ");
        names.add("Tokaev Kasym-Jomart");
        images.add("https://sun9-59.userapi.com/c854020/v854020495/61451/HIvYjdLV1-0.jpg");
        descriptions.add("Токаев встретился с юными гениями Казахстана");
        liked.add(false);

        avatars.add("https://besthqwallpapers.com/Uploads/12-12-2019/115136/thumb-alan-walker-logo-winter-concepts-snow-texture-snow-background-alan-walker-emblem.jpg");
        names.add("Alan");
        images.add("https://i.pinimg.com/originals/bb/fa/37/bbfa37b5a0a81f92d8de2a8280dcb918.jpg");
        descriptions.add(" ");
        liked.add(false);


    }
}

