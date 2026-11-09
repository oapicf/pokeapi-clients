#' Create a new MoveStatChange
#'
#' @description
#' MoveStatChange Class
#'
#' @docType class
#' @title MoveStatChange
#' @description MoveStatChange Class
#' @format An \code{R6Class} generator object
#' @field change The maximum amount of change to the referenced stat. integer
#' @field move The move causing the change. \link{MoveSummary}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
MoveStatChange <- R6::R6Class(
  "MoveStatChange",
  public = list(
    `change` = NULL,
    `move` = NULL,

    #' @description
    #' Initialize a new MoveStatChange class.
    #'
    #' @param change The maximum amount of change to the referenced stat.
    #' @param move The move causing the change.
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
    #' @return MoveStatChange as a base R list.
    #' @examples
    #' # convert array of MoveStatChange (x) to a data frame
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
    #' Convert MoveStatChange to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      MoveStatChangeObject <- list()
      if (!is.null(self$`change`)) {
        MoveStatChangeObject[["change"]] <-
          self$`change`
      }
      if (!is.null(self$`move`)) {
        MoveStatChangeObject[["move"]] <-
          self$extractSimpleType(self$`move`)
      }
      return(MoveStatChangeObject)
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
    #' Deserialize JSON string into an instance of MoveStatChange
    #'
    #' @param input_json the JSON input
    #' @return the instance of MoveStatChange
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`change`)) {
        self$`change` <- this_object$`change`
      }
      if (!is.null(this_object$`move`)) {
        `move_object` <- MoveSummary$new()
        `move_object`$fromJSON(jsonlite::toJSON(this_object$`move`, auto_unbox = TRUE, digits = NA))
        self$`move` <- `move_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return MoveStatChange in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of MoveStatChange
    #'
    #' @param input_json the JSON input
    #' @return the instance of MoveStatChange
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`change` <- this_object$`change`
      self$`move` <- MoveSummary$new()$fromJSON(jsonlite::toJSON(this_object$`move`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to MoveStatChange and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for MoveStatChange: the required field `change` is missing."))
      }
      # check the required field `move`
      if (!is.null(input_json$`move`)) {
        stopifnot(R6::is.R6(input_json$`move`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MoveStatChange: the required field `move` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of MoveStatChange
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

      if (self$`change` > 2147483647) {
        invalid_fields["change"] <- "Invalid value for `change`, must be smaller than or equal to 2147483647."
      }
      if (self$`change` < -2147483648) {
        invalid_fields["change"] <- "Invalid value for `change`, must be bigger than or equal to -2147483648."
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
# MoveStatChange$unlock()
#
## Below is an example to define the print function
# MoveStatChange$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# MoveStatChange$lock()

