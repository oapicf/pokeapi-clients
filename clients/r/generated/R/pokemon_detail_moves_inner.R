#' Create a new PokemonDetailMovesInner
#'
#' @description
#' PokemonDetailMovesInner Class
#'
#' @docType class
#' @title PokemonDetailMovesInner
#' @description PokemonDetailMovesInner Class
#' @format An \code{R6Class} generator object
#' @field move  \link{AbilityDetailPokemonInnerPokemon}
#' @field version_group_details  list(\link{PokemonDetailMovesInnerVersionGroupDetailsInner})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PokemonDetailMovesInner <- R6::R6Class(
  "PokemonDetailMovesInner",
  public = list(
    `move` = NULL,
    `version_group_details` = NULL,

    #' @description
    #' Initialize a new PokemonDetailMovesInner class.
    #'
    #' @param move move
    #' @param version_group_details version_group_details
    #' @param ... Other optional arguments.
    initialize = function(`move`, `version_group_details`, ...) {
      if (!missing(`move`)) {
        stopifnot(R6::is.R6(`move`))
        self$`move` <- `move`
      }
      if (!missing(`version_group_details`)) {
        stopifnot(is.vector(`version_group_details`), length(`version_group_details`) != 0)
        sapply(`version_group_details`, function(x) stopifnot(R6::is.R6(x)))
        self$`version_group_details` <- `version_group_details`
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
    #' @return PokemonDetailMovesInner as a base R list.
    #' @examples
    #' # convert array of PokemonDetailMovesInner (x) to a data frame
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
    #' Convert PokemonDetailMovesInner to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      PokemonDetailMovesInnerObject <- list()
      if (!is.null(self$`move`)) {
        PokemonDetailMovesInnerObject[["move"]] <-
          self$`move`$toSimpleType()
      }
      if (!is.null(self$`version_group_details`)) {
        PokemonDetailMovesInnerObject[["version_group_details"]] <-
          lapply(self$`version_group_details`, function(x) x$toSimpleType())
      }
      return(PokemonDetailMovesInnerObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of PokemonDetailMovesInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokemonDetailMovesInner
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`move`)) {
        `move_object` <- AbilityDetailPokemonInnerPokemon$new()
        `move_object`$fromJSON(jsonlite::toJSON(this_object$`move`, auto_unbox = TRUE, digits = NA))
        self$`move` <- `move_object`
      }
      if (!is.null(this_object$`version_group_details`)) {
        self$`version_group_details` <- ApiClient$new()$deserializeObj(this_object$`version_group_details`, "array[PokemonDetailMovesInnerVersionGroupDetailsInner]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return PokemonDetailMovesInner in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of PokemonDetailMovesInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokemonDetailMovesInner
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`move` <- AbilityDetailPokemonInnerPokemon$new()$fromJSON(jsonlite::toJSON(this_object$`move`, auto_unbox = TRUE, digits = NA))
      self$`version_group_details` <- ApiClient$new()$deserializeObj(this_object$`version_group_details`, "array[PokemonDetailMovesInnerVersionGroupDetailsInner]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to PokemonDetailMovesInner and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `move`
      if (!is.null(input_json$`move`)) {
        stopifnot(R6::is.R6(input_json$`move`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonDetailMovesInner: the required field `move` is missing."))
      }
      # check the required field `version_group_details`
      if (!is.null(input_json$`version_group_details`)) {
        stopifnot(is.vector(input_json$`version_group_details`), length(input_json$`version_group_details`) != 0)
        tmp <- sapply(input_json$`version_group_details`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonDetailMovesInner: the required field `version_group_details` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PokemonDetailMovesInner
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `move` is null
      if (is.null(self$`move`)) {
        return(FALSE)
      }

      # check if the required `version_group_details` is null
      if (is.null(self$`version_group_details`)) {
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
      # check if the required `move` is null
      if (is.null(self$`move`)) {
        invalid_fields["move"] <- "Non-nullable required field `move` cannot be null."
      }

      # check if the required `version_group_details` is null
      if (is.null(self$`version_group_details`)) {
        invalid_fields["version_group_details"] <- "Non-nullable required field `version_group_details` cannot be null."
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
# PokemonDetailMovesInner$unlock()
#
## Below is an example to define the print function
# PokemonDetailMovesInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PokemonDetailMovesInner$lock()

