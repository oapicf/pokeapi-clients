package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.ContestEffectEffectText;
import org.openapitools.vertxweb.server.model.ContestEffectFlavorText;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ContestEffectDetail   {
  
  private Integer id;
  private Integer appeal;
  private Integer jam;
  private List<ContestEffectEffectText> effectEntries = new ArrayList<>();
  private List<ContestEffectFlavorText> flavorTextEntries = new ArrayList<>();

  public ContestEffectDetail () {

  }

  public ContestEffectDetail (Integer id, Integer appeal, Integer jam, List<ContestEffectEffectText> effectEntries, List<ContestEffectFlavorText> flavorTextEntries) {
    this.id = id;
    this.appeal = appeal;
    this.jam = jam;
    this.effectEntries = effectEntries;
    this.flavorTextEntries = flavorTextEntries;
  }

    
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

    
  @JsonProperty("appeal")
  public Integer getAppeal() {
    return appeal;
  }
  public void setAppeal(Integer appeal) {
    this.appeal = appeal;
  }

    
  @JsonProperty("jam")
  public Integer getJam() {
    return jam;
  }
  public void setJam(Integer jam) {
    this.jam = jam;
  }

    
  @JsonProperty("effect_entries")
  public List<ContestEffectEffectText> getEffectEntries() {
    return effectEntries;
  }
  public void setEffectEntries(List<ContestEffectEffectText> effectEntries) {
    this.effectEntries = effectEntries;
  }

    
  @JsonProperty("flavor_text_entries")
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
    return Objects.equals(id, contestEffectDetail.id) &&
        Objects.equals(appeal, contestEffectDetail.appeal) &&
        Objects.equals(jam, contestEffectDetail.jam) &&
        Objects.equals(effectEntries, contestEffectDetail.effectEntries) &&
        Objects.equals(flavorTextEntries, contestEffectDetail.flavorTextEntries);
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
