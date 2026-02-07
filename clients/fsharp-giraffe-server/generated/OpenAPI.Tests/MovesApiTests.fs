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
open MovesApiHandlerTestsHelper
open OpenAPI.MovesApiHandler
open OpenAPI.MovesApiHandlerParams
open OpenAPI.Model.MoveBattleStyleDetail
open OpenAPI.Model.MoveDetail
open OpenAPI.Model.MoveLearnMethodDetail
open OpenAPI.Model.MoveMetaAilmentDetail
open OpenAPI.Model.MoveMetaCategoryDetail
open OpenAPI.Model.MoveTargetDetail
open OpenAPI.Model.PaginatedMoveBattleStyleSummaryList
open OpenAPI.Model.PaginatedMoveLearnMethodSummaryList
open OpenAPI.Model.PaginatedMoveMetaAilmentSummaryList
open OpenAPI.Model.PaginatedMoveMetaCategorySummaryList
open OpenAPI.Model.PaginatedMoveSummaryList
open OpenAPI.Model.PaginatedMoveTargetSummaryList

module MovesApiHandlerTests =

  // ---------------------------------
  // Tests
  // ---------------------------------

  [<Fact>]
  let ``MoveAilmentList - List move meta ailments returns 200 `` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v2/move-ailment/" + "?limit=ADDME&offset=ADDME&q=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``MoveAilmentRetrieve - Get move meta ailment returns 200 `` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v2/move-ailment/{id}/".Replace("id", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``MoveBattleStyleList - List move battle styles returns 200 `` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v2/move-battle-style/" + "?limit=ADDME&offset=ADDME&q=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``MoveBattleStyleRetrieve - Get move battle style returns 200 `` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v2/move-battle-style/{id}/".Replace("id", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``MoveCategoryList - List move meta categories returns 200 `` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v2/move-category/" + "?limit=ADDME&offset=ADDME&q=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``MoveCategoryRetrieve - Get move meta category returns 200 `` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v2/move-category/{id}/".Replace("id", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``MoveLearnMethodList - List move learn methods returns 200 `` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v2/move-learn-method/" + "?limit=ADDME&offset=ADDME&q=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``MoveLearnMethodRetrieve - Get move learn method returns 200 `` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v2/move-learn-method/{id}/".Replace("id", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``MoveList - List moves returns 200 `` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v2/move/" + "?limit=ADDME&offset=ADDME&q=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``MoveRetrieve - Get move returns 200 `` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v2/move/{id}/".Replace("id", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``MoveTargetList - List move targets returns 200 `` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v2/move-target/" + "?limit=ADDME&offset=ADDME&q=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``MoveTargetRetrieve - Get move target returns 200 `` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v2/move-target/{id}/".Replace("id", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

