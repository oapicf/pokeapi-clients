#' Create a new PokemonFormDetail
#'
#' @description
#' PokemonFormDetail Class
#'
#' @docType class
#' @title PokemonFormDetail
#' @description PokemonFormDetail Class
#' @format An \code{R6Class} generator object
#' @field id  integer
#' @field name  character
#' @field order  integer [optional]
#' @field form_order  integer [optional]
#' @field is_default  character [optional]
#' @field is_battle_only  character [optional]
#' @field is_mega  character [optional]
#' @field form_name  character
#' @field pokemon  \link{PokemonSummary}
#' @field sprites  \link{PokemonFormDetailSprites}
#' @field version_group  \link{VersionGroupSummary}
#' @field form_names  list(\link{PokemonFormDetailFormNamesInner})
#' @field names  list(\link{PokemonFormDetailFormNamesInner})
#' @field types  list(\link{PokemonDetailTypesInner})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PokemonFormDetail <- R6::R6Class(
  "PokemonFormDetail",
  public = list(
    `id` = NULL,
    `name` = NULL,
    `order` = NULL,
    `form_order` = NULL,
    `is_default` = NULL,
    `is_battle_only` = NULL,
    `is_mega` = NULL,
    `form_name` = NULL,
    `pokemon` = NULL,
    `sprites` = NULL,
    `version_group` = NULL,
    `form_names` = NULL,
    `names` = NULL,
    `types` = NULL,

    #' @description
    #' Initialize a new PokemonFormDetail class.
    #'
    #' @param id id
    #' @param name name
    #' @param form_name form_name
    #' @param pokemon pokemon
    #' @param sprites sprites
    #' @param version_group version_group
    #' @param form_names form_names
    #' @param names names
    #' @param types types
    #' @param order order
    #' @param form_order form_order
    #' @param is_default is_default
    #' @param is_battle_only is_battle_only
    #' @param is_mega is_mega
    #' @param ... Other optional arguments.
    initialize = function(`id`, `name`, `form_name`, `pokemon`, `sprites`, `version_group`, `form_names`, `names`, `types`, `order` = NULL, `form_order` = NULL, `is_default` = NULL, `is_battle_only` = NULL, `is_mega` = NULL, ...) {
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
      if (!missing(`form_name`)) {
        if (!(is.character(`form_name`) && length(`form_name`) == 1)) {
          stop(paste("Error! Invalid data for `form_name`. Must be a string:", `form_name`))
        }
        self$`form_name` <- `form_name`
      }
      if (!missing(`pokemon`)) {
        stopifnot(R6::is.R6(`pokemon`))
        self$`pokemon` <- `pokemon`
      }
      if (!missing(`sprites`)) {
        stopifnot(R6::is.R6(`sprites`))
        self$`sprites` <- `sprites`
      }
      if (!missing(`version_group`)) {
        stopifnot(R6::is.R6(`version_group`))
        self$`version_group` <- `version_group`
      }
      if (!missing(`form_names`)) {
        stopifnot(is.vector(`form_names`), length(`form_names`) != 0)
        sapply(`form_names`, function(x) stopifnot(R6::is.R6(x)))
        self$`form_names` <- `form_names`
      }
      if (!missing(`names`)) {
        stopifnot(is.vector(`names`), length(`names`) != 0)
        sapply(`names`, function(x) stopifnot(R6::is.R6(x)))
        self$`names` <- `names`
      }
      if (!missing(`types`)) {
        stopifnot(is.vector(`types`), length(`types`) != 0)
        sapply(`types`, function(x) stopifnot(R6::is.R6(x)))
        self$`types` <- `types`
      }
      if (!is.null(`order`)) {
        if (!(is.numeric(`order`) && length(`order`) == 1)) {
          stop(paste("Error! Invalid data for `order`. Must be an integer:", `order`))
        }
        self$`order` <- `order`
      }
      if (!is.null(`form_order`)) {
        if (!(is.numeric(`form_order`) && length(`form_order`) == 1)) {
          stop(paste("Error! Invalid data for `form_order`. Must be an integer:", `form_order`))
        }
        self$`form_order` <- `form_order`
      }
      if (!is.null(`is_default`)) {
        if (!(is.logical(`is_default`) && length(`is_default`) == 1)) {
          stop(paste("Error! Invalid data for `is_default`. Must be a boolean:", `is_default`))
        }
        self$`is_default` <- `is_default`
      }
      if (!is.null(`is_battle_only`)) {
        if (!(is.logical(`is_battle_only`) && length(`is_battle_only`) == 1)) {
          stop(paste("Error! Invalid data for `is_battle_only`. Must be a boolean:", `is_battle_only`))
        }
        self$`is_battle_only` <- `is_battle_only`
      }
      if (!is.null(`is_mega`)) {
        if (!(is.logical(`is_mega`) && length(`is_mega`) == 1)) {
          stop(paste("Error! Invalid data for `is_mega`. Must be a boolean:", `is_mega`))
        }
        self$`is_mega` <- `is_mega`
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
    #' @return PokemonFormDetail as a base R list.
    #' @examples
    #' # convert array of PokemonFormDetail (x) to a data frame
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
    #' Convert PokemonFormDetail to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      PokemonFormDetailObject <- list()
      if (!is.null(self$`id`)) {
        PokemonFormDetailObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`name`)) {
        PokemonFormDetailObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`order`)) {
        PokemonFormDetailObject[["order"]] <-
          self$`order`
      }
      if (!is.null(self$`form_order`)) {
        PokemonFormDetailObject[["form_order"]] <-
          self$`form_order`
      }
      if (!is.null(self$`is_default`)) {
        PokemonFormDetailObject[["is_default"]] <-
          self$`is_default`
      }
      if (!is.null(self$`is_battle_only`)) {
        PokemonFormDetailObject[["is_battle_only"]] <-
          self$`is_battle_only`
      }
      if (!is.null(self$`is_mega`)) {
        PokemonFormDetailObject[["is_mega"]] <-
          self$`is_mega`
      }
      if (!is.null(self$`form_name`)) {
        PokemonFormDetailObject[["form_name"]] <-
          self$`form_name`
      }
      if (!is.null(self$`pokemon`)) {
        PokemonFormDetailObject[["pokemon"]] <-
          self$`pokemon`$toSimpleType()
      }
      if (!is.null(self$`sprites`)) {
        PokemonFormDetailObject[["sprites"]] <-
          self$`sprites`$toSimpleType()
      }
      if (!is.null(self$`version_group`)) {
        PokemonFormDetailObject[["version_group"]] <-
          self$`version_group`$toSimpleType()
      }
      if (!is.null(self$`form_names`)) {
        PokemonFormDetailObject[["form_names"]] <-
          lapply(self$`form_names`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`names`)) {
        PokemonFormDetailObject[["names"]] <-
          lapply(self$`names`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`types`)) {
        PokemonFormDetailObject[["types"]] <-
          lapply(self$`types`, function(x) x$toSimpleType())
      }
      return(PokemonFormDetailObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of PokemonFormDetail
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokemonFormDetail
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`order`)) {
        self$`order` <- this_object$`order`
      }
      if (!is.null(this_object$`form_order`)) {
        self$`form_order` <- this_object$`form_order`
      }
      if (!is.null(this_object$`is_default`)) {
        self$`is_default` <- this_object$`is_default`
      }
      if (!is.null(this_object$`is_battle_only`)) {
        self$`is_battle_only` <- this_object$`is_battle_only`
      }
      if (!is.null(this_object$`is_mega`)) {
        self$`is_mega` <- this_object$`is_mega`
      }
      if (!is.null(this_object$`form_name`)) {
        self$`form_name` <- this_object$`form_name`
      }
      if (!is.null(this_object$`pokemon`)) {
        `pokemon_object` <- PokemonSummary$new()
        `pokemon_object`$fromJSON(jsonlite::toJSON(this_object$`pokemon`, auto_unbox = TRUE, digits = NA))
        self$`pokemon` <- `pokemon_object`
      }
      if (!is.null(this_object$`sprites`)) {
        `sprites_object` <- PokemonFormDetailSprites$new()
        `sprites_object`$fromJSON(jsonlite::toJSON(this_object$`sprites`, auto_unbox = TRUE, digits = NA))
        self$`sprites` <- `sprites_object`
      }
      if (!is.null(this_object$`version_group`)) {
        `version_group_object` <- VersionGroupSummary$new()
        `version_group_object`$fromJSON(jsonlite::toJSON(this_object$`version_group`, auto_unbox = TRUE, digits = NA))
        self$`version_group` <- `version_group_object`
      }
      if (!is.null(this_object$`form_names`)) {
        self$`form_names` <- ApiClient$new()$deserializeObj(this_object$`form_names`, "array[PokemonFormDetailFormNamesInner]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`names`)) {
        self$`names` <- ApiClient$new()$deserializeObj(this_object$`names`, "array[PokemonFormDetailFormNamesInner]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`types`)) {
        self$`types` <- ApiClient$new()$deserializeObj(this_object$`types`, "array[PokemonDetailTypesInner]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return PokemonFormDetail in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of PokemonFormDetail
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokemonFormDetail
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`name` <- this_object$`name`
      self$`order` <- this_object$`order`
      self$`form_order` <- this_object$`form_order`
      self$`is_default` <- this_object$`is_default`
      self$`is_battle_only` <- this_object$`is_battle_only`
      self$`is_mega` <- this_object$`is_mega`
      self$`form_name` <- this_object$`form_name`
      self$`pokemon` <- PokemonSummary$new()$fromJSON(jsonlite::toJSON(this_object$`pokemon`, auto_unbox = TRUE, digits = NA))
      self$`sprites` <- PokemonFormDetailSprites$new()$fromJSON(jsonlite::toJSON(this_object$`sprites`, auto_unbox = TRUE, digits = NA))
      self$`version_group` <- VersionGroupSummary$new()$fromJSON(jsonlite::toJSON(this_object$`version_group`, auto_unbox = TRUE, digits = NA))
      self$`form_names` <- ApiClient$new()$deserializeObj(this_object$`form_names`, "array[PokemonFormDetailFormNamesInner]", loadNamespace("openapi"))
      self$`names` <- ApiClient$new()$deserializeObj(this_object$`names`, "array[PokemonFormDetailFormNamesInner]", loadNamespace("openapi"))
      self$`types` <- ApiClient$new()$deserializeObj(this_object$`types`, "array[PokemonDetailTypesInner]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to PokemonFormDetail and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for PokemonFormDetail: the required field `id` is missing."))
      }
      # check the required field `name`
      if (!is.null(input_json$`name`)) {
        if (!(is.character(input_json$`name`) && length(input_json$`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", input_json$`name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonFormDetail: the required field `name` is missing."))
      }
      # check the required field `form_name`
      if (!is.null(input_json$`form_name`)) {
        if (!(is.character(input_json$`form_name`) && length(input_json$`form_name`) == 1)) {
          stop(paste("Error! Invalid data for `form_name`. Must be a string:", input_json$`form_name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonFormDetail: the required field `form_name` is missing."))
      }
      # check the required field `pokemon`
      if (!is.null(input_json$`pokemon`)) {
        stopifnot(R6::is.R6(input_json$`pokemon`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonFormDetail: the required field `pokemon` is missing."))
      }
      # check the required field `sprites`
      if (!is.null(input_json$`sprites`)) {
        stopifnot(R6::is.R6(input_json$`sprites`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonFormDetail: the required field `sprites` is missing."))
      }
      # check the required field `version_group`
      if (!is.null(input_json$`version_group`)) {
        stopifnot(R6::is.R6(input_json$`version_group`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonFormDetail: the required field `version_group` is missing."))
      }
      # check the required field `form_names`
      if (!is.null(input_json$`form_names`)) {
        stopifnot(is.vector(input_json$`form_names`), length(input_json$`form_names`) != 0)
        tmp <- sapply(input_json$`form_names`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonFormDetail: the required field `form_names` is missing."))
      }
      # check the required field `names`
      if (!is.null(input_json$`names`)) {
        stopifnot(is.vector(input_json$`names`), length(input_json$`names`) != 0)
        tmp <- sapply(input_json$`names`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonFormDetail: the required field `names` is missing."))
      }
      # check the required field `types`
      if (!is.null(input_json$`types`)) {
        stopifnot(is.vector(input_json$`types`), length(input_json$`types`) != 0)
        tmp <- sapply(input_json$`types`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonFormDetail: the required field `types` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PokemonFormDetail
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

      # check if the required `form_name` is null
      if (is.null(self$`form_name`)) {
        return(FALSE)
      }

      if (nchar(self$`form_name`) > 30) {
        return(FALSE)
      }

      # check if the required `pokemon` is null
      if (is.null(self$`pokemon`)) {
        return(FALSE)
      }

      # check if the required `sprites` is null
      if (is.null(self$`sprites`)) {
        return(FALSE)
      }

      # check if the required `version_group` is null
      if (is.null(self$`version_group`)) {
        return(FALSE)
      }

      # check if the required `form_names` is null
      if (is.null(self$`form_names`)) {
        return(FALSE)
      }

      # check if the required `names` is null
      if (is.null(self$`names`)) {
        return(FALSE)
      }

      # check if the required `types` is null
      if (is.null(self$`types`)) {
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

      # check if the required `form_name` is null
      if (is.null(self$`form_name`)) {
        invalid_fields["form_name"] <- "Non-nullable required field `form_name` cannot be null."
      }

      if (nchar(self$`form_name`) > 30) {
        invalid_fields["form_name"] <- "Invalid length for `form_name`, must be smaller than or equal to 30."
      }

      # check if the required `pokemon` is null
      if (is.null(self$`pokemon`)) {
        invalid_fields["pokemon"] <- "Non-nullable required field `pokemon` cannot be null."
      }

      # check if the required `sprites` is null
      if (is.null(self$`sprites`)) {
        invalid_fields["sprites"] <- "Non-nullable required field `sprites` cannot be null."
      }

      # check if the required `version_group` is null
      if (is.null(self$`version_group`)) {
        invalid_fields["version_group"] <- "Non-nullable required field `version_group` cannot be null."
      }

      # check if the required `form_names` is null
      if (is.null(self$`form_names`)) {
        invalid_fields["form_names"] <- "Non-nullable required field `form_names` cannot be null."
      }

      # check if the required `names` is null
      if (is.null(self$`names`)) {
        invalid_fields["names"] <- "Non-nullable required field `names` cannot be null."
      }

      # check if the required `types` is null
      if (is.null(self$`types`)) {
        invalid_fields["types"] <- "Non-nullable required field `types` cannot be null."
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
# PokemonFormDetail$unlock()
#
## Below is an example to define the print function
# PokemonFormDetail$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PokemonFormDetail$lock()

