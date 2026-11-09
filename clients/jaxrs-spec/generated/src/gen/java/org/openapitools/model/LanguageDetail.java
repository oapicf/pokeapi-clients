package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.LanguageName;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("LanguageDetail")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-11-09T13:50:06.168269698Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class LanguageDetail   {
  private Integer id;
  private String name;
  private Boolean official;
  private String iso639;
  private String iso3166;
  private List<@Valid LanguageName> names = new ArrayList<>();

  public LanguageDetail() {
  }

  @JsonCreator
  public LanguageDetail(
    @JsonProperty(required = true, value = "id") Integer id,
    @JsonProperty(required = true, value = "name") String name,
    @JsonProperty(required = true, value = "iso639") String iso639,
    @JsonProperty(required = true, value = "iso3166") String iso3166,
    @JsonProperty(required = true, value = "names") List<@Valid LanguageName> names
  ) {
    this.id = id;
    this.name = name;
    this.iso639 = iso639;
    this.iso3166 = iso3166;
    this.names = names;
  }

  /**
   * The identifier for this resource.
   **/
  public LanguageDetail id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The identifier for this resource.")
  @JsonProperty(required = true, value = "id")
  public Integer getId() {
    return id;
  }

  @JsonProperty(required = true, value = "id")
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The name for this resource.
   **/
  public LanguageDetail name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The name for this resource.")
  @JsonProperty(required = true, value = "name")
  @NotNull  @Size(max=200)public String getName() {
    return name;
  }

  @JsonProperty(required = true, value = "name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Whether or not the games are published in this language.
   **/
  public LanguageDetail official(Boolean official) {
    this.official = official;
    return this;
  }

  
  @ApiModelProperty(value = "Whether or not the games are published in this language.")
  @JsonProperty("official")
  public Boolean getOfficial() {
    return official;
  }

  @JsonProperty("official")
  public void setOfficial(Boolean official) {
    this.official = official;
  }

  /**
   * The two-letter ISO 639-1 language code. Multiple PokéAPI language records may share this code.
   **/
  public LanguageDetail iso639(String iso639) {
    this.iso639 = iso639;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The two-letter ISO 639-1 language code. Multiple PokéAPI language records may share this code.")
  @JsonProperty(required = true, value = "iso639")
  @NotNull  @Size(max=10)public String getIso639() {
    return iso639;
  }

  @JsonProperty(required = true, value = "iso639")
  public void setIso639(String iso639) {
    this.iso639 = iso639;
  }

  /**
   * The two-letter ISO 3166-1 alpha-2 code of the country or region associated with this language record. Multiple PokéAPI language records may share this code.
   **/
  public LanguageDetail iso3166(String iso3166) {
    this.iso3166 = iso3166;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The two-letter ISO 3166-1 alpha-2 code of the country or region associated with this language record. Multiple PokéAPI language records may share this code.")
  @JsonProperty(required = true, value = "iso3166")
  @NotNull  @Size(max=2)public String getIso3166() {
    return iso3166;
  }

  @JsonProperty(required = true, value = "iso3166")
  public void setIso3166(String iso3166) {
    this.iso3166 = iso3166;
  }

  /**
   * The name of this resource listed in different languages.
   **/
  public LanguageDetail names(List<@Valid LanguageName> names) {
    this.names = names;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The name of this resource listed in different languages.")
  @JsonProperty(required = true, value = "names")
  public List<@Valid LanguageName> getNames() {
    return names;
  }

  @JsonProperty(required = true, value = "names")
  public void setNames(List<@Valid LanguageName> names) {
    this.names = names;
  }

  public LanguageDetail addNamesItem(LanguageName namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<>();
    }

    this.names.add(namesItem);
    return this;
  }

  public LanguageDetail removeNamesItem(LanguageName namesItem) {
    if (namesItem != null && this.names != null) {
      this.names.remove(namesItem);
    }

    return this;
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
