package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ContestEffectSummary;
import org.openapitools.model.ContestTypeSummary;
import org.openapitools.model.GenerationSummary;
import org.openapitools.model.ItemMachine;
import org.openapitools.model.MoveChange;
import org.openapitools.model.MoveCombos;
import org.openapitools.model.MoveDamageClassSummary;
import org.openapitools.model.MoveEffectChange;
import org.openapitools.model.MoveEffectEffectText;
import org.openapitools.model.MoveFlavorText;
import org.openapitools.model.MoveMeta;
import org.openapitools.model.MoveMetaStatChange;
import org.openapitools.model.MoveName;
import org.openapitools.model.MoveTargetSummary;
import org.openapitools.model.PokemonSummary;
import org.openapitools.model.SuperContestEffectSummary;
import org.openapitools.model.TypeSummary;
import org.springframework.lang.Nullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * MoveDetail
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-09T13:53:47.069318184Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class MoveDetail {

  private Integer id;

  private String name;

  private JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> accuracy = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> effectChance = JsonNullable.<Integer>undefined();

  private JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> pp = JsonNullable.<Integer>undefined();

  private JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> priority = JsonNullable.<Integer>undefined();

  private JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> power = JsonNullable.<Integer>undefined();

  private JsonNullable<MoveCombos> contestCombos = JsonNullable.<MoveCombos>undefined();

  private JsonNullable<ContestTypeSummary> contestType = JsonNullable.<ContestTypeSummary>undefined();

  private JsonNullable<ContestEffectSummary> contestEffect = JsonNullable.<ContestEffectSummary>undefined();

  private MoveDamageClassSummary damageClass;

  private List<@Valid MoveEffectEffectText> effectEntries = new ArrayList<>();

  private List<@Valid MoveEffectChange> effectChanges = new ArrayList<>();

  private GenerationSummary generation;

  private JsonNullable<MoveMeta> meta = JsonNullable.<MoveMeta>undefined();

  private List<@Valid MoveName> names = new ArrayList<>();

  private List<@Valid MoveChange> pastValues = new ArrayList<>();

  private List<@Valid MoveMetaStatChange> statChanges = new ArrayList<>();

  private JsonNullable<SuperContestEffectSummary> superContestEffect = JsonNullable.<SuperContestEffectSummary>undefined();

  private MoveTargetSummary target;

  private TypeSummary type;

  private List<@Valid ItemMachine> machines = new ArrayList<>();

  private List<@Valid MoveFlavorText> flavorTextEntries = new ArrayList<>();

  private List<@Valid PokemonSummary> learnedByPokemon = new ArrayList<>();

  public MoveDetail() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MoveDetail(Integer id, String name, Integer effectChance, MoveCombos contestCombos, ContestTypeSummary contestType, ContestEffectSummary contestEffect, MoveDamageClassSummary damageClass, List<@Valid MoveEffectEffectText> effectEntries, List<@Valid MoveEffectChange> effectChanges, GenerationSummary generation, MoveMeta meta, List<@Valid MoveName> names, List<@Valid MoveChange> pastValues, List<@Valid MoveMetaStatChange> statChanges, SuperContestEffectSummary superContestEffect, MoveTargetSummary target, TypeSummary type, List<@Valid ItemMachine> machines, List<@Valid MoveFlavorText> flavorTextEntries, List<@Valid PokemonSummary> learnedByPokemon) {
    this.id = id;
    this.name = name;
    this.effectChance = JsonNullable.of(effectChance);
    this.contestCombos = JsonNullable.of(contestCombos);
    this.contestType = JsonNullable.of(contestType);
    this.contestEffect = JsonNullable.of(contestEffect);
    this.damageClass = damageClass;
    this.effectEntries = effectEntries;
    this.effectChanges = effectChanges;
    this.generation = generation;
    this.meta = JsonNullable.of(meta);
    this.names = names;
    this.pastValues = pastValues;
    this.statChanges = statChanges;
    this.superContestEffect = JsonNullable.of(superContestEffect);
    this.target = target;
    this.type = type;
    this.machines = machines;
    this.flavorTextEntries = flavorTextEntries;
    this.learnedByPokemon = learnedByPokemon;
  }

  public MoveDetail id(Integer id) {
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

  @JsonProperty("id")
  public void setId(Integer id) {
    this.id = id;
  }

  public MoveDetail name(String name) {
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

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  public MoveDetail accuracy(Integer accuracy) {
    this.accuracy = JsonNullable.of(accuracy);
    return this;
  }

  /**
   * The percent value of how likely this move is to be successful.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return accuracy
   */
  @Min(value = -2147483648) @Max(value = 2147483647) 
  @Schema(name = "accuracy", description = "The percent value of how likely this move is to be successful.", requiredMode = Schema.RequiredMode.NOT_REQUIRED, nullable = true)
  @JsonProperty("accuracy")
  public JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> getAccuracy() {
    return accuracy;
  }

  public void setAccuracy(JsonNullable<Integer> accuracy) {
    this.accuracy = accuracy;
  }

  public MoveDetail effectChance(Integer effectChance) {
    this.effectChance = JsonNullable.of(effectChance);
    return this;
  }

  /**
   * The percent value of how likely it is this moves effect will happen.
   * @return effectChance
   */
  /* @Present */ 
  @Schema(name = "effect_chance", description = "The percent value of how likely it is this moves effect will happen.", requiredMode = Schema.RequiredMode.REQUIRED, nullable = true)
  @JsonProperty("effect_chance")
  public JsonNullable<Integer> getEffectChance() {
    return effectChance;
  }

  @JsonProperty("effect_chance")
  public void setEffectChance(JsonNullable<Integer> effectChance) {
    this.effectChance = effectChance;
  }

  public MoveDetail pp(Integer pp) {
    this.pp = JsonNullable.of(pp);
    return this;
  }

  /**
   * Power points. The number of times this move can be used.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return pp
   */
  @Min(value = -2147483648) @Max(value = 2147483647) 
  @Schema(name = "pp", description = "Power points. The number of times this move can be used.", requiredMode = Schema.RequiredMode.NOT_REQUIRED, nullable = true)
  @JsonProperty("pp")
  public JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> getPp() {
    return pp;
  }

  public void setPp(JsonNullable<Integer> pp) {
    this.pp = pp;
  }

  public MoveDetail priority(Integer priority) {
    this.priority = JsonNullable.of(priority);
    return this;
  }

  /**
   * A value between -8 and 8. Sets the order in which moves are executed during battle. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Priority) for greater detail.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return priority
   */
  @Min(value = -2147483648) @Max(value = 2147483647) 
  @Schema(name = "priority", description = "A value between -8 and 8. Sets the order in which moves are executed during battle. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Priority) for greater detail.", requiredMode = Schema.RequiredMode.NOT_REQUIRED, nullable = true)
  @JsonProperty("priority")
  public JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> getPriority() {
    return priority;
  }

  public void setPriority(JsonNullable<Integer> priority) {
    this.priority = priority;
  }

  public MoveDetail power(Integer power) {
    this.power = JsonNullable.of(power);
    return this;
  }

  /**
   * The base power of this move, or null if it has no fixed base power.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return power
   */
  @Min(value = -2147483648) @Max(value = 2147483647) 
  @Schema(name = "power", description = "The base power of this move, or null if it has no fixed base power.", requiredMode = Schema.RequiredMode.NOT_REQUIRED, nullable = true)
  @JsonProperty("power")
  public JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> getPower() {
    return power;
  }

  public void setPower(JsonNullable<Integer> power) {
    this.power = power;
  }

  public MoveDetail contestCombos(MoveCombos contestCombos) {
    this.contestCombos = JsonNullable.of(contestCombos);
    return this;
  }

  /**
   * A detail of normal and super contest combos that require this move.
   * @return contestCombos
   */
  @Valid 
  @Schema(name = "contest_combos", accessMode = Schema.AccessMode.READ_ONLY, description = "A detail of normal and super contest combos that require this move.", requiredMode = Schema.RequiredMode.REQUIRED, nullable = true)
  @JsonProperty("contest_combos")
  public JsonNullable<MoveCombos> getContestCombos() {
    return contestCombos;
  }

  @JsonProperty("contest_combos")
  public void setContestCombos(JsonNullable<MoveCombos> contestCombos) {
    this.contestCombos = contestCombos;
  }

  public MoveDetail contestType(ContestTypeSummary contestType) {
    this.contestType = JsonNullable.of(contestType);
    return this;
  }

  /**
   * The type of appeal this move gives a Pokémon when used in a contest.
   * @return contestType
   */
  /* @Present */ @Valid 
  @Schema(name = "contest_type", description = "The type of appeal this move gives a Pokémon when used in a contest.", requiredMode = Schema.RequiredMode.REQUIRED, nullable = true)
  @JsonProperty("contest_type")
  public JsonNullable<ContestTypeSummary> getContestType() {
    return contestType;
  }

  @JsonProperty("contest_type")
  public void setContestType(JsonNullable<ContestTypeSummary> contestType) {
    this.contestType = contestType;
  }

  public MoveDetail contestEffect(ContestEffectSummary contestEffect) {
    this.contestEffect = JsonNullable.of(contestEffect);
    return this;
  }

  /**
   * The effect the move has when used in a contest.
   * @return contestEffect
   */
  /* @Present */ @Valid 
  @Schema(name = "contest_effect", description = "The effect the move has when used in a contest.", requiredMode = Schema.RequiredMode.REQUIRED, nullable = true)
  @JsonProperty("contest_effect")
  public JsonNullable<ContestEffectSummary> getContestEffect() {
    return contestEffect;
  }

  @JsonProperty("contest_effect")
  public void setContestEffect(JsonNullable<ContestEffectSummary> contestEffect) {
    this.contestEffect = contestEffect;
  }

  public MoveDetail damageClass(MoveDamageClassSummary damageClass) {
    this.damageClass = damageClass;
    return this;
  }

  /**
   * The type of damage the move inflicts on the target, e.g. physical.
   * @return damageClass
   */
  @NotNull @Valid 
  @Schema(name = "damage_class", description = "The type of damage the move inflicts on the target, e.g. physical.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("damage_class")
  public MoveDamageClassSummary getDamageClass() {
    return damageClass;
  }

  @JsonProperty("damage_class")
  public void setDamageClass(MoveDamageClassSummary damageClass) {
    this.damageClass = damageClass;
  }

  public MoveDetail effectEntries(List<@Valid MoveEffectEffectText> effectEntries) {
    this.effectEntries = effectEntries;
    return this;
  }

  public MoveDetail addEffectEntriesItem(MoveEffectEffectText effectEntriesItem) {
    if (this.effectEntries == null) {
      this.effectEntries = new ArrayList<>();
    }
    this.effectEntries.add(effectEntriesItem);
    return this;
  }

  /**
   * The effect of this move listed in different languages.
   * @return effectEntries
   */
  
  @Schema(name = "effect_entries", accessMode = Schema.AccessMode.READ_ONLY, description = "The effect of this move listed in different languages.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("effect_entries")
  public List<@Valid MoveEffectEffectText> getEffectEntries() {
    return effectEntries;
  }

  @JsonProperty("effect_entries")
  public void setEffectEntries(List<@Valid MoveEffectEffectText> effectEntries) {
    this.effectEntries = effectEntries;
  }

  public MoveDetail effectChanges(List<@Valid MoveEffectChange> effectChanges) {
    this.effectChanges = effectChanges;
    return this;
  }

  public MoveDetail addEffectChangesItem(MoveEffectChange effectChangesItem) {
    if (this.effectChanges == null) {
      this.effectChanges = new ArrayList<>();
    }
    this.effectChanges.add(effectChangesItem);
    return this;
  }

  /**
   * The list of previous effects this move has had across version groups of the games.
   * @return effectChanges
   */
  
  @Schema(name = "effect_changes", accessMode = Schema.AccessMode.READ_ONLY, description = "The list of previous effects this move has had across version groups of the games.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("effect_changes")
  public List<@Valid MoveEffectChange> getEffectChanges() {
    return effectChanges;
  }

  @JsonProperty("effect_changes")
  public void setEffectChanges(List<@Valid MoveEffectChange> effectChanges) {
    this.effectChanges = effectChanges;
  }

  public MoveDetail generation(GenerationSummary generation) {
    this.generation = generation;
    return this;
  }

  /**
   * The generation in which this move was introduced.
   * @return generation
   */
  @NotNull @Valid 
  @Schema(name = "generation", description = "The generation in which this move was introduced.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("generation")
  public GenerationSummary getGeneration() {
    return generation;
  }

  @JsonProperty("generation")
  public void setGeneration(GenerationSummary generation) {
    this.generation = generation;
  }

  public MoveDetail meta(MoveMeta meta) {
    this.meta = JsonNullable.of(meta);
    return this;
  }

  /**
   * Metadata about this move
   * @return meta
   */
  @Valid 
  @Schema(name = "meta", accessMode = Schema.AccessMode.READ_ONLY, description = "Metadata about this move", requiredMode = Schema.RequiredMode.REQUIRED, nullable = true)
  @JsonProperty("meta")
  public JsonNullable<MoveMeta> getMeta() {
    return meta;
  }

  @JsonProperty("meta")
  public void setMeta(JsonNullable<MoveMeta> meta) {
    this.meta = meta;
  }

  public MoveDetail names(List<@Valid MoveName> names) {
    this.names = names;
    return this;
  }

  public MoveDetail addNamesItem(MoveName namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<>();
    }
    this.names.add(namesItem);
    return this;
  }

  /**
   * The name of this resource listed in different languages.
   * @return names
   */
  
  @Schema(name = "names", accessMode = Schema.AccessMode.READ_ONLY, description = "The name of this resource listed in different languages.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("names")
  public List<@Valid MoveName> getNames() {
    return names;
  }

  @JsonProperty("names")
  public void setNames(List<@Valid MoveName> names) {
    this.names = names;
  }

  public MoveDetail pastValues(List<@Valid MoveChange> pastValues) {
    this.pastValues = pastValues;
    return this;
  }

  public MoveDetail addPastValuesItem(MoveChange pastValuesItem) {
    if (this.pastValues == null) {
      this.pastValues = new ArrayList<>();
    }
    this.pastValues.add(pastValuesItem);
    return this;
  }

  /**
   * A list of move resource value changes across version groups of the game.
   * @return pastValues
   */
  
  @Schema(name = "past_values", accessMode = Schema.AccessMode.READ_ONLY, description = "A list of move resource value changes across version groups of the game.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("past_values")
  public List<@Valid MoveChange> getPastValues() {
    return pastValues;
  }

  @JsonProperty("past_values")
  public void setPastValues(List<@Valid MoveChange> pastValues) {
    this.pastValues = pastValues;
  }

  public MoveDetail statChanges(List<@Valid MoveMetaStatChange> statChanges) {
    this.statChanges = statChanges;
    return this;
  }

  public MoveDetail addStatChangesItem(MoveMetaStatChange statChangesItem) {
    if (this.statChanges == null) {
      this.statChanges = new ArrayList<>();
    }
    this.statChanges.add(statChangesItem);
    return this;
  }

  /**
   * A list of stats this moves effects and how much it effects them.
   * @return statChanges
   */
  
  @Schema(name = "stat_changes", accessMode = Schema.AccessMode.READ_ONLY, description = "A list of stats this moves effects and how much it effects them.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("stat_changes")
  public List<@Valid MoveMetaStatChange> getStatChanges() {
    return statChanges;
  }

  @JsonProperty("stat_changes")
  public void setStatChanges(List<@Valid MoveMetaStatChange> statChanges) {
    this.statChanges = statChanges;
  }

  public MoveDetail superContestEffect(SuperContestEffectSummary superContestEffect) {
    this.superContestEffect = JsonNullable.of(superContestEffect);
    return this;
  }

  /**
   * The effect the move has when used in a super contest.
   * @return superContestEffect
   */
  /* @Present */ @Valid 
  @Schema(name = "super_contest_effect", description = "The effect the move has when used in a super contest.", requiredMode = Schema.RequiredMode.REQUIRED, nullable = true)
  @JsonProperty("super_contest_effect")
  public JsonNullable<SuperContestEffectSummary> getSuperContestEffect() {
    return superContestEffect;
  }

  @JsonProperty("super_contest_effect")
  public void setSuperContestEffect(JsonNullable<SuperContestEffectSummary> superContestEffect) {
    this.superContestEffect = superContestEffect;
  }

  public MoveDetail target(MoveTargetSummary target) {
    this.target = target;
    return this;
  }

  /**
   * The type of target that will receive the effects of the attack.
   * @return target
   */
  @NotNull @Valid 
  @Schema(name = "target", description = "The type of target that will receive the effects of the attack.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("target")
  public MoveTargetSummary getTarget() {
    return target;
  }

  @JsonProperty("target")
  public void setTarget(MoveTargetSummary target) {
    this.target = target;
  }

  public MoveDetail type(TypeSummary type) {
    this.type = type;
    return this;
  }

  /**
   * The elemental type of this move.
   * @return type
   */
  @NotNull @Valid 
  @Schema(name = "type", description = "The elemental type of this move.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public TypeSummary getType() {
    return type;
  }

  @JsonProperty("type")
  public void setType(TypeSummary type) {
    this.type = type;
  }

  public MoveDetail machines(List<@Valid ItemMachine> machines) {
    this.machines = machines;
    return this;
  }

  public MoveDetail addMachinesItem(ItemMachine machinesItem) {
    if (this.machines == null) {
      this.machines = new ArrayList<>();
    }
    this.machines.add(machinesItem);
    return this;
  }

  /**
   * A list of the machines that teach this move.
   * @return machines
   */
  
  @Schema(name = "machines", accessMode = Schema.AccessMode.READ_ONLY, description = "A list of the machines that teach this move.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("machines")
  public List<@Valid ItemMachine> getMachines() {
    return machines;
  }

  @JsonProperty("machines")
  public void setMachines(List<@Valid ItemMachine> machines) {
    this.machines = machines;
  }

  public MoveDetail flavorTextEntries(List<@Valid MoveFlavorText> flavorTextEntries) {
    this.flavorTextEntries = flavorTextEntries;
    return this;
  }

  public MoveDetail addFlavorTextEntriesItem(MoveFlavorText flavorTextEntriesItem) {
    if (this.flavorTextEntries == null) {
      this.flavorTextEntries = new ArrayList<>();
    }
    this.flavorTextEntries.add(flavorTextEntriesItem);
    return this;
  }

  /**
   * The flavor text of this move listed in different languages.
   * @return flavorTextEntries
   */
  
  @Schema(name = "flavor_text_entries", accessMode = Schema.AccessMode.READ_ONLY, description = "The flavor text of this move listed in different languages.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("flavor_text_entries")
  public List<@Valid MoveFlavorText> getFlavorTextEntries() {
    return flavorTextEntries;
  }

  @JsonProperty("flavor_text_entries")
  public void setFlavorTextEntries(List<@Valid MoveFlavorText> flavorTextEntries) {
    this.flavorTextEntries = flavorTextEntries;
  }

  public MoveDetail learnedByPokemon(List<@Valid PokemonSummary> learnedByPokemon) {
    this.learnedByPokemon = learnedByPokemon;
    return this;
  }

  public MoveDetail addLearnedByPokemonItem(PokemonSummary learnedByPokemonItem) {
    if (this.learnedByPokemon == null) {
      this.learnedByPokemon = new ArrayList<>();
    }
    this.learnedByPokemon.add(learnedByPokemonItem);
    return this;
  }

  /**
   * List of Pokemon that can learn the move
   * @return learnedByPokemon
   */
  
  @Schema(name = "learned_by_pokemon", accessMode = Schema.AccessMode.READ_ONLY, description = "List of Pokemon that can learn the move", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("learned_by_pokemon")
  public List<@Valid PokemonSummary> getLearnedByPokemon() {
    return learnedByPokemon;
  }

  @JsonProperty("learned_by_pokemon")
  public void setLearnedByPokemon(List<@Valid PokemonSummary> learnedByPokemon) {
    this.learnedByPokemon = learnedByPokemon;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MoveDetail moveDetail = (MoveDetail) o;
    return Objects.equals(this.id, moveDetail.id) &&
        Objects.equals(this.name, moveDetail.name) &&
        equalsNullable(this.accuracy, moveDetail.accuracy) &&
        Objects.equals(this.effectChance, moveDetail.effectChance) &&
        equalsNullable(this.pp, moveDetail.pp) &&
        equalsNullable(this.priority, moveDetail.priority) &&
        equalsNullable(this.power, moveDetail.power) &&
        Objects.equals(this.contestCombos, moveDetail.contestCombos) &&
        Objects.equals(this.contestType, moveDetail.contestType) &&
        Objects.equals(this.contestEffect, moveDetail.contestEffect) &&
        Objects.equals(this.damageClass, moveDetail.damageClass) &&
        Objects.equals(this.effectEntries, moveDetail.effectEntries) &&
        Objects.equals(this.effectChanges, moveDetail.effectChanges) &&
        Objects.equals(this.generation, moveDetail.generation) &&
        Objects.equals(this.meta, moveDetail.meta) &&
        Objects.equals(this.names, moveDetail.names) &&
        Objects.equals(this.pastValues, moveDetail.pastValues) &&
        Objects.equals(this.statChanges, moveDetail.statChanges) &&
        Objects.equals(this.superContestEffect, moveDetail.superContestEffect) &&
        Objects.equals(this.target, moveDetail.target) &&
        Objects.equals(this.type, moveDetail.type) &&
        Objects.equals(this.machines, moveDetail.machines) &&
        Objects.equals(this.flavorTextEntries, moveDetail.flavorTextEntries) &&
        Objects.equals(this.learnedByPokemon, moveDetail.learnedByPokemon);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, hashCodeNullable(accuracy), effectChance, hashCodeNullable(pp), hashCodeNullable(priority), hashCodeNullable(power), contestCombos, contestType, contestEffect, damageClass, effectEntries, effectChanges, generation, meta, names, pastValues, statChanges, superContestEffect, target, type, machines, flavorTextEntries, learnedByPokemon);
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
    sb.append("class MoveDetail {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    accuracy: ").append(toIndentedString(accuracy)).append("\n");
    sb.append("    effectChance: ").append(toIndentedString(effectChance)).append("\n");
    sb.append("    pp: ").append(toIndentedString(pp)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    power: ").append(toIndentedString(power)).append("\n");
    sb.append("    contestCombos: ").append(toIndentedString(contestCombos)).append("\n");
    sb.append("    contestType: ").append(toIndentedString(contestType)).append("\n");
    sb.append("    contestEffect: ").append(toIndentedString(contestEffect)).append("\n");
    sb.append("    damageClass: ").append(toIndentedString(damageClass)).append("\n");
    sb.append("    effectEntries: ").append(toIndentedString(effectEntries)).append("\n");
    sb.append("    effectChanges: ").append(toIndentedString(effectChanges)).append("\n");
    sb.append("    generation: ").append(toIndentedString(generation)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    pastValues: ").append(toIndentedString(pastValues)).append("\n");
    sb.append("    statChanges: ").append(toIndentedString(statChanges)).append("\n");
    sb.append("    superContestEffect: ").append(toIndentedString(superContestEffect)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    machines: ").append(toIndentedString(machines)).append("\n");
    sb.append("    flavorTextEntries: ").append(toIndentedString(flavorTextEntries)).append("\n");
    sb.append("    learnedByPokemon: ").append(toIndentedString(learnedByPokemon)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

