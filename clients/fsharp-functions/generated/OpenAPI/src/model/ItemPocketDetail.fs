namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ItemCategorySummary
open OpenAPI.Model.ItemPocketName

module ItemPocketDetail =

  //#region ItemPocketDetail

  [<CLIMutable>]
  type ItemPocketDetail = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "categories")>]
    Categories : ItemCategorySummary[];
    [<JsonProperty(PropertyName = "names")>]
    Names : ItemPocketName[];
  }

  //#endregion
