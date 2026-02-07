#' Create a new PokemonDetailPastAbilitiesInner
#'
#' @description
#' PokemonDetailPastAbilitiesInner Class
#'
#' @docType class
#' @title PokemonDetailPastAbilitiesInner
#' @description PokemonDetailPastAbilitiesInner Class
#' @format An \code{R6Class} generator object
#' @field abilities  list(\link{PokemonDetailAbilitiesInner})
#' @field generation  \link{AbilityDetailPokemonInnerPokemon}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PokemonDetailPastAbilitiesInner <- R6::R6Class(
  "PokemonDetailPastAbilitiesInner",
  public = list(
    `abilities` = NULL,
    `generation` = NULL,

    #' @description
    #' Initialize a new PokemonDetailPastAbilitiesInner class.
    #'
    #' @param abilities abilities
    #' @param generation generation
    #' @param ... Other optional arguments.
    initialize = function(`abilities`, `generation`, ...) {
      if (!missing(`abilities`)) {
        stopifnot(is.vector(`abilities`), length(`abilities`) != 0)
        sapply(`abilities`, function(x) stopifnot(R6::is.R6(x)))
        self$`abilities` <- `abilities`
      }
      if (!missing(`generation`)) {
        stopifnot(R6::is.R6(`generation`))
        self$`generation` <- `generation`
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
    #' @return PokemonDetailPastAbilitiesInner as a base R list.
    #' @examples
    #' # convert array of PokemonDetailPastAbilitiesInner (x) to a data frame
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
    #' Convert PokemonDetailPastAbilitiesInner to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      PokemonDetailPastAbilitiesInnerObject <- list()
      if (!is.null(self$`abilities`)) {
        PokemonDetailPastAbilitiesInnerObject[["abilities"]] <-
          lapply(self$`abilities`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`generation`)) {
        PokemonDetailPastAbilitiesInnerObject[["generation"]] <-
          self$`generation`$toSimpleType()
      }
      return(PokemonDetailPastAbilitiesInnerObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of PokemonDetailPastAbilitiesInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokemonDetailPastAbilitiesInner
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`abilities`)) {
        self$`abilities` <- ApiClient$new()$deserializeObj(this_object$`abilities`, "array[PokemonDetailAbilitiesInner]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`generation`)) {
        `generation_object` <- AbilityDetailPokemonInnerPokemon$new()
        `generation_object`$fromJSON(jsonlite::toJSON(this_object$`generation`, auto_unbox = TRUE, digits = NA))
        self$`generation` <- `generation_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return PokemonDetailPastAbilitiesInner in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of PokemonDetailPastAbilitiesInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokemonDetailPastAbilitiesInner
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`abilities` <- ApiClient$new()$deserializeObj(this_object$`abilities`, "array[PokemonDetailAbilitiesInner]", loadNamespace("openapi"))
      self$`generation` <- AbilityDetailPokemonInnerPokemon$new()$fromJSON(jsonlite::toJSON(this_object$`generation`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to PokemonDetailPastAbilitiesInner and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `abilities`
      if (!is.null(input_json$`abilities`)) {
        stopifnot(is.vector(input_json$`abilities`), length(input_json$`abilities`) != 0)
        tmp <- sapply(input_json$`abilities`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonDetailPastAbilitiesInner: the required field `abilities` is missing."))
      }
      # check the required field `generation`
      if (!is.null(input_json$`generation`)) {
        stopifnot(R6::is.R6(input_json$`generation`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonDetailPastAbilitiesInner: the required field `generation` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PokemonDetailPastAbilitiesInner
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `abilities` is null
      if (is.null(self$`abilities`)) {
        return(FALSE)
      }

      # check if the required `generation` is null
      if (is.null(self$`generation`)) {
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
      # check if the required `abilities` is null
      if (is.null(self$`abilities`)) {
        invalid_fields["abilities"] <- "Non-nullable required field `abilities` cannot be null."
      }

      # check if the required `generation` is null
      if (is.null(self$`generation`)) {
        invalid_fields["generation"] <- "Non-nullable required field `generation` cannot be null."
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
# PokemonDetailPastAbilitiesInner$unlock()
#
## Below is an example to define the print function
# PokemonDetailPastAbilitiesInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PokemonDetailPastAbilitiesInner$lock()

