package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.server.model.ItemCategorySummary;
import org.openapitools.server.model.ItemDetailBabyTriggerFor;
import org.openapitools.server.model.ItemDetailHeldByPokemonInner;
import org.openapitools.server.model.ItemDetailMachinesInner;
import org.openapitools.server.model.ItemDetailSprites;
import org.openapitools.server.model.ItemEffectText;
import org.openapitools.server.model.ItemFlavorText;
import org.openapitools.server.model.ItemFlingEffectSummary;
import org.openapitools.server.model.ItemGameIndex;
import org.openapitools.server.model.ItemName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ItemDetail   {

    private Integer id;
    private String name;
    private Integer cost;
    private Integer flingPower;
    private ItemFlingEffectSummary flingEffect;
    private List<@Valid AbilityDetailPokemonInnerPokemon> attributes = new ArrayList<>();
    private ItemCategorySummary category;
    private List<@Valid ItemEffectText> effectEntries = new ArrayList<>();
    private List<@Valid ItemFlavorText> flavorTextEntries = new ArrayList<>();
    private List<@Valid ItemGameIndex> gameIndices = new ArrayList<>();
    private List<@Valid ItemName> names = new ArrayList<>();
    private List<@Valid ItemDetailHeldByPokemonInner> heldByPokemon = new ArrayList<>();
    private ItemDetailSprites sprites;
    private ItemDetailBabyTriggerFor babyTriggerFor;
    private List<@Valid ItemDetailMachinesInner> machines = new ArrayList<>();

    /**
     * Default constructor.
     */
    public ItemDetail() {
    // JSON-B / Jackson
    }

    /**
     * Create ItemDetail.
     *
     * @param id id
     * @param name name
     * @param cost cost
     * @param flingPower flingPower
     * @param flingEffect flingEffect
     * @param attributes attributes
     * @param category category
     * @param effectEntries effectEntries
     * @param flavorTextEntries flavorTextEntries
     * @param gameIndices gameIndices
     * @param names names
     * @param heldByPokemon heldByPokemon
     * @param sprites sprites
     * @param babyTriggerFor babyTriggerFor
     * @param machines machines
     */
    public ItemDetail(
        Integer id, 
        String name, 
        Integer cost, 
        Integer flingPower, 
        ItemFlingEffectSummary flingEffect, 
        List<@Valid AbilityDetailPokemonInnerPokemon> attributes, 
        ItemCategorySummary category, 
        List<@Valid ItemEffectText> effectEntries, 
        List<@Valid ItemFlavorText> flavorTextEntries, 
        List<@Valid ItemGameIndex> gameIndices, 
        List<@Valid ItemName> names, 
        List<@Valid ItemDetailHeldByPokemonInner> heldByPokemon, 
        ItemDetailSprites sprites, 
        ItemDetailBabyTriggerFor babyTriggerFor, 
        List<@Valid ItemDetailMachinesInner> machines
    ) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.flingPower = flingPower;
        this.flingEffect = flingEffect;
        this.attributes = attributes;
        this.category = category;
        this.effectEntries = effectEntries;
        this.flavorTextEntries = flavorTextEntries;
        this.gameIndices = gameIndices;
        this.names = names;
        this.heldByPokemon = heldByPokemon;
        this.sprites = sprites;
        this.babyTriggerFor = babyTriggerFor;
        this.machines = machines;
    }



    /**
     * Get id
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Get name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get cost
     * @return cost
     */
    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    /**
     * Get flingPower
     * @return flingPower
     */
    public Integer getFlingPower() {
        return flingPower;
    }

    public void setFlingPower(Integer flingPower) {
        this.flingPower = flingPower;
    }

    /**
     * Get flingEffect
     * @return flingEffect
     */
    public ItemFlingEffectSummary getFlingEffect() {
        return flingEffect;
    }

    public void setFlingEffect(ItemFlingEffectSummary flingEffect) {
        this.flingEffect = flingEffect;
    }

    /**
     * Get attributes
     * @return attributes
     */
    public List<@Valid AbilityDetailPokemonInnerPokemon> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<@Valid AbilityDetailPokemonInnerPokemon> attributes) {
        this.attributes = attributes;
    }

    /**
     * Get category
     * @return category
     */
    public ItemCategorySummary getCategory() {
        return category;
    }

    public void setCategory(ItemCategorySummary category) {
        this.category = category;
    }

    /**
     * Get effectEntries
     * @return effectEntries
     */
    public List<@Valid ItemEffectText> getEffectEntries() {
        return effectEntries;
    }

    public void setEffectEntries(List<@Valid ItemEffectText> effectEntries) {
        this.effectEntries = effectEntries;
    }

    /**
     * Get flavorTextEntries
     * @return flavorTextEntries
     */
    public List<@Valid ItemFlavorText> getFlavorTextEntries() {
        return flavorTextEntries;
    }

    public void setFlavorTextEntries(List<@Valid ItemFlavorText> flavorTextEntries) {
        this.flavorTextEntries = flavorTextEntries;
    }

    /**
     * Get gameIndices
     * @return gameIndices
     */
    public List<@Valid ItemGameIndex> getGameIndices() {
        return gameIndices;
    }

    public void setGameIndices(List<@Valid ItemGameIndex> gameIndices) {
        this.gameIndices = gameIndices;
    }

    /**
     * Get names
     * @return names
     */
    public List<@Valid ItemName> getNames() {
        return names;
    }

    public void setNames(List<@Valid ItemName> names) {
        this.names = names;
    }

    /**
     * Get heldByPokemon
     * @return heldByPokemon
     */
    public List<@Valid ItemDetailHeldByPokemonInner> getHeldByPokemon() {
        return heldByPokemon;
    }

    public void setHeldByPokemon(List<@Valid ItemDetailHeldByPokemonInner> heldByPokemon) {
        this.heldByPokemon = heldByPokemon;
    }

    /**
     * Get sprites
     * @return sprites
     */
    public ItemDetailSprites getSprites() {
        return sprites;
    }

    public void setSprites(ItemDetailSprites sprites) {
        this.sprites = sprites;
    }

    /**
     * Get babyTriggerFor
     * @return babyTriggerFor
     */
    public ItemDetailBabyTriggerFor getBabyTriggerFor() {
        return babyTriggerFor;
    }

    public void setBabyTriggerFor(ItemDetailBabyTriggerFor babyTriggerFor) {
        this.babyTriggerFor = babyTriggerFor;
    }

    /**
     * Get machines
     * @return machines
     */
    public List<@Valid ItemDetailMachinesInner> getMachines() {
        return machines;
    }

    public void setMachines(List<@Valid ItemDetailMachinesInner> machines) {
        this.machines = machines;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ItemDetail {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
        sb.append("    flingPower: ").append(toIndentedString(flingPower)).append("\n");
        sb.append("    flingEffect: ").append(toIndentedString(flingEffect)).append("\n");
        sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    effectEntries: ").append(toIndentedString(effectEntries)).append("\n");
        sb.append("    flavorTextEntries: ").append(toIndentedString(flavorTextEntries)).append("\n");
        sb.append("    gameIndices: ").append(toIndentedString(gameIndices)).append("\n");
        sb.append("    names: ").append(toIndentedString(names)).append("\n");
        sb.append("    heldByPokemon: ").append(toIndentedString(heldByPokemon)).append("\n");
        sb.append("    sprites: ").append(toIndentedString(sprites)).append("\n");
        sb.append("    babyTriggerFor: ").append(toIndentedString(babyTriggerFor)).append("\n");
        sb.append("    machines: ").append(toIndentedString(machines)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

