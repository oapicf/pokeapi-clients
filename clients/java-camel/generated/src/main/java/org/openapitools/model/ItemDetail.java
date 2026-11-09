package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ItemDetail
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-11-09T13:49:41.168612095Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class ItemDetail {

  private Integer id;

  private String name;

  private JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> flingPower = JsonNullable.<Integer>undefined();

  private JsonNullable<ItemFlingEffectSummary> flingEffect = JsonNullable.<ItemFlingEffectSummary>undefined();

  private List<@Valid ItemAttributeSummary> attributes = new ArrayList<>();

  private ItemCategorySummary category;

  private List<@Valid ItemEffectText> effectEntries = new ArrayList<>();

  private List<@Valid ItemFlavorText> flavorTextEntries = new ArrayList<>();

  private List<@Valid ItemGameIndex> gameIndices = new ArrayList<>();

  private List<@Valid ItemPrice> prices = new ArrayList<>();

  private List<@Valid ItemName> names = new ArrayList<>();

  private List<@Valid PokemonHeldItem> heldByPokemon = new ArrayList<>();

  private ItemSprites sprites;

  private JsonNullable<EvolutionChainSummary> babyTriggerFor = JsonNullable.<EvolutionChainSummary>undefined();

  private List<@Valid ItemMachine> machines = new ArrayList<>();

  public ItemDetail() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ItemDetail(Integer id, String name, ItemFlingEffectSummary flingEffect, List<@Valid ItemAttributeSummary> attributes, ItemCategorySummary category, List<@Valid ItemEffectText> effectEntries, List<@Valid ItemFlavorText> flavorTextEntries, List<@Valid ItemGameIndex> gameIndices, List<@Valid ItemPrice> prices, List<@Valid ItemName> names, List<@Valid PokemonHeldItem> heldByPokemon, ItemSprites sprites, EvolutionChainSummary babyTriggerFor, List<@Valid ItemMachine> machines) {
    this.id = id;
    this.name = name;
    this.flingEffect = JsonNullable.of(flingEffect);
    this.attributes = attributes;
    this.category = category;
    this.effectEntries = effectEntries;
    this.flavorTextEntries = flavorTextEntries;
    this.gameIndices = gameIndices;
    this.prices = prices;
    this.names = names;
    this.heldByPokemon = heldByPokemon;
    this.sprites = sprites;
    this.babyTriggerFor = JsonNullable.of(babyTriggerFor);
    this.machines = machines;
  }

  public ItemDetail id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * The identifier for this resource.
   * @return id
   */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, description = "The identifier for this resource.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public ItemDetail name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name for this resource.
   * @return name
   */
  @NotNull @Size(max = 200) 
  @Schema(name = "name", description = "The name for this resource.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ItemDetail flingPower(Integer flingPower) {
    this.flingPower = JsonNullable.of(flingPower);
    return this;
  }

  /**
   * The power of the move Fling when used with this item.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return flingPower
   */
  @Min(value = -2147483648) @Max(value = 2147483647) 
  @Schema(name = "fling_power", description = "The power of the move Fling when used with this item.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fling_power")
  public JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> getFlingPower() {
    return flingPower;
  }

  public void setFlingPower(JsonNullable<Integer> flingPower) {
    this.flingPower = flingPower;
  }

  public ItemDetail flingEffect(ItemFlingEffectSummary flingEffect) {
    this.flingEffect = JsonNullable.of(flingEffect);
    return this;
  }

  /**
   * The effect of the move Fling when used with this item.
   * @return flingEffect
   */
  /* @Present */ @Valid 
  @Schema(name = "fling_effect", description = "The effect of the move Fling when used with this item.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("fling_effect")
  public JsonNullable<ItemFlingEffectSummary> getFlingEffect() {
    return flingEffect;
  }

  public void setFlingEffect(JsonNullable<ItemFlingEffectSummary> flingEffect) {
    this.flingEffect = flingEffect;
  }

  public ItemDetail attributes(List<@Valid ItemAttributeSummary> attributes) {
    this.attributes = attributes;
    return this;
  }

  public ItemDetail addAttributesItem(ItemAttributeSummary attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

  /**
   * A list of attributes this item has.
   * @return attributes
   */
  
  @Schema(name = "attributes", accessMode = Schema.AccessMode.READ_ONLY, description = "A list of attributes this item has.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("attributes")
  public List<@Valid ItemAttributeSummary> getAttributes() {
    return attributes;
  }

  public void setAttributes(List<@Valid ItemAttributeSummary> attributes) {
    this.attributes = attributes;
  }

  public ItemDetail category(ItemCategorySummary category) {
    this.category = category;
    return this;
  }

  /**
   * The category of items this item falls into.
   * @return category
   */
  @NotNull @Valid 
  @Schema(name = "category", description = "The category of items this item falls into.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("category")
  public ItemCategorySummary getCategory() {
    return category;
  }

  public void setCategory(ItemCategorySummary category) {
    this.category = category;
  }

  public ItemDetail effectEntries(List<@Valid ItemEffectText> effectEntries) {
    this.effectEntries = effectEntries;
    return this;
  }

  public ItemDetail addEffectEntriesItem(ItemEffectText effectEntriesItem) {
    if (this.effectEntries == null) {
      this.effectEntries = new ArrayList<>();
    }
    this.effectEntries.add(effectEntriesItem);
    return this;
  }

  /**
   * The effect of this ability listed in different languages.
   * @return effectEntries
   */
  
  @Schema(name = "effect_entries", accessMode = Schema.AccessMode.READ_ONLY, description = "The effect of this ability listed in different languages.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("effect_entries")
  public List<@Valid ItemEffectText> getEffectEntries() {
    return effectEntries;
  }

  public void setEffectEntries(List<@Valid ItemEffectText> effectEntries) {
    this.effectEntries = effectEntries;
  }

  public ItemDetail flavorTextEntries(List<@Valid ItemFlavorText> flavorTextEntries) {
    this.flavorTextEntries = flavorTextEntries;
    return this;
  }

  public ItemDetail addFlavorTextEntriesItem(ItemFlavorText flavorTextEntriesItem) {
    if (this.flavorTextEntries == null) {
      this.flavorTextEntries = new ArrayList<>();
    }
    this.flavorTextEntries.add(flavorTextEntriesItem);
    return this;
  }

  /**
   * The flavor text of this ability listed in different languages.
   * @return flavorTextEntries
   */
  
  @Schema(name = "flavor_text_entries", accessMode = Schema.AccessMode.READ_ONLY, description = "The flavor text of this ability listed in different languages.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("flavor_text_entries")
  public List<@Valid ItemFlavorText> getFlavorTextEntries() {
    return flavorTextEntries;
  }

  public void setFlavorTextEntries(List<@Valid ItemFlavorText> flavorTextEntries) {
    this.flavorTextEntries = flavorTextEntries;
  }

  public ItemDetail gameIndices(List<@Valid ItemGameIndex> gameIndices) {
    this.gameIndices = gameIndices;
    return this;
  }

  public ItemDetail addGameIndicesItem(ItemGameIndex gameIndicesItem) {
    if (this.gameIndices == null) {
      this.gameIndices = new ArrayList<>();
    }
    this.gameIndices.add(gameIndicesItem);
    return this;
  }

  /**
   * A list of game indices relevent to this item by generation.
   * @return gameIndices
   */
  
  @Schema(name = "game_indices", accessMode = Schema.AccessMode.READ_ONLY, description = "A list of game indices relevent to this item by generation.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("game_indices")
  public List<@Valid ItemGameIndex> getGameIndices() {
    return gameIndices;
  }

  public void setGameIndices(List<@Valid ItemGameIndex> gameIndices) {
    this.gameIndices = gameIndices;
  }

  public ItemDetail prices(List<@Valid ItemPrice> prices) {
    this.prices = prices;
    return this;
  }

  public ItemDetail addPricesItem(ItemPrice pricesItem) {
    if (this.prices == null) {
      this.prices = new ArrayList<>();
    }
    this.prices.add(pricesItem);
    return this;
  }

  /**
   * Purchase and sell prices by currency and version group. Prices may be null when the item cannot be bought or sold.
   * @return prices
   */
  
  @Schema(name = "prices", accessMode = Schema.AccessMode.READ_ONLY, description = "Purchase and sell prices by currency and version group. Prices may be null when the item cannot be bought or sold.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("prices")
  public List<@Valid ItemPrice> getPrices() {
    return prices;
  }

  public void setPrices(List<@Valid ItemPrice> prices) {
    this.prices = prices;
  }

  public ItemDetail names(List<@Valid ItemName> names) {
    this.names = names;
    return this;
  }

  public ItemDetail addNamesItem(ItemName namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<>();
    }
    this.names.add(namesItem);
    return this;
  }

  /**
   * The name of this item listed in different languages.
   * @return names
   */
  
  @Schema(name = "names", accessMode = Schema.AccessMode.READ_ONLY, description = "The name of this item listed in different languages.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("names")
  public List<@Valid ItemName> getNames() {
    return names;
  }

  public void setNames(List<@Valid ItemName> names) {
    this.names = names;
  }

  public ItemDetail heldByPokemon(List<@Valid PokemonHeldItem> heldByPokemon) {
    this.heldByPokemon = heldByPokemon;
    return this;
  }

  public ItemDetail addHeldByPokemonItem(PokemonHeldItem heldByPokemonItem) {
    if (this.heldByPokemon == null) {
      this.heldByPokemon = new ArrayList<>();
    }
    this.heldByPokemon.add(heldByPokemonItem);
    return this;
  }

  /**
   * A list of Pokémon that might be found in the wild holding this item.
   * @return heldByPokemon
   */
  
  @Schema(name = "held_by_pokemon", accessMode = Schema.AccessMode.READ_ONLY, description = "A list of Pokémon that might be found in the wild holding this item.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("held_by_pokemon")
  public List<@Valid PokemonHeldItem> getHeldByPokemon() {
    return heldByPokemon;
  }

  public void setHeldByPokemon(List<@Valid PokemonHeldItem> heldByPokemon) {
    this.heldByPokemon = heldByPokemon;
  }

  public ItemDetail sprites(ItemSprites sprites) {
    this.sprites = sprites;
    return this;
  }

  /**
   * A set of sprites used to depict this item in the game.
   * @return sprites
   */
  @Valid 
  @Schema(name = "sprites", accessMode = Schema.AccessMode.READ_ONLY, description = "A set of sprites used to depict this item in the game.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("sprites")
  public ItemSprites getSprites() {
    return sprites;
  }

  public void setSprites(ItemSprites sprites) {
    this.sprites = sprites;
  }

  public ItemDetail babyTriggerFor(EvolutionChainSummary babyTriggerFor) {
    this.babyTriggerFor = JsonNullable.of(babyTriggerFor);
    return this;
  }

  /**
   * An evolution chain this item requires to produce a bay during mating.
   * @return babyTriggerFor
   */
  @Valid 
  @Schema(name = "baby_trigger_for", accessMode = Schema.AccessMode.READ_ONLY, description = "An evolution chain this item requires to produce a bay during mating.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("baby_trigger_for")
  public JsonNullable<EvolutionChainSummary> getBabyTriggerFor() {
    return babyTriggerFor;
  }

  public void setBabyTriggerFor(JsonNullable<EvolutionChainSummary> babyTriggerFor) {
    this.babyTriggerFor = babyTriggerFor;
  }

  public ItemDetail machines(List<@Valid ItemMachine> machines) {
    this.machines = machines;
    return this;
  }

  public ItemDetail addMachinesItem(ItemMachine machinesItem) {
    if (this.machines == null) {
      this.machines = new ArrayList<>();
    }
    this.machines.add(machinesItem);
    return this;
  }

  /**
   * A list of the machines related to this item.
   * @return machines
   */
  
  @Schema(name = "machines", accessMode = Schema.AccessMode.READ_ONLY, description = "A list of the machines related to this item.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("machines")
  public List<@Valid ItemMachine> getMachines() {
    return machines;
  }

  public void setMachines(List<@Valid ItemMachine> machines) {
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
        equalsNullable(this.flingPower, itemDetail.flingPower) &&
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

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, hashCodeNullable(flingPower), flingEffect, attributes, category, effectEntries, flavorTextEntries, gameIndices, prices, names, heldByPokemon, sprites, babyTriggerFor, machines);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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

