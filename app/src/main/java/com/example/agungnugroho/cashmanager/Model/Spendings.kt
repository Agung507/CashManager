package com.example.agungnugroho.cashmanager.Model

class Spendings {
    var id: String? = null
    var category: String? = null
    var value: String? = null
    var description: String? = null

    constructor(){

    }

    constructor(id: String?, category: String?, value: String?, descrition: String?) {
        this.id = id
        this.category = category
        this.value = value
        this.description = description
    }
}