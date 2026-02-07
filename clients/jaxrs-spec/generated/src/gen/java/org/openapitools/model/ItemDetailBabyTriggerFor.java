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



@JsonTypeName("ItemDetail_baby_trigger_for")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-02-07T04:17:57.915073257Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ItemDetailBabyTriggerFor   {
  private URI url;

  public ItemDetailBabyTriggerFor() {
  }

  @JsonCreator
  public ItemDetailBabyTriggerFor(
    @JsonProperty(required = true, value = "url") URI url
  ) {
    this.url = url;
  }

  /**
   **/
  public ItemDetailBabyTriggerFor url(URI url) {
    this.url = url;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "url")
  @NotNull public URI getUrl() {
    return url;
  }

  @JsonProperty(required = true, value = "url")
  public void setUrl(URI url) {
    this.url = url;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemDetailBabyTriggerFor itemDetailBabyTriggerFor = (ItemDetailBabyTriggerFor) o;
    return Objects.equals(this.url, itemDetailBabyTriggerFor.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemDetailBabyTriggerFor {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

