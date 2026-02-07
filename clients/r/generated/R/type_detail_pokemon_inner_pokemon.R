#' Create a new TypeDetailPokemonInnerPokemon
#'
#' @description
#' TypeDetailPokemonInnerPokemon Class
#'
#' @docType class
#' @title TypeDetailPokemonInnerPokemon
#' @description TypeDetailPokemonInnerPokemon Class
#' @format An \code{R6Class} generator object
#' @field name The name of the pokemon character [optional]
#' @field url The URL to get more information about the pokemon character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
TypeDetailPokemonInnerPokemon <- R6::R6Class(
  "TypeDetailPokemonInnerPokemon",
  public = list(
    `name` = NULL,
    `url` = NULL,

    #' @description
    #' Initialize a new TypeDetailPokemonInnerPokemon class.
    #'
    #' @param name The name of the pokemon
    #' @param url The URL to get more information about the pokemon
    #' @param ... Other optional arguments.
    initialize = function(`name` = NULL, `url` = NULL, ...) {
      if (!is.null(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!is.null(`url`)) {
        if (!(is.character(`url`) && length(`url`) == 1)) {
          stop(paste("Error! Invalid data for `url`. Must be a string:", `url`))
        }
        # to validate URL. ref: https://stackoverflow.com/questions/73952024/url-validation-in-r
        if (!stringr::str_detect(`url`, "(https?|ftp)://[^ /$.?#].[^\\s]*")) {
          stop(paste("Error! Invalid data for `url`. Must be a URL:", `url`))
        }
        self$`url` <- `url`
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
    #' @return TypeDetailPokemonInnerPokemon as a base R list.
    #' @examples
    #' # convert array of TypeDetailPokemonInnerPokemon (x) to a data frame
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
    #' Convert TypeDetailPokemonInnerPokemon to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      TypeDetailPokemonInnerPokemonObject <- list()
      if (!is.null(self$`name`)) {
        TypeDetailPokemonInnerPokemonObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`url`)) {
        TypeDetailPokemonInnerPokemonObject[["url"]] <-
          self$`url`
      }
      return(TypeDetailPokemonInnerPokemonObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of TypeDetailPokemonInnerPokemon
    #'
    #' @param input_json the JSON input
    #' @return the instance of TypeDetailPokemonInnerPokemon
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`url`)) {
        # to validate URL. ref: https://stackoverflow.com/questions/73952024/url-validation-in-r
        if (!stringr::str_detect(this_object$`url`, "(https?|ftp)://[^ /$.?#].[^\\s]*")) {
          stop(paste("Error! Invalid data for `url`. Must be a URL:", this_object$`url`))
        }
        self$`url` <- this_object$`url`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return TypeDetailPokemonInnerPokemon in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of TypeDetailPokemonInnerPokemon
    #'
    #' @param input_json the JSON input
    #' @return the instance of TypeDetailPokemonInnerPokemon
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`name` <- this_object$`name`
      # to validate URL. ref: https://stackoverflow.com/questions/73952024/url-validation-in-r
      if (!stringr::str_detect(this_object$`url`, "(https?|ftp)://[^ /$.?#].[^\\s]*")) {
        stop(paste("Error! Invalid data for `url`. Must be a URL:", this_object$`url`))
      }
      self$`url` <- this_object$`url`
      self
    },

    #' @description
    #' Validate JSON input with respect to TypeDetailPokemonInnerPokemon and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of TypeDetailPokemonInnerPokemon
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
# TypeDetailPokemonInnerPokemon$unlock()
#
## Below is an example to define the print function
# TypeDetailPokemonInnerPokemon$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# TypeDetailPokemonInnerPokemon$lock()

