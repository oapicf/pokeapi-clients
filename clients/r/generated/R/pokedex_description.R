#' Create a new PokedexDescription
#'
#' @description
#' PokedexDescription Class
#'
#' @docType class
#' @title PokedexDescription
#' @description PokedexDescription Class
#' @format An \code{R6Class} generator object
#' @field description  character [optional]
#' @field language  \link{LanguageSummary}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PokedexDescription <- R6::R6Class(
  "PokedexDescription",
  public = list(
    `description` = NULL,
    `language` = NULL,

    #' @description
    #' Initialize a new PokedexDescription class.
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
    #' @return PokedexDescription as a base R list.
    #' @examples
    #' # convert array of PokedexDescription (x) to a data frame
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
    #' Convert PokedexDescription to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      PokedexDescriptionObject <- list()
      if (!is.null(self$`description`)) {
        PokedexDescriptionObject[["description"]] <-
          self$`description`
      }
      if (!is.null(self$`language`)) {
        PokedexDescriptionObject[["language"]] <-
          self$`language`$toSimpleType()
      }
      return(PokedexDescriptionObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of PokedexDescription
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokedexDescription
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
    #' @return PokedexDescription in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of PokedexDescription
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokedexDescription
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`description` <- this_object$`description`
      self$`language` <- LanguageSummary$new()$fromJSON(jsonlite::toJSON(this_object$`language`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to PokedexDescription and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `language`
      if (!is.null(input_json$`language`)) {
        stopifnot(R6::is.R6(input_json$`language`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokedexDescription: the required field `language` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PokedexDescription
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
# PokedexDescription$unlock()
#
## Below is an example to define the print function
# PokedexDescription$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PokedexDescription$lock()

