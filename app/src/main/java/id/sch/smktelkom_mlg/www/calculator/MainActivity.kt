package id.sch.smktelkom_mlg.www.calculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var input1: EditText? = null
    private var input2: EditText? = null
    private var btnwatt: Button? = null
    private var btnmiliwatt: Button? = null
    private var btndbw: Button? = null
    private var btndbm: Button? = null
    private var txtdbm: TextView? = null
    private var txtdbw: TextView? = null
    private var txtmw: TextView? = null
    private var txtw: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initUI()
        initEvent()

    }

    private fun initUI() {
        input1 = findViewById<View>(R.id.input1) as EditText
        btnwatt = findViewById<View>(R.id.btnwatt) as Button
        btnmiliwatt = findViewById<View>(R.id.btnmiliwatt) as Button
        txtdbm = findViewById<View>(R.id.txtdbm) as TextView
        txtdbw = findViewById<View>(R.id.txtdbw) as TextView
        input2 = findViewById<View>(R.id.input2) as EditText
        btndbw = findViewById<View>(R.id.btndbw) as Button
        btndbm = findViewById<View>(R.id.btndbm) as Button
        txtmw = findViewById<View>(R.id.txtmw) as TextView
        txtw =  findViewById<View>(R.id. txtw) as TextView
    }

    private fun initEvent() {
//        btnwatt!!.setOnClickListener {
//            hitungDbw()
//            hitungDbm()
//            hitungWatt()
//            hitungMiliwatt()
//        }
    }

    }
