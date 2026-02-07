namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module Experience =

  //#region Experience

  [<CLIMutable>]
  type Experience = {
    [<JsonProperty(PropertyName = "level")>]
    Level : int;
    [<JsonProperty(PropertyName = "experience")>]
    _Experience : int;
  }

  //#endregion
