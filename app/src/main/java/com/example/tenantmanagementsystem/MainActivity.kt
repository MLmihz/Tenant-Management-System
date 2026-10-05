package com.example.tenantmanagementsystem

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tenantmanagementsystem.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val tenant = Tenant(
            tenantId = "T001",
            name = "Bill Ochieng",
            phoneNumber = "0712345678",
            monthlyRent = 20000.0,
            amountPaid = 15000.0
        )
        binding.tenantNameEditText.setText(tenant.name)
        binding.phoneEditText.setText(tenant.phoneNumber)
        binding.rentEditText.setText(tenant.amountPaid.toString())

        binding.saveButton.setOnClickListener {

            val name = binding.tenantNameEditText.text.toString()
            val phone = binding.phoneEditText.text.toString()
            val rent = binding.rentEditText.text.toString()

            val tenant = Tenant(
                tenantId = "T001",
                name = name,
                phoneNumber = phone,
                monthlyRent = 20000.0,
                amountPaid = rent.toDoubleOrNull() ?: 0.0
            )
            binding.tenant = tenant
        }
    }
}