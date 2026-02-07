package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ItemDetail
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-02-07T04:17:25.266083787Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ItemDetail {

  private Integer id;

  private String name;

  private JsonNullable<Integer> cost = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> flingPower = JsonNullable.<Integer>undefined();

  private ItemFlingEffectSummary flingEffect;

  @Valid
  private List<@Valid AbilityDetailPokemonInnerPokemon> attributes = new ArrayList<>();

  private ItemCategorySummary category;

  @Valid
  private List<@Valid ItemEffectText> effectEntries = new ArrayList<>();

  @Valid
  private List<@Valid ItemFlavorText> flavorTextEntries = new ArrayList<>();

  @Valid
  private List<@Valid ItemGameIndex> gameIndices = new ArrayList<>();

  @Valid
  private List<@Valid ItemName> names = new ArrayList<>();

  @Valid
  private List<@Valid ItemDetailHeldByPokemonInner> heldByPokemon = new ArrayList<>();

  private ItemDetailSprites sprites;

  private ItemDetailBabyTriggerFor babyTriggerFor;

  @Valid
  private List<@Valid ItemDetailMachinesInner> machines = new ArrayList<>();

  public ItemDetail() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ItemDetail(Integer id, String name, ItemFlingEffectSummary flingEffect, List<@Valid AbilityDetailPokemonInnerPokemon> attributes, ItemCategorySummary category, List<@Valid ItemEffectText> effectEntries, List<@Valid ItemFlavorText> flavorTextEntries, List<@Valid ItemGameIndex> gameIndices, List<@Valid ItemName> names, List<@Valid ItemDetailHeldByPokemonInner> heldByPokemon, ItemDetailSprites sprites, ItemDetailBabyTriggerFor babyTriggerFor, List<@Valid ItemDetailMachinesInner> machines) {
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

  public ItemDetail id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.REQUIRED)
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
   * Get name
   * @return name
   */
  @NotNull @Size(max = 100) 
  @Schema(name = "name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ItemDetail cost(Integer cost) {
    this.cost = JsonNullable.of(cost);
    return this;
  }

  /**
   * Get cost
   * @return cost
   */
  
  @Schema(name = "cost", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cost")
  public JsonNullable<Integer> getCost() {
    return cost;
  }

  public void setCost(JsonNullable<Integer> cost) {
    this.cost = cost;
  }

  public ItemDetail flingPower(Integer flingPower) {
    this.flingPower = JsonNullable.of(flingPower);
    return this;
  }

  /**
   * Get flingPower
   * @return flingPower
   */
  
  @Schema(name = "fling_power", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fling_power")
  public JsonNullable<Integer> getFlingPower() {
    return flingPower;
  }

  public void setFlingPower(JsonNullable<Integer> flingPower) {
    this.flingPower = flingPower;
  }

  public ItemDetail flingEffect(ItemFlingEffectSummary flingEffect) {
    this.flingEffect = flingEffect;
    return this;
  }

  /**
   * Get flingEffect
   * @return flingEffect
   */
  @NotNull @Valid 
  @Schema(name = "fling_effect", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("fling_effect")
  public ItemFlingEffectSummary getFlingEffect() {
    return flingEffect;
  }

  public void setFlingEffect(ItemFlingEffectSummary flingEffect) {
    this.flingEffect = flingEffect;
  }

  public ItemDetail attributes(List<@Valid AbilityDetailPokemonInnerPokemon> attributes) {
    this.attributes = attributes;
    return this;
  }

  public ItemDetail addAttributesItem(AbilityDetailPokemonInnerPokemon attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

  /**
   * Get attributes
   * @return attributes
   */
  @NotNull @Valid 
  @Schema(name = "attributes", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("attributes")
  public List<@Valid AbilityDetailPokemonInnerPokemon> getAttributes() {
    return attributes;
  }

  public void setAttributes(List<@Valid AbilityDetailPokemonInnerPokemon> attributes) {
    this.attributes = attributes;
  }

  public ItemDetail category(ItemCategorySummary category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
   */
  @NotNull @Valid 
  @Schema(name = "category", requiredMode = Schema.RequiredMode.REQUIRED)
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
   * Get effectEntries
   * @return effectEntries
   */
  @NotNull @Valid 
  @Schema(name = "effect_entries", requiredMode = Schema.RequiredMode.REQUIRED)
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
   * Get flavorTextEntries
   * @return flavorTextEntries
   */
  @NotNull @Valid 
  @Schema(name = "flavor_text_entries", requiredMode = Schema.RequiredMode.REQUIRED)
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
   * Get gameIndices
   * @return gameIndices
   */
  @NotNull @Valid 
  @Schema(name = "game_indices", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("game_indices")
  public List<@Valid ItemGameIndex> getGameIndices() {
    return gameIndices;
  }

  public void setGameIndices(List<@Valid ItemGameIndex> gameIndices) {
    this.gameIndices = gameIndices;
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
   * Get names
   * @return names
   */
  @NotNull @Valid 
  @Schema(name = "names", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("names")
  public List<@Valid ItemName> getNames() {
    return names;
  }

  public void setNames(List<@Valid ItemName> names) {
    this.names = names;
  }

  public ItemDetail heldByPokemon(List<@Valid ItemDetailHeldByPokemonInner> heldByPokemon) {
    this.heldByPokemon = heldByPokemon;
    return this;
  }

  public ItemDetail addHeldByPokemonItem(ItemDetailHeldByPokemonInner heldByPokemonItem) {
    if (this.heldByPokemon == null) {
      this.heldByPokemon = new ArrayList<>();
    }
    this.heldByPokemon.add(heldByPokemonItem);
    return this;
  }

  /**
   * Get heldByPokemon
   * @return heldByPokemon
   */
  @NotNull @Valid 
  @Schema(name = "held_by_pokemon", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("held_by_pokemon")
  public List<@Valid ItemDetailHeldByPokemonInner> getHeldByPokemon() {
    return heldByPokemon;
  }

  public void setHeldByPokemon(List<@Valid ItemDetailHeldByPokemonInner> heldByPokemon) {
    this.heldByPokemon = heldByPokemon;
  }

  public ItemDetail sprites(ItemDetailSprites sprites) {
    this.sprites = sprites;
    return this;
  }

  /**
   * Get sprites
   * @return sprites
   */
  @NotNull @Valid 
  @Schema(name = "sprites", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("sprites")
  public ItemDetailSprites getSprites() {
    return sprites;
  }

  public void setSprites(ItemDetailSprites sprites) {
    this.sprites = sprites;
  }

  public ItemDetail babyTriggerFor(ItemDetailBabyTriggerFor babyTriggerFor) {
    this.babyTriggerFor = babyTriggerFor;
    return this;
  }

  /**
   * Get babyTriggerFor
   * @return babyTriggerFor
   */
  @NotNull @Valid 
  @Schema(name = "baby_trigger_for", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("baby_trigger_for")
  public ItemDetailBabyTriggerFor getBabyTriggerFor() {
    return babyTriggerFor;
  }

  public void setBabyTriggerFor(ItemDetailBabyTriggerFor babyTriggerFor) {
    this.babyTriggerFor = babyTriggerFor;
  }

  public ItemDetail machines(List<@Valid ItemDetailMachinesInner> machines) {
    this.machines = machines;
    return this;
  }

  public ItemDetail addMachinesItem(ItemDetailMachinesInner machinesItem) {
    if (this.machines == null) {
      this.machines = new ArrayList<>();
    }
    this.machines.add(machinesItem);
    return this;
  }

  /**
   * Get machines
   * @return machines
   */
  @NotNull @Valid 
  @Schema(name = "machines", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("machines")
  public List<@Valid ItemDetailMachinesInner> getMachines() {
    return machines;
  }

  public void setMachines(List<@Valid ItemDetailMachinesInner> machines) {
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
        equalsNullable(this.cost, itemDetail.cost) &&
        equalsNullable(this.flingPower, itemDetail.flingPower) &&
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

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, hashCodeNullable(cost), hashCodeNullable(flingPower), flingEffect, attributes, category, effectEntries, flavorTextEntries, gameIndices, names, heldByPokemon, sprites, babyTriggerFor, machines);
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

