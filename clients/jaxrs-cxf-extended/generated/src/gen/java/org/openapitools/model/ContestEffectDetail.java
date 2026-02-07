package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ContestEffectEffectText;
import org.openapitools.model.ContestEffectFlavorText;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
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
  */
  @JsonProperty("id")
  @NotNull
  public Integer getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   * <br><em>N.B. <code>id</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setId(Integer id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   * <br><em>N.B. <code>id</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public ContestEffectDetail id(Integer id) {
    this.id = id;
    return this;
  }

 /**
  * Get appeal
  * @return appeal
  */
  @JsonProperty("appeal")
  @NotNull
  public Integer getAppeal() {
    return appeal;
  }

  /**
   * Sets the <code>appeal</code> property.
   */
 public void setAppeal(Integer appeal) {
    this.appeal = appeal;
  }

  /**
   * Sets the <code>appeal</code> property.
   */
  public ContestEffectDetail appeal(Integer appeal) {
    this.appeal = appeal;
    return this;
  }

 /**
  * Get jam
  * @return jam
  */
  @JsonProperty("jam")
  @NotNull
  public Integer getJam() {
    return jam;
  }

  /**
   * Sets the <code>jam</code> property.
   */
 public void setJam(Integer jam) {
    this.jam = jam;
  }

  /**
   * Sets the <code>jam</code> property.
   */
  public ContestEffectDetail jam(Integer jam) {
    this.jam = jam;
    return this;
  }

 /**
  * Get effectEntries
  * @return effectEntries
  */
  @JsonProperty("effect_entries")
  @NotNull
  public List<@Valid ContestEffectEffectText> getEffectEntries() {
    return effectEntries;
  }

  /**
   * Sets the <code>effectEntries</code> property.
   */
 public void setEffectEntries(List<@Valid ContestEffectEffectText> effectEntries) {
    this.effectEntries = effectEntries;
  }

  /**
   * Sets the <code>effectEntries</code> property.
   */
  public ContestEffectDetail effectEntries(List<@Valid ContestEffectEffectText> effectEntries) {
    this.effectEntries = effectEntries;
    return this;
  }

  /**
   * Adds a new item to the <code>effectEntries</code> list.
   */
  public ContestEffectDetail addEffectEntriesItem(ContestEffectEffectText effectEntriesItem) {
    this.effectEntries.add(effectEntriesItem);
    return this;
  }

 /**
  * Get flavorTextEntries
  * @return flavorTextEntries
  */
  @JsonProperty("flavor_text_entries")
  @NotNull
  public List<@Valid ContestEffectFlavorText> getFlavorTextEntries() {
    return flavorTextEntries;
  }

  /**
   * Sets the <code>flavorTextEntries</code> property.
   */
 public void setFlavorTextEntries(List<@Valid ContestEffectFlavorText> flavorTextEntries) {
    this.flavorTextEntries = flavorTextEntries;
  }

  /**
   * Sets the <code>flavorTextEntries</code> property.
   */
  public ContestEffectDetail flavorTextEntries(List<@Valid ContestEffectFlavorText> flavorTextEntries) {
    this.flavorTextEntries = flavorTextEntries;
    return this;
  }

  /**
   * Adds a new item to the <code>flavorTextEntries</code> list.
   */
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

