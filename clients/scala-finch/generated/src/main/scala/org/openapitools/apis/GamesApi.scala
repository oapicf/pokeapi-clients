package org.openapitools.apis

import java.io._
import org.openapitools._
import org.openapitools.models._
import org.openapitools.models.GenerationDetail
import org.openapitools.models.PaginatedGenerationSummaryList
import org.openapitools.models.PaginatedPokedexSummaryList
import org.openapitools.models.PaginatedVersionGroupSummaryList
import org.openapitools.models.PaginatedVersionSummaryList
import org.openapitools.models.PokedexDetail
import org.openapitools.models.VersionDetail
import org.openapitools.models.VersionGroupDetail
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

object GamesApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        generationList(da) :+:
        generationRetrieve(da) :+:
        pokedexList(da) :+:
        pokedexRetrieve(da) :+:
        versionGroupList(da) :+:
        versionGroupRetrieve(da) :+:
        versionList(da) :+:
        versionRetrieve(da)


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
        * @return An endpoint representing a PaginatedGenerationSummaryList
        */
        private def generationList(da: DataAccessor): Endpoint[PaginatedGenerationSummaryList] =
        get("api" :: "v2" :: "generation" :: paramOption("limit").map(_.map(_.toInt)) :: paramOption("offset").map(_.map(_.toInt)) :: paramOption("q")) { (limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String) =>
          da.Games_generationList(limit, offset, q, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GenerationDetail
        */
        private def generationRetrieve(da: DataAccessor): Endpoint[GenerationDetail] =
        get("api" :: "v2" :: "generation" :: string) { (id: String, authParamcookieAuth: String) =>
          da.Games_generationRetrieve(id, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a PaginatedPokedexSummaryList
        */
        private def pokedexList(da: DataAccessor): Endpoint[PaginatedPokedexSummaryList] =
        get("api" :: "v2" :: "pokedex" :: paramOption("limit").map(_.map(_.toInt)) :: paramOption("offset").map(_.map(_.toInt)) :: paramOption("q")) { (limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String) =>
          da.Games_pokedexList(limit, offset, q, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a PokedexDetail
        */
        private def pokedexRetrieve(da: DataAccessor): Endpoint[PokedexDetail] =
        get("api" :: "v2" :: "pokedex" :: string) { (id: String, authParamcookieAuth: String) =>
          da.Games_pokedexRetrieve(id, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a PaginatedVersionGroupSummaryList
        */
        private def versionGroupList(da: DataAccessor): Endpoint[PaginatedVersionGroupSummaryList] =
        get("api" :: "v2" :: "version-group" :: paramOption("limit").map(_.map(_.toInt)) :: paramOption("offset").map(_.map(_.toInt)) :: paramOption("q")) { (limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String) =>
          da.Games_versionGroupList(limit, offset, q, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a VersionGroupDetail
        */
        private def versionGroupRetrieve(da: DataAccessor): Endpoint[VersionGroupDetail] =
        get("api" :: "v2" :: "version-group" :: string) { (id: String, authParamcookieAuth: String) =>
          da.Games_versionGroupRetrieve(id, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a PaginatedVersionSummaryList
        */
        private def versionList(da: DataAccessor): Endpoint[PaginatedVersionSummaryList] =
        get("api" :: "v2" :: "version" :: paramOption("limit").map(_.map(_.toInt)) :: paramOption("offset").map(_.map(_.toInt)) :: paramOption("q")) { (limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String) =>
          da.Games_versionList(limit, offset, q, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a VersionDetail
        */
        private def versionRetrieve(da: DataAccessor): Endpoint[VersionDetail] =
        get("api" :: "v2" :: "version" :: string) { (id: String, authParamcookieAuth: String) =>
          da.Games_versionRetrieve(id, authParamcookieAuth) match {
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
      val file = Files.createTempFile("tmpGamesApi", null).toFile
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}
