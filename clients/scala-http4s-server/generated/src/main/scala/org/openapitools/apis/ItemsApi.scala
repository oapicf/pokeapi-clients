package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.ItemAttributeDetail
import org.openapitools.models.ItemCategoryDetail
import org.openapitools.models.ItemDetail
import org.openapitools.models.ItemFlingEffectDetail
import org.openapitools.models.ItemPocketDetail
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
  F[_]: JsonDecoder: Monad, basicAuth, cookieAuth
](delegate: ItemsApiDelegate[F, basicAuth, cookieAuth]) extends Http4sDsl[F] {
  object itemAttributeList {
    import ItemsApiDelegate.itemAttributeListResponses

    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")
    object offsetQueryParam extends OptionalQueryParamDecoderMatcher[Int]("offset")
    object qQueryParam extends OptionalQueryParamDecoderMatcher[String]("q")

    val routebasicAuth = AuthedRoutes.of[basicAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "item-attribute" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q)) as auth =>
        delegate.itemAttributeList.handle_basicAuth(auth, req, limit, offset, q, responses)

    }
    val routecookieAuth = AuthedRoutes.of[cookieAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "item-attribute" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q)) as auth =>
        delegate.itemAttributeList.handle_cookieAuth(auth, req, limit, offset, q, responses)

    }

    val responses: itemAttributeListResponses[F] = new itemAttributeListResponses[F] {
      def resp200(value: PaginatedItemAttributeSummaryList): F[Response[F]] = Ok(value)
    }
  }
  object itemAttributeRetrieve {
    import ItemsApiDelegate.itemAttributeRetrieveResponses


    val routebasicAuth = AuthedRoutes.of[basicAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "item-attribute" / id) as auth =>
        delegate.itemAttributeRetrieve.handle_basicAuth(auth, req, id, responses)

    }
    val routecookieAuth = AuthedRoutes.of[cookieAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "item-attribute" / id) as auth =>
        delegate.itemAttributeRetrieve.handle_cookieAuth(auth, req, id, responses)

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

    val routebasicAuth = AuthedRoutes.of[basicAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "item-category" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q)) as auth =>
        delegate.itemCategoryList.handle_basicAuth(auth, req, limit, offset, q, responses)

    }
    val routecookieAuth = AuthedRoutes.of[cookieAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "item-category" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q)) as auth =>
        delegate.itemCategoryList.handle_cookieAuth(auth, req, limit, offset, q, responses)

    }

    val responses: itemCategoryListResponses[F] = new itemCategoryListResponses[F] {
      def resp200(value: PaginatedItemCategorySummaryList): F[Response[F]] = Ok(value)
    }
  }
  object itemCategoryRetrieve {
    import ItemsApiDelegate.itemCategoryRetrieveResponses


    val routebasicAuth = AuthedRoutes.of[basicAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "item-category" / id) as auth =>
        delegate.itemCategoryRetrieve.handle_basicAuth(auth, req, id, responses)

    }
    val routecookieAuth = AuthedRoutes.of[cookieAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "item-category" / id) as auth =>
        delegate.itemCategoryRetrieve.handle_cookieAuth(auth, req, id, responses)

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

    val routebasicAuth = AuthedRoutes.of[basicAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "item-fling-effect" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q)) as auth =>
        delegate.itemFlingEffectList.handle_basicAuth(auth, req, limit, offset, q, responses)

    }
    val routecookieAuth = AuthedRoutes.of[cookieAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "item-fling-effect" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q)) as auth =>
        delegate.itemFlingEffectList.handle_cookieAuth(auth, req, limit, offset, q, responses)

    }

    val responses: itemFlingEffectListResponses[F] = new itemFlingEffectListResponses[F] {
      def resp200(value: PaginatedItemFlingEffectSummaryList): F[Response[F]] = Ok(value)
    }
  }
  object itemFlingEffectRetrieve {
    import ItemsApiDelegate.itemFlingEffectRetrieveResponses


    val routebasicAuth = AuthedRoutes.of[basicAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "item-fling-effect" / id) as auth =>
        delegate.itemFlingEffectRetrieve.handle_basicAuth(auth, req, id, responses)

    }
    val routecookieAuth = AuthedRoutes.of[cookieAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "item-fling-effect" / id) as auth =>
        delegate.itemFlingEffectRetrieve.handle_cookieAuth(auth, req, id, responses)

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

    val routebasicAuth = AuthedRoutes.of[basicAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "item" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q)) as auth =>
        delegate.itemList.handle_basicAuth(auth, req, limit, offset, q, responses)

    }
    val routecookieAuth = AuthedRoutes.of[cookieAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "item" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q)) as auth =>
        delegate.itemList.handle_cookieAuth(auth, req, limit, offset, q, responses)

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

    val routebasicAuth = AuthedRoutes.of[basicAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "item-pocket" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q)) as auth =>
        delegate.itemPocketList.handle_basicAuth(auth, req, limit, offset, q, responses)

    }
    val routecookieAuth = AuthedRoutes.of[cookieAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "item-pocket" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q)) as auth =>
        delegate.itemPocketList.handle_cookieAuth(auth, req, limit, offset, q, responses)

    }

    val responses: itemPocketListResponses[F] = new itemPocketListResponses[F] {
      def resp200(value: PaginatedItemPocketSummaryList): F[Response[F]] = Ok(value)
    }
  }
  object itemPocketRetrieve {
    import ItemsApiDelegate.itemPocketRetrieveResponses


    val routebasicAuth = AuthedRoutes.of[basicAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "item-pocket" / id) as auth =>
        delegate.itemPocketRetrieve.handle_basicAuth(auth, req, id, responses)

    }
    val routecookieAuth = AuthedRoutes.of[cookieAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "item-pocket" / id) as auth =>
        delegate.itemPocketRetrieve.handle_cookieAuth(auth, req, id, responses)

    }

    val responses: itemPocketRetrieveResponses[F] = new itemPocketRetrieveResponses[F] {
      def resp200(value: ItemPocketDetail): F[Response[F]] = Ok(value)
    }
  }
  object itemRetrieve {
    import ItemsApiDelegate.itemRetrieveResponses


    val routebasicAuth = AuthedRoutes.of[basicAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "item" / id) as auth =>
        delegate.itemRetrieve.handle_basicAuth(auth, req, id, responses)

    }
    val routecookieAuth = AuthedRoutes.of[cookieAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "item" / id) as auth =>
        delegate.itemRetrieve.handle_cookieAuth(auth, req, id, responses)

    }

    val responses: itemRetrieveResponses[F] = new itemRetrieveResponses[F] {
      def resp200(value: ItemDetail): F[Response[F]] = Ok(value)
    }
  }

  val routesbasicAuth =
    itemAttributeList.routebasicAuth <+>
    itemAttributeRetrieve.routebasicAuth <+>
    itemCategoryList.routebasicAuth <+>
    itemCategoryRetrieve.routebasicAuth <+>
    itemFlingEffectList.routebasicAuth <+>
    itemFlingEffectRetrieve.routebasicAuth <+>
    itemList.routebasicAuth <+>
    itemPocketList.routebasicAuth <+>
    itemPocketRetrieve.routebasicAuth <+>
    itemRetrieve.routebasicAuth
  val routescookieAuth =
    itemAttributeList.routecookieAuth <+>
    itemAttributeRetrieve.routecookieAuth <+>
    itemCategoryList.routecookieAuth <+>
    itemCategoryRetrieve.routecookieAuth <+>
    itemFlingEffectList.routecookieAuth <+>
    itemFlingEffectRetrieve.routecookieAuth <+>
    itemList.routecookieAuth <+>
    itemPocketList.routecookieAuth <+>
    itemPocketRetrieve.routecookieAuth <+>
    itemRetrieve.routecookieAuth
}

object ItemsApiDelegate {
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

trait ItemsApiDelegate[F[_], basicAuth, cookieAuth] {

  trait itemAttributeList {
    import ItemsApiDelegate.itemAttributeListResponses


    def handle_basicAuth(
      auth: basicAuth,
      req: Request[F],
      limit: Option[Int],
      offset: Option[Int],
      q: Option[String],
      responses: itemAttributeListResponses[F]
    ): F[Response[F]]

    def handle_cookieAuth(
      auth: cookieAuth,
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


    def handle_basicAuth(
      auth: basicAuth,
      req: Request[F],
      id: String,
      responses: itemAttributeRetrieveResponses[F]
    ): F[Response[F]]

    def handle_cookieAuth(
      auth: cookieAuth,
      req: Request[F],
      id: String,
      responses: itemAttributeRetrieveResponses[F]
    ): F[Response[F]]

  }
  def itemAttributeRetrieve: itemAttributeRetrieve


  trait itemCategoryList {
    import ItemsApiDelegate.itemCategoryListResponses


    def handle_basicAuth(
      auth: basicAuth,
      req: Request[F],
      limit: Option[Int],
      offset: Option[Int],
      q: Option[String],
      responses: itemCategoryListResponses[F]
    ): F[Response[F]]

    def handle_cookieAuth(
      auth: cookieAuth,
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


    def handle_basicAuth(
      auth: basicAuth,
      req: Request[F],
      id: String,
      responses: itemCategoryRetrieveResponses[F]
    ): F[Response[F]]

    def handle_cookieAuth(
      auth: cookieAuth,
      req: Request[F],
      id: String,
      responses: itemCategoryRetrieveResponses[F]
    ): F[Response[F]]

  }
  def itemCategoryRetrieve: itemCategoryRetrieve


  trait itemFlingEffectList {
    import ItemsApiDelegate.itemFlingEffectListResponses


    def handle_basicAuth(
      auth: basicAuth,
      req: Request[F],
      limit: Option[Int],
      offset: Option[Int],
      q: Option[String],
      responses: itemFlingEffectListResponses[F]
    ): F[Response[F]]

    def handle_cookieAuth(
      auth: cookieAuth,
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


    def handle_basicAuth(
      auth: basicAuth,
      req: Request[F],
      id: String,
      responses: itemFlingEffectRetrieveResponses[F]
    ): F[Response[F]]

    def handle_cookieAuth(
      auth: cookieAuth,
      req: Request[F],
      id: String,
      responses: itemFlingEffectRetrieveResponses[F]
    ): F[Response[F]]

  }
  def itemFlingEffectRetrieve: itemFlingEffectRetrieve


  trait itemList {
    import ItemsApiDelegate.itemListResponses


    def handle_basicAuth(
      auth: basicAuth,
      req: Request[F],
      limit: Option[Int],
      offset: Option[Int],
      q: Option[String],
      responses: itemListResponses[F]
    ): F[Response[F]]

    def handle_cookieAuth(
      auth: cookieAuth,
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


    def handle_basicAuth(
      auth: basicAuth,
      req: Request[F],
      limit: Option[Int],
      offset: Option[Int],
      q: Option[String],
      responses: itemPocketListResponses[F]
    ): F[Response[F]]

    def handle_cookieAuth(
      auth: cookieAuth,
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


    def handle_basicAuth(
      auth: basicAuth,
      req: Request[F],
      id: String,
      responses: itemPocketRetrieveResponses[F]
    ): F[Response[F]]

    def handle_cookieAuth(
      auth: cookieAuth,
      req: Request[F],
      id: String,
      responses: itemPocketRetrieveResponses[F]
    ): F[Response[F]]

  }
  def itemPocketRetrieve: itemPocketRetrieve


  trait itemRetrieve {
    import ItemsApiDelegate.itemRetrieveResponses


    def handle_basicAuth(
      auth: basicAuth,
      req: Request[F],
      id: String,
      responses: itemRetrieveResponses[F]
    ): F[Response[F]]

    def handle_cookieAuth(
      auth: cookieAuth,
      req: Request[F],
      id: String,
      responses: itemRetrieveResponses[F]
    ): F[Response[F]]

  }
  def itemRetrieve: itemRetrieve

}