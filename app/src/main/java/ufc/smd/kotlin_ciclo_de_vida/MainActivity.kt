package ufc.smd.kotlin_ciclo_de_vida


import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton


class MainActivity : AppCompatActivity() {
    var i:Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tv = findViewById<TextView>(R.id.tvValor)
        if (savedInstanceState != null) {
            i=savedInstanceState.getInt("valor")
           tv.text="Valor = "+ i
        }
        val aButton:FloatingActionButton = findViewById<View>(R.id.acBT) as FloatingActionButton
        aButton.setOnClickListener(View.OnClickListener {
            //código do gerenciamento
            i=i+1
            tv.text="Valor = "+ i
        })

    }

    override fun onResume(){
        super.onResume()
        Log.d("PDM22","No onResume")
    }
    override fun onStart(){
        super.onStart()
        Log.d("PDM22","No onResume")
    }
    override fun onPause(){
        super.onPause()
        Log.d("PDM22","No onResume")
    }
    override fun onStop(){
        super.onStop()
        Log.d("PDM22","No onResume")
    }
    override fun onDestroy(){
        super.onDestroy()
        Log.d("PDM22","No onResume")
    }
    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt("valor",this.i)
        super.onSaveInstanceState(outState)
    }

}