package org.openapitools.model;

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
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class MoveDetail  {
  
 /**
  * The identifier for this resource.
  */
  @ApiModelProperty(required = true, value = "The identifier for this resource.")

  private Integer id;

 /**
  * The name for this resource.
  */
  @ApiModelProperty(required = true, value = "The name for this resource.")

  private String name;

 /**
  * The percent value of how likely this move is to be successful.
  */
  @ApiModelProperty(value = "The percent value of how likely this move is to be successful.")

  private Integer accuracy;

 /**
  * The percent value of how likely it is this moves effect will happen.
  */
  @ApiModelProperty(required = true, value = "The percent value of how likely it is this moves effect will happen.")

  private Integer effectChance;

 /**
  * Power points. The number of times this move can be used.
  */
  @ApiModelProperty(value = "Power points. The number of times this move can be used.")

  private Integer pp;

 /**
  * A value between -8 and 8. Sets the order in which moves are executed during battle. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Priority) for greater detail.
  */
  @ApiModelProperty(value = "A value between -8 and 8. Sets the order in which moves are executed during battle. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Priority) for greater detail.")

  private Integer priority;

 /**
  * The base power of this move, or null if it has no fixed base power.
  */
  @ApiModelProperty(value = "The base power of this move, or null if it has no fixed base power.")

  private Integer power;

 /**
  * A detail of normal and super contest combos that require this move.
  */
  @ApiModelProperty(required = true, value = "A detail of normal and super contest combos that require this move.")

  @Valid

  private MoveCombos contestCombos;

 /**
  * The type of appeal this move gives a Pokémon when used in a contest.
  */
  @ApiModelProperty(required = true, value = "The type of appeal this move gives a Pokémon when used in a contest.")

  @Valid

  private ContestTypeSummary contestType;

 /**
  * The effect the move has when used in a contest.
  */
  @ApiModelProperty(required = true, value = "The effect the move has when used in a contest.")

  @Valid

  private ContestEffectSummary contestEffect;

 /**
  * The type of damage the move inflicts on the target, e.g. physical.
  */
  @ApiModelProperty(required = true, value = "The type of damage the move inflicts on the target, e.g. physical.")

  @Valid

  private MoveDamageClassSummary damageClass;

 /**
  * The effect of this move listed in different languages.
  */
  @ApiModelProperty(required = true, value = "The effect of this move listed in different languages.")

  private List<@Valid MoveEffectEffectText> effectEntries = new ArrayList<>();

 /**
  * The list of previous effects this move has had across version groups of the games.
  */
  @ApiModelProperty(required = true, value = "The list of previous effects this move has had across version groups of the games.")

  private List<@Valid MoveEffectChange> effectChanges = new ArrayList<>();

 /**
  * The generation in which this move was introduced.
  */
  @ApiModelProperty(required = true, value = "The generation in which this move was introduced.")

  @Valid

  private GenerationSummary generation;

 /**
  * Metadata about this move
  */
  @ApiModelProperty(required = true, value = "Metadata about this move")

  @Valid

  private MoveMeta meta;

 /**
  * The name of this resource listed in different languages.
  */
  @ApiModelProperty(required = true, value = "The name of this resource listed in different languages.")

  private List<@Valid MoveName> names = new ArrayList<>();

 /**
  * A list of move resource value changes across version groups of the game.
  */
  @ApiModelProperty(required = true, value = "A list of move resource value changes across version groups of the game.")

  private List<@Valid MoveChange> pastValues = new ArrayList<>();

 /**
  * A list of stats this moves effects and how much it effects them.
  */
  @ApiModelProperty(required = true, value = "A list of stats this moves effects and how much it effects them.")

  private List<@Valid MoveMetaStatChange> statChanges = new ArrayList<>();

 /**
  * The effect the move has when used in a super contest.
  */
  @ApiModelProperty(required = true, value = "The effect the move has when used in a super contest.")

  @Valid

  private SuperContestEffectSummary superContestEffect;

 /**
  * The type of target that will receive the effects of the attack.
  */
  @ApiModelProperty(required = true, value = "The type of target that will receive the effects of the attack.")

  @Valid

  private MoveTargetSummary target;

 /**
  * The elemental type of this move.
  */
  @ApiModelProperty(required = true, value = "The elemental type of this move.")

  @Valid

  private TypeSummary type;

 /**
  * A list of the machines that teach this move.
  */
  @ApiModelProperty(required = true, value = "A list of the machines that teach this move.")

  private List<@Valid ItemMachine> machines = new ArrayList<>();

 /**
  * The flavor text of this move listed in different languages.
  */
  @ApiModelProperty(required = true, value = "The flavor text of this move listed in different languages.")

  private List<@Valid MoveFlavorText> flavorTextEntries = new ArrayList<>();

 /**
  * List of Pokemon that can learn the move
  */
  @ApiModelProperty(required = true, value = "List of Pokemon that can learn the move")

  private List<@Valid PokemonSummary> learnedByPokemon = new ArrayList<>();
 /**
   * The identifier for this resource.
   * @return id
  **/
  @JsonProperty("id")
  @NotNull
  public Integer getId() {
    return id;
  }


 /**
   * The name for this resource.
   * @return name
  **/
  @JsonProperty("name")
  @NotNull
 @Size(max=200)  public String getName() {
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
   * The percent value of how likely this move is to be successful.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return accuracy
  **/
  @JsonProperty("accuracy")
 @Min(-2147483648) @Max(2147483647)  public Integer getAccuracy() {
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
   * The percent value of how likely it is this moves effect will happen.
   * @return effectChance
  **/
  @JsonProperty("effect_chance")
  @NotNull
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
   * Power points. The number of times this move can be used.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return pp
  **/
  @JsonProperty("pp")
 @Min(-2147483648) @Max(2147483647)  public Integer getPp() {
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
   * A value between -8 and 8. Sets the order in which moves are executed during battle. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Priority) for greater detail.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return priority
  **/
  @JsonProperty("priority")
 @Min(-2147483648) @Max(2147483647)  public Integer getPriority() {
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
   * The base power of this move, or null if it has no fixed base power.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return power
  **/
  @JsonProperty("power")
 @Min(-2147483648) @Max(2147483647)  public Integer getPower() {
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
   * A detail of normal and super contest combos that require this move.
   * @return contestCombos
  **/
  @JsonProperty("contest_combos")
  @NotNull
  public MoveCombos getContestCombos() {
    return contestCombos;
  }


 /**
   * The type of appeal this move gives a Pokémon when used in a contest.
   * @return contestType
  **/
  @JsonProperty("contest_type")
  @NotNull
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
   * The effect the move has when used in a contest.
   * @return contestEffect
  **/
  @JsonProperty("contest_effect")
  @NotNull
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
   * The type of damage the move inflicts on the target, e.g. physical.
   * @return damageClass
  **/
  @JsonProperty("damage_class")
  @NotNull
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
   * The effect of this move listed in different languages.
   * @return effectEntries
  **/
  @JsonProperty("effect_entries")
  @NotNull
  public List<@Valid MoveEffectEffectText> getEffectEntries() {
    return effectEntries;
  }


 /**
   * The list of previous effects this move has had across version groups of the games.
   * @return effectChanges
  **/
  @JsonProperty("effect_changes")
  @NotNull
  public List<@Valid MoveEffectChange> getEffectChanges() {
    return effectChanges;
  }


 /**
   * The generation in which this move was introduced.
   * @return generation
  **/
  @JsonProperty("generation")
  @NotNull
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
   * Metadata about this move
   * @return meta
  **/
  @JsonProperty("meta")
  @NotNull
  public MoveMeta getMeta() {
    return meta;
  }


 /**
   * The name of this resource listed in different languages.
   * @return names
  **/
  @JsonProperty("names")
  @NotNull
  public List<@Valid MoveName> getNames() {
    return names;
  }


 /**
   * A list of move resource value changes across version groups of the game.
   * @return pastValues
  **/
  @JsonProperty("past_values")
  @NotNull
  public List<@Valid MoveChange> getPastValues() {
    return pastValues;
  }


 /**
   * A list of stats this moves effects and how much it effects them.
   * @return statChanges
  **/
  @JsonProperty("stat_changes")
  @NotNull
  public List<@Valid MoveMetaStatChange> getStatChanges() {
    return statChanges;
  }


 /**
   * The effect the move has when used in a super contest.
   * @return superContestEffect
  **/
  @JsonProperty("super_contest_effect")
  @NotNull
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
   * The type of target that will receive the effects of the attack.
   * @return target
  **/
  @JsonProperty("target")
  @NotNull
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
   * The elemental type of this move.
   * @return type
  **/
  @JsonProperty("type")
  @NotNull
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
   * A list of the machines that teach this move.
   * @return machines
  **/
  @JsonProperty("machines")
  @NotNull
  public List<@Valid ItemMachine> getMachines() {
    return machines;
  }


 /**
   * The flavor text of this move listed in different languages.
   * @return flavorTextEntries
  **/
  @JsonProperty("flavor_text_entries")
  @NotNull
  public List<@Valid MoveFlavorText> getFlavorTextEntries() {
    return flavorTextEntries;
  }


 /**
   * List of Pokemon that can learn the move
   * @return learnedByPokemon
  **/
  @JsonProperty("learned_by_pokemon")
  @NotNull
  public List<@Valid PokemonSummary> getLearnedByPokemon() {
    return learnedByPokemon;
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

