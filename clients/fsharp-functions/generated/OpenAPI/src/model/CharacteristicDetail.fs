namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CharacteristicDescription
open OpenAPI.Model.StatSummary

module CharacteristicDetail =

  //#region CharacteristicDetail

  [<CLIMutable>]
  type CharacteristicDetail = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int;
    [<JsonProperty(PropertyName = "gene_modulo")>]
    GeneModulo : int;
    [<JsonProperty(PropertyName = "possible_values")>]
    PossibleValues : int[];
    [<JsonProperty(PropertyName = "highest_stat")>]
    HighestStat : StatSummary;
    [<JsonProperty(PropertyName = "descriptions")>]
    Descriptions : CharacteristicDescription[];
  }

  //#endregion
