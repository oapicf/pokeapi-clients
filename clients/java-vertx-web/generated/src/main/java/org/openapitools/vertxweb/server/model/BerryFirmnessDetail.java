package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.BerryFirmnessName;
import org.openapitools.vertxweb.server.model.BerrySummary;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BerryFirmnessDetail   {
  
  private Integer id;
  private String name;
  private List<BerrySummary> berries = new ArrayList<>();
  private List<BerryFirmnessName> names = new ArrayList<>();

  public BerryFirmnessDetail () {

  }

  public BerryFirmnessDetail (Integer id, String name, List<BerrySummary> berries, List<BerryFirmnessName> names) {
    this.id = id;
    this.name = name;
    this.berries = berries;
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
  public List<BerrySummary> getBerries() {
    return berries;
  }
  public void setBerries(List<BerrySummary> berries) {
    this.berries = berries;
  }

    
  @JsonProperty("names")
  public List<BerryFirmnessName> getNames() {
    return names;
  }
  public void setNames(List<BerryFirmnessName> names) {
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
    BerryFirmnessDetail berryFirmnessDetail = (BerryFirmnessDetail) o;
    return Objects.equals(id, berryFirmnessDetail.id) &&
        Objects.equals(name, berryFirmnessDetail.name) &&
        Objects.equals(berries, berryFirmnessDetail.berries) &&
        Objects.equals(names, berryFirmnessDetail.names);
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
