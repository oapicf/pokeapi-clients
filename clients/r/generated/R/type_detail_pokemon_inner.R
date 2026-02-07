#' Create a new TypeDetailPokemonInner
#'
#' @description
#' TypeDetailPokemonInner Class
#'
#' @docType class
#' @title TypeDetailPokemonInner
#' @description TypeDetailPokemonInner Class
#' @format An \code{R6Class} generator object
#' @field slot  integer [optional]
#' @field pokemon  \link{TypeDetailPokemonInnerPokemon} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
TypeDetailPokemonInner <- R6::R6Class(
  "TypeDetailPokemonInner",
  public = list(
    `slot` = NULL,
    `pokemon` = NULL,

    #' @description
    #' Initialize a new TypeDetailPokemonInner class.
    #'
    #' @param slot slot
    #' @param pokemon pokemon
    #' @param ... Other optional arguments.
    initialize = function(`slot` = NULL, `pokemon` = NULL, ...) {
      if (!is.null(`slot`)) {
        if (!(is.numeric(`slot`) && length(`slot`) == 1)) {
          stop(paste("Error! Invalid data for `slot`. Must be an integer:", `slot`))
        }
        self$`slot` <- `slot`
      }
      if (!is.null(`pokemon`)) {
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
    #' @return TypeDetailPokemonInner as a base R list.
    #' @examples
    #' # convert array of TypeDetailPokemonInner (x) to a data frame
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
    #' Convert TypeDetailPokemonInner to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      TypeDetailPokemonInnerObject <- list()
      if (!is.null(self$`slot`)) {
        TypeDetailPokemonInnerObject[["slot"]] <-
          self$`slot`
      }
      if (!is.null(self$`pokemon`)) {
        TypeDetailPokemonInnerObject[["pokemon"]] <-
          self$`pokemon`$toSimpleType()
      }
      return(TypeDetailPokemonInnerObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of TypeDetailPokemonInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of TypeDetailPokemonInner
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`slot`)) {
        self$`slot` <- this_object$`slot`
      }
      if (!is.null(this_object$`pokemon`)) {
        `pokemon_object` <- TypeDetailPokemonInnerPokemon$new()
        `pokemon_object`$fromJSON(jsonlite::toJSON(this_object$`pokemon`, auto_unbox = TRUE, digits = NA))
        self$`pokemon` <- `pokemon_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return TypeDetailPokemonInner in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of TypeDetailPokemonInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of TypeDetailPokemonInner
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`slot` <- this_object$`slot`
      self$`pokemon` <- TypeDetailPokemonInnerPokemon$new()$fromJSON(jsonlite::toJSON(this_object$`pokemon`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to TypeDetailPokemonInner and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of TypeDetailPokemonInner
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
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
# TypeDetailPokemonInner$unlock()
#
## Below is an example to define the print function
# TypeDetailPokemonInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# TypeDetailPokemonInner$lock()

