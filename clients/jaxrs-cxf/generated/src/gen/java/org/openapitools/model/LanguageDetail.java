package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.LanguageName;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class LanguageDetail  {
  
  @ApiModelProperty(required = true, value = "")

  private Integer id;

  @ApiModelProperty(required = true, value = "")

  private String name;

  @ApiModelProperty(value = "")

  private Boolean official;

  @ApiModelProperty(required = true, value = "")

  private String iso639;

  @ApiModelProperty(required = true, value = "")

  private String iso3166;

  @ApiModelProperty(required = true, value = "")

  @Valid

  private List<@Valid LanguageName> names = new ArrayList<>();
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  @NotNull
  public Integer getId() {
    return id;
  }


 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  @NotNull
 @Size(max=100)  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LanguageDetail name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get official
   * @return official
  **/
  @JsonProperty("official")
  public Boolean getOfficial() {
    return official;
  }

  public void setOfficial(Boolean official) {
    this.official = official;
  }

  public LanguageDetail official(Boolean official) {
    this.official = official;
    return this;
  }

 /**
   * Get iso639
   * @return iso639
  **/
  @JsonProperty("iso639")
  @NotNull
 @Size(max=10)  public String getIso639() {
    return iso639;
  }

  public void setIso639(String iso639) {
    this.iso639 = iso639;
  }

  public LanguageDetail iso639(String iso639) {
    this.iso639 = iso639;
    return this;
  }

 /**
   * Get iso3166
   * @return iso3166
  **/
  @JsonProperty("iso3166")
  @NotNull
 @Size(max=2)  public String getIso3166() {
    return iso3166;
  }

  public void setIso3166(String iso3166) {
    this.iso3166 = iso3166;
  }

  public LanguageDetail iso3166(String iso3166) {
    this.iso3166 = iso3166;
    return this;
  }

 /**
   * Get names
   * @return names
  **/
  @JsonProperty("names")
  @NotNull
  public List<@Valid LanguageName> getNames() {
    return names;
  }

  public void setNames(List<@Valid LanguageName> names) {
    this.names = names;
  }

  public LanguageDetail names(List<@Valid LanguageName> names) {
    this.names = names;
    return this;
  }

  public LanguageDetail addNamesItem(LanguageName namesItem) {
    this.names.add(namesItem);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

