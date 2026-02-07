package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-07T04:17:47.675703185Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class BerryFlavorDetail   {
  
  private Integer id;
  private String name;
  private List<@Valid BerryFlavorDetailBerriesInner> berries = new ArrayList<>();
  private ContestTypeSummary contestType;
  private List<@Valid BerryFlavorName> names = new ArrayList<>();

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("id")
  @NotNull
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("name")
  @NotNull
 @Size(max=100)  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("berries")
  @NotNull
  @Valid
  public List<@Valid BerryFlavorDetailBerriesInner> getBerries() {
    return berries;
  }
  public void setBerries(List<@Valid BerryFlavorDetailBerriesInner> berries) {
    this.berries = berries;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("contest_type")
  @NotNull
  @Valid
  public ContestTypeSummary getContestType() {
    return contestType;
  }
  public void setContestType(ContestTypeSummary contestType) {
    this.contestType = contestType;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("names")
  @NotNull
  @Valid
  public List<@Valid BerryFlavorName> getNames() {
    return names;
  }
  public void setNames(List<@Valid BerryFlavorName> names) {
    this.names = names;
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

