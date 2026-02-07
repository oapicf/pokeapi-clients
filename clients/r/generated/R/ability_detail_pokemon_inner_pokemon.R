#' Create a new AbilityDetailPokemonInnerPokemon
#'
#' @description
#' AbilityDetailPokemonInnerPokemon Class
#'
#' @docType class
#' @title AbilityDetailPokemonInnerPokemon
#' @description AbilityDetailPokemonInnerPokemon Class
#' @format An \code{R6Class} generator object
#' @field name  character
#' @field url  character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AbilityDetailPokemonInnerPokemon <- R6::R6Class(
  "AbilityDetailPokemonInnerPokemon",
  public = list(
    `name` = NULL,
    `url` = NULL,

    #' @description
    #' Initialize a new AbilityDetailPokemonInnerPokemon class.
    #'
    #' @param name name
    #' @param url url
    #' @param ... Other optional arguments.
    initialize = function(`name`, `url`, ...) {
      if (!missing(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!missing(`url`)) {
        if (!(is.character(`url`) && length(`url`) == 1)) {
          stop(paste("Error! Invalid data for `url`. Must be a string:", `url`))
        }
        # to validate URL. ref: https://stackoverflow.com/questions/73952024/url-validation-in-r
        if (!stringr::str_detect(`url`, "(https?|ftp)://[^ /$.?#].[^\\s]*")) {
          stop(paste("Error! Invalid data for `url`. Must be a URL:", `url`))
        }
        self$`url` <- `url`
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
    #' @return AbilityDetailPokemonInnerPokemon as a base R list.
    #' @examples
    #' # convert array of AbilityDetailPokemonInnerPokemon (x) to a data frame
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
    #' Convert AbilityDetailPokemonInnerPokemon to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      AbilityDetailPokemonInnerPokemonObject <- list()
      if (!is.null(self$`name`)) {
        AbilityDetailPokemonInnerPokemonObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`url`)) {
        AbilityDetailPokemonInnerPokemonObject[["url"]] <-
          self$`url`
      }
      return(AbilityDetailPokemonInnerPokemonObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of AbilityDetailPokemonInnerPokemon
    #'
    #' @param input_json the JSON input
    #' @return the instance of AbilityDetailPokemonInnerPokemon
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`url`)) {
        # to validate URL. ref: https://stackoverflow.com/questions/73952024/url-validation-in-r
        if (!stringr::str_detect(this_object$`url`, "(https?|ftp)://[^ /$.?#].[^\\s]*")) {
          stop(paste("Error! Invalid data for `url`. Must be a URL:", this_object$`url`))
        }
        self$`url` <- this_object$`url`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return AbilityDetailPokemonInnerPokemon in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AbilityDetailPokemonInnerPokemon
    #'
    #' @param input_json the JSON input
    #' @return the instance of AbilityDetailPokemonInnerPokemon
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`name` <- this_object$`name`
      # to validate URL. ref: https://stackoverflow.com/questions/73952024/url-validation-in-r
      if (!stringr::str_detect(this_object$`url`, "(https?|ftp)://[^ /$.?#].[^\\s]*")) {
        stop(paste("Error! Invalid data for `url`. Must be a URL:", this_object$`url`))
      }
      self$`url` <- this_object$`url`
      self
    },

    #' @description
    #' Validate JSON input with respect to AbilityDetailPokemonInnerPokemon and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for AbilityDetailPokemonInnerPokemon: the required field `name` is missing."))
      }
      # check the required field `url`
      if (!is.null(input_json$`url`)) {
        if (!(is.character(input_json$`url`) && length(input_json$`url`) == 1)) {
          stop(paste("Error! Invalid data for `url`. Must be a string:", input_json$`url`))
        }
        # to validate URL. ref: https://stackoverflow.com/questions/73952024/url-validation-in-r
        if (!stringr::str_detect(input_json$`url`, "(https?|ftp)://[^ /$.?#].[^\\s]*")) {
          stop(paste("Error! Invalid data for `url`. Must be a URL:", input_json$`url`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AbilityDetailPokemonInnerPokemon: the required field `url` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AbilityDetailPokemonInnerPokemon
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

      # check if the required `url` is null
      if (is.null(self$`url`)) {
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

      # check if the required `url` is null
      if (is.null(self$`url`)) {
        invalid_fields["url"] <- "Non-nullable required field `url` cannot be null."
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
# AbilityDetailPokemonInnerPokemon$unlock()
#
## Below is an example to define the print function
# AbilityDetailPokemonInnerPokemon$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AbilityDetailPokemonInnerPokemon$lock()

