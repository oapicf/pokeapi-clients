#' Create a new PokemonSpeciesDetailVarietiesInner
#'
#' @description
#' PokemonSpeciesDetailVarietiesInner Class
#'
#' @docType class
#' @title PokemonSpeciesDetailVarietiesInner
#' @description PokemonSpeciesDetailVarietiesInner Class
#' @format An \code{R6Class} generator object
#' @field is_default  character
#' @field pokemon  \link{AbilityDetailPokemonInnerPokemon}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PokemonSpeciesDetailVarietiesInner <- R6::R6Class(
  "PokemonSpeciesDetailVarietiesInner",
  public = list(
    `is_default` = NULL,
    `pokemon` = NULL,

    #' @description
    #' Initialize a new PokemonSpeciesDetailVarietiesInner class.
    #'
    #' @param is_default is_default
    #' @param pokemon pokemon
    #' @param ... Other optional arguments.
    initialize = function(`is_default`, `pokemon`, ...) {
      if (!missing(`is_default`)) {
        if (!(is.logical(`is_default`) && length(`is_default`) == 1)) {
          stop(paste("Error! Invalid data for `is_default`. Must be a boolean:", `is_default`))
        }
        self$`is_default` <- `is_default`
      }
      if (!missing(`pokemon`)) {
        stopifnot(R6::is.R6(`pokemon`))
        self$`pokemon` <- `pokemon`
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
    #' @return PokemonSpeciesDetailVarietiesInner as a base R list.
    #' @examples
    #' # convert array of PokemonSpeciesDetailVarietiesInner (x) to a data frame
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
    #' Convert PokemonSpeciesDetailVarietiesInner to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      PokemonSpeciesDetailVarietiesInnerObject <- list()
      if (!is.null(self$`is_default`)) {
        PokemonSpeciesDetailVarietiesInnerObject[["is_default"]] <-
          self$`is_default`
      }
      if (!is.null(self$`pokemon`)) {
        PokemonSpeciesDetailVarietiesInnerObject[["pokemon"]] <-
          self$`pokemon`$toSimpleType()
      }
      return(PokemonSpeciesDetailVarietiesInnerObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of PokemonSpeciesDetailVarietiesInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokemonSpeciesDetailVarietiesInner
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`is_default`)) {
        self$`is_default` <- this_object$`is_default`
      }
      if (!is.null(this_object$`pokemon`)) {
        `pokemon_object` <- AbilityDetailPokemonInnerPokemon$new()
        `pokemon_object`$fromJSON(jsonlite::toJSON(this_object$`pokemon`, auto_unbox = TRUE, digits = NA))
        self$`pokemon` <- `pokemon_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return PokemonSpeciesDetailVarietiesInner in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of PokemonSpeciesDetailVarietiesInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokemonSpeciesDetailVarietiesInner
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`is_default` <- this_object$`is_default`
      self$`pokemon` <- AbilityDetailPokemonInnerPokemon$new()$fromJSON(jsonlite::toJSON(this_object$`pokemon`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to PokemonSpeciesDetailVarietiesInner and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `is_default`
      if (!is.null(input_json$`is_default`)) {
        if (!(is.logical(input_json$`is_default`) && length(input_json$`is_default`) == 1)) {
          stop(paste("Error! Invalid data for `is_default`. Must be a boolean:", input_json$`is_default`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonSpeciesDetailVarietiesInner: the required field `is_default` is missing."))
      }
      # check the required field `pokemon`
      if (!is.null(input_json$`pokemon`)) {
        stopifnot(R6::is.R6(input_json$`pokemon`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonSpeciesDetailVarietiesInner: the required field `pokemon` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PokemonSpeciesDetailVarietiesInner
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `is_default` is null
      if (is.null(self$`is_default`)) {
        return(FALSE)
      }

      # check if the required `pokemon` is null
      if (is.null(self$`pokemon`)) {
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
      # check if the required `is_default` is null
      if (is.null(self$`is_default`)) {
        invalid_fields["is_default"] <- "Non-nullable required field `is_default` cannot be null."
      }

      # check if the required `pokemon` is null
      if (is.null(self$`pokemon`)) {
        invalid_fields["pokemon"] <- "Non-nullable required field `pokemon` cannot be null."
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
# PokemonSpeciesDetailVarietiesInner$unlock()
#
## Below is an example to define the print function
# PokemonSpeciesDetailVarietiesInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PokemonSpeciesDetailVarietiesInner$lock()

