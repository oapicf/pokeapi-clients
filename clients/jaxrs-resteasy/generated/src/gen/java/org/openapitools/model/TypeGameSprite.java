package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-11-09T13:50:00.159999817Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class TypeGameSprite   {
  
  private String nameIcon;
  private String symbolIcon;

  /**
   * The URL of the icon displaying the type name in this game, or null if unavailable.
   **/
  
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
   **/
  
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

