namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.LanguageSummary

module MoveName =

  //#region MoveName

  [<CLIMutable>]
  type MoveName = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "language")>]
    Language : LanguageSummary;
  }

  //#endregion
