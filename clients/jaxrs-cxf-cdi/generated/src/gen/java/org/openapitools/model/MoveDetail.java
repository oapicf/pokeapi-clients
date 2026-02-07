package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class MoveDetail   {
  
  private Integer id;

  private String name;

  private Integer accuracy;

  private Integer effectChance;

  private Integer pp;

  private Integer priority;

  private Integer power;

  private MoveDetailContestCombos contestCombos;

  private ContestTypeSummary contestType;

  private ContestEffectSummary contestEffect;

  private MoveDamageClassSummary damageClass;

  private List<@Valid MoveChangeEffectEntriesInner> effectEntries = new ArrayList<>();

  private List<@Valid MoveDetailEffectChangesInner> effectChanges = new ArrayList<>();

  private GenerationSummary generation;

  private MoveMeta meta;

  private List<@Valid MoveName> names = new ArrayList<>();

  private List<@Valid MoveChange> pastValues = new ArrayList<>();

  private List<@Valid MoveDetailStatChangesInner> statChanges = new ArrayList<>();

  private SuperContestEffectSummary superContestEffect;

  private MoveTargetSummary target;

  private TypeSummary type;

  private List<@Valid MoveDetailMachinesInner> machines = new ArrayList<>();

  private List<@Valid MoveFlavorText> flavorTextEntries = new ArrayList<>();

  private List<@Valid AbilityDetailPokemonInnerPokemon> learnedByPokemon = new ArrayList<>();

  /**
   **/
  public MoveDetail id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("id")
  @NotNull
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }


  /**
   **/
  public MoveDetail name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("name")
  @NotNull
 @Size(max=100)  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   **/
  public MoveDetail accuracy(Integer accuracy) {
    this.accuracy = accuracy;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("accuracy")
  public Integer getAccuracy() {
    return accuracy;
  }
  public void setAccuracy(Integer accuracy) {
    this.accuracy = accuracy;
  }


  /**
   **/
  public MoveDetail effectChance(Integer effectChance) {
    this.effectChance = effectChance;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("effect_chance")
  @NotNull
  public Integer getEffectChance() {
    return effectChance;
  }
  public void setEffectChance(Integer effectChance) {
    this.effectChance = effectChance;
  }


  /**
   **/
  public MoveDetail pp(Integer pp) {
    this.pp = pp;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("pp")
  public Integer getPp() {
    return pp;
  }
  public void setPp(Integer pp) {
    this.pp = pp;
  }


  /**
   **/
  public MoveDetail priority(Integer priority) {
    this.priority = priority;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("priority")
  public Integer getPriority() {
    return priority;
  }
  public void setPriority(Integer priority) {
    this.priority = priority;
  }


  /**
   **/
  public MoveDetail power(Integer power) {
    this.power = power;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("power")
  public Integer getPower() {
    return power;
  }
  public void setPower(Integer power) {
    this.power = power;
  }


  /**
   **/
  public MoveDetail contestCombos(MoveDetailContestCombos contestCombos) {
    this.contestCombos = contestCombos;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("contest_combos")
  @NotNull
  public MoveDetailContestCombos getContestCombos() {
    return contestCombos;
  }
  public void setContestCombos(MoveDetailContestCombos contestCombos) {
    this.contestCombos = contestCombos;
  }


  /**
   **/
  public MoveDetail contestType(ContestTypeSummary contestType) {
    this.contestType = contestType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("contest_type")
  @NotNull
  public ContestTypeSummary getContestType() {
    return contestType;
  }
  public void setContestType(ContestTypeSummary contestType) {
    this.contestType = contestType;
  }


  /**
   **/
  public MoveDetail contestEffect(ContestEffectSummary contestEffect) {
    this.contestEffect = contestEffect;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("contest_effect")
  @NotNull
  public ContestEffectSummary getContestEffect() {
    return contestEffect;
  }
  public void setContestEffect(ContestEffectSummary contestEffect) {
    this.contestEffect = contestEffect;
  }


  /**
   **/
  public MoveDetail damageClass(MoveDamageClassSummary damageClass) {
    this.damageClass = damageClass;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("damage_class")
  @NotNull
  public MoveDamageClassSummary getDamageClass() {
    return damageClass;
  }
  public void setDamageClass(MoveDamageClassSummary damageClass) {
    this.damageClass = damageClass;
  }


  /**
   **/
  public MoveDetail effectEntries(List<@Valid MoveChangeEffectEntriesInner> effectEntries) {
    this.effectEntries = effectEntries;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("effect_entries")
  @NotNull
  public List<@Valid MoveChangeEffectEntriesInner> getEffectEntries() {
    return effectEntries;
  }
  public void setEffectEntries(List<@Valid MoveChangeEffectEntriesInner> effectEntries) {
    this.effectEntries = effectEntries;
  }

  public MoveDetail addEffectEntriesItem(MoveChangeEffectEntriesInner effectEntriesItem) {
    if (this.effectEntries == null) {
      this.effectEntries = new ArrayList<>();
    }
    this.effectEntries.add(effectEntriesItem);
    return this;
  }


  /**
   **/
  public MoveDetail effectChanges(List<@Valid MoveDetailEffectChangesInner> effectChanges) {
    this.effectChanges = effectChanges;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("effect_changes")
  @NotNull
  public List<@Valid MoveDetailEffectChangesInner> getEffectChanges() {
    return effectChanges;
  }
  public void setEffectChanges(List<@Valid MoveDetailEffectChangesInner> effectChanges) {
    this.effectChanges = effectChanges;
  }

  public MoveDetail addEffectChangesItem(MoveDetailEffectChangesInner effectChangesItem) {
    if (this.effectChanges == null) {
      this.effectChanges = new ArrayList<>();
    }
    this.effectChanges.add(effectChangesItem);
    return this;
  }


  /**
   **/
  public MoveDetail generation(GenerationSummary generation) {
    this.generation = generation;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("generation")
  @NotNull
  public GenerationSummary getGeneration() {
    return generation;
  }
  public void setGeneration(GenerationSummary generation) {
    this.generation = generation;
  }


  /**
   **/
  public MoveDetail meta(MoveMeta meta) {
    this.meta = meta;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("meta")
  @NotNull
  public MoveMeta getMeta() {
    return meta;
  }
  public void setMeta(MoveMeta meta) {
    this.meta = meta;
  }


  /**
   **/
  public MoveDetail names(List<@Valid MoveName> names) {
    this.names = names;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("names")
  @NotNull
  public List<@Valid MoveName> getNames() {
    return names;
  }
  public void setNames(List<@Valid MoveName> names) {
    this.names = names;
  }

  public MoveDetail addNamesItem(MoveName namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<>();
    }
    this.names.add(namesItem);
    return this;
  }


  /**
   **/
  public MoveDetail pastValues(List<@Valid MoveChange> pastValues) {
    this.pastValues = pastValues;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("past_values")
  @NotNull
  public List<@Valid MoveChange> getPastValues() {
    return pastValues;
  }
  public void setPastValues(List<@Valid MoveChange> pastValues) {
    this.pastValues = pastValues;
  }

  public MoveDetail addPastValuesItem(MoveChange pastValuesItem) {
    if (this.pastValues == null) {
      this.pastValues = new ArrayList<>();
    }
    this.pastValues.add(pastValuesItem);
    return this;
  }


  /**
   **/
  public MoveDetail statChanges(List<@Valid MoveDetailStatChangesInner> statChanges) {
    this.statChanges = statChanges;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("stat_changes")
  @NotNull
  public List<@Valid MoveDetailStatChangesInner> getStatChanges() {
    return statChanges;
  }
  public void setStatChanges(List<@Valid MoveDetailStatChangesInner> statChanges) {
    this.statChanges = statChanges;
  }

  public MoveDetail addStatChangesItem(MoveDetailStatChangesInner statChangesItem) {
    if (this.statChanges == null) {
      this.statChanges = new ArrayList<>();
    }
    this.statChanges.add(statChangesItem);
    return this;
  }


  /**
   **/
  public MoveDetail superContestEffect(SuperContestEffectSummary superContestEffect) {
    this.superContestEffect = superContestEffect;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("super_contest_effect")
  @NotNull
  public SuperContestEffectSummary getSuperContestEffect() {
    return superContestEffect;
  }
  public void setSuperContestEffect(SuperContestEffectSummary superContestEffect) {
    this.superContestEffect = superContestEffect;
  }


  /**
   **/
  public MoveDetail target(MoveTargetSummary target) {
    this.target = target;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("target")
  @NotNull
  public MoveTargetSummary getTarget() {
    return target;
  }
  public void setTarget(MoveTargetSummary target) {
    this.target = target;
  }


  /**
   **/
  public MoveDetail type(TypeSummary type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("type")
  @NotNull
  public TypeSummary getType() {
    return type;
  }
  public void setType(TypeSummary type) {
    this.type = type;
  }


  /**
   **/
  public MoveDetail machines(List<@Valid MoveDetailMachinesInner> machines) {
    this.machines = machines;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("machines")
  @NotNull
  public List<@Valid MoveDetailMachinesInner> getMachines() {
    return machines;
  }
  public void setMachines(List<@Valid MoveDetailMachinesInner> machines) {
    this.machines = machines;
  }

  public MoveDetail addMachinesItem(MoveDetailMachinesInner machinesItem) {
    if (this.machines == null) {
      this.machines = new ArrayList<>();
    }
    this.machines.add(machinesItem);
    return this;
  }


  /**
   **/
  public MoveDetail flavorTextEntries(List<@Valid MoveFlavorText> flavorTextEntries) {
    this.flavorTextEntries = flavorTextEntries;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("flavor_text_entries")
  @NotNull
  public List<@Valid MoveFlavorText> getFlavorTextEntries() {
    return flavorTextEntries;
  }
  public void setFlavorTextEntries(List<@Valid MoveFlavorText> flavorTextEntries) {
    this.flavorTextEntries = flavorTextEntries;
  }

  public MoveDetail addFlavorTextEntriesItem(MoveFlavorText flavorTextEntriesItem) {
    if (this.flavorTextEntries == null) {
      this.flavorTextEntries = new ArrayList<>();
    }
    this.flavorTextEntries.add(flavorTextEntriesItem);
    return this;
  }


  /**
   **/
  public MoveDetail learnedByPokemon(List<@Valid AbilityDetailPokemonInnerPokemon> learnedByPokemon) {
    this.learnedByPokemon = learnedByPokemon;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("learned_by_pokemon")
  @NotNull
  public List<@Valid AbilityDetailPokemonInnerPokemon> getLearnedByPokemon() {
    return learnedByPokemon;
  }
  public void setLearnedByPokemon(List<@Valid AbilityDetailPokemonInnerPokemon> learnedByPokemon) {
    this.learnedByPokemon = learnedByPokemon;
  }

  public MoveDetail addLearnedByPokemonItem(AbilityDetailPokemonInnerPokemon learnedByPokemonItem) {
    if (this.learnedByPokemon == null) {
      this.learnedByPokemon = new ArrayList<>();
    }
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

