#' Create a new EncounterConditionValueDetail
#'
#' @description
#' EncounterConditionValueDetail Class
#'
#' @docType class
#' @title EncounterConditionValueDetail
#' @description EncounterConditionValueDetail Class
#' @format An \code{R6Class} generator object
#' @field id  integer
#' @field name  character
#' @field condition  \link{EncounterConditionSummary}
#' @field names  list(\link{EncounterConditionValueName})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
EncounterConditionValueDetail <- R6::R6Class(
  "EncounterConditionValueDetail",
  public = list(
    `id` = NULL,
    `name` = NULL,
    `condition` = NULL,
    `names` = NULL,

    #' @description
    #' Initialize a new EncounterConditionValueDetail class.
    #'
    #' @param id id
    #' @param name name
    #' @param condition condition
    #' @param names names
    #' @param ... Other optional arguments.
    initialize = function(`id`, `name`, `condition`, `names`, ...) {
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
      if (!missing(`condition`)) {
        stopifnot(R6::is.R6(`condition`))
        self$`condition` <- `condition`
      }
      if (!missing(`names`)) {
        stopifnot(is.vector(`names`), length(`names`) != 0)
        sapply(`names`, function(x) stopifnot(R6::is.R6(x)))
        self$`names` <- `names`
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
    #' @return EncounterConditionValueDetail as a base R list.
    #' @examples
    #' # convert array of EncounterConditionValueDetail (x) to a data frame
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
    #' Convert EncounterConditionValueDetail to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      EncounterConditionValueDetailObject <- list()
      if (!is.null(self$`id`)) {
        EncounterConditionValueDetailObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`name`)) {
        EncounterConditionValueDetailObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`condition`)) {
        EncounterConditionValueDetailObject[["condition"]] <-
          self$`condition`$toSimpleType()
      }
      if (!is.null(self$`names`)) {
        EncounterConditionValueDetailObject[["names"]] <-
          lapply(self$`names`, function(x) x$toSimpleType())
      }
      return(EncounterConditionValueDetailObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of EncounterConditionValueDetail
    #'
    #' @param input_json the JSON input
    #' @return the instance of EncounterConditionValueDetail
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`condition`)) {
        `condition_object` <- EncounterConditionSummary$new()
        `condition_object`$fromJSON(jsonlite::toJSON(this_object$`condition`, auto_unbox = TRUE, digits = NA))
        self$`condition` <- `condition_object`
      }
      if (!is.null(this_object$`names`)) {
        self$`names` <- ApiClient$new()$deserializeObj(this_object$`names`, "array[EncounterConditionValueName]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return EncounterConditionValueDetail in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of EncounterConditionValueDetail
    #'
    #' @param input_json the JSON input
    #' @return the instance of EncounterConditionValueDetail
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`name` <- this_object$`name`
      self$`condition` <- EncounterConditionSummary$new()$fromJSON(jsonlite::toJSON(this_object$`condition`, auto_unbox = TRUE, digits = NA))
      self$`names` <- ApiClient$new()$deserializeObj(this_object$`names`, "array[EncounterConditionValueName]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to EncounterConditionValueDetail and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for EncounterConditionValueDetail: the required field `id` is missing."))
      }
      # check the required field `name`
      if (!is.null(input_json$`name`)) {
        if (!(is.character(input_json$`name`) && length(input_json$`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", input_json$`name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for EncounterConditionValueDetail: the required field `name` is missing."))
      }
      # check the required field `condition`
      if (!is.null(input_json$`condition`)) {
        stopifnot(R6::is.R6(input_json$`condition`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for EncounterConditionValueDetail: the required field `condition` is missing."))
      }
      # check the required field `names`
      if (!is.null(input_json$`names`)) {
        stopifnot(is.vector(input_json$`names`), length(input_json$`names`) != 0)
        tmp <- sapply(input_json$`names`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for EncounterConditionValueDetail: the required field `names` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of EncounterConditionValueDetail
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

      # check if the required `condition` is null
      if (is.null(self$`condition`)) {
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

      # check if the required `condition` is null
      if (is.null(self$`condition`)) {
        invalid_fields["condition"] <- "Non-nullable required field `condition` cannot be null."
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
# EncounterConditionValueDetail$unlock()
#
## Below is an example to define the print function
# EncounterConditionValueDetail$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# EncounterConditionValueDetail$lock()

