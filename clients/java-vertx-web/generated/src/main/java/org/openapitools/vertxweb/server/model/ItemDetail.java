package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.EvolutionChainSummary;
import org.openapitools.vertxweb.server.model.ItemAttributeSummary;
import org.openapitools.vertxweb.server.model.ItemCategorySummary;
import org.openapitools.vertxweb.server.model.ItemEffectText;
import org.openapitools.vertxweb.server.model.ItemFlavorText;
import org.openapitools.vertxweb.server.model.ItemFlingEffectSummary;
import org.openapitools.vertxweb.server.model.ItemGameIndex;
import org.openapitools.vertxweb.server.model.ItemMachine;
import org.openapitools.vertxweb.server.model.ItemName;
import org.openapitools.vertxweb.server.model.ItemPrice;
import org.openapitools.vertxweb.server.model.ItemSprites;
import org.openapitools.vertxweb.server.model.PokemonHeldItem;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ItemDetail   {
  
  private Integer id;
  private String name;
  private Integer flingPower;
  private ItemFlingEffectSummary flingEffect;
  private List<ItemAttributeSummary> attributes = new ArrayList<>();
  private ItemCategorySummary category;
  private List<ItemEffectText> effectEntries = new ArrayList<>();
  private List<ItemFlavorText> flavorTextEntries = new ArrayList<>();
  private List<ItemGameIndex> gameIndices = new ArrayList<>();
  private List<ItemPrice> prices = new ArrayList<>();
  private List<ItemName> names = new ArrayList<>();
  private List<PokemonHeldItem> heldByPokemon = new ArrayList<>();
  private ItemSprites sprites;
  private EvolutionChainSummary babyTriggerFor;
  private List<ItemMachine> machines = new ArrayList<>();

  public ItemDetail () {

  }

  public ItemDetail (Integer id, String name, Integer flingPower, ItemFlingEffectSummary flingEffect, List<ItemAttributeSummary> attributes, ItemCategorySummary category, List<ItemEffectText> effectEntries, List<ItemFlavorText> flavorTextEntries, List<ItemGameIndex> gameIndices, List<ItemPrice> prices, List<ItemName> names, List<PokemonHeldItem> heldByPokemon, ItemSprites sprites, EvolutionChainSummary babyTriggerFor, List<ItemMachine> machines) {
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

    
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("fling_power")
  public Integer getFlingPower() {
    return flingPower;
  }
  public void setFlingPower(Integer flingPower) {
    this.flingPower = flingPower;
  }

    
  @JsonProperty("fling_effect")
  public ItemFlingEffectSummary getFlingEffect() {
    return flingEffect;
  }
  public void setFlingEffect(ItemFlingEffectSummary flingEffect) {
    this.flingEffect = flingEffect;
  }

    
  @JsonProperty("attributes")
  public List<ItemAttributeSummary> getAttributes() {
    return attributes;
  }
  public void setAttributes(List<ItemAttributeSummary> attributes) {
    this.attributes = attributes;
  }

    
  @JsonProperty("category")
  public ItemCategorySummary getCategory() {
    return category;
  }
  public void setCategory(ItemCategorySummary category) {
    this.category = category;
  }

    
  @JsonProperty("effect_entries")
  public List<ItemEffectText> getEffectEntries() {
    return effectEntries;
  }
  public void setEffectEntries(List<ItemEffectText> effectEntries) {
    this.effectEntries = effectEntries;
  }

    
  @JsonProperty("flavor_text_entries")
  public List<ItemFlavorText> getFlavorTextEntries() {
    return flavorTextEntries;
  }
  public void setFlavorTextEntries(List<ItemFlavorText> flavorTextEntries) {
    this.flavorTextEntries = flavorTextEntries;
  }

    
  @JsonProperty("game_indices")
  public List<ItemGameIndex> getGameIndices() {
    return gameIndices;
  }
  public void setGameIndices(List<ItemGameIndex> gameIndices) {
    this.gameIndices = gameIndices;
  }

    
  @JsonProperty("prices")
  public List<ItemPrice> getPrices() {
    return prices;
  }
  public void setPrices(List<ItemPrice> prices) {
    this.prices = prices;
  }

    
  @JsonProperty("names")
  public List<ItemName> getNames() {
    return names;
  }
  public void setNames(List<ItemName> names) {
    this.names = names;
  }

    
  @JsonProperty("held_by_pokemon")
  public List<PokemonHeldItem> getHeldByPokemon() {
    return heldByPokemon;
  }
  public void setHeldByPokemon(List<PokemonHeldItem> heldByPokemon) {
    this.heldByPokemon = heldByPokemon;
  }

    
  @JsonProperty("sprites")
  public ItemSprites getSprites() {
    return sprites;
  }
  public void setSprites(ItemSprites sprites) {
    this.sprites = sprites;
  }

    
  @JsonProperty("baby_trigger_for")
  public EvolutionChainSummary getBabyTriggerFor() {
    return babyTriggerFor;
  }
  public void setBabyTriggerFor(EvolutionChainSummary babyTriggerFor) {
    this.babyTriggerFor = babyTriggerFor;
  }

    
  @JsonProperty("machines")
  public List<ItemMachine> getMachines() {
    return machines;
  }
  public void setMachines(List<ItemMachine> machines) {
    this.machines = machines;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemDetail itemDetail = (ItemDetail) o;
    return Objects.equals(id, itemDetail.id) &&
        Objects.equals(name, itemDetail.name) &&
        Objects.equals(flingPower, itemDetail.flingPower) &&
        Objects.equals(flingEffect, itemDetail.flingEffect) &&
        Objects.equals(attributes, itemDetail.attributes) &&
        Objects.equals(category, itemDetail.category) &&
        Objects.equals(effectEntries, itemDetail.effectEntries) &&
        Objects.equals(flavorTextEntries, itemDetail.flavorTextEntries) &&
        Objects.equals(gameIndices, itemDetail.gameIndices) &&
        Objects.equals(prices, itemDetail.prices) &&
        Objects.equals(names, itemDetail.names) &&
        Objects.equals(heldByPokemon, itemDetail.heldByPokemon) &&
        Objects.equals(sprites, itemDetail.sprites) &&
        Objects.equals(babyTriggerFor, itemDetail.babyTriggerFor) &&
        Objects.equals(machines, itemDetail.machines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, flingPower, flingEffect, attributes, category, effectEntries, flavorTextEntries, gameIndices, prices, names, heldByPokemon, sprites, babyTriggerFor, machines);
  }

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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
