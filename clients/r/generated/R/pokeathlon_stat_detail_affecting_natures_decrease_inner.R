#' Create a new PokeathlonStatDetailAffectingNaturesDecreaseInner
#'
#' @description
#' PokeathlonStatDetailAffectingNaturesDecreaseInner Class
#'
#' @docType class
#' @title PokeathlonStatDetailAffectingNaturesDecreaseInner
#' @description PokeathlonStatDetailAffectingNaturesDecreaseInner Class
#' @format An \code{R6Class} generator object
#' @field max_change  integer
#' @field nature  \link{AbilityDetailPokemonInnerPokemon}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PokeathlonStatDetailAffectingNaturesDecreaseInner <- R6::R6Class(
  "PokeathlonStatDetailAffectingNaturesDecreaseInner",
  public = list(
    `max_change` = NULL,
    `nature` = NULL,

    #' @description
    #' Initialize a new PokeathlonStatDetailAffectingNaturesDecreaseInner class.
    #'
    #' @param max_change max_change
    #' @param nature nature
    #' @param ... Other optional arguments.
    initialize = function(`max_change`, `nature`, ...) {
      if (!missing(`max_change`)) {
        if (!(is.numeric(`max_change`) && length(`max_change`) == 1)) {
          stop(paste("Error! Invalid data for `max_change`. Must be an integer:", `max_change`))
        }
        self$`max_change` <- `max_change`
      }
      if (!missing(`nature`)) {
        stopifnot(R6::is.R6(`nature`))
        self$`nature` <- `nature`
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
    #' @return PokeathlonStatDetailAffectingNaturesDecreaseInner as a base R list.
    #' @examples
    #' # convert array of PokeathlonStatDetailAffectingNaturesDecreaseInner (x) to a data frame
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
    #' Convert PokeathlonStatDetailAffectingNaturesDecreaseInner to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      PokeathlonStatDetailAffectingNaturesDecreaseInnerObject <- list()
      if (!is.null(self$`max_change`)) {
        PokeathlonStatDetailAffectingNaturesDecreaseInnerObject[["max_change"]] <-
          self$`max_change`
      }
      if (!is.null(self$`nature`)) {
        PokeathlonStatDetailAffectingNaturesDecreaseInnerObject[["nature"]] <-
          self$`nature`$toSimpleType()
      }
      return(PokeathlonStatDetailAffectingNaturesDecreaseInnerObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of PokeathlonStatDetailAffectingNaturesDecreaseInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokeathlonStatDetailAffectingNaturesDecreaseInner
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`max_change`)) {
        self$`max_change` <- this_object$`max_change`
      }
      if (!is.null(this_object$`nature`)) {
        `nature_object` <- AbilityDetailPokemonInnerPokemon$new()
        `nature_object`$fromJSON(jsonlite::toJSON(this_object$`nature`, auto_unbox = TRUE, digits = NA))
        self$`nature` <- `nature_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return PokeathlonStatDetailAffectingNaturesDecreaseInner in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of PokeathlonStatDetailAffectingNaturesDecreaseInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokeathlonStatDetailAffectingNaturesDecreaseInner
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`max_change` <- this_object$`max_change`
      self$`nature` <- AbilityDetailPokemonInnerPokemon$new()$fromJSON(jsonlite::toJSON(this_object$`nature`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to PokeathlonStatDetailAffectingNaturesDecreaseInner and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for PokeathlonStatDetailAffectingNaturesDecreaseInner: the required field `max_change` is missing."))
      }
      # check the required field `nature`
      if (!is.null(input_json$`nature`)) {
        stopifnot(R6::is.R6(input_json$`nature`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokeathlonStatDetailAffectingNaturesDecreaseInner: the required field `nature` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PokeathlonStatDetailAffectingNaturesDecreaseInner
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

      if (self$`max_change` > -1) {
        return(FALSE)
      }

      # check if the required `nature` is null
      if (is.null(self$`nature`)) {
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

      if (self$`max_change` > -1) {
        invalid_fields["max_change"] <- "Invalid value for `max_change`, must be smaller than or equal to -1."
      }

      # check if the required `nature` is null
      if (is.null(self$`nature`)) {
        invalid_fields["nature"] <- "Non-nullable required field `nature` cannot be null."
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
# PokeathlonStatDetailAffectingNaturesDecreaseInner$unlock()
#
## Below is an example to define the print function
# PokeathlonStatDetailAffectingNaturesDecreaseInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PokeathlonStatDetailAffectingNaturesDecreaseInner$lock()

