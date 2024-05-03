package net.asgeri.atlrv

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import net.asgeri.atlrv.databinding.ItemCardBinding

class NameAdapter() : RecyclerView.Adapter<NameAdapter.NameViewHolder>() {

    private val list = arrayListOf<User>()

    inner class NameViewHolder(val itemCardBinding: ItemCardBinding) :
        RecyclerView.ViewHolder(itemCardBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NameViewHolder {
        val view = ItemCardBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return NameViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: NameViewHolder, position: Int) {
        val data = list[position]
        holder.itemCardBinding.textView.text = data.title
        holder.itemCardBinding.imageView.setImageResource(data.image)
    }

    fun updateList(newList: ArrayList<User>){
        list.clear()
        list.addAll(newList)
        notifyDataSetChanged()
    }

}