#' Create a new MachineDetail
#'
#' @description
#' MachineDetail Class
#'
#' @docType class
#' @title MachineDetail
#' @description MachineDetail Class
#' @format An \code{R6Class} generator object
#' @field id  integer
#' @field item  \link{ItemSummary}
#' @field version_group  \link{VersionGroupSummary}
#' @field move  \link{MoveSummary}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
MachineDetail <- R6::R6Class(
  "MachineDetail",
  public = list(
    `id` = NULL,
    `item` = NULL,
    `version_group` = NULL,
    `move` = NULL,

    #' @description
    #' Initialize a new MachineDetail class.
    #'
    #' @param id id
    #' @param item item
    #' @param version_group version_group
    #' @param move move
    #' @param ... Other optional arguments.
    initialize = function(`id`, `item`, `version_group`, `move`, ...) {
      if (!missing(`id`)) {
        if (!(is.numeric(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be an integer:", `id`))
        }
        self$`id` <- `id`
      }
      if (!missing(`item`)) {
        stopifnot(R6::is.R6(`item`))
        self$`item` <- `item`
      }
      if (!missing(`version_group`)) {
        stopifnot(R6::is.R6(`version_group`))
        self$`version_group` <- `version_group`
      }
      if (!missing(`move`)) {
        stopifnot(R6::is.R6(`move`))
        self$`move` <- `move`
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
    #' @return MachineDetail as a base R list.
    #' @examples
    #' # convert array of MachineDetail (x) to a data frame
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
    #' Convert MachineDetail to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      MachineDetailObject <- list()
      if (!is.null(self$`id`)) {
        MachineDetailObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`item`)) {
        MachineDetailObject[["item"]] <-
          self$`item`$toSimpleType()
      }
      if (!is.null(self$`version_group`)) {
        MachineDetailObject[["version_group"]] <-
          self$`version_group`$toSimpleType()
      }
      if (!is.null(self$`move`)) {
        MachineDetailObject[["move"]] <-
          self$`move`$toSimpleType()
      }
      return(MachineDetailObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of MachineDetail
    #'
    #' @param input_json the JSON input
    #' @return the instance of MachineDetail
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`item`)) {
        `item_object` <- ItemSummary$new()
        `item_object`$fromJSON(jsonlite::toJSON(this_object$`item`, auto_unbox = TRUE, digits = NA))
        self$`item` <- `item_object`
      }
      if (!is.null(this_object$`version_group`)) {
        `version_group_object` <- VersionGroupSummary$new()
        `version_group_object`$fromJSON(jsonlite::toJSON(this_object$`version_group`, auto_unbox = TRUE, digits = NA))
        self$`version_group` <- `version_group_object`
      }
      if (!is.null(this_object$`move`)) {
        `move_object` <- MoveSummary$new()
        `move_object`$fromJSON(jsonlite::toJSON(this_object$`move`, auto_unbox = TRUE, digits = NA))
        self$`move` <- `move_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return MachineDetail in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of MachineDetail
    #'
    #' @param input_json the JSON input
    #' @return the instance of MachineDetail
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`item` <- ItemSummary$new()$fromJSON(jsonlite::toJSON(this_object$`item`, auto_unbox = TRUE, digits = NA))
      self$`version_group` <- VersionGroupSummary$new()$fromJSON(jsonlite::toJSON(this_object$`version_group`, auto_unbox = TRUE, digits = NA))
      self$`move` <- MoveSummary$new()$fromJSON(jsonlite::toJSON(this_object$`move`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to MachineDetail and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for MachineDetail: the required field `id` is missing."))
      }
      # check the required field `item`
      if (!is.null(input_json$`item`)) {
        stopifnot(R6::is.R6(input_json$`item`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MachineDetail: the required field `item` is missing."))
      }
      # check the required field `version_group`
      if (!is.null(input_json$`version_group`)) {
        stopifnot(R6::is.R6(input_json$`version_group`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MachineDetail: the required field `version_group` is missing."))
      }
      # check the required field `move`
      if (!is.null(input_json$`move`)) {
        stopifnot(R6::is.R6(input_json$`move`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MachineDetail: the required field `move` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of MachineDetail
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

      # check if the required `item` is null
      if (is.null(self$`item`)) {
        return(FALSE)
      }

      # check if the required `version_group` is null
      if (is.null(self$`version_group`)) {
        return(FALSE)
      }

      # check if the required `move` is null
      if (is.null(self$`move`)) {
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

      # check if the required `item` is null
      if (is.null(self$`item`)) {
        invalid_fields["item"] <- "Non-nullable required field `item` cannot be null."
      }

      # check if the required `version_group` is null
      if (is.null(self$`version_group`)) {
        invalid_fields["version_group"] <- "Non-nullable required field `version_group` cannot be null."
      }

      # check if the required `move` is null
      if (is.null(self$`move`)) {
        invalid_fields["move"] <- "Non-nullable required field `move` cannot be null."
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
# MachineDetail$unlock()
#
## Below is an example to define the print function
# MachineDetail$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# MachineDetail$lock()

