#' Create a new CharacteristicDetail
#'
#' @description
#' CharacteristicDetail Class
#'
#' @docType class
#' @title CharacteristicDetail
#' @description CharacteristicDetail Class
#' @format An \code{R6Class} generator object
#' @field id  integer
#' @field gene_modulo  integer
#' @field possible_values  list(integer)
#' @field highest_stat  \link{StatSummary}
#' @field descriptions  list(\link{CharacteristicDescription})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CharacteristicDetail <- R6::R6Class(
  "CharacteristicDetail",
  public = list(
    `id` = NULL,
    `gene_modulo` = NULL,
    `possible_values` = NULL,
    `highest_stat` = NULL,
    `descriptions` = NULL,

    #' @description
    #' Initialize a new CharacteristicDetail class.
    #'
    #' @param id id
    #' @param gene_modulo gene_modulo
    #' @param possible_values possible_values
    #' @param highest_stat highest_stat
    #' @param descriptions descriptions
    #' @param ... Other optional arguments.
    initialize = function(`id`, `gene_modulo`, `possible_values`, `highest_stat`, `descriptions`, ...) {
      if (!missing(`id`)) {
        if (!(is.numeric(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be an integer:", `id`))
        }
        self$`id` <- `id`
      }
      if (!missing(`gene_modulo`)) {
        if (!(is.numeric(`gene_modulo`) && length(`gene_modulo`) == 1)) {
          stop(paste("Error! Invalid data for `gene_modulo`. Must be an integer:", `gene_modulo`))
        }
        self$`gene_modulo` <- `gene_modulo`
      }
      if (!missing(`possible_values`)) {
        stopifnot(is.vector(`possible_values`), length(`possible_values`) != 0)
        sapply(`possible_values`, function(x) stopifnot(is.character(x)))
        self$`possible_values` <- `possible_values`
      }
      if (!missing(`highest_stat`)) {
        stopifnot(R6::is.R6(`highest_stat`))
        self$`highest_stat` <- `highest_stat`
      }
      if (!missing(`descriptions`)) {
        stopifnot(is.vector(`descriptions`), length(`descriptions`) != 0)
        sapply(`descriptions`, function(x) stopifnot(R6::is.R6(x)))
        self$`descriptions` <- `descriptions`
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
    #' @return CharacteristicDetail as a base R list.
    #' @examples
    #' # convert array of CharacteristicDetail (x) to a data frame
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
    #' Convert CharacteristicDetail to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CharacteristicDetailObject <- list()
      if (!is.null(self$`id`)) {
        CharacteristicDetailObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`gene_modulo`)) {
        CharacteristicDetailObject[["gene_modulo"]] <-
          self$`gene_modulo`
      }
      if (!is.null(self$`possible_values`)) {
        CharacteristicDetailObject[["possible_values"]] <-
          self$`possible_values`
      }
      if (!is.null(self$`highest_stat`)) {
        CharacteristicDetailObject[["highest_stat"]] <-
          self$`highest_stat`$toSimpleType()
      }
      if (!is.null(self$`descriptions`)) {
        CharacteristicDetailObject[["descriptions"]] <-
          lapply(self$`descriptions`, function(x) x$toSimpleType())
      }
      return(CharacteristicDetailObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of CharacteristicDetail
    #'
    #' @param input_json the JSON input
    #' @return the instance of CharacteristicDetail
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`gene_modulo`)) {
        self$`gene_modulo` <- this_object$`gene_modulo`
      }
      if (!is.null(this_object$`possible_values`)) {
        self$`possible_values` <- ApiClient$new()$deserializeObj(this_object$`possible_values`, "array[integer]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`highest_stat`)) {
        `highest_stat_object` <- StatSummary$new()
        `highest_stat_object`$fromJSON(jsonlite::toJSON(this_object$`highest_stat`, auto_unbox = TRUE, digits = NA))
        self$`highest_stat` <- `highest_stat_object`
      }
      if (!is.null(this_object$`descriptions`)) {
        self$`descriptions` <- ApiClient$new()$deserializeObj(this_object$`descriptions`, "array[CharacteristicDescription]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CharacteristicDetail in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CharacteristicDetail
    #'
    #' @param input_json the JSON input
    #' @return the instance of CharacteristicDetail
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`gene_modulo` <- this_object$`gene_modulo`
      self$`possible_values` <- ApiClient$new()$deserializeObj(this_object$`possible_values`, "array[integer]", loadNamespace("openapi"))
      self$`highest_stat` <- StatSummary$new()$fromJSON(jsonlite::toJSON(this_object$`highest_stat`, auto_unbox = TRUE, digits = NA))
      self$`descriptions` <- ApiClient$new()$deserializeObj(this_object$`descriptions`, "array[CharacteristicDescription]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to CharacteristicDetail and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for CharacteristicDetail: the required field `id` is missing."))
      }
      # check the required field `gene_modulo`
      if (!is.null(input_json$`gene_modulo`)) {
        if (!(is.numeric(input_json$`gene_modulo`) && length(input_json$`gene_modulo`) == 1)) {
          stop(paste("Error! Invalid data for `gene_modulo`. Must be an integer:", input_json$`gene_modulo`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CharacteristicDetail: the required field `gene_modulo` is missing."))
      }
      # check the required field `possible_values`
      if (!is.null(input_json$`possible_values`)) {
        stopifnot(is.vector(input_json$`possible_values`), length(input_json$`possible_values`) != 0)
        tmp <- sapply(input_json$`possible_values`, function(x) stopifnot(is.character(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CharacteristicDetail: the required field `possible_values` is missing."))
      }
      # check the required field `highest_stat`
      if (!is.null(input_json$`highest_stat`)) {
        stopifnot(R6::is.R6(input_json$`highest_stat`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CharacteristicDetail: the required field `highest_stat` is missing."))
      }
      # check the required field `descriptions`
      if (!is.null(input_json$`descriptions`)) {
        stopifnot(is.vector(input_json$`descriptions`), length(input_json$`descriptions`) != 0)
        tmp <- sapply(input_json$`descriptions`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CharacteristicDetail: the required field `descriptions` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CharacteristicDetail
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

      # check if the required `gene_modulo` is null
      if (is.null(self$`gene_modulo`)) {
        return(FALSE)
      }

      # check if the required `possible_values` is null
      if (is.null(self$`possible_values`)) {
        return(FALSE)
      }

      # check if the required `highest_stat` is null
      if (is.null(self$`highest_stat`)) {
        return(FALSE)
      }

      # check if the required `descriptions` is null
      if (is.null(self$`descriptions`)) {
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

      # check if the required `gene_modulo` is null
      if (is.null(self$`gene_modulo`)) {
        invalid_fields["gene_modulo"] <- "Non-nullable required field `gene_modulo` cannot be null."
      }

      # check if the required `possible_values` is null
      if (is.null(self$`possible_values`)) {
        invalid_fields["possible_values"] <- "Non-nullable required field `possible_values` cannot be null."
      }

      # check if the required `highest_stat` is null
      if (is.null(self$`highest_stat`)) {
        invalid_fields["highest_stat"] <- "Non-nullable required field `highest_stat` cannot be null."
      }

      # check if the required `descriptions` is null
      if (is.null(self$`descriptions`)) {
        invalid_fields["descriptions"] <- "Non-nullable required field `descriptions` cannot be null."
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
# CharacteristicDetail$unlock()
#
## Below is an example to define the print function
# CharacteristicDetail$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CharacteristicDetail$lock()

