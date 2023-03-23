package com.ajaypds.mapwithmarker
import android.content.Context
import java.io.IOException

fun getJsonData(context: Context, fileName: String): String? {
    val jsonstring: String
    try{
        jsonstring = context.assets.open(fileName).bufferedReader().use{it.readText()}
    } catch (ioException: IOException) {
        ioException.printStackTrace()
        return null
    }
    return jsonstring
}


