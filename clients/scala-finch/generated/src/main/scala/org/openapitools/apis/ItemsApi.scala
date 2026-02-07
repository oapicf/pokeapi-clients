package org.openapitools.apis

import java.io._
import org.openapitools._
import org.openapitools.models._
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
import io.finch.circe._
import io.circe.generic.semiauto._
import com.twitter.concurrent.AsyncStream
import com.twitter.finagle.Service
import com.twitter.finagle.Http
import com.twitter.finagle.http.{Request, Response}
import com.twitter.finagle.http.exp.Multipart.{FileUpload, InMemoryFileUpload, OnDiskFileUpload}
import com.twitter.util.Future
import com.twitter.io.Buf
import io.finch._, items._
import java.io.File
import java.nio.file.Files
import java.time._

object ItemsApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        itemAttributeList(da) :+:
        itemAttributeRetrieve(da) :+:
        itemCategoryList(da) :+:
        itemCategoryRetrieve(da) :+:
        itemFlingEffectList(da) :+:
        itemFlingEffectRetrieve(da) :+:
        itemList(da) :+:
        itemPocketList(da) :+:
        itemPocketRetrieve(da) :+:
        itemRetrieve(da)


    private def checkError(e: CommonError) = e match {
      case InvalidInput(_) => BadRequest(e)
      case MissingIdentifier(_) => BadRequest(e)
      case RecordNotFound(_) => NotFound(e)
      case _ => InternalServerError(e)
    }

    implicit class StringOps(s: String) {

      import java.time.format.DateTimeFormatter

      lazy val localformatter: DateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd")
      lazy val datetimeformatter: DateTimeFormatter =
      DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ")

      def toLocalDateTime: LocalDateTime = LocalDateTime.parse(s,localformatter)
      def toZonedDateTime: ZonedDateTime = ZonedDateTime.parse(s, datetimeformatter)

    }

        /**
        * 
        * @return An endpoint representing a PaginatedItemAttributeSummaryList
        */
        private def itemAttributeList(da: DataAccessor): Endpoint[PaginatedItemAttributeSummaryList] =
        get("api" :: "v2" :: "item-attribute" :: paramOption("limit").map(_.map(_.toInt)) :: paramOption("offset").map(_.map(_.toInt)) :: paramOption("q")) { (limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String) =>
          da.Items_itemAttributeList(limit, offset, q, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a ItemAttributeDetail
        */
        private def itemAttributeRetrieve(da: DataAccessor): Endpoint[ItemAttributeDetail] =
        get("api" :: "v2" :: "item-attribute" :: string) { (id: String, authParamcookieAuth: String) =>
          da.Items_itemAttributeRetrieve(id, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a PaginatedItemCategorySummaryList
        */
        private def itemCategoryList(da: DataAccessor): Endpoint[PaginatedItemCategorySummaryList] =
        get("api" :: "v2" :: "item-category" :: paramOption("limit").map(_.map(_.toInt)) :: paramOption("offset").map(_.map(_.toInt)) :: paramOption("q")) { (limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String) =>
          da.Items_itemCategoryList(limit, offset, q, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a ItemCategoryDetail
        */
        private def itemCategoryRetrieve(da: DataAccessor): Endpoint[ItemCategoryDetail] =
        get("api" :: "v2" :: "item-category" :: string) { (id: String, authParamcookieAuth: String) =>
          da.Items_itemCategoryRetrieve(id, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a PaginatedItemFlingEffectSummaryList
        */
        private def itemFlingEffectList(da: DataAccessor): Endpoint[PaginatedItemFlingEffectSummaryList] =
        get("api" :: "v2" :: "item-fling-effect" :: paramOption("limit").map(_.map(_.toInt)) :: paramOption("offset").map(_.map(_.toInt)) :: paramOption("q")) { (limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String) =>
          da.Items_itemFlingEffectList(limit, offset, q, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a ItemFlingEffectDetail
        */
        private def itemFlingEffectRetrieve(da: DataAccessor): Endpoint[ItemFlingEffectDetail] =
        get("api" :: "v2" :: "item-fling-effect" :: string) { (id: String, authParamcookieAuth: String) =>
          da.Items_itemFlingEffectRetrieve(id, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a PaginatedItemSummaryList
        */
        private def itemList(da: DataAccessor): Endpoint[PaginatedItemSummaryList] =
        get("api" :: "v2" :: "item" :: paramOption("limit").map(_.map(_.toInt)) :: paramOption("offset").map(_.map(_.toInt)) :: paramOption("q")) { (limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String) =>
          da.Items_itemList(limit, offset, q, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a PaginatedItemPocketSummaryList
        */
        private def itemPocketList(da: DataAccessor): Endpoint[PaginatedItemPocketSummaryList] =
        get("api" :: "v2" :: "item-pocket" :: paramOption("limit").map(_.map(_.toInt)) :: paramOption("offset").map(_.map(_.toInt)) :: paramOption("q")) { (limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String) =>
          da.Items_itemPocketList(limit, offset, q, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a ItemPocketDetail
        */
        private def itemPocketRetrieve(da: DataAccessor): Endpoint[ItemPocketDetail] =
        get("api" :: "v2" :: "item-pocket" :: string) { (id: String, authParamcookieAuth: String) =>
          da.Items_itemPocketRetrieve(id, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a ItemDetail
        */
        private def itemRetrieve(da: DataAccessor): Endpoint[ItemDetail] =
        get("api" :: "v2" :: "item" :: string) { (id: String, authParamcookieAuth: String) =>
          da.Items_itemRetrieve(id, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }


    implicit private def fileUploadToFile(fileUpload: FileUpload) : File = {
      fileUpload match {
        case upload: InMemoryFileUpload =>
          bytesToFile(Buf.ByteArray.Owned.extract(upload.content))
        case upload: OnDiskFileUpload =>
          upload.content
        case _ => null
      }
    }

    private def bytesToFile(input: Array[Byte]): java.io.File = {
      val file = Files.createTempFile("tmpItemsApi", null).toFile
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}
