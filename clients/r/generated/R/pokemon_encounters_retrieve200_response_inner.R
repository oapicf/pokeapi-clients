#' Create a new PokemonEncountersRetrieve200ResponseInner
#'
#' @description
#' PokemonEncountersRetrieve200ResponseInner Class
#'
#' @docType class
#' @title PokemonEncountersRetrieve200ResponseInner
#' @description PokemonEncountersRetrieve200ResponseInner Class
#' @format An \code{R6Class} generator object
#' @field location_area  \link{PokemonEncountersRetrieve200ResponseInnerLocationArea}
#' @field version_details  list(\link{PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PokemonEncountersRetrieve200ResponseInner <- R6::R6Class(
  "PokemonEncountersRetrieve200ResponseInner",
  public = list(
    `location_area` = NULL,
    `version_details` = NULL,

    #' @description
    #' Initialize a new PokemonEncountersRetrieve200ResponseInner class.
    #'
    #' @param location_area location_area
    #' @param version_details version_details
    #' @param ... Other optional arguments.
    initialize = function(`location_area`, `version_details`, ...) {
      if (!missing(`location_area`)) {
        stopifnot(R6::is.R6(`location_area`))
        self$`location_area` <- `location_area`
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
    #' @return PokemonEncountersRetrieve200ResponseInner as a base R list.
    #' @examples
    #' # convert array of PokemonEncountersRetrieve200ResponseInner (x) to a data frame
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
    #' Convert PokemonEncountersRetrieve200ResponseInner to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      PokemonEncountersRetrieve200ResponseInnerObject <- list()
      if (!is.null(self$`location_area`)) {
        PokemonEncountersRetrieve200ResponseInnerObject[["location_area"]] <-
          self$`location_area`$toSimpleType()
      }
      if (!is.null(self$`version_details`)) {
        PokemonEncountersRetrieve200ResponseInnerObject[["version_details"]] <-
          lapply(self$`version_details`, function(x) x$toSimpleType())
      }
      return(PokemonEncountersRetrieve200ResponseInnerObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of PokemonEncountersRetrieve200ResponseInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokemonEncountersRetrieve200ResponseInner
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`location_area`)) {
        `location_area_object` <- PokemonEncountersRetrieve200ResponseInnerLocationArea$new()
        `location_area_object`$fromJSON(jsonlite::toJSON(this_object$`location_area`, auto_unbox = TRUE, digits = NA))
        self$`location_area` <- `location_area_object`
      }
      if (!is.null(this_object$`version_details`)) {
        self$`version_details` <- ApiClient$new()$deserializeObj(this_object$`version_details`, "array[PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return PokemonEncountersRetrieve200ResponseInner in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of PokemonEncountersRetrieve200ResponseInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokemonEncountersRetrieve200ResponseInner
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`location_area` <- PokemonEncountersRetrieve200ResponseInnerLocationArea$new()$fromJSON(jsonlite::toJSON(this_object$`location_area`, auto_unbox = TRUE, digits = NA))
      self$`version_details` <- ApiClient$new()$deserializeObj(this_object$`version_details`, "array[PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to PokemonEncountersRetrieve200ResponseInner and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `location_area`
      if (!is.null(input_json$`location_area`)) {
        stopifnot(R6::is.R6(input_json$`location_area`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonEncountersRetrieve200ResponseInner: the required field `location_area` is missing."))
      }
      # check the required field `version_details`
      if (!is.null(input_json$`version_details`)) {
        stopifnot(is.vector(input_json$`version_details`), length(input_json$`version_details`) != 0)
        tmp <- sapply(input_json$`version_details`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonEncountersRetrieve200ResponseInner: the required field `version_details` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PokemonEncountersRetrieve200ResponseInner
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `location_area` is null
      if (is.null(self$`location_area`)) {
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
      # check if the required `location_area` is null
      if (is.null(self$`location_area`)) {
        invalid_fields["location_area"] <- "Non-nullable required field `location_area` cannot be null."
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
# PokemonEncountersRetrieve200ResponseInner$unlock()
#
## Below is an example to define the print function
# PokemonEncountersRetrieve200ResponseInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PokemonEncountersRetrieve200ResponseInner$lock()

