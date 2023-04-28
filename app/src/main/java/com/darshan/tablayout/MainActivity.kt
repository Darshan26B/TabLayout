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
        binding.Chats.setOnClickListener {
            loadFragmens(ChatsFragment())
        }
        binding.Status.setOnClickListener {
            loadFragmens(StatusFragment())
        }
        binding.Calls.setOnClickListener {
            loadFragmens(CallsFragment())
        }
    }

    private fun loadFragmens(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.Viewpager,fragment).commit()

    }

}