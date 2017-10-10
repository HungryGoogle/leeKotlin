package deepin.firstdemo

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import java.lang.Integer.parseInt

class MainActivity : Activity(), View.OnClickListener {
    override fun onClick(v: View?) {
        // TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        if (v == null) {
            return;
        }
        when ((v as Button).id) {
            R.id.id_if -> {
                mTextView.setText("max(7,8) = " + max(7, 8).toString())
            }
            R.id.id_for -> {
                mTextView.setText(stringFor())
            }
            R.id.id_while -> {
            }
        }

    }

    lateinit var mTextView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        mTextView = findViewById<TextView>(R.id.id_tip)


        findViewById<Button>(R.id.id_print_log).setOnClickListener({
            Log.i("leeTest---->", "Two integers expected")
            var name = "zhang san"
            println(name)
            mTextView.setText("已经打印log到android monitor（alt + 6）");
        })

        findViewById<Button>(R.id.id_int_sum).setOnClickListener({
            val num = sum(1, 1);
            var numStr: String = num.toString()
            mTextView.setText(numStr);
        })

        findViewById<Button>(R.id.id_int_sum2).setOnClickListener({
            val num = sum2(2, 3);
            var numStr: String = num.toString()
            mTextView.setText(numStr);
        })

        findViewById<Button>(R.id.id_string).setOnClickListener({
            val resultStr = getString("lee");
            mTextView.setText(resultStr);
        })

        findViewById<Button>(R.id.id_string).setOnClickListener({
            val resultStr = getString("lee");
            mTextView.setText(resultStr);
        })

        findViewById<Button>(R.id.id_string_to_int).setOnClickListener({
            val resultStr = string2Int("5");
            mTextView.setText(resultStr);
        })

        findViewById<Button>(R.id.id_for).setOnClickListener(this)
        findViewById<Button>(R.id.id_if).setOnClickListener(this)
    }

    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    fun getString(str: String): String {
        return "hello : " + str;
    }

    fun sum2(a: Int, b: Int) = a + b

    fun string2Int(str: String): String {
        var intValue = parseInt(str)
        intValue += 1
        return "result after add 1 = " + intValue;
    }

    fun max(a: Int, b: Int) = if (a > b) a else b

    fun stringFor(): String? {
        var intList = arrayOf(1, 2, 3)
        var strList = arrayOf("a", "b", "c")

        var strList2 = Array(5, { i -> i * i })
        strList2.set(0, 100)

        strList.plus("d")
        strList.plusElement("e")


        for (i in intList.indices) {
            Log.i("leeTest---->", "intList value[$i] = " + intList[i])
        }
        for (i in strList.indices) {
            Log.i("leeTest---->", "intList value[$i] = " + strList[i])
        }

        val empty = emptyArray<Int>()
        empty.plusElement(1)


        var stationsnew = mutableListOf("重庆", "上海", "北京", "上海")
        var stationsnew1 = arrayOf("商丘", "长安")

        // 在末尾增加:add()方法
        // 添加另一个数组addAll方法
        stationsnew.add("广州")
        stationsnew.addAll(stationsnew1)
        for (s in stationsnew) {
            Log.i("leeTest---->", "intList value[$s]")
        }

        Log.i("leeTest---->", "after remove first element.")
        // 移除元素remove，移出指定位置removeAt
        stationsnew.removeAt(0)
        for (i in stationsnew.indices) {
            Log.i("leeTest---->", "intList value[$i] = " + stationsnew[i])
        }

        Log.i("leeTest---->", "removeAll in stationsnew1")
        stationsnew.removeAll(stationsnew1)
        Log.i("leeTest---->", "removeAll size = " + stationsnew.size)

        stationsnew.removeAll(stationsnew)
        Log.i("leeTest---->", "removeAll size = " + stationsnew.size)

        return null
    }
    
}
