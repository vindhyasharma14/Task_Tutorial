package com.avvntechnology.task.Activity;


import android.content.Context;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.LinearLayout;

import com.avvntechnology.task.Fragment.B_Oops;
import com.avvntechnology.task.Fragment.C_Android;
import com.avvntechnology.task.R;

public class A_HomeActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    Context context;
    DrawerLayout drawerLayout;
    LinearLayout home_toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_home_activity);

        tabLayout = (TabLayout) findViewById(R.id.i_tab_layout_id);
        tabLayout.addTab(tabLayout.newTab().setText("OOP"));
        tabLayout.addTab(tabLayout.newTab().setText("Android"));
        drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);


        home_toolbar = (LinearLayout) findViewById(R.id.home_drawer_id);
        home_toolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (drawerLayout.isDrawerOpen(Gravity.RIGHT)) {
                    drawerLayout.closeDrawer(Gravity.RIGHT);
                } else {
                    drawerLayout.openDrawer(Gravity.RIGHT);

                }
            }
        });

        replaceFragment(new B_Oops());

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if (tab.getPosition() == 0) {

                    replaceFragment(new B_Oops());

                } else if (tab.getPosition() == 1) {

                    replaceFragment(new C_Android());
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }

    private void replaceFragment(Fragment fragment) {

        FragmentManager fragmentManager=getSupportFragmentManager();
       FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.i_fragment_container, fragment);
        transaction.commit();
    }


}
