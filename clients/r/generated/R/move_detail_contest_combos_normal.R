#' Create a new MoveDetailContestCombosNormal
#'
#' @description
#' MoveDetailContestCombosNormal Class
#'
#' @docType class
#' @title MoveDetailContestCombosNormal
#' @description MoveDetailContestCombosNormal Class
#' @format An \code{R6Class} generator object
#' @field use_before  list(\link{AbilityDetailPokemonInnerPokemon})
#' @field use_after  list(\link{AbilityDetailPokemonInnerPokemon})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
MoveDetailContestCombosNormal <- R6::R6Class(
  "MoveDetailContestCombosNormal",
  public = list(
    `use_before` = NULL,
    `use_after` = NULL,

    #' @description
    #' Initialize a new MoveDetailContestCombosNormal class.
    #'
    #' @param use_before use_before
    #' @param use_after use_after
    #' @param ... Other optional arguments.
    initialize = function(`use_before`, `use_after`, ...) {
      if (!missing(`use_before`)) {
        stopifnot(is.vector(`use_before`), length(`use_before`) != 0)
        sapply(`use_before`, function(x) stopifnot(R6::is.R6(x)))
        self$`use_before` <- `use_before`
      }
      if (!missing(`use_after`)) {
        stopifnot(is.vector(`use_after`), length(`use_after`) != 0)
        sapply(`use_after`, function(x) stopifnot(R6::is.R6(x)))
        self$`use_after` <- `use_after`
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
    #' @return MoveDetailContestCombosNormal as a base R list.
    #' @examples
    #' # convert array of MoveDetailContestCombosNormal (x) to a data frame
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
    #' Convert MoveDetailContestCombosNormal to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      MoveDetailContestCombosNormalObject <- list()
      if (!is.null(self$`use_before`)) {
        MoveDetailContestCombosNormalObject[["use_before"]] <-
          lapply(self$`use_before`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`use_after`)) {
        MoveDetailContestCombosNormalObject[["use_after"]] <-
          lapply(self$`use_after`, function(x) x$toSimpleType())
      }
      return(MoveDetailContestCombosNormalObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of MoveDetailContestCombosNormal
    #'
    #' @param input_json the JSON input
    #' @return the instance of MoveDetailContestCombosNormal
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`use_before`)) {
        self$`use_before` <- ApiClient$new()$deserializeObj(this_object$`use_before`, "array[AbilityDetailPokemonInnerPokemon]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`use_after`)) {
        self$`use_after` <- ApiClient$new()$deserializeObj(this_object$`use_after`, "array[AbilityDetailPokemonInnerPokemon]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return MoveDetailContestCombosNormal in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of MoveDetailContestCombosNormal
    #'
    #' @param input_json the JSON input
    #' @return the instance of MoveDetailContestCombosNormal
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`use_before` <- ApiClient$new()$deserializeObj(this_object$`use_before`, "array[AbilityDetailPokemonInnerPokemon]", loadNamespace("openapi"))
      self$`use_after` <- ApiClient$new()$deserializeObj(this_object$`use_after`, "array[AbilityDetailPokemonInnerPokemon]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to MoveDetailContestCombosNormal and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `use_before`
      if (!is.null(input_json$`use_before`)) {
        stopifnot(is.vector(input_json$`use_before`), length(input_json$`use_before`) != 0)
        tmp <- sapply(input_json$`use_before`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MoveDetailContestCombosNormal: the required field `use_before` is missing."))
      }
      # check the required field `use_after`
      if (!is.null(input_json$`use_after`)) {
        stopifnot(is.vector(input_json$`use_after`), length(input_json$`use_after`) != 0)
        tmp <- sapply(input_json$`use_after`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MoveDetailContestCombosNormal: the required field `use_after` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of MoveDetailContestCombosNormal
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `use_before` is null
      if (is.null(self$`use_before`)) {
        return(FALSE)
      }

      # check if the required `use_after` is null
      if (is.null(self$`use_after`)) {
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
      # check if the required `use_before` is null
      if (is.null(self$`use_before`)) {
        invalid_fields["use_before"] <- "Non-nullable required field `use_before` cannot be null."
      }

      # check if the required `use_after` is null
      if (is.null(self$`use_after`)) {
        invalid_fields["use_after"] <- "Non-nullable required field `use_after` cannot be null."
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
# MoveDetailContestCombosNormal$unlock()
#
## Below is an example to define the print function
# MoveDetailContestCombosNormal$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# MoveDetailContestCombosNormal$lock()

