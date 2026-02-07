package org.openapitools.apis

import java.io._
import org.openapitools._
import org.openapitools.models._
import org.openapitools.models.ContestEffectDetail
import org.openapitools.models.ContestTypeDetail
import org.openapitools.models.PaginatedContestEffectSummaryList
import org.openapitools.models.PaginatedContestTypeSummaryList
import org.openapitools.models.PaginatedSuperContestEffectSummaryList
import org.openapitools.models.SuperContestEffectDetail
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

object ContestsApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        contestEffectList(da) :+:
        contestEffectRetrieve(da) :+:
        contestTypeList(da) :+:
        contestTypeRetrieve(da) :+:
        superContestEffectList(da) :+:
        superContestEffectRetrieve(da)


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
        * @return An endpoint representing a PaginatedContestEffectSummaryList
        */
        private def contestEffectList(da: DataAccessor): Endpoint[PaginatedContestEffectSummaryList] =
        get("api" :: "v2" :: "contest-effect" :: paramOption("limit").map(_.map(_.toInt)) :: paramOption("offset").map(_.map(_.toInt)) :: paramOption("q")) { (limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String) =>
          da.Contests_contestEffectList(limit, offset, q, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a ContestEffectDetail
        */
        private def contestEffectRetrieve(da: DataAccessor): Endpoint[ContestEffectDetail] =
        get("api" :: "v2" :: "contest-effect" :: string) { (id: String, authParamcookieAuth: String) =>
          da.Contests_contestEffectRetrieve(id, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a PaginatedContestTypeSummaryList
        */
        private def contestTypeList(da: DataAccessor): Endpoint[PaginatedContestTypeSummaryList] =
        get("api" :: "v2" :: "contest-type" :: paramOption("limit").map(_.map(_.toInt)) :: paramOption("offset").map(_.map(_.toInt)) :: paramOption("q")) { (limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String) =>
          da.Contests_contestTypeList(limit, offset, q, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a ContestTypeDetail
        */
        private def contestTypeRetrieve(da: DataAccessor): Endpoint[ContestTypeDetail] =
        get("api" :: "v2" :: "contest-type" :: string) { (id: String, authParamcookieAuth: String) =>
          da.Contests_contestTypeRetrieve(id, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a PaginatedSuperContestEffectSummaryList
        */
        private def superContestEffectList(da: DataAccessor): Endpoint[PaginatedSuperContestEffectSummaryList] =
        get("api" :: "v2" :: "super-contest-effect" :: paramOption("limit").map(_.map(_.toInt)) :: paramOption("offset").map(_.map(_.toInt)) :: paramOption("q")) { (limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String) =>
          da.Contests_superContestEffectList(limit, offset, q, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a SuperContestEffectDetail
        */
        private def superContestEffectRetrieve(da: DataAccessor): Endpoint[SuperContestEffectDetail] =
        get("api" :: "v2" :: "super-contest-effect" :: string) { (id: String, authParamcookieAuth: String) =>
          da.Contests_superContestEffectRetrieve(id, authParamcookieAuth) match {
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
      val file = Files.createTempFile("tmpContestsApi", null).toFile
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}
