namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BerryFirmnessSummary
open OpenAPI.Model.BerryFlavorMap
open OpenAPI.Model.ItemSummary
open OpenAPI.Model.TypeSummary
open OpenAPI.Model.int option

module BerryDetail =

  //#region BerryDetail

  [<CLIMutable>]
  type BerryDetail = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "growth_time")>]
    GrowthTime : int option;
    [<JsonProperty(PropertyName = "max_harvest")>]
    MaxHarvest : int option;
    [<JsonProperty(PropertyName = "natural_gift_power")>]
    NaturalGiftPower : int option;
    [<JsonProperty(PropertyName = "size")>]
    Size : int option;
    [<JsonProperty(PropertyName = "smoothness")>]
    Smoothness : int option;
    [<JsonProperty(PropertyName = "soil_dryness")>]
    SoilDryness : int option;
    [<JsonProperty(PropertyName = "firmness")>]
    Firmness : BerryFirmnessSummary;
    [<JsonProperty(PropertyName = "flavors")>]
    Flavors : BerryFlavorMap[];
    [<JsonProperty(PropertyName = "item")>]
    Item : ItemSummary;
    [<JsonProperty(PropertyName = "natural_gift_type")>]
    NaturalGiftType : TypeSummary;
  }

  //#endregion
