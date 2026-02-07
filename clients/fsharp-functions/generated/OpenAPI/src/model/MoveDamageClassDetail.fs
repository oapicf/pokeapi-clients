namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.MoveDamageClassDescription
open OpenAPI.Model.MoveDamageClassName
open OpenAPI.Model.MoveSummary

module MoveDamageClassDetail =

  //#region MoveDamageClassDetail

  [<CLIMutable>]
  type MoveDamageClassDetail = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "descriptions")>]
    Descriptions : MoveDamageClassDescription[];
    [<JsonProperty(PropertyName = "moves")>]
    Moves : MoveSummary[];
    [<JsonProperty(PropertyName = "names")>]
    Names : MoveDamageClassName[];
  }

  //#endregion
