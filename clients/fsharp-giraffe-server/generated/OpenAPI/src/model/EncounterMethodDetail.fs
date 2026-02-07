namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.EncounterMethodName
open OpenAPI.Model.int option

module EncounterMethodDetail =

  //#region EncounterMethodDetail


  type EncounterMethodDetail = {
    Id : int;
    Name : string;
    Order : int option;
    Names : EncounterMethodName[];
  }
  //#endregion
