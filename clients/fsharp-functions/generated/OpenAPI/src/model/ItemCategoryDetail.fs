namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ItemCategoryName
open OpenAPI.Model.ItemPocketSummary
open OpenAPI.Model.ItemSummary

module ItemCategoryDetail =

  //#region ItemCategoryDetail

  [<CLIMutable>]
  type ItemCategoryDetail = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "items")>]
    Items : ItemSummary[];
    [<JsonProperty(PropertyName = "names")>]
    Names : ItemCategoryName[];
    [<JsonProperty(PropertyName = "pocket")>]
    Pocket : ItemPocketSummary;
  }

  //#endregion
