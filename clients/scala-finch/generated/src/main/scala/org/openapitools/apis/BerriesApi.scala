package org.openapitools.apis

import java.io._
import org.openapitools._
import org.openapitools.models._
import org.openapitools.models.BerryDetail
import org.openapitools.models.BerryFirmnessDetail
import org.openapitools.models.BerryFlavorDetail
import org.openapitools.models.PaginatedBerryFirmnessSummaryList
import org.openapitools.models.PaginatedBerryFlavorSummaryList
import org.openapitools.models.PaginatedBerrySummaryList
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

object BerriesApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        berryFirmnessList(da) :+:
        berryFirmnessRetrieve(da) :+:
        berryFlavorList(da) :+:
        berryFlavorRetrieve(da) :+:
        berryList(da) :+:
        berryRetrieve(da)


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
        * @return An endpoint representing a PaginatedBerryFirmnessSummaryList
        */
        private def berryFirmnessList(da: DataAccessor): Endpoint[PaginatedBerryFirmnessSummaryList] =
        get("api" :: "v2" :: "berry-firmness" :: paramOption("limit").map(_.map(_.toInt)) :: paramOption("offset").map(_.map(_.toInt)) :: paramOption("q")) { (limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String) =>
          da.Berries_berryFirmnessList(limit, offset, q, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a BerryFirmnessDetail
        */
        private def berryFirmnessRetrieve(da: DataAccessor): Endpoint[BerryFirmnessDetail] =
        get("api" :: "v2" :: "berry-firmness" :: string) { (id: String, authParamcookieAuth: String) =>
          da.Berries_berryFirmnessRetrieve(id, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a PaginatedBerryFlavorSummaryList
        */
        private def berryFlavorList(da: DataAccessor): Endpoint[PaginatedBerryFlavorSummaryList] =
        get("api" :: "v2" :: "berry-flavor" :: paramOption("limit").map(_.map(_.toInt)) :: paramOption("offset").map(_.map(_.toInt)) :: paramOption("q")) { (limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String) =>
          da.Berries_berryFlavorList(limit, offset, q, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a BerryFlavorDetail
        */
        private def berryFlavorRetrieve(da: DataAccessor): Endpoint[BerryFlavorDetail] =
        get("api" :: "v2" :: "berry-flavor" :: string) { (id: String, authParamcookieAuth: String) =>
          da.Berries_berryFlavorRetrieve(id, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a PaginatedBerrySummaryList
        */
        private def berryList(da: DataAccessor): Endpoint[PaginatedBerrySummaryList] =
        get("api" :: "v2" :: "berry" :: paramOption("limit").map(_.map(_.toInt)) :: paramOption("offset").map(_.map(_.toInt)) :: paramOption("q")) { (limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String) =>
          da.Berries_berryList(limit, offset, q, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a BerryDetail
        */
        private def berryRetrieve(da: DataAccessor): Endpoint[BerryDetail] =
        get("api" :: "v2" :: "berry" :: string) { (id: String, authParamcookieAuth: String) =>
          da.Berries_berryRetrieve(id, authParamcookieAuth) match {
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
      val file = Files.createTempFile("tmpBerriesApi", null).toFile
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}
