/*
 * PokéAPI
 *
 * All the Pokémon data you'll ever need in one place, easily accessible through a modern free open-source RESTful API.  ## What is this?  This is a full RESTful API linked to an extensive database detailing everything about the Pokémon main game series.  We've covered everything from Pokémon to Berry Flavors.  ## Where do I start?  We have awesome [documentation](https://pokeapi.co/docs/v2) on how to use this API. It takes minutes to get started.  This API will always be publicly available and will never require any extensive setup process to consume.  Created by [**Paul Hallett**](https://github.com/phalt) and other [**PokéAPI contributors**](https://github.com/PokeAPI/pokeapi#contributing) around the world. Pokémon and Pokémon character names are trademarks of Nintendo.
 *
 * OpenAPI document version: 2.10.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.MoveSummary;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-11-09T13:49:34.675912514Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class MoveComboUsage   {
  
  private List<MoveSummary> useBefore;
  private List<MoveSummary> useAfter;

  /**
   * A list of moves to use before this move.
   */
  public MoveComboUsage useBefore(List<MoveSummary> useBefore) {
    this.useBefore = useBefore;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of moves to use before this move.")
  @JsonProperty("use_before")
  public List<MoveSummary> getUseBefore() {
    return useBefore;
  }
  public void setUseBefore(List<MoveSummary> useBefore) {
    this.useBefore = useBefore;
  }

  /**
   * A list of moves to use after this move.
   */
  public MoveComboUsage useAfter(List<MoveSummary> useAfter) {
    this.useAfter = useAfter;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of moves to use after this move.")
  @JsonProperty("use_after")
  public List<MoveSummary> getUseAfter() {
    return useAfter;
  }
  public void setUseAfter(List<MoveSummary> useAfter) {
    this.useAfter = useAfter;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MoveComboUsage moveComboUsage = (MoveComboUsage) o;
    return Objects.equals(useBefore, moveComboUsage.useBefore) &&
        Objects.equals(useAfter, moveComboUsage.useAfter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(useBefore, useAfter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoveComboUsage {\n");
    
    sb.append("    useBefore: ").append(toIndentedString(useBefore)).append("\n");
    sb.append("    useAfter: ").append(toIndentedString(useAfter)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

