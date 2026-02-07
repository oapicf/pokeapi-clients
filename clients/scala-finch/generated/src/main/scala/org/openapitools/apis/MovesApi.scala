package org.openapitools.apis

import java.io._
import org.openapitools._
import org.openapitools.models._
import org.openapitools.models.MoveBattleStyleDetail
import org.openapitools.models.MoveDetail
import org.openapitools.models.MoveLearnMethodDetail
import org.openapitools.models.MoveMetaAilmentDetail
import org.openapitools.models.MoveMetaCategoryDetail
import org.openapitools.models.MoveTargetDetail
import org.openapitools.models.PaginatedMoveBattleStyleSummaryList
import org.openapitools.models.PaginatedMoveLearnMethodSummaryList
import org.openapitools.models.PaginatedMoveMetaAilmentSummaryList
import org.openapitools.models.PaginatedMoveMetaCategorySummaryList
import org.openapitools.models.PaginatedMoveSummaryList
import org.openapitools.models.PaginatedMoveTargetSummaryList
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

object MovesApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        moveAilmentList(da) :+:
        moveAilmentRetrieve(da) :+:
        moveBattleStyleList(da) :+:
        moveBattleStyleRetrieve(da) :+:
        moveCategoryList(da) :+:
        moveCategoryRetrieve(da) :+:
        moveLearnMethodList(da) :+:
        moveLearnMethodRetrieve(da) :+:
        moveList(da) :+:
        moveRetrieve(da) :+:
        moveTargetList(da) :+:
        moveTargetRetrieve(da)


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
        * @return An endpoint representing a PaginatedMoveMetaAilmentSummaryList
        */
        private def moveAilmentList(da: DataAccessor): Endpoint[PaginatedMoveMetaAilmentSummaryList] =
        get("api" :: "v2" :: "move-ailment" :: paramOption("limit").map(_.map(_.toInt)) :: paramOption("offset").map(_.map(_.toInt)) :: paramOption("q")) { (limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String) =>
          da.Moves_moveAilmentList(limit, offset, q, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a MoveMetaAilmentDetail
        */
        private def moveAilmentRetrieve(da: DataAccessor): Endpoint[MoveMetaAilmentDetail] =
        get("api" :: "v2" :: "move-ailment" :: string) { (id: String, authParamcookieAuth: String) =>
          da.Moves_moveAilmentRetrieve(id, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a PaginatedMoveBattleStyleSummaryList
        */
        private def moveBattleStyleList(da: DataAccessor): Endpoint[PaginatedMoveBattleStyleSummaryList] =
        get("api" :: "v2" :: "move-battle-style" :: paramOption("limit").map(_.map(_.toInt)) :: paramOption("offset").map(_.map(_.toInt)) :: paramOption("q")) { (limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String) =>
          da.Moves_moveBattleStyleList(limit, offset, q, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a MoveBattleStyleDetail
        */
        private def moveBattleStyleRetrieve(da: DataAccessor): Endpoint[MoveBattleStyleDetail] =
        get("api" :: "v2" :: "move-battle-style" :: string) { (id: String, authParamcookieAuth: String) =>
          da.Moves_moveBattleStyleRetrieve(id, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a PaginatedMoveMetaCategorySummaryList
        */
        private def moveCategoryList(da: DataAccessor): Endpoint[PaginatedMoveMetaCategorySummaryList] =
        get("api" :: "v2" :: "move-category" :: paramOption("limit").map(_.map(_.toInt)) :: paramOption("offset").map(_.map(_.toInt)) :: paramOption("q")) { (limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String) =>
          da.Moves_moveCategoryList(limit, offset, q, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a MoveMetaCategoryDetail
        */
        private def moveCategoryRetrieve(da: DataAccessor): Endpoint[MoveMetaCategoryDetail] =
        get("api" :: "v2" :: "move-category" :: string) { (id: String, authParamcookieAuth: String) =>
          da.Moves_moveCategoryRetrieve(id, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a PaginatedMoveLearnMethodSummaryList
        */
        private def moveLearnMethodList(da: DataAccessor): Endpoint[PaginatedMoveLearnMethodSummaryList] =
        get("api" :: "v2" :: "move-learn-method" :: paramOption("limit").map(_.map(_.toInt)) :: paramOption("offset").map(_.map(_.toInt)) :: paramOption("q")) { (limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String) =>
          da.Moves_moveLearnMethodList(limit, offset, q, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a MoveLearnMethodDetail
        */
        private def moveLearnMethodRetrieve(da: DataAccessor): Endpoint[MoveLearnMethodDetail] =
        get("api" :: "v2" :: "move-learn-method" :: string) { (id: String, authParamcookieAuth: String) =>
          da.Moves_moveLearnMethodRetrieve(id, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a PaginatedMoveSummaryList
        */
        private def moveList(da: DataAccessor): Endpoint[PaginatedMoveSummaryList] =
        get("api" :: "v2" :: "move" :: paramOption("limit").map(_.map(_.toInt)) :: paramOption("offset").map(_.map(_.toInt)) :: paramOption("q")) { (limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String) =>
          da.Moves_moveList(limit, offset, q, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a MoveDetail
        */
        private def moveRetrieve(da: DataAccessor): Endpoint[MoveDetail] =
        get("api" :: "v2" :: "move" :: string) { (id: String, authParamcookieAuth: String) =>
          da.Moves_moveRetrieve(id, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a PaginatedMoveTargetSummaryList
        */
        private def moveTargetList(da: DataAccessor): Endpoint[PaginatedMoveTargetSummaryList] =
        get("api" :: "v2" :: "move-target" :: paramOption("limit").map(_.map(_.toInt)) :: paramOption("offset").map(_.map(_.toInt)) :: paramOption("q")) { (limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String) =>
          da.Moves_moveTargetList(limit, offset, q, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a MoveTargetDetail
        */
        private def moveTargetRetrieve(da: DataAccessor): Endpoint[MoveTargetDetail] =
        get("api" :: "v2" :: "move-target" :: string) { (id: String, authParamcookieAuth: String) =>
          da.Moves_moveTargetRetrieve(id, authParamcookieAuth) match {
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
      val file = Files.createTempFile("tmpMovesApi", null).toFile
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}
