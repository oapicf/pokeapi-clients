#' Create a new AbilityDetail
#'
#' @description
#' AbilityDetail Class
#'
#' @docType class
#' @title AbilityDetail
#' @description AbilityDetail Class
#' @format An \code{R6Class} generator object
#' @field id  integer
#' @field name  character
#' @field is_main_series  character [optional]
#' @field generation  \link{GenerationSummary}
#' @field names  list(\link{AbilityName})
#' @field effect_entries  list(\link{AbilityEffectText})
#' @field effect_changes  list(\link{AbilityChange})
#' @field flavor_text_entries  list(\link{AbilityFlavorText})
#' @field pokemon  list(\link{AbilityDetailPokemonInner})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AbilityDetail <- R6::R6Class(
  "AbilityDetail",
  public = list(
    `id` = NULL,
    `name` = NULL,
    `is_main_series` = NULL,
    `generation` = NULL,
    `names` = NULL,
    `effect_entries` = NULL,
    `effect_changes` = NULL,
    `flavor_text_entries` = NULL,
    `pokemon` = NULL,

    #' @description
    #' Initialize a new AbilityDetail class.
    #'
    #' @param id id
    #' @param name name
    #' @param generation generation
    #' @param names names
    #' @param effect_entries effect_entries
    #' @param effect_changes effect_changes
    #' @param flavor_text_entries flavor_text_entries
    #' @param pokemon pokemon
    #' @param is_main_series is_main_series
    #' @param ... Other optional arguments.
    initialize = function(`id`, `name`, `generation`, `names`, `effect_entries`, `effect_changes`, `flavor_text_entries`, `pokemon`, `is_main_series` = NULL, ...) {
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
      if (!missing(`generation`)) {
        stopifnot(R6::is.R6(`generation`))
        self$`generation` <- `generation`
      }
      if (!missing(`names`)) {
        stopifnot(is.vector(`names`), length(`names`) != 0)
        sapply(`names`, function(x) stopifnot(R6::is.R6(x)))
        self$`names` <- `names`
      }
      if (!missing(`effect_entries`)) {
        stopifnot(is.vector(`effect_entries`), length(`effect_entries`) != 0)
        sapply(`effect_entries`, function(x) stopifnot(R6::is.R6(x)))
        self$`effect_entries` <- `effect_entries`
      }
      if (!missing(`effect_changes`)) {
        stopifnot(is.vector(`effect_changes`), length(`effect_changes`) != 0)
        sapply(`effect_changes`, function(x) stopifnot(R6::is.R6(x)))
        self$`effect_changes` <- `effect_changes`
      }
      if (!missing(`flavor_text_entries`)) {
        stopifnot(is.vector(`flavor_text_entries`), length(`flavor_text_entries`) != 0)
        sapply(`flavor_text_entries`, function(x) stopifnot(R6::is.R6(x)))
        self$`flavor_text_entries` <- `flavor_text_entries`
      }
      if (!missing(`pokemon`)) {
        stopifnot(is.vector(`pokemon`), length(`pokemon`) != 0)
        sapply(`pokemon`, function(x) stopifnot(R6::is.R6(x)))
        self$`pokemon` <- `pokemon`
      }
      if (!is.null(`is_main_series`)) {
        if (!(is.logical(`is_main_series`) && length(`is_main_series`) == 1)) {
          stop(paste("Error! Invalid data for `is_main_series`. Must be a boolean:", `is_main_series`))
        }
        self$`is_main_series` <- `is_main_series`
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
    #' @return AbilityDetail as a base R list.
    #' @examples
    #' # convert array of AbilityDetail (x) to a data frame
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
    #' Convert AbilityDetail to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      AbilityDetailObject <- list()
      if (!is.null(self$`id`)) {
        AbilityDetailObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`name`)) {
        AbilityDetailObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`is_main_series`)) {
        AbilityDetailObject[["is_main_series"]] <-
          self$`is_main_series`
      }
      if (!is.null(self$`generation`)) {
        AbilityDetailObject[["generation"]] <-
          self$`generation`$toSimpleType()
      }
      if (!is.null(self$`names`)) {
        AbilityDetailObject[["names"]] <-
          lapply(self$`names`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`effect_entries`)) {
        AbilityDetailObject[["effect_entries"]] <-
          lapply(self$`effect_entries`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`effect_changes`)) {
        AbilityDetailObject[["effect_changes"]] <-
          lapply(self$`effect_changes`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`flavor_text_entries`)) {
        AbilityDetailObject[["flavor_text_entries"]] <-
          lapply(self$`flavor_text_entries`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`pokemon`)) {
        AbilityDetailObject[["pokemon"]] <-
          lapply(self$`pokemon`, function(x) x$toSimpleType())
      }
      return(AbilityDetailObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of AbilityDetail
    #'
    #' @param input_json the JSON input
    #' @return the instance of AbilityDetail
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`is_main_series`)) {
        self$`is_main_series` <- this_object$`is_main_series`
      }
      if (!is.null(this_object$`generation`)) {
        `generation_object` <- GenerationSummary$new()
        `generation_object`$fromJSON(jsonlite::toJSON(this_object$`generation`, auto_unbox = TRUE, digits = NA))
        self$`generation` <- `generation_object`
      }
      if (!is.null(this_object$`names`)) {
        self$`names` <- ApiClient$new()$deserializeObj(this_object$`names`, "array[AbilityName]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`effect_entries`)) {
        self$`effect_entries` <- ApiClient$new()$deserializeObj(this_object$`effect_entries`, "array[AbilityEffectText]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`effect_changes`)) {
        self$`effect_changes` <- ApiClient$new()$deserializeObj(this_object$`effect_changes`, "array[AbilityChange]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`flavor_text_entries`)) {
        self$`flavor_text_entries` <- ApiClient$new()$deserializeObj(this_object$`flavor_text_entries`, "array[AbilityFlavorText]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`pokemon`)) {
        self$`pokemon` <- ApiClient$new()$deserializeObj(this_object$`pokemon`, "array[AbilityDetailPokemonInner]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return AbilityDetail in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AbilityDetail
    #'
    #' @param input_json the JSON input
    #' @return the instance of AbilityDetail
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`name` <- this_object$`name`
      self$`is_main_series` <- this_object$`is_main_series`
      self$`generation` <- GenerationSummary$new()$fromJSON(jsonlite::toJSON(this_object$`generation`, auto_unbox = TRUE, digits = NA))
      self$`names` <- ApiClient$new()$deserializeObj(this_object$`names`, "array[AbilityName]", loadNamespace("openapi"))
      self$`effect_entries` <- ApiClient$new()$deserializeObj(this_object$`effect_entries`, "array[AbilityEffectText]", loadNamespace("openapi"))
      self$`effect_changes` <- ApiClient$new()$deserializeObj(this_object$`effect_changes`, "array[AbilityChange]", loadNamespace("openapi"))
      self$`flavor_text_entries` <- ApiClient$new()$deserializeObj(this_object$`flavor_text_entries`, "array[AbilityFlavorText]", loadNamespace("openapi"))
      self$`pokemon` <- ApiClient$new()$deserializeObj(this_object$`pokemon`, "array[AbilityDetailPokemonInner]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to AbilityDetail and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for AbilityDetail: the required field `id` is missing."))
      }
      # check the required field `name`
      if (!is.null(input_json$`name`)) {
        if (!(is.character(input_json$`name`) && length(input_json$`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", input_json$`name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AbilityDetail: the required field `name` is missing."))
      }
      # check the required field `generation`
      if (!is.null(input_json$`generation`)) {
        stopifnot(R6::is.R6(input_json$`generation`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AbilityDetail: the required field `generation` is missing."))
      }
      # check the required field `names`
      if (!is.null(input_json$`names`)) {
        stopifnot(is.vector(input_json$`names`), length(input_json$`names`) != 0)
        tmp <- sapply(input_json$`names`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AbilityDetail: the required field `names` is missing."))
      }
      # check the required field `effect_entries`
      if (!is.null(input_json$`effect_entries`)) {
        stopifnot(is.vector(input_json$`effect_entries`), length(input_json$`effect_entries`) != 0)
        tmp <- sapply(input_json$`effect_entries`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AbilityDetail: the required field `effect_entries` is missing."))
      }
      # check the required field `effect_changes`
      if (!is.null(input_json$`effect_changes`)) {
        stopifnot(is.vector(input_json$`effect_changes`), length(input_json$`effect_changes`) != 0)
        tmp <- sapply(input_json$`effect_changes`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AbilityDetail: the required field `effect_changes` is missing."))
      }
      # check the required field `flavor_text_entries`
      if (!is.null(input_json$`flavor_text_entries`)) {
        stopifnot(is.vector(input_json$`flavor_text_entries`), length(input_json$`flavor_text_entries`) != 0)
        tmp <- sapply(input_json$`flavor_text_entries`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AbilityDetail: the required field `flavor_text_entries` is missing."))
      }
      # check the required field `pokemon`
      if (!is.null(input_json$`pokemon`)) {
        stopifnot(is.vector(input_json$`pokemon`), length(input_json$`pokemon`) != 0)
        tmp <- sapply(input_json$`pokemon`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AbilityDetail: the required field `pokemon` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AbilityDetail
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

      # check if the required `generation` is null
      if (is.null(self$`generation`)) {
        return(FALSE)
      }

      # check if the required `names` is null
      if (is.null(self$`names`)) {
        return(FALSE)
      }

      # check if the required `effect_entries` is null
      if (is.null(self$`effect_entries`)) {
        return(FALSE)
      }

      # check if the required `effect_changes` is null
      if (is.null(self$`effect_changes`)) {
        return(FALSE)
      }

      # check if the required `flavor_text_entries` is null
      if (is.null(self$`flavor_text_entries`)) {
        return(FALSE)
      }

      # check if the required `pokemon` is null
      if (is.null(self$`pokemon`)) {
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

      # check if the required `generation` is null
      if (is.null(self$`generation`)) {
        invalid_fields["generation"] <- "Non-nullable required field `generation` cannot be null."
      }

      # check if the required `names` is null
      if (is.null(self$`names`)) {
        invalid_fields["names"] <- "Non-nullable required field `names` cannot be null."
      }

      # check if the required `effect_entries` is null
      if (is.null(self$`effect_entries`)) {
        invalid_fields["effect_entries"] <- "Non-nullable required field `effect_entries` cannot be null."
      }

      # check if the required `effect_changes` is null
      if (is.null(self$`effect_changes`)) {
        invalid_fields["effect_changes"] <- "Non-nullable required field `effect_changes` cannot be null."
      }

      # check if the required `flavor_text_entries` is null
      if (is.null(self$`flavor_text_entries`)) {
        invalid_fields["flavor_text_entries"] <- "Non-nullable required field `flavor_text_entries` cannot be null."
      }

      # check if the required `pokemon` is null
      if (is.null(self$`pokemon`)) {
        invalid_fields["pokemon"] <- "Non-nullable required field `pokemon` cannot be null."
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
# AbilityDetail$unlock()
#
## Below is an example to define the print function
# AbilityDetail$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AbilityDetail$lock()

