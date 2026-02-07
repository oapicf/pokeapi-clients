#' Create a new NatureDetailPokeathlonStatChangesInner
#'
#' @description
#' NatureDetailPokeathlonStatChangesInner Class
#'
#' @docType class
#' @title NatureDetailPokeathlonStatChangesInner
#' @description NatureDetailPokeathlonStatChangesInner Class
#' @format An \code{R6Class} generator object
#' @field max_change  integer
#' @field pokeathlon_stat  \link{AbilityDetailPokemonInnerPokemon}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
NatureDetailPokeathlonStatChangesInner <- R6::R6Class(
  "NatureDetailPokeathlonStatChangesInner",
  public = list(
    `max_change` = NULL,
    `pokeathlon_stat` = NULL,

    #' @description
    #' Initialize a new NatureDetailPokeathlonStatChangesInner class.
    #'
    #' @param max_change max_change
    #' @param pokeathlon_stat pokeathlon_stat
    #' @param ... Other optional arguments.
    initialize = function(`max_change`, `pokeathlon_stat`, ...) {
      if (!missing(`max_change`)) {
        if (!(is.numeric(`max_change`) && length(`max_change`) == 1)) {
          stop(paste("Error! Invalid data for `max_change`. Must be an integer:", `max_change`))
        }
        self$`max_change` <- `max_change`
      }
      if (!missing(`pokeathlon_stat`)) {
        stopifnot(R6::is.R6(`pokeathlon_stat`))
        self$`pokeathlon_stat` <- `pokeathlon_stat`
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
    #' @return NatureDetailPokeathlonStatChangesInner as a base R list.
    #' @examples
    #' # convert array of NatureDetailPokeathlonStatChangesInner (x) to a data frame
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
    #' Convert NatureDetailPokeathlonStatChangesInner to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      NatureDetailPokeathlonStatChangesInnerObject <- list()
      if (!is.null(self$`max_change`)) {
        NatureDetailPokeathlonStatChangesInnerObject[["max_change"]] <-
          self$`max_change`
      }
      if (!is.null(self$`pokeathlon_stat`)) {
        NatureDetailPokeathlonStatChangesInnerObject[["pokeathlon_stat"]] <-
          self$`pokeathlon_stat`$toSimpleType()
      }
      return(NatureDetailPokeathlonStatChangesInnerObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of NatureDetailPokeathlonStatChangesInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of NatureDetailPokeathlonStatChangesInner
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`max_change`)) {
        self$`max_change` <- this_object$`max_change`
      }
      if (!is.null(this_object$`pokeathlon_stat`)) {
        `pokeathlon_stat_object` <- AbilityDetailPokemonInnerPokemon$new()
        `pokeathlon_stat_object`$fromJSON(jsonlite::toJSON(this_object$`pokeathlon_stat`, auto_unbox = TRUE, digits = NA))
        self$`pokeathlon_stat` <- `pokeathlon_stat_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return NatureDetailPokeathlonStatChangesInner in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of NatureDetailPokeathlonStatChangesInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of NatureDetailPokeathlonStatChangesInner
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`max_change` <- this_object$`max_change`
      self$`pokeathlon_stat` <- AbilityDetailPokemonInnerPokemon$new()$fromJSON(jsonlite::toJSON(this_object$`pokeathlon_stat`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to NatureDetailPokeathlonStatChangesInner and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `max_change`
      if (!is.null(input_json$`max_change`)) {
        if (!(is.numeric(input_json$`max_change`) && length(input_json$`max_change`) == 1)) {
          stop(paste("Error! Invalid data for `max_change`. Must be an integer:", input_json$`max_change`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for NatureDetailPokeathlonStatChangesInner: the required field `max_change` is missing."))
      }
      # check the required field `pokeathlon_stat`
      if (!is.null(input_json$`pokeathlon_stat`)) {
        stopifnot(R6::is.R6(input_json$`pokeathlon_stat`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for NatureDetailPokeathlonStatChangesInner: the required field `pokeathlon_stat` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of NatureDetailPokeathlonStatChangesInner
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `max_change` is null
      if (is.null(self$`max_change`)) {
        return(FALSE)
      }

      # check if the required `pokeathlon_stat` is null
      if (is.null(self$`pokeathlon_stat`)) {
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
      # check if the required `max_change` is null
      if (is.null(self$`max_change`)) {
        invalid_fields["max_change"] <- "Non-nullable required field `max_change` cannot be null."
      }

      # check if the required `pokeathlon_stat` is null
      if (is.null(self$`pokeathlon_stat`)) {
        invalid_fields["pokeathlon_stat"] <- "Non-nullable required field `pokeathlon_stat` cannot be null."
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
# NatureDetailPokeathlonStatChangesInner$unlock()
#
## Below is an example to define the print function
# NatureDetailPokeathlonStatChangesInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# NatureDetailPokeathlonStatChangesInner$lock()

