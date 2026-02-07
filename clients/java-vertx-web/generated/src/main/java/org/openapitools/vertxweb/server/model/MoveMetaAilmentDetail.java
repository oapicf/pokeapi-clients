package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.vertxweb.server.model.MoveMetaAilmentName;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MoveMetaAilmentDetail   {
  
  private Integer id;
  private String name;
  private List<AbilityDetailPokemonInnerPokemon> moves = new ArrayList<>();
  private List<MoveMetaAilmentName> names = new ArrayList<>();

  public MoveMetaAilmentDetail () {

  }

  public MoveMetaAilmentDetail (Integer id, String name, List<AbilityDetailPokemonInnerPokemon> moves, List<MoveMetaAilmentName> names) {
    this.id = id;
    this.name = name;
    this.moves = moves;
    this.names = names;
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

    
  @JsonProperty("moves")
  public List<AbilityDetailPokemonInnerPokemon> getMoves() {
    return moves;
  }
  public void setMoves(List<AbilityDetailPokemonInnerPokemon> moves) {
    this.moves = moves;
  }

    
  @JsonProperty("names")
  public List<MoveMetaAilmentName> getNames() {
    return names;
  }
  public void setNames(List<MoveMetaAilmentName> names) {
    this.names = names;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MoveMetaAilmentDetail moveMetaAilmentDetail = (MoveMetaAilmentDetail) o;
    return Objects.equals(id, moveMetaAilmentDetail.id) &&
        Objects.equals(name, moveMetaAilmentDetail.name) &&
        Objects.equals(moves, moveMetaAilmentDetail.moves) &&
        Objects.equals(names, moveMetaAilmentDetail.names);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, moves, names);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoveMetaAilmentDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    moves: ").append(toIndentedString(moves)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
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
