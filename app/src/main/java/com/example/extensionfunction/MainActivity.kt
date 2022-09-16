package com.example.extensionfunction

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    var number1 : Int? = null
    var number2 : Int? = null
    var result : Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




    }
    fun mySum(view : View) {

        number1 = editText.text.toString().toIntOrNull()
        number2 = editText2.text.toString().toIntOrNull()

        if (number1 == null || number2 == null ) {

            resultText.text = "Error!"

        } else {
            result = number1!!.sum(number2!!)
            resultText.text = "Result: $result"
        }




    }

    fun mySub(view : View) {

        number1 = editText.text.toString().toIntOrNull()
        number2 = editText2.text.toString().toIntOrNull()

        if (number1 == null || number2 == null ) {

            resultText.text = "Error!"

        } else {
            result = number1!!.sub(number2!!)
            resultText.text = "Result: $result"
        }


    }

    fun myMultiply(view: View) {

        number1 = editText.text.toString().toIntOrNull()
        number2 = editText2.text.toString().toIntOrNull()

        if (number1 == null || number2 == null ) {

            resultText.text = "Error!"

        } else {
            result = number1!!.multy(number2!!)
            resultText.text = "Result: $result"
        }


    }

    fun myDiv(view: View) {

        number1 = editText.text.toString().toIntOrNull()
        number2 = editText2.text.toString().toIntOrNull()

        if (number1 == null || number2 == null ) {

            resultText.text = "Error!"

        } else {
            result = number1!!.div(number2!!)
            resultText.text = "Result: $result"
        }

    }



    fun Int.div(number2: Int) : Int{
        return this/number2
    }
    fun Int.sum(number2: Int) : Int{
        return this+number2
    }
    fun Int.sub(number2: Int) : Int{
        return this-number2
    }

    fun Int.multy(number2: Int) : Int{
        return this*number2
    }
}