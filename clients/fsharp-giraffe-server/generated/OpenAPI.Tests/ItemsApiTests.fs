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
open ItemsApiHandlerTestsHelper
open OpenAPI.ItemsApiHandler
open OpenAPI.ItemsApiHandlerParams
open OpenAPI.Model.ItemAttributeDetail
open OpenAPI.Model.ItemCategoryDetail
open OpenAPI.Model.ItemDetail
open OpenAPI.Model.ItemFlingEffectDetail
open OpenAPI.Model.ItemPocketDetail
open OpenAPI.Model.PaginatedItemAttributeSummaryList
open OpenAPI.Model.PaginatedItemCategorySummaryList
open OpenAPI.Model.PaginatedItemFlingEffectSummaryList
open OpenAPI.Model.PaginatedItemPocketSummaryList
open OpenAPI.Model.PaginatedItemSummaryList

module ItemsApiHandlerTests =

  // ---------------------------------
  // Tests
  // ---------------------------------

  [<Fact>]
  let ``ItemAttributeList - List item attributes returns 200 `` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v2/item-attribute/" + "?limit=ADDME&offset=ADDME&q=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``ItemAttributeRetrieve - Get item attribute returns 200 `` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v2/item-attribute/{id}/".Replace("id", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``ItemCategoryList - List item categories returns 200 `` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v2/item-category/" + "?limit=ADDME&offset=ADDME&q=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``ItemCategoryRetrieve - Get item category returns 200 `` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v2/item-category/{id}/".Replace("id", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``ItemFlingEffectList - List item fling effects returns 200 `` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v2/item-fling-effect/" + "?limit=ADDME&offset=ADDME&q=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``ItemFlingEffectRetrieve - Get item fling effect returns 200 `` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v2/item-fling-effect/{id}/".Replace("id", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``ItemList - List items returns 200 `` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v2/item/" + "?limit=ADDME&offset=ADDME&q=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``ItemPocketList - List item pockets returns 200 `` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v2/item-pocket/" + "?limit=ADDME&offset=ADDME&q=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``ItemPocketRetrieve - Get item pocket returns 200 `` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v2/item-pocket/{id}/".Replace("id", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``ItemRetrieve - Get item returns 200 `` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/api/v2/item/{id}/".Replace("id", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

