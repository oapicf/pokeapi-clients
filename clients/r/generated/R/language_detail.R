#' Create a new LanguageDetail
#'
#' @description
#' LanguageDetail Class
#'
#' @docType class
#' @title LanguageDetail
#' @description LanguageDetail Class
#' @format An \code{R6Class} generator object
#' @field id  integer
#' @field name  character
#' @field official  character [optional]
#' @field iso639  character
#' @field iso3166  character
#' @field names  list(\link{LanguageName})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
LanguageDetail <- R6::R6Class(
  "LanguageDetail",
  public = list(
    `id` = NULL,
    `name` = NULL,
    `official` = NULL,
    `iso639` = NULL,
    `iso3166` = NULL,
    `names` = NULL,

    #' @description
    #' Initialize a new LanguageDetail class.
    #'
    #' @param id id
    #' @param name name
    #' @param iso639 iso639
    #' @param iso3166 iso3166
    #' @param names names
    #' @param official official
    #' @param ... Other optional arguments.
    initialize = function(`id`, `name`, `iso639`, `iso3166`, `names`, `official` = NULL, ...) {
      if (!missing(`id`)) {
        if (!(is.numeric(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be an integer:", `id`))
        }
        self$`id` <- `id`
      }
      if (!missing(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!missing(`iso639`)) {
        if (!(is.character(`iso639`) && length(`iso639`) == 1)) {
          stop(paste("Error! Invalid data for `iso639`. Must be a string:", `iso639`))
        }
        self$`iso639` <- `iso639`
      }
      if (!missing(`iso3166`)) {
        if (!(is.character(`iso3166`) && length(`iso3166`) == 1)) {
          stop(paste("Error! Invalid data for `iso3166`. Must be a string:", `iso3166`))
        }
        self$`iso3166` <- `iso3166`
      }
      if (!missing(`names`)) {
        stopifnot(is.vector(`names`), length(`names`) != 0)
        sapply(`names`, function(x) stopifnot(R6::is.R6(x)))
        self$`names` <- `names`
      }
      if (!is.null(`official`)) {
        if (!(is.logical(`official`) && length(`official`) == 1)) {
          stop(paste("Error! Invalid data for `official`. Must be a boolean:", `official`))
        }
        self$`official` <- `official`
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
    #' @return LanguageDetail as a base R list.
    #' @examples
    #' # convert array of LanguageDetail (x) to a data frame
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
    #' Convert LanguageDetail to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      LanguageDetailObject <- list()
      if (!is.null(self$`id`)) {
        LanguageDetailObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`name`)) {
        LanguageDetailObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`official`)) {
        LanguageDetailObject[["official"]] <-
          self$`official`
      }
      if (!is.null(self$`iso639`)) {
        LanguageDetailObject[["iso639"]] <-
          self$`iso639`
      }
      if (!is.null(self$`iso3166`)) {
        LanguageDetailObject[["iso3166"]] <-
          self$`iso3166`
      }
      if (!is.null(self$`names`)) {
        LanguageDetailObject[["names"]] <-
          lapply(self$`names`, function(x) x$toSimpleType())
      }
      return(LanguageDetailObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of LanguageDetail
    #'
    #' @param input_json the JSON input
    #' @return the instance of LanguageDetail
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`official`)) {
        self$`official` <- this_object$`official`
      }
      if (!is.null(this_object$`iso639`)) {
        self$`iso639` <- this_object$`iso639`
      }
      if (!is.null(this_object$`iso3166`)) {
        self$`iso3166` <- this_object$`iso3166`
      }
      if (!is.null(this_object$`names`)) {
        self$`names` <- ApiClient$new()$deserializeObj(this_object$`names`, "array[LanguageName]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return LanguageDetail in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of LanguageDetail
    #'
    #' @param input_json the JSON input
    #' @return the instance of LanguageDetail
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`name` <- this_object$`name`
      self$`official` <- this_object$`official`
      self$`iso639` <- this_object$`iso639`
      self$`iso3166` <- this_object$`iso3166`
      self$`names` <- ApiClient$new()$deserializeObj(this_object$`names`, "array[LanguageName]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to LanguageDetail and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `id`
      if (!is.null(input_json$`id`)) {
        if (!(is.numeric(input_json$`id`) && length(input_json$`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be an integer:", input_json$`id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for LanguageDetail: the required field `id` is missing."))
      }
      # check the required field `name`
      if (!is.null(input_json$`name`)) {
        if (!(is.character(input_json$`name`) && length(input_json$`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", input_json$`name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for LanguageDetail: the required field `name` is missing."))
      }
      # check the required field `iso639`
      if (!is.null(input_json$`iso639`)) {
        if (!(is.character(input_json$`iso639`) && length(input_json$`iso639`) == 1)) {
          stop(paste("Error! Invalid data for `iso639`. Must be a string:", input_json$`iso639`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for LanguageDetail: the required field `iso639` is missing."))
      }
      # check the required field `iso3166`
      if (!is.null(input_json$`iso3166`)) {
        if (!(is.character(input_json$`iso3166`) && length(input_json$`iso3166`) == 1)) {
          stop(paste("Error! Invalid data for `iso3166`. Must be a string:", input_json$`iso3166`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for LanguageDetail: the required field `iso3166` is missing."))
      }
      # check the required field `names`
      if (!is.null(input_json$`names`)) {
        stopifnot(is.vector(input_json$`names`), length(input_json$`names`) != 0)
        tmp <- sapply(input_json$`names`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for LanguageDetail: the required field `names` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of LanguageDetail
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `id` is null
      if (is.null(self$`id`)) {
        return(FALSE)
      }

      # check if the required `name` is null
      if (is.null(self$`name`)) {
        return(FALSE)
      }

      if (nchar(self$`name`) > 100) {
        return(FALSE)
      }

      # check if the required `iso639` is null
      if (is.null(self$`iso639`)) {
        return(FALSE)
      }

      if (nchar(self$`iso639`) > 10) {
        return(FALSE)
      }

      # check if the required `iso3166` is null
      if (is.null(self$`iso3166`)) {
        return(FALSE)
      }

      if (nchar(self$`iso3166`) > 2) {
        return(FALSE)
      }

      # check if the required `names` is null
      if (is.null(self$`names`)) {
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
      # check if the required `id` is null
      if (is.null(self$`id`)) {
        invalid_fields["id"] <- "Non-nullable required field `id` cannot be null."
      }

      # check if the required `name` is null
      if (is.null(self$`name`)) {
        invalid_fields["name"] <- "Non-nullable required field `name` cannot be null."
      }

      if (nchar(self$`name`) > 100) {
        invalid_fields["name"] <- "Invalid length for `name`, must be smaller than or equal to 100."
      }

      # check if the required `iso639` is null
      if (is.null(self$`iso639`)) {
        invalid_fields["iso639"] <- "Non-nullable required field `iso639` cannot be null."
      }

      if (nchar(self$`iso639`) > 10) {
        invalid_fields["iso639"] <- "Invalid length for `iso639`, must be smaller than or equal to 10."
      }

      # check if the required `iso3166` is null
      if (is.null(self$`iso3166`)) {
        invalid_fields["iso3166"] <- "Non-nullable required field `iso3166` cannot be null."
      }

      if (nchar(self$`iso3166`) > 2) {
        invalid_fields["iso3166"] <- "Invalid length for `iso3166`, must be smaller than or equal to 2."
      }

      # check if the required `names` is null
      if (is.null(self$`names`)) {
        invalid_fields["names"] <- "Non-nullable required field `names` cannot be null."
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
# LanguageDetail$unlock()
#
## Below is an example to define the print function
# LanguageDetail$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# LanguageDetail$lock()

