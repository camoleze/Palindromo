package com.example.palindromo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var txtPalavra:TextView
    private lateinit var edPalindromo: EditText
    var palavra:String =""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txtPalavra=findViewById(R.id.txtPalindromo)
        edPalindromo=findViewById(R.id.edPalindromo)
        val btnPalindromo:Button = findViewById(R.id.btnPalidromo)
        btnPalindromo.setOnClickListener{palindromo()}
    }
    fun palindromo(){
        palavra=edPalindromo.text.toString()
        if(palavra==palavra.reversed()){
            txtPalavra.setText("É Palindromo")
        }else{
            txtPalavra.setText("Não é Palindromo")
        }
    }
}