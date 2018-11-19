package com.jessicasouza.pontotel.response

import com.jessicasouza.pontotel.entities.JData

interface IResponse {

    fun success(appointmentList: JData)
}