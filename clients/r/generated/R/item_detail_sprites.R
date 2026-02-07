#' Create a new ItemDetailSprites
#'
#' @description
#' ItemDetailSprites Class
#'
#' @docType class
#' @title ItemDetailSprites
#' @description ItemDetailSprites Class
#' @format An \code{R6Class} generator object
#' @field default  character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ItemDetailSprites <- R6::R6Class(
  "ItemDetailSprites",
  public = list(
    `default` = NULL,

    #' @description
    #' Initialize a new ItemDetailSprites class.
    #'
    #' @param default default
    #' @param ... Other optional arguments.
    initialize = function(`default`, ...) {
      if (!missing(`default`)) {
        if (!(is.character(`default`) && length(`default`) == 1)) {
          stop(paste("Error! Invalid data for `default`. Must be a string:", `default`))
        }
        # to validate URL. ref: https://stackoverflow.com/questions/73952024/url-validation-in-r
        if (!stringr::str_detect(`default`, "(https?|ftp)://[^ /$.?#].[^\\s]*")) {
          stop(paste("Error! Invalid data for `default`. Must be a URL:", `default`))
        }
        self$`default` <- `default`
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
    #' @return ItemDetailSprites as a base R list.
    #' @examples
    #' # convert array of ItemDetailSprites (x) to a data frame
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
    #' Convert ItemDetailSprites to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      ItemDetailSpritesObject <- list()
      if (!is.null(self$`default`)) {
        ItemDetailSpritesObject[["default"]] <-
          self$`default`
      }
      return(ItemDetailSpritesObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of ItemDetailSprites
    #'
    #' @param input_json the JSON input
    #' @return the instance of ItemDetailSprites
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`default`)) {
        # to validate URL. ref: https://stackoverflow.com/questions/73952024/url-validation-in-r
        if (!stringr::str_detect(this_object$`default`, "(https?|ftp)://[^ /$.?#].[^\\s]*")) {
          stop(paste("Error! Invalid data for `default`. Must be a URL:", this_object$`default`))
        }
        self$`default` <- this_object$`default`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return ItemDetailSprites in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of ItemDetailSprites
    #'
    #' @param input_json the JSON input
    #' @return the instance of ItemDetailSprites
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      # to validate URL. ref: https://stackoverflow.com/questions/73952024/url-validation-in-r
      if (!stringr::str_detect(this_object$`default`, "(https?|ftp)://[^ /$.?#].[^\\s]*")) {
        stop(paste("Error! Invalid data for `default`. Must be a URL:", this_object$`default`))
      }
      self$`default` <- this_object$`default`
      self
    },

    #' @description
    #' Validate JSON input with respect to ItemDetailSprites and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `default`
      if (!is.null(input_json$`default`)) {
        if (!(is.character(input_json$`default`) && length(input_json$`default`) == 1)) {
          stop(paste("Error! Invalid data for `default`. Must be a string:", input_json$`default`))
        }
        # to validate URL. ref: https://stackoverflow.com/questions/73952024/url-validation-in-r
        if (!stringr::str_detect(input_json$`default`, "(https?|ftp)://[^ /$.?#].[^\\s]*")) {
          stop(paste("Error! Invalid data for `default`. Must be a URL:", input_json$`default`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ItemDetailSprites: the required field `default` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ItemDetailSprites
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `default` is null
      if (is.null(self$`default`)) {
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
      # check if the required `default` is null
      if (is.null(self$`default`)) {
        invalid_fields["default"] <- "Non-nullable required field `default` cannot be null."
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
# ItemDetailSprites$unlock()
#
## Below is an example to define the print function
# ItemDetailSprites$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ItemDetailSprites$lock()

