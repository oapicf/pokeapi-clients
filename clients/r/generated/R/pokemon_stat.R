#' Create a new PokemonStat
#'
#' @description
#' PokemonStat Class
#'
#' @docType class
#' @title PokemonStat
#' @description PokemonStat Class
#' @format An \code{R6Class} generator object
#' @field base_stat  integer
#' @field effort  integer
#' @field stat  \link{StatSummary}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PokemonStat <- R6::R6Class(
  "PokemonStat",
  public = list(
    `base_stat` = NULL,
    `effort` = NULL,
    `stat` = NULL,

    #' @description
    #' Initialize a new PokemonStat class.
    #'
    #' @param base_stat base_stat
    #' @param effort effort
    #' @param stat stat
    #' @param ... Other optional arguments.
    initialize = function(`base_stat`, `effort`, `stat`, ...) {
      if (!missing(`base_stat`)) {
        if (!(is.numeric(`base_stat`) && length(`base_stat`) == 1)) {
          stop(paste("Error! Invalid data for `base_stat`. Must be an integer:", `base_stat`))
        }
        self$`base_stat` <- `base_stat`
      }
      if (!missing(`effort`)) {
        if (!(is.numeric(`effort`) && length(`effort`) == 1)) {
          stop(paste("Error! Invalid data for `effort`. Must be an integer:", `effort`))
        }
        self$`effort` <- `effort`
      }
      if (!missing(`stat`)) {
        stopifnot(R6::is.R6(`stat`))
        self$`stat` <- `stat`
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
    #' @return PokemonStat as a base R list.
    #' @examples
    #' # convert array of PokemonStat (x) to a data frame
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
    #' Convert PokemonStat to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      PokemonStatObject <- list()
      if (!is.null(self$`base_stat`)) {
        PokemonStatObject[["base_stat"]] <-
          self$`base_stat`
      }
      if (!is.null(self$`effort`)) {
        PokemonStatObject[["effort"]] <-
          self$`effort`
      }
      if (!is.null(self$`stat`)) {
        PokemonStatObject[["stat"]] <-
          self$`stat`$toSimpleType()
      }
      return(PokemonStatObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of PokemonStat
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokemonStat
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`base_stat`)) {
        self$`base_stat` <- this_object$`base_stat`
      }
      if (!is.null(this_object$`effort`)) {
        self$`effort` <- this_object$`effort`
      }
      if (!is.null(this_object$`stat`)) {
        `stat_object` <- StatSummary$new()
        `stat_object`$fromJSON(jsonlite::toJSON(this_object$`stat`, auto_unbox = TRUE, digits = NA))
        self$`stat` <- `stat_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return PokemonStat in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of PokemonStat
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokemonStat
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`base_stat` <- this_object$`base_stat`
      self$`effort` <- this_object$`effort`
      self$`stat` <- StatSummary$new()$fromJSON(jsonlite::toJSON(this_object$`stat`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to PokemonStat and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `base_stat`
      if (!is.null(input_json$`base_stat`)) {
        if (!(is.numeric(input_json$`base_stat`) && length(input_json$`base_stat`) == 1)) {
          stop(paste("Error! Invalid data for `base_stat`. Must be an integer:", input_json$`base_stat`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonStat: the required field `base_stat` is missing."))
      }
      # check the required field `effort`
      if (!is.null(input_json$`effort`)) {
        if (!(is.numeric(input_json$`effort`) && length(input_json$`effort`) == 1)) {
          stop(paste("Error! Invalid data for `effort`. Must be an integer:", input_json$`effort`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonStat: the required field `effort` is missing."))
      }
      # check the required field `stat`
      if (!is.null(input_json$`stat`)) {
        stopifnot(R6::is.R6(input_json$`stat`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonStat: the required field `stat` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PokemonStat
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `base_stat` is null
      if (is.null(self$`base_stat`)) {
        return(FALSE)
      }

      # check if the required `effort` is null
      if (is.null(self$`effort`)) {
        return(FALSE)
      }

      # check if the required `stat` is null
      if (is.null(self$`stat`)) {
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
      # check if the required `base_stat` is null
      if (is.null(self$`base_stat`)) {
        invalid_fields["base_stat"] <- "Non-nullable required field `base_stat` cannot be null."
      }

      # check if the required `effort` is null
      if (is.null(self$`effort`)) {
        invalid_fields["effort"] <- "Non-nullable required field `effort` cannot be null."
      }

      # check if the required `stat` is null
      if (is.null(self$`stat`)) {
        invalid_fields["stat"] <- "Non-nullable required field `stat` cannot be null."
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
# PokemonStat$unlock()
#
## Below is an example to define the print function
# PokemonStat$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PokemonStat$lock()

