package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.CurrencyDetail
import org.openapitools.models.ItemAttributeDetail
import org.openapitools.models.ItemCategoryDetail
import org.openapitools.models.ItemDetail
import org.openapitools.models.ItemFlingEffectDetail
import org.openapitools.models.ItemPocketDetail
import org.openapitools.models.PaginatedCurrencySummaryList
import org.openapitools.models.PaginatedItemAttributeSummaryList
import org.openapitools.models.PaginatedItemCategorySummaryList
import org.openapitools.models.PaginatedItemFlingEffectSummaryList
import org.openapitools.models.PaginatedItemPocketSummaryList
import org.openapitools.models.PaginatedItemSummaryList


import cats.Monad
import cats.syntax.all._

import org.http4s._
import org.http4s.circe._
import org.http4s.server._
import org.http4s.headers._
import org.http4s.dsl.Http4sDsl
import org.http4s.circe.CirceEntityEncoder._

final case class ItemsApiRoutes[
  F[_]: JsonDecoder: Monad
](delegate: ItemsApiDelegate[F]) extends Http4sDsl[F] {
  object currencyList {
    import ItemsApiDelegate.currencyListResponses

    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")
    object offsetQueryParam extends OptionalQueryParamDecoderMatcher[Int]("offset")
    object qQueryParam extends OptionalQueryParamDecoderMatcher[String]("q")

    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "currency" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q) =>
        delegate.currencyList.handle(req, limit, offset, q, responses)

    }


    val responses: currencyListResponses[F] = new currencyListResponses[F] {
      def resp200(value: PaginatedCurrencySummaryList): F[Response[F]] = Ok(value)
    }
  }
  object currencyRetrieve {
    import ItemsApiDelegate.currencyRetrieveResponses


    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "currency" / id =>
        delegate.currencyRetrieve.handle(req, id, responses)

    }


    val responses: currencyRetrieveResponses[F] = new currencyRetrieveResponses[F] {
      def resp200(value: CurrencyDetail): F[Response[F]] = Ok(value)
    }
  }
  object itemAttributeList {
    import ItemsApiDelegate.itemAttributeListResponses

    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")
    object offsetQueryParam extends OptionalQueryParamDecoderMatcher[Int]("offset")
    object qQueryParam extends OptionalQueryParamDecoderMatcher[String]("q")

    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "item-attribute" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q) =>
        delegate.itemAttributeList.handle(req, limit, offset, q, responses)

    }


    val responses: itemAttributeListResponses[F] = new itemAttributeListResponses[F] {
      def resp200(value: PaginatedItemAttributeSummaryList): F[Response[F]] = Ok(value)
    }
  }
  object itemAttributeRetrieve {
    import ItemsApiDelegate.itemAttributeRetrieveResponses


    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "item-attribute" / id =>
        delegate.itemAttributeRetrieve.handle(req, id, responses)

    }


    val responses: itemAttributeRetrieveResponses[F] = new itemAttributeRetrieveResponses[F] {
      def resp200(value: ItemAttributeDetail): F[Response[F]] = Ok(value)
    }
  }
  object itemCategoryList {
    import ItemsApiDelegate.itemCategoryListResponses

    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")
    object offsetQueryParam extends OptionalQueryParamDecoderMatcher[Int]("offset")
    object qQueryParam extends OptionalQueryParamDecoderMatcher[String]("q")

    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "item-category" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q) =>
        delegate.itemCategoryList.handle(req, limit, offset, q, responses)

    }


    val responses: itemCategoryListResponses[F] = new itemCategoryListResponses[F] {
      def resp200(value: PaginatedItemCategorySummaryList): F[Response[F]] = Ok(value)
    }
  }
  object itemCategoryRetrieve {
    import ItemsApiDelegate.itemCategoryRetrieveResponses


    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "item-category" / id =>
        delegate.itemCategoryRetrieve.handle(req, id, responses)

    }


    val responses: itemCategoryRetrieveResponses[F] = new itemCategoryRetrieveResponses[F] {
      def resp200(value: ItemCategoryDetail): F[Response[F]] = Ok(value)
    }
  }
  object itemFlingEffectList {
    import ItemsApiDelegate.itemFlingEffectListResponses

    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")
    object offsetQueryParam extends OptionalQueryParamDecoderMatcher[Int]("offset")
    object qQueryParam extends OptionalQueryParamDecoderMatcher[String]("q")

    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "item-fling-effect" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q) =>
        delegate.itemFlingEffectList.handle(req, limit, offset, q, responses)

    }


    val responses: itemFlingEffectListResponses[F] = new itemFlingEffectListResponses[F] {
      def resp200(value: PaginatedItemFlingEffectSummaryList): F[Response[F]] = Ok(value)
    }
  }
  object itemFlingEffectRetrieve {
    import ItemsApiDelegate.itemFlingEffectRetrieveResponses


    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "item-fling-effect" / id =>
        delegate.itemFlingEffectRetrieve.handle(req, id, responses)

    }


    val responses: itemFlingEffectRetrieveResponses[F] = new itemFlingEffectRetrieveResponses[F] {
      def resp200(value: ItemFlingEffectDetail): F[Response[F]] = Ok(value)
    }
  }
  object itemList {
    import ItemsApiDelegate.itemListResponses

    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")
    object offsetQueryParam extends OptionalQueryParamDecoderMatcher[Int]("offset")
    object qQueryParam extends OptionalQueryParamDecoderMatcher[String]("q")

    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "item" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q) =>
        delegate.itemList.handle(req, limit, offset, q, responses)

    }


    val responses: itemListResponses[F] = new itemListResponses[F] {
      def resp200(value: PaginatedItemSummaryList): F[Response[F]] = Ok(value)
    }
  }
  object itemPocketList {
    import ItemsApiDelegate.itemPocketListResponses

    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")
    object offsetQueryParam extends OptionalQueryParamDecoderMatcher[Int]("offset")
    object qQueryParam extends OptionalQueryParamDecoderMatcher[String]("q")

    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "item-pocket" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q) =>
        delegate.itemPocketList.handle(req, limit, offset, q, responses)

    }


    val responses: itemPocketListResponses[F] = new itemPocketListResponses[F] {
      def resp200(value: PaginatedItemPocketSummaryList): F[Response[F]] = Ok(value)
    }
  }
  object itemPocketRetrieve {
    import ItemsApiDelegate.itemPocketRetrieveResponses


    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "item-pocket" / id =>
        delegate.itemPocketRetrieve.handle(req, id, responses)

    }


    val responses: itemPocketRetrieveResponses[F] = new itemPocketRetrieveResponses[F] {
      def resp200(value: ItemPocketDetail): F[Response[F]] = Ok(value)
    }
  }
  object itemRetrieve {
    import ItemsApiDelegate.itemRetrieveResponses


    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "item" / id =>
        delegate.itemRetrieve.handle(req, id, responses)

    }


    val responses: itemRetrieveResponses[F] = new itemRetrieveResponses[F] {
      def resp200(value: ItemDetail): F[Response[F]] = Ok(value)
    }
  }

  val routes =
    currencyList.route <+>
    currencyRetrieve.route <+>
    itemAttributeList.route <+>
    itemAttributeRetrieve.route <+>
    itemCategoryList.route <+>
    itemCategoryRetrieve.route <+>
    itemFlingEffectList.route <+>
    itemFlingEffectRetrieve.route <+>
    itemList.route <+>
    itemPocketList.route <+>
    itemPocketRetrieve.route <+>
    itemRetrieve.route
}

object ItemsApiDelegate {
  trait currencyListResponses[F[_]] {
    def resp200(value: PaginatedCurrencySummaryList): F[Response[F]]
  }

  trait currencyRetrieveResponses[F[_]] {
    def resp200(value: CurrencyDetail): F[Response[F]]
  }

  trait itemAttributeListResponses[F[_]] {
    def resp200(value: PaginatedItemAttributeSummaryList): F[Response[F]]
  }

  trait itemAttributeRetrieveResponses[F[_]] {
    def resp200(value: ItemAttributeDetail): F[Response[F]]
  }

  trait itemCategoryListResponses[F[_]] {
    def resp200(value: PaginatedItemCategorySummaryList): F[Response[F]]
  }

  trait itemCategoryRetrieveResponses[F[_]] {
    def resp200(value: ItemCategoryDetail): F[Response[F]]
  }

  trait itemFlingEffectListResponses[F[_]] {
    def resp200(value: PaginatedItemFlingEffectSummaryList): F[Response[F]]
  }

  trait itemFlingEffectRetrieveResponses[F[_]] {
    def resp200(value: ItemFlingEffectDetail): F[Response[F]]
  }

  trait itemListResponses[F[_]] {
    def resp200(value: PaginatedItemSummaryList): F[Response[F]]
  }

  trait itemPocketListResponses[F[_]] {
    def resp200(value: PaginatedItemPocketSummaryList): F[Response[F]]
  }

  trait itemPocketRetrieveResponses[F[_]] {
    def resp200(value: ItemPocketDetail): F[Response[F]]
  }

  trait itemRetrieveResponses[F[_]] {
    def resp200(value: ItemDetail): F[Response[F]]
  }

}

trait ItemsApiDelegate[F[_]] {

  trait currencyList {
    import ItemsApiDelegate.currencyListResponses

    def handle(
      req: Request[F],
      limit: Option[Int],
      offset: Option[Int],
      q: Option[String],
      responses: currencyListResponses[F]
    ): F[Response[F]]

  }
  def currencyList: currencyList


  trait currencyRetrieve {
    import ItemsApiDelegate.currencyRetrieveResponses

    def handle(
      req: Request[F],
      id: String,
      responses: currencyRetrieveResponses[F]
    ): F[Response[F]]

  }
  def currencyRetrieve: currencyRetrieve


  trait itemAttributeList {
    import ItemsApiDelegate.itemAttributeListResponses

    def handle(
      req: Request[F],
      limit: Option[Int],
      offset: Option[Int],
      q: Option[String],
      responses: itemAttributeListResponses[F]
    ): F[Response[F]]

  }
  def itemAttributeList: itemAttributeList


  trait itemAttributeRetrieve {
    import ItemsApiDelegate.itemAttributeRetrieveResponses

    def handle(
      req: Request[F],
      id: String,
      responses: itemAttributeRetrieveResponses[F]
    ): F[Response[F]]

  }
  def itemAttributeRetrieve: itemAttributeRetrieve


  trait itemCategoryList {
    import ItemsApiDelegate.itemCategoryListResponses

    def handle(
      req: Request[F],
      limit: Option[Int],
      offset: Option[Int],
      q: Option[String],
      responses: itemCategoryListResponses[F]
    ): F[Response[F]]

  }
  def itemCategoryList: itemCategoryList


  trait itemCategoryRetrieve {
    import ItemsApiDelegate.itemCategoryRetrieveResponses

    def handle(
      req: Request[F],
      id: String,
      responses: itemCategoryRetrieveResponses[F]
    ): F[Response[F]]

  }
  def itemCategoryRetrieve: itemCategoryRetrieve


  trait itemFlingEffectList {
    import ItemsApiDelegate.itemFlingEffectListResponses

    def handle(
      req: Request[F],
      limit: Option[Int],
      offset: Option[Int],
      q: Option[String],
      responses: itemFlingEffectListResponses[F]
    ): F[Response[F]]

  }
  def itemFlingEffectList: itemFlingEffectList


  trait itemFlingEffectRetrieve {
    import ItemsApiDelegate.itemFlingEffectRetrieveResponses

    def handle(
      req: Request[F],
      id: String,
      responses: itemFlingEffectRetrieveResponses[F]
    ): F[Response[F]]

  }
  def itemFlingEffectRetrieve: itemFlingEffectRetrieve


  trait itemList {
    import ItemsApiDelegate.itemListResponses

    def handle(
      req: Request[F],
      limit: Option[Int],
      offset: Option[Int],
      q: Option[String],
      responses: itemListResponses[F]
    ): F[Response[F]]

  }
  def itemList: itemList


  trait itemPocketList {
    import ItemsApiDelegate.itemPocketListResponses

    def handle(
      req: Request[F],
      limit: Option[Int],
      offset: Option[Int],
      q: Option[String],
      responses: itemPocketListResponses[F]
    ): F[Response[F]]

  }
  def itemPocketList: itemPocketList


  trait itemPocketRetrieve {
    import ItemsApiDelegate.itemPocketRetrieveResponses

    def handle(
      req: Request[F],
      id: String,
      responses: itemPocketRetrieveResponses[F]
    ): F[Response[F]]

  }
  def itemPocketRetrieve: itemPocketRetrieve


  trait itemRetrieve {
    import ItemsApiDelegate.itemRetrieveResponses

    def handle(
      req: Request[F],
      id: String,
      responses: itemRetrieveResponses[F]
    ): F[Response[F]]

  }
  def itemRetrieve: itemRetrieve

}