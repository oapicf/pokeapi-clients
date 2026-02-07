namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.LanguageSummary

module MoveTargetDescription =

  //#region MoveTargetDescription

  [<CLIMutable>]
  type MoveTargetDescription = {
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "language")>]
    Language : LanguageSummary;
  }

  //#endregion
