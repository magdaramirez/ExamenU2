package mx.edu.potros.examenu2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class principal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)

        var btnRegalos: Button = findViewById(R.id.btnRegalos) as Button
        var btnDetalles: Button = findViewById(R.id.btnDetalles) as Button
        var btnTazas: Button = findViewById(R.id.btnTazas) as Button
        var btnGlobos: Button = findViewById(R.id.btnGlobos) as Button
        var btnPeluches: Button = findViewById(R.id.btnPeluches) as Button

        btnRegalos.setOnClickListener {
            var intent : Intent = Intent(this,regalos::class.java)
            intent.putExtra("menuType", "Antojitos")
            startActivity(intent)
        }
        btnDetalles.setOnClickListener {
            var intent : Intent = Intent(this,regalos::class.java)
            intent.putExtra("menuType", "Antojitos")
            startActivity(intent)
        }
        btnTazas.setOnClickListener {
            var intent : Intent = Intent(this,regalos::class.java)
            intent.putExtra("menuType", "Antojitos")
            startActivity(intent)
        }
        btnGlobos.setOnClickListener {
            var intent : Intent = Intent(this,regalos::class.java)
            intent.putExtra("menuType", "Antojitos")
            startActivity(intent)
        }
        btnPeluches.setOnClickListener {
            var intent : Intent = Intent(this,regalos::class.java)
            intent.putExtra("menuType", "Antojitos")
            startActivity(intent)
        }

    }
}