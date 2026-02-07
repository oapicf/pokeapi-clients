#' Create a new StatDetailAffectingMovesIncreaseInner
#'
#' @description
#' StatDetailAffectingMovesIncreaseInner Class
#'
#' @docType class
#' @title StatDetailAffectingMovesIncreaseInner
#' @description StatDetailAffectingMovesIncreaseInner Class
#' @format An \code{R6Class} generator object
#' @field change  integer
#' @field move  \link{AbilityDetailPokemonInnerPokemon}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
StatDetailAffectingMovesIncreaseInner <- R6::R6Class(
  "StatDetailAffectingMovesIncreaseInner",
  public = list(
    `change` = NULL,
    `move` = NULL,

    #' @description
    #' Initialize a new StatDetailAffectingMovesIncreaseInner class.
    #'
    #' @param change change
    #' @param move move
    #' @param ... Other optional arguments.
    initialize = function(`change`, `move`, ...) {
      if (!missing(`change`)) {
        if (!(is.numeric(`change`) && length(`change`) == 1)) {
          stop(paste("Error! Invalid data for `change`. Must be an integer:", `change`))
        }
        self$`change` <- `change`
      }
      if (!missing(`move`)) {
        stopifnot(R6::is.R6(`move`))
        self$`move` <- `move`
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
    #' @return StatDetailAffectingMovesIncreaseInner as a base R list.
    #' @examples
    #' # convert array of StatDetailAffectingMovesIncreaseInner (x) to a data frame
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
    #' Convert StatDetailAffectingMovesIncreaseInner to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      StatDetailAffectingMovesIncreaseInnerObject <- list()
      if (!is.null(self$`change`)) {
        StatDetailAffectingMovesIncreaseInnerObject[["change"]] <-
          self$`change`
      }
      if (!is.null(self$`move`)) {
        StatDetailAffectingMovesIncreaseInnerObject[["move"]] <-
          self$`move`$toSimpleType()
      }
      return(StatDetailAffectingMovesIncreaseInnerObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of StatDetailAffectingMovesIncreaseInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of StatDetailAffectingMovesIncreaseInner
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`change`)) {
        self$`change` <- this_object$`change`
      }
      if (!is.null(this_object$`move`)) {
        `move_object` <- AbilityDetailPokemonInnerPokemon$new()
        `move_object`$fromJSON(jsonlite::toJSON(this_object$`move`, auto_unbox = TRUE, digits = NA))
        self$`move` <- `move_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return StatDetailAffectingMovesIncreaseInner in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of StatDetailAffectingMovesIncreaseInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of StatDetailAffectingMovesIncreaseInner
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`change` <- this_object$`change`
      self$`move` <- AbilityDetailPokemonInnerPokemon$new()$fromJSON(jsonlite::toJSON(this_object$`move`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to StatDetailAffectingMovesIncreaseInner and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `change`
      if (!is.null(input_json$`change`)) {
        if (!(is.numeric(input_json$`change`) && length(input_json$`change`) == 1)) {
          stop(paste("Error! Invalid data for `change`. Must be an integer:", input_json$`change`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for StatDetailAffectingMovesIncreaseInner: the required field `change` is missing."))
      }
      # check the required field `move`
      if (!is.null(input_json$`move`)) {
        stopifnot(R6::is.R6(input_json$`move`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for StatDetailAffectingMovesIncreaseInner: the required field `move` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of StatDetailAffectingMovesIncreaseInner
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `change` is null
      if (is.null(self$`change`)) {
        return(FALSE)
      }

      # check if the required `move` is null
      if (is.null(self$`move`)) {
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
      # check if the required `change` is null
      if (is.null(self$`change`)) {
        invalid_fields["change"] <- "Non-nullable required field `change` cannot be null."
      }

      # check if the required `move` is null
      if (is.null(self$`move`)) {
        invalid_fields["move"] <- "Non-nullable required field `move` cannot be null."
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
# StatDetailAffectingMovesIncreaseInner$unlock()
#
## Below is an example to define the print function
# StatDetailAffectingMovesIncreaseInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# StatDetailAffectingMovesIncreaseInner$lock()

