package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.EvolutionChainSummary;
import org.openapitools.server.model.ItemAttributeSummary;
import org.openapitools.server.model.ItemCategorySummary;
import org.openapitools.server.model.ItemEffectText;
import org.openapitools.server.model.ItemFlavorText;
import org.openapitools.server.model.ItemFlingEffectSummary;
import org.openapitools.server.model.ItemGameIndex;
import org.openapitools.server.model.ItemMachine;
import org.openapitools.server.model.ItemName;
import org.openapitools.server.model.ItemPrice;
import org.openapitools.server.model.ItemSprites;
import org.openapitools.server.model.PokemonHeldItem;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ItemDetail   {

    private Integer id;
    private String name;
    private Integer flingPower;
    private ItemFlingEffectSummary flingEffect;
    private List<@Valid ItemAttributeSummary> attributes = new ArrayList<>();
    private ItemCategorySummary category;
    private List<@Valid ItemEffectText> effectEntries = new ArrayList<>();
    private List<@Valid ItemFlavorText> flavorTextEntries = new ArrayList<>();
    private List<@Valid ItemGameIndex> gameIndices = new ArrayList<>();
    private List<@Valid ItemPrice> prices = new ArrayList<>();
    private List<@Valid ItemName> names = new ArrayList<>();
    private List<@Valid PokemonHeldItem> heldByPokemon = new ArrayList<>();
    private ItemSprites sprites;
    private EvolutionChainSummary babyTriggerFor;
    private List<@Valid ItemMachine> machines = new ArrayList<>();

    /**
     * Default constructor.
     */
    public ItemDetail() {
    // JSON-B / Jackson
    }

    /**
     * Create ItemDetail.
     *
     * @param id The identifier for this resource.
     * @param name The name for this resource.
     * @param flingPower The power of the move Fling when used with this item.
     * @param flingEffect The effect of the move Fling when used with this item.
     * @param attributes A list of attributes this item has.
     * @param category The category of items this item falls into.
     * @param effectEntries The effect of this ability listed in different languages.
     * @param flavorTextEntries The flavor text of this ability listed in different languages.
     * @param gameIndices A list of game indices relevent to this item by generation.
     * @param prices Purchase and sell prices by currency and version group. Prices may be null when the item cannot be bought or sold.
     * @param names The name of this item listed in different languages.
     * @param heldByPokemon A list of Pokémon that might be found in the wild holding this item.
     * @param sprites A set of sprites used to depict this item in the game.
     * @param babyTriggerFor An evolution chain this item requires to produce a bay during mating.
     * @param machines A list of the machines related to this item.
     */
    public ItemDetail(
        Integer id, 
        String name, 
        Integer flingPower, 
        ItemFlingEffectSummary flingEffect, 
        List<@Valid ItemAttributeSummary> attributes, 
        ItemCategorySummary category, 
        List<@Valid ItemEffectText> effectEntries, 
        List<@Valid ItemFlavorText> flavorTextEntries, 
        List<@Valid ItemGameIndex> gameIndices, 
        List<@Valid ItemPrice> prices, 
        List<@Valid ItemName> names, 
        List<@Valid PokemonHeldItem> heldByPokemon, 
        ItemSprites sprites, 
        EvolutionChainSummary babyTriggerFor, 
        List<@Valid ItemMachine> machines
    ) {
        this.id = id;
        this.name = name;
        this.flingPower = flingPower;
        this.flingEffect = flingEffect;
        this.attributes = attributes;
        this.category = category;
        this.effectEntries = effectEntries;
        this.flavorTextEntries = flavorTextEntries;
        this.gameIndices = gameIndices;
        this.prices = prices;
        this.names = names;
        this.heldByPokemon = heldByPokemon;
        this.sprites = sprites;
        this.babyTriggerFor = babyTriggerFor;
        this.machines = machines;
    }



    /**
     * The identifier for this resource.
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * The name for this resource.
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The power of the move Fling when used with this item.
     * minimum: -2147483648
     * maximum: 2147483647
     * @return flingPower
     */
    public Integer getFlingPower() {
        return flingPower;
    }

    public void setFlingPower(Integer flingPower) {
        this.flingPower = flingPower;
    }

    /**
     * The effect of the move Fling when used with this item.
     * @return flingEffect
     */
    public ItemFlingEffectSummary getFlingEffect() {
        return flingEffect;
    }

    public void setFlingEffect(ItemFlingEffectSummary flingEffect) {
        this.flingEffect = flingEffect;
    }

    /**
     * A list of attributes this item has.
     * @return attributes
     */
    public List<@Valid ItemAttributeSummary> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<@Valid ItemAttributeSummary> attributes) {
        this.attributes = attributes;
    }

    /**
     * The category of items this item falls into.
     * @return category
     */
    public ItemCategorySummary getCategory() {
        return category;
    }

    public void setCategory(ItemCategorySummary category) {
        this.category = category;
    }

    /**
     * The effect of this ability listed in different languages.
     * @return effectEntries
     */
    public List<@Valid ItemEffectText> getEffectEntries() {
        return effectEntries;
    }

    public void setEffectEntries(List<@Valid ItemEffectText> effectEntries) {
        this.effectEntries = effectEntries;
    }

    /**
     * The flavor text of this ability listed in different languages.
     * @return flavorTextEntries
     */
    public List<@Valid ItemFlavorText> getFlavorTextEntries() {
        return flavorTextEntries;
    }

    public void setFlavorTextEntries(List<@Valid ItemFlavorText> flavorTextEntries) {
        this.flavorTextEntries = flavorTextEntries;
    }

    /**
     * A list of game indices relevent to this item by generation.
     * @return gameIndices
     */
    public List<@Valid ItemGameIndex> getGameIndices() {
        return gameIndices;
    }

    public void setGameIndices(List<@Valid ItemGameIndex> gameIndices) {
        this.gameIndices = gameIndices;
    }

    /**
     * Purchase and sell prices by currency and version group. Prices may be null when the item cannot be bought or sold.
     * @return prices
     */
    public List<@Valid ItemPrice> getPrices() {
        return prices;
    }

    public void setPrices(List<@Valid ItemPrice> prices) {
        this.prices = prices;
    }

    /**
     * The name of this item listed in different languages.
     * @return names
     */
    public List<@Valid ItemName> getNames() {
        return names;
    }

    public void setNames(List<@Valid ItemName> names) {
        this.names = names;
    }

    /**
     * A list of Pokémon that might be found in the wild holding this item.
     * @return heldByPokemon
     */
    public List<@Valid PokemonHeldItem> getHeldByPokemon() {
        return heldByPokemon;
    }

    public void setHeldByPokemon(List<@Valid PokemonHeldItem> heldByPokemon) {
        this.heldByPokemon = heldByPokemon;
    }

    /**
     * A set of sprites used to depict this item in the game.
     * @return sprites
     */
    public ItemSprites getSprites() {
        return sprites;
    }

    public void setSprites(ItemSprites sprites) {
        this.sprites = sprites;
    }

    /**
     * An evolution chain this item requires to produce a bay during mating.
     * @return babyTriggerFor
     */
    public EvolutionChainSummary getBabyTriggerFor() {
        return babyTriggerFor;
    }

    public void setBabyTriggerFor(EvolutionChainSummary babyTriggerFor) {
        this.babyTriggerFor = babyTriggerFor;
    }

    /**
     * A list of the machines related to this item.
     * @return machines
     */
    public List<@Valid ItemMachine> getMachines() {
        return machines;
    }

    public void setMachines(List<@Valid ItemMachine> machines) {
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
        sb.append("    flingPower: ").append(toIndentedString(flingPower)).append("\n");
        sb.append("    flingEffect: ").append(toIndentedString(flingEffect)).append("\n");
        sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    effectEntries: ").append(toIndentedString(effectEntries)).append("\n");
        sb.append("    flavorTextEntries: ").append(toIndentedString(flavorTextEntries)).append("\n");
        sb.append("    gameIndices: ").append(toIndentedString(gameIndices)).append("\n");
        sb.append("    prices: ").append(toIndentedString(prices)).append("\n");
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

