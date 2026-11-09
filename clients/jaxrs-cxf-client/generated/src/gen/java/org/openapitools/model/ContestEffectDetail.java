package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ContestEffectEffectText;
import org.openapitools.model.ContestEffectFlavorText;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ContestEffectDetail  {
  
 /**
  * The identifier for this resource.
  */
  @ApiModelProperty(required = true, value = "The identifier for this resource.")

  private Integer id;

 /**
  * The base number of hearts the user of this move gets.
  */
  @ApiModelProperty(required = true, value = "The base number of hearts the user of this move gets.")

  private Integer appeal;

 /**
  * The base number of hearts the user's opponent loses.
  */
  @ApiModelProperty(required = true, value = "The base number of hearts the user's opponent loses.")

  private Integer jam;

 /**
  * The result of this contest effect listed in different languages.
  */
  @ApiModelProperty(required = true, value = "The result of this contest effect listed in different languages.")

  private List<ContestEffectEffectText> effectEntries = new ArrayList<>();

 /**
  * The flavor text of this contest effect listed in different languages.
  */
  @ApiModelProperty(required = true, value = "The flavor text of this contest effect listed in different languages.")

  private List<ContestEffectFlavorText> flavorTextEntries = new ArrayList<>();
 /**
   * The identifier for this resource.
   * @return id
  **/
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }


 /**
   * The base number of hearts the user of this move gets.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return appeal
  **/
  @JsonProperty("appeal")
  public Integer getAppeal() {
    return appeal;
  }

  public void setAppeal(Integer appeal) {
    this.appeal = appeal;
  }

  public ContestEffectDetail appeal(Integer appeal) {
    this.appeal = appeal;
    return this;
  }

 /**
   * The base number of hearts the user&#39;s opponent loses.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return jam
  **/
  @JsonProperty("jam")
  public Integer getJam() {
    return jam;
  }

  public void setJam(Integer jam) {
    this.jam = jam;
  }

  public ContestEffectDetail jam(Integer jam) {
    this.jam = jam;
    return this;
  }

 /**
   * The result of this contest effect listed in different languages.
   * @return effectEntries
  **/
  @JsonProperty("effect_entries")
  public List<ContestEffectEffectText> getEffectEntries() {
    return effectEntries;
  }


 /**
   * The flavor text of this contest effect listed in different languages.
   * @return flavorTextEntries
  **/
  @JsonProperty("flavor_text_entries")
  public List<ContestEffectFlavorText> getFlavorTextEntries() {
    return flavorTextEntries;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContestEffectDetail contestEffectDetail = (ContestEffectDetail) o;
    return Objects.equals(this.id, contestEffectDetail.id) &&
        Objects.equals(this.appeal, contestEffectDetail.appeal) &&
        Objects.equals(this.jam, contestEffectDetail.jam) &&
        Objects.equals(this.effectEntries, contestEffectDetail.effectEntries) &&
        Objects.equals(this.flavorTextEntries, contestEffectDetail.flavorTextEntries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, appeal, jam, effectEntries, flavorTextEntries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContestEffectDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    appeal: ").append(toIndentedString(appeal)).append("\n");
    sb.append("    jam: ").append(toIndentedString(jam)).append("\n");
    sb.append("    effectEntries: ").append(toIndentedString(effectEntries)).append("\n");
    sb.append("    flavorTextEntries: ").append(toIndentedString(flavorTextEntries)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

