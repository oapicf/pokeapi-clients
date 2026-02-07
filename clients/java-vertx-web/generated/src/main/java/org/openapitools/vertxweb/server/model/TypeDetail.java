package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.vertxweb.server.model.AbilityName;
import org.openapitools.vertxweb.server.model.GenerationSummary;
import org.openapitools.vertxweb.server.model.MoveDamageClassSummary;
import org.openapitools.vertxweb.server.model.MoveSummary;
import org.openapitools.vertxweb.server.model.TypeDetailDamageRelations;
import org.openapitools.vertxweb.server.model.TypeDetailPastDamageRelationsInner;
import org.openapitools.vertxweb.server.model.TypeDetailPokemonInner;
import org.openapitools.vertxweb.server.model.TypeDetailSpritesValueValue;
import org.openapitools.vertxweb.server.model.TypeGameIndex;

/**
 * Serializer for the Type resource
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TypeDetail   {
  
  private Integer id;
  private String name;
  private TypeDetailDamageRelations damageRelations;
  private List<TypeDetailPastDamageRelationsInner> pastDamageRelations = new ArrayList<>();
  private List<TypeGameIndex> gameIndices = new ArrayList<>();
  private GenerationSummary generation;
  private MoveDamageClassSummary moveDamageClass;
  private List<AbilityName> names = new ArrayList<>();
  private List<TypeDetailPokemonInner> pokemon = new ArrayList<>();
  private List<MoveSummary> moves = new ArrayList<>();
  private Map<String, Map<String, TypeDetailSpritesValueValue>> sprites = new HashMap<>();

  public TypeDetail () {

  }

  public TypeDetail (Integer id, String name, TypeDetailDamageRelations damageRelations, List<TypeDetailPastDamageRelationsInner> pastDamageRelations, List<TypeGameIndex> gameIndices, GenerationSummary generation, MoveDamageClassSummary moveDamageClass, List<AbilityName> names, List<TypeDetailPokemonInner> pokemon, List<MoveSummary> moves, Map<String, Map<String, TypeDetailSpritesValueValue>> sprites) {
    this.id = id;
    this.name = name;
    this.damageRelations = damageRelations;
    this.pastDamageRelations = pastDamageRelations;
    this.gameIndices = gameIndices;
    this.generation = generation;
    this.moveDamageClass = moveDamageClass;
    this.names = names;
    this.pokemon = pokemon;
    this.moves = moves;
    this.sprites = sprites;
  }

    
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("damage_relations")
  public TypeDetailDamageRelations getDamageRelations() {
    return damageRelations;
  }
  public void setDamageRelations(TypeDetailDamageRelations damageRelations) {
    this.damageRelations = damageRelations;
  }

    
  @JsonProperty("past_damage_relations")
  public List<TypeDetailPastDamageRelationsInner> getPastDamageRelations() {
    return pastDamageRelations;
  }
  public void setPastDamageRelations(List<TypeDetailPastDamageRelationsInner> pastDamageRelations) {
    this.pastDamageRelations = pastDamageRelations;
  }

    
  @JsonProperty("game_indices")
  public List<TypeGameIndex> getGameIndices() {
    return gameIndices;
  }
  public void setGameIndices(List<TypeGameIndex> gameIndices) {
    this.gameIndices = gameIndices;
  }

    
  @JsonProperty("generation")
  public GenerationSummary getGeneration() {
    return generation;
  }
  public void setGeneration(GenerationSummary generation) {
    this.generation = generation;
  }

    
  @JsonProperty("move_damage_class")
  public MoveDamageClassSummary getMoveDamageClass() {
    return moveDamageClass;
  }
  public void setMoveDamageClass(MoveDamageClassSummary moveDamageClass) {
    this.moveDamageClass = moveDamageClass;
  }

    
  @JsonProperty("names")
  public List<AbilityName> getNames() {
    return names;
  }
  public void setNames(List<AbilityName> names) {
    this.names = names;
  }

    
  @JsonProperty("pokemon")
  public List<TypeDetailPokemonInner> getPokemon() {
    return pokemon;
  }
  public void setPokemon(List<TypeDetailPokemonInner> pokemon) {
    this.pokemon = pokemon;
  }

    
  @JsonProperty("moves")
  public List<MoveSummary> getMoves() {
    return moves;
  }
  public void setMoves(List<MoveSummary> moves) {
    this.moves = moves;
  }

    
  @JsonProperty("sprites")
  public Map<String, Map<String, TypeDetailSpritesValueValue>> getSprites() {
    return sprites;
  }
  public void setSprites(Map<String, Map<String, TypeDetailSpritesValueValue>> sprites) {
    this.sprites = sprites;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TypeDetail typeDetail = (TypeDetail) o;
    return Objects.equals(id, typeDetail.id) &&
        Objects.equals(name, typeDetail.name) &&
        Objects.equals(damageRelations, typeDetail.damageRelations) &&
        Objects.equals(pastDamageRelations, typeDetail.pastDamageRelations) &&
        Objects.equals(gameIndices, typeDetail.gameIndices) &&
        Objects.equals(generation, typeDetail.generation) &&
        Objects.equals(moveDamageClass, typeDetail.moveDamageClass) &&
        Objects.equals(names, typeDetail.names) &&
        Objects.equals(pokemon, typeDetail.pokemon) &&
        Objects.equals(moves, typeDetail.moves) &&
        Objects.equals(sprites, typeDetail.sprites);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, damageRelations, pastDamageRelations, gameIndices, generation, moveDamageClass, names, pokemon, moves, sprites);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TypeDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    damageRelations: ").append(toIndentedString(damageRelations)).append("\n");
    sb.append("    pastDamageRelations: ").append(toIndentedString(pastDamageRelations)).append("\n");
    sb.append("    gameIndices: ").append(toIndentedString(gameIndices)).append("\n");
    sb.append("    generation: ").append(toIndentedString(generation)).append("\n");
    sb.append("    moveDamageClass: ").append(toIndentedString(moveDamageClass)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    pokemon: ").append(toIndentedString(pokemon)).append("\n");
    sb.append("    moves: ").append(toIndentedString(moves)).append("\n");
    sb.append("    sprites: ").append(toIndentedString(sprites)).append("\n");
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
