namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BerryDetailFlavorsInner
open OpenAPI.Model.BerryFirmnessSummary
open OpenAPI.Model.ItemSummary
open OpenAPI.Model.TypeSummary

module BerryDetail =

  //#region BerryDetail


  type BerryDetail = {
    Id : int;
    Name : string;
    GrowthTime : int;
    MaxHarvest : int;
    NaturalGiftPower : int;
    Size : int;
    Smoothness : int;
    SoilDryness : int;
    Firmness : BerryFirmnessSummary;
    Flavors : BerryDetailFlavorsInner[];
    Item : ItemSummary;
    NaturalGiftType : TypeSummary;
  }
  //#endregion
