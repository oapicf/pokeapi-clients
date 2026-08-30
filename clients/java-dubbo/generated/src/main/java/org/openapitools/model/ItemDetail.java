package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.model.ItemCategorySummary;
import org.openapitools.model.ItemDetailBabyTriggerFor;
import org.openapitools.model.ItemDetailHeldByPokemonInner;
import org.openapitools.model.ItemDetailMachinesInner;
import org.openapitools.model.ItemDetailSprites;
import org.openapitools.model.ItemEffectText;
import org.openapitools.model.ItemFlavorText;
import org.openapitools.model.ItemFlingEffectSummary;
import org.openapitools.model.ItemGameIndex;
import org.openapitools.model.ItemName;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ItemDetail implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private Integer id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("cost")
  private Integer cost;

  @JsonProperty("fling_power")
  private Integer flingPower;

  @JsonProperty("fling_effect")
  private ItemFlingEffectSummary flingEffect;

  @JsonProperty("attributes")
  private List<AbilityDetailPokemonInnerPokemon> attributes = new ArrayList<>();

  @JsonProperty("category")
  private ItemCategorySummary category;

  @JsonProperty("effect_entries")
  private List<ItemEffectText> effectEntries = new ArrayList<>();

  @JsonProperty("flavor_text_entries")
  private List<ItemFlavorText> flavorTextEntries = new ArrayList<>();

  @JsonProperty("game_indices")
  private List<ItemGameIndex> gameIndices = new ArrayList<>();

  @JsonProperty("names")
  private List<ItemName> names = new ArrayList<>();

  @JsonProperty("held_by_pokemon")
  private List<ItemDetailHeldByPokemonInner> heldByPokemon = new ArrayList<>();

  @JsonProperty("sprites")
  private ItemDetailSprites sprites;

  @JsonProperty("baby_trigger_for")
  private ItemDetailBabyTriggerFor babyTriggerFor;

  @JsonProperty("machines")
  private List<ItemDetailMachinesInner> machines = new ArrayList<>();

  /**
   * 
   * @return id
   */
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * 
   * @return name
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * 
   * @return cost
   */
  public Integer getCost() {
    return cost;
  }

  public void setCost(Integer cost) {
    this.cost = cost;
  }

  /**
   * 
   * @return flingPower
   */
  public Integer getFlingPower() {
    return flingPower;
  }

  public void setFlingPower(Integer flingPower) {
    this.flingPower = flingPower;
  }

  /**
   * 
   * @return flingEffect
   */
  public ItemFlingEffectSummary getFlingEffect() {
    return flingEffect;
  }

  public void setFlingEffect(ItemFlingEffectSummary flingEffect) {
    this.flingEffect = flingEffect;
  }

  /**
   * 
   * @return attributes
   */
  public List<AbilityDetailPokemonInnerPokemon> getAttributes() {
    return attributes;
  }

  public void setAttributes(List<AbilityDetailPokemonInnerPokemon> attributes) {
    this.attributes = attributes;
  }

  /**
   * 
   * @return category
   */
  public ItemCategorySummary getCategory() {
    return category;
  }

  public void setCategory(ItemCategorySummary category) {
    this.category = category;
  }

  /**
   * 
   * @return effectEntries
   */
  public List<ItemEffectText> getEffectEntries() {
    return effectEntries;
  }

  public void setEffectEntries(List<ItemEffectText> effectEntries) {
    this.effectEntries = effectEntries;
  }

  /**
   * 
   * @return flavorTextEntries
   */
  public List<ItemFlavorText> getFlavorTextEntries() {
    return flavorTextEntries;
  }

  public void setFlavorTextEntries(List<ItemFlavorText> flavorTextEntries) {
    this.flavorTextEntries = flavorTextEntries;
  }

  /**
   * 
   * @return gameIndices
   */
  public List<ItemGameIndex> getGameIndices() {
    return gameIndices;
  }

  public void setGameIndices(List<ItemGameIndex> gameIndices) {
    this.gameIndices = gameIndices;
  }

  /**
   * 
   * @return names
   */
  public List<ItemName> getNames() {
    return names;
  }

  public void setNames(List<ItemName> names) {
    this.names = names;
  }

  /**
   * 
   * @return heldByPokemon
   */
  public List<ItemDetailHeldByPokemonInner> getHeldByPokemon() {
    return heldByPokemon;
  }

  public void setHeldByPokemon(List<ItemDetailHeldByPokemonInner> heldByPokemon) {
    this.heldByPokemon = heldByPokemon;
  }

  /**
   * 
   * @return sprites
   */
  public ItemDetailSprites getSprites() {
    return sprites;
  }

  public void setSprites(ItemDetailSprites sprites) {
    this.sprites = sprites;
  }

  /**
   * 
   * @return babyTriggerFor
   */
  public ItemDetailBabyTriggerFor getBabyTriggerFor() {
    return babyTriggerFor;
  }

  public void setBabyTriggerFor(ItemDetailBabyTriggerFor babyTriggerFor) {
    this.babyTriggerFor = babyTriggerFor;
  }

  /**
   * 
   * @return machines
   */
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
    return Objects.equals(this.id, itemDetail.id) &&
        Objects.equals(this.name, itemDetail.name) &&
        Objects.equals(this.cost, itemDetail.cost) &&
        Objects.equals(this.flingPower, itemDetail.flingPower) &&
        Objects.equals(this.flingEffect, itemDetail.flingEffect) &&
        Objects.equals(this.attributes, itemDetail.attributes) &&
        Objects.equals(this.category, itemDetail.category) &&
        Objects.equals(this.effectEntries, itemDetail.effectEntries) &&
        Objects.equals(this.flavorTextEntries, itemDetail.flavorTextEntries) &&
        Objects.equals(this.gameIndices, itemDetail.gameIndices) &&
        Objects.equals(this.names, itemDetail.names) &&
        Objects.equals(this.heldByPokemon, itemDetail.heldByPokemon) &&
        Objects.equals(this.sprites, itemDetail.sprites) &&
        Objects.equals(this.babyTriggerFor, itemDetail.babyTriggerFor) &&
        Objects.equals(this.machines, itemDetail.machines);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
