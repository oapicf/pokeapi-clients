package apimodels;

import apimodels.PokeathlonStatAffectingNatures;
import apimodels.PokeathlonStatName;
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
 * PokeathlonStatDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-11-09T13:49:31.462302702Z[Etc/UTC]", comments = "Generator version: 7.26.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PokeathlonStatDetail   {
  @JsonProperty("id")
  @NotNull

  private Integer id;

  @JsonProperty("name")
  @NotNull
@Size(max=200)

  private String name;

  @JsonProperty("affecting_natures")
  @NotNull
@Valid

  private PokeathlonStatAffectingNatures affectingNatures;

  @JsonProperty("names")
  @NotNull
@Valid

  private List<@Valid PokeathlonStatName> names = new ArrayList<>();

  public PokeathlonStatDetail id(Integer id) {
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

  public PokeathlonStatDetail name(String name) {
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

  public PokeathlonStatDetail affectingNatures(PokeathlonStatAffectingNatures affectingNatures) {
    this.affectingNatures = affectingNatures;
    return this;
  }

   /**
   * A detail of natures which affect this Pokéathlon stat positively or negatively.
   * @return affectingNatures
  **/
  public PokeathlonStatAffectingNatures getAffectingNatures() {
    return affectingNatures;
  }

  public void setAffectingNatures(PokeathlonStatAffectingNatures affectingNatures) {
    this.affectingNatures = affectingNatures;
  }

  public PokeathlonStatDetail names(List<@Valid PokeathlonStatName> names) {
    this.names = names;
    return this;
  }

  public PokeathlonStatDetail addNamesItem(PokeathlonStatName namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<>();
    }
    this.names.add(namesItem);
    return this;
  }

   /**
   * The name of this resource listed in different languages.
   * @return names
  **/
  public List<@Valid PokeathlonStatName> getNames() {
    return names;
  }

  public void setNames(List<@Valid PokeathlonStatName> names) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

