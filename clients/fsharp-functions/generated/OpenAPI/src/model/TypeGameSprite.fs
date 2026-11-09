namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.string option

module TypeGameSprite =

  //#region TypeGameSprite

  [<CLIMutable>]
  type TypeGameSprite = {
    [<JsonProperty(PropertyName = "name_icon")>]
    NameIcon : string option;
    [<JsonProperty(PropertyName = "symbol_icon")>]
    SymbolIcon : string option;
  }

  //#endregion
