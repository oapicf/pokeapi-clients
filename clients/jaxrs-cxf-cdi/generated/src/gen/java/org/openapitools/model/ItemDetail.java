package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.EvolutionChainSummary;
import org.openapitools.model.ItemAttributeSummary;
import org.openapitools.model.ItemCategorySummary;
import org.openapitools.model.ItemEffectText;
import org.openapitools.model.ItemFlavorText;
import org.openapitools.model.ItemFlingEffectSummary;
import org.openapitools.model.ItemGameIndex;
import org.openapitools.model.ItemMachine;
import org.openapitools.model.ItemName;
import org.openapitools.model.ItemPrice;
import org.openapitools.model.ItemSprites;
import org.openapitools.model.PokemonHeldItem;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



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
   * The identifier for this resource.
   **/
  public ItemDetail id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The identifier for this resource.")
  @JsonProperty("id")
  @NotNull
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }


  /**
   * The name for this resource.
   **/
  public ItemDetail name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The name for this resource.")
  @JsonProperty("name")
  @NotNull
 @Size(max=200)  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The power of the move Fling when used with this item.
   * minimum: -2147483648
   * maximum: 2147483647
   **/
  public ItemDetail flingPower(Integer flingPower) {
    this.flingPower = flingPower;
    return this;
  }

  
  @ApiModelProperty(value = "The power of the move Fling when used with this item.")
  @JsonProperty("fling_power")
 @Min(-2147483648) @Max(2147483647)  public Integer getFlingPower() {
    return flingPower;
  }
  public void setFlingPower(Integer flingPower) {
    this.flingPower = flingPower;
  }


  /**
   * The effect of the move Fling when used with this item.
   **/
  public ItemDetail flingEffect(ItemFlingEffectSummary flingEffect) {
    this.flingEffect = flingEffect;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The effect of the move Fling when used with this item.")
  @JsonProperty("fling_effect")
  @NotNull
  public ItemFlingEffectSummary getFlingEffect() {
    return flingEffect;
  }
  public void setFlingEffect(ItemFlingEffectSummary flingEffect) {
    this.flingEffect = flingEffect;
  }


  /**
   * A list of attributes this item has.
   **/
  public ItemDetail attributes(List<@Valid ItemAttributeSummary> attributes) {
    this.attributes = attributes;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of attributes this item has.")
  @JsonProperty("attributes")
  @NotNull
  public List<@Valid ItemAttributeSummary> getAttributes() {
    return attributes;
  }
  public void setAttributes(List<@Valid ItemAttributeSummary> attributes) {
    this.attributes = attributes;
  }

  public ItemDetail addAttributesItem(ItemAttributeSummary attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<>();
    }
    this.attributes.add(attributesItem);
    return this;
  }


  /**
   * The category of items this item falls into.
   **/
  public ItemDetail category(ItemCategorySummary category) {
    this.category = category;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The category of items this item falls into.")
  @JsonProperty("category")
  @NotNull
  public ItemCategorySummary getCategory() {
    return category;
  }
  public void setCategory(ItemCategorySummary category) {
    this.category = category;
  }


  /**
   * The effect of this ability listed in different languages.
   **/
  public ItemDetail effectEntries(List<@Valid ItemEffectText> effectEntries) {
    this.effectEntries = effectEntries;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The effect of this ability listed in different languages.")
  @JsonProperty("effect_entries")
  @NotNull
  public List<@Valid ItemEffectText> getEffectEntries() {
    return effectEntries;
  }
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


  /**
   * The flavor text of this ability listed in different languages.
   **/
  public ItemDetail flavorTextEntries(List<@Valid ItemFlavorText> flavorTextEntries) {
    this.flavorTextEntries = flavorTextEntries;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The flavor text of this ability listed in different languages.")
  @JsonProperty("flavor_text_entries")
  @NotNull
  public List<@Valid ItemFlavorText> getFlavorTextEntries() {
    return flavorTextEntries;
  }
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


  /**
   * A list of game indices relevent to this item by generation.
   **/
  public ItemDetail gameIndices(List<@Valid ItemGameIndex> gameIndices) {
    this.gameIndices = gameIndices;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of game indices relevent to this item by generation.")
  @JsonProperty("game_indices")
  @NotNull
  public List<@Valid ItemGameIndex> getGameIndices() {
    return gameIndices;
  }
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


  /**
   * Purchase and sell prices by currency and version group. Prices may be null when the item cannot be bought or sold.
   **/
  public ItemDetail prices(List<@Valid ItemPrice> prices) {
    this.prices = prices;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Purchase and sell prices by currency and version group. Prices may be null when the item cannot be bought or sold.")
  @JsonProperty("prices")
  @NotNull
  public List<@Valid ItemPrice> getPrices() {
    return prices;
  }
  public void setPrices(List<@Valid ItemPrice> prices) {
    this.prices = prices;
  }

  public ItemDetail addPricesItem(ItemPrice pricesItem) {
    if (this.prices == null) {
      this.prices = new ArrayList<>();
    }
    this.prices.add(pricesItem);
    return this;
  }


  /**
   * The name of this item listed in different languages.
   **/
  public ItemDetail names(List<@Valid ItemName> names) {
    this.names = names;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The name of this item listed in different languages.")
  @JsonProperty("names")
  @NotNull
  public List<@Valid ItemName> getNames() {
    return names;
  }
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


  /**
   * A list of Pokémon that might be found in the wild holding this item.
   **/
  public ItemDetail heldByPokemon(List<@Valid PokemonHeldItem> heldByPokemon) {
    this.heldByPokemon = heldByPokemon;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of Pokémon that might be found in the wild holding this item.")
  @JsonProperty("held_by_pokemon")
  @NotNull
  public List<@Valid PokemonHeldItem> getHeldByPokemon() {
    return heldByPokemon;
  }
  public void setHeldByPokemon(List<@Valid PokemonHeldItem> heldByPokemon) {
    this.heldByPokemon = heldByPokemon;
  }

  public ItemDetail addHeldByPokemonItem(PokemonHeldItem heldByPokemonItem) {
    if (this.heldByPokemon == null) {
      this.heldByPokemon = new ArrayList<>();
    }
    this.heldByPokemon.add(heldByPokemonItem);
    return this;
  }


  /**
   * A set of sprites used to depict this item in the game.
   **/
  public ItemDetail sprites(ItemSprites sprites) {
    this.sprites = sprites;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A set of sprites used to depict this item in the game.")
  @JsonProperty("sprites")
  @NotNull
  public ItemSprites getSprites() {
    return sprites;
  }
  public void setSprites(ItemSprites sprites) {
    this.sprites = sprites;
  }


  /**
   * An evolution chain this item requires to produce a bay during mating.
   **/
  public ItemDetail babyTriggerFor(EvolutionChainSummary babyTriggerFor) {
    this.babyTriggerFor = babyTriggerFor;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "An evolution chain this item requires to produce a bay during mating.")
  @JsonProperty("baby_trigger_for")
  @NotNull
  public EvolutionChainSummary getBabyTriggerFor() {
    return babyTriggerFor;
  }
  public void setBabyTriggerFor(EvolutionChainSummary babyTriggerFor) {
    this.babyTriggerFor = babyTriggerFor;
  }


  /**
   * A list of the machines related to this item.
   **/
  public ItemDetail machines(List<@Valid ItemMachine> machines) {
    this.machines = machines;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of the machines related to this item.")
  @JsonProperty("machines")
  @NotNull
  public List<@Valid ItemMachine> getMachines() {
    return machines;
  }
  public void setMachines(List<@Valid ItemMachine> machines) {
    this.machines = machines;
  }

  public ItemDetail addMachinesItem(ItemMachine machinesItem) {
    if (this.machines == null) {
      this.machines = new ArrayList<>();
    }
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
        Objects.equals(this.flingPower, itemDetail.flingPower) &&
        Objects.equals(this.flingEffect, itemDetail.flingEffect) &&
        Objects.equals(this.attributes, itemDetail.attributes) &&
        Objects.equals(this.category, itemDetail.category) &&
        Objects.equals(this.effectEntries, itemDetail.effectEntries) &&
        Objects.equals(this.flavorTextEntries, itemDetail.flavorTextEntries) &&
        Objects.equals(this.gameIndices, itemDetail.gameIndices) &&
        Objects.equals(this.prices, itemDetail.prices) &&
        Objects.equals(this.names, itemDetail.names) &&
        Objects.equals(this.heldByPokemon, itemDetail.heldByPokemon) &&
        Objects.equals(this.sprites, itemDetail.sprites) &&
        Objects.equals(this.babyTriggerFor, itemDetail.babyTriggerFor) &&
        Objects.equals(this.machines, itemDetail.machines);
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

