package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.vertxweb.server.model.ItemCategorySummary;
import org.openapitools.vertxweb.server.model.ItemDetailBabyTriggerFor;
import org.openapitools.vertxweb.server.model.ItemDetailHeldByPokemonInner;
import org.openapitools.vertxweb.server.model.ItemDetailMachinesInner;
import org.openapitools.vertxweb.server.model.ItemDetailSprites;
import org.openapitools.vertxweb.server.model.ItemEffectText;
import org.openapitools.vertxweb.server.model.ItemFlavorText;
import org.openapitools.vertxweb.server.model.ItemFlingEffectSummary;
import org.openapitools.vertxweb.server.model.ItemGameIndex;
import org.openapitools.vertxweb.server.model.ItemName;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ItemDetail   {
  
  private Integer id;
  private String name;
  private Integer cost;
  private Integer flingPower;
  private ItemFlingEffectSummary flingEffect;
  private List<AbilityDetailPokemonInnerPokemon> attributes = new ArrayList<>();
  private ItemCategorySummary category;
  private List<ItemEffectText> effectEntries = new ArrayList<>();
  private List<ItemFlavorText> flavorTextEntries = new ArrayList<>();
  private List<ItemGameIndex> gameIndices = new ArrayList<>();
  private List<ItemName> names = new ArrayList<>();
  private List<ItemDetailHeldByPokemonInner> heldByPokemon = new ArrayList<>();
  private ItemDetailSprites sprites;
  private ItemDetailBabyTriggerFor babyTriggerFor;
  private List<ItemDetailMachinesInner> machines = new ArrayList<>();

  public ItemDetail () {

  }

  public ItemDetail (Integer id, String name, Integer cost, Integer flingPower, ItemFlingEffectSummary flingEffect, List<AbilityDetailPokemonInnerPokemon> attributes, ItemCategorySummary category, List<ItemEffectText> effectEntries, List<ItemFlavorText> flavorTextEntries, List<ItemGameIndex> gameIndices, List<ItemName> names, List<ItemDetailHeldByPokemonInner> heldByPokemon, ItemDetailSprites sprites, ItemDetailBabyTriggerFor babyTriggerFor, List<ItemDetailMachinesInner> machines) {
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

    
  @JsonProperty("cost")
  public Integer getCost() {
    return cost;
  }
  public void setCost(Integer cost) {
    this.cost = cost;
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
  public List<AbilityDetailPokemonInnerPokemon> getAttributes() {
    return attributes;
  }
  public void setAttributes(List<AbilityDetailPokemonInnerPokemon> attributes) {
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

    
  @JsonProperty("names")
  public List<ItemName> getNames() {
    return names;
  }
  public void setNames(List<ItemName> names) {
    this.names = names;
  }

    
  @JsonProperty("held_by_pokemon")
  public List<ItemDetailHeldByPokemonInner> getHeldByPokemon() {
    return heldByPokemon;
  }
  public void setHeldByPokemon(List<ItemDetailHeldByPokemonInner> heldByPokemon) {
    this.heldByPokemon = heldByPokemon;
  }

    
  @JsonProperty("sprites")
  public ItemDetailSprites getSprites() {
    return sprites;
  }
  public void setSprites(ItemDetailSprites sprites) {
    this.sprites = sprites;
  }

    
  @JsonProperty("baby_trigger_for")
  public ItemDetailBabyTriggerFor getBabyTriggerFor() {
    return babyTriggerFor;
  }
  public void setBabyTriggerFor(ItemDetailBabyTriggerFor babyTriggerFor) {
    this.babyTriggerFor = babyTriggerFor;
  }

    
  @JsonProperty("machines")
  public List<ItemDetailMachinesInner> getMachines() {
    return machines;
  }
  public void setMachines(List<ItemDetailMachinesInner> machines) {
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
        Objects.equals(cost, itemDetail.cost) &&
        Objects.equals(flingPower, itemDetail.flingPower) &&
        Objects.equals(flingEffect, itemDetail.flingEffect) &&
        Objects.equals(attributes, itemDetail.attributes) &&
        Objects.equals(category, itemDetail.category) &&
        Objects.equals(effectEntries, itemDetail.effectEntries) &&
        Objects.equals(flavorTextEntries, itemDetail.flavorTextEntries) &&
        Objects.equals(gameIndices, itemDetail.gameIndices) &&
        Objects.equals(names, itemDetail.names) &&
        Objects.equals(heldByPokemon, itemDetail.heldByPokemon) &&
        Objects.equals(sprites, itemDetail.sprites) &&
        Objects.equals(babyTriggerFor, itemDetail.babyTriggerFor) &&
        Objects.equals(machines, itemDetail.machines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, cost, flingPower, flingEffect, attributes, category, effectEntries, flavorTextEntries, gameIndices, names, heldByPokemon, sprites, babyTriggerFor, machines);
  }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
