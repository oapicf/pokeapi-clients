#' Create a new Experience
#'
#' @description
#' Experience Class
#'
#' @docType class
#' @title Experience
#' @description Experience Class
#' @format An \code{R6Class} generator object
#' @field level  integer
#' @field experience  integer
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
Experience <- R6::R6Class(
  "Experience",
  public = list(
    `level` = NULL,
    `experience` = NULL,

    #' @description
    #' Initialize a new Experience class.
    #'
    #' @param level level
    #' @param experience experience
    #' @param ... Other optional arguments.
    initialize = function(`level`, `experience`, ...) {
      if (!missing(`level`)) {
        if (!(is.numeric(`level`) && length(`level`) == 1)) {
          stop(paste("Error! Invalid data for `level`. Must be an integer:", `level`))
        }
        self$`level` <- `level`
      }
      if (!missing(`experience`)) {
        if (!(is.numeric(`experience`) && length(`experience`) == 1)) {
          stop(paste("Error! Invalid data for `experience`. Must be an integer:", `experience`))
        }
        self$`experience` <- `experience`
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
    #' @return Experience as a base R list.
    #' @examples
    #' # convert array of Experience (x) to a data frame
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
    #' Convert Experience to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      ExperienceObject <- list()
      if (!is.null(self$`level`)) {
        ExperienceObject[["level"]] <-
          self$`level`
      }
      if (!is.null(self$`experience`)) {
        ExperienceObject[["experience"]] <-
          self$`experience`
      }
      return(ExperienceObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of Experience
    #'
    #' @param input_json the JSON input
    #' @return the instance of Experience
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`level`)) {
        self$`level` <- this_object$`level`
      }
      if (!is.null(this_object$`experience`)) {
        self$`experience` <- this_object$`experience`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return Experience in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of Experience
    #'
    #' @param input_json the JSON input
    #' @return the instance of Experience
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`level` <- this_object$`level`
      self$`experience` <- this_object$`experience`
      self
    },

    #' @description
    #' Validate JSON input with respect to Experience and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `level`
      if (!is.null(input_json$`level`)) {
        if (!(is.numeric(input_json$`level`) && length(input_json$`level`) == 1)) {
          stop(paste("Error! Invalid data for `level`. Must be an integer:", input_json$`level`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Experience: the required field `level` is missing."))
      }
      # check the required field `experience`
      if (!is.null(input_json$`experience`)) {
        if (!(is.numeric(input_json$`experience`) && length(input_json$`experience`) == 1)) {
          stop(paste("Error! Invalid data for `experience`. Must be an integer:", input_json$`experience`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Experience: the required field `experience` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of Experience
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `level` is null
      if (is.null(self$`level`)) {
        return(FALSE)
      }

      # check if the required `experience` is null
      if (is.null(self$`experience`)) {
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
      # check if the required `level` is null
      if (is.null(self$`level`)) {
        invalid_fields["level"] <- "Non-nullable required field `level` cannot be null."
      }

      # check if the required `experience` is null
      if (is.null(self$`experience`)) {
        invalid_fields["experience"] <- "Non-nullable required field `experience` cannot be null."
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
# Experience$unlock()
#
## Below is an example to define the print function
# Experience$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# Experience$lock()

