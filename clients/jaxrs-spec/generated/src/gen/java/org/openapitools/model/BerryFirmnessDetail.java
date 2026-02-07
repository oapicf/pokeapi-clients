package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BerryFirmnessName;
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



@JsonTypeName("BerryFirmnessDetail")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-02-07T04:17:57.915073257Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class BerryFirmnessDetail   {
  private Integer id;
  private String name;
  private @Valid List<@Valid BerrySummary> berries = new ArrayList<>();
  private @Valid List<@Valid BerryFirmnessName> names = new ArrayList<>();

  public BerryFirmnessDetail() {
  }

  @JsonCreator
  public BerryFirmnessDetail(
    @JsonProperty(required = true, value = "id") Integer id,
    @JsonProperty(required = true, value = "name") String name,
    @JsonProperty(required = true, value = "berries") List<@Valid BerrySummary> berries,
    @JsonProperty(required = true, value = "names") List<@Valid BerryFirmnessName> names
  ) {
    this.id = id;
    this.name = name;
    this.berries = berries;
    this.names = names;
  }

  /**
   **/
  public BerryFirmnessDetail id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "id")
  public Integer getId() {
    return id;
  }

  @JsonProperty(required = true, value = "id")
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   **/
  public BerryFirmnessDetail name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "name")
  @NotNull  @Size(max=100)public String getName() {
    return name;
  }

  @JsonProperty(required = true, value = "name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public BerryFirmnessDetail berries(List<@Valid BerrySummary> berries) {
    this.berries = berries;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "berries")
  @NotNull @Valid public List<@Valid BerrySummary> getBerries() {
    return berries;
  }

  @JsonProperty(required = true, value = "berries")
  public void setBerries(List<@Valid BerrySummary> berries) {
    this.berries = berries;
  }

  public BerryFirmnessDetail addBerriesItem(BerrySummary berriesItem) {
    if (this.berries == null) {
      this.berries = new ArrayList<>();
    }

    this.berries.add(berriesItem);
    return this;
  }

  public BerryFirmnessDetail removeBerriesItem(BerrySummary berriesItem) {
    if (berriesItem != null && this.berries != null) {
      this.berries.remove(berriesItem);
    }

    return this;
  }
  /**
   **/
  public BerryFirmnessDetail names(List<@Valid BerryFirmnessName> names) {
    this.names = names;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "names")
  @NotNull @Valid public List<@Valid BerryFirmnessName> getNames() {
    return names;
  }

  @JsonProperty(required = true, value = "names")
  public void setNames(List<@Valid BerryFirmnessName> names) {
    this.names = names;
  }

  public BerryFirmnessDetail addNamesItem(BerryFirmnessName namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<>();
    }

    this.names.add(namesItem);
    return this;
  }

  public BerryFirmnessDetail removeNamesItem(BerryFirmnessName namesItem) {
    if (namesItem != null && this.names != null) {
      this.names.remove(namesItem);
    }

    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BerryFirmnessDetail berryFirmnessDetail = (BerryFirmnessDetail) o;
    return Objects.equals(this.id, berryFirmnessDetail.id) &&
        Objects.equals(this.name, berryFirmnessDetail.name) &&
        Objects.equals(this.berries, berryFirmnessDetail.berries) &&
        Objects.equals(this.names, berryFirmnessDetail.names);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, berries, names);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BerryFirmnessDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    berries: ").append(toIndentedString(berries)).append("\n");
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

