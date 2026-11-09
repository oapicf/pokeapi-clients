package apimodels;

import apimodels.LanguageName;
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
 * LanguageDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-11-09T13:49:31.462302702Z[Etc/UTC]", comments = "Generator version: 7.26.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class LanguageDetail   {
  @JsonProperty("id")
  @NotNull

  private Integer id;

  @JsonProperty("name")
  @NotNull
@Size(max=200)

  private String name;

  @JsonProperty("official")
  
  private Boolean official;

  @JsonProperty("iso639")
  @NotNull
@Size(max=10)

  private String iso639;

  @JsonProperty("iso3166")
  @NotNull
@Size(max=2)

  private String iso3166;

  @JsonProperty("names")
  @NotNull
@Valid

  private List<@Valid LanguageName> names = new ArrayList<>();

  public LanguageDetail id(Integer id) {
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

  public LanguageDetail name(String name) {
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

  public LanguageDetail official(Boolean official) {
    this.official = official;
    return this;
  }

   /**
   * Whether or not the games are published in this language.
   * @return official
  **/
  public Boolean getOfficial() {
    return official;
  }

  public void setOfficial(Boolean official) {
    this.official = official;
  }

  public LanguageDetail iso639(String iso639) {
    this.iso639 = iso639;
    return this;
  }

   /**
   * The two-letter ISO 639-1 language code. Multiple PokéAPI language records may share this code.
   * @return iso639
  **/
  public String getIso639() {
    return iso639;
  }

  public void setIso639(String iso639) {
    this.iso639 = iso639;
  }

  public LanguageDetail iso3166(String iso3166) {
    this.iso3166 = iso3166;
    return this;
  }

   /**
   * The two-letter ISO 3166-1 alpha-2 code of the country or region associated with this language record. Multiple PokéAPI language records may share this code.
   * @return iso3166
  **/
  public String getIso3166() {
    return iso3166;
  }

  public void setIso3166(String iso3166) {
    this.iso3166 = iso3166;
  }

  public LanguageDetail names(List<@Valid LanguageName> names) {
    this.names = names;
    return this;
  }

  public LanguageDetail addNamesItem(LanguageName namesItem) {
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
  public List<@Valid LanguageName> getNames() {
    return names;
  }

  public void setNames(List<@Valid LanguageName> names) {
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
    LanguageDetail languageDetail = (LanguageDetail) o;
    return Objects.equals(id, languageDetail.id) &&
        Objects.equals(name, languageDetail.name) &&
        Objects.equals(official, languageDetail.official) &&
        Objects.equals(iso639, languageDetail.iso639) &&
        Objects.equals(iso3166, languageDetail.iso3166) &&
        Objects.equals(names, languageDetail.names);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, official, iso639, iso3166, names);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LanguageDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    official: ").append(toIndentedString(official)).append("\n");
    sb.append("    iso639: ").append(toIndentedString(iso639)).append("\n");
    sb.append("    iso3166: ").append(toIndentedString(iso3166)).append("\n");
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

