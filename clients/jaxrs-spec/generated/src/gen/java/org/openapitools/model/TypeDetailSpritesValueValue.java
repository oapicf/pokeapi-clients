package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("TypeDetail_sprites_value_value")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-02-07T04:17:57.915073257Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class TypeDetailSpritesValueValue   {
  private URI nameIcon;

  public TypeDetailSpritesValueValue() {
  }

  /**
   **/
  public TypeDetailSpritesValueValue nameIcon(URI nameIcon) {
    this.nameIcon = nameIcon;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("name-icon")
  public URI getNameIcon() {
    return nameIcon;
  }

  @JsonProperty("name-icon")
  public void setNameIcon(URI nameIcon) {
    this.nameIcon = nameIcon;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TypeDetailSpritesValueValue typeDetailSpritesValueValue = (TypeDetailSpritesValueValue) o;
    return Objects.equals(this.nameIcon, typeDetailSpritesValueValue.nameIcon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nameIcon);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TypeDetailSpritesValueValue {\n");
    
    sb.append("    nameIcon: ").append(toIndentedString(nameIcon)).append("\n");
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

