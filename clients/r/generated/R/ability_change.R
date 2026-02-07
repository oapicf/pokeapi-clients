#' Create a new AbilityChange
#'
#' @description
#' AbilityChange Class
#'
#' @docType class
#' @title AbilityChange
#' @description AbilityChange Class
#' @format An \code{R6Class} generator object
#' @field version_group  \link{VersionGroupSummary}
#' @field effect_entries  list(\link{AbilityChangeEffectText})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AbilityChange <- R6::R6Class(
  "AbilityChange",
  public = list(
    `version_group` = NULL,
    `effect_entries` = NULL,

    #' @description
    #' Initialize a new AbilityChange class.
    #'
    #' @param version_group version_group
    #' @param effect_entries effect_entries
    #' @param ... Other optional arguments.
    initialize = function(`version_group`, `effect_entries`, ...) {
      if (!missing(`version_group`)) {
        stopifnot(R6::is.R6(`version_group`))
        self$`version_group` <- `version_group`
      }
      if (!missing(`effect_entries`)) {
        stopifnot(is.vector(`effect_entries`), length(`effect_entries`) != 0)
        sapply(`effect_entries`, function(x) stopifnot(R6::is.R6(x)))
        self$`effect_entries` <- `effect_entries`
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
    #' @return AbilityChange as a base R list.
    #' @examples
    #' # convert array of AbilityChange (x) to a data frame
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
    #' Convert AbilityChange to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      AbilityChangeObject <- list()
      if (!is.null(self$`version_group`)) {
        AbilityChangeObject[["version_group"]] <-
          self$`version_group`$toSimpleType()
      }
      if (!is.null(self$`effect_entries`)) {
        AbilityChangeObject[["effect_entries"]] <-
          lapply(self$`effect_entries`, function(x) x$toSimpleType())
      }
      return(AbilityChangeObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of AbilityChange
    #'
    #' @param input_json the JSON input
    #' @return the instance of AbilityChange
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`version_group`)) {
        `version_group_object` <- VersionGroupSummary$new()
        `version_group_object`$fromJSON(jsonlite::toJSON(this_object$`version_group`, auto_unbox = TRUE, digits = NA))
        self$`version_group` <- `version_group_object`
      }
      if (!is.null(this_object$`effect_entries`)) {
        self$`effect_entries` <- ApiClient$new()$deserializeObj(this_object$`effect_entries`, "array[AbilityChangeEffectText]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return AbilityChange in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AbilityChange
    #'
    #' @param input_json the JSON input
    #' @return the instance of AbilityChange
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`version_group` <- VersionGroupSummary$new()$fromJSON(jsonlite::toJSON(this_object$`version_group`, auto_unbox = TRUE, digits = NA))
      self$`effect_entries` <- ApiClient$new()$deserializeObj(this_object$`effect_entries`, "array[AbilityChangeEffectText]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to AbilityChange and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `version_group`
      if (!is.null(input_json$`version_group`)) {
        stopifnot(R6::is.R6(input_json$`version_group`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AbilityChange: the required field `version_group` is missing."))
      }
      # check the required field `effect_entries`
      if (!is.null(input_json$`effect_entries`)) {
        stopifnot(is.vector(input_json$`effect_entries`), length(input_json$`effect_entries`) != 0)
        tmp <- sapply(input_json$`effect_entries`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AbilityChange: the required field `effect_entries` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AbilityChange
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `version_group` is null
      if (is.null(self$`version_group`)) {
        return(FALSE)
      }

      # check if the required `effect_entries` is null
      if (is.null(self$`effect_entries`)) {
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
      # check if the required `version_group` is null
      if (is.null(self$`version_group`)) {
        invalid_fields["version_group"] <- "Non-nullable required field `version_group` cannot be null."
      }

      # check if the required `effect_entries` is null
      if (is.null(self$`effect_entries`)) {
        invalid_fields["effect_entries"] <- "Non-nullable required field `effect_entries` cannot be null."
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
# AbilityChange$unlock()
#
## Below is an example to define the print function
# AbilityChange$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AbilityChange$lock()

