#' Create a new AbilityFlavorText
#'
#' @description
#' AbilityFlavorText Class
#'
#' @docType class
#' @title AbilityFlavorText
#' @description AbilityFlavorText Class
#' @format An \code{R6Class} generator object
#' @field flavor_text  character
#' @field language  \link{LanguageSummary}
#' @field version_group  \link{VersionGroupSummary}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AbilityFlavorText <- R6::R6Class(
  "AbilityFlavorText",
  public = list(
    `flavor_text` = NULL,
    `language` = NULL,
    `version_group` = NULL,

    #' @description
    #' Initialize a new AbilityFlavorText class.
    #'
    #' @param flavor_text flavor_text
    #' @param language language
    #' @param version_group version_group
    #' @param ... Other optional arguments.
    initialize = function(`flavor_text`, `language`, `version_group`, ...) {
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
    #' @return AbilityFlavorText as a base R list.
    #' @examples
    #' # convert array of AbilityFlavorText (x) to a data frame
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
    #' Convert AbilityFlavorText to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      AbilityFlavorTextObject <- list()
      if (!is.null(self$`flavor_text`)) {
        AbilityFlavorTextObject[["flavor_text"]] <-
          self$`flavor_text`
      }
      if (!is.null(self$`language`)) {
        AbilityFlavorTextObject[["language"]] <-
          self$`language`$toSimpleType()
      }
      if (!is.null(self$`version_group`)) {
        AbilityFlavorTextObject[["version_group"]] <-
          self$`version_group`$toSimpleType()
      }
      return(AbilityFlavorTextObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of AbilityFlavorText
    #'
    #' @param input_json the JSON input
    #' @return the instance of AbilityFlavorText
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
    #' @return AbilityFlavorText in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AbilityFlavorText
    #'
    #' @param input_json the JSON input
    #' @return the instance of AbilityFlavorText
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`flavor_text` <- this_object$`flavor_text`
      self$`language` <- LanguageSummary$new()$fromJSON(jsonlite::toJSON(this_object$`language`, auto_unbox = TRUE, digits = NA))
      self$`version_group` <- VersionGroupSummary$new()$fromJSON(jsonlite::toJSON(this_object$`version_group`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to AbilityFlavorText and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for AbilityFlavorText: the required field `flavor_text` is missing."))
      }
      # check the required field `language`
      if (!is.null(input_json$`language`)) {
        stopifnot(R6::is.R6(input_json$`language`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AbilityFlavorText: the required field `language` is missing."))
      }
      # check the required field `version_group`
      if (!is.null(input_json$`version_group`)) {
        stopifnot(R6::is.R6(input_json$`version_group`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AbilityFlavorText: the required field `version_group` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AbilityFlavorText
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

      # check if the required `language` is null
      if (is.null(self$`language`)) {
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
      # check if the required `flavor_text` is null
      if (is.null(self$`flavor_text`)) {
        invalid_fields["flavor_text"] <- "Non-nullable required field `flavor_text` cannot be null."
      }

      # check if the required `language` is null
      if (is.null(self$`language`)) {
        invalid_fields["language"] <- "Non-nullable required field `language` cannot be null."
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
# AbilityFlavorText$unlock()
#
## Below is an example to define the print function
# AbilityFlavorText$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AbilityFlavorText$lock()

