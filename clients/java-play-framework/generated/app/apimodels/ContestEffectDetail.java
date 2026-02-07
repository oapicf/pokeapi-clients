package apimodels;

import apimodels.ContestEffectEffectText;
import apimodels.ContestEffectFlavorText;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ContestEffectDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-07T04:17:12.303882205Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ContestEffectDetail   {
  @JsonProperty("id")
  @NotNull

  private Integer id;

  @JsonProperty("appeal")
  @NotNull

  private Integer appeal;

  @JsonProperty("jam")
  @NotNull

  private Integer jam;

  @JsonProperty("effect_entries")
  @NotNull
@Valid

  private List<@Valid ContestEffectEffectText> effectEntries = new ArrayList<>();

  @JsonProperty("flavor_text_entries")
  @NotNull
@Valid

  private List<@Valid ContestEffectFlavorText> flavorTextEntries = new ArrayList<>();

  public ContestEffectDetail id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
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
  **/
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
  **/
  public Integer getJam() {
    return jam;
  }

  public void setJam(Integer jam) {
    this.jam = jam;
  }

  public ContestEffectDetail effectEntries(List<@Valid ContestEffectEffectText> effectEntries) {
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
  **/
  public List<@Valid ContestEffectEffectText> getEffectEntries() {
    return effectEntries;
  }

  public void setEffectEntries(List<@Valid ContestEffectEffectText> effectEntries) {
    this.effectEntries = effectEntries;
  }

  public ContestEffectDetail flavorTextEntries(List<@Valid ContestEffectFlavorText> flavorTextEntries) {
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
  **/
  public List<@Valid ContestEffectFlavorText> getFlavorTextEntries() {
    return flavorTextEntries;
  }

  public void setFlavorTextEntries(List<@Valid ContestEffectFlavorText> flavorTextEntries) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

