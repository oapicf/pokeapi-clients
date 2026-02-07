#' Create a new AbilityDetailPokemonInner
#'
#' @description
#' AbilityDetailPokemonInner Class
#'
#' @docType class
#' @title AbilityDetailPokemonInner
#' @description AbilityDetailPokemonInner Class
#' @format An \code{R6Class} generator object
#' @field is_hidden  character
#' @field slot  integer
#' @field pokemon  \link{AbilityDetailPokemonInnerPokemon}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AbilityDetailPokemonInner <- R6::R6Class(
  "AbilityDetailPokemonInner",
  public = list(
    `is_hidden` = NULL,
    `slot` = NULL,
    `pokemon` = NULL,

    #' @description
    #' Initialize a new AbilityDetailPokemonInner class.
    #'
    #' @param is_hidden is_hidden
    #' @param slot slot
    #' @param pokemon pokemon
    #' @param ... Other optional arguments.
    initialize = function(`is_hidden`, `slot`, `pokemon`, ...) {
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
    #' @return AbilityDetailPokemonInner as a base R list.
    #' @examples
    #' # convert array of AbilityDetailPokemonInner (x) to a data frame
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
    #' Convert AbilityDetailPokemonInner to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      AbilityDetailPokemonInnerObject <- list()
      if (!is.null(self$`is_hidden`)) {
        AbilityDetailPokemonInnerObject[["is_hidden"]] <-
          self$`is_hidden`
      }
      if (!is.null(self$`slot`)) {
        AbilityDetailPokemonInnerObject[["slot"]] <-
          self$`slot`
      }
      if (!is.null(self$`pokemon`)) {
        AbilityDetailPokemonInnerObject[["pokemon"]] <-
          self$`pokemon`$toSimpleType()
      }
      return(AbilityDetailPokemonInnerObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of AbilityDetailPokemonInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of AbilityDetailPokemonInner
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`is_hidden`)) {
        self$`is_hidden` <- this_object$`is_hidden`
      }
      if (!is.null(this_object$`slot`)) {
        self$`slot` <- this_object$`slot`
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
    #' @return AbilityDetailPokemonInner in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AbilityDetailPokemonInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of AbilityDetailPokemonInner
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`is_hidden` <- this_object$`is_hidden`
      self$`slot` <- this_object$`slot`
      self$`pokemon` <- AbilityDetailPokemonInnerPokemon$new()$fromJSON(jsonlite::toJSON(this_object$`pokemon`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to AbilityDetailPokemonInner and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `is_hidden`
      if (!is.null(input_json$`is_hidden`)) {
        if (!(is.logical(input_json$`is_hidden`) && length(input_json$`is_hidden`) == 1)) {
          stop(paste("Error! Invalid data for `is_hidden`. Must be a boolean:", input_json$`is_hidden`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AbilityDetailPokemonInner: the required field `is_hidden` is missing."))
      }
      # check the required field `slot`
      if (!is.null(input_json$`slot`)) {
        if (!(is.numeric(input_json$`slot`) && length(input_json$`slot`) == 1)) {
          stop(paste("Error! Invalid data for `slot`. Must be an integer:", input_json$`slot`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AbilityDetailPokemonInner: the required field `slot` is missing."))
      }
      # check the required field `pokemon`
      if (!is.null(input_json$`pokemon`)) {
        stopifnot(R6::is.R6(input_json$`pokemon`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AbilityDetailPokemonInner: the required field `pokemon` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AbilityDetailPokemonInner
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `is_hidden` is null
      if (is.null(self$`is_hidden`)) {
        return(FALSE)
      }

      # check if the required `slot` is null
      if (is.null(self$`slot`)) {
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
      # check if the required `is_hidden` is null
      if (is.null(self$`is_hidden`)) {
        invalid_fields["is_hidden"] <- "Non-nullable required field `is_hidden` cannot be null."
      }

      # check if the required `slot` is null
      if (is.null(self$`slot`)) {
        invalid_fields["slot"] <- "Non-nullable required field `slot` cannot be null."
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
# AbilityDetailPokemonInner$unlock()
#
## Below is an example to define the print function
# AbilityDetailPokemonInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AbilityDetailPokemonInner$lock()

