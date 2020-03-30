package ntnk.sample.scheduleproject.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import ntnk.sample.scheduleproject.R;

public class NotificationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        BottomNavigationView bottomNavigation = findViewById(R.id.bottom_navigation);
        bottomNavigation.setOnNavigationItemSelectedListener(navigationItemSelectedListener);
    }

    BottomNavigationView.OnNavigationItemSelectedListener navigationItemSelectedListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    switch (item.getItemId()) {
                        case R.id.navigation_home:
                            Intent intent = new Intent(NotificationActivity.this, BoardActivity.class);
                            startActivity(intent);
                            return true;
                        case R.id.navigation_task:
                            intent = new Intent(NotificationActivity.this, TodayTaskActivity.class);
                            startActivity(intent);
                            return true;
                        case R.id.navigation_notifications:
                            intent = new Intent(NotificationActivity.this, NotificationActivity.class);
                            startActivity(intent);
                            return true;
                    }
                    return false;
                }
            };
}
