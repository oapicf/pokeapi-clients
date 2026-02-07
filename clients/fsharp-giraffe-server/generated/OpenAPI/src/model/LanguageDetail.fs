namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.LanguageName

module LanguageDetail =

  //#region LanguageDetail


  type LanguageDetail = {
    Id : int;
    Name : string;
    Official : bool;
    Iso639 : string;
    Iso3166 : string;
    Names : LanguageName[];
  }
  //#endregion
