package com.jayr.portfolio

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory
//import kotlin.androidx.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        Making the corner radius of an image rounded
        val bitmap = BitmapFactory.decodeResource(resources, R.drawable.devslopesprofilelogo)
        val rounded = RoundedBitmapDrawableFactory.create(resources, bitmap)
        rounded.cornerRadius= 15f
        val appLogo = findViewById<ImageView>(R.id.logo)
        appLogo.setImageDrawable(rounded)
        var s   = " mbdbvsmbvmdbs,bv,mb "
        println(s.contentEquals("nfns,mfn,sn,mfsn"))

    }
}