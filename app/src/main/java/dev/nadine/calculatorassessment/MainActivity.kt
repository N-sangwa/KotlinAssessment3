package dev.nadine.calculatorassessment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {

    lateinit var etFirstNUmber:EditText
    lateinit var etSecondNUmber:EditText
    lateinit var btnAdd:Button
    lateinit var btnSubtract:Button
    lateinit var btnmodulus:Button
    lateinit var btnDivide:Button
    lateinit var tvresult:TextView

            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activivity_)
                etFirstNUmber=findViewById(R.id.etFirstNumber)
                =findViewById(R.id.etSecondNumber)
                etnum1=findViewById(R.id.etnum1)
                etnum2=findViewById(R.id.etnum2)
                btnmin=findViewById(R.id.btnmin)
                btnmod=findViewById(R.id.btnmod)
                btnmult=findViewById(R.id.btnmult)
                btnsum=findViewById(R.id.btnsum)
                tvresult=findViewById(R.id.tvresult)
                btnsum.setOnClickListener {
                    var inputs = obtainInput()
                    Add(inputs!!.number1, inputs!!.number2)
                }
                btnmult.setOnClickListener {
                    var inputs = obtainInput()
                    max(inputs!!.number1, inputs!!.number2)
                }
                btnmin.setOnClickListener {
                    var inputs = obtainInput()
                    sub(inputs!!.number1, inputs!!.number2)

                }
                btnmod.setOnClickListener {
                    var inputs = obtainInput()
                    modulus(inputs!!.number1,inputs!!.number2)


                }

            }
            data class MyInputs(var number1: Double, var number2: Double)

            fun obtainInput(): MyInputs?{
                var num1 = etnum1.text.toString()
                var num2 = etnum2.text.toString()
                if (num1.isBlank()){
                    etnum1.error = "Number required"
                    return null
                }
                if (num1.isBlank()){
                    etnum2.error = "Number required"
                    return null
                }
                return MyInputs(num1.toDouble(), num2.toDouble())
            }
            fun Add(num1:Double, num2:Double){
                var total = num1+num2
                tvresult.text= total.toString()
            }
            fun sub(num1:Double, num2:Double) {
                var total = num1 - num2
                tvresult.text = total.toString()

            }
            fun max(num1:Double, num2:Double) {
                var total = num1 * num2
                tvresult.text = total.toString()
            }
            fun modulus(num1:Double, num2:Double) {
                var total = num1 % num2
                tvresult.text = total.toString()
            }





        }



















