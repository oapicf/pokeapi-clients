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
import org.openapitools.model.MoveComboUsage;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-11-09T13:49:34.675912514Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class MoveCombos   {
  
  private MoveComboUsage normal;
  private MoveComboUsage _super;

  /**
   * A detail of moves this move can be used before or after, granting additional appeal points in contests.
   */
  public MoveCombos normal(MoveComboUsage normal) {
    this.normal = normal;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A detail of moves this move can be used before or after, granting additional appeal points in contests.")
  @JsonProperty("normal")
  public MoveComboUsage getNormal() {
    return normal;
  }
  public void setNormal(MoveComboUsage normal) {
    this.normal = normal;
  }

  /**
   * A detail of moves this move can be used before or after, granting additional appeal points in super contests.
   */
  public MoveCombos _super(MoveComboUsage _super) {
    this._super = _super;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A detail of moves this move can be used before or after, granting additional appeal points in super contests.")
  @JsonProperty("super")
  public MoveComboUsage getSuper() {
    return _super;
  }
  public void setSuper(MoveComboUsage _super) {
    this._super = _super;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MoveCombos moveCombos = (MoveCombos) o;
    return Objects.equals(normal, moveCombos.normal) &&
        Objects.equals(_super, moveCombos._super);
  }

  @Override
  public int hashCode() {
    return Objects.hash(normal, _super);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoveCombos {\n");
    
    sb.append("    normal: ").append(toIndentedString(normal)).append("\n");
    sb.append("    _super: ").append(toIndentedString(_super)).append("\n");
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

