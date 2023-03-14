package com.example.knowledgehub

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import androidx.cardview.widget.CardView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val androidButton= findViewById<CardView>(R.id.cardAndroid)
        val webButton= findViewById<CardView>(R.id.cardWeb)
        val iossButton= findViewById<CardView>(R.id.cardIos)
        val mlButton= findViewById<CardView>(R.id.cardMl)
        val blokchainButton= findViewById<CardView>(R.id.cardBlockchain)
        val webb3Button= findViewById<CardView>(R.id.cardWeb3)


        val callusButton= findViewById<Button>(R.id.callus)

        // android card view
        androidButton.setOnClickListener {
            intent= Intent(applicationContext, AndroidActivity::class.java)
            startActivity(intent)
        }

        // Web card view
        webButton.setOnClickListener {
            intent= Intent(applicationContext, WebActivity::class.java)
            startActivity(intent)
        }

        // Ios card view
        iossButton.setOnClickListener {
            intent= Intent(applicationContext, IosActivity::class.java)
            startActivity(intent)
        }

        // Machine Learning card view
        mlButton.setOnClickListener {
            intent= Intent(applicationContext, MachineLearningActivity::class.java)
            startActivity(intent)
        }

        // Blockchain card view
        blokchainButton.setOnClickListener {
            intent= Intent(applicationContext, BlockChainActivity::class.java)
            startActivity(intent)
        }

        // Web3 card view
        webb3Button.setOnClickListener {
            intent= Intent(applicationContext, Web3Activity::class.java)
            startActivity(intent)
        }

        // Call Us Button
        callusButton.setOnClickListener {
            val intent= Intent(Intent.ACTION_CALL)
            intent.data = Uri.parse("tel: 9999999999")
            startActivity(intent)
        }
    }
}