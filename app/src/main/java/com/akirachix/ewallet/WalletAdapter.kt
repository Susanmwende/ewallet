package com.akirachix.ewallet

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class WalletAdapter (var wallet:List<MyWallet>):
RecyclerView.Adapter<WalletViewsHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WalletViewsHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate((R.layout.ewallet_list), parent, false)
        return WalletViewsHolder(itemView)
    }


        override fun onBindViewHolder(holder: WalletViewsHolder, position: Int) {
            val expense = wallet [position]

            holder.amount.text = expense.amount
            holder.date.text = expense.date
        }

        override fun getItemCount(): Int {
            return wallet.size
        }
    }

    class WalletViewsHolder(itemView: View) : ViewHolder(itemView) {
        val amount = itemView.findViewById<TextView>(R.id.etamount)
        val date = itemView.findViewById<TextView>(R.id.etDate)
    }
