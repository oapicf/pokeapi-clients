package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("ItemDetail")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-02-07T15:24:06.001755207Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ItemDetail   {
  private Integer id;
  private String name;
  private Integer cost;
  private Integer flingPower;
  private ItemFlingEffectSummary flingEffect;
  private @Valid List<@Valid AbilityDetailPokemonInnerPokemon> attributes = new ArrayList<>();
  private ItemCategorySummary category;
  private @Valid List<@Valid ItemEffectText> effectEntries = new ArrayList<>();
  private @Valid List<@Valid ItemFlavorText> flavorTextEntries = new ArrayList<>();
  private @Valid List<@Valid ItemGameIndex> gameIndices = new ArrayList<>();
  private @Valid List<@Valid ItemName> names = new ArrayList<>();
  private @Valid List<@Valid ItemDetailHeldByPokemonInner> heldByPokemon = new ArrayList<>();
  private ItemDetailSprites sprites;
  private ItemDetailBabyTriggerFor babyTriggerFor;
  private @Valid List<@Valid ItemDetailMachinesInner> machines = new ArrayList<>();

  public ItemDetail() {
  }

  @JsonCreator
  public ItemDetail(
    @JsonProperty(required = true, value = "id") Integer id,
    @JsonProperty(required = true, value = "name") String name,
    @JsonProperty(required = true, value = "fling_effect") ItemFlingEffectSummary flingEffect,
    @JsonProperty(required = true, value = "attributes") List<@Valid AbilityDetailPokemonInnerPokemon> attributes,
    @JsonProperty(required = true, value = "category") ItemCategorySummary category,
    @JsonProperty(required = true, value = "effect_entries") List<@Valid ItemEffectText> effectEntries,
    @JsonProperty(required = true, value = "flavor_text_entries") List<@Valid ItemFlavorText> flavorTextEntries,
    @JsonProperty(required = true, value = "game_indices") List<@Valid ItemGameIndex> gameIndices,
    @JsonProperty(required = true, value = "names") List<@Valid ItemName> names,
    @JsonProperty(required = true, value = "held_by_pokemon") List<@Valid ItemDetailHeldByPokemonInner> heldByPokemon,
    @JsonProperty(required = true, value = "sprites") ItemDetailSprites sprites,
    @JsonProperty(required = true, value = "baby_trigger_for") ItemDetailBabyTriggerFor babyTriggerFor,
    @JsonProperty(required = true, value = "machines") List<@Valid ItemDetailMachinesInner> machines
  ) {
    this.id = id;
    this.name = name;
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
   **/
  public ItemDetail id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "id")
  public Integer getId() {
    return id;
  }

  @JsonProperty(required = true, value = "id")
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   **/
  public ItemDetail name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "name")
  @NotNull  @Size(max=100)public String getName() {
    return name;
  }

  @JsonProperty(required = true, value = "name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public ItemDetail cost(Integer cost) {
    this.cost = cost;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cost")
  public Integer getCost() {
    return cost;
  }

  @JsonProperty("cost")
  public void setCost(Integer cost) {
    this.cost = cost;
  }

  /**
   **/
  public ItemDetail flingPower(Integer flingPower) {
    this.flingPower = flingPower;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("fling_power")
  public Integer getFlingPower() {
    return flingPower;
  }

  @JsonProperty("fling_power")
  public void setFlingPower(Integer flingPower) {
    this.flingPower = flingPower;
  }

  /**
   **/
  public ItemDetail flingEffect(ItemFlingEffectSummary flingEffect) {
    this.flingEffect = flingEffect;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "fling_effect")
  @NotNull @Valid public ItemFlingEffectSummary getFlingEffect() {
    return flingEffect;
  }

  @JsonProperty(required = true, value = "fling_effect")
  public void setFlingEffect(ItemFlingEffectSummary flingEffect) {
    this.flingEffect = flingEffect;
  }

  /**
   **/
  public ItemDetail attributes(List<@Valid AbilityDetailPokemonInnerPokemon> attributes) {
    this.attributes = attributes;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "attributes")
  @NotNull @Valid public List<@Valid AbilityDetailPokemonInnerPokemon> getAttributes() {
    return attributes;
  }

  @JsonProperty(required = true, value = "attributes")
  public void setAttributes(List<@Valid AbilityDetailPokemonInnerPokemon> attributes) {
    this.attributes = attributes;
  }

  public ItemDetail addAttributesItem(AbilityDetailPokemonInnerPokemon attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<>();
    }

    this.attributes.add(attributesItem);
    return this;
  }

  public ItemDetail removeAttributesItem(AbilityDetailPokemonInnerPokemon attributesItem) {
    if (attributesItem != null && this.attributes != null) {
      this.attributes.remove(attributesItem);
    }

    return this;
  }
  /**
   **/
  public ItemDetail category(ItemCategorySummary category) {
    this.category = category;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "category")
  @NotNull @Valid public ItemCategorySummary getCategory() {
    return category;
  }

  @JsonProperty(required = true, value = "category")
  public void setCategory(ItemCategorySummary category) {
    this.category = category;
  }

  /**
   **/
  public ItemDetail effectEntries(List<@Valid ItemEffectText> effectEntries) {
    this.effectEntries = effectEntries;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "effect_entries")
  @NotNull @Valid public List<@Valid ItemEffectText> getEffectEntries() {
    return effectEntries;
  }

  @JsonProperty(required = true, value = "effect_entries")
  public void setEffectEntries(List<@Valid ItemEffectText> effectEntries) {
    this.effectEntries = effectEntries;
  }

  public ItemDetail addEffectEntriesItem(ItemEffectText effectEntriesItem) {
    if (this.effectEntries == null) {
      this.effectEntries = new ArrayList<>();
    }

    this.effectEntries.add(effectEntriesItem);
    return this;
  }

  public ItemDetail removeEffectEntriesItem(ItemEffectText effectEntriesItem) {
    if (effectEntriesItem != null && this.effectEntries != null) {
      this.effectEntries.remove(effectEntriesItem);
    }

    return this;
  }
  /**
   **/
  public ItemDetail flavorTextEntries(List<@Valid ItemFlavorText> flavorTextEntries) {
    this.flavorTextEntries = flavorTextEntries;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "flavor_text_entries")
  @NotNull @Valid public List<@Valid ItemFlavorText> getFlavorTextEntries() {
    return flavorTextEntries;
  }

  @JsonProperty(required = true, value = "flavor_text_entries")
  public void setFlavorTextEntries(List<@Valid ItemFlavorText> flavorTextEntries) {
    this.flavorTextEntries = flavorTextEntries;
  }

  public ItemDetail addFlavorTextEntriesItem(ItemFlavorText flavorTextEntriesItem) {
    if (this.flavorTextEntries == null) {
      this.flavorTextEntries = new ArrayList<>();
    }

    this.flavorTextEntries.add(flavorTextEntriesItem);
    return this;
  }

  public ItemDetail removeFlavorTextEntriesItem(ItemFlavorText flavorTextEntriesItem) {
    if (flavorTextEntriesItem != null && this.flavorTextEntries != null) {
      this.flavorTextEntries.remove(flavorTextEntriesItem);
    }

    return this;
  }
  /**
   **/
  public ItemDetail gameIndices(List<@Valid ItemGameIndex> gameIndices) {
    this.gameIndices = gameIndices;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "game_indices")
  @NotNull @Valid public List<@Valid ItemGameIndex> getGameIndices() {
    return gameIndices;
  }

  @JsonProperty(required = true, value = "game_indices")
  public void setGameIndices(List<@Valid ItemGameIndex> gameIndices) {
    this.gameIndices = gameIndices;
  }

  public ItemDetail addGameIndicesItem(ItemGameIndex gameIndicesItem) {
    if (this.gameIndices == null) {
      this.gameIndices = new ArrayList<>();
    }

    this.gameIndices.add(gameIndicesItem);
    return this;
  }

  public ItemDetail removeGameIndicesItem(ItemGameIndex gameIndicesItem) {
    if (gameIndicesItem != null && this.gameIndices != null) {
      this.gameIndices.remove(gameIndicesItem);
    }

    return this;
  }
  /**
   **/
  public ItemDetail names(List<@Valid ItemName> names) {
    this.names = names;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "names")
  @NotNull @Valid public List<@Valid ItemName> getNames() {
    return names;
  }

  @JsonProperty(required = true, value = "names")
  public void setNames(List<@Valid ItemName> names) {
    this.names = names;
  }

  public ItemDetail addNamesItem(ItemName namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<>();
    }

    this.names.add(namesItem);
    return this;
  }

  public ItemDetail removeNamesItem(ItemName namesItem) {
    if (namesItem != null && this.names != null) {
      this.names.remove(namesItem);
    }

    return this;
  }
  /**
   **/
  public ItemDetail heldByPokemon(List<@Valid ItemDetailHeldByPokemonInner> heldByPokemon) {
    this.heldByPokemon = heldByPokemon;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "held_by_pokemon")
  @NotNull @Valid public List<@Valid ItemDetailHeldByPokemonInner> getHeldByPokemon() {
    return heldByPokemon;
  }

  @JsonProperty(required = true, value = "held_by_pokemon")
  public void setHeldByPokemon(List<@Valid ItemDetailHeldByPokemonInner> heldByPokemon) {
    this.heldByPokemon = heldByPokemon;
  }

  public ItemDetail addHeldByPokemonItem(ItemDetailHeldByPokemonInner heldByPokemonItem) {
    if (this.heldByPokemon == null) {
      this.heldByPokemon = new ArrayList<>();
    }

    this.heldByPokemon.add(heldByPokemonItem);
    return this;
  }

  public ItemDetail removeHeldByPokemonItem(ItemDetailHeldByPokemonInner heldByPokemonItem) {
    if (heldByPokemonItem != null && this.heldByPokemon != null) {
      this.heldByPokemon.remove(heldByPokemonItem);
    }

    return this;
  }
  /**
   **/
  public ItemDetail sprites(ItemDetailSprites sprites) {
    this.sprites = sprites;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "sprites")
  @NotNull @Valid public ItemDetailSprites getSprites() {
    return sprites;
  }

  @JsonProperty(required = true, value = "sprites")
  public void setSprites(ItemDetailSprites sprites) {
    this.sprites = sprites;
  }

  /**
   **/
  public ItemDetail babyTriggerFor(ItemDetailBabyTriggerFor babyTriggerFor) {
    this.babyTriggerFor = babyTriggerFor;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "baby_trigger_for")
  @NotNull @Valid public ItemDetailBabyTriggerFor getBabyTriggerFor() {
    return babyTriggerFor;
  }

  @JsonProperty(required = true, value = "baby_trigger_for")
  public void setBabyTriggerFor(ItemDetailBabyTriggerFor babyTriggerFor) {
    this.babyTriggerFor = babyTriggerFor;
  }

  /**
   **/
  public ItemDetail machines(List<@Valid ItemDetailMachinesInner> machines) {
    this.machines = machines;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "machines")
  @NotNull @Valid public List<@Valid ItemDetailMachinesInner> getMachines() {
    return machines;
  }

  @JsonProperty(required = true, value = "machines")
  public void setMachines(List<@Valid ItemDetailMachinesInner> machines) {
    this.machines = machines;
  }

  public ItemDetail addMachinesItem(ItemDetailMachinesInner machinesItem) {
    if (this.machines == null) {
      this.machines = new ArrayList<>();
    }

    this.machines.add(machinesItem);
    return this;
  }

  public ItemDetail removeMachinesItem(ItemDetailMachinesInner machinesItem) {
    if (machinesItem != null && this.machines != null) {
      this.machines.remove(machinesItem);
    }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

