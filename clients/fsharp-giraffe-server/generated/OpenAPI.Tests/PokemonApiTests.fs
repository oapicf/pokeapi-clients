namespace OpenAPI.Tests

open System
open System.Net
open System.Net.Http
open System.IO
open Microsoft.AspNetCore.Builder
open Microsoft.AspNetCore.Hosting
open Microsoft.AspNetCore.TestHost
open Microsoft.Extensions.DependencyInjection
open FSharp.Control.Tasks.V2.ContextInsensitive
open Xunit
open System.Text
open Newtonsoft
open TestHelper
open PokemonApiHandlerTestsHelper
open OpenAPI.PokemonApiHandler
open OpenAPI.PokemonApiHandlerParams
open OpenAPI.Model.AbilityDetail
open OpenAPI.Model.CharacteristicDetail
open OpenAPI.Model.EggGroupDetail
open OpenAPI.Model.GenderDetail
open OpenAPI.Model.GrowthRateDetail
open OpenAPI.Model.MoveDamageClassDetail
open OpenAPI.Model.NatureDetail
open OpenAPI.Model.PaginatedAbilitySummaryList
open OpenAPI.Model.PaginatedCharacteristicSummaryList
open OpenAPI.Model.PaginatedEggGroupSummaryList
open OpenAPI.Model.PaginatedGenderSummaryList
open OpenAPI.Model.PaginatedGrowthRateSummaryList
open OpenAPI.Model.PaginatedMoveDamageClassSummaryList
open OpenAPI.Model.PaginatedNatureSummaryList
open OpenAPI.Model.PaginatedPokeathlonStatSummaryList
open OpenAPI.Model.PaginatedPokemonColorSummaryList
open OpenAPI.Model.PaginatedPokemonFormSummaryList
open OpenAPI.Model.PaginatedPokemonHabitatSummaryList
open OpenAPI.Model.PaginatedPokemonShapeSummaryList
open OpenAPI.Model.PaginatedPokemonSpeciesSummaryList
open OpenAPI.Model.PaginatedPokemonSummaryList
open OpenAPI.Model.PaginatedStatSummaryList
open OpenAPI.Model.PaginatedTypeSummaryList
open OpenAPI.Model.PokeathlonStatDetail
open OpenAPI.Model.PokemonColorDetail
open OpenAPI.Model.PokemonDetail
open OpenAPI.Model.PokemonFormDetail
open OpenAPI.Model.PokemonHabitatDetail
open OpenAPI.Model.PokemonShapeDetail
open OpenAPI.Model.PokemonSpeciesDetail
open OpenAPI.Model.StatDetail
open OpenAPI.Model.TypeDetail

module PokemonApiHandlerTests =

  // ---------------------------------
  // Tests
  // ---------------------------------

  [<Fact>]
  let ``AbilityList -  returns 200 `` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v2/ability/" + "?limit=ADDME&offset=ADDME&q=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``AbilityRetrieve -  returns 200 `` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v2/ability/{id}/".Replace("id", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CharacteristicList - List charecterictics returns 200 `` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v2/characteristic/" + "?limit=ADDME&offset=ADDME&q=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CharacteristicRetrieve - Get characteristic returns 200 `` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v2/characteristic/{id}/".Replace("id", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``EggGroupList - List egg groups returns 200 `` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v2/egg-group/" + "?limit=ADDME&offset=ADDME&q=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``EggGroupRetrieve - Get egg group returns 200 `` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v2/egg-group/{id}/".Replace("id", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GenderList - List genders returns 200 `` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v2/gender/" + "?limit=ADDME&offset=ADDME&q=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GenderRetrieve - Get gender returns 200 `` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v2/gender/{id}/".Replace("id", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GrowthRateList - List growth rates returns 200 `` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v2/growth-rate/" + "?limit=ADDME&offset=ADDME&q=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GrowthRateRetrieve - Get growth rate returns 200 `` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v2/growth-rate/{id}/".Replace("id", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``MoveDamageClassList - List move damage classes returns 200 `` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v2/move-damage-class/" + "?limit=ADDME&offset=ADDME&q=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``MoveDamageClassRetrieve - Get move damage class returns 200 `` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v2/move-damage-class/{id}/".Replace("id", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``NatureList - List natures returns 200 `` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v2/nature/" + "?limit=ADDME&offset=ADDME&q=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``NatureRetrieve - Get nature returns 200 `` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v2/nature/{id}/".Replace("id", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``PokeathlonStatList - List pokeathlon stats returns 200 `` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v2/pokeathlon-stat/" + "?limit=ADDME&offset=ADDME&q=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``PokeathlonStatRetrieve - Get pokeathlon stat returns 200 `` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v2/pokeathlon-stat/{id}/".Replace("id", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``PokemonColorList - List pokemon colors returns 200 `` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v2/pokemon-color/" + "?limit=ADDME&offset=ADDME&q=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``PokemonColorRetrieve - Get pokemon color returns 200 `` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v2/pokemon-color/{id}/".Replace("id", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``PokemonFormList - List pokemon forms returns 200 `` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v2/pokemon-form/" + "?limit=ADDME&offset=ADDME&q=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``PokemonFormRetrieve - Get pokemon form returns 200 `` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v2/pokemon-form/{id}/".Replace("id", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``PokemonHabitatList - List pokemom habitas returns 200 `` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v2/pokemon-habitat/" + "?limit=ADDME&offset=ADDME&q=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``PokemonHabitatRetrieve - Get pokemom habita returns 200 `` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v2/pokemon-habitat/{id}/".Replace("id", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``PokemonList - List pokemon returns 200 `` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v2/pokemon/" + "?limit=ADDME&offset=ADDME&q=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``PokemonRetrieve - Get pokemon returns 200 `` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v2/pokemon/{id}/".Replace("id", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``PokemonShapeList - List pokemon shapes returns 200 `` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v2/pokemon-shape/" + "?limit=ADDME&offset=ADDME&q=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``PokemonShapeRetrieve - Get pokemon shape returns 200 `` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v2/pokemon-shape/{id}/".Replace("id", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``PokemonSpeciesList - List pokemon species returns 200 `` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v2/pokemon-species/" + "?limit=ADDME&offset=ADDME&q=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``PokemonSpeciesRetrieve - Get pokemon species returns 200 `` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v2/pokemon-species/{id}/".Replace("id", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``StatList - List stats returns 200 `` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v2/stat/" + "?limit=ADDME&offset=ADDME&q=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``StatRetrieve - Get stat returns 200 `` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v2/stat/{id}/".Replace("id", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``TypeList - List types returns 200 `` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v2/type/" + "?limit=ADDME&offset=ADDME&q=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``TypeRetrieve - Get types returns 200 `` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v2/type/{id}/".Replace("id", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

