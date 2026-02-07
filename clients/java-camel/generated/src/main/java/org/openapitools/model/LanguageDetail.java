package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.LanguageName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * LanguageDetail
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-02-07T04:17:25.266083787Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class LanguageDetail {

  private Integer id;

  private String name;

  private Boolean official;

  private String iso639;

  private String iso3166;

  @Valid
  private List<@Valid LanguageName> names = new ArrayList<>();

  public LanguageDetail() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public LanguageDetail(Integer id, String name, String iso639, String iso3166, List<@Valid LanguageName> names) {
    this.id = id;
    this.name = name;
    this.iso639 = iso639;
    this.iso3166 = iso3166;
    this.names = names;
  }

  public LanguageDetail id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
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
   * Get name
   * @return name
   */
  @NotNull @Size(max = 100) 
  @Schema(name = "name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
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
   * Get official
   * @return official
   */
  
  @Schema(name = "official", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("official")
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
   * Get iso639
   * @return iso639
   */
  @NotNull @Size(max = 10) 
  @Schema(name = "iso639", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("iso639")
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
   * Get iso3166
   * @return iso3166
   */
  @NotNull @Size(max = 2) 
  @Schema(name = "iso3166", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("iso3166")
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
   * Get names
   * @return names
   */
  @NotNull @Valid 
  @Schema(name = "names", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("names")
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

