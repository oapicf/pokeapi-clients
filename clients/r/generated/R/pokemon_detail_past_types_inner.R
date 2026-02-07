#' Create a new PokemonDetailPastTypesInner
#'
#' @description
#' PokemonDetailPastTypesInner Class
#'
#' @docType class
#' @title PokemonDetailPastTypesInner
#' @description PokemonDetailPastTypesInner Class
#' @format An \code{R6Class} generator object
#' @field generation  \link{AbilityDetailPokemonInnerPokemon}
#' @field types  list(\link{PokemonDetailTypesInner})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PokemonDetailPastTypesInner <- R6::R6Class(
  "PokemonDetailPastTypesInner",
  public = list(
    `generation` = NULL,
    `types` = NULL,

    #' @description
    #' Initialize a new PokemonDetailPastTypesInner class.
    #'
    #' @param generation generation
    #' @param types types
    #' @param ... Other optional arguments.
    initialize = function(`generation`, `types`, ...) {
      if (!missing(`generation`)) {
        stopifnot(R6::is.R6(`generation`))
        self$`generation` <- `generation`
      }
      if (!missing(`types`)) {
        stopifnot(is.vector(`types`), length(`types`) != 0)
        sapply(`types`, function(x) stopifnot(R6::is.R6(x)))
        self$`types` <- `types`
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
    #' @return PokemonDetailPastTypesInner as a base R list.
    #' @examples
    #' # convert array of PokemonDetailPastTypesInner (x) to a data frame
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
    #' Convert PokemonDetailPastTypesInner to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      PokemonDetailPastTypesInnerObject <- list()
      if (!is.null(self$`generation`)) {
        PokemonDetailPastTypesInnerObject[["generation"]] <-
          self$`generation`$toSimpleType()
      }
      if (!is.null(self$`types`)) {
        PokemonDetailPastTypesInnerObject[["types"]] <-
          lapply(self$`types`, function(x) x$toSimpleType())
      }
      return(PokemonDetailPastTypesInnerObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of PokemonDetailPastTypesInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokemonDetailPastTypesInner
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`generation`)) {
        `generation_object` <- AbilityDetailPokemonInnerPokemon$new()
        `generation_object`$fromJSON(jsonlite::toJSON(this_object$`generation`, auto_unbox = TRUE, digits = NA))
        self$`generation` <- `generation_object`
      }
      if (!is.null(this_object$`types`)) {
        self$`types` <- ApiClient$new()$deserializeObj(this_object$`types`, "array[PokemonDetailTypesInner]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return PokemonDetailPastTypesInner in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of PokemonDetailPastTypesInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokemonDetailPastTypesInner
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`generation` <- AbilityDetailPokemonInnerPokemon$new()$fromJSON(jsonlite::toJSON(this_object$`generation`, auto_unbox = TRUE, digits = NA))
      self$`types` <- ApiClient$new()$deserializeObj(this_object$`types`, "array[PokemonDetailTypesInner]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to PokemonDetailPastTypesInner and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `generation`
      if (!is.null(input_json$`generation`)) {
        stopifnot(R6::is.R6(input_json$`generation`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonDetailPastTypesInner: the required field `generation` is missing."))
      }
      # check the required field `types`
      if (!is.null(input_json$`types`)) {
        stopifnot(is.vector(input_json$`types`), length(input_json$`types`) != 0)
        tmp <- sapply(input_json$`types`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonDetailPastTypesInner: the required field `types` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PokemonDetailPastTypesInner
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `generation` is null
      if (is.null(self$`generation`)) {
        return(FALSE)
      }

      # check if the required `types` is null
      if (is.null(self$`types`)) {
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
      # check if the required `generation` is null
      if (is.null(self$`generation`)) {
        invalid_fields["generation"] <- "Non-nullable required field `generation` cannot be null."
      }

      # check if the required `types` is null
      if (is.null(self$`types`)) {
        invalid_fields["types"] <- "Non-nullable required field `types` cannot be null."
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
# PokemonDetailPastTypesInner$unlock()
#
## Below is an example to define the print function
# PokemonDetailPastTypesInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PokemonDetailPastTypesInner$lock()

