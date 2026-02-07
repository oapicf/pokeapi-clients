#' Create a new SuperContestEffectFlavorText
#'
#' @description
#' SuperContestEffectFlavorText Class
#'
#' @docType class
#' @title SuperContestEffectFlavorText
#' @description SuperContestEffectFlavorText Class
#' @format An \code{R6Class} generator object
#' @field flavor_text  character
#' @field language  \link{LanguageSummary}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
SuperContestEffectFlavorText <- R6::R6Class(
  "SuperContestEffectFlavorText",
  public = list(
    `flavor_text` = NULL,
    `language` = NULL,

    #' @description
    #' Initialize a new SuperContestEffectFlavorText class.
    #'
    #' @param flavor_text flavor_text
    #' @param language language
    #' @param ... Other optional arguments.
    initialize = function(`flavor_text`, `language`, ...) {
      if (!missing(`flavor_text`)) {
        if (!(is.character(`flavor_text`) && length(`flavor_text`) == 1)) {
          stop(paste("Error! Invalid data for `flavor_text`. Must be a string:", `flavor_text`))
        }
        self$`flavor_text` <- `flavor_text`
      }
      if (!missing(`language`)) {
        stopifnot(R6::is.R6(`language`))
        self$`language` <- `language`
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
    #' @return SuperContestEffectFlavorText as a base R list.
    #' @examples
    #' # convert array of SuperContestEffectFlavorText (x) to a data frame
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
    #' Convert SuperContestEffectFlavorText to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      SuperContestEffectFlavorTextObject <- list()
      if (!is.null(self$`flavor_text`)) {
        SuperContestEffectFlavorTextObject[["flavor_text"]] <-
          self$`flavor_text`
      }
      if (!is.null(self$`language`)) {
        SuperContestEffectFlavorTextObject[["language"]] <-
          self$`language`$toSimpleType()
      }
      return(SuperContestEffectFlavorTextObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of SuperContestEffectFlavorText
    #'
    #' @param input_json the JSON input
    #' @return the instance of SuperContestEffectFlavorText
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`flavor_text`)) {
        self$`flavor_text` <- this_object$`flavor_text`
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
    #' @return SuperContestEffectFlavorText in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of SuperContestEffectFlavorText
    #'
    #' @param input_json the JSON input
    #' @return the instance of SuperContestEffectFlavorText
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`flavor_text` <- this_object$`flavor_text`
      self$`language` <- LanguageSummary$new()$fromJSON(jsonlite::toJSON(this_object$`language`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to SuperContestEffectFlavorText and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `flavor_text`
      if (!is.null(input_json$`flavor_text`)) {
        if (!(is.character(input_json$`flavor_text`) && length(input_json$`flavor_text`) == 1)) {
          stop(paste("Error! Invalid data for `flavor_text`. Must be a string:", input_json$`flavor_text`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for SuperContestEffectFlavorText: the required field `flavor_text` is missing."))
      }
      # check the required field `language`
      if (!is.null(input_json$`language`)) {
        stopifnot(R6::is.R6(input_json$`language`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for SuperContestEffectFlavorText: the required field `language` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of SuperContestEffectFlavorText
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `flavor_text` is null
      if (is.null(self$`flavor_text`)) {
        return(FALSE)
      }

      if (nchar(self$`flavor_text`) > 500) {
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
      # check if the required `flavor_text` is null
      if (is.null(self$`flavor_text`)) {
        invalid_fields["flavor_text"] <- "Non-nullable required field `flavor_text` cannot be null."
      }

      if (nchar(self$`flavor_text`) > 500) {
        invalid_fields["flavor_text"] <- "Invalid length for `flavor_text`, must be smaller than or equal to 500."
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
# SuperContestEffectFlavorText$unlock()
#
## Below is an example to define the print function
# SuperContestEffectFlavorText$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# SuperContestEffectFlavorText$lock()

