package com.akirachix.ewallet

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.ewallet.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvwallet.layoutManager = LinearLayoutManager(this)
        showcaseExpenses()

    }

    fun showcaseExpenses() {
        val expense1 = MyWallet("Electricity Bill", "KES2000", "2 July 2024")
        val expense2 = MyWallet("Rent", "KES16000", "4 July 2024")
        val expense3 = MyWallet("Dividends", "KES2400", "4 July 2024")
        val expense4 = MyWallet("Internet", "KES2500", "5 July 2024")
        val expense5 = MyWallet("Shopping", "KES3500", "5 July 2024")
        val expense6 = MyWallet("Bus fare", "KES500", "11 July 2024")

        val MyExpenses = listOf(expense1, expense2, expense3, expense4, expense5, expense6)

        val WalletAdapter = WalletAdapter(MyExpenses)
        binding.rvwallet.adapter = WalletAdapter
    }
}

