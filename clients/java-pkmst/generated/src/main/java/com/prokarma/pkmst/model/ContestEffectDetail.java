package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ContestEffectEffectText;
import com.prokarma.pkmst.model.ContestEffectFlavorText;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ContestEffectDetail
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-02-07T04:17:07.396624034Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ContestEffectDetail   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("appeal")
  private Integer appeal;

  @JsonProperty("jam")
  private Integer jam;

  @JsonProperty("effect_entries")
  
  private List<ContestEffectEffectText> effectEntries = new ArrayList<>();

  @JsonProperty("flavor_text_entries")
  
  private List<ContestEffectFlavorText> flavorTextEntries = new ArrayList<>();

  public ContestEffectDetail id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @ApiModelProperty(required = true, readOnly = true, value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public ContestEffectDetail appeal(Integer appeal) {
    this.appeal = appeal;
    return this;
  }

  /**
   * Get appeal
   * @return appeal
   */
  @ApiModelProperty(required = true, value = "")
  public Integer getAppeal() {
    return appeal;
  }

  public void setAppeal(Integer appeal) {
    this.appeal = appeal;
  }

  public ContestEffectDetail jam(Integer jam) {
    this.jam = jam;
    return this;
  }

  /**
   * Get jam
   * @return jam
   */
  @ApiModelProperty(required = true, value = "")
  public Integer getJam() {
    return jam;
  }

  public void setJam(Integer jam) {
    this.jam = jam;
  }

  public ContestEffectDetail effectEntries(List<ContestEffectEffectText> effectEntries) {
    this.effectEntries = effectEntries;
    return this;
  }

  public ContestEffectDetail addEffectEntriesItem(ContestEffectEffectText effectEntriesItem) {
    if (this.effectEntries == null) {
      this.effectEntries = new ArrayList<>();
    }
    this.effectEntries.add(effectEntriesItem);
    return this;
  }

  /**
   * Get effectEntries
   * @return effectEntries
   */
  @ApiModelProperty(required = true, value = "")
  public List<ContestEffectEffectText> getEffectEntries() {
    return effectEntries;
  }

  public void setEffectEntries(List<ContestEffectEffectText> effectEntries) {
    this.effectEntries = effectEntries;
  }

  public ContestEffectDetail flavorTextEntries(List<ContestEffectFlavorText> flavorTextEntries) {
    this.flavorTextEntries = flavorTextEntries;
    return this;
  }

  public ContestEffectDetail addFlavorTextEntriesItem(ContestEffectFlavorText flavorTextEntriesItem) {
    if (this.flavorTextEntries == null) {
      this.flavorTextEntries = new ArrayList<>();
    }
    this.flavorTextEntries.add(flavorTextEntriesItem);
    return this;
  }

  /**
   * Get flavorTextEntries
   * @return flavorTextEntries
   */
  @ApiModelProperty(required = true, value = "")
  public List<ContestEffectFlavorText> getFlavorTextEntries() {
    return flavorTextEntries;
  }

  public void setFlavorTextEntries(List<ContestEffectFlavorText> flavorTextEntries) {
    this.flavorTextEntries = flavorTextEntries;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

