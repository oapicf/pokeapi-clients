#' Create a new PokemonSpeciesDetailPalParkEncountersInner
#'
#' @description
#' PokemonSpeciesDetailPalParkEncountersInner Class
#'
#' @docType class
#' @title PokemonSpeciesDetailPalParkEncountersInner
#' @description PokemonSpeciesDetailPalParkEncountersInner Class
#' @format An \code{R6Class} generator object
#' @field area  \link{AbilityDetailPokemonInnerPokemon}
#' @field base_score  integer
#' @field rate  integer
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PokemonSpeciesDetailPalParkEncountersInner <- R6::R6Class(
  "PokemonSpeciesDetailPalParkEncountersInner",
  public = list(
    `area` = NULL,
    `base_score` = NULL,
    `rate` = NULL,

    #' @description
    #' Initialize a new PokemonSpeciesDetailPalParkEncountersInner class.
    #'
    #' @param area area
    #' @param base_score base_score
    #' @param rate rate
    #' @param ... Other optional arguments.
    initialize = function(`area`, `base_score`, `rate`, ...) {
      if (!missing(`area`)) {
        stopifnot(R6::is.R6(`area`))
        self$`area` <- `area`
      }
      if (!missing(`base_score`)) {
        if (!(is.numeric(`base_score`) && length(`base_score`) == 1)) {
          stop(paste("Error! Invalid data for `base_score`. Must be an integer:", `base_score`))
        }
        self$`base_score` <- `base_score`
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
    #' @return PokemonSpeciesDetailPalParkEncountersInner as a base R list.
    #' @examples
    #' # convert array of PokemonSpeciesDetailPalParkEncountersInner (x) to a data frame
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
    #' Convert PokemonSpeciesDetailPalParkEncountersInner to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      PokemonSpeciesDetailPalParkEncountersInnerObject <- list()
      if (!is.null(self$`area`)) {
        PokemonSpeciesDetailPalParkEncountersInnerObject[["area"]] <-
          self$`area`$toSimpleType()
      }
      if (!is.null(self$`base_score`)) {
        PokemonSpeciesDetailPalParkEncountersInnerObject[["base_score"]] <-
          self$`base_score`
      }
      if (!is.null(self$`rate`)) {
        PokemonSpeciesDetailPalParkEncountersInnerObject[["rate"]] <-
          self$`rate`
      }
      return(PokemonSpeciesDetailPalParkEncountersInnerObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of PokemonSpeciesDetailPalParkEncountersInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokemonSpeciesDetailPalParkEncountersInner
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`area`)) {
        `area_object` <- AbilityDetailPokemonInnerPokemon$new()
        `area_object`$fromJSON(jsonlite::toJSON(this_object$`area`, auto_unbox = TRUE, digits = NA))
        self$`area` <- `area_object`
      }
      if (!is.null(this_object$`base_score`)) {
        self$`base_score` <- this_object$`base_score`
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
    #' @return PokemonSpeciesDetailPalParkEncountersInner in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of PokemonSpeciesDetailPalParkEncountersInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokemonSpeciesDetailPalParkEncountersInner
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`area` <- AbilityDetailPokemonInnerPokemon$new()$fromJSON(jsonlite::toJSON(this_object$`area`, auto_unbox = TRUE, digits = NA))
      self$`base_score` <- this_object$`base_score`
      self$`rate` <- this_object$`rate`
      self
    },

    #' @description
    #' Validate JSON input with respect to PokemonSpeciesDetailPalParkEncountersInner and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `area`
      if (!is.null(input_json$`area`)) {
        stopifnot(R6::is.R6(input_json$`area`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonSpeciesDetailPalParkEncountersInner: the required field `area` is missing."))
      }
      # check the required field `base_score`
      if (!is.null(input_json$`base_score`)) {
        if (!(is.numeric(input_json$`base_score`) && length(input_json$`base_score`) == 1)) {
          stop(paste("Error! Invalid data for `base_score`. Must be an integer:", input_json$`base_score`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonSpeciesDetailPalParkEncountersInner: the required field `base_score` is missing."))
      }
      # check the required field `rate`
      if (!is.null(input_json$`rate`)) {
        if (!(is.numeric(input_json$`rate`) && length(input_json$`rate`) == 1)) {
          stop(paste("Error! Invalid data for `rate`. Must be an integer:", input_json$`rate`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonSpeciesDetailPalParkEncountersInner: the required field `rate` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PokemonSpeciesDetailPalParkEncountersInner
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `area` is null
      if (is.null(self$`area`)) {
        return(FALSE)
      }

      # check if the required `base_score` is null
      if (is.null(self$`base_score`)) {
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
      # check if the required `area` is null
      if (is.null(self$`area`)) {
        invalid_fields["area"] <- "Non-nullable required field `area` cannot be null."
      }

      # check if the required `base_score` is null
      if (is.null(self$`base_score`)) {
        invalid_fields["base_score"] <- "Non-nullable required field `base_score` cannot be null."
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
# PokemonSpeciesDetailPalParkEncountersInner$unlock()
#
## Below is an example to define the print function
# PokemonSpeciesDetailPalParkEncountersInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PokemonSpeciesDetailPalParkEncountersInner$lock()

