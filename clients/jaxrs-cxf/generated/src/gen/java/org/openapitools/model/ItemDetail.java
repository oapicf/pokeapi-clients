package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ItemDetail  {
  
  @ApiModelProperty(required = true, value = "")

  private Integer id;

  @ApiModelProperty(required = true, value = "")

  private String name;

  @ApiModelProperty(value = "")

  private Integer cost;

  @ApiModelProperty(value = "")

  private Integer flingPower;

  @ApiModelProperty(required = true, value = "")

  @Valid

  private ItemFlingEffectSummary flingEffect;

  @ApiModelProperty(required = true, value = "")

  @Valid

  private List<@Valid AbilityDetailPokemonInnerPokemon> attributes = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  @Valid

  private ItemCategorySummary category;

  @ApiModelProperty(required = true, value = "")

  @Valid

  private List<@Valid ItemEffectText> effectEntries = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  @Valid

  private List<@Valid ItemFlavorText> flavorTextEntries = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  @Valid

  private List<@Valid ItemGameIndex> gameIndices = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  @Valid

  private List<@Valid ItemName> names = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  @Valid

  private List<@Valid ItemDetailHeldByPokemonInner> heldByPokemon = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  @Valid

  private ItemDetailSprites sprites;

  @ApiModelProperty(required = true, value = "")

  @Valid

  private ItemDetailBabyTriggerFor babyTriggerFor;

  @ApiModelProperty(required = true, value = "")

  @Valid

  private List<@Valid ItemDetailMachinesInner> machines = new ArrayList<>();
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  @NotNull
  public Integer getId() {
    return id;
  }


 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  @NotNull
 @Size(max=100)  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ItemDetail name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get cost
   * @return cost
  **/
  @JsonProperty("cost")
  public Integer getCost() {
    return cost;
  }

  public void setCost(Integer cost) {
    this.cost = cost;
  }

  public ItemDetail cost(Integer cost) {
    this.cost = cost;
    return this;
  }

 /**
   * Get flingPower
   * @return flingPower
  **/
  @JsonProperty("fling_power")
  public Integer getFlingPower() {
    return flingPower;
  }

  public void setFlingPower(Integer flingPower) {
    this.flingPower = flingPower;
  }

  public ItemDetail flingPower(Integer flingPower) {
    this.flingPower = flingPower;
    return this;
  }

 /**
   * Get flingEffect
   * @return flingEffect
  **/
  @JsonProperty("fling_effect")
  @NotNull
  public ItemFlingEffectSummary getFlingEffect() {
    return flingEffect;
  }

  public void setFlingEffect(ItemFlingEffectSummary flingEffect) {
    this.flingEffect = flingEffect;
  }

  public ItemDetail flingEffect(ItemFlingEffectSummary flingEffect) {
    this.flingEffect = flingEffect;
    return this;
  }

 /**
   * Get attributes
   * @return attributes
  **/
  @JsonProperty("attributes")
  @NotNull
  public List<@Valid AbilityDetailPokemonInnerPokemon> getAttributes() {
    return attributes;
  }

  public void setAttributes(List<@Valid AbilityDetailPokemonInnerPokemon> attributes) {
    this.attributes = attributes;
  }

  public ItemDetail attributes(List<@Valid AbilityDetailPokemonInnerPokemon> attributes) {
    this.attributes = attributes;
    return this;
  }

  public ItemDetail addAttributesItem(AbilityDetailPokemonInnerPokemon attributesItem) {
    this.attributes.add(attributesItem);
    return this;
  }

 /**
   * Get category
   * @return category
  **/
  @JsonProperty("category")
  @NotNull
  public ItemCategorySummary getCategory() {
    return category;
  }

  public void setCategory(ItemCategorySummary category) {
    this.category = category;
  }

  public ItemDetail category(ItemCategorySummary category) {
    this.category = category;
    return this;
  }

 /**
   * Get effectEntries
   * @return effectEntries
  **/
  @JsonProperty("effect_entries")
  @NotNull
  public List<@Valid ItemEffectText> getEffectEntries() {
    return effectEntries;
  }

  public void setEffectEntries(List<@Valid ItemEffectText> effectEntries) {
    this.effectEntries = effectEntries;
  }

  public ItemDetail effectEntries(List<@Valid ItemEffectText> effectEntries) {
    this.effectEntries = effectEntries;
    return this;
  }

  public ItemDetail addEffectEntriesItem(ItemEffectText effectEntriesItem) {
    this.effectEntries.add(effectEntriesItem);
    return this;
  }

 /**
   * Get flavorTextEntries
   * @return flavorTextEntries
  **/
  @JsonProperty("flavor_text_entries")
  @NotNull
  public List<@Valid ItemFlavorText> getFlavorTextEntries() {
    return flavorTextEntries;
  }

  public void setFlavorTextEntries(List<@Valid ItemFlavorText> flavorTextEntries) {
    this.flavorTextEntries = flavorTextEntries;
  }

  public ItemDetail flavorTextEntries(List<@Valid ItemFlavorText> flavorTextEntries) {
    this.flavorTextEntries = flavorTextEntries;
    return this;
  }

  public ItemDetail addFlavorTextEntriesItem(ItemFlavorText flavorTextEntriesItem) {
    this.flavorTextEntries.add(flavorTextEntriesItem);
    return this;
  }

 /**
   * Get gameIndices
   * @return gameIndices
  **/
  @JsonProperty("game_indices")
  @NotNull
  public List<@Valid ItemGameIndex> getGameIndices() {
    return gameIndices;
  }

  public void setGameIndices(List<@Valid ItemGameIndex> gameIndices) {
    this.gameIndices = gameIndices;
  }

  public ItemDetail gameIndices(List<@Valid ItemGameIndex> gameIndices) {
    this.gameIndices = gameIndices;
    return this;
  }

  public ItemDetail addGameIndicesItem(ItemGameIndex gameIndicesItem) {
    this.gameIndices.add(gameIndicesItem);
    return this;
  }

 /**
   * Get names
   * @return names
  **/
  @JsonProperty("names")
  @NotNull
  public List<@Valid ItemName> getNames() {
    return names;
  }

  public void setNames(List<@Valid ItemName> names) {
    this.names = names;
  }

  public ItemDetail names(List<@Valid ItemName> names) {
    this.names = names;
    return this;
  }

  public ItemDetail addNamesItem(ItemName namesItem) {
    this.names.add(namesItem);
    return this;
  }

 /**
   * Get heldByPokemon
   * @return heldByPokemon
  **/
  @JsonProperty("held_by_pokemon")
  @NotNull
  public List<@Valid ItemDetailHeldByPokemonInner> getHeldByPokemon() {
    return heldByPokemon;
  }

  public void setHeldByPokemon(List<@Valid ItemDetailHeldByPokemonInner> heldByPokemon) {
    this.heldByPokemon = heldByPokemon;
  }

  public ItemDetail heldByPokemon(List<@Valid ItemDetailHeldByPokemonInner> heldByPokemon) {
    this.heldByPokemon = heldByPokemon;
    return this;
  }

  public ItemDetail addHeldByPokemonItem(ItemDetailHeldByPokemonInner heldByPokemonItem) {
    this.heldByPokemon.add(heldByPokemonItem);
    return this;
  }

 /**
   * Get sprites
   * @return sprites
  **/
  @JsonProperty("sprites")
  @NotNull
  public ItemDetailSprites getSprites() {
    return sprites;
  }

  public void setSprites(ItemDetailSprites sprites) {
    this.sprites = sprites;
  }

  public ItemDetail sprites(ItemDetailSprites sprites) {
    this.sprites = sprites;
    return this;
  }

 /**
   * Get babyTriggerFor
   * @return babyTriggerFor
  **/
  @JsonProperty("baby_trigger_for")
  @NotNull
  public ItemDetailBabyTriggerFor getBabyTriggerFor() {
    return babyTriggerFor;
  }

  public void setBabyTriggerFor(ItemDetailBabyTriggerFor babyTriggerFor) {
    this.babyTriggerFor = babyTriggerFor;
  }

  public ItemDetail babyTriggerFor(ItemDetailBabyTriggerFor babyTriggerFor) {
    this.babyTriggerFor = babyTriggerFor;
    return this;
  }

 /**
   * Get machines
   * @return machines
  **/
  @JsonProperty("machines")
  @NotNull
  public List<@Valid ItemDetailMachinesInner> getMachines() {
    return machines;
  }

  public void setMachines(List<@Valid ItemDetailMachinesInner> machines) {
    this.machines = machines;
  }

  public ItemDetail machines(List<@Valid ItemDetailMachinesInner> machines) {
    this.machines = machines;
    return this;
  }

  public ItemDetail addMachinesItem(ItemDetailMachinesInner machinesItem) {
    this.machines.add(machinesItem);
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

