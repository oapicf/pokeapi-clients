namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.LanguageSummary

module PokedexDescription =

  //#region PokedexDescription


  type PokedexDescription = {
    Description : string;
    Language : LanguageSummary;
  }
  //#endregion
