package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.vertxweb.server.model.MoveMetaCategoryDescription;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MoveMetaCategoryDetail   {
  
  private Integer id;
  private String name;
  private List<MoveMetaCategoryDescription> descriptions = new ArrayList<>();
  private List<AbilityDetailPokemonInnerPokemon> moves = new ArrayList<>();

  public MoveMetaCategoryDetail () {

  }

  public MoveMetaCategoryDetail (Integer id, String name, List<MoveMetaCategoryDescription> descriptions, List<AbilityDetailPokemonInnerPokemon> moves) {
    this.id = id;
    this.name = name;
    this.descriptions = descriptions;
    this.moves = moves;
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

    
  @JsonProperty("descriptions")
  public List<MoveMetaCategoryDescription> getDescriptions() {
    return descriptions;
  }
  public void setDescriptions(List<MoveMetaCategoryDescription> descriptions) {
    this.descriptions = descriptions;
  }

    
  @JsonProperty("moves")
  public List<AbilityDetailPokemonInnerPokemon> getMoves() {
    return moves;
  }
  public void setMoves(List<AbilityDetailPokemonInnerPokemon> moves) {
    this.moves = moves;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MoveMetaCategoryDetail moveMetaCategoryDetail = (MoveMetaCategoryDetail) o;
    return Objects.equals(id, moveMetaCategoryDetail.id) &&
        Objects.equals(name, moveMetaCategoryDetail.name) &&
        Objects.equals(descriptions, moveMetaCategoryDetail.descriptions) &&
        Objects.equals(moves, moveMetaCategoryDetail.moves);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, descriptions, moves);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoveMetaCategoryDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
    sb.append("    moves: ").append(toIndentedString(moves)).append("\n");
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
