package org.openapitools.apis

import java.io._
import org.openapitools._
import org.openapitools.models._
import org.openapitools.models.EncounterConditionDetail
import org.openapitools.models.EncounterConditionValueDetail
import org.openapitools.models.EncounterMethodDetail
import org.openapitools.models.PaginatedEncounterConditionSummaryList
import org.openapitools.models.PaginatedEncounterConditionValueSummaryList
import org.openapitools.models.PaginatedEncounterMethodSummaryList
import org.openapitools.models.PokemonEncountersRetrieve200ResponseInner
import scala.collection.immutable.Seq
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

object EncountersApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        encounterConditionList(da) :+:
        encounterConditionRetrieve(da) :+:
        encounterConditionValueList(da) :+:
        encounterConditionValueRetrieve(da) :+:
        encounterMethodList(da) :+:
        encounterMethodRetrieve(da) :+:
        pokemonEncountersRetrieve(da)


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
        * @return An endpoint representing a PaginatedEncounterConditionSummaryList
        */
        private def encounterConditionList(da: DataAccessor): Endpoint[PaginatedEncounterConditionSummaryList] =
        get("api" :: "v2" :: "encounter-condition" :: paramOption("limit").map(_.map(_.toInt)) :: paramOption("offset").map(_.map(_.toInt)) :: paramOption("q")) { (limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String) =>
          da.Encounters_encounterConditionList(limit, offset, q, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a EncounterConditionDetail
        */
        private def encounterConditionRetrieve(da: DataAccessor): Endpoint[EncounterConditionDetail] =
        get("api" :: "v2" :: "encounter-condition" :: string) { (id: String, authParamcookieAuth: String) =>
          da.Encounters_encounterConditionRetrieve(id, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a PaginatedEncounterConditionValueSummaryList
        */
        private def encounterConditionValueList(da: DataAccessor): Endpoint[PaginatedEncounterConditionValueSummaryList] =
        get("api" :: "v2" :: "encounter-condition-value" :: paramOption("limit").map(_.map(_.toInt)) :: paramOption("offset").map(_.map(_.toInt)) :: paramOption("q")) { (limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String) =>
          da.Encounters_encounterConditionValueList(limit, offset, q, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a EncounterConditionValueDetail
        */
        private def encounterConditionValueRetrieve(da: DataAccessor): Endpoint[EncounterConditionValueDetail] =
        get("api" :: "v2" :: "encounter-condition-value" :: string) { (id: String, authParamcookieAuth: String) =>
          da.Encounters_encounterConditionValueRetrieve(id, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a PaginatedEncounterMethodSummaryList
        */
        private def encounterMethodList(da: DataAccessor): Endpoint[PaginatedEncounterMethodSummaryList] =
        get("api" :: "v2" :: "encounter-method" :: paramOption("limit").map(_.map(_.toInt)) :: paramOption("offset").map(_.map(_.toInt)) :: paramOption("q")) { (limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String) =>
          da.Encounters_encounterMethodList(limit, offset, q, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a EncounterMethodDetail
        */
        private def encounterMethodRetrieve(da: DataAccessor): Endpoint[EncounterMethodDetail] =
        get("api" :: "v2" :: "encounter-method" :: string) { (id: String, authParamcookieAuth: String) =>
          da.Encounters_encounterMethodRetrieve(id, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a Seq[PokemonEncountersRetrieve200ResponseInner]
        */
        private def pokemonEncountersRetrieve(da: DataAccessor): Endpoint[Seq[PokemonEncountersRetrieve200ResponseInner]] =
        get("api" :: "v2" :: "pokemon" :: string :: "encounters") { (pokemonId: String, authParamcookieAuth: String) =>
          da.Encounters_pokemonEncountersRetrieve(pokemonId, authParamcookieAuth) match {
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
      val file = Files.createTempFile("tmpEncountersApi", null).toFile
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}
