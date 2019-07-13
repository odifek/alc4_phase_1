package com.odifek.alc4phase1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.bumptech.glide.Glide
import com.odifek.alc4phase1.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_profile)

        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        Glide.with(this)
            .load(R.drawable.navigation_editor)
            .into(binding.imageviewBanner)
        Glide.with(this)
            .load(R.drawable.myself)
            .into(binding.imageviewProfilePics)

    }

}
