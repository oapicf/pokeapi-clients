#' Create a new MoveChange
#'
#' @description
#' MoveChange Class
#'
#' @docType class
#' @title MoveChange
#' @description MoveChange Class
#' @format An \code{R6Class} generator object
#' @field accuracy  integer [optional]
#' @field power  integer [optional]
#' @field pp  integer [optional]
#' @field effect_chance  integer
#' @field effect_entries  list(\link{MoveChangeEffectEntriesInner})
#' @field type  \link{TypeSummary}
#' @field version_group  \link{VersionGroupSummary}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
MoveChange <- R6::R6Class(
  "MoveChange",
  public = list(
    `accuracy` = NULL,
    `power` = NULL,
    `pp` = NULL,
    `effect_chance` = NULL,
    `effect_entries` = NULL,
    `type` = NULL,
    `version_group` = NULL,

    #' @description
    #' Initialize a new MoveChange class.
    #'
    #' @param effect_chance effect_chance
    #' @param effect_entries effect_entries
    #' @param type type
    #' @param version_group version_group
    #' @param accuracy accuracy
    #' @param power power
    #' @param pp pp
    #' @param ... Other optional arguments.
    initialize = function(`effect_chance`, `effect_entries`, `type`, `version_group`, `accuracy` = NULL, `power` = NULL, `pp` = NULL, ...) {
      if (!missing(`effect_chance`)) {
        if (!(is.numeric(`effect_chance`) && length(`effect_chance`) == 1)) {
          stop(paste("Error! Invalid data for `effect_chance`. Must be an integer:", `effect_chance`))
        }
        self$`effect_chance` <- `effect_chance`
      }
      if (!missing(`effect_entries`)) {
        stopifnot(is.vector(`effect_entries`), length(`effect_entries`) != 0)
        sapply(`effect_entries`, function(x) stopifnot(R6::is.R6(x)))
        self$`effect_entries` <- `effect_entries`
      }
      if (!missing(`type`)) {
        stopifnot(R6::is.R6(`type`))
        self$`type` <- `type`
      }
      if (!missing(`version_group`)) {
        stopifnot(R6::is.R6(`version_group`))
        self$`version_group` <- `version_group`
      }
      if (!is.null(`accuracy`)) {
        if (!(is.numeric(`accuracy`) && length(`accuracy`) == 1)) {
          stop(paste("Error! Invalid data for `accuracy`. Must be an integer:", `accuracy`))
        }
        self$`accuracy` <- `accuracy`
      }
      if (!is.null(`power`)) {
        if (!(is.numeric(`power`) && length(`power`) == 1)) {
          stop(paste("Error! Invalid data for `power`. Must be an integer:", `power`))
        }
        self$`power` <- `power`
      }
      if (!is.null(`pp`)) {
        if (!(is.numeric(`pp`) && length(`pp`) == 1)) {
          stop(paste("Error! Invalid data for `pp`. Must be an integer:", `pp`))
        }
        self$`pp` <- `pp`
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
    #' @return MoveChange as a base R list.
    #' @examples
    #' # convert array of MoveChange (x) to a data frame
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
    #' Convert MoveChange to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      MoveChangeObject <- list()
      if (!is.null(self$`accuracy`)) {
        MoveChangeObject[["accuracy"]] <-
          self$`accuracy`
      }
      if (!is.null(self$`power`)) {
        MoveChangeObject[["power"]] <-
          self$`power`
      }
      if (!is.null(self$`pp`)) {
        MoveChangeObject[["pp"]] <-
          self$`pp`
      }
      if (!is.null(self$`effect_chance`)) {
        MoveChangeObject[["effect_chance"]] <-
          self$`effect_chance`
      }
      if (!is.null(self$`effect_entries`)) {
        MoveChangeObject[["effect_entries"]] <-
          lapply(self$`effect_entries`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`type`)) {
        MoveChangeObject[["type"]] <-
          self$`type`$toSimpleType()
      }
      if (!is.null(self$`version_group`)) {
        MoveChangeObject[["version_group"]] <-
          self$`version_group`$toSimpleType()
      }
      return(MoveChangeObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of MoveChange
    #'
    #' @param input_json the JSON input
    #' @return the instance of MoveChange
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`accuracy`)) {
        self$`accuracy` <- this_object$`accuracy`
      }
      if (!is.null(this_object$`power`)) {
        self$`power` <- this_object$`power`
      }
      if (!is.null(this_object$`pp`)) {
        self$`pp` <- this_object$`pp`
      }
      if (!is.null(this_object$`effect_chance`)) {
        self$`effect_chance` <- this_object$`effect_chance`
      }
      if (!is.null(this_object$`effect_entries`)) {
        self$`effect_entries` <- ApiClient$new()$deserializeObj(this_object$`effect_entries`, "array[MoveChangeEffectEntriesInner]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`type`)) {
        `type_object` <- TypeSummary$new()
        `type_object`$fromJSON(jsonlite::toJSON(this_object$`type`, auto_unbox = TRUE, digits = NA))
        self$`type` <- `type_object`
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
    #' @return MoveChange in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of MoveChange
    #'
    #' @param input_json the JSON input
    #' @return the instance of MoveChange
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`accuracy` <- this_object$`accuracy`
      self$`power` <- this_object$`power`
      self$`pp` <- this_object$`pp`
      self$`effect_chance` <- this_object$`effect_chance`
      self$`effect_entries` <- ApiClient$new()$deserializeObj(this_object$`effect_entries`, "array[MoveChangeEffectEntriesInner]", loadNamespace("openapi"))
      self$`type` <- TypeSummary$new()$fromJSON(jsonlite::toJSON(this_object$`type`, auto_unbox = TRUE, digits = NA))
      self$`version_group` <- VersionGroupSummary$new()$fromJSON(jsonlite::toJSON(this_object$`version_group`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to MoveChange and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `effect_chance`
      if (!is.null(input_json$`effect_chance`)) {
        if (!(is.numeric(input_json$`effect_chance`) && length(input_json$`effect_chance`) == 1)) {
          stop(paste("Error! Invalid data for `effect_chance`. Must be an integer:", input_json$`effect_chance`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MoveChange: the required field `effect_chance` is missing."))
      }
      # check the required field `effect_entries`
      if (!is.null(input_json$`effect_entries`)) {
        stopifnot(is.vector(input_json$`effect_entries`), length(input_json$`effect_entries`) != 0)
        tmp <- sapply(input_json$`effect_entries`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MoveChange: the required field `effect_entries` is missing."))
      }
      # check the required field `type`
      if (!is.null(input_json$`type`)) {
        stopifnot(R6::is.R6(input_json$`type`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MoveChange: the required field `type` is missing."))
      }
      # check the required field `version_group`
      if (!is.null(input_json$`version_group`)) {
        stopifnot(R6::is.R6(input_json$`version_group`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MoveChange: the required field `version_group` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of MoveChange
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `effect_chance` is null
      if (is.null(self$`effect_chance`)) {
        return(FALSE)
      }

      # check if the required `effect_entries` is null
      if (is.null(self$`effect_entries`)) {
        return(FALSE)
      }

      # check if the required `type` is null
      if (is.null(self$`type`)) {
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
      # check if the required `effect_chance` is null
      if (is.null(self$`effect_chance`)) {
        invalid_fields["effect_chance"] <- "Non-nullable required field `effect_chance` cannot be null."
      }

      # check if the required `effect_entries` is null
      if (is.null(self$`effect_entries`)) {
        invalid_fields["effect_entries"] <- "Non-nullable required field `effect_entries` cannot be null."
      }

      # check if the required `type` is null
      if (is.null(self$`type`)) {
        invalid_fields["type"] <- "Non-nullable required field `type` cannot be null."
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
# MoveChange$unlock()
#
## Below is an example to define the print function
# MoveChange$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# MoveChange$lock()

