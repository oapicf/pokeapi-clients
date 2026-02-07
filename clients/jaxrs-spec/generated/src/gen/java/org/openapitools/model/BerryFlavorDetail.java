package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BerryFlavorDetailBerriesInner;
import org.openapitools.model.BerryFlavorName;
import org.openapitools.model.ContestTypeSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("BerryFlavorDetail")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-02-07T04:17:57.915073257Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class BerryFlavorDetail   {
  private Integer id;
  private String name;
  private @Valid List<@Valid BerryFlavorDetailBerriesInner> berries = new ArrayList<>();
  private ContestTypeSummary contestType;
  private @Valid List<@Valid BerryFlavorName> names = new ArrayList<>();

  public BerryFlavorDetail() {
  }

  @JsonCreator
  public BerryFlavorDetail(
    @JsonProperty(required = true, value = "id") Integer id,
    @JsonProperty(required = true, value = "name") String name,
    @JsonProperty(required = true, value = "berries") List<@Valid BerryFlavorDetailBerriesInner> berries,
    @JsonProperty(required = true, value = "contest_type") ContestTypeSummary contestType,
    @JsonProperty(required = true, value = "names") List<@Valid BerryFlavorName> names
  ) {
    this.id = id;
    this.name = name;
    this.berries = berries;
    this.contestType = contestType;
    this.names = names;
  }

  /**
   **/
  public BerryFlavorDetail id(Integer id) {
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
  public BerryFlavorDetail name(String name) {
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
  public BerryFlavorDetail berries(List<@Valid BerryFlavorDetailBerriesInner> berries) {
    this.berries = berries;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "berries")
  @NotNull @Valid public List<@Valid BerryFlavorDetailBerriesInner> getBerries() {
    return berries;
  }

  @JsonProperty(required = true, value = "berries")
  public void setBerries(List<@Valid BerryFlavorDetailBerriesInner> berries) {
    this.berries = berries;
  }

  public BerryFlavorDetail addBerriesItem(BerryFlavorDetailBerriesInner berriesItem) {
    if (this.berries == null) {
      this.berries = new ArrayList<>();
    }

    this.berries.add(berriesItem);
    return this;
  }

  public BerryFlavorDetail removeBerriesItem(BerryFlavorDetailBerriesInner berriesItem) {
    if (berriesItem != null && this.berries != null) {
      this.berries.remove(berriesItem);
    }

    return this;
  }
  /**
   **/
  public BerryFlavorDetail contestType(ContestTypeSummary contestType) {
    this.contestType = contestType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "contest_type")
  @NotNull @Valid public ContestTypeSummary getContestType() {
    return contestType;
  }

  @JsonProperty(required = true, value = "contest_type")
  public void setContestType(ContestTypeSummary contestType) {
    this.contestType = contestType;
  }

  /**
   **/
  public BerryFlavorDetail names(List<@Valid BerryFlavorName> names) {
    this.names = names;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "names")
  @NotNull @Valid public List<@Valid BerryFlavorName> getNames() {
    return names;
  }

  @JsonProperty(required = true, value = "names")
  public void setNames(List<@Valid BerryFlavorName> names) {
    this.names = names;
  }

  public BerryFlavorDetail addNamesItem(BerryFlavorName namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<>();
    }

    this.names.add(namesItem);
    return this;
  }

  public BerryFlavorDetail removeNamesItem(BerryFlavorName namesItem) {
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
    BerryFlavorDetail berryFlavorDetail = (BerryFlavorDetail) o;
    return Objects.equals(this.id, berryFlavorDetail.id) &&
        Objects.equals(this.name, berryFlavorDetail.name) &&
        Objects.equals(this.berries, berryFlavorDetail.berries) &&
        Objects.equals(this.contestType, berryFlavorDetail.contestType) &&
        Objects.equals(this.names, berryFlavorDetail.names);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, berries, contestType, names);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BerryFlavorDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    berries: ").append(toIndentedString(berries)).append("\n");
    sb.append("    contestType: ").append(toIndentedString(contestType)).append("\n");
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

