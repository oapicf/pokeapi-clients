#' Create a new MoveDamageClassDescription
#'
#' @description
#' MoveDamageClassDescription Class
#'
#' @docType class
#' @title MoveDamageClassDescription
#' @description MoveDamageClassDescription Class
#' @format An \code{R6Class} generator object
#' @field description  character [optional]
#' @field language  \link{LanguageSummary}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
MoveDamageClassDescription <- R6::R6Class(
  "MoveDamageClassDescription",
  public = list(
    `description` = NULL,
    `language` = NULL,

    #' @description
    #' Initialize a new MoveDamageClassDescription class.
    #'
    #' @param language language
    #' @param description description
    #' @param ... Other optional arguments.
    initialize = function(`language`, `description` = NULL, ...) {
      if (!missing(`language`)) {
        stopifnot(R6::is.R6(`language`))
        self$`language` <- `language`
      }
      if (!is.null(`description`)) {
        if (!(is.character(`description`) && length(`description`) == 1)) {
          stop(paste("Error! Invalid data for `description`. Must be a string:", `description`))
        }
        self$`description` <- `description`
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
    #' @return MoveDamageClassDescription as a base R list.
    #' @examples
    #' # convert array of MoveDamageClassDescription (x) to a data frame
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
    #' Convert MoveDamageClassDescription to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      MoveDamageClassDescriptionObject <- list()
      if (!is.null(self$`description`)) {
        MoveDamageClassDescriptionObject[["description"]] <-
          self$`description`
      }
      if (!is.null(self$`language`)) {
        MoveDamageClassDescriptionObject[["language"]] <-
          self$`language`$toSimpleType()
      }
      return(MoveDamageClassDescriptionObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of MoveDamageClassDescription
    #'
    #' @param input_json the JSON input
    #' @return the instance of MoveDamageClassDescription
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`description`)) {
        self$`description` <- this_object$`description`
      }
      if (!is.null(this_object$`language`)) {
        `language_object` <- LanguageSummary$new()
        `language_object`$fromJSON(jsonlite::toJSON(this_object$`language`, auto_unbox = TRUE, digits = NA))
        self$`language` <- `language_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return MoveDamageClassDescription in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of MoveDamageClassDescription
    #'
    #' @param input_json the JSON input
    #' @return the instance of MoveDamageClassDescription
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`description` <- this_object$`description`
      self$`language` <- LanguageSummary$new()$fromJSON(jsonlite::toJSON(this_object$`language`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to MoveDamageClassDescription and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `language`
      if (!is.null(input_json$`language`)) {
        stopifnot(R6::is.R6(input_json$`language`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MoveDamageClassDescription: the required field `language` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of MoveDamageClassDescription
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (nchar(self$`description`) > 1000) {
        return(FALSE)
      }

      # check if the required `language` is null
      if (is.null(self$`language`)) {
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
      if (nchar(self$`description`) > 1000) {
        invalid_fields["description"] <- "Invalid length for `description`, must be smaller than or equal to 1000."
      }

      # check if the required `language` is null
      if (is.null(self$`language`)) {
        invalid_fields["language"] <- "Non-nullable required field `language` cannot be null."
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
# MoveDamageClassDescription$unlock()
#
## Below is an example to define the print function
# MoveDamageClassDescription$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# MoveDamageClassDescription$lock()

