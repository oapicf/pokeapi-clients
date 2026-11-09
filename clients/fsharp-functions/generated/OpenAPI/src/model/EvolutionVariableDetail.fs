namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.EvolutionVariableDescription
open OpenAPI.Model.EvolutionVariableName
open OpenAPI.Model.VersionGroupSummary

module EvolutionVariableDetail =

  //#region EvolutionVariableDetail

  [<CLIMutable>]
  type EvolutionVariableDetail = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "symbol")>]
    Symbol : string;
    [<JsonProperty(PropertyName = "data_type")>]
    DataType : string;
    [<JsonProperty(PropertyName = "source")>]
    Source : string;
    [<JsonProperty(PropertyName = "version_group")>]
    VersionGroup : VersionGroupSummary;
    [<JsonProperty(PropertyName = "names")>]
    Names : EvolutionVariableName[];
    [<JsonProperty(PropertyName = "descriptions")>]
    Descriptions : EvolutionVariableDescription[];
  }

  //#endregion
