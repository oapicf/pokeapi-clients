package org.openapitools.model;

import org.openapitools.model.BerryFlavorSummary;
import org.openapitools.model.ContestTypeName;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.26.0")

public class ContestTypeDetail implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The identifier for this resource.
   */
  @JsonProperty("id")
  private Integer id;

  /**
   * The name for this resource.
   */
  @JsonProperty("name")
  private String name;

  /**
   * The berry flavor that correlates with this contest type.
   */
  @JsonProperty("berry_flavor")
  private BerryFlavorSummary berryFlavor;

  /**
   * The name of this contest type listed in different languages.
   */
  @JsonProperty("names")
  private List<ContestTypeName> names = new ArrayList<>();

  /**
   * The identifier for this resource.
   * @return id
   */
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The name for this resource.
   * @return name
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The berry flavor that correlates with this contest type.
   * @return berryFlavor
   */
  public BerryFlavorSummary getBerryFlavor() {
    return berryFlavor;
  }

  public void setBerryFlavor(BerryFlavorSummary berryFlavor) {
    this.berryFlavor = berryFlavor;
  }

  /**
   * The name of this contest type listed in different languages.
   * @return names
   */
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
    return Objects.equals(this.id, contestTypeDetail.id) &&
        Objects.equals(this.name, contestTypeDetail.name) &&
        Objects.equals(this.berryFlavor, contestTypeDetail.berryFlavor) &&
        Objects.equals(this.names, contestTypeDetail.names);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
