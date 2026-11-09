#' Create a new PokemonHeldItemVersion
#'
#' @description
#' PokemonHeldItemVersion Class
#'
#' @docType class
#' @title PokemonHeldItemVersion
#' @description PokemonHeldItemVersion Class
#' @format An \code{R6Class} generator object
#' @field rarity How often the item is held. integer
#' @field version The version in which the item is held. \link{VersionSummary}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PokemonHeldItemVersion <- R6::R6Class(
  "PokemonHeldItemVersion",
  public = list(
    `rarity` = NULL,
    `version` = NULL,

    #' @description
    #' Initialize a new PokemonHeldItemVersion class.
    #'
    #' @param rarity How often the item is held.
    #' @param version The version in which the item is held.
    #' @param ... Other optional arguments.
    initialize = function(`rarity`, `version`, ...) {
      if (!missing(`rarity`)) {
        if (!(is.numeric(`rarity`) && length(`rarity`) == 1)) {
          stop(paste("Error! Invalid data for `rarity`. Must be an integer:", `rarity`))
        }
        self$`rarity` <- `rarity`
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
    #' @return PokemonHeldItemVersion as a base R list.
    #' @examples
    #' # convert array of PokemonHeldItemVersion (x) to a data frame
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
    #' Convert PokemonHeldItemVersion to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      PokemonHeldItemVersionObject <- list()
      if (!is.null(self$`rarity`)) {
        PokemonHeldItemVersionObject[["rarity"]] <-
          self$`rarity`
      }
      if (!is.null(self$`version`)) {
        PokemonHeldItemVersionObject[["version"]] <-
          self$extractSimpleType(self$`version`)
      }
      return(PokemonHeldItemVersionObject)
    },

    extractSimpleType = function(x) {
      if (R6::is.R6(x)) {
        return(x$toSimpleType())
      } else if (!self$hasNestedR6(x)) {
        return(x)
      }
      lapply(x, self$extractSimpleType)
    },

    hasNestedR6 = function(x) {
      if (R6::is.R6(x)) {
        return(TRUE)
      }
      if (is.list(x)) {
        for (item in x) {
          if (self$hasNestedR6(item)) {
            return(TRUE)
          }
        }
      }
      FALSE
    },

    #' @description
    #' Deserialize JSON string into an instance of PokemonHeldItemVersion
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokemonHeldItemVersion
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`rarity`)) {
        self$`rarity` <- this_object$`rarity`
      }
      if (!is.null(this_object$`version`)) {
        `version_object` <- VersionSummary$new()
        `version_object`$fromJSON(jsonlite::toJSON(this_object$`version`, auto_unbox = TRUE, digits = NA))
        self$`version` <- `version_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return PokemonHeldItemVersion in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of PokemonHeldItemVersion
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokemonHeldItemVersion
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`rarity` <- this_object$`rarity`
      self$`version` <- VersionSummary$new()$fromJSON(jsonlite::toJSON(this_object$`version`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to PokemonHeldItemVersion and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `rarity`
      if (!is.null(input_json$`rarity`)) {
        if (!(is.numeric(input_json$`rarity`) && length(input_json$`rarity`) == 1)) {
          stop(paste("Error! Invalid data for `rarity`. Must be an integer:", input_json$`rarity`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonHeldItemVersion: the required field `rarity` is missing."))
      }
      # check the required field `version`
      if (!is.null(input_json$`version`)) {
        stopifnot(R6::is.R6(input_json$`version`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonHeldItemVersion: the required field `version` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PokemonHeldItemVersion
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `rarity` is null
      if (is.null(self$`rarity`)) {
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
      # check if the required `rarity` is null
      if (is.null(self$`rarity`)) {
        invalid_fields["rarity"] <- "Non-nullable required field `rarity` cannot be null."
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
# PokemonHeldItemVersion$unlock()
#
## Below is an example to define the print function
# PokemonHeldItemVersion$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PokemonHeldItemVersion$lock()

