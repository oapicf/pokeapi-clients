package org.openapitools.apis

import java.io._
import org.openapitools._
import org.openapitools.models._
import org.openapitools.models.AbilityDetail
import org.openapitools.models.CharacteristicDetail
import org.openapitools.models.EggGroupDetail
import org.openapitools.models.GenderDetail
import org.openapitools.models.GrowthRateDetail
import org.openapitools.models.MoveDamageClassDetail
import org.openapitools.models.NatureDetail
import org.openapitools.models.PaginatedAbilitySummaryList
import org.openapitools.models.PaginatedCharacteristicSummaryList
import org.openapitools.models.PaginatedEggGroupSummaryList
import org.openapitools.models.PaginatedGenderSummaryList
import org.openapitools.models.PaginatedGrowthRateSummaryList
import org.openapitools.models.PaginatedMoveDamageClassSummaryList
import org.openapitools.models.PaginatedNatureSummaryList
import org.openapitools.models.PaginatedPokeathlonStatSummaryList
import org.openapitools.models.PaginatedPokemonColorSummaryList
import org.openapitools.models.PaginatedPokemonFormSummaryList
import org.openapitools.models.PaginatedPokemonHabitatSummaryList
import org.openapitools.models.PaginatedPokemonShapeSummaryList
import org.openapitools.models.PaginatedPokemonSpeciesSummaryList
import org.openapitools.models.PaginatedPokemonSummaryList
import org.openapitools.models.PaginatedStatSummaryList
import org.openapitools.models.PaginatedTypeSummaryList
import org.openapitools.models.PokeathlonStatDetail
import org.openapitools.models.PokemonColorDetail
import org.openapitools.models.PokemonDetail
import org.openapitools.models.PokemonFormDetail
import org.openapitools.models.PokemonHabitatDetail
import org.openapitools.models.PokemonShapeDetail
import org.openapitools.models.PokemonSpeciesDetail
import org.openapitools.models.StatDetail
import org.openapitools.models.TypeDetail
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

object PokemonApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        abilityList(da) :+:
        abilityRetrieve(da) :+:
        characteristicList(da) :+:
        characteristicRetrieve(da) :+:
        eggGroupList(da) :+:
        eggGroupRetrieve(da) :+:
        genderList(da) :+:
        genderRetrieve(da) :+:
        growthRateList(da) :+:
        growthRateRetrieve(da) :+:
        moveDamageClassList(da) :+:
        moveDamageClassRetrieve(da) :+:
        natureList(da) :+:
        natureRetrieve(da) :+:
        pokeathlonStatList(da) :+:
        pokeathlonStatRetrieve(da) :+:
        pokemonColorList(da) :+:
        pokemonColorRetrieve(da) :+:
        pokemonFormList(da) :+:
        pokemonFormRetrieve(da) :+:
        pokemonHabitatList(da) :+:
        pokemonHabitatRetrieve(da) :+:
        pokemonList(da) :+:
        pokemonRetrieve(da) :+:
        pokemonShapeList(da) :+:
        pokemonShapeRetrieve(da) :+:
        pokemonSpeciesList(da) :+:
        pokemonSpeciesRetrieve(da) :+:
        statList(da) :+:
        statRetrieve(da) :+:
        typeList(da) :+:
        typeRetrieve(da)


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
        * @return An endpoint representing a PaginatedAbilitySummaryList
        */
        private def abilityList(da: DataAccessor): Endpoint[PaginatedAbilitySummaryList] =
        get("api" :: "v2" :: "ability" :: paramOption("limit").map(_.map(_.toInt)) :: paramOption("offset").map(_.map(_.toInt)) :: paramOption("q")) { (limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String) =>
          da.Pokemon_abilityList(limit, offset, q, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a AbilityDetail
        */
        private def abilityRetrieve(da: DataAccessor): Endpoint[AbilityDetail] =
        get("api" :: "v2" :: "ability" :: string) { (id: String, authParamcookieAuth: String) =>
          da.Pokemon_abilityRetrieve(id, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a PaginatedCharacteristicSummaryList
        */
        private def characteristicList(da: DataAccessor): Endpoint[PaginatedCharacteristicSummaryList] =
        get("api" :: "v2" :: "characteristic" :: paramOption("limit").map(_.map(_.toInt)) :: paramOption("offset").map(_.map(_.toInt)) :: paramOption("q")) { (limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String) =>
          da.Pokemon_characteristicList(limit, offset, q, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a CharacteristicDetail
        */
        private def characteristicRetrieve(da: DataAccessor): Endpoint[CharacteristicDetail] =
        get("api" :: "v2" :: "characteristic" :: string) { (id: String, authParamcookieAuth: String) =>
          da.Pokemon_characteristicRetrieve(id, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a PaginatedEggGroupSummaryList
        */
        private def eggGroupList(da: DataAccessor): Endpoint[PaginatedEggGroupSummaryList] =
        get("api" :: "v2" :: "egg-group" :: paramOption("limit").map(_.map(_.toInt)) :: paramOption("offset").map(_.map(_.toInt)) :: paramOption("q")) { (limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String) =>
          da.Pokemon_eggGroupList(limit, offset, q, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a EggGroupDetail
        */
        private def eggGroupRetrieve(da: DataAccessor): Endpoint[EggGroupDetail] =
        get("api" :: "v2" :: "egg-group" :: string) { (id: String, authParamcookieAuth: String) =>
          da.Pokemon_eggGroupRetrieve(id, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a PaginatedGenderSummaryList
        */
        private def genderList(da: DataAccessor): Endpoint[PaginatedGenderSummaryList] =
        get("api" :: "v2" :: "gender" :: paramOption("limit").map(_.map(_.toInt)) :: paramOption("offset").map(_.map(_.toInt)) :: paramOption("q")) { (limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String) =>
          da.Pokemon_genderList(limit, offset, q, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GenderDetail
        */
        private def genderRetrieve(da: DataAccessor): Endpoint[GenderDetail] =
        get("api" :: "v2" :: "gender" :: string) { (id: String, authParamcookieAuth: String) =>
          da.Pokemon_genderRetrieve(id, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a PaginatedGrowthRateSummaryList
        */
        private def growthRateList(da: DataAccessor): Endpoint[PaginatedGrowthRateSummaryList] =
        get("api" :: "v2" :: "growth-rate" :: paramOption("limit").map(_.map(_.toInt)) :: paramOption("offset").map(_.map(_.toInt)) :: paramOption("q")) { (limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String) =>
          da.Pokemon_growthRateList(limit, offset, q, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GrowthRateDetail
        */
        private def growthRateRetrieve(da: DataAccessor): Endpoint[GrowthRateDetail] =
        get("api" :: "v2" :: "growth-rate" :: string) { (id: String, authParamcookieAuth: String) =>
          da.Pokemon_growthRateRetrieve(id, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a PaginatedMoveDamageClassSummaryList
        */
        private def moveDamageClassList(da: DataAccessor): Endpoint[PaginatedMoveDamageClassSummaryList] =
        get("api" :: "v2" :: "move-damage-class" :: paramOption("limit").map(_.map(_.toInt)) :: paramOption("offset").map(_.map(_.toInt)) :: paramOption("q")) { (limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String) =>
          da.Pokemon_moveDamageClassList(limit, offset, q, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a MoveDamageClassDetail
        */
        private def moveDamageClassRetrieve(da: DataAccessor): Endpoint[MoveDamageClassDetail] =
        get("api" :: "v2" :: "move-damage-class" :: string) { (id: String, authParamcookieAuth: String) =>
          da.Pokemon_moveDamageClassRetrieve(id, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a PaginatedNatureSummaryList
        */
        private def natureList(da: DataAccessor): Endpoint[PaginatedNatureSummaryList] =
        get("api" :: "v2" :: "nature" :: paramOption("limit").map(_.map(_.toInt)) :: paramOption("offset").map(_.map(_.toInt)) :: paramOption("q")) { (limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String) =>
          da.Pokemon_natureList(limit, offset, q, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a NatureDetail
        */
        private def natureRetrieve(da: DataAccessor): Endpoint[NatureDetail] =
        get("api" :: "v2" :: "nature" :: string) { (id: String, authParamcookieAuth: String) =>
          da.Pokemon_natureRetrieve(id, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a PaginatedPokeathlonStatSummaryList
        */
        private def pokeathlonStatList(da: DataAccessor): Endpoint[PaginatedPokeathlonStatSummaryList] =
        get("api" :: "v2" :: "pokeathlon-stat" :: paramOption("limit").map(_.map(_.toInt)) :: paramOption("offset").map(_.map(_.toInt)) :: paramOption("q")) { (limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String) =>
          da.Pokemon_pokeathlonStatList(limit, offset, q, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a PokeathlonStatDetail
        */
        private def pokeathlonStatRetrieve(da: DataAccessor): Endpoint[PokeathlonStatDetail] =
        get("api" :: "v2" :: "pokeathlon-stat" :: string) { (id: String, authParamcookieAuth: String) =>
          da.Pokemon_pokeathlonStatRetrieve(id, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a PaginatedPokemonColorSummaryList
        */
        private def pokemonColorList(da: DataAccessor): Endpoint[PaginatedPokemonColorSummaryList] =
        get("api" :: "v2" :: "pokemon-color" :: paramOption("limit").map(_.map(_.toInt)) :: paramOption("offset").map(_.map(_.toInt)) :: paramOption("q")) { (limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String) =>
          da.Pokemon_pokemonColorList(limit, offset, q, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a PokemonColorDetail
        */
        private def pokemonColorRetrieve(da: DataAccessor): Endpoint[PokemonColorDetail] =
        get("api" :: "v2" :: "pokemon-color" :: string) { (id: String, authParamcookieAuth: String) =>
          da.Pokemon_pokemonColorRetrieve(id, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a PaginatedPokemonFormSummaryList
        */
        private def pokemonFormList(da: DataAccessor): Endpoint[PaginatedPokemonFormSummaryList] =
        get("api" :: "v2" :: "pokemon-form" :: paramOption("limit").map(_.map(_.toInt)) :: paramOption("offset").map(_.map(_.toInt)) :: paramOption("q")) { (limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String) =>
          da.Pokemon_pokemonFormList(limit, offset, q, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a PokemonFormDetail
        */
        private def pokemonFormRetrieve(da: DataAccessor): Endpoint[PokemonFormDetail] =
        get("api" :: "v2" :: "pokemon-form" :: string) { (id: String, authParamcookieAuth: String) =>
          da.Pokemon_pokemonFormRetrieve(id, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a PaginatedPokemonHabitatSummaryList
        */
        private def pokemonHabitatList(da: DataAccessor): Endpoint[PaginatedPokemonHabitatSummaryList] =
        get("api" :: "v2" :: "pokemon-habitat" :: paramOption("limit").map(_.map(_.toInt)) :: paramOption("offset").map(_.map(_.toInt)) :: paramOption("q")) { (limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String) =>
          da.Pokemon_pokemonHabitatList(limit, offset, q, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a PokemonHabitatDetail
        */
        private def pokemonHabitatRetrieve(da: DataAccessor): Endpoint[PokemonHabitatDetail] =
        get("api" :: "v2" :: "pokemon-habitat" :: string) { (id: String, authParamcookieAuth: String) =>
          da.Pokemon_pokemonHabitatRetrieve(id, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a PaginatedPokemonSummaryList
        */
        private def pokemonList(da: DataAccessor): Endpoint[PaginatedPokemonSummaryList] =
        get("api" :: "v2" :: "pokemon" :: paramOption("limit").map(_.map(_.toInt)) :: paramOption("offset").map(_.map(_.toInt)) :: paramOption("q")) { (limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String) =>
          da.Pokemon_pokemonList(limit, offset, q, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a PokemonDetail
        */
        private def pokemonRetrieve(da: DataAccessor): Endpoint[PokemonDetail] =
        get("api" :: "v2" :: "pokemon" :: string) { (id: String, authParamcookieAuth: String) =>
          da.Pokemon_pokemonRetrieve(id, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a PaginatedPokemonShapeSummaryList
        */
        private def pokemonShapeList(da: DataAccessor): Endpoint[PaginatedPokemonShapeSummaryList] =
        get("api" :: "v2" :: "pokemon-shape" :: paramOption("limit").map(_.map(_.toInt)) :: paramOption("offset").map(_.map(_.toInt)) :: paramOption("q")) { (limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String) =>
          da.Pokemon_pokemonShapeList(limit, offset, q, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a PokemonShapeDetail
        */
        private def pokemonShapeRetrieve(da: DataAccessor): Endpoint[PokemonShapeDetail] =
        get("api" :: "v2" :: "pokemon-shape" :: string) { (id: String, authParamcookieAuth: String) =>
          da.Pokemon_pokemonShapeRetrieve(id, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a PaginatedPokemonSpeciesSummaryList
        */
        private def pokemonSpeciesList(da: DataAccessor): Endpoint[PaginatedPokemonSpeciesSummaryList] =
        get("api" :: "v2" :: "pokemon-species" :: paramOption("limit").map(_.map(_.toInt)) :: paramOption("offset").map(_.map(_.toInt)) :: paramOption("q")) { (limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String) =>
          da.Pokemon_pokemonSpeciesList(limit, offset, q, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a PokemonSpeciesDetail
        */
        private def pokemonSpeciesRetrieve(da: DataAccessor): Endpoint[PokemonSpeciesDetail] =
        get("api" :: "v2" :: "pokemon-species" :: string) { (id: String, authParamcookieAuth: String) =>
          da.Pokemon_pokemonSpeciesRetrieve(id, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a PaginatedStatSummaryList
        */
        private def statList(da: DataAccessor): Endpoint[PaginatedStatSummaryList] =
        get("api" :: "v2" :: "stat" :: paramOption("limit").map(_.map(_.toInt)) :: paramOption("offset").map(_.map(_.toInt)) :: paramOption("q")) { (limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String) =>
          da.Pokemon_statList(limit, offset, q, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a StatDetail
        */
        private def statRetrieve(da: DataAccessor): Endpoint[StatDetail] =
        get("api" :: "v2" :: "stat" :: string) { (id: String, authParamcookieAuth: String) =>
          da.Pokemon_statRetrieve(id, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a PaginatedTypeSummaryList
        */
        private def typeList(da: DataAccessor): Endpoint[PaginatedTypeSummaryList] =
        get("api" :: "v2" :: "type" :: paramOption("limit").map(_.map(_.toInt)) :: paramOption("offset").map(_.map(_.toInt)) :: paramOption("q")) { (limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String) =>
          da.Pokemon_typeList(limit, offset, q, authParamcookieAuth) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a TypeDetail
        */
        private def typeRetrieve(da: DataAccessor): Endpoint[TypeDetail] =
        get("api" :: "v2" :: "type" :: string) { (id: String, authParamcookieAuth: String) =>
          da.Pokemon_typeRetrieve(id, authParamcookieAuth) match {
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
      val file = Files.createTempFile("tmpPokemonApi", null).toFile
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}
