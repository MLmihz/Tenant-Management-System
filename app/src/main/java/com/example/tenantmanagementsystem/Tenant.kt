package com.example.tenantmanagementsystem

data class Tenant(
    val tenantId: String,
    val name: String,
    val phoneNumber: String,
    val monthlyRent: Double,
    val amountPaid: Double
){
    fun summary(): String {
        return "Tenant: $name\nPhone: $phoneNumber\nRent: KSh $amountPaid"
    }
}