namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.LanguageSummary

module ContestTypeName =

  //#region ContestTypeName


  type ContestTypeName = {
    Name : string;
    Color : string;
    Language : LanguageSummary;
  }
  //#endregion
