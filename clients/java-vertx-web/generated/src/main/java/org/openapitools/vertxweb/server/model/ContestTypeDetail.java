package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.BerryFlavorSummary;
import org.openapitools.vertxweb.server.model.ContestTypeName;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ContestTypeDetail   {
  
  private Integer id;
  private String name;
  private BerryFlavorSummary berryFlavor;
  private List<ContestTypeName> names = new ArrayList<>();

  public ContestTypeDetail () {

  }

  public ContestTypeDetail (Integer id, String name, BerryFlavorSummary berryFlavor, List<ContestTypeName> names) {
    this.id = id;
    this.name = name;
    this.berryFlavor = berryFlavor;
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

    
  @JsonProperty("berry_flavor")
  public BerryFlavorSummary getBerryFlavor() {
    return berryFlavor;
  }
  public void setBerryFlavor(BerryFlavorSummary berryFlavor) {
    this.berryFlavor = berryFlavor;
  }

    
  @JsonProperty("names")
  public List<ContestTypeName> getNames() {
    return names;
  }
  public void setNames(List<ContestTypeName> names) {
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
    ContestTypeDetail contestTypeDetail = (ContestTypeDetail) o;
    return Objects.equals(id, contestTypeDetail.id) &&
        Objects.equals(name, contestTypeDetail.name) &&
        Objects.equals(berryFlavor, contestTypeDetail.berryFlavor) &&
        Objects.equals(names, contestTypeDetail.names);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, berryFlavor, names);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContestTypeDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    berryFlavor: ").append(toIndentedString(berryFlavor)).append("\n");
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
