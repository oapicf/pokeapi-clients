#' Create a new EvolutionVariableDetail
#'
#' @description
#' EvolutionVariableDetail Class
#'
#' @docType class
#' @title EvolutionVariableDetail
#' @description EvolutionVariableDetail Class
#' @format An \code{R6Class} generator object
#' @field id The identifier for this resource. integer
#' @field name The name for this resource. character
#' @field symbol The symbol used for this variable in evolution condition expressions. character
#' @field data_type The data type of this variable. character [optional]
#' @field source The source of the variable value. character [optional]
#' @field version_group The version group in which this variable was introduced. \link{VersionGroupSummary}
#' @field names The name of this resource listed in different languages. list(\link{EvolutionVariableName})
#' @field descriptions The description of this resource listed in different languages. list(\link{EvolutionVariableDescription})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
EvolutionVariableDetail <- R6::R6Class(
  "EvolutionVariableDetail",
  public = list(
    `id` = NULL,
    `name` = NULL,
    `symbol` = NULL,
    `data_type` = NULL,
    `source` = NULL,
    `version_group` = NULL,
    `names` = NULL,
    `descriptions` = NULL,

    #' @description
    #' Initialize a new EvolutionVariableDetail class.
    #'
    #' @param id The identifier for this resource.
    #' @param name The name for this resource.
    #' @param symbol The symbol used for this variable in evolution condition expressions.
    #' @param version_group The version group in which this variable was introduced.
    #' @param names The name of this resource listed in different languages.
    #' @param descriptions The description of this resource listed in different languages.
    #' @param data_type The data type of this variable.
    #' @param source The source of the variable value.
    #' @param ... Other optional arguments.
    initialize = function(`id`, `name`, `symbol`, `version_group`, `names`, `descriptions`, `data_type` = NULL, `source` = NULL, ...) {
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
      if (!missing(`symbol`)) {
        if (!(is.character(`symbol`) && length(`symbol`) == 1)) {
          stop(paste("Error! Invalid data for `symbol`. Must be a string:", `symbol`))
        }
        self$`symbol` <- `symbol`
      }
      if (!missing(`version_group`)) {
        stopifnot(R6::is.R6(`version_group`))
        self$`version_group` <- `version_group`
      }
      if (!missing(`names`)) {
        stopifnot(is.vector(`names`), length(`names`) != 0)
        sapply(`names`, function(x) stopifnot(R6::is.R6(x)))
        self$`names` <- `names`
      }
      if (!missing(`descriptions`)) {
        stopifnot(is.vector(`descriptions`), length(`descriptions`) != 0)
        sapply(`descriptions`, function(x) stopifnot(R6::is.R6(x)))
        self$`descriptions` <- `descriptions`
      }
      if (!is.null(`data_type`)) {
        if (!(is.character(`data_type`) && length(`data_type`) == 1)) {
          stop(paste("Error! Invalid data for `data_type`. Must be a string:", `data_type`))
        }
        self$`data_type` <- `data_type`
      }
      if (!is.null(`source`)) {
        if (!(is.character(`source`) && length(`source`) == 1)) {
          stop(paste("Error! Invalid data for `source`. Must be a string:", `source`))
        }
        self$`source` <- `source`
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
    #' @return EvolutionVariableDetail as a base R list.
    #' @examples
    #' # convert array of EvolutionVariableDetail (x) to a data frame
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
    #' Convert EvolutionVariableDetail to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      EvolutionVariableDetailObject <- list()
      if (!is.null(self$`id`)) {
        EvolutionVariableDetailObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`name`)) {
        EvolutionVariableDetailObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`symbol`)) {
        EvolutionVariableDetailObject[["symbol"]] <-
          self$`symbol`
      }
      if (!is.null(self$`data_type`)) {
        EvolutionVariableDetailObject[["data_type"]] <-
          self$`data_type`
      }
      if (!is.null(self$`source`)) {
        EvolutionVariableDetailObject[["source"]] <-
          self$`source`
      }
      if (!is.null(self$`version_group`)) {
        EvolutionVariableDetailObject[["version_group"]] <-
          self$extractSimpleType(self$`version_group`)
      }
      if (!is.null(self$`names`)) {
        EvolutionVariableDetailObject[["names"]] <-
          self$extractSimpleType(self$`names`)
      }
      if (!is.null(self$`descriptions`)) {
        EvolutionVariableDetailObject[["descriptions"]] <-
          self$extractSimpleType(self$`descriptions`)
      }
      return(EvolutionVariableDetailObject)
    },

    extractSimpleType = function(x) {
      if (R6::is.R6(x)) {
        return(x$toSimpleType())
      } else if (!self$hasNestedR6(x)) {
        return(x)
      }
      lapply(x, self$extractSimpleType)
    },

    hasNestedR6 = function(x) {
      if (R6::is.R6(x)) {
        return(TRUE)
      }
      if (is.list(x)) {
        for (item in x) {
          if (self$hasNestedR6(item)) {
            return(TRUE)
          }
        }
      }
      FALSE
    },

    #' @description
    #' Deserialize JSON string into an instance of EvolutionVariableDetail
    #'
    #' @param input_json the JSON input
    #' @return the instance of EvolutionVariableDetail
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`symbol`)) {
        self$`symbol` <- this_object$`symbol`
      }
      if (!is.null(this_object$`data_type`)) {
        self$`data_type` <- this_object$`data_type`
      }
      if (!is.null(this_object$`source`)) {
        self$`source` <- this_object$`source`
      }
      if (!is.null(this_object$`version_group`)) {
        `version_group_object` <- VersionGroupSummary$new()
        `version_group_object`$fromJSON(jsonlite::toJSON(this_object$`version_group`, auto_unbox = TRUE, digits = NA))
        self$`version_group` <- `version_group_object`
      }
      if (!is.null(this_object$`names`)) {
        self$`names` <- ApiClient$new()$deserializeObj(this_object$`names`, "array[EvolutionVariableName]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`descriptions`)) {
        self$`descriptions` <- ApiClient$new()$deserializeObj(this_object$`descriptions`, "array[EvolutionVariableDescription]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return EvolutionVariableDetail in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of EvolutionVariableDetail
    #'
    #' @param input_json the JSON input
    #' @return the instance of EvolutionVariableDetail
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`name` <- this_object$`name`
      self$`symbol` <- this_object$`symbol`
      self$`data_type` <- this_object$`data_type`
      self$`source` <- this_object$`source`
      self$`version_group` <- VersionGroupSummary$new()$fromJSON(jsonlite::toJSON(this_object$`version_group`, auto_unbox = TRUE, digits = NA))
      self$`names` <- ApiClient$new()$deserializeObj(this_object$`names`, "array[EvolutionVariableName]", loadNamespace("openapi"))
      self$`descriptions` <- ApiClient$new()$deserializeObj(this_object$`descriptions`, "array[EvolutionVariableDescription]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to EvolutionVariableDetail and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for EvolutionVariableDetail: the required field `id` is missing."))
      }
      # check the required field `name`
      if (!is.null(input_json$`name`)) {
        if (!(is.character(input_json$`name`) && length(input_json$`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", input_json$`name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for EvolutionVariableDetail: the required field `name` is missing."))
      }
      # check the required field `symbol`
      if (!is.null(input_json$`symbol`)) {
        if (!(is.character(input_json$`symbol`) && length(input_json$`symbol`) == 1)) {
          stop(paste("Error! Invalid data for `symbol`. Must be a string:", input_json$`symbol`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for EvolutionVariableDetail: the required field `symbol` is missing."))
      }
      # check the required field `version_group`
      if (!is.null(input_json$`version_group`)) {
        stopifnot(R6::is.R6(input_json$`version_group`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for EvolutionVariableDetail: the required field `version_group` is missing."))
      }
      # check the required field `names`
      if (!is.null(input_json$`names`)) {
        stopifnot(is.vector(input_json$`names`), length(input_json$`names`) != 0)
        tmp <- sapply(input_json$`names`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for EvolutionVariableDetail: the required field `names` is missing."))
      }
      # check the required field `descriptions`
      if (!is.null(input_json$`descriptions`)) {
        stopifnot(is.vector(input_json$`descriptions`), length(input_json$`descriptions`) != 0)
        tmp <- sapply(input_json$`descriptions`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for EvolutionVariableDetail: the required field `descriptions` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of EvolutionVariableDetail
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

      if (nchar(self$`name`) > 200) {
        return(FALSE)
      }

      # check if the required `symbol` is null
      if (is.null(self$`symbol`)) {
        return(FALSE)
      }

      if (nchar(self$`symbol`) > 10) {
        return(FALSE)
      }

      if (nchar(self$`data_type`) > 20) {
        return(FALSE)
      }

      if (nchar(self$`source`) > 20) {
        return(FALSE)
      }

      # check if the required `version_group` is null
      if (is.null(self$`version_group`)) {
        return(FALSE)
      }

      # check if the required `names` is null
      if (is.null(self$`names`)) {
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

      # check if the required `name` is null
      if (is.null(self$`name`)) {
        invalid_fields["name"] <- "Non-nullable required field `name` cannot be null."
      }

      if (nchar(self$`name`) > 200) {
        invalid_fields["name"] <- "Invalid length for `name`, must be smaller than or equal to 200."
      }

      # check if the required `symbol` is null
      if (is.null(self$`symbol`)) {
        invalid_fields["symbol"] <- "Non-nullable required field `symbol` cannot be null."
      }

      if (nchar(self$`symbol`) > 10) {
        invalid_fields["symbol"] <- "Invalid length for `symbol`, must be smaller than or equal to 10."
      }

      if (nchar(self$`data_type`) > 20) {
        invalid_fields["data_type"] <- "Invalid length for `data_type`, must be smaller than or equal to 20."
      }

      if (nchar(self$`source`) > 20) {
        invalid_fields["source"] <- "Invalid length for `source`, must be smaller than or equal to 20."
      }

      # check if the required `version_group` is null
      if (is.null(self$`version_group`)) {
        invalid_fields["version_group"] <- "Non-nullable required field `version_group` cannot be null."
      }

      # check if the required `names` is null
      if (is.null(self$`names`)) {
        invalid_fields["names"] <- "Non-nullable required field `names` cannot be null."
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
# EvolutionVariableDetail$unlock()
#
## Below is an example to define the print function
# EvolutionVariableDetail$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# EvolutionVariableDetail$lock()

