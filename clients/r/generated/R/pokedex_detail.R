#' Create a new PokedexDetail
#'
#' @description
#' PokedexDetail Class
#'
#' @docType class
#' @title PokedexDetail
#' @description PokedexDetail Class
#' @format An \code{R6Class} generator object
#' @field id  integer
#' @field name  character
#' @field is_main_series  character [optional]
#' @field descriptions  list(\link{PokedexDescription})
#' @field names  list(\link{PokedexName})
#' @field pokemon_entries  list(\link{PokedexDetailPokemonEntriesInner})
#' @field region  \link{RegionSummary}
#' @field version_groups  list(\link{AbilityDetailPokemonInnerPokemon})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PokedexDetail <- R6::R6Class(
  "PokedexDetail",
  public = list(
    `id` = NULL,
    `name` = NULL,
    `is_main_series` = NULL,
    `descriptions` = NULL,
    `names` = NULL,
    `pokemon_entries` = NULL,
    `region` = NULL,
    `version_groups` = NULL,

    #' @description
    #' Initialize a new PokedexDetail class.
    #'
    #' @param id id
    #' @param name name
    #' @param descriptions descriptions
    #' @param names names
    #' @param pokemon_entries pokemon_entries
    #' @param region region
    #' @param version_groups version_groups
    #' @param is_main_series is_main_series
    #' @param ... Other optional arguments.
    initialize = function(`id`, `name`, `descriptions`, `names`, `pokemon_entries`, `region`, `version_groups`, `is_main_series` = NULL, ...) {
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
      if (!missing(`descriptions`)) {
        stopifnot(is.vector(`descriptions`), length(`descriptions`) != 0)
        sapply(`descriptions`, function(x) stopifnot(R6::is.R6(x)))
        self$`descriptions` <- `descriptions`
      }
      if (!missing(`names`)) {
        stopifnot(is.vector(`names`), length(`names`) != 0)
        sapply(`names`, function(x) stopifnot(R6::is.R6(x)))
        self$`names` <- `names`
      }
      if (!missing(`pokemon_entries`)) {
        stopifnot(is.vector(`pokemon_entries`), length(`pokemon_entries`) != 0)
        sapply(`pokemon_entries`, function(x) stopifnot(R6::is.R6(x)))
        self$`pokemon_entries` <- `pokemon_entries`
      }
      if (!missing(`region`)) {
        stopifnot(R6::is.R6(`region`))
        self$`region` <- `region`
      }
      if (!missing(`version_groups`)) {
        stopifnot(is.vector(`version_groups`), length(`version_groups`) != 0)
        sapply(`version_groups`, function(x) stopifnot(R6::is.R6(x)))
        self$`version_groups` <- `version_groups`
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
    #' @return PokedexDetail as a base R list.
    #' @examples
    #' # convert array of PokedexDetail (x) to a data frame
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
    #' Convert PokedexDetail to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      PokedexDetailObject <- list()
      if (!is.null(self$`id`)) {
        PokedexDetailObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`name`)) {
        PokedexDetailObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`is_main_series`)) {
        PokedexDetailObject[["is_main_series"]] <-
          self$`is_main_series`
      }
      if (!is.null(self$`descriptions`)) {
        PokedexDetailObject[["descriptions"]] <-
          lapply(self$`descriptions`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`names`)) {
        PokedexDetailObject[["names"]] <-
          lapply(self$`names`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`pokemon_entries`)) {
        PokedexDetailObject[["pokemon_entries"]] <-
          lapply(self$`pokemon_entries`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`region`)) {
        PokedexDetailObject[["region"]] <-
          self$`region`$toSimpleType()
      }
      if (!is.null(self$`version_groups`)) {
        PokedexDetailObject[["version_groups"]] <-
          lapply(self$`version_groups`, function(x) x$toSimpleType())
      }
      return(PokedexDetailObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of PokedexDetail
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokedexDetail
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
      if (!is.null(this_object$`descriptions`)) {
        self$`descriptions` <- ApiClient$new()$deserializeObj(this_object$`descriptions`, "array[PokedexDescription]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`names`)) {
        self$`names` <- ApiClient$new()$deserializeObj(this_object$`names`, "array[PokedexName]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`pokemon_entries`)) {
        self$`pokemon_entries` <- ApiClient$new()$deserializeObj(this_object$`pokemon_entries`, "array[PokedexDetailPokemonEntriesInner]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`region`)) {
        `region_object` <- RegionSummary$new()
        `region_object`$fromJSON(jsonlite::toJSON(this_object$`region`, auto_unbox = TRUE, digits = NA))
        self$`region` <- `region_object`
      }
      if (!is.null(this_object$`version_groups`)) {
        self$`version_groups` <- ApiClient$new()$deserializeObj(this_object$`version_groups`, "array[AbilityDetailPokemonInnerPokemon]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return PokedexDetail in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of PokedexDetail
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokedexDetail
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`name` <- this_object$`name`
      self$`is_main_series` <- this_object$`is_main_series`
      self$`descriptions` <- ApiClient$new()$deserializeObj(this_object$`descriptions`, "array[PokedexDescription]", loadNamespace("openapi"))
      self$`names` <- ApiClient$new()$deserializeObj(this_object$`names`, "array[PokedexName]", loadNamespace("openapi"))
      self$`pokemon_entries` <- ApiClient$new()$deserializeObj(this_object$`pokemon_entries`, "array[PokedexDetailPokemonEntriesInner]", loadNamespace("openapi"))
      self$`region` <- RegionSummary$new()$fromJSON(jsonlite::toJSON(this_object$`region`, auto_unbox = TRUE, digits = NA))
      self$`version_groups` <- ApiClient$new()$deserializeObj(this_object$`version_groups`, "array[AbilityDetailPokemonInnerPokemon]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to PokedexDetail and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for PokedexDetail: the required field `id` is missing."))
      }
      # check the required field `name`
      if (!is.null(input_json$`name`)) {
        if (!(is.character(input_json$`name`) && length(input_json$`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", input_json$`name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokedexDetail: the required field `name` is missing."))
      }
      # check the required field `descriptions`
      if (!is.null(input_json$`descriptions`)) {
        stopifnot(is.vector(input_json$`descriptions`), length(input_json$`descriptions`) != 0)
        tmp <- sapply(input_json$`descriptions`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokedexDetail: the required field `descriptions` is missing."))
      }
      # check the required field `names`
      if (!is.null(input_json$`names`)) {
        stopifnot(is.vector(input_json$`names`), length(input_json$`names`) != 0)
        tmp <- sapply(input_json$`names`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokedexDetail: the required field `names` is missing."))
      }
      # check the required field `pokemon_entries`
      if (!is.null(input_json$`pokemon_entries`)) {
        stopifnot(is.vector(input_json$`pokemon_entries`), length(input_json$`pokemon_entries`) != 0)
        tmp <- sapply(input_json$`pokemon_entries`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokedexDetail: the required field `pokemon_entries` is missing."))
      }
      # check the required field `region`
      if (!is.null(input_json$`region`)) {
        stopifnot(R6::is.R6(input_json$`region`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokedexDetail: the required field `region` is missing."))
      }
      # check the required field `version_groups`
      if (!is.null(input_json$`version_groups`)) {
        stopifnot(is.vector(input_json$`version_groups`), length(input_json$`version_groups`) != 0)
        tmp <- sapply(input_json$`version_groups`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokedexDetail: the required field `version_groups` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PokedexDetail
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

      # check if the required `descriptions` is null
      if (is.null(self$`descriptions`)) {
        return(FALSE)
      }

      # check if the required `names` is null
      if (is.null(self$`names`)) {
        return(FALSE)
      }

      # check if the required `pokemon_entries` is null
      if (is.null(self$`pokemon_entries`)) {
        return(FALSE)
      }

      # check if the required `region` is null
      if (is.null(self$`region`)) {
        return(FALSE)
      }

      # check if the required `version_groups` is null
      if (is.null(self$`version_groups`)) {
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

      # check if the required `descriptions` is null
      if (is.null(self$`descriptions`)) {
        invalid_fields["descriptions"] <- "Non-nullable required field `descriptions` cannot be null."
      }

      # check if the required `names` is null
      if (is.null(self$`names`)) {
        invalid_fields["names"] <- "Non-nullable required field `names` cannot be null."
      }

      # check if the required `pokemon_entries` is null
      if (is.null(self$`pokemon_entries`)) {
        invalid_fields["pokemon_entries"] <- "Non-nullable required field `pokemon_entries` cannot be null."
      }

      # check if the required `region` is null
      if (is.null(self$`region`)) {
        invalid_fields["region"] <- "Non-nullable required field `region` cannot be null."
      }

      # check if the required `version_groups` is null
      if (is.null(self$`version_groups`)) {
        invalid_fields["version_groups"] <- "Non-nullable required field `version_groups` cannot be null."
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
# PokedexDetail$unlock()
#
## Below is an example to define the print function
# PokedexDetail$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PokedexDetail$lock()

