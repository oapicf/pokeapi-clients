#' Create a new PokemonCries
#'
#' @description
#' PokemonCries Class
#'
#' @docType class
#' @title PokemonCries
#' @description PokemonCries Class
#' @format An \code{R6Class} generator object
#' @field latest The latest depiction of this Pokémon's cry. character
#' @field legacy The legacy depiction of this Pokémon's cry. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PokemonCries <- R6::R6Class(
  "PokemonCries",
  public = list(
    `latest` = NULL,
    `legacy` = NULL,

    #' @description
    #' Initialize a new PokemonCries class.
    #'
    #' @param latest The latest depiction of this Pokémon's cry.
    #' @param legacy The legacy depiction of this Pokémon's cry.
    #' @param ... Other optional arguments.
    initialize = function(`latest`, `legacy`, ...) {
      if (!missing(`latest`)) {
        if (!(is.character(`latest`) && length(`latest`) == 1)) {
          stop(paste("Error! Invalid data for `latest`. Must be a string:", `latest`))
        }
        self$`latest` <- `latest`
      }
      if (!missing(`legacy`)) {
        if (!(is.character(`legacy`) && length(`legacy`) == 1)) {
          stop(paste("Error! Invalid data for `legacy`. Must be a string:", `legacy`))
        }
        self$`legacy` <- `legacy`
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
    #' @return PokemonCries as a base R list.
    #' @examples
    #' # convert array of PokemonCries (x) to a data frame
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
    #' Convert PokemonCries to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      PokemonCriesObject <- list()
      if (!is.null(self$`latest`)) {
        PokemonCriesObject[["latest"]] <-
          self$`latest`
      }
      if (!is.null(self$`legacy`)) {
        PokemonCriesObject[["legacy"]] <-
          self$`legacy`
      }
      return(PokemonCriesObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of PokemonCries
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokemonCries
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`latest`)) {
        self$`latest` <- this_object$`latest`
      }
      if (!is.null(this_object$`legacy`)) {
        self$`legacy` <- this_object$`legacy`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return PokemonCries in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of PokemonCries
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokemonCries
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`latest` <- this_object$`latest`
      self$`legacy` <- this_object$`legacy`
      self
    },

    #' @description
    #' Validate JSON input with respect to PokemonCries and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `latest`
      if (!is.null(input_json$`latest`)) {
        if (!(is.character(input_json$`latest`) && length(input_json$`latest`) == 1)) {
          stop(paste("Error! Invalid data for `latest`. Must be a string:", input_json$`latest`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonCries: the required field `latest` is missing."))
      }
      # check the required field `legacy`
      if (!is.null(input_json$`legacy`)) {
        if (!(is.character(input_json$`legacy`) && length(input_json$`legacy`) == 1)) {
          stop(paste("Error! Invalid data for `legacy`. Must be a string:", input_json$`legacy`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonCries: the required field `legacy` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PokemonCries
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
# PokemonCries$unlock()
#
## Below is an example to define the print function
# PokemonCries$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PokemonCries$lock()

