package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * TypeGameSprite
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-11-09T13:49:28.343088631Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class TypeGameSprite   {
  @JsonProperty("name_icon")
  private String nameIcon;

  @JsonProperty("symbol_icon")
  private String symbolIcon;

  public TypeGameSprite nameIcon(String nameIcon) {
    this.nameIcon = nameIcon;
    return this;
  }

  /**
   * The URL of the icon displaying the type name in this game, or null if unavailable.
   * @return nameIcon
   */
  @ApiModelProperty(value = "The URL of the icon displaying the type name in this game, or null if unavailable.")
  public String getNameIcon() {
    return nameIcon;
  }

  public void setNameIcon(String nameIcon) {
    this.nameIcon = nameIcon;
  }

  public TypeGameSprite symbolIcon(String symbolIcon) {
    this.symbolIcon = symbolIcon;
    return this;
  }

  /**
   * The URL of the type symbol icon in this game, or null if unavailable.
   * @return symbolIcon
   */
  @ApiModelProperty(value = "The URL of the type symbol icon in this game, or null if unavailable.")
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
    return Objects.equals(this.nameIcon, typeGameSprite.nameIcon) &&
        Objects.equals(this.symbolIcon, typeGameSprite.symbolIcon);
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

