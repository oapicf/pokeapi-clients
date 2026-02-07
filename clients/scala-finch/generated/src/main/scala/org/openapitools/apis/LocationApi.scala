package org.openapitools.apis

import java.io._
import org.openapitools._
import org.openapitools.models._
import org.openapitools.models.LocationAreaDetail
import org.openapitools.models.LocationDetail
import org.openapitools.models.PaginatedLocationAreaSummaryList
import org.openapitools.models.PaginatedLocationSummaryList
import org.openapitools.models.PaginatedPalParkAreaSummaryList
import org.openapitools.models.PaginatedRegionSummaryList
import org.openapitools.models.PalParkAreaDetail
import org.openapitools.models.RegionDetail
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

object LocationApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        locationAreaList(da) :+:
        locationAreaRetrieve(da) :+:
        locationList(da) :+:
        locationRetrieve(da) :+:
        palParkAreaList(da) :+:
        palParkAreaRetrieve(da) :+:
        regionList(da) :+:
        regionRetrieve(da)


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
        * @return An endpoint representing a PaginatedLocationAreaSummaryList
        */
        private def locationAreaList(da: DataAccessor): Endpoint[PaginatedLocationAreaSummaryList] =
        get("api" :: "v2" :: "location-area" :: paramOption("limit").map(_.map(_.toInt)) :: paramOption("offset").map(_.map(_.toInt))) { (limit: Option[Int], offset: Option[Int], authParamcookieAuth: String) =>
          da.Location_locationAreaList(limit, offset, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a LocationAreaDetail
        */
        private def locationAreaRetrieve(da: DataAccessor): Endpoint[LocationAreaDetail] =
        get("api" :: "v2" :: "location-area" :: int) { (id: Int, authParamcookieAuth: String) =>
          da.Location_locationAreaRetrieve(id, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a PaginatedLocationSummaryList
        */
        private def locationList(da: DataAccessor): Endpoint[PaginatedLocationSummaryList] =
        get("api" :: "v2" :: "location" :: paramOption("limit").map(_.map(_.toInt)) :: paramOption("offset").map(_.map(_.toInt)) :: paramOption("q")) { (limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String) =>
          da.Location_locationList(limit, offset, q, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a LocationDetail
        */
        private def locationRetrieve(da: DataAccessor): Endpoint[LocationDetail] =
        get("api" :: "v2" :: "location" :: string) { (id: String, authParamcookieAuth: String) =>
          da.Location_locationRetrieve(id, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a PaginatedPalParkAreaSummaryList
        */
        private def palParkAreaList(da: DataAccessor): Endpoint[PaginatedPalParkAreaSummaryList] =
        get("api" :: "v2" :: "pal-park-area" :: paramOption("limit").map(_.map(_.toInt)) :: paramOption("offset").map(_.map(_.toInt)) :: paramOption("q")) { (limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String) =>
          da.Location_palParkAreaList(limit, offset, q, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a PalParkAreaDetail
        */
        private def palParkAreaRetrieve(da: DataAccessor): Endpoint[PalParkAreaDetail] =
        get("api" :: "v2" :: "pal-park-area" :: string) { (id: String, authParamcookieAuth: String) =>
          da.Location_palParkAreaRetrieve(id, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a PaginatedRegionSummaryList
        */
        private def regionList(da: DataAccessor): Endpoint[PaginatedRegionSummaryList] =
        get("api" :: "v2" :: "region" :: paramOption("limit").map(_.map(_.toInt)) :: paramOption("offset").map(_.map(_.toInt)) :: paramOption("q")) { (limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String) =>
          da.Location_regionList(limit, offset, q, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a RegionDetail
        */
        private def regionRetrieve(da: DataAccessor): Endpoint[RegionDetail] =
        get("api" :: "v2" :: "region" :: string) { (id: String, authParamcookieAuth: String) =>
          da.Location_regionRetrieve(id, authParamcookieAuth) match {
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
      val file = Files.createTempFile("tmpLocationApi", null).toFile
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}
