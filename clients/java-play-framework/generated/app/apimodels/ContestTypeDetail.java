package apimodels;

import apimodels.BerryFlavorSummary;
import apimodels.ContestTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ContestTypeDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-11-09T13:49:31.462302702Z[Etc/UTC]", comments = "Generator version: 7.26.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ContestTypeDetail   {
  @JsonProperty("id")
  @NotNull

  private Integer id;

  @JsonProperty("name")
  @NotNull
@Size(max=200)

  private String name;

  @JsonProperty("berry_flavor")
  @NotNull
@Valid

  private BerryFlavorSummary berryFlavor;

  @JsonProperty("names")
  @NotNull
@Valid

  private List<@Valid ContestTypeName> names = new ArrayList<>();

  public ContestTypeDetail id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * The identifier for this resource.
   * @return id
  **/
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public ContestTypeDetail name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name for this resource.
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ContestTypeDetail berryFlavor(BerryFlavorSummary berryFlavor) {
    this.berryFlavor = berryFlavor;
    return this;
  }

   /**
   * The berry flavor that correlates with this contest type.
   * @return berryFlavor
  **/
  public BerryFlavorSummary getBerryFlavor() {
    return berryFlavor;
  }

  public void setBerryFlavor(BerryFlavorSummary berryFlavor) {
    this.berryFlavor = berryFlavor;
  }

  public ContestTypeDetail names(List<@Valid ContestTypeName> names) {
    this.names = names;
    return this;
  }

  public ContestTypeDetail addNamesItem(ContestTypeName namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<>();
    }
    this.names.add(namesItem);
    return this;
  }

   /**
   * The name of this contest type listed in different languages.
   * @return names
  **/
  public List<@Valid ContestTypeName> getNames() {
    return names;
  }

  public void setNames(List<@Valid ContestTypeName> names) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

