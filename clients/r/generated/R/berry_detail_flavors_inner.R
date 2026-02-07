#' Create a new BerryDetailFlavorsInner
#'
#' @description
#' BerryDetailFlavorsInner Class
#'
#' @docType class
#' @title BerryDetailFlavorsInner
#' @description BerryDetailFlavorsInner Class
#' @format An \code{R6Class} generator object
#' @field potency  integer
#' @field flavor  \link{BerryDetailFlavorsInnerFlavor}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
BerryDetailFlavorsInner <- R6::R6Class(
  "BerryDetailFlavorsInner",
  public = list(
    `potency` = NULL,
    `flavor` = NULL,

    #' @description
    #' Initialize a new BerryDetailFlavorsInner class.
    #'
    #' @param potency potency
    #' @param flavor flavor
    #' @param ... Other optional arguments.
    initialize = function(`potency`, `flavor`, ...) {
      if (!missing(`potency`)) {
        if (!(is.numeric(`potency`) && length(`potency`) == 1)) {
          stop(paste("Error! Invalid data for `potency`. Must be an integer:", `potency`))
        }
        self$`potency` <- `potency`
      }
      if (!missing(`flavor`)) {
        stopifnot(R6::is.R6(`flavor`))
        self$`flavor` <- `flavor`
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
    #' @return BerryDetailFlavorsInner as a base R list.
    #' @examples
    #' # convert array of BerryDetailFlavorsInner (x) to a data frame
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
    #' Convert BerryDetailFlavorsInner to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      BerryDetailFlavorsInnerObject <- list()
      if (!is.null(self$`potency`)) {
        BerryDetailFlavorsInnerObject[["potency"]] <-
          self$`potency`
      }
      if (!is.null(self$`flavor`)) {
        BerryDetailFlavorsInnerObject[["flavor"]] <-
          self$`flavor`$toSimpleType()
      }
      return(BerryDetailFlavorsInnerObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of BerryDetailFlavorsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of BerryDetailFlavorsInner
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`potency`)) {
        self$`potency` <- this_object$`potency`
      }
      if (!is.null(this_object$`flavor`)) {
        `flavor_object` <- BerryDetailFlavorsInnerFlavor$new()
        `flavor_object`$fromJSON(jsonlite::toJSON(this_object$`flavor`, auto_unbox = TRUE, digits = NA))
        self$`flavor` <- `flavor_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return BerryDetailFlavorsInner in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of BerryDetailFlavorsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of BerryDetailFlavorsInner
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`potency` <- this_object$`potency`
      self$`flavor` <- BerryDetailFlavorsInnerFlavor$new()$fromJSON(jsonlite::toJSON(this_object$`flavor`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to BerryDetailFlavorsInner and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for BerryDetailFlavorsInner: the required field `potency` is missing."))
      }
      # check the required field `flavor`
      if (!is.null(input_json$`flavor`)) {
        stopifnot(R6::is.R6(input_json$`flavor`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for BerryDetailFlavorsInner: the required field `flavor` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of BerryDetailFlavorsInner
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

      # check if the required `flavor` is null
      if (is.null(self$`flavor`)) {
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

      # check if the required `flavor` is null
      if (is.null(self$`flavor`)) {
        invalid_fields["flavor"] <- "Non-nullable required field `flavor` cannot be null."
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
# BerryDetailFlavorsInner$unlock()
#
## Below is an example to define the print function
# BerryDetailFlavorsInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# BerryDetailFlavorsInner$lock()

