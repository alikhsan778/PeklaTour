package id.co.egifcb.peklatour.peklatour.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import id.co.egifcb.peklatour.peklatour.R
import id.co.egifcb.peklatour.peklatour.model.DaftartourItem
import kotlinx.android.synthetic.main.layout_list_daftar_tour.view.*

class AdapterDaftarTour(private val context: Context, private val list: List<DaftartourItem>, private val listener: (DaftartourItem) -> Unit)
    : RecyclerView.Adapter<AdapterDaftarTour.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)=
            AdapterDaftarTour.ViewHolder(LayoutInflater.from(context).inflate(R.layout.layout_list_daftar_tour, parent, false))

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(list[position], listener, context)
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bindItem(daftartourItem: DaftartourItem, listener: (DaftartourItem) -> Unit, context: Context) {
            Glide.with(context).load(daftartourItem.image).into(itemView.iv_image)
            itemView.tv_nama_tempat.text = daftartourItem.namaTempat

            itemView.setOnClickListener {
                listener(daftartourItem)
            }
        }
    }
}