package org.openapitools.model;

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

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class MoveDetail  {
  
  @ApiModelProperty(required = true, value = "")

  private Integer id;

  @ApiModelProperty(required = true, value = "")

  private String name;

  @ApiModelProperty(value = "")

  private Integer accuracy;

  @ApiModelProperty(required = true, value = "")

  private Integer effectChance;

  @ApiModelProperty(value = "")

  private Integer pp;

  @ApiModelProperty(value = "")

  private Integer priority;

  @ApiModelProperty(value = "")

  private Integer power;

  @ApiModelProperty(required = true, value = "")

  private MoveDetailContestCombos contestCombos;

  @ApiModelProperty(required = true, value = "")

  private ContestTypeSummary contestType;

  @ApiModelProperty(required = true, value = "")

  private ContestEffectSummary contestEffect;

  @ApiModelProperty(required = true, value = "")

  private MoveDamageClassSummary damageClass;

  @ApiModelProperty(required = true, value = "")

  private List<MoveChangeEffectEntriesInner> effectEntries = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  private List<MoveDetailEffectChangesInner> effectChanges = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  private GenerationSummary generation;

  @ApiModelProperty(required = true, value = "")

  private MoveMeta meta;

  @ApiModelProperty(required = true, value = "")

  private List<MoveName> names = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  private List<MoveChange> pastValues = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  private List<MoveDetailStatChangesInner> statChanges = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  private SuperContestEffectSummary superContestEffect;

  @ApiModelProperty(required = true, value = "")

  private MoveTargetSummary target;

  @ApiModelProperty(required = true, value = "")

  private TypeSummary type;

  @ApiModelProperty(required = true, value = "")

  private List<MoveDetailMachinesInner> machines = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  private List<MoveFlavorText> flavorTextEntries = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  private List<AbilityDetailPokemonInnerPokemon> learnedByPokemon = new ArrayList<>();
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }


 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MoveDetail name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get accuracy
   * @return accuracy
  **/
  @JsonProperty("accuracy")
  public Integer getAccuracy() {
    return accuracy;
  }

  public void setAccuracy(Integer accuracy) {
    this.accuracy = accuracy;
  }

  public MoveDetail accuracy(Integer accuracy) {
    this.accuracy = accuracy;
    return this;
  }

 /**
   * Get effectChance
   * @return effectChance
  **/
  @JsonProperty("effect_chance")
  public Integer getEffectChance() {
    return effectChance;
  }

  public void setEffectChance(Integer effectChance) {
    this.effectChance = effectChance;
  }

  public MoveDetail effectChance(Integer effectChance) {
    this.effectChance = effectChance;
    return this;
  }

 /**
   * Get pp
   * @return pp
  **/
  @JsonProperty("pp")
  public Integer getPp() {
    return pp;
  }

  public void setPp(Integer pp) {
    this.pp = pp;
  }

  public MoveDetail pp(Integer pp) {
    this.pp = pp;
    return this;
  }

 /**
   * Get priority
   * @return priority
  **/
  @JsonProperty("priority")
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public MoveDetail priority(Integer priority) {
    this.priority = priority;
    return this;
  }

 /**
   * Get power
   * @return power
  **/
  @JsonProperty("power")
  public Integer getPower() {
    return power;
  }

  public void setPower(Integer power) {
    this.power = power;
  }

  public MoveDetail power(Integer power) {
    this.power = power;
    return this;
  }

 /**
   * Get contestCombos
   * @return contestCombos
  **/
  @JsonProperty("contest_combos")
  public MoveDetailContestCombos getContestCombos() {
    return contestCombos;
  }

  public void setContestCombos(MoveDetailContestCombos contestCombos) {
    this.contestCombos = contestCombos;
  }

  public MoveDetail contestCombos(MoveDetailContestCombos contestCombos) {
    this.contestCombos = contestCombos;
    return this;
  }

 /**
   * Get contestType
   * @return contestType
  **/
  @JsonProperty("contest_type")
  public ContestTypeSummary getContestType() {
    return contestType;
  }

  public void setContestType(ContestTypeSummary contestType) {
    this.contestType = contestType;
  }

  public MoveDetail contestType(ContestTypeSummary contestType) {
    this.contestType = contestType;
    return this;
  }

 /**
   * Get contestEffect
   * @return contestEffect
  **/
  @JsonProperty("contest_effect")
  public ContestEffectSummary getContestEffect() {
    return contestEffect;
  }

  public void setContestEffect(ContestEffectSummary contestEffect) {
    this.contestEffect = contestEffect;
  }

  public MoveDetail contestEffect(ContestEffectSummary contestEffect) {
    this.contestEffect = contestEffect;
    return this;
  }

 /**
   * Get damageClass
   * @return damageClass
  **/
  @JsonProperty("damage_class")
  public MoveDamageClassSummary getDamageClass() {
    return damageClass;
  }

  public void setDamageClass(MoveDamageClassSummary damageClass) {
    this.damageClass = damageClass;
  }

  public MoveDetail damageClass(MoveDamageClassSummary damageClass) {
    this.damageClass = damageClass;
    return this;
  }

 /**
   * Get effectEntries
   * @return effectEntries
  **/
  @JsonProperty("effect_entries")
  public List<MoveChangeEffectEntriesInner> getEffectEntries() {
    return effectEntries;
  }

  public void setEffectEntries(List<MoveChangeEffectEntriesInner> effectEntries) {
    this.effectEntries = effectEntries;
  }

  public MoveDetail effectEntries(List<MoveChangeEffectEntriesInner> effectEntries) {
    this.effectEntries = effectEntries;
    return this;
  }

  public MoveDetail addEffectEntriesItem(MoveChangeEffectEntriesInner effectEntriesItem) {
    this.effectEntries.add(effectEntriesItem);
    return this;
  }

 /**
   * Get effectChanges
   * @return effectChanges
  **/
  @JsonProperty("effect_changes")
  public List<MoveDetailEffectChangesInner> getEffectChanges() {
    return effectChanges;
  }

  public void setEffectChanges(List<MoveDetailEffectChangesInner> effectChanges) {
    this.effectChanges = effectChanges;
  }

  public MoveDetail effectChanges(List<MoveDetailEffectChangesInner> effectChanges) {
    this.effectChanges = effectChanges;
    return this;
  }

  public MoveDetail addEffectChangesItem(MoveDetailEffectChangesInner effectChangesItem) {
    this.effectChanges.add(effectChangesItem);
    return this;
  }

 /**
   * Get generation
   * @return generation
  **/
  @JsonProperty("generation")
  public GenerationSummary getGeneration() {
    return generation;
  }

  public void setGeneration(GenerationSummary generation) {
    this.generation = generation;
  }

  public MoveDetail generation(GenerationSummary generation) {
    this.generation = generation;
    return this;
  }

 /**
   * Get meta
   * @return meta
  **/
  @JsonProperty("meta")
  public MoveMeta getMeta() {
    return meta;
  }


 /**
   * Get names
   * @return names
  **/
  @JsonProperty("names")
  public List<MoveName> getNames() {
    return names;
  }

  public void setNames(List<MoveName> names) {
    this.names = names;
  }

  public MoveDetail names(List<MoveName> names) {
    this.names = names;
    return this;
  }

  public MoveDetail addNamesItem(MoveName namesItem) {
    this.names.add(namesItem);
    return this;
  }

 /**
   * Get pastValues
   * @return pastValues
  **/
  @JsonProperty("past_values")
  public List<MoveChange> getPastValues() {
    return pastValues;
  }

  public void setPastValues(List<MoveChange> pastValues) {
    this.pastValues = pastValues;
  }

  public MoveDetail pastValues(List<MoveChange> pastValues) {
    this.pastValues = pastValues;
    return this;
  }

  public MoveDetail addPastValuesItem(MoveChange pastValuesItem) {
    this.pastValues.add(pastValuesItem);
    return this;
  }

 /**
   * Get statChanges
   * @return statChanges
  **/
  @JsonProperty("stat_changes")
  public List<MoveDetailStatChangesInner> getStatChanges() {
    return statChanges;
  }

  public void setStatChanges(List<MoveDetailStatChangesInner> statChanges) {
    this.statChanges = statChanges;
  }

  public MoveDetail statChanges(List<MoveDetailStatChangesInner> statChanges) {
    this.statChanges = statChanges;
    return this;
  }

  public MoveDetail addStatChangesItem(MoveDetailStatChangesInner statChangesItem) {
    this.statChanges.add(statChangesItem);
    return this;
  }

 /**
   * Get superContestEffect
   * @return superContestEffect
  **/
  @JsonProperty("super_contest_effect")
  public SuperContestEffectSummary getSuperContestEffect() {
    return superContestEffect;
  }

  public void setSuperContestEffect(SuperContestEffectSummary superContestEffect) {
    this.superContestEffect = superContestEffect;
  }

  public MoveDetail superContestEffect(SuperContestEffectSummary superContestEffect) {
    this.superContestEffect = superContestEffect;
    return this;
  }

 /**
   * Get target
   * @return target
  **/
  @JsonProperty("target")
  public MoveTargetSummary getTarget() {
    return target;
  }

  public void setTarget(MoveTargetSummary target) {
    this.target = target;
  }

  public MoveDetail target(MoveTargetSummary target) {
    this.target = target;
    return this;
  }

 /**
   * Get type
   * @return type
  **/
  @JsonProperty("type")
  public TypeSummary getType() {
    return type;
  }

  public void setType(TypeSummary type) {
    this.type = type;
  }

  public MoveDetail type(TypeSummary type) {
    this.type = type;
    return this;
  }

 /**
   * Get machines
   * @return machines
  **/
  @JsonProperty("machines")
  public List<MoveDetailMachinesInner> getMachines() {
    return machines;
  }

  public void setMachines(List<MoveDetailMachinesInner> machines) {
    this.machines = machines;
  }

  public MoveDetail machines(List<MoveDetailMachinesInner> machines) {
    this.machines = machines;
    return this;
  }

  public MoveDetail addMachinesItem(MoveDetailMachinesInner machinesItem) {
    this.machines.add(machinesItem);
    return this;
  }

 /**
   * Get flavorTextEntries
   * @return flavorTextEntries
  **/
  @JsonProperty("flavor_text_entries")
  public List<MoveFlavorText> getFlavorTextEntries() {
    return flavorTextEntries;
  }

  public void setFlavorTextEntries(List<MoveFlavorText> flavorTextEntries) {
    this.flavorTextEntries = flavorTextEntries;
  }

  public MoveDetail flavorTextEntries(List<MoveFlavorText> flavorTextEntries) {
    this.flavorTextEntries = flavorTextEntries;
    return this;
  }

  public MoveDetail addFlavorTextEntriesItem(MoveFlavorText flavorTextEntriesItem) {
    this.flavorTextEntries.add(flavorTextEntriesItem);
    return this;
  }

 /**
   * Get learnedByPokemon
   * @return learnedByPokemon
  **/
  @JsonProperty("learned_by_pokemon")
  public List<AbilityDetailPokemonInnerPokemon> getLearnedByPokemon() {
    return learnedByPokemon;
  }

  public void setLearnedByPokemon(List<AbilityDetailPokemonInnerPokemon> learnedByPokemon) {
    this.learnedByPokemon = learnedByPokemon;
  }

  public MoveDetail learnedByPokemon(List<AbilityDetailPokemonInnerPokemon> learnedByPokemon) {
    this.learnedByPokemon = learnedByPokemon;
    return this;
  }

  public MoveDetail addLearnedByPokemonItem(AbilityDetailPokemonInnerPokemon learnedByPokemonItem) {
    this.learnedByPokemon.add(learnedByPokemonItem);
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
    MoveDetail moveDetail = (MoveDetail) o;
    return Objects.equals(this.id, moveDetail.id) &&
        Objects.equals(this.name, moveDetail.name) &&
        Objects.equals(this.accuracy, moveDetail.accuracy) &&
        Objects.equals(this.effectChance, moveDetail.effectChance) &&
        Objects.equals(this.pp, moveDetail.pp) &&
        Objects.equals(this.priority, moveDetail.priority) &&
        Objects.equals(this.power, moveDetail.power) &&
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

  @Override
  public int hashCode() {
    return Objects.hash(id, name, accuracy, effectChance, pp, priority, power, contestCombos, contestType, contestEffect, damageClass, effectEntries, effectChanges, generation, meta, names, pastValues, statChanges, superContestEffect, target, type, machines, flavorTextEntries, learnedByPokemon);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

