#' Create a new MoveMeta
#'
#' @description
#' MoveMeta Class
#'
#' @docType class
#' @title MoveMeta
#' @description MoveMeta Class
#' @format An \code{R6Class} generator object
#' @field ailment  \link{MoveMetaAilmentSummary}
#' @field category  \link{MoveMetaCategorySummary}
#' @field min_hits  integer [optional]
#' @field max_hits  integer [optional]
#' @field min_turns  integer [optional]
#' @field max_turns  integer [optional]
#' @field drain  integer [optional]
#' @field healing  integer [optional]
#' @field crit_rate  integer [optional]
#' @field ailment_chance  integer [optional]
#' @field flinch_chance  integer [optional]
#' @field stat_chance  integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
MoveMeta <- R6::R6Class(
  "MoveMeta",
  public = list(
    `ailment` = NULL,
    `category` = NULL,
    `min_hits` = NULL,
    `max_hits` = NULL,
    `min_turns` = NULL,
    `max_turns` = NULL,
    `drain` = NULL,
    `healing` = NULL,
    `crit_rate` = NULL,
    `ailment_chance` = NULL,
    `flinch_chance` = NULL,
    `stat_chance` = NULL,

    #' @description
    #' Initialize a new MoveMeta class.
    #'
    #' @param ailment ailment
    #' @param category category
    #' @param min_hits min_hits
    #' @param max_hits max_hits
    #' @param min_turns min_turns
    #' @param max_turns max_turns
    #' @param drain drain
    #' @param healing healing
    #' @param crit_rate crit_rate
    #' @param ailment_chance ailment_chance
    #' @param flinch_chance flinch_chance
    #' @param stat_chance stat_chance
    #' @param ... Other optional arguments.
    initialize = function(`ailment`, `category`, `min_hits` = NULL, `max_hits` = NULL, `min_turns` = NULL, `max_turns` = NULL, `drain` = NULL, `healing` = NULL, `crit_rate` = NULL, `ailment_chance` = NULL, `flinch_chance` = NULL, `stat_chance` = NULL, ...) {
      if (!missing(`ailment`)) {
        stopifnot(R6::is.R6(`ailment`))
        self$`ailment` <- `ailment`
      }
      if (!missing(`category`)) {
        stopifnot(R6::is.R6(`category`))
        self$`category` <- `category`
      }
      if (!is.null(`min_hits`)) {
        if (!(is.numeric(`min_hits`) && length(`min_hits`) == 1)) {
          stop(paste("Error! Invalid data for `min_hits`. Must be an integer:", `min_hits`))
        }
        self$`min_hits` <- `min_hits`
      }
      if (!is.null(`max_hits`)) {
        if (!(is.numeric(`max_hits`) && length(`max_hits`) == 1)) {
          stop(paste("Error! Invalid data for `max_hits`. Must be an integer:", `max_hits`))
        }
        self$`max_hits` <- `max_hits`
      }
      if (!is.null(`min_turns`)) {
        if (!(is.numeric(`min_turns`) && length(`min_turns`) == 1)) {
          stop(paste("Error! Invalid data for `min_turns`. Must be an integer:", `min_turns`))
        }
        self$`min_turns` <- `min_turns`
      }
      if (!is.null(`max_turns`)) {
        if (!(is.numeric(`max_turns`) && length(`max_turns`) == 1)) {
          stop(paste("Error! Invalid data for `max_turns`. Must be an integer:", `max_turns`))
        }
        self$`max_turns` <- `max_turns`
      }
      if (!is.null(`drain`)) {
        if (!(is.numeric(`drain`) && length(`drain`) == 1)) {
          stop(paste("Error! Invalid data for `drain`. Must be an integer:", `drain`))
        }
        self$`drain` <- `drain`
      }
      if (!is.null(`healing`)) {
        if (!(is.numeric(`healing`) && length(`healing`) == 1)) {
          stop(paste("Error! Invalid data for `healing`. Must be an integer:", `healing`))
        }
        self$`healing` <- `healing`
      }
      if (!is.null(`crit_rate`)) {
        if (!(is.numeric(`crit_rate`) && length(`crit_rate`) == 1)) {
          stop(paste("Error! Invalid data for `crit_rate`. Must be an integer:", `crit_rate`))
        }
        self$`crit_rate` <- `crit_rate`
      }
      if (!is.null(`ailment_chance`)) {
        if (!(is.numeric(`ailment_chance`) && length(`ailment_chance`) == 1)) {
          stop(paste("Error! Invalid data for `ailment_chance`. Must be an integer:", `ailment_chance`))
        }
        self$`ailment_chance` <- `ailment_chance`
      }
      if (!is.null(`flinch_chance`)) {
        if (!(is.numeric(`flinch_chance`) && length(`flinch_chance`) == 1)) {
          stop(paste("Error! Invalid data for `flinch_chance`. Must be an integer:", `flinch_chance`))
        }
        self$`flinch_chance` <- `flinch_chance`
      }
      if (!is.null(`stat_chance`)) {
        if (!(is.numeric(`stat_chance`) && length(`stat_chance`) == 1)) {
          stop(paste("Error! Invalid data for `stat_chance`. Must be an integer:", `stat_chance`))
        }
        self$`stat_chance` <- `stat_chance`
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
    #' @return MoveMeta as a base R list.
    #' @examples
    #' # convert array of MoveMeta (x) to a data frame
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
    #' Convert MoveMeta to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      MoveMetaObject <- list()
      if (!is.null(self$`ailment`)) {
        MoveMetaObject[["ailment"]] <-
          self$`ailment`$toSimpleType()
      }
      if (!is.null(self$`category`)) {
        MoveMetaObject[["category"]] <-
          self$`category`$toSimpleType()
      }
      if (!is.null(self$`min_hits`)) {
        MoveMetaObject[["min_hits"]] <-
          self$`min_hits`
      }
      if (!is.null(self$`max_hits`)) {
        MoveMetaObject[["max_hits"]] <-
          self$`max_hits`
      }
      if (!is.null(self$`min_turns`)) {
        MoveMetaObject[["min_turns"]] <-
          self$`min_turns`
      }
      if (!is.null(self$`max_turns`)) {
        MoveMetaObject[["max_turns"]] <-
          self$`max_turns`
      }
      if (!is.null(self$`drain`)) {
        MoveMetaObject[["drain"]] <-
          self$`drain`
      }
      if (!is.null(self$`healing`)) {
        MoveMetaObject[["healing"]] <-
          self$`healing`
      }
      if (!is.null(self$`crit_rate`)) {
        MoveMetaObject[["crit_rate"]] <-
          self$`crit_rate`
      }
      if (!is.null(self$`ailment_chance`)) {
        MoveMetaObject[["ailment_chance"]] <-
          self$`ailment_chance`
      }
      if (!is.null(self$`flinch_chance`)) {
        MoveMetaObject[["flinch_chance"]] <-
          self$`flinch_chance`
      }
      if (!is.null(self$`stat_chance`)) {
        MoveMetaObject[["stat_chance"]] <-
          self$`stat_chance`
      }
      return(MoveMetaObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of MoveMeta
    #'
    #' @param input_json the JSON input
    #' @return the instance of MoveMeta
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`ailment`)) {
        `ailment_object` <- MoveMetaAilmentSummary$new()
        `ailment_object`$fromJSON(jsonlite::toJSON(this_object$`ailment`, auto_unbox = TRUE, digits = NA))
        self$`ailment` <- `ailment_object`
      }
      if (!is.null(this_object$`category`)) {
        `category_object` <- MoveMetaCategorySummary$new()
        `category_object`$fromJSON(jsonlite::toJSON(this_object$`category`, auto_unbox = TRUE, digits = NA))
        self$`category` <- `category_object`
      }
      if (!is.null(this_object$`min_hits`)) {
        self$`min_hits` <- this_object$`min_hits`
      }
      if (!is.null(this_object$`max_hits`)) {
        self$`max_hits` <- this_object$`max_hits`
      }
      if (!is.null(this_object$`min_turns`)) {
        self$`min_turns` <- this_object$`min_turns`
      }
      if (!is.null(this_object$`max_turns`)) {
        self$`max_turns` <- this_object$`max_turns`
      }
      if (!is.null(this_object$`drain`)) {
        self$`drain` <- this_object$`drain`
      }
      if (!is.null(this_object$`healing`)) {
        self$`healing` <- this_object$`healing`
      }
      if (!is.null(this_object$`crit_rate`)) {
        self$`crit_rate` <- this_object$`crit_rate`
      }
      if (!is.null(this_object$`ailment_chance`)) {
        self$`ailment_chance` <- this_object$`ailment_chance`
      }
      if (!is.null(this_object$`flinch_chance`)) {
        self$`flinch_chance` <- this_object$`flinch_chance`
      }
      if (!is.null(this_object$`stat_chance`)) {
        self$`stat_chance` <- this_object$`stat_chance`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return MoveMeta in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of MoveMeta
    #'
    #' @param input_json the JSON input
    #' @return the instance of MoveMeta
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`ailment` <- MoveMetaAilmentSummary$new()$fromJSON(jsonlite::toJSON(this_object$`ailment`, auto_unbox = TRUE, digits = NA))
      self$`category` <- MoveMetaCategorySummary$new()$fromJSON(jsonlite::toJSON(this_object$`category`, auto_unbox = TRUE, digits = NA))
      self$`min_hits` <- this_object$`min_hits`
      self$`max_hits` <- this_object$`max_hits`
      self$`min_turns` <- this_object$`min_turns`
      self$`max_turns` <- this_object$`max_turns`
      self$`drain` <- this_object$`drain`
      self$`healing` <- this_object$`healing`
      self$`crit_rate` <- this_object$`crit_rate`
      self$`ailment_chance` <- this_object$`ailment_chance`
      self$`flinch_chance` <- this_object$`flinch_chance`
      self$`stat_chance` <- this_object$`stat_chance`
      self
    },

    #' @description
    #' Validate JSON input with respect to MoveMeta and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `ailment`
      if (!is.null(input_json$`ailment`)) {
        stopifnot(R6::is.R6(input_json$`ailment`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MoveMeta: the required field `ailment` is missing."))
      }
      # check the required field `category`
      if (!is.null(input_json$`category`)) {
        stopifnot(R6::is.R6(input_json$`category`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MoveMeta: the required field `category` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of MoveMeta
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `ailment` is null
      if (is.null(self$`ailment`)) {
        return(FALSE)
      }

      # check if the required `category` is null
      if (is.null(self$`category`)) {
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
      # check if the required `ailment` is null
      if (is.null(self$`ailment`)) {
        invalid_fields["ailment"] <- "Non-nullable required field `ailment` cannot be null."
      }

      # check if the required `category` is null
      if (is.null(self$`category`)) {
        invalid_fields["category"] <- "Non-nullable required field `category` cannot be null."
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
# MoveMeta$unlock()
#
## Below is an example to define the print function
# MoveMeta$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# MoveMeta$lock()

