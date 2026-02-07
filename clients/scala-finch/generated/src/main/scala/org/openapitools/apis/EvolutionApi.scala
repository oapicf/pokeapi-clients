package org.openapitools.apis

import java.io._
import org.openapitools._
import org.openapitools.models._
import org.openapitools.models.EvolutionChainDetail
import org.openapitools.models.EvolutionTriggerDetail
import org.openapitools.models.PaginatedEvolutionChainSummaryList
import org.openapitools.models.PaginatedEvolutionTriggerSummaryList
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

object EvolutionApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        evolutionChainList(da) :+:
        evolutionChainRetrieve(da) :+:
        evolutionTriggerList(da) :+:
        evolutionTriggerRetrieve(da)


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
        * @return An endpoint representing a PaginatedEvolutionChainSummaryList
        */
        private def evolutionChainList(da: DataAccessor): Endpoint[PaginatedEvolutionChainSummaryList] =
        get("api" :: "v2" :: "evolution-chain" :: paramOption("limit").map(_.map(_.toInt)) :: paramOption("offset").map(_.map(_.toInt)) :: paramOption("q")) { (limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String) =>
          da.Evolution_evolutionChainList(limit, offset, q, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a EvolutionChainDetail
        */
        private def evolutionChainRetrieve(da: DataAccessor): Endpoint[EvolutionChainDetail] =
        get("api" :: "v2" :: "evolution-chain" :: string) { (id: String, authParamcookieAuth: String) =>
          da.Evolution_evolutionChainRetrieve(id, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a PaginatedEvolutionTriggerSummaryList
        */
        private def evolutionTriggerList(da: DataAccessor): Endpoint[PaginatedEvolutionTriggerSummaryList] =
        get("api" :: "v2" :: "evolution-trigger" :: paramOption("limit").map(_.map(_.toInt)) :: paramOption("offset").map(_.map(_.toInt)) :: paramOption("q")) { (limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String) =>
          da.Evolution_evolutionTriggerList(limit, offset, q, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a EvolutionTriggerDetail
        */
        private def evolutionTriggerRetrieve(da: DataAccessor): Endpoint[EvolutionTriggerDetail] =
        get("api" :: "v2" :: "evolution-trigger" :: string) { (id: String, authParamcookieAuth: String) =>
          da.Evolution_evolutionTriggerRetrieve(id, authParamcookieAuth) match {
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
      val file = Files.createTempFile("tmpEvolutionApi", null).toFile
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}
