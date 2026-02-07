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
open GamesApiHandlerTestsHelper
open OpenAPI.GamesApiHandler
open OpenAPI.GamesApiHandlerParams
open OpenAPI.Model.GenerationDetail
open OpenAPI.Model.PaginatedGenerationSummaryList
open OpenAPI.Model.PaginatedPokedexSummaryList
open OpenAPI.Model.PaginatedVersionGroupSummaryList
open OpenAPI.Model.PaginatedVersionSummaryList
open OpenAPI.Model.PokedexDetail
open OpenAPI.Model.VersionDetail
open OpenAPI.Model.VersionGroupDetail

module GamesApiHandlerTests =

  // ---------------------------------
  // Tests
  // ---------------------------------

  [<Fact>]
  let ``GenerationList - List genrations returns 200 `` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v2/generation/" + "?limit=ADDME&offset=ADDME&q=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GenerationRetrieve - Get genration returns 200 `` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v2/generation/{id}/".Replace("id", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``PokedexList - List pokedex returns 200 `` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v2/pokedex/" + "?limit=ADDME&offset=ADDME&q=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``PokedexRetrieve - Get pokedex returns 200 `` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v2/pokedex/{id}/".Replace("id", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``VersionGroupList - List version groups returns 200 `` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v2/version-group/" + "?limit=ADDME&offset=ADDME&q=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``VersionGroupRetrieve - Get version group returns 200 `` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v2/version-group/{id}/".Replace("id", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``VersionList - List versions returns 200 `` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v2/version/" + "?limit=ADDME&offset=ADDME&q=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``VersionRetrieve - Get version returns 200 `` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v2/version/{id}/".Replace("id", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

