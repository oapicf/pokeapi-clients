#' Create a new LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner
#'
#' @description
#' LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner Class
#'
#' @docType class
#' @title LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner
#' @description LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner Class
#' @format An \code{R6Class} generator object
#' @field rate  integer
#' @field version  \link{AbilityDetailPokemonInnerPokemon}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner <- R6::R6Class(
  "LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner",
  public = list(
    `rate` = NULL,
    `version` = NULL,

    #' @description
    #' Initialize a new LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner class.
    #'
    #' @param rate rate
    #' @param version version
    #' @param ... Other optional arguments.
    initialize = function(`rate`, `version`, ...) {
      if (!missing(`rate`)) {
        if (!(is.numeric(`rate`) && length(`rate`) == 1)) {
          stop(paste("Error! Invalid data for `rate`. Must be an integer:", `rate`))
        }
        self$`rate` <- `rate`
      }
      if (!missing(`version`)) {
        stopifnot(R6::is.R6(`version`))
        self$`version` <- `version`
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
    #' @return LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner as a base R list.
    #' @examples
    #' # convert array of LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner (x) to a data frame
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
    #' Convert LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInnerObject <- list()
      if (!is.null(self$`rate`)) {
        LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInnerObject[["rate"]] <-
          self$`rate`
      }
      if (!is.null(self$`version`)) {
        LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInnerObject[["version"]] <-
          self$`version`$toSimpleType()
      }
      return(LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInnerObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`rate`)) {
        self$`rate` <- this_object$`rate`
      }
      if (!is.null(this_object$`version`)) {
        `version_object` <- AbilityDetailPokemonInnerPokemon$new()
        `version_object`$fromJSON(jsonlite::toJSON(this_object$`version`, auto_unbox = TRUE, digits = NA))
        self$`version` <- `version_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`rate` <- this_object$`rate`
      self$`version` <- AbilityDetailPokemonInnerPokemon$new()$fromJSON(jsonlite::toJSON(this_object$`version`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `rate`
      if (!is.null(input_json$`rate`)) {
        if (!(is.numeric(input_json$`rate`) && length(input_json$`rate`) == 1)) {
          stop(paste("Error! Invalid data for `rate`. Must be an integer:", input_json$`rate`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner: the required field `rate` is missing."))
      }
      # check the required field `version`
      if (!is.null(input_json$`version`)) {
        stopifnot(R6::is.R6(input_json$`version`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner: the required field `version` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `rate` is null
      if (is.null(self$`rate`)) {
        return(FALSE)
      }

      # check if the required `version` is null
      if (is.null(self$`version`)) {
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
      # check if the required `rate` is null
      if (is.null(self$`rate`)) {
        invalid_fields["rate"] <- "Non-nullable required field `rate` cannot be null."
      }

      # check if the required `version` is null
      if (is.null(self$`version`)) {
        invalid_fields["version"] <- "Non-nullable required field `version` cannot be null."
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
# LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner$unlock()
#
## Below is an example to define the print function
# LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner$lock()

