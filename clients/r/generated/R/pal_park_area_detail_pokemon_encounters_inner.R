#' Create a new PalParkAreaDetailPokemonEncountersInner
#'
#' @description
#' PalParkAreaDetailPokemonEncountersInner Class
#'
#' @docType class
#' @title PalParkAreaDetailPokemonEncountersInner
#' @description PalParkAreaDetailPokemonEncountersInner Class
#' @format An \code{R6Class} generator object
#' @field base_score  integer
#' @field pokemon-species  \link{AbilityDetailPokemonInnerPokemon}
#' @field rate  integer
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PalParkAreaDetailPokemonEncountersInner <- R6::R6Class(
  "PalParkAreaDetailPokemonEncountersInner",
  public = list(
    `base_score` = NULL,
    `pokemon-species` = NULL,
    `rate` = NULL,

    #' @description
    #' Initialize a new PalParkAreaDetailPokemonEncountersInner class.
    #'
    #' @param base_score base_score
    #' @param pokemon-species pokemon-species
    #' @param rate rate
    #' @param ... Other optional arguments.
    initialize = function(`base_score`, `pokemon-species`, `rate`, ...) {
      if (!missing(`base_score`)) {
        if (!(is.numeric(`base_score`) && length(`base_score`) == 1)) {
          stop(paste("Error! Invalid data for `base_score`. Must be an integer:", `base_score`))
        }
        self$`base_score` <- `base_score`
      }
      if (!missing(`pokemon-species`)) {
        stopifnot(R6::is.R6(`pokemon-species`))
        self$`pokemon-species` <- `pokemon-species`
      }
      if (!missing(`rate`)) {
        if (!(is.numeric(`rate`) && length(`rate`) == 1)) {
          stop(paste("Error! Invalid data for `rate`. Must be an integer:", `rate`))
        }
        self$`rate` <- `rate`
      }
    },

    #' @description
    #' Convert to an R object. This method is deprecated. Use `toSimpleType()` instead.
    toJSON = function() {
      .Deprecated(new = "toSimpleType", msg = "Use the '$toSimpleType()' method instead since that is more clearly named. Use '$toJSONString()' to get a JSON string")
      return(self$toSimpleType())
    },

    #' @description
    #' Convert to a List
    #'
    #' Convert the R6 object to a list to work more easily with other tooling.
    #'
    #' @return PalParkAreaDetailPokemonEncountersInner as a base R list.
    #' @examples
    #' # convert array of PalParkAreaDetailPokemonEncountersInner (x) to a data frame
    #' \dontrun{
    #' library(purrr)
    #' library(tibble)
    #' df <- x |> map(\(y)y$toList()) |> map(as_tibble) |> list_rbind()
    #' df
    #' }
    toList = function() {
      return(self$toSimpleType())
    },

    #' @description
    #' Convert PalParkAreaDetailPokemonEncountersInner to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      PalParkAreaDetailPokemonEncountersInnerObject <- list()
      if (!is.null(self$`base_score`)) {
        PalParkAreaDetailPokemonEncountersInnerObject[["base_score"]] <-
          self$`base_score`
      }
      if (!is.null(self$`pokemon-species`)) {
        PalParkAreaDetailPokemonEncountersInnerObject[["pokemon-species"]] <-
          self$`pokemon-species`$toSimpleType()
      }
      if (!is.null(self$`rate`)) {
        PalParkAreaDetailPokemonEncountersInnerObject[["rate"]] <-
          self$`rate`
      }
      return(PalParkAreaDetailPokemonEncountersInnerObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of PalParkAreaDetailPokemonEncountersInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of PalParkAreaDetailPokemonEncountersInner
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`base_score`)) {
        self$`base_score` <- this_object$`base_score`
      }
      if (!is.null(this_object$`pokemon-species`)) {
        `pokemon-species_object` <- AbilityDetailPokemonInnerPokemon$new()
        `pokemon-species_object`$fromJSON(jsonlite::toJSON(this_object$`pokemon-species`, auto_unbox = TRUE, digits = NA))
        self$`pokemon-species` <- `pokemon-species_object`
      }
      if (!is.null(this_object$`rate`)) {
        self$`rate` <- this_object$`rate`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return PalParkAreaDetailPokemonEncountersInner in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of PalParkAreaDetailPokemonEncountersInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of PalParkAreaDetailPokemonEncountersInner
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`base_score` <- this_object$`base_score`
      self$`pokemon-species` <- AbilityDetailPokemonInnerPokemon$new()$fromJSON(jsonlite::toJSON(this_object$`pokemon-species`, auto_unbox = TRUE, digits = NA))
      self$`rate` <- this_object$`rate`
      self
    },

    #' @description
    #' Validate JSON input with respect to PalParkAreaDetailPokemonEncountersInner and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `base_score`
      if (!is.null(input_json$`base_score`)) {
        if (!(is.numeric(input_json$`base_score`) && length(input_json$`base_score`) == 1)) {
          stop(paste("Error! Invalid data for `base_score`. Must be an integer:", input_json$`base_score`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PalParkAreaDetailPokemonEncountersInner: the required field `base_score` is missing."))
      }
      # check the required field `pokemon-species`
      if (!is.null(input_json$`pokemon-species`)) {
        stopifnot(R6::is.R6(input_json$`pokemon-species`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PalParkAreaDetailPokemonEncountersInner: the required field `pokemon-species` is missing."))
      }
      # check the required field `rate`
      if (!is.null(input_json$`rate`)) {
        if (!(is.numeric(input_json$`rate`) && length(input_json$`rate`) == 1)) {
          stop(paste("Error! Invalid data for `rate`. Must be an integer:", input_json$`rate`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PalParkAreaDetailPokemonEncountersInner: the required field `rate` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PalParkAreaDetailPokemonEncountersInner
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `base_score` is null
      if (is.null(self$`base_score`)) {
        return(FALSE)
      }

      # check if the required `pokemon-species` is null
      if (is.null(self$`pokemon-species`)) {
        return(FALSE)
      }

      # check if the required `rate` is null
      if (is.null(self$`rate`)) {
        return(FALSE)
      }

      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
      # check if the required `base_score` is null
      if (is.null(self$`base_score`)) {
        invalid_fields["base_score"] <- "Non-nullable required field `base_score` cannot be null."
      }

      # check if the required `pokemon-species` is null
      if (is.null(self$`pokemon-species`)) {
        invalid_fields["pokemon-species"] <- "Non-nullable required field `pokemon-species` cannot be null."
      }

      # check if the required `rate` is null
      if (is.null(self$`rate`)) {
        invalid_fields["rate"] <- "Non-nullable required field `rate` cannot be null."
      }

      invalid_fields
    },

    #' @description
    #' Print the object
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# PalParkAreaDetailPokemonEncountersInner$unlock()
#
## Below is an example to define the print function
# PalParkAreaDetailPokemonEncountersInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PalParkAreaDetailPokemonEncountersInner$lock()

