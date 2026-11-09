#' Create a new MoveMetaStatChange
#'
#' @description
#' MoveMetaStatChange Class
#'
#' @docType class
#' @title MoveMetaStatChange
#' @description MoveMetaStatChange Class
#' @format An \code{R6Class} generator object
#' @field change The amount of change. integer
#' @field stat The stat being affected. \link{StatSummary}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
MoveMetaStatChange <- R6::R6Class(
  "MoveMetaStatChange",
  public = list(
    `change` = NULL,
    `stat` = NULL,

    #' @description
    #' Initialize a new MoveMetaStatChange class.
    #'
    #' @param change The amount of change.
    #' @param stat The stat being affected.
    #' @param ... Other optional arguments.
    initialize = function(`change`, `stat`, ...) {
      if (!missing(`change`)) {
        if (!(is.numeric(`change`) && length(`change`) == 1)) {
          stop(paste("Error! Invalid data for `change`. Must be an integer:", `change`))
        }
        self$`change` <- `change`
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
    #' @return MoveMetaStatChange as a base R list.
    #' @examples
    #' # convert array of MoveMetaStatChange (x) to a data frame
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
    #' Convert MoveMetaStatChange to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      MoveMetaStatChangeObject <- list()
      if (!is.null(self$`change`)) {
        MoveMetaStatChangeObject[["change"]] <-
          self$`change`
      }
      if (!is.null(self$`stat`)) {
        MoveMetaStatChangeObject[["stat"]] <-
          self$extractSimpleType(self$`stat`)
      }
      return(MoveMetaStatChangeObject)
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
    #' Deserialize JSON string into an instance of MoveMetaStatChange
    #'
    #' @param input_json the JSON input
    #' @return the instance of MoveMetaStatChange
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`change`)) {
        self$`change` <- this_object$`change`
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
    #' @return MoveMetaStatChange in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of MoveMetaStatChange
    #'
    #' @param input_json the JSON input
    #' @return the instance of MoveMetaStatChange
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`change` <- this_object$`change`
      self$`stat` <- StatSummary$new()$fromJSON(jsonlite::toJSON(this_object$`stat`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to MoveMetaStatChange and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for MoveMetaStatChange: the required field `change` is missing."))
      }
      # check the required field `stat`
      if (!is.null(input_json$`stat`)) {
        stopifnot(R6::is.R6(input_json$`stat`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MoveMetaStatChange: the required field `stat` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of MoveMetaStatChange
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

      if (self$`change` > 2147483647) {
        return(FALSE)
      }
      if (self$`change` < -2147483648) {
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
      # check if the required `change` is null
      if (is.null(self$`change`)) {
        invalid_fields["change"] <- "Non-nullable required field `change` cannot be null."
      }

      if (self$`change` > 2147483647) {
        invalid_fields["change"] <- "Invalid value for `change`, must be smaller than or equal to 2147483647."
      }
      if (self$`change` < -2147483648) {
        invalid_fields["change"] <- "Invalid value for `change`, must be bigger than or equal to -2147483648."
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
# MoveMetaStatChange$unlock()
#
## Below is an example to define the print function
# MoveMetaStatChange$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# MoveMetaStatChange$lock()

