namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.string option

module PokeapiMetaResponse =

  //#region PokeapiMetaResponse


  type PokeapiMetaResponse = {
    DeployDate : string option;
    Hash : string option;
    Tag : string option;
  }
  //#endregion
