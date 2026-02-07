#' Create a new PokemonSpeciesDetailGeneraInner
#'
#' @description
#' PokemonSpeciesDetailGeneraInner Class
#'
#' @docType class
#' @title PokemonSpeciesDetailGeneraInner
#' @description PokemonSpeciesDetailGeneraInner Class
#' @format An \code{R6Class} generator object
#' @field genus  character
#' @field language  \link{AbilityDetailPokemonInnerPokemon}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PokemonSpeciesDetailGeneraInner <- R6::R6Class(
  "PokemonSpeciesDetailGeneraInner",
  public = list(
    `genus` = NULL,
    `language` = NULL,

    #' @description
    #' Initialize a new PokemonSpeciesDetailGeneraInner class.
    #'
    #' @param genus genus
    #' @param language language
    #' @param ... Other optional arguments.
    initialize = function(`genus`, `language`, ...) {
      if (!missing(`genus`)) {
        if (!(is.character(`genus`) && length(`genus`) == 1)) {
          stop(paste("Error! Invalid data for `genus`. Must be a string:", `genus`))
        }
        self$`genus` <- `genus`
      }
      if (!missing(`language`)) {
        stopifnot(R6::is.R6(`language`))
        self$`language` <- `language`
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
    #' @return PokemonSpeciesDetailGeneraInner as a base R list.
    #' @examples
    #' # convert array of PokemonSpeciesDetailGeneraInner (x) to a data frame
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
    #' Convert PokemonSpeciesDetailGeneraInner to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      PokemonSpeciesDetailGeneraInnerObject <- list()
      if (!is.null(self$`genus`)) {
        PokemonSpeciesDetailGeneraInnerObject[["genus"]] <-
          self$`genus`
      }
      if (!is.null(self$`language`)) {
        PokemonSpeciesDetailGeneraInnerObject[["language"]] <-
          self$`language`$toSimpleType()
      }
      return(PokemonSpeciesDetailGeneraInnerObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of PokemonSpeciesDetailGeneraInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokemonSpeciesDetailGeneraInner
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`genus`)) {
        self$`genus` <- this_object$`genus`
      }
      if (!is.null(this_object$`language`)) {
        `language_object` <- AbilityDetailPokemonInnerPokemon$new()
        `language_object`$fromJSON(jsonlite::toJSON(this_object$`language`, auto_unbox = TRUE, digits = NA))
        self$`language` <- `language_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return PokemonSpeciesDetailGeneraInner in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of PokemonSpeciesDetailGeneraInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokemonSpeciesDetailGeneraInner
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`genus` <- this_object$`genus`
      self$`language` <- AbilityDetailPokemonInnerPokemon$new()$fromJSON(jsonlite::toJSON(this_object$`language`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to PokemonSpeciesDetailGeneraInner and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `genus`
      if (!is.null(input_json$`genus`)) {
        if (!(is.character(input_json$`genus`) && length(input_json$`genus`) == 1)) {
          stop(paste("Error! Invalid data for `genus`. Must be a string:", input_json$`genus`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonSpeciesDetailGeneraInner: the required field `genus` is missing."))
      }
      # check the required field `language`
      if (!is.null(input_json$`language`)) {
        stopifnot(R6::is.R6(input_json$`language`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonSpeciesDetailGeneraInner: the required field `language` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PokemonSpeciesDetailGeneraInner
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `genus` is null
      if (is.null(self$`genus`)) {
        return(FALSE)
      }

      # check if the required `language` is null
      if (is.null(self$`language`)) {
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
      # check if the required `genus` is null
      if (is.null(self$`genus`)) {
        invalid_fields["genus"] <- "Non-nullable required field `genus` cannot be null."
      }

      # check if the required `language` is null
      if (is.null(self$`language`)) {
        invalid_fields["language"] <- "Non-nullable required field `language` cannot be null."
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
# PokemonSpeciesDetailGeneraInner$unlock()
#
## Below is an example to define the print function
# PokemonSpeciesDetailGeneraInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PokemonSpeciesDetailGeneraInner$lock()

