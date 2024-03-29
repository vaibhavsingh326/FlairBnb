package com.masai.flairbnbapp.models

data class RoomModel(
    val id: String?,
    val title: String?,
    val description: String?,
    val category: String?,
    val price: Long?,
    val priceForWhat: String?,
    val image_blob_id: String?,
    var location_lat: String?,
    var location_long: String?,
    val host_id: String?,
    val listOfAvailableServices: String?,
    val rating: Int?,
    val rooms: Int?,
    val total_capacity: Int?,
    val total_bathrooms: Int?,
    val beds: Int?,
    val maxMembers: Int?,
    val contactNo: String?,
    val city: String?,
    val state: String?,
    val country: String?,
)