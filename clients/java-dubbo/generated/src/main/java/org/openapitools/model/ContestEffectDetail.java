package org.openapitools.model;

import org.openapitools.model.ContestEffectEffectText;
import org.openapitools.model.ContestEffectFlavorText;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ContestEffectDetail implements Serializable {
  private static final long serialVersionUID = 1L;

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

  /**
   * 
   * @return id
   */
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * 
   * @return appeal
   */
  public Integer getAppeal() {
    return appeal;
  }

  public void setAppeal(Integer appeal) {
    this.appeal = appeal;
  }

  /**
   * 
   * @return jam
   */
  public Integer getJam() {
    return jam;
  }

  public void setJam(Integer jam) {
    this.jam = jam;
  }

  /**
   * 
   * @return effectEntries
   */
  public List<ContestEffectEffectText> getEffectEntries() {
    return effectEntries;
  }

  public void setEffectEntries(List<ContestEffectEffectText> effectEntries) {
    this.effectEntries = effectEntries;
  }

  /**
   * 
   * @return flavorTextEntries
   */
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
