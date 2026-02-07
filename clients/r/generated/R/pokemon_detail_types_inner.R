#' Create a new PokemonDetailTypesInner
#'
#' @description
#' PokemonDetailTypesInner Class
#'
#' @docType class
#' @title PokemonDetailTypesInner
#' @description PokemonDetailTypesInner Class
#' @format An \code{R6Class} generator object
#' @field slot  integer
#' @field type  \link{AbilityDetailPokemonInnerPokemon}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PokemonDetailTypesInner <- R6::R6Class(
  "PokemonDetailTypesInner",
  public = list(
    `slot` = NULL,
    `type` = NULL,

    #' @description
    #' Initialize a new PokemonDetailTypesInner class.
    #'
    #' @param slot slot
    #' @param type type
    #' @param ... Other optional arguments.
    initialize = function(`slot`, `type`, ...) {
      if (!missing(`slot`)) {
        if (!(is.numeric(`slot`) && length(`slot`) == 1)) {
          stop(paste("Error! Invalid data for `slot`. Must be an integer:", `slot`))
        }
        self$`slot` <- `slot`
      }
      if (!missing(`type`)) {
        stopifnot(R6::is.R6(`type`))
        self$`type` <- `type`
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
    #' @return PokemonDetailTypesInner as a base R list.
    #' @examples
    #' # convert array of PokemonDetailTypesInner (x) to a data frame
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
    #' Convert PokemonDetailTypesInner to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      PokemonDetailTypesInnerObject <- list()
      if (!is.null(self$`slot`)) {
        PokemonDetailTypesInnerObject[["slot"]] <-
          self$`slot`
      }
      if (!is.null(self$`type`)) {
        PokemonDetailTypesInnerObject[["type"]] <-
          self$`type`$toSimpleType()
      }
      return(PokemonDetailTypesInnerObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of PokemonDetailTypesInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokemonDetailTypesInner
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`slot`)) {
        self$`slot` <- this_object$`slot`
      }
      if (!is.null(this_object$`type`)) {
        `type_object` <- AbilityDetailPokemonInnerPokemon$new()
        `type_object`$fromJSON(jsonlite::toJSON(this_object$`type`, auto_unbox = TRUE, digits = NA))
        self$`type` <- `type_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return PokemonDetailTypesInner in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of PokemonDetailTypesInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokemonDetailTypesInner
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`slot` <- this_object$`slot`
      self$`type` <- AbilityDetailPokemonInnerPokemon$new()$fromJSON(jsonlite::toJSON(this_object$`type`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to PokemonDetailTypesInner and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `slot`
      if (!is.null(input_json$`slot`)) {
        if (!(is.numeric(input_json$`slot`) && length(input_json$`slot`) == 1)) {
          stop(paste("Error! Invalid data for `slot`. Must be an integer:", input_json$`slot`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonDetailTypesInner: the required field `slot` is missing."))
      }
      # check the required field `type`
      if (!is.null(input_json$`type`)) {
        stopifnot(R6::is.R6(input_json$`type`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonDetailTypesInner: the required field `type` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PokemonDetailTypesInner
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `slot` is null
      if (is.null(self$`slot`)) {
        return(FALSE)
      }

      # check if the required `type` is null
      if (is.null(self$`type`)) {
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
      # check if the required `slot` is null
      if (is.null(self$`slot`)) {
        invalid_fields["slot"] <- "Non-nullable required field `slot` cannot be null."
      }

      # check if the required `type` is null
      if (is.null(self$`type`)) {
        invalid_fields["type"] <- "Non-nullable required field `type` cannot be null."
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
# PokemonDetailTypesInner$unlock()
#
## Below is an example to define the print function
# PokemonDetailTypesInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PokemonDetailTypesInner$lock()

