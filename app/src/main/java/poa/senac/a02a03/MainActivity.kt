package poa.senac.a02a03

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import  android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var android = rbAndroid
        var confirmar = btConfirmar

        confirmar.setOnClickListener {
            if (android.isChecked) {
                Toast.makeText(this, "Acertou!", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "Errou!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
