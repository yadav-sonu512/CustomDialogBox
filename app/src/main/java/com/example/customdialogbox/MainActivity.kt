package com.example.customdialogbox

import android.annotation.SuppressLint
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.LayoutInflater
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val button = findViewById<Button>(R.id.showDialog)
        val customDialog = findViewById<Button>(R.id.showCustomDialog)


        button.setOnClickListener {
            showDialog()
        }
        customDialog.setOnClickListener {
            showCustomDialog()
        }
    }

    private fun showDialog(){
        val alertDialog = AlertDialog.Builder(this)



        alertDialog.setPositiveButton("Yes",DialogInterface.OnClickListener { dialogInterface, i ->

        })
        alertDialog.setNegativeButton("No",DialogInterface.OnClickListener { dialogInterface, i ->
            finish()
        })
        alertDialog.setNeutralButton("Cancel",DialogInterface.OnClickListener { dialogInterface, i ->


        })

        val dialog = alertDialog.create()


        dialog.setTitle("Welcome")
        dialog.setIcon(R.drawable.baseline_person_24)
        dialog.setMessage("Welcome to EduGaon")
        dialog.setCanceledOnTouchOutside(false)
        dialog.show()





    }

    @SuppressLint("MissingInflatedId")
    private fun showCustomDialog(){
        val alertBuilder = AlertDialog.Builder(this)
        val view = LayoutInflater.from(this).inflate(R.layout.customdialog,null,false)
        val userName = view.findViewById<EditText>(R.id.userName)
        val okButton = view.findViewById<Button>(R.id.okButton)

        val dialog = alertBuilder.create()
        dialog.setView(view)
        dialog.setCanceledOnTouchOutside(false)
        dialog.window?.setBackgroundDrawable(this.getDrawable(R.drawable.drawableshape))
        dialog.show()

        okButton.setOnClickListener {
           dialog.dismiss()
        }


    }

}