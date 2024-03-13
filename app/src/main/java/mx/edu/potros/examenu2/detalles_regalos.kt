package mx.edu.potros.examenu2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class detalles_regalos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalles_regalos)

        val ivDetalles: ImageView = findViewById(R.id.ivRegaloImagen)
        val tvPrecio: TextView = findViewById(R.id.tvRegaloPrecio)

        val bundle=intent.extras
        if(bundle != null){
            ivDetalles.setImageResource(bundle.getInt("Imagen"))
            tvPrecio.setText(bundle.getString("Precio"))
        }
    }
}