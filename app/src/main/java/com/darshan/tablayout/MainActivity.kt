package com.darshan.tablayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import com.darshan.tablayout.Fragment.CallsFragment
import com.darshan.tablayout.Fragment.ChatsFragment
import com.darshan.tablayout.Fragment.StatusFragment
import com.darshan.tablayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tabLayout.addTab(binding.tabLayout.newTab().setText("Chats"))
        binding.tabLayout.addTab(binding.tabLayout.newTab().setText("Status"))
        binding.tabLayout.addTab(binding.tabLayout.newTab().setText("Calls"))
    }
}