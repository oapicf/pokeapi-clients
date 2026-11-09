namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BerryFirmnessSummary
open OpenAPI.Model.BerryFlavorMap
open OpenAPI.Model.ItemSummary
open OpenAPI.Model.TypeSummary
open OpenAPI.Model.int option

module BerryDetail =

  //#region BerryDetail


  type BerryDetail = {
    Id : int;
    Name : string;
    GrowthTime : int option;
    MaxHarvest : int option;
    NaturalGiftPower : int option;
    Size : int option;
    Smoothness : int option;
    SoilDryness : int option;
    Firmness : BerryFirmnessSummary;
    Flavors : BerryFlavorMap[];
    Item : ItemSummary;
    NaturalGiftType : TypeSummary;
  }
  //#endregion
