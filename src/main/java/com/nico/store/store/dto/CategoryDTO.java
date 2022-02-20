package com.nico.store.store.dto;

public class CategoryDTO {
    private Long Id;
    private String name;

    public CategoryDTO() {
    }

    public void setId(Long id) {
        Id = id;
    }
    public Long getId() {
        return Id;
    }
    public void setNameCategory(String nameCategory) {
        this.name = nameCategory;
    }

    public String getNameCategory() {
        return name;
    }
}
