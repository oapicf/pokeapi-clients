package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.BerryFlavorDetailBerriesInner;
import org.openapitools.vertxweb.server.model.BerryFlavorName;
import org.openapitools.vertxweb.server.model.ContestTypeSummary;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BerryFlavorDetail   {
  
  private Integer id;
  private String name;
  private List<BerryFlavorDetailBerriesInner> berries = new ArrayList<>();
  private ContestTypeSummary contestType;
  private List<BerryFlavorName> names = new ArrayList<>();

  public BerryFlavorDetail () {

  }

  public BerryFlavorDetail (Integer id, String name, List<BerryFlavorDetailBerriesInner> berries, ContestTypeSummary contestType, List<BerryFlavorName> names) {
    this.id = id;
    this.name = name;
    this.berries = berries;
    this.contestType = contestType;
    this.names = names;
  }

    
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("berries")
  public List<BerryFlavorDetailBerriesInner> getBerries() {
    return berries;
  }
  public void setBerries(List<BerryFlavorDetailBerriesInner> berries) {
    this.berries = berries;
  }

    
  @JsonProperty("contest_type")
  public ContestTypeSummary getContestType() {
    return contestType;
  }
  public void setContestType(ContestTypeSummary contestType) {
    this.contestType = contestType;
  }

    
  @JsonProperty("names")
  public List<BerryFlavorName> getNames() {
    return names;
  }
  public void setNames(List<BerryFlavorName> names) {
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
    return Objects.equals(id, berryFlavorDetail.id) &&
        Objects.equals(name, berryFlavorDetail.name) &&
        Objects.equals(berries, berryFlavorDetail.berries) &&
        Objects.equals(contestType, berryFlavorDetail.contestType) &&
        Objects.equals(names, berryFlavorDetail.names);
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
