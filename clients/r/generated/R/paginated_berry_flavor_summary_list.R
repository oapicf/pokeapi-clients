#' Create a new PaginatedBerryFlavorSummaryList
#'
#' @description
#' PaginatedBerryFlavorSummaryList Class
#'
#' @docType class
#' @title PaginatedBerryFlavorSummaryList
#' @description PaginatedBerryFlavorSummaryList Class
#' @format An \code{R6Class} generator object
#' @field count  integer [optional]
#' @field next  character [optional]
#' @field previous  character [optional]
#' @field results  list(\link{BerryFlavorSummary}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PaginatedBerryFlavorSummaryList <- R6::R6Class(
  "PaginatedBerryFlavorSummaryList",
  public = list(
    `count` = NULL,
    `next` = NULL,
    `previous` = NULL,
    `results` = NULL,

    #' @description
    #' Initialize a new PaginatedBerryFlavorSummaryList class.
    #'
    #' @param count count
    #' @param next next
    #' @param previous previous
    #' @param results results
    #' @param ... Other optional arguments.
    initialize = function(`count` = NULL, `next` = NULL, `previous` = NULL, `results` = NULL, ...) {
      if (!is.null(`count`)) {
        if (!(is.numeric(`count`) && length(`count`) == 1)) {
          stop(paste("Error! Invalid data for `count`. Must be an integer:", `count`))
        }
        self$`count` <- `count`
      }
      if (!is.null(`next`)) {
        if (!(is.character(`next`) && length(`next`) == 1)) {
          stop(paste("Error! Invalid data for `next`. Must be a string:", `next`))
        }
        # to validate URL. ref: https://stackoverflow.com/questions/73952024/url-validation-in-r
        if (!stringr::str_detect(`next`, "(https?|ftp)://[^ /$.?#].[^\\s]*")) {
          stop(paste("Error! Invalid data for `next`. Must be a URL:", `next`))
        }
        self$`next` <- `next`
      }
      if (!is.null(`previous`)) {
        if (!(is.character(`previous`) && length(`previous`) == 1)) {
          stop(paste("Error! Invalid data for `previous`. Must be a string:", `previous`))
        }
        # to validate URL. ref: https://stackoverflow.com/questions/73952024/url-validation-in-r
        if (!stringr::str_detect(`previous`, "(https?|ftp)://[^ /$.?#].[^\\s]*")) {
          stop(paste("Error! Invalid data for `previous`. Must be a URL:", `previous`))
        }
        self$`previous` <- `previous`
      }
      if (!is.null(`results`)) {
        stopifnot(is.vector(`results`), length(`results`) != 0)
        sapply(`results`, function(x) stopifnot(R6::is.R6(x)))
        self$`results` <- `results`
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
    #' @return PaginatedBerryFlavorSummaryList as a base R list.
    #' @examples
    #' # convert array of PaginatedBerryFlavorSummaryList (x) to a data frame
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
    #' Convert PaginatedBerryFlavorSummaryList to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      PaginatedBerryFlavorSummaryListObject <- list()
      if (!is.null(self$`count`)) {
        PaginatedBerryFlavorSummaryListObject[["count"]] <-
          self$`count`
      }
      if (!is.null(self$`next`)) {
        PaginatedBerryFlavorSummaryListObject[["next"]] <-
          self$`next`
      }
      if (!is.null(self$`previous`)) {
        PaginatedBerryFlavorSummaryListObject[["previous"]] <-
          self$`previous`
      }
      if (!is.null(self$`results`)) {
        PaginatedBerryFlavorSummaryListObject[["results"]] <-
          lapply(self$`results`, function(x) x$toSimpleType())
      }
      return(PaginatedBerryFlavorSummaryListObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of PaginatedBerryFlavorSummaryList
    #'
    #' @param input_json the JSON input
    #' @return the instance of PaginatedBerryFlavorSummaryList
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`count`)) {
        self$`count` <- this_object$`count`
      }
      if (!is.null(this_object$`next`)) {
        # to validate URL. ref: https://stackoverflow.com/questions/73952024/url-validation-in-r
        if (!stringr::str_detect(this_object$`next`, "(https?|ftp)://[^ /$.?#].[^\\s]*")) {
          stop(paste("Error! Invalid data for `next`. Must be a URL:", this_object$`next`))
        }
        self$`next` <- this_object$`next`
      }
      if (!is.null(this_object$`previous`)) {
        # to validate URL. ref: https://stackoverflow.com/questions/73952024/url-validation-in-r
        if (!stringr::str_detect(this_object$`previous`, "(https?|ftp)://[^ /$.?#].[^\\s]*")) {
          stop(paste("Error! Invalid data for `previous`. Must be a URL:", this_object$`previous`))
        }
        self$`previous` <- this_object$`previous`
      }
      if (!is.null(this_object$`results`)) {
        self$`results` <- ApiClient$new()$deserializeObj(this_object$`results`, "array[BerryFlavorSummary]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return PaginatedBerryFlavorSummaryList in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of PaginatedBerryFlavorSummaryList
    #'
    #' @param input_json the JSON input
    #' @return the instance of PaginatedBerryFlavorSummaryList
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`count` <- this_object$`count`
      # to validate URL. ref: https://stackoverflow.com/questions/73952024/url-validation-in-r
      if (!stringr::str_detect(this_object$`next`, "(https?|ftp)://[^ /$.?#].[^\\s]*")) {
        stop(paste("Error! Invalid data for `next`. Must be a URL:", this_object$`next`))
      }
      self$`next` <- this_object$`next`
      # to validate URL. ref: https://stackoverflow.com/questions/73952024/url-validation-in-r
      if (!stringr::str_detect(this_object$`previous`, "(https?|ftp)://[^ /$.?#].[^\\s]*")) {
        stop(paste("Error! Invalid data for `previous`. Must be a URL:", this_object$`previous`))
      }
      self$`previous` <- this_object$`previous`
      self$`results` <- ApiClient$new()$deserializeObj(this_object$`results`, "array[BerryFlavorSummary]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to PaginatedBerryFlavorSummaryList and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PaginatedBerryFlavorSummaryList
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
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
# PaginatedBerryFlavorSummaryList$unlock()
#
## Below is an example to define the print function
# PaginatedBerryFlavorSummaryList$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PaginatedBerryFlavorSummaryList$lock()

