package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * TypeDetailSpritesValueValue
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-02-07T04:17:07.396624034Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class TypeDetailSpritesValueValue   {
  @JsonProperty("name-icon")
  private URI nameIcon;

  public TypeDetailSpritesValueValue nameIcon(URI nameIcon) {
    this.nameIcon = nameIcon;
    return this;
  }

  /**
   * Get nameIcon
   * @return nameIcon
   */
  @ApiModelProperty(value = "")
  public URI getNameIcon() {
    return nameIcon;
  }

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

