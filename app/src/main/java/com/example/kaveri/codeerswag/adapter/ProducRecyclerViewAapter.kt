package layout

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.kaveri.codeerswag.R
import com.example.kaveri.codeerswag.model.Product
import kotlinx.android.synthetic.main.activity_product_list.view.*

/**
 * Created by KAVERI on 11/13/2017.
 */

class ProducRecyclerViewAapter(val context:Context, val product:List<Product>): RecyclerView.Adapter<ProducRecyclerViewAapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        var productView = LayoutInflater.from(context).inflate(R.layout.activity_product_list, parent, false)
        return ViewHolder(productView,context)
    }

    override fun getItemCount(): Int {
        return product.size
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {

        holder?.bindView(product.get(position),context)
    }

    inner class ViewHolder(view:View?, context:Context ): RecyclerView.ViewHolder(view){

        val productImage = view?.findViewById<ImageView>(R.id.productImage)
        val productName = view?.findViewById<TextView>(R.id.productName)
        val productPrice = view?.findViewById<TextView>(R.id.productPrice)

        fun bindView(product: Product, context:Context) {
            val resourceId = context.resources.getIdentifier(product.image,"drawable",context.packageName)
            productImage?.setImageResource(resourceId)
            productName?.text = product.title
            productPrice?.text = product.price
        }


    }
}