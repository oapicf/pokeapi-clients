package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.LanguageName;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LanguageDetail   {
  
  private Integer id;
  private String name;
  private Boolean official;
  private String iso639;
  private String iso3166;
  private List<LanguageName> names = new ArrayList<>();

  public LanguageDetail () {

  }

  public LanguageDetail (Integer id, String name, Boolean official, String iso639, String iso3166, List<LanguageName> names) {
    this.id = id;
    this.name = name;
    this.official = official;
    this.iso639 = iso639;
    this.iso3166 = iso3166;
    this.names = names;
  }

    
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("official")
  public Boolean getOfficial() {
    return official;
  }
  public void setOfficial(Boolean official) {
    this.official = official;
  }

    
  @JsonProperty("iso639")
  public String getIso639() {
    return iso639;
  }
  public void setIso639(String iso639) {
    this.iso639 = iso639;
  }

    
  @JsonProperty("iso3166")
  public String getIso3166() {
    return iso3166;
  }
  public void setIso3166(String iso3166) {
    this.iso3166 = iso3166;
  }

    
  @JsonProperty("names")
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
