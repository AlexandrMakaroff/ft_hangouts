package com.example.hangouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.hangouts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    private lateinit var buttonAdd: Button
    private lateinit var buttonRead: Button
    private lateinit var buttonEdit: Button
    private lateinit var buttonDelete: Button

    private lateinit var editTextName: EditText
    private lateinit var editTextPhoneNumber: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        editTextName = binding.editTextName
        editTextPhoneNumber = binding.editTextPhoneNumber

        buttonAdd = binding.buttonAdd
        buttonRead = binding.buttonRead
        buttonEdit = binding.buttonEdit
        buttonDelete = binding.buttonDelete

        buttonAdd.setOnClickListener(this)
        buttonRead.setOnClickListener(this)
        buttonEdit.setOnClickListener(this)
        buttonDelete.setOnClickListener(this)

        val dbHelper = DBHelper(this)
    }

    private fun firstBut(view: View)
    {
        // выводим сообщение
        Toast.makeText(this, "Первая Кнопка", Toast.LENGTH_SHORT).show();
    }

    private fun secondBut(view: View)
    {
        // выводим сообщение
        Toast.makeText(this, "Вторая Кнопка", Toast.LENGTH_SHORT).show();
    }

    private fun thirdBut(view: View)
    {
        // выводим сообщение
        Toast.makeText(this, "Третья Кнопка", Toast.LENGTH_SHORT).show();
    }

    override fun onClick(v: View?) {
        val name = editTextName.text.toString()
        val phone = editTextPhoneNumber.text.toString()

        if (v != null) {
            when (v.id) {
                buttonAdd.id -> firstBut(v)
                buttonRead.id -> secondBut(v)
                buttonEdit.id -> thirdBut(v)
                buttonDelete.id -> thirdBut(v)
            }
        }
    }
}