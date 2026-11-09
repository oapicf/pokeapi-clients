package apimodels;

import apimodels.VersionSummary;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * LocationAreaEncounterVersionDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-11-09T13:49:31.462302702Z[Etc/UTC]", comments = "Generator version: 7.26.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class LocationAreaEncounterVersionDetail   {
  @JsonProperty("rate")
  @NotNull

  private Integer rate;

  @JsonProperty("version")
  @NotNull
@Valid

  private VersionSummary version;

  public LocationAreaEncounterVersionDetail rate(Integer rate) {
    this.rate = rate;
    return this;
  }

   /**
   * The chance of an encounter to occur.
   * @return rate
  **/
  public Integer getRate() {
    return rate;
  }

  public void setRate(Integer rate) {
    this.rate = rate;
  }

  public LocationAreaEncounterVersionDetail version(VersionSummary version) {
    this.version = version;
    return this;
  }

   /**
   * The version of the game in which the encounter can occur with the given chance.
   * @return version
  **/
  public VersionSummary getVersion() {
    return version;
  }

  public void setVersion(VersionSummary version) {
    this.version = version;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationAreaEncounterVersionDetail locationAreaEncounterVersionDetail = (LocationAreaEncounterVersionDetail) o;
    return Objects.equals(rate, locationAreaEncounterVersionDetail.rate) &&
        Objects.equals(version, locationAreaEncounterVersionDetail.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rate, version);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationAreaEncounterVersionDetail {\n");
    
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

