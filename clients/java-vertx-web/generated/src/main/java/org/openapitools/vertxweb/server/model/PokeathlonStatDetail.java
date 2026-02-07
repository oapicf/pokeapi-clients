package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.PokeathlonStatDetailAffectingNatures;
import org.openapitools.vertxweb.server.model.PokeathlonStatName;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PokeathlonStatDetail   {
  
  private Integer id;
  private String name;
  private PokeathlonStatDetailAffectingNatures affectingNatures;
  private List<PokeathlonStatName> names = new ArrayList<>();

  public PokeathlonStatDetail () {

  }

  public PokeathlonStatDetail (Integer id, String name, PokeathlonStatDetailAffectingNatures affectingNatures, List<PokeathlonStatName> names) {
    this.id = id;
    this.name = name;
    this.affectingNatures = affectingNatures;
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

    
  @JsonProperty("affecting_natures")
  public PokeathlonStatDetailAffectingNatures getAffectingNatures() {
    return affectingNatures;
  }
  public void setAffectingNatures(PokeathlonStatDetailAffectingNatures affectingNatures) {
    this.affectingNatures = affectingNatures;
  }

    
  @JsonProperty("names")
  public List<PokeathlonStatName> getNames() {
    return names;
  }
  public void setNames(List<PokeathlonStatName> names) {
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
    PokeathlonStatDetail pokeathlonStatDetail = (PokeathlonStatDetail) o;
    return Objects.equals(id, pokeathlonStatDetail.id) &&
        Objects.equals(name, pokeathlonStatDetail.name) &&
        Objects.equals(affectingNatures, pokeathlonStatDetail.affectingNatures) &&
        Objects.equals(names, pokeathlonStatDetail.names);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, affectingNatures, names);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokeathlonStatDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    affectingNatures: ").append(toIndentedString(affectingNatures)).append("\n");
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
