#' Create a new ItemMachine
#'
#' @description
#' ItemMachine Class
#'
#' @docType class
#' @title ItemMachine
#' @description ItemMachine Class
#' @format An \code{R6Class} generator object
#' @field machine The machine that teaches a move from an item. \link{MachineSummary}
#' @field version_group The version group of this specific machine. \link{VersionGroupSummary}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ItemMachine <- R6::R6Class(
  "ItemMachine",
  public = list(
    `machine` = NULL,
    `version_group` = NULL,

    #' @description
    #' Initialize a new ItemMachine class.
    #'
    #' @param machine The machine that teaches a move from an item.
    #' @param version_group The version group of this specific machine.
    #' @param ... Other optional arguments.
    initialize = function(`machine`, `version_group`, ...) {
      if (!missing(`machine`)) {
        stopifnot(R6::is.R6(`machine`))
        self$`machine` <- `machine`
      }
      if (!missing(`version_group`)) {
        stopifnot(R6::is.R6(`version_group`))
        self$`version_group` <- `version_group`
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
    #' @return ItemMachine as a base R list.
    #' @examples
    #' # convert array of ItemMachine (x) to a data frame
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
    #' Convert ItemMachine to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      ItemMachineObject <- list()
      if (!is.null(self$`machine`)) {
        ItemMachineObject[["machine"]] <-
          self$extractSimpleType(self$`machine`)
      }
      if (!is.null(self$`version_group`)) {
        ItemMachineObject[["version_group"]] <-
          self$extractSimpleType(self$`version_group`)
      }
      return(ItemMachineObject)
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
    #' Deserialize JSON string into an instance of ItemMachine
    #'
    #' @param input_json the JSON input
    #' @return the instance of ItemMachine
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`machine`)) {
        `machine_object` <- MachineSummary$new()
        `machine_object`$fromJSON(jsonlite::toJSON(this_object$`machine`, auto_unbox = TRUE, digits = NA))
        self$`machine` <- `machine_object`
      }
      if (!is.null(this_object$`version_group`)) {
        `version_group_object` <- VersionGroupSummary$new()
        `version_group_object`$fromJSON(jsonlite::toJSON(this_object$`version_group`, auto_unbox = TRUE, digits = NA))
        self$`version_group` <- `version_group_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return ItemMachine in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of ItemMachine
    #'
    #' @param input_json the JSON input
    #' @return the instance of ItemMachine
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`machine` <- MachineSummary$new()$fromJSON(jsonlite::toJSON(this_object$`machine`, auto_unbox = TRUE, digits = NA))
      self$`version_group` <- VersionGroupSummary$new()$fromJSON(jsonlite::toJSON(this_object$`version_group`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to ItemMachine and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `machine`
      if (!is.null(input_json$`machine`)) {
        stopifnot(R6::is.R6(input_json$`machine`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ItemMachine: the required field `machine` is missing."))
      }
      # check the required field `version_group`
      if (!is.null(input_json$`version_group`)) {
        stopifnot(R6::is.R6(input_json$`version_group`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ItemMachine: the required field `version_group` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ItemMachine
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `machine` is null
      if (is.null(self$`machine`)) {
        return(FALSE)
      }

      # check if the required `version_group` is null
      if (is.null(self$`version_group`)) {
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
      # check if the required `machine` is null
      if (is.null(self$`machine`)) {
        invalid_fields["machine"] <- "Non-nullable required field `machine` cannot be null."
      }

      # check if the required `version_group` is null
      if (is.null(self$`version_group`)) {
        invalid_fields["version_group"] <- "Non-nullable required field `version_group` cannot be null."
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
# ItemMachine$unlock()
#
## Below is an example to define the print function
# ItemMachine$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ItemMachine$lock()

