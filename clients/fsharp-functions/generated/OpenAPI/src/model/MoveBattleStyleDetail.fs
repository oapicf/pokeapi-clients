namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.MoveBattleStyleName

module MoveBattleStyleDetail =

  //#region MoveBattleStyleDetail

  [<CLIMutable>]
  type MoveBattleStyleDetail = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "names")>]
    Names : MoveBattleStyleName[];
  }

  //#endregion
