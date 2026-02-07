#' Create a new BerryFlavorDetailBerriesInner
#'
#' @description
#' BerryFlavorDetailBerriesInner Class
#'
#' @docType class
#' @title BerryFlavorDetailBerriesInner
#' @description BerryFlavorDetailBerriesInner Class
#' @format An \code{R6Class} generator object
#' @field potency  integer
#' @field berry  \link{BerryFlavorDetailBerriesInnerBerry}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
BerryFlavorDetailBerriesInner <- R6::R6Class(
  "BerryFlavorDetailBerriesInner",
  public = list(
    `potency` = NULL,
    `berry` = NULL,

    #' @description
    #' Initialize a new BerryFlavorDetailBerriesInner class.
    #'
    #' @param potency potency
    #' @param berry berry
    #' @param ... Other optional arguments.
    initialize = function(`potency`, `berry`, ...) {
      if (!missing(`potency`)) {
        if (!(is.numeric(`potency`) && length(`potency`) == 1)) {
          stop(paste("Error! Invalid data for `potency`. Must be an integer:", `potency`))
        }
        self$`potency` <- `potency`
      }
      if (!missing(`berry`)) {
        stopifnot(R6::is.R6(`berry`))
        self$`berry` <- `berry`
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
    #' @return BerryFlavorDetailBerriesInner as a base R list.
    #' @examples
    #' # convert array of BerryFlavorDetailBerriesInner (x) to a data frame
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
    #' Convert BerryFlavorDetailBerriesInner to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      BerryFlavorDetailBerriesInnerObject <- list()
      if (!is.null(self$`potency`)) {
        BerryFlavorDetailBerriesInnerObject[["potency"]] <-
          self$`potency`
      }
      if (!is.null(self$`berry`)) {
        BerryFlavorDetailBerriesInnerObject[["berry"]] <-
          self$`berry`$toSimpleType()
      }
      return(BerryFlavorDetailBerriesInnerObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of BerryFlavorDetailBerriesInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of BerryFlavorDetailBerriesInner
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`potency`)) {
        self$`potency` <- this_object$`potency`
      }
      if (!is.null(this_object$`berry`)) {
        `berry_object` <- BerryFlavorDetailBerriesInnerBerry$new()
        `berry_object`$fromJSON(jsonlite::toJSON(this_object$`berry`, auto_unbox = TRUE, digits = NA))
        self$`berry` <- `berry_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return BerryFlavorDetailBerriesInner in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of BerryFlavorDetailBerriesInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of BerryFlavorDetailBerriesInner
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`potency` <- this_object$`potency`
      self$`berry` <- BerryFlavorDetailBerriesInnerBerry$new()$fromJSON(jsonlite::toJSON(this_object$`berry`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to BerryFlavorDetailBerriesInner and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `potency`
      if (!is.null(input_json$`potency`)) {
        if (!(is.numeric(input_json$`potency`) && length(input_json$`potency`) == 1)) {
          stop(paste("Error! Invalid data for `potency`. Must be an integer:", input_json$`potency`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for BerryFlavorDetailBerriesInner: the required field `potency` is missing."))
      }
      # check the required field `berry`
      if (!is.null(input_json$`berry`)) {
        stopifnot(R6::is.R6(input_json$`berry`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for BerryFlavorDetailBerriesInner: the required field `berry` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of BerryFlavorDetailBerriesInner
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `potency` is null
      if (is.null(self$`potency`)) {
        return(FALSE)
      }

      # check if the required `berry` is null
      if (is.null(self$`berry`)) {
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
      # check if the required `potency` is null
      if (is.null(self$`potency`)) {
        invalid_fields["potency"] <- "Non-nullable required field `potency` cannot be null."
      }

      # check if the required `berry` is null
      if (is.null(self$`berry`)) {
        invalid_fields["berry"] <- "Non-nullable required field `berry` cannot be null."
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
# BerryFlavorDetailBerriesInner$unlock()
#
## Below is an example to define the print function
# BerryFlavorDetailBerriesInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# BerryFlavorDetailBerriesInner$lock()

