package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PokemonSpritesOtherOfficialArtwork   {
  
  private String frontDefault;
  private String frontShiny;
  private Map<String, Map<String, Object>> versions = new HashMap<>();

  public PokemonSpritesOtherOfficialArtwork () {

  }

  public PokemonSpritesOtherOfficialArtwork (String frontDefault, String frontShiny, Map<String, Map<String, Object>> versions) {
    this.frontDefault = frontDefault;
    this.frontShiny = frontShiny;
    this.versions = versions;
  }

    
  @JsonProperty("front_default")
  public String getFrontDefault() {
    return frontDefault;
  }
  public void setFrontDefault(String frontDefault) {
    this.frontDefault = frontDefault;
  }

    
  @JsonProperty("front_shiny")
  public String getFrontShiny() {
    return frontShiny;
  }
  public void setFrontShiny(String frontShiny) {
    this.frontShiny = frontShiny;
  }

    
  @JsonProperty("versions")
  public Map<String, Map<String, Object>> getVersions() {
    return versions;
  }
  public void setVersions(Map<String, Map<String, Object>> versions) {
    this.versions = versions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PokemonSpritesOtherOfficialArtwork pokemonSpritesOtherOfficialArtwork = (PokemonSpritesOtherOfficialArtwork) o;
    return Objects.equals(frontDefault, pokemonSpritesOtherOfficialArtwork.frontDefault) &&
        Objects.equals(frontShiny, pokemonSpritesOtherOfficialArtwork.frontShiny) &&
        Objects.equals(versions, pokemonSpritesOtherOfficialArtwork.versions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(frontDefault, frontShiny, versions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonSpritesOtherOfficialArtwork {\n");
    
    sb.append("    frontDefault: ").append(toIndentedString(frontDefault)).append("\n");
    sb.append("    frontShiny: ").append(toIndentedString(frontShiny)).append("\n");
    sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
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
