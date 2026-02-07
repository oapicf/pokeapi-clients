#' Create a new NatureDetail
#'
#' @description
#' NatureDetail Class
#'
#' @docType class
#' @title NatureDetail
#' @description NatureDetail Class
#' @format An \code{R6Class} generator object
#' @field id  integer
#' @field name  character
#' @field decreased_stat  \link{StatSummary}
#' @field increased_stat  \link{StatSummary}
#' @field likes_flavor  \link{BerryFlavorSummary}
#' @field hates_flavor  \link{BerryFlavorSummary}
#' @field berries  list(\link{BerrySummary})
#' @field pokeathlon_stat_changes  list(\link{NatureDetailPokeathlonStatChangesInner})
#' @field move_battle_style_preferences  list(\link{NatureBattleStylePreference})
#' @field names  list(\link{NatureName})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
NatureDetail <- R6::R6Class(
  "NatureDetail",
  public = list(
    `id` = NULL,
    `name` = NULL,
    `decreased_stat` = NULL,
    `increased_stat` = NULL,
    `likes_flavor` = NULL,
    `hates_flavor` = NULL,
    `berries` = NULL,
    `pokeathlon_stat_changes` = NULL,
    `move_battle_style_preferences` = NULL,
    `names` = NULL,

    #' @description
    #' Initialize a new NatureDetail class.
    #'
    #' @param id id
    #' @param name name
    #' @param decreased_stat decreased_stat
    #' @param increased_stat increased_stat
    #' @param likes_flavor likes_flavor
    #' @param hates_flavor hates_flavor
    #' @param berries berries
    #' @param pokeathlon_stat_changes pokeathlon_stat_changes
    #' @param move_battle_style_preferences move_battle_style_preferences
    #' @param names names
    #' @param ... Other optional arguments.
    initialize = function(`id`, `name`, `decreased_stat`, `increased_stat`, `likes_flavor`, `hates_flavor`, `berries`, `pokeathlon_stat_changes`, `move_battle_style_preferences`, `names`, ...) {
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
      if (!missing(`decreased_stat`)) {
        stopifnot(R6::is.R6(`decreased_stat`))
        self$`decreased_stat` <- `decreased_stat`
      }
      if (!missing(`increased_stat`)) {
        stopifnot(R6::is.R6(`increased_stat`))
        self$`increased_stat` <- `increased_stat`
      }
      if (!missing(`likes_flavor`)) {
        stopifnot(R6::is.R6(`likes_flavor`))
        self$`likes_flavor` <- `likes_flavor`
      }
      if (!missing(`hates_flavor`)) {
        stopifnot(R6::is.R6(`hates_flavor`))
        self$`hates_flavor` <- `hates_flavor`
      }
      if (!missing(`berries`)) {
        stopifnot(is.vector(`berries`), length(`berries`) != 0)
        sapply(`berries`, function(x) stopifnot(R6::is.R6(x)))
        self$`berries` <- `berries`
      }
      if (!missing(`pokeathlon_stat_changes`)) {
        stopifnot(is.vector(`pokeathlon_stat_changes`), length(`pokeathlon_stat_changes`) != 0)
        sapply(`pokeathlon_stat_changes`, function(x) stopifnot(R6::is.R6(x)))
        self$`pokeathlon_stat_changes` <- `pokeathlon_stat_changes`
      }
      if (!missing(`move_battle_style_preferences`)) {
        stopifnot(is.vector(`move_battle_style_preferences`), length(`move_battle_style_preferences`) != 0)
        sapply(`move_battle_style_preferences`, function(x) stopifnot(R6::is.R6(x)))
        self$`move_battle_style_preferences` <- `move_battle_style_preferences`
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
    #' @return NatureDetail as a base R list.
    #' @examples
    #' # convert array of NatureDetail (x) to a data frame
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
    #' Convert NatureDetail to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      NatureDetailObject <- list()
      if (!is.null(self$`id`)) {
        NatureDetailObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`name`)) {
        NatureDetailObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`decreased_stat`)) {
        NatureDetailObject[["decreased_stat"]] <-
          self$`decreased_stat`$toSimpleType()
      }
      if (!is.null(self$`increased_stat`)) {
        NatureDetailObject[["increased_stat"]] <-
          self$`increased_stat`$toSimpleType()
      }
      if (!is.null(self$`likes_flavor`)) {
        NatureDetailObject[["likes_flavor"]] <-
          self$`likes_flavor`$toSimpleType()
      }
      if (!is.null(self$`hates_flavor`)) {
        NatureDetailObject[["hates_flavor"]] <-
          self$`hates_flavor`$toSimpleType()
      }
      if (!is.null(self$`berries`)) {
        NatureDetailObject[["berries"]] <-
          lapply(self$`berries`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`pokeathlon_stat_changes`)) {
        NatureDetailObject[["pokeathlon_stat_changes"]] <-
          lapply(self$`pokeathlon_stat_changes`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`move_battle_style_preferences`)) {
        NatureDetailObject[["move_battle_style_preferences"]] <-
          lapply(self$`move_battle_style_preferences`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`names`)) {
        NatureDetailObject[["names"]] <-
          lapply(self$`names`, function(x) x$toSimpleType())
      }
      return(NatureDetailObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of NatureDetail
    #'
    #' @param input_json the JSON input
    #' @return the instance of NatureDetail
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`decreased_stat`)) {
        `decreased_stat_object` <- StatSummary$new()
        `decreased_stat_object`$fromJSON(jsonlite::toJSON(this_object$`decreased_stat`, auto_unbox = TRUE, digits = NA))
        self$`decreased_stat` <- `decreased_stat_object`
      }
      if (!is.null(this_object$`increased_stat`)) {
        `increased_stat_object` <- StatSummary$new()
        `increased_stat_object`$fromJSON(jsonlite::toJSON(this_object$`increased_stat`, auto_unbox = TRUE, digits = NA))
        self$`increased_stat` <- `increased_stat_object`
      }
      if (!is.null(this_object$`likes_flavor`)) {
        `likes_flavor_object` <- BerryFlavorSummary$new()
        `likes_flavor_object`$fromJSON(jsonlite::toJSON(this_object$`likes_flavor`, auto_unbox = TRUE, digits = NA))
        self$`likes_flavor` <- `likes_flavor_object`
      }
      if (!is.null(this_object$`hates_flavor`)) {
        `hates_flavor_object` <- BerryFlavorSummary$new()
        `hates_flavor_object`$fromJSON(jsonlite::toJSON(this_object$`hates_flavor`, auto_unbox = TRUE, digits = NA))
        self$`hates_flavor` <- `hates_flavor_object`
      }
      if (!is.null(this_object$`berries`)) {
        self$`berries` <- ApiClient$new()$deserializeObj(this_object$`berries`, "array[BerrySummary]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`pokeathlon_stat_changes`)) {
        self$`pokeathlon_stat_changes` <- ApiClient$new()$deserializeObj(this_object$`pokeathlon_stat_changes`, "array[NatureDetailPokeathlonStatChangesInner]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`move_battle_style_preferences`)) {
        self$`move_battle_style_preferences` <- ApiClient$new()$deserializeObj(this_object$`move_battle_style_preferences`, "array[NatureBattleStylePreference]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`names`)) {
        self$`names` <- ApiClient$new()$deserializeObj(this_object$`names`, "array[NatureName]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return NatureDetail in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of NatureDetail
    #'
    #' @param input_json the JSON input
    #' @return the instance of NatureDetail
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`name` <- this_object$`name`
      self$`decreased_stat` <- StatSummary$new()$fromJSON(jsonlite::toJSON(this_object$`decreased_stat`, auto_unbox = TRUE, digits = NA))
      self$`increased_stat` <- StatSummary$new()$fromJSON(jsonlite::toJSON(this_object$`increased_stat`, auto_unbox = TRUE, digits = NA))
      self$`likes_flavor` <- BerryFlavorSummary$new()$fromJSON(jsonlite::toJSON(this_object$`likes_flavor`, auto_unbox = TRUE, digits = NA))
      self$`hates_flavor` <- BerryFlavorSummary$new()$fromJSON(jsonlite::toJSON(this_object$`hates_flavor`, auto_unbox = TRUE, digits = NA))
      self$`berries` <- ApiClient$new()$deserializeObj(this_object$`berries`, "array[BerrySummary]", loadNamespace("openapi"))
      self$`pokeathlon_stat_changes` <- ApiClient$new()$deserializeObj(this_object$`pokeathlon_stat_changes`, "array[NatureDetailPokeathlonStatChangesInner]", loadNamespace("openapi"))
      self$`move_battle_style_preferences` <- ApiClient$new()$deserializeObj(this_object$`move_battle_style_preferences`, "array[NatureBattleStylePreference]", loadNamespace("openapi"))
      self$`names` <- ApiClient$new()$deserializeObj(this_object$`names`, "array[NatureName]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to NatureDetail and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for NatureDetail: the required field `id` is missing."))
      }
      # check the required field `name`
      if (!is.null(input_json$`name`)) {
        if (!(is.character(input_json$`name`) && length(input_json$`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", input_json$`name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for NatureDetail: the required field `name` is missing."))
      }
      # check the required field `decreased_stat`
      if (!is.null(input_json$`decreased_stat`)) {
        stopifnot(R6::is.R6(input_json$`decreased_stat`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for NatureDetail: the required field `decreased_stat` is missing."))
      }
      # check the required field `increased_stat`
      if (!is.null(input_json$`increased_stat`)) {
        stopifnot(R6::is.R6(input_json$`increased_stat`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for NatureDetail: the required field `increased_stat` is missing."))
      }
      # check the required field `likes_flavor`
      if (!is.null(input_json$`likes_flavor`)) {
        stopifnot(R6::is.R6(input_json$`likes_flavor`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for NatureDetail: the required field `likes_flavor` is missing."))
      }
      # check the required field `hates_flavor`
      if (!is.null(input_json$`hates_flavor`)) {
        stopifnot(R6::is.R6(input_json$`hates_flavor`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for NatureDetail: the required field `hates_flavor` is missing."))
      }
      # check the required field `berries`
      if (!is.null(input_json$`berries`)) {
        stopifnot(is.vector(input_json$`berries`), length(input_json$`berries`) != 0)
        tmp <- sapply(input_json$`berries`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for NatureDetail: the required field `berries` is missing."))
      }
      # check the required field `pokeathlon_stat_changes`
      if (!is.null(input_json$`pokeathlon_stat_changes`)) {
        stopifnot(is.vector(input_json$`pokeathlon_stat_changes`), length(input_json$`pokeathlon_stat_changes`) != 0)
        tmp <- sapply(input_json$`pokeathlon_stat_changes`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for NatureDetail: the required field `pokeathlon_stat_changes` is missing."))
      }
      # check the required field `move_battle_style_preferences`
      if (!is.null(input_json$`move_battle_style_preferences`)) {
        stopifnot(is.vector(input_json$`move_battle_style_preferences`), length(input_json$`move_battle_style_preferences`) != 0)
        tmp <- sapply(input_json$`move_battle_style_preferences`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for NatureDetail: the required field `move_battle_style_preferences` is missing."))
      }
      # check the required field `names`
      if (!is.null(input_json$`names`)) {
        stopifnot(is.vector(input_json$`names`), length(input_json$`names`) != 0)
        tmp <- sapply(input_json$`names`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for NatureDetail: the required field `names` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of NatureDetail
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

      # check if the required `decreased_stat` is null
      if (is.null(self$`decreased_stat`)) {
        return(FALSE)
      }

      # check if the required `increased_stat` is null
      if (is.null(self$`increased_stat`)) {
        return(FALSE)
      }

      # check if the required `likes_flavor` is null
      if (is.null(self$`likes_flavor`)) {
        return(FALSE)
      }

      # check if the required `hates_flavor` is null
      if (is.null(self$`hates_flavor`)) {
        return(FALSE)
      }

      # check if the required `berries` is null
      if (is.null(self$`berries`)) {
        return(FALSE)
      }

      # check if the required `pokeathlon_stat_changes` is null
      if (is.null(self$`pokeathlon_stat_changes`)) {
        return(FALSE)
      }

      # check if the required `move_battle_style_preferences` is null
      if (is.null(self$`move_battle_style_preferences`)) {
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

      # check if the required `decreased_stat` is null
      if (is.null(self$`decreased_stat`)) {
        invalid_fields["decreased_stat"] <- "Non-nullable required field `decreased_stat` cannot be null."
      }

      # check if the required `increased_stat` is null
      if (is.null(self$`increased_stat`)) {
        invalid_fields["increased_stat"] <- "Non-nullable required field `increased_stat` cannot be null."
      }

      # check if the required `likes_flavor` is null
      if (is.null(self$`likes_flavor`)) {
        invalid_fields["likes_flavor"] <- "Non-nullable required field `likes_flavor` cannot be null."
      }

      # check if the required `hates_flavor` is null
      if (is.null(self$`hates_flavor`)) {
        invalid_fields["hates_flavor"] <- "Non-nullable required field `hates_flavor` cannot be null."
      }

      # check if the required `berries` is null
      if (is.null(self$`berries`)) {
        invalid_fields["berries"] <- "Non-nullable required field `berries` cannot be null."
      }

      # check if the required `pokeathlon_stat_changes` is null
      if (is.null(self$`pokeathlon_stat_changes`)) {
        invalid_fields["pokeathlon_stat_changes"] <- "Non-nullable required field `pokeathlon_stat_changes` cannot be null."
      }

      # check if the required `move_battle_style_preferences` is null
      if (is.null(self$`move_battle_style_preferences`)) {
        invalid_fields["move_battle_style_preferences"] <- "Non-nullable required field `move_battle_style_preferences` cannot be null."
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
# NatureDetail$unlock()
#
## Below is an example to define the print function
# NatureDetail$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# NatureDetail$lock()

