namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.LanguageSummary

module NatureName =

  //#region NatureName


  type NatureName = {
    Name : string;
    Language : LanguageSummary;
  }
  //#endregion
