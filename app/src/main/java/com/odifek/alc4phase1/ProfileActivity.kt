package com.odifek.alc4phase1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityOptionsCompat
import androidx.core.view.ViewCompat
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

        ViewCompat.setTransitionName(binding.imageviewProfilePics, getString(R.string.profile_picture))

        Glide.with(this)
            .load(R.drawable.navigation_editor)
            .into(binding.imageviewBanner)
        Glide.with(this)
            .load(R.drawable.myself)
            .into(binding.imageviewProfilePics)
        binding.imageviewProfilePics.setOnClickListener {

            val circleOptions = ActivityOptionsCompat.makeSceneTransitionAnimation(
                this,
                binding.imageviewProfilePics,
                getString(R.string.profile_picture)
            )
            startActivity(
                Intent(this, PhotoDetailActivity::class.java),
                circleOptions.toBundle()
            )
        }

    }

}
