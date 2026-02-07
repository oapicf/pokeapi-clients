namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BerryDetailFlavorsInner
open OpenAPI.Model.BerryFirmnessSummary
open OpenAPI.Model.ItemSummary
open OpenAPI.Model.TypeSummary

module BerryDetail =

  //#region BerryDetail

  [<CLIMutable>]
  type BerryDetail = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "growth_time")>]
    GrowthTime : int;
    [<JsonProperty(PropertyName = "max_harvest")>]
    MaxHarvest : int;
    [<JsonProperty(PropertyName = "natural_gift_power")>]
    NaturalGiftPower : int;
    [<JsonProperty(PropertyName = "size")>]
    Size : int;
    [<JsonProperty(PropertyName = "smoothness")>]
    Smoothness : int;
    [<JsonProperty(PropertyName = "soil_dryness")>]
    SoilDryness : int;
    [<JsonProperty(PropertyName = "firmness")>]
    Firmness : BerryFirmnessSummary;
    [<JsonProperty(PropertyName = "flavors")>]
    Flavors : BerryDetailFlavorsInner[];
    [<JsonProperty(PropertyName = "item")>]
    Item : ItemSummary;
    [<JsonProperty(PropertyName = "natural_gift_type")>]
    NaturalGiftType : TypeSummary;
  }

  //#endregion
