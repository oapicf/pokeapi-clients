package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.BerrySummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("BerryFlavorBerryMap")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-11-09T13:50:06.168269698Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class BerryFlavorBerryMap   {
  private Integer potency;
  private BerrySummary berry;

  public BerryFlavorBerryMap() {
  }

  @JsonCreator
  public BerryFlavorBerryMap(
    @JsonProperty(required = true, value = "potency") Integer potency,
    @JsonProperty(required = true, value = "berry") BerrySummary berry
  ) {
    this.potency = potency;
    this.berry = berry;
  }

  /**
   * How powerful the referenced flavor is for this berry.
   * minimum: -2147483648
   * maximum: 2147483647
   **/
  public BerryFlavorBerryMap potency(Integer potency) {
    this.potency = potency;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "How powerful the referenced flavor is for this berry.")
  @JsonProperty(required = true, value = "potency")
  @NotNull  @Min(-2147483648) @Max(2147483647)public Integer getPotency() {
    return potency;
  }

  @JsonProperty(required = true, value = "potency")
  public void setPotency(Integer potency) {
    this.potency = potency;
  }

  /**
   * The berry with the referenced flavor.
   **/
  public BerryFlavorBerryMap berry(BerrySummary berry) {
    this.berry = berry;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The berry with the referenced flavor.")
  @JsonProperty(required = true, value = "berry")
  @NotNull @Valid public BerrySummary getBerry() {
    return berry;
  }

  @JsonProperty(required = true, value = "berry")
  public void setBerry(BerrySummary berry) {
    this.berry = berry;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BerryFlavorBerryMap berryFlavorBerryMap = (BerryFlavorBerryMap) o;
    return Objects.equals(this.potency, berryFlavorBerryMap.potency) &&
        Objects.equals(this.berry, berryFlavorBerryMap.berry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(potency, berry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BerryFlavorBerryMap {\n");
    
    sb.append("    potency: ").append(toIndentedString(potency)).append("\n");
    sb.append("    berry: ").append(toIndentedString(berry)).append("\n");
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
