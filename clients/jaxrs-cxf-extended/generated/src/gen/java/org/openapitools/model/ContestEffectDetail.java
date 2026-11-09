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
  private List<@Valid ContestEffectEffectText> effectEntries = new ArrayList<>();

 /**
  * The flavor text of this contest effect listed in different languages.
  */
  @ApiModelProperty(required = true, value = "The flavor text of this contest effect listed in different languages.")
  private List<@Valid ContestEffectFlavorText> flavorTextEntries = new ArrayList<>();
 /**
  * The identifier for this resource.
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
  * The base number of hearts the user of this move gets.
  * minimum: -2147483648
  * maximum: 2147483647
  * @return appeal
  */
  @JsonProperty("appeal")
  @NotNull
 @Min(-2147483648) @Max(2147483647)  public Integer getAppeal() {
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
  * The base number of hearts the user&#39;s opponent loses.
  * minimum: -2147483648
  * maximum: 2147483647
  * @return jam
  */
  @JsonProperty("jam")
  @NotNull
 @Min(-2147483648) @Max(2147483647)  public Integer getJam() {
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
  * The result of this contest effect listed in different languages.
  * @return effectEntries
  */
  @JsonProperty("effect_entries")
  @NotNull
  public List<@Valid ContestEffectEffectText> getEffectEntries() {
    return effectEntries;
  }

  /**
   * Sets the <code>effectEntries</code> property.
   * <br><em>N.B. <code>effectEntries</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setEffectEntries(List<@Valid ContestEffectEffectText> effectEntries) {
    this.effectEntries = effectEntries;
  }

  /**
   * Sets the <code>effectEntries</code> property.
   * <br><em>N.B. <code>effectEntries</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public ContestEffectDetail effectEntries(List<@Valid ContestEffectEffectText> effectEntries) {
    this.effectEntries = effectEntries;
    return this;
  }

  /**
   * Adds a new item to the <code>effectEntries</code> list.
   * <br><em>N.B. <code>effectEntries</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public ContestEffectDetail addEffectEntriesItem(ContestEffectEffectText effectEntriesItem) {
    this.effectEntries.add(effectEntriesItem);
    return this;
  }

 /**
  * The flavor text of this contest effect listed in different languages.
  * @return flavorTextEntries
  */
  @JsonProperty("flavor_text_entries")
  @NotNull
  public List<@Valid ContestEffectFlavorText> getFlavorTextEntries() {
    return flavorTextEntries;
  }

  /**
   * Sets the <code>flavorTextEntries</code> property.
   * <br><em>N.B. <code>flavorTextEntries</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setFlavorTextEntries(List<@Valid ContestEffectFlavorText> flavorTextEntries) {
    this.flavorTextEntries = flavorTextEntries;
  }

  /**
   * Sets the <code>flavorTextEntries</code> property.
   * <br><em>N.B. <code>flavorTextEntries</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public ContestEffectDetail flavorTextEntries(List<@Valid ContestEffectFlavorText> flavorTextEntries) {
    this.flavorTextEntries = flavorTextEntries;
    return this;
  }

  /**
   * Adds a new item to the <code>flavorTextEntries</code> list.
   * <br><em>N.B. <code>flavorTextEntries</code> is <b>read only</b>; client code should not call this method</em>.
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

