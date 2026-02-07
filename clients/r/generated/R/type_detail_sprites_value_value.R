#' Create a new TypeDetailSpritesValueValue
#'
#' @description
#' TypeDetailSpritesValueValue Class
#'
#' @docType class
#' @title TypeDetailSpritesValueValue
#' @description TypeDetailSpritesValueValue Class
#' @format An \code{R6Class} generator object
#' @field name-icon  character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
TypeDetailSpritesValueValue <- R6::R6Class(
  "TypeDetailSpritesValueValue",
  public = list(
    `name-icon` = NULL,

    #' @description
    #' Initialize a new TypeDetailSpritesValueValue class.
    #'
    #' @param name-icon name-icon
    #' @param ... Other optional arguments.
    initialize = function(`name-icon` = NULL, ...) {
      if (!is.null(`name-icon`)) {
        if (!(is.character(`name-icon`) && length(`name-icon`) == 1)) {
          stop(paste("Error! Invalid data for `name-icon`. Must be a string:", `name-icon`))
        }
        # to validate URL. ref: https://stackoverflow.com/questions/73952024/url-validation-in-r
        if (!stringr::str_detect(`name-icon`, "(https?|ftp)://[^ /$.?#].[^\\s]*")) {
          stop(paste("Error! Invalid data for `name-icon`. Must be a URL:", `name-icon`))
        }
        self$`name-icon` <- `name-icon`
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
    #' @return TypeDetailSpritesValueValue as a base R list.
    #' @examples
    #' # convert array of TypeDetailSpritesValueValue (x) to a data frame
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
    #' Convert TypeDetailSpritesValueValue to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      TypeDetailSpritesValueValueObject <- list()
      if (!is.null(self$`name-icon`)) {
        TypeDetailSpritesValueValueObject[["name-icon"]] <-
          self$`name-icon`
      }
      return(TypeDetailSpritesValueValueObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of TypeDetailSpritesValueValue
    #'
    #' @param input_json the JSON input
    #' @return the instance of TypeDetailSpritesValueValue
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`name-icon`)) {
        # to validate URL. ref: https://stackoverflow.com/questions/73952024/url-validation-in-r
        if (!stringr::str_detect(this_object$`name-icon`, "(https?|ftp)://[^ /$.?#].[^\\s]*")) {
          stop(paste("Error! Invalid data for `name-icon`. Must be a URL:", this_object$`name-icon`))
        }
        self$`name-icon` <- this_object$`name-icon`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return TypeDetailSpritesValueValue in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of TypeDetailSpritesValueValue
    #'
    #' @param input_json the JSON input
    #' @return the instance of TypeDetailSpritesValueValue
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      # to validate URL. ref: https://stackoverflow.com/questions/73952024/url-validation-in-r
      if (!stringr::str_detect(this_object$`name-icon`, "(https?|ftp)://[^ /$.?#].[^\\s]*")) {
        stop(paste("Error! Invalid data for `name-icon`. Must be a URL:", this_object$`name-icon`))
      }
      self$`name-icon` <- this_object$`name-icon`
      self
    },

    #' @description
    #' Validate JSON input with respect to TypeDetailSpritesValueValue and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of TypeDetailSpritesValueValue
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
# TypeDetailSpritesValueValue$unlock()
#
## Below is an example to define the print function
# TypeDetailSpritesValueValue$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# TypeDetailSpritesValueValue$lock()

