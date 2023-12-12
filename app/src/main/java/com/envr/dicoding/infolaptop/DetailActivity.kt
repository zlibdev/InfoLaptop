package com.envr.dicoding.infolaptop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.envr.dicoding.infolaptop.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding : ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        val laptop = intent.getParcelableExtra<Laptop>(EXTRA_LAPTOP) as Laptop
        initLaptop(laptop)
    }

    private fun initLaptop(laptop: Laptop) {
        binding.tvItemName.text = laptop.name
        binding.tvItemDescription.text = laptop.description
        binding.imgLaptop.setImageResource(laptop.photo)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == android.R.id.home){
            finish()
        }
        return super.onOptionsItemSelected(item)
    }

    companion object {
        val EXTRA_LAPTOP = "extra_laptop"
    }
}