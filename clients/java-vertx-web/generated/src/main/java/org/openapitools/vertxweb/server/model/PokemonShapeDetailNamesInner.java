package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.URI;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PokemonShapeDetailNamesInner   {
  
  private URI url;
  private String name;

  public PokemonShapeDetailNamesInner () {

  }

  public PokemonShapeDetailNamesInner (URI url, String name) {
    this.url = url;
    this.name = name;
  }

    
  @JsonProperty("url")
  public URI getUrl() {
    return url;
  }
  public void setUrl(URI url) {
    this.url = url;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PokemonShapeDetailNamesInner pokemonShapeDetailNamesInner = (PokemonShapeDetailNamesInner) o;
    return Objects.equals(url, pokemonShapeDetailNamesInner.url) &&
        Objects.equals(name, pokemonShapeDetailNamesInner.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonShapeDetailNamesInner {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
