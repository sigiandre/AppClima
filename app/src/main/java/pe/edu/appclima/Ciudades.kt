package pe.edu.appclima

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Ciudades : AppCompatActivity() {

    val TAG = "pe.edu.appclima.ciudades.CIUDAD"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ciudades)

        val bPeru = findViewById<Button>(R.id.bPeru)
        val bMexico = findViewById<Button>(R.id.bMexico)
        val bChina = findViewById<Button>(R.id.bChina)
        val bAlemania = findViewById<Button>(R.id.bAlemania)

        bPeru.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(TAG, "3691175")
            startActivity(intent)
        })

        bMexico.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(TAG, "3530597")
            startActivity(intent)
        })

        bChina.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(TAG, "1814991")
            startActivity(intent)
        })

        bAlemania.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(TAG, "2921044")
            startActivity(intent)
        })
    }
}