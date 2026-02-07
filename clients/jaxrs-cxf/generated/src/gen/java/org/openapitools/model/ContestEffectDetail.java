package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ContestEffectEffectText;
import org.openapitools.model.ContestEffectFlavorText;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ContestEffectDetail  {
  
  @ApiModelProperty(required = true, value = "")

  private Integer id;

  @ApiModelProperty(required = true, value = "")

  private Integer appeal;

  @ApiModelProperty(required = true, value = "")

  private Integer jam;

  @ApiModelProperty(required = true, value = "")

  @Valid

  private List<@Valid ContestEffectEffectText> effectEntries = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  @Valid

  private List<@Valid ContestEffectFlavorText> flavorTextEntries = new ArrayList<>();
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
   * Get appeal
   * @return appeal
  **/
  @JsonProperty("appeal")
  @NotNull
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
   * Get jam
   * @return jam
  **/
  @JsonProperty("jam")
  @NotNull
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
   * Get effectEntries
   * @return effectEntries
  **/
  @JsonProperty("effect_entries")
  @NotNull
  public List<@Valid ContestEffectEffectText> getEffectEntries() {
    return effectEntries;
  }

  public void setEffectEntries(List<@Valid ContestEffectEffectText> effectEntries) {
    this.effectEntries = effectEntries;
  }

  public ContestEffectDetail effectEntries(List<@Valid ContestEffectEffectText> effectEntries) {
    this.effectEntries = effectEntries;
    return this;
  }

  public ContestEffectDetail addEffectEntriesItem(ContestEffectEffectText effectEntriesItem) {
    this.effectEntries.add(effectEntriesItem);
    return this;
  }

 /**
   * Get flavorTextEntries
   * @return flavorTextEntries
  **/
  @JsonProperty("flavor_text_entries")
  @NotNull
  public List<@Valid ContestEffectFlavorText> getFlavorTextEntries() {
    return flavorTextEntries;
  }

  public void setFlavorTextEntries(List<@Valid ContestEffectFlavorText> flavorTextEntries) {
    this.flavorTextEntries = flavorTextEntries;
  }

  public ContestEffectDetail flavorTextEntries(List<@Valid ContestEffectFlavorText> flavorTextEntries) {
    this.flavorTextEntries = flavorTextEntries;
    return this;
  }

  public ContestEffectDetail addFlavorTextEntriesItem(ContestEffectFlavorText flavorTextEntriesItem) {
    this.flavorTextEntries.add(flavorTextEntriesItem);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

