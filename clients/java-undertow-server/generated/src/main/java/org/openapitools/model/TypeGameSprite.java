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
import org.openapitools.jackson.nullable.JsonNullable;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-11-09T13:49:34.675912514Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class TypeGameSprite   {
  
  private String nameIcon;
  private String symbolIcon;

  /**
   * The URL of the icon displaying the type name in this game, or null if unavailable.
   */
  public TypeGameSprite nameIcon(String nameIcon) {
    this.nameIcon = nameIcon;
    return this;
  }

  
  @ApiModelProperty(value = "The URL of the icon displaying the type name in this game, or null if unavailable.")
  @JsonProperty("name_icon")
  public String getNameIcon() {
    return nameIcon;
  }
  public void setNameIcon(String nameIcon) {
    this.nameIcon = nameIcon;
  }

  /**
   * The URL of the type symbol icon in this game, or null if unavailable.
   */
  public TypeGameSprite symbolIcon(String symbolIcon) {
    this.symbolIcon = symbolIcon;
    return this;
  }

  
  @ApiModelProperty(value = "The URL of the type symbol icon in this game, or null if unavailable.")
  @JsonProperty("symbol_icon")
  public String getSymbolIcon() {
    return symbolIcon;
  }
  public void setSymbolIcon(String symbolIcon) {
    this.symbolIcon = symbolIcon;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TypeGameSprite typeGameSprite = (TypeGameSprite) o;
    return Objects.equals(nameIcon, typeGameSprite.nameIcon) &&
        Objects.equals(symbolIcon, typeGameSprite.symbolIcon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nameIcon, symbolIcon);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TypeGameSprite {\n");
    
    sb.append("    nameIcon: ").append(toIndentedString(nameIcon)).append("\n");
    sb.append("    symbolIcon: ").append(toIndentedString(symbolIcon)).append("\n");
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

