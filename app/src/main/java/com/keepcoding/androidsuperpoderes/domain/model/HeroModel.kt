package com.keepcoding.androidsuperpoderes.domain.model

data class HeroModel(
    val id: String,
    val name: String,
    val photoUrl: String,
    val description: String
)

// POJO
/*

public class HeroModel {
    private String name;
    private String _name;

    public String getName() {
        return this._name;
    }

    public String setName(String name) {
        this.name = name;
    }
}

*/