#' Create a new PokemonDetailAbilitiesInner
#'
#' @description
#' PokemonDetailAbilitiesInner Class
#'
#' @docType class
#' @title PokemonDetailAbilitiesInner
#' @description PokemonDetailAbilitiesInner Class
#' @format An \code{R6Class} generator object
#' @field ability  \link{AbilityDetailPokemonInnerPokemon}
#' @field is_hidden  character
#' @field slot  integer
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PokemonDetailAbilitiesInner <- R6::R6Class(
  "PokemonDetailAbilitiesInner",
  public = list(
    `ability` = NULL,
    `is_hidden` = NULL,
    `slot` = NULL,

    #' @description
    #' Initialize a new PokemonDetailAbilitiesInner class.
    #'
    #' @param ability ability
    #' @param is_hidden is_hidden
    #' @param slot slot
    #' @param ... Other optional arguments.
    initialize = function(`ability`, `is_hidden`, `slot`, ...) {
      if (!missing(`ability`)) {
        stopifnot(R6::is.R6(`ability`))
        self$`ability` <- `ability`
      }
      if (!missing(`is_hidden`)) {
        if (!(is.logical(`is_hidden`) && length(`is_hidden`) == 1)) {
          stop(paste("Error! Invalid data for `is_hidden`. Must be a boolean:", `is_hidden`))
        }
        self$`is_hidden` <- `is_hidden`
      }
      if (!missing(`slot`)) {
        if (!(is.numeric(`slot`) && length(`slot`) == 1)) {
          stop(paste("Error! Invalid data for `slot`. Must be an integer:", `slot`))
        }
        self$`slot` <- `slot`
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
    #' @return PokemonDetailAbilitiesInner as a base R list.
    #' @examples
    #' # convert array of PokemonDetailAbilitiesInner (x) to a data frame
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
    #' Convert PokemonDetailAbilitiesInner to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      PokemonDetailAbilitiesInnerObject <- list()
      if (!is.null(self$`ability`)) {
        PokemonDetailAbilitiesInnerObject[["ability"]] <-
          self$`ability`$toSimpleType()
      }
      if (!is.null(self$`is_hidden`)) {
        PokemonDetailAbilitiesInnerObject[["is_hidden"]] <-
          self$`is_hidden`
      }
      if (!is.null(self$`slot`)) {
        PokemonDetailAbilitiesInnerObject[["slot"]] <-
          self$`slot`
      }
      return(PokemonDetailAbilitiesInnerObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of PokemonDetailAbilitiesInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokemonDetailAbilitiesInner
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`ability`)) {
        `ability_object` <- AbilityDetailPokemonInnerPokemon$new()
        `ability_object`$fromJSON(jsonlite::toJSON(this_object$`ability`, auto_unbox = TRUE, digits = NA))
        self$`ability` <- `ability_object`
      }
      if (!is.null(this_object$`is_hidden`)) {
        self$`is_hidden` <- this_object$`is_hidden`
      }
      if (!is.null(this_object$`slot`)) {
        self$`slot` <- this_object$`slot`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return PokemonDetailAbilitiesInner in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of PokemonDetailAbilitiesInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokemonDetailAbilitiesInner
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`ability` <- AbilityDetailPokemonInnerPokemon$new()$fromJSON(jsonlite::toJSON(this_object$`ability`, auto_unbox = TRUE, digits = NA))
      self$`is_hidden` <- this_object$`is_hidden`
      self$`slot` <- this_object$`slot`
      self
    },

    #' @description
    #' Validate JSON input with respect to PokemonDetailAbilitiesInner and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `ability`
      if (!is.null(input_json$`ability`)) {
        stopifnot(R6::is.R6(input_json$`ability`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonDetailAbilitiesInner: the required field `ability` is missing."))
      }
      # check the required field `is_hidden`
      if (!is.null(input_json$`is_hidden`)) {
        if (!(is.logical(input_json$`is_hidden`) && length(input_json$`is_hidden`) == 1)) {
          stop(paste("Error! Invalid data for `is_hidden`. Must be a boolean:", input_json$`is_hidden`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonDetailAbilitiesInner: the required field `is_hidden` is missing."))
      }
      # check the required field `slot`
      if (!is.null(input_json$`slot`)) {
        if (!(is.numeric(input_json$`slot`) && length(input_json$`slot`) == 1)) {
          stop(paste("Error! Invalid data for `slot`. Must be an integer:", input_json$`slot`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonDetailAbilitiesInner: the required field `slot` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PokemonDetailAbilitiesInner
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `ability` is null
      if (is.null(self$`ability`)) {
        return(FALSE)
      }

      # check if the required `is_hidden` is null
      if (is.null(self$`is_hidden`)) {
        return(FALSE)
      }

      # check if the required `slot` is null
      if (is.null(self$`slot`)) {
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
      # check if the required `ability` is null
      if (is.null(self$`ability`)) {
        invalid_fields["ability"] <- "Non-nullable required field `ability` cannot be null."
      }

      # check if the required `is_hidden` is null
      if (is.null(self$`is_hidden`)) {
        invalid_fields["is_hidden"] <- "Non-nullable required field `is_hidden` cannot be null."
      }

      # check if the required `slot` is null
      if (is.null(self$`slot`)) {
        invalid_fields["slot"] <- "Non-nullable required field `slot` cannot be null."
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
# PokemonDetailAbilitiesInner$unlock()
#
## Below is an example to define the print function
# PokemonDetailAbilitiesInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PokemonDetailAbilitiesInner$lock()

