namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.string option

module PokeapiMetaResponse =

  //#region PokeapiMetaResponse

  [<CLIMutable>]
  type PokeapiMetaResponse = {
    [<JsonProperty(PropertyName = "deploy_date")>]
    DeployDate : string option;
    [<JsonProperty(PropertyName = "hash")>]
    Hash : string option;
    [<JsonProperty(PropertyName = "tag")>]
    Tag : string option;
  }

  //#endregion
