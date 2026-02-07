#' Create a new ContestTypeName
#'
#' @description
#' ContestTypeName Class
#'
#' @docType class
#' @title ContestTypeName
#' @description ContestTypeName Class
#' @format An \code{R6Class} generator object
#' @field name  character
#' @field color  character
#' @field language  \link{LanguageSummary}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ContestTypeName <- R6::R6Class(
  "ContestTypeName",
  public = list(
    `name` = NULL,
    `color` = NULL,
    `language` = NULL,

    #' @description
    #' Initialize a new ContestTypeName class.
    #'
    #' @param name name
    #' @param color color
    #' @param language language
    #' @param ... Other optional arguments.
    initialize = function(`name`, `color`, `language`, ...) {
      if (!missing(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!missing(`color`)) {
        if (!(is.character(`color`) && length(`color`) == 1)) {
          stop(paste("Error! Invalid data for `color`. Must be a string:", `color`))
        }
        self$`color` <- `color`
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
    #' @return ContestTypeName as a base R list.
    #' @examples
    #' # convert array of ContestTypeName (x) to a data frame
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
    #' Convert ContestTypeName to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      ContestTypeNameObject <- list()
      if (!is.null(self$`name`)) {
        ContestTypeNameObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`color`)) {
        ContestTypeNameObject[["color"]] <-
          self$`color`
      }
      if (!is.null(self$`language`)) {
        ContestTypeNameObject[["language"]] <-
          self$`language`$toSimpleType()
      }
      return(ContestTypeNameObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of ContestTypeName
    #'
    #' @param input_json the JSON input
    #' @return the instance of ContestTypeName
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`color`)) {
        self$`color` <- this_object$`color`
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
    #' @return ContestTypeName in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of ContestTypeName
    #'
    #' @param input_json the JSON input
    #' @return the instance of ContestTypeName
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`name` <- this_object$`name`
      self$`color` <- this_object$`color`
      self$`language` <- LanguageSummary$new()$fromJSON(jsonlite::toJSON(this_object$`language`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to ContestTypeName and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `name`
      if (!is.null(input_json$`name`)) {
        if (!(is.character(input_json$`name`) && length(input_json$`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", input_json$`name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ContestTypeName: the required field `name` is missing."))
      }
      # check the required field `color`
      if (!is.null(input_json$`color`)) {
        if (!(is.character(input_json$`color`) && length(input_json$`color`) == 1)) {
          stop(paste("Error! Invalid data for `color`. Must be a string:", input_json$`color`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ContestTypeName: the required field `color` is missing."))
      }
      # check the required field `language`
      if (!is.null(input_json$`language`)) {
        stopifnot(R6::is.R6(input_json$`language`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ContestTypeName: the required field `language` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ContestTypeName
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `name` is null
      if (is.null(self$`name`)) {
        return(FALSE)
      }

      if (nchar(self$`name`) > 100) {
        return(FALSE)
      }

      # check if the required `color` is null
      if (is.null(self$`color`)) {
        return(FALSE)
      }

      if (nchar(self$`color`) > 10) {
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
      # check if the required `name` is null
      if (is.null(self$`name`)) {
        invalid_fields["name"] <- "Non-nullable required field `name` cannot be null."
      }

      if (nchar(self$`name`) > 100) {
        invalid_fields["name"] <- "Invalid length for `name`, must be smaller than or equal to 100."
      }

      # check if the required `color` is null
      if (is.null(self$`color`)) {
        invalid_fields["color"] <- "Non-nullable required field `color` cannot be null."
      }

      if (nchar(self$`color`) > 10) {
        invalid_fields["color"] <- "Invalid length for `color`, must be smaller than or equal to 10."
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
# ContestTypeName$unlock()
#
## Below is an example to define the print function
# ContestTypeName$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ContestTypeName$lock()

