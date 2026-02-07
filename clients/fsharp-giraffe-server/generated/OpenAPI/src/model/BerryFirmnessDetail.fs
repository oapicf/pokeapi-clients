namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BerryFirmnessName
open OpenAPI.Model.BerrySummary

module BerryFirmnessDetail =

  //#region BerryFirmnessDetail


  type BerryFirmnessDetail = {
    Id : int;
    Name : string;
    Berries : BerrySummary[];
    Names : BerryFirmnessName[];
  }
  //#endregion
