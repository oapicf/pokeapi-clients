package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.AbilityDetailPokemonInnerPokemon;
import com.prokarma.pkmst.model.ContestEffectSummary;
import com.prokarma.pkmst.model.ContestTypeSummary;
import com.prokarma.pkmst.model.GenerationSummary;
import com.prokarma.pkmst.model.MoveChange;
import com.prokarma.pkmst.model.MoveChangeEffectEntriesInner;
import com.prokarma.pkmst.model.MoveDamageClassSummary;
import com.prokarma.pkmst.model.MoveDetailContestCombos;
import com.prokarma.pkmst.model.MoveDetailEffectChangesInner;
import com.prokarma.pkmst.model.MoveDetailMachinesInner;
import com.prokarma.pkmst.model.MoveDetailStatChangesInner;
import com.prokarma.pkmst.model.MoveFlavorText;
import com.prokarma.pkmst.model.MoveMeta;
import com.prokarma.pkmst.model.MoveName;
import com.prokarma.pkmst.model.MoveTargetSummary;
import com.prokarma.pkmst.model.SuperContestEffectSummary;
import com.prokarma.pkmst.model.TypeSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * MoveDetail
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-02-07T04:17:07.396624034Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class MoveDetail   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("accuracy")
  private Integer accuracy;

  @JsonProperty("effect_chance")
  private Integer effectChance;

  @JsonProperty("pp")
  private Integer pp;

  @JsonProperty("priority")
  private Integer priority;

  @JsonProperty("power")
  private Integer power;

  @JsonProperty("contest_combos")
  private MoveDetailContestCombos contestCombos;

  @JsonProperty("contest_type")
  private ContestTypeSummary contestType;

  @JsonProperty("contest_effect")
  private ContestEffectSummary contestEffect;

  @JsonProperty("damage_class")
  private MoveDamageClassSummary damageClass;

  @JsonProperty("effect_entries")
  
  private List<MoveChangeEffectEntriesInner> effectEntries = new ArrayList<>();

  @JsonProperty("effect_changes")
  
  private List<MoveDetailEffectChangesInner> effectChanges = new ArrayList<>();

  @JsonProperty("generation")
  private GenerationSummary generation;

  @JsonProperty("meta")
  private MoveMeta meta;

  @JsonProperty("names")
  
  private List<MoveName> names = new ArrayList<>();

  @JsonProperty("past_values")
  
  private List<MoveChange> pastValues = new ArrayList<>();

  @JsonProperty("stat_changes")
  
  private List<MoveDetailStatChangesInner> statChanges = new ArrayList<>();

  @JsonProperty("super_contest_effect")
  private SuperContestEffectSummary superContestEffect;

  @JsonProperty("target")
  private MoveTargetSummary target;

  @JsonProperty("type")
  private TypeSummary type;

  @JsonProperty("machines")
  
  private List<MoveDetailMachinesInner> machines = new ArrayList<>();

  @JsonProperty("flavor_text_entries")
  
  private List<MoveFlavorText> flavorTextEntries = new ArrayList<>();

  @JsonProperty("learned_by_pokemon")
  
  private List<AbilityDetailPokemonInnerPokemon> learnedByPokemon = new ArrayList<>();

  public MoveDetail id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @ApiModelProperty(required = true, readOnly = true, value = "")
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
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MoveDetail accuracy(Integer accuracy) {
    this.accuracy = accuracy;
    return this;
  }

  /**
   * Get accuracy
   * @return accuracy
   */
  @ApiModelProperty(value = "")
  public Integer getAccuracy() {
    return accuracy;
  }

  public void setAccuracy(Integer accuracy) {
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
  @ApiModelProperty(required = true, value = "")
  public Integer getEffectChance() {
    return effectChance;
  }

  public void setEffectChance(Integer effectChance) {
    this.effectChance = effectChance;
  }

  public MoveDetail pp(Integer pp) {
    this.pp = pp;
    return this;
  }

  /**
   * Get pp
   * @return pp
   */
  @ApiModelProperty(value = "")
  public Integer getPp() {
    return pp;
  }

  public void setPp(Integer pp) {
    this.pp = pp;
  }

  public MoveDetail priority(Integer priority) {
    this.priority = priority;
    return this;
  }

  /**
   * Get priority
   * @return priority
   */
  @ApiModelProperty(value = "")
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public MoveDetail power(Integer power) {
    this.power = power;
    return this;
  }

  /**
   * Get power
   * @return power
   */
  @ApiModelProperty(value = "")
  public Integer getPower() {
    return power;
  }

  public void setPower(Integer power) {
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
  @ApiModelProperty(required = true, value = "")
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
  @ApiModelProperty(required = true, value = "")
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
  @ApiModelProperty(required = true, value = "")
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
  @ApiModelProperty(required = true, value = "")
  public MoveDamageClassSummary getDamageClass() {
    return damageClass;
  }

  public void setDamageClass(MoveDamageClassSummary damageClass) {
    this.damageClass = damageClass;
  }

  public MoveDetail effectEntries(List<MoveChangeEffectEntriesInner> effectEntries) {
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
  @ApiModelProperty(required = true, value = "")
  public List<MoveChangeEffectEntriesInner> getEffectEntries() {
    return effectEntries;
  }

  public void setEffectEntries(List<MoveChangeEffectEntriesInner> effectEntries) {
    this.effectEntries = effectEntries;
  }

  public MoveDetail effectChanges(List<MoveDetailEffectChangesInner> effectChanges) {
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
  @ApiModelProperty(required = true, value = "")
  public List<MoveDetailEffectChangesInner> getEffectChanges() {
    return effectChanges;
  }

  public void setEffectChanges(List<MoveDetailEffectChangesInner> effectChanges) {
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
  @ApiModelProperty(required = true, value = "")
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
  @ApiModelProperty(required = true, readOnly = true, value = "")
  public MoveMeta getMeta() {
    return meta;
  }

  public void setMeta(MoveMeta meta) {
    this.meta = meta;
  }

  public MoveDetail names(List<MoveName> names) {
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
  @ApiModelProperty(required = true, value = "")
  public List<MoveName> getNames() {
    return names;
  }

  public void setNames(List<MoveName> names) {
    this.names = names;
  }

  public MoveDetail pastValues(List<MoveChange> pastValues) {
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
  @ApiModelProperty(required = true, value = "")
  public List<MoveChange> getPastValues() {
    return pastValues;
  }

  public void setPastValues(List<MoveChange> pastValues) {
    this.pastValues = pastValues;
  }

  public MoveDetail statChanges(List<MoveDetailStatChangesInner> statChanges) {
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
  @ApiModelProperty(required = true, value = "")
  public List<MoveDetailStatChangesInner> getStatChanges() {
    return statChanges;
  }

  public void setStatChanges(List<MoveDetailStatChangesInner> statChanges) {
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
  @ApiModelProperty(required = true, value = "")
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
  @ApiModelProperty(required = true, value = "")
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
  @ApiModelProperty(required = true, value = "")
  public TypeSummary getType() {
    return type;
  }

  public void setType(TypeSummary type) {
    this.type = type;
  }

  public MoveDetail machines(List<MoveDetailMachinesInner> machines) {
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
  @ApiModelProperty(required = true, value = "")
  public List<MoveDetailMachinesInner> getMachines() {
    return machines;
  }

  public void setMachines(List<MoveDetailMachinesInner> machines) {
    this.machines = machines;
  }

  public MoveDetail flavorTextEntries(List<MoveFlavorText> flavorTextEntries) {
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
  @ApiModelProperty(required = true, value = "")
  public List<MoveFlavorText> getFlavorTextEntries() {
    return flavorTextEntries;
  }

  public void setFlavorTextEntries(List<MoveFlavorText> flavorTextEntries) {
    this.flavorTextEntries = flavorTextEntries;
  }

  public MoveDetail learnedByPokemon(List<AbilityDetailPokemonInnerPokemon> learnedByPokemon) {
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
  @ApiModelProperty(required = true, value = "")
  public List<AbilityDetailPokemonInnerPokemon> getLearnedByPokemon() {
    return learnedByPokemon;
  }

  public void setLearnedByPokemon(List<AbilityDetailPokemonInnerPokemon> learnedByPokemon) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

