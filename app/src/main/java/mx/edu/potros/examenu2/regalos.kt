package mx.edu.potros.examenu2

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.GridView
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView

class regalos : AppCompatActivity() {
    var menu: ArrayList<Detalles> = ArrayList<Detalles>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regalos)

        var menuOption: String? = intent.getStringExtra("menuType")
        agregarDetalles(menuOption)

        var gridView: GridView = findViewById(R.id.gridDetalles) as GridView

        var adaptador : AdaptadorProductos = AdaptadorProductos(this, menu)
        gridView.adapter = adaptador
    }
    fun agregarDetalles(option:String?){
        when(option){
            "Detalles"->{
                menu.add(Detalles(R.drawable.cumplebotanas,
                    "280"))
                menu.add(Detalles(R.drawable.cumplecheve,
                    "320"))
                menu.add(Detalles(R.drawable.cumpleescolar,
                    "330"))
                menu.add(Detalles(R.drawable.cumplepaletas,
                    "190"))
                menu.add(Detalles(R.drawable.cumplesnack,
                    "150"))
                menu.add(Detalles(R.drawable.cumplevinos,
                    "370"))
            }
            "Globos"->{
                menu.add(Detalles(R.drawable.globocumple,
                    "240"))
                menu.add(Detalles(R.drawable.globoamor,
                    "820"))
                menu.add(Detalles(R.drawable.globofestejo,
                    "260"))
                menu.add(Detalles(R.drawable.globos,
                    "240"))
                menu.add(Detalles(R.drawable.globonum,
                    "760"))
                menu.add(Detalles(R.drawable.globoregalo,
                    "450"))
            }
            "Tazas"->{
                menu.add(Detalles(R.drawable.tazaabuela,
                    "120"))
                menu.add(Detalles(R.drawable.tazalove,
                    "120"))
                menu.add(Detalles(R.drawable.tazaquiero,
                    "260"))
                menu.add(Detalles(R.drawable.tazas,
                    "280"))
            }
            "Peluches"->{
                menu.add(Detalles(R.drawable.peluchemario,
                    "320"))
                menu.add(Detalles(R.drawable.pelucheminecraft,
                    "320"))
                menu.add(Detalles(R.drawable.peluchepeppa,
                    "290"))
                menu.add(Detalles(R.drawable.peluches,
                    "$"))
                menu.add(Detalles(R.drawable.peluchesony,
                    "330"))
                menu.add(Detalles(R.drawable.peluchestich,
                    "280"))
            }
            "Regalos"->{
                menu.add(Detalles(R.drawable.regaloazul,
                    "80"))
                menu.add(Detalles(R.drawable.regalobebe,
                    "290"))
                menu.add(Detalles(R.drawable.regalocajas,
                    "140"))
                menu.add(Detalles(R.drawable.regalocolores,
                    "85"))
                menu.add(Detalles(R.drawable.regalos,
                    "$"))
                menu.add(Detalles(R.drawable.regalovarios,
                    "75"))
            }
        }
    }
}
private class AdaptadorProductos: BaseAdapter {
    var producto=ArrayList<Detalles>()
    var contexto: Context?=null

    constructor(contexto: Context, producto: ArrayList<Detalles>){
        this.producto=producto
        this.contexto=contexto
    }

    override fun getCount(): Int {
        return producto.size
    }

    override fun getItem(position: Int): Any {
        return producto[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var prod=producto [position]
        var inflador= LayoutInflater.from(contexto)
        var vista=inflador.inflate(R.layout.activity_detalles_regalos, null)

        var imagen=vista.findViewById(R.id.ivRegaloImagen) as ImageView
        var precio=vista.findViewById(R.id.tvRegaloPrecio) as TextView

        imagen.setImageResource(prod.image)
        precio.setText("$${prod.precio}")
        return vista
    }
}