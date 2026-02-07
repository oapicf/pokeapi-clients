#' Create a new LocationAreaDetailPokemonEncountersInner
#'
#' @description
#' LocationAreaDetailPokemonEncountersInner Class
#'
#' @docType class
#' @title LocationAreaDetailPokemonEncountersInner
#' @description LocationAreaDetailPokemonEncountersInner Class
#' @format An \code{R6Class} generator object
#' @field pokemon  \link{AbilityDetailPokemonInnerPokemon}
#' @field version_details  list(\link{LocationAreaDetailPokemonEncountersInnerVersionDetailsInner})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
LocationAreaDetailPokemonEncountersInner <- R6::R6Class(
  "LocationAreaDetailPokemonEncountersInner",
  public = list(
    `pokemon` = NULL,
    `version_details` = NULL,

    #' @description
    #' Initialize a new LocationAreaDetailPokemonEncountersInner class.
    #'
    #' @param pokemon pokemon
    #' @param version_details version_details
    #' @param ... Other optional arguments.
    initialize = function(`pokemon`, `version_details`, ...) {
      if (!missing(`pokemon`)) {
        stopifnot(R6::is.R6(`pokemon`))
        self$`pokemon` <- `pokemon`
      }
      if (!missing(`version_details`)) {
        stopifnot(is.vector(`version_details`), length(`version_details`) != 0)
        sapply(`version_details`, function(x) stopifnot(R6::is.R6(x)))
        self$`version_details` <- `version_details`
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
    #' @return LocationAreaDetailPokemonEncountersInner as a base R list.
    #' @examples
    #' # convert array of LocationAreaDetailPokemonEncountersInner (x) to a data frame
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
    #' Convert LocationAreaDetailPokemonEncountersInner to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      LocationAreaDetailPokemonEncountersInnerObject <- list()
      if (!is.null(self$`pokemon`)) {
        LocationAreaDetailPokemonEncountersInnerObject[["pokemon"]] <-
          self$`pokemon`$toSimpleType()
      }
      if (!is.null(self$`version_details`)) {
        LocationAreaDetailPokemonEncountersInnerObject[["version_details"]] <-
          lapply(self$`version_details`, function(x) x$toSimpleType())
      }
      return(LocationAreaDetailPokemonEncountersInnerObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of LocationAreaDetailPokemonEncountersInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of LocationAreaDetailPokemonEncountersInner
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`pokemon`)) {
        `pokemon_object` <- AbilityDetailPokemonInnerPokemon$new()
        `pokemon_object`$fromJSON(jsonlite::toJSON(this_object$`pokemon`, auto_unbox = TRUE, digits = NA))
        self$`pokemon` <- `pokemon_object`
      }
      if (!is.null(this_object$`version_details`)) {
        self$`version_details` <- ApiClient$new()$deserializeObj(this_object$`version_details`, "array[LocationAreaDetailPokemonEncountersInnerVersionDetailsInner]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return LocationAreaDetailPokemonEncountersInner in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of LocationAreaDetailPokemonEncountersInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of LocationAreaDetailPokemonEncountersInner
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`pokemon` <- AbilityDetailPokemonInnerPokemon$new()$fromJSON(jsonlite::toJSON(this_object$`pokemon`, auto_unbox = TRUE, digits = NA))
      self$`version_details` <- ApiClient$new()$deserializeObj(this_object$`version_details`, "array[LocationAreaDetailPokemonEncountersInnerVersionDetailsInner]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to LocationAreaDetailPokemonEncountersInner and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `pokemon`
      if (!is.null(input_json$`pokemon`)) {
        stopifnot(R6::is.R6(input_json$`pokemon`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for LocationAreaDetailPokemonEncountersInner: the required field `pokemon` is missing."))
      }
      # check the required field `version_details`
      if (!is.null(input_json$`version_details`)) {
        stopifnot(is.vector(input_json$`version_details`), length(input_json$`version_details`) != 0)
        tmp <- sapply(input_json$`version_details`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for LocationAreaDetailPokemonEncountersInner: the required field `version_details` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of LocationAreaDetailPokemonEncountersInner
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `pokemon` is null
      if (is.null(self$`pokemon`)) {
        return(FALSE)
      }

      # check if the required `version_details` is null
      if (is.null(self$`version_details`)) {
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
      # check if the required `pokemon` is null
      if (is.null(self$`pokemon`)) {
        invalid_fields["pokemon"] <- "Non-nullable required field `pokemon` cannot be null."
      }

      # check if the required `version_details` is null
      if (is.null(self$`version_details`)) {
        invalid_fields["version_details"] <- "Non-nullable required field `version_details` cannot be null."
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
# LocationAreaDetailPokemonEncountersInner$unlock()
#
## Below is an example to define the print function
# LocationAreaDetailPokemonEncountersInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# LocationAreaDetailPokemonEncountersInner$lock()

