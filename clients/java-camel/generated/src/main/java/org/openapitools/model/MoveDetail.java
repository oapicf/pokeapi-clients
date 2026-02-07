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
import org.openapitools.model.ContestEffectSummary;
import org.openapitools.model.ContestTypeSummary;
import org.openapitools.model.GenerationSummary;
import org.openapitools.model.MoveChange;
import org.openapitools.model.MoveChangeEffectEntriesInner;
import org.openapitools.model.MoveDamageClassSummary;
import org.openapitools.model.MoveDetailContestCombos;
import org.openapitools.model.MoveDetailEffectChangesInner;
import org.openapitools.model.MoveDetailMachinesInner;
import org.openapitools.model.MoveDetailStatChangesInner;
import org.openapitools.model.MoveFlavorText;
import org.openapitools.model.MoveMeta;
import org.openapitools.model.MoveName;
import org.openapitools.model.MoveTargetSummary;
import org.openapitools.model.SuperContestEffectSummary;
import org.openapitools.model.TypeSummary;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * MoveDetail
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-02-07T15:23:32.871052804Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class MoveDetail {

  private Integer id;

  private String name;

  private JsonNullable<Integer> accuracy = JsonNullable.<Integer>undefined();

  private Integer effectChance;

  private JsonNullable<Integer> pp = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> priority = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> power = JsonNullable.<Integer>undefined();

  private MoveDetailContestCombos contestCombos;

  private ContestTypeSummary contestType;

  private ContestEffectSummary contestEffect;

  private MoveDamageClassSummary damageClass;

  @Valid
  private List<@Valid MoveChangeEffectEntriesInner> effectEntries = new ArrayList<>();

  @Valid
  private List<@Valid MoveDetailEffectChangesInner> effectChanges = new ArrayList<>();

  private GenerationSummary generation;

  private MoveMeta meta;

  @Valid
  private List<@Valid MoveName> names = new ArrayList<>();

  @Valid
  private List<@Valid MoveChange> pastValues = new ArrayList<>();

  @Valid
  private List<@Valid MoveDetailStatChangesInner> statChanges = new ArrayList<>();

  private SuperContestEffectSummary superContestEffect;

  private MoveTargetSummary target;

  private TypeSummary type;

  @Valid
  private List<@Valid MoveDetailMachinesInner> machines = new ArrayList<>();

  @Valid
  private List<@Valid MoveFlavorText> flavorTextEntries = new ArrayList<>();

  @Valid
  private List<@Valid AbilityDetailPokemonInnerPokemon> learnedByPokemon = new ArrayList<>();

  public MoveDetail() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MoveDetail(Integer id, String name, Integer effectChance, MoveDetailContestCombos contestCombos, ContestTypeSummary contestType, ContestEffectSummary contestEffect, MoveDamageClassSummary damageClass, List<@Valid MoveChangeEffectEntriesInner> effectEntries, List<@Valid MoveDetailEffectChangesInner> effectChanges, GenerationSummary generation, MoveMeta meta, List<@Valid MoveName> names, List<@Valid MoveChange> pastValues, List<@Valid MoveDetailStatChangesInner> statChanges, SuperContestEffectSummary superContestEffect, MoveTargetSummary target, TypeSummary type, List<@Valid MoveDetailMachinesInner> machines, List<@Valid MoveFlavorText> flavorTextEntries, List<@Valid AbilityDetailPokemonInnerPokemon> learnedByPokemon) {
    this.id = id;
    this.name = name;
    this.effectChance = effectChance;
    this.contestCombos = contestCombos;
    this.contestType = contestType;
    this.contestEffect = contestEffect;
    this.damageClass = damageClass;
    this.effectEntries = effectEntries;
    this.effectChanges = effectChanges;
    this.generation = generation;
    this.meta = meta;
    this.names = names;
    this.pastValues = pastValues;
    this.statChanges = statChanges;
    this.superContestEffect = superContestEffect;
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

  public MoveDetail name(String name) {
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

  public MoveDetail accuracy(Integer accuracy) {
    this.accuracy = JsonNullable.of(accuracy);
    return this;
  }

  /**
   * Get accuracy
   * @return accuracy
   */
  
  @Schema(name = "accuracy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accuracy")
  public JsonNullable<Integer> getAccuracy() {
    return accuracy;
  }

  public void setAccuracy(JsonNullable<Integer> accuracy) {
    this.accuracy = accuracy;
  }

  public MoveDetail effectChance(Integer effectChance) {
    this.effectChance = effectChance;
    return this;
  }

  /**
   * Get effectChance
   * @return effectChance
   */
  @NotNull 
  @Schema(name = "effect_chance", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("effect_chance")
  public Integer getEffectChance() {
    return effectChance;
  }

  public void setEffectChance(Integer effectChance) {
    this.effectChance = effectChance;
  }

  public MoveDetail pp(Integer pp) {
    this.pp = JsonNullable.of(pp);
    return this;
  }

  /**
   * Get pp
   * @return pp
   */
  
  @Schema(name = "pp", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pp")
  public JsonNullable<Integer> getPp() {
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
   * Get priority
   * @return priority
   */
  
  @Schema(name = "priority", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("priority")
  public JsonNullable<Integer> getPriority() {
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
   * Get power
   * @return power
   */
  
  @Schema(name = "power", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("power")
  public JsonNullable<Integer> getPower() {
    return power;
  }

  public void setPower(JsonNullable<Integer> power) {
    this.power = power;
  }

  public MoveDetail contestCombos(MoveDetailContestCombos contestCombos) {
    this.contestCombos = contestCombos;
    return this;
  }

  /**
   * Get contestCombos
   * @return contestCombos
   */
  @NotNull @Valid 
  @Schema(name = "contest_combos", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("contest_combos")
  public MoveDetailContestCombos getContestCombos() {
    return contestCombos;
  }

  public void setContestCombos(MoveDetailContestCombos contestCombos) {
    this.contestCombos = contestCombos;
  }

  public MoveDetail contestType(ContestTypeSummary contestType) {
    this.contestType = contestType;
    return this;
  }

  /**
   * Get contestType
   * @return contestType
   */
  @NotNull @Valid 
  @Schema(name = "contest_type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("contest_type")
  public ContestTypeSummary getContestType() {
    return contestType;
  }

  public void setContestType(ContestTypeSummary contestType) {
    this.contestType = contestType;
  }

  public MoveDetail contestEffect(ContestEffectSummary contestEffect) {
    this.contestEffect = contestEffect;
    return this;
  }

  /**
   * Get contestEffect
   * @return contestEffect
   */
  @NotNull @Valid 
  @Schema(name = "contest_effect", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("contest_effect")
  public ContestEffectSummary getContestEffect() {
    return contestEffect;
  }

  public void setContestEffect(ContestEffectSummary contestEffect) {
    this.contestEffect = contestEffect;
  }

  public MoveDetail damageClass(MoveDamageClassSummary damageClass) {
    this.damageClass = damageClass;
    return this;
  }

  /**
   * Get damageClass
   * @return damageClass
   */
  @NotNull @Valid 
  @Schema(name = "damage_class", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("damage_class")
  public MoveDamageClassSummary getDamageClass() {
    return damageClass;
  }

  public void setDamageClass(MoveDamageClassSummary damageClass) {
    this.damageClass = damageClass;
  }

  public MoveDetail effectEntries(List<@Valid MoveChangeEffectEntriesInner> effectEntries) {
    this.effectEntries = effectEntries;
    return this;
  }

  public MoveDetail addEffectEntriesItem(MoveChangeEffectEntriesInner effectEntriesItem) {
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
  public List<@Valid MoveChangeEffectEntriesInner> getEffectEntries() {
    return effectEntries;
  }

  public void setEffectEntries(List<@Valid MoveChangeEffectEntriesInner> effectEntries) {
    this.effectEntries = effectEntries;
  }

  public MoveDetail effectChanges(List<@Valid MoveDetailEffectChangesInner> effectChanges) {
    this.effectChanges = effectChanges;
    return this;
  }

  public MoveDetail addEffectChangesItem(MoveDetailEffectChangesInner effectChangesItem) {
    if (this.effectChanges == null) {
      this.effectChanges = new ArrayList<>();
    }
    this.effectChanges.add(effectChangesItem);
    return this;
  }

  /**
   * Get effectChanges
   * @return effectChanges
   */
  @NotNull @Valid 
  @Schema(name = "effect_changes", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("effect_changes")
  public List<@Valid MoveDetailEffectChangesInner> getEffectChanges() {
    return effectChanges;
  }

  public void setEffectChanges(List<@Valid MoveDetailEffectChangesInner> effectChanges) {
    this.effectChanges = effectChanges;
  }

  public MoveDetail generation(GenerationSummary generation) {
    this.generation = generation;
    return this;
  }

  /**
   * Get generation
   * @return generation
   */
  @NotNull @Valid 
  @Schema(name = "generation", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("generation")
  public GenerationSummary getGeneration() {
    return generation;
  }

  public void setGeneration(GenerationSummary generation) {
    this.generation = generation;
  }

  public MoveDetail meta(MoveMeta meta) {
    this.meta = meta;
    return this;
  }

  /**
   * Get meta
   * @return meta
   */
  @Valid 
  @Schema(name = "meta", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("meta")
  public MoveMeta getMeta() {
    return meta;
  }

  public void setMeta(MoveMeta meta) {
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
   * Get names
   * @return names
   */
  @NotNull @Valid 
  @Schema(name = "names", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("names")
  public List<@Valid MoveName> getNames() {
    return names;
  }

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
   * Get pastValues
   * @return pastValues
   */
  @NotNull @Valid 
  @Schema(name = "past_values", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("past_values")
  public List<@Valid MoveChange> getPastValues() {
    return pastValues;
  }

  public void setPastValues(List<@Valid MoveChange> pastValues) {
    this.pastValues = pastValues;
  }

  public MoveDetail statChanges(List<@Valid MoveDetailStatChangesInner> statChanges) {
    this.statChanges = statChanges;
    return this;
  }

  public MoveDetail addStatChangesItem(MoveDetailStatChangesInner statChangesItem) {
    if (this.statChanges == null) {
      this.statChanges = new ArrayList<>();
    }
    this.statChanges.add(statChangesItem);
    return this;
  }

  /**
   * Get statChanges
   * @return statChanges
   */
  @NotNull @Valid 
  @Schema(name = "stat_changes", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("stat_changes")
  public List<@Valid MoveDetailStatChangesInner> getStatChanges() {
    return statChanges;
  }

  public void setStatChanges(List<@Valid MoveDetailStatChangesInner> statChanges) {
    this.statChanges = statChanges;
  }

  public MoveDetail superContestEffect(SuperContestEffectSummary superContestEffect) {
    this.superContestEffect = superContestEffect;
    return this;
  }

  /**
   * Get superContestEffect
   * @return superContestEffect
   */
  @NotNull @Valid 
  @Schema(name = "super_contest_effect", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("super_contest_effect")
  public SuperContestEffectSummary getSuperContestEffect() {
    return superContestEffect;
  }

  public void setSuperContestEffect(SuperContestEffectSummary superContestEffect) {
    this.superContestEffect = superContestEffect;
  }

  public MoveDetail target(MoveTargetSummary target) {
    this.target = target;
    return this;
  }

  /**
   * Get target
   * @return target
   */
  @NotNull @Valid 
  @Schema(name = "target", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("target")
  public MoveTargetSummary getTarget() {
    return target;
  }

  public void setTarget(MoveTargetSummary target) {
    this.target = target;
  }

  public MoveDetail type(TypeSummary type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @NotNull @Valid 
  @Schema(name = "type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public TypeSummary getType() {
    return type;
  }

  public void setType(TypeSummary type) {
    this.type = type;
  }

  public MoveDetail machines(List<@Valid MoveDetailMachinesInner> machines) {
    this.machines = machines;
    return this;
  }

  public MoveDetail addMachinesItem(MoveDetailMachinesInner machinesItem) {
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
  public List<@Valid MoveDetailMachinesInner> getMachines() {
    return machines;
  }

  public void setMachines(List<@Valid MoveDetailMachinesInner> machines) {
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
   * Get flavorTextEntries
   * @return flavorTextEntries
   */
  @NotNull @Valid 
  @Schema(name = "flavor_text_entries", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("flavor_text_entries")
  public List<@Valid MoveFlavorText> getFlavorTextEntries() {
    return flavorTextEntries;
  }

  public void setFlavorTextEntries(List<@Valid MoveFlavorText> flavorTextEntries) {
    this.flavorTextEntries = flavorTextEntries;
  }

  public MoveDetail learnedByPokemon(List<@Valid AbilityDetailPokemonInnerPokemon> learnedByPokemon) {
    this.learnedByPokemon = learnedByPokemon;
    return this;
  }

  public MoveDetail addLearnedByPokemonItem(AbilityDetailPokemonInnerPokemon learnedByPokemonItem) {
    if (this.learnedByPokemon == null) {
      this.learnedByPokemon = new ArrayList<>();
    }
    this.learnedByPokemon.add(learnedByPokemonItem);
    return this;
  }

  /**
   * Get learnedByPokemon
   * @return learnedByPokemon
   */
  @NotNull @Valid 
  @Schema(name = "learned_by_pokemon", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("learned_by_pokemon")
  public List<@Valid AbilityDetailPokemonInnerPokemon> getLearnedByPokemon() {
    return learnedByPokemon;
  }

  public void setLearnedByPokemon(List<@Valid AbilityDetailPokemonInnerPokemon> learnedByPokemon) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

