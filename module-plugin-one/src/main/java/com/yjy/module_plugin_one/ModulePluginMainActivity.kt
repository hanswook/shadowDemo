package com.yjy.module_plugin_one

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yjy.module_lib_one.LibTestOneActivity
import kotlinx.android.synthetic.main.activity_module_plugin_main.*

class ModulePluginMainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_module_plugin_main)
        tvOne.setOnClickListener {
            startActivity(Intent(this, LibTestOneActivity::class.java))
        }
    }
}
