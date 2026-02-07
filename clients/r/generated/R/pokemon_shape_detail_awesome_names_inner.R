#' Create a new PokemonShapeDetailAwesomeNamesInner
#'
#' @description
#' PokemonShapeDetailAwesomeNamesInner Class
#'
#' @docType class
#' @title PokemonShapeDetailAwesomeNamesInner
#' @description PokemonShapeDetailAwesomeNamesInner Class
#' @format An \code{R6Class} generator object
#' @field awesome_name  character
#' @field language  \link{AbilityDetailPokemonInnerPokemon}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PokemonShapeDetailAwesomeNamesInner <- R6::R6Class(
  "PokemonShapeDetailAwesomeNamesInner",
  public = list(
    `awesome_name` = NULL,
    `language` = NULL,

    #' @description
    #' Initialize a new PokemonShapeDetailAwesomeNamesInner class.
    #'
    #' @param awesome_name awesome_name
    #' @param language language
    #' @param ... Other optional arguments.
    initialize = function(`awesome_name`, `language`, ...) {
      if (!missing(`awesome_name`)) {
        if (!(is.character(`awesome_name`) && length(`awesome_name`) == 1)) {
          stop(paste("Error! Invalid data for `awesome_name`. Must be a string:", `awesome_name`))
        }
        self$`awesome_name` <- `awesome_name`
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
    #' @return PokemonShapeDetailAwesomeNamesInner as a base R list.
    #' @examples
    #' # convert array of PokemonShapeDetailAwesomeNamesInner (x) to a data frame
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
    #' Convert PokemonShapeDetailAwesomeNamesInner to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      PokemonShapeDetailAwesomeNamesInnerObject <- list()
      if (!is.null(self$`awesome_name`)) {
        PokemonShapeDetailAwesomeNamesInnerObject[["awesome_name"]] <-
          self$`awesome_name`
      }
      if (!is.null(self$`language`)) {
        PokemonShapeDetailAwesomeNamesInnerObject[["language"]] <-
          self$`language`$toSimpleType()
      }
      return(PokemonShapeDetailAwesomeNamesInnerObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of PokemonShapeDetailAwesomeNamesInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokemonShapeDetailAwesomeNamesInner
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`awesome_name`)) {
        self$`awesome_name` <- this_object$`awesome_name`
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
    #' @return PokemonShapeDetailAwesomeNamesInner in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of PokemonShapeDetailAwesomeNamesInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokemonShapeDetailAwesomeNamesInner
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`awesome_name` <- this_object$`awesome_name`
      self$`language` <- AbilityDetailPokemonInnerPokemon$new()$fromJSON(jsonlite::toJSON(this_object$`language`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to PokemonShapeDetailAwesomeNamesInner and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `awesome_name`
      if (!is.null(input_json$`awesome_name`)) {
        if (!(is.character(input_json$`awesome_name`) && length(input_json$`awesome_name`) == 1)) {
          stop(paste("Error! Invalid data for `awesome_name`. Must be a string:", input_json$`awesome_name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonShapeDetailAwesomeNamesInner: the required field `awesome_name` is missing."))
      }
      # check the required field `language`
      if (!is.null(input_json$`language`)) {
        stopifnot(R6::is.R6(input_json$`language`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonShapeDetailAwesomeNamesInner: the required field `language` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PokemonShapeDetailAwesomeNamesInner
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `awesome_name` is null
      if (is.null(self$`awesome_name`)) {
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
      # check if the required `awesome_name` is null
      if (is.null(self$`awesome_name`)) {
        invalid_fields["awesome_name"] <- "Non-nullable required field `awesome_name` cannot be null."
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
# PokemonShapeDetailAwesomeNamesInner$unlock()
#
## Below is an example to define the print function
# PokemonShapeDetailAwesomeNamesInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PokemonShapeDetailAwesomeNamesInner$lock()

