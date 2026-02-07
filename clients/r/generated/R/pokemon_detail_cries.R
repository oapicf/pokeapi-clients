#' Create a new PokemonDetailCries
#'
#' @description
#' PokemonDetailCries Class
#'
#' @docType class
#' @title PokemonDetailCries
#' @description PokemonDetailCries Class
#' @format An \code{R6Class} generator object
#' @field latest  character
#' @field legacy  character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PokemonDetailCries <- R6::R6Class(
  "PokemonDetailCries",
  public = list(
    `latest` = NULL,
    `legacy` = NULL,

    #' @description
    #' Initialize a new PokemonDetailCries class.
    #'
    #' @param latest latest
    #' @param legacy legacy
    #' @param ... Other optional arguments.
    initialize = function(`latest`, `legacy`, ...) {
      if (!missing(`latest`)) {
        if (!(is.character(`latest`) && length(`latest`) == 1)) {
          stop(paste("Error! Invalid data for `latest`. Must be a string:", `latest`))
        }
        # to validate URL. ref: https://stackoverflow.com/questions/73952024/url-validation-in-r
        if (!stringr::str_detect(`latest`, "(https?|ftp)://[^ /$.?#].[^\\s]*")) {
          stop(paste("Error! Invalid data for `latest`. Must be a URL:", `latest`))
        }
        self$`latest` <- `latest`
      }
      if (!missing(`legacy`)) {
        if (!(is.character(`legacy`) && length(`legacy`) == 1)) {
          stop(paste("Error! Invalid data for `legacy`. Must be a string:", `legacy`))
        }
        # to validate URL. ref: https://stackoverflow.com/questions/73952024/url-validation-in-r
        if (!stringr::str_detect(`legacy`, "(https?|ftp)://[^ /$.?#].[^\\s]*")) {
          stop(paste("Error! Invalid data for `legacy`. Must be a URL:", `legacy`))
        }
        self$`legacy` <- `legacy`
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
    #' @return PokemonDetailCries as a base R list.
    #' @examples
    #' # convert array of PokemonDetailCries (x) to a data frame
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
    #' Convert PokemonDetailCries to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      PokemonDetailCriesObject <- list()
      if (!is.null(self$`latest`)) {
        PokemonDetailCriesObject[["latest"]] <-
          self$`latest`
      }
      if (!is.null(self$`legacy`)) {
        PokemonDetailCriesObject[["legacy"]] <-
          self$`legacy`
      }
      return(PokemonDetailCriesObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of PokemonDetailCries
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokemonDetailCries
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`latest`)) {
        # to validate URL. ref: https://stackoverflow.com/questions/73952024/url-validation-in-r
        if (!stringr::str_detect(this_object$`latest`, "(https?|ftp)://[^ /$.?#].[^\\s]*")) {
          stop(paste("Error! Invalid data for `latest`. Must be a URL:", this_object$`latest`))
        }
        self$`latest` <- this_object$`latest`
      }
      if (!is.null(this_object$`legacy`)) {
        # to validate URL. ref: https://stackoverflow.com/questions/73952024/url-validation-in-r
        if (!stringr::str_detect(this_object$`legacy`, "(https?|ftp)://[^ /$.?#].[^\\s]*")) {
          stop(paste("Error! Invalid data for `legacy`. Must be a URL:", this_object$`legacy`))
        }
        self$`legacy` <- this_object$`legacy`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return PokemonDetailCries in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of PokemonDetailCries
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokemonDetailCries
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      # to validate URL. ref: https://stackoverflow.com/questions/73952024/url-validation-in-r
      if (!stringr::str_detect(this_object$`latest`, "(https?|ftp)://[^ /$.?#].[^\\s]*")) {
        stop(paste("Error! Invalid data for `latest`. Must be a URL:", this_object$`latest`))
      }
      self$`latest` <- this_object$`latest`
      # to validate URL. ref: https://stackoverflow.com/questions/73952024/url-validation-in-r
      if (!stringr::str_detect(this_object$`legacy`, "(https?|ftp)://[^ /$.?#].[^\\s]*")) {
        stop(paste("Error! Invalid data for `legacy`. Must be a URL:", this_object$`legacy`))
      }
      self$`legacy` <- this_object$`legacy`
      self
    },

    #' @description
    #' Validate JSON input with respect to PokemonDetailCries and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `latest`
      if (!is.null(input_json$`latest`)) {
        if (!(is.character(input_json$`latest`) && length(input_json$`latest`) == 1)) {
          stop(paste("Error! Invalid data for `latest`. Must be a string:", input_json$`latest`))
        }
        # to validate URL. ref: https://stackoverflow.com/questions/73952024/url-validation-in-r
        if (!stringr::str_detect(input_json$`latest`, "(https?|ftp)://[^ /$.?#].[^\\s]*")) {
          stop(paste("Error! Invalid data for `latest`. Must be a URL:", input_json$`latest`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonDetailCries: the required field `latest` is missing."))
      }
      # check the required field `legacy`
      if (!is.null(input_json$`legacy`)) {
        if (!(is.character(input_json$`legacy`) && length(input_json$`legacy`) == 1)) {
          stop(paste("Error! Invalid data for `legacy`. Must be a string:", input_json$`legacy`))
        }
        # to validate URL. ref: https://stackoverflow.com/questions/73952024/url-validation-in-r
        if (!stringr::str_detect(input_json$`legacy`, "(https?|ftp)://[^ /$.?#].[^\\s]*")) {
          stop(paste("Error! Invalid data for `legacy`. Must be a URL:", input_json$`legacy`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonDetailCries: the required field `legacy` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PokemonDetailCries
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `latest` is null
      if (is.null(self$`latest`)) {
        return(FALSE)
      }

      # check if the required `legacy` is null
      if (is.null(self$`legacy`)) {
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
      # check if the required `latest` is null
      if (is.null(self$`latest`)) {
        invalid_fields["latest"] <- "Non-nullable required field `latest` cannot be null."
      }

      # check if the required `legacy` is null
      if (is.null(self$`legacy`)) {
        invalid_fields["legacy"] <- "Non-nullable required field `legacy` cannot be null."
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
# PokemonDetailCries$unlock()
#
## Below is an example to define the print function
# PokemonDetailCries$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PokemonDetailCries$lock()

