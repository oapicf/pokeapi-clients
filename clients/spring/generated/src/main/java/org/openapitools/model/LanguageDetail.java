package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.LanguageName;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * LanguageDetail
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-09T13:53:47.069318184Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class LanguageDetail {

  private Integer id;

  private String name;

  private @Nullable Boolean official;

  private String iso639;

  private String iso3166;

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
   * The identifier for this resource.
   * @return id
   */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, description = "The identifier for this resource.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  @JsonProperty("id")
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
   */
  @NotNull @Size(max = 200) 
  @Schema(name = "name", description = "The name for this resource.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  public LanguageDetail official(@Nullable Boolean official) {
    this.official = official;
    return this;
  }

  /**
   * Whether or not the games are published in this language.
   * @return official
   */
  
  @Schema(name = "official", description = "Whether or not the games are published in this language.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("official")
  public @Nullable Boolean getOfficial() {
    return official;
  }

  @JsonProperty("official")
  public void setOfficial(@Nullable Boolean official) {
    this.official = official;
  }

  public LanguageDetail iso639(String iso639) {
    this.iso639 = iso639;
    return this;
  }

  /**
   * The two-letter ISO 639-1 language code. Multiple PokéAPI language records may share this code.
   * @return iso639
   */
  @NotNull @Size(max = 10) 
  @Schema(name = "iso639", description = "The two-letter ISO 639-1 language code. Multiple PokéAPI language records may share this code.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("iso639")
  public String getIso639() {
    return iso639;
  }

  @JsonProperty("iso639")
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
   */
  @NotNull @Size(max = 2) 
  @Schema(name = "iso3166", description = "The two-letter ISO 3166-1 alpha-2 code of the country or region associated with this language record. Multiple PokéAPI language records may share this code.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("iso3166")
  public String getIso3166() {
    return iso3166;
  }

  @JsonProperty("iso3166")
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
   */
  
  @Schema(name = "names", accessMode = Schema.AccessMode.READ_ONLY, description = "The name of this resource listed in different languages.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("names")
  public List<@Valid LanguageName> getNames() {
    return names;
  }

  @JsonProperty("names")
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

