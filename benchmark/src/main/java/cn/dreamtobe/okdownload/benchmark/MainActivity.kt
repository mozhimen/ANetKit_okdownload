package cn.dreamtobe.okdownload.benchmark

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.liulishuo.okdownload.benchmark.R
import com.liulishuo.okdownload.benchmark.databinding.ActivityMainBinding
import com.mozhimen.uik.databinding.bases.viewdatabinding.activity.BaseActivityVDB

class MainActivity : BaseActivityVDB<ActivityMainBinding>() {

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                vdb.message.setText(R.string.title_home)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_dashboard -> {
                vdb.message.setText(R.string.title_dashboard)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_notifications -> {
                vdb.message.setText(R.string.title_notifications)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        vdb.navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }
}
