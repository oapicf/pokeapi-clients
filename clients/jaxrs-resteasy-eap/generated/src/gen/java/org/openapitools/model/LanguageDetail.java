package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.LanguageName;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-11-09T13:50:03.149615362Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class LanguageDetail   {
  
  private Integer id;
  private String name;
  private Boolean official;
  private String iso639;
  private String iso3166;
  private List<@Valid LanguageName> names = new ArrayList<>();

  /**
   * The identifier for this resource.
   **/
  
  @ApiModelProperty(required = true, value = "The identifier for this resource.")
  @JsonProperty("id")
  @NotNull
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The name for this resource.
   **/
  
  @ApiModelProperty(required = true, value = "The name for this resource.")
  @JsonProperty("name")
  @NotNull
 @Size(max=200)  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Whether or not the games are published in this language.
   **/
  
  @ApiModelProperty(value = "Whether or not the games are published in this language.")
  @JsonProperty("official")
  public Boolean getOfficial() {
    return official;
  }
  public void setOfficial(Boolean official) {
    this.official = official;
  }

  /**
   * The two-letter ISO 639-1 language code. Multiple PokéAPI language records may share this code.
   **/
  
  @ApiModelProperty(required = true, value = "The two-letter ISO 639-1 language code. Multiple PokéAPI language records may share this code.")
  @JsonProperty("iso639")
  @NotNull
 @Size(max=10)  public String getIso639() {
    return iso639;
  }
  public void setIso639(String iso639) {
    this.iso639 = iso639;
  }

  /**
   * The two-letter ISO 3166-1 alpha-2 code of the country or region associated with this language record. Multiple PokéAPI language records may share this code.
   **/
  
  @ApiModelProperty(required = true, value = "The two-letter ISO 3166-1 alpha-2 code of the country or region associated with this language record. Multiple PokéAPI language records may share this code.")
  @JsonProperty("iso3166")
  @NotNull
 @Size(max=2)  public String getIso3166() {
    return iso3166;
  }
  public void setIso3166(String iso3166) {
    this.iso3166 = iso3166;
  }

  /**
   * The name of this resource listed in different languages.
   **/
  
  @ApiModelProperty(required = true, value = "The name of this resource listed in different languages.")
  @JsonProperty("names")
  @NotNull
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

