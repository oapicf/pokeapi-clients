namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.PokemonFormSummary

module PokemonFormTriggerCondition =

  //#region PokemonFormTriggerCondition

  [<CLIMutable>]
  type PokemonFormTriggerCondition = {
    [<JsonProperty(PropertyName = "trigger")>]
    Trigger : string;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "url")>]
    Url : string;
    [<JsonProperty(PropertyName = "base_form")>]
    BaseForm : PokemonFormSummary;
  }

  //#endregion
