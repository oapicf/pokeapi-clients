package org.openapitools.model;

import org.openapitools.model.LanguageName;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.26.0")

public class LanguageDetail implements Serializable {
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
   * Whether or not the games are published in this language.
   */
  @JsonProperty("official")
  private Boolean official;

  /**
   * The two-letter ISO 639-1 language code. Multiple PokéAPI language records may share this code.
   */
  @JsonProperty("iso639")
  private String iso639;

  /**
   * The two-letter ISO 3166-1 alpha-2 code of the country or region associated with this language record. Multiple PokéAPI language records may share this code.
   */
  @JsonProperty("iso3166")
  private String iso3166;

  /**
   * The name of this resource listed in different languages.
   */
  @JsonProperty("names")
  private List<LanguageName> names = new ArrayList<>();

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
   * Whether or not the games are published in this language.
   * @return official
   */
  public Boolean getOfficial() {
    return official;
  }

  public void setOfficial(Boolean official) {
    this.official = official;
  }

  /**
   * The two-letter ISO 639-1 language code. Multiple PokéAPI language records may share this code.
   * @return iso639
   */
  public String getIso639() {
    return iso639;
  }

  public void setIso639(String iso639) {
    this.iso639 = iso639;
  }

  /**
   * The two-letter ISO 3166-1 alpha-2 code of the country or region associated with this language record. Multiple PokéAPI language records may share this code.
   * @return iso3166
   */
  public String getIso3166() {
    return iso3166;
  }

  public void setIso3166(String iso3166) {
    this.iso3166 = iso3166;
  }

  /**
   * The name of this resource listed in different languages.
   * @return names
   */
  public List<LanguageName> getNames() {
    return names;
  }

  public void setNames(List<LanguageName> names) {
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
    return Objects.equals(this.id, languageDetail.id) &&
        Objects.equals(this.name, languageDetail.name) &&
        Objects.equals(this.official, languageDetail.official) &&
        Objects.equals(this.iso639, languageDetail.iso639) &&
        Objects.equals(this.iso3166, languageDetail.iso3166) &&
        Objects.equals(this.names, languageDetail.names);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, official, iso639, iso3166, names);
  }

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
