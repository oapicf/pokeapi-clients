#' Create a new PokemonFormDetail
#'
#' @description
#' PokemonFormDetail Class
#'
#' @docType class
#' @title PokemonFormDetail
#' @description PokemonFormDetail Class
#' @format An \code{R6Class} generator object
#' @field id The identifier for this resource. integer
#' @field name The name for this resource. character
#' @field order The order in which forms should be sorted within all forms. Multiple forms may have equal order, in which case they should fall back on sorting by name. integer [optional]
#' @field form_order The order in which forms should be sorted within a species' forms. integer [optional]
#' @field is_default True for exactly one form used as the default for each Pokémon. character [optional]
#' @field is_battle_only Whether or not this form can only happen during battle. character [optional]
#' @field is_mega Whether or not this form requires mega evolution. character [optional]
#' @field form_name The name of this form. character
#' @field pokemon The Pokémon that can take on this form. \link{PokemonSummary}
#' @field sprites A set of sprites used to depict this Pokémon form in the game. \link{PokemonFormSprites}
#' @field version_group The version group this Pokémon form was introduced in. \link{VersionGroupSummary}
#' @field form_names The form specific form name of this Pokémon form, or empty if the form does not have a specific name. list(\link{PokemonFormName})
#' @field names The form specific full name of this Pokémon form, or empty if the form does not have a specific name. list(\link{PokemonFormName})
#' @field types A list of details showing types this Pokémon form has. list(\link{PokemonFormType})
#' @field trigger_conditions The conditions that trigger this form. Resource names and URLs are included when the trigger requires a resource. list(\link{PokemonFormTriggerCondition})
#' @field flavor_text_entries The flavor text of this form listed in different languages and versions. list(\link{PokemonFormFlavorText})
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
    `trigger_conditions` = NULL,
    `flavor_text_entries` = NULL,

    #' @description
    #' Initialize a new PokemonFormDetail class.
    #'
    #' @param id The identifier for this resource.
    #' @param name The name for this resource.
    #' @param form_name The name of this form.
    #' @param pokemon The Pokémon that can take on this form.
    #' @param sprites A set of sprites used to depict this Pokémon form in the game.
    #' @param version_group The version group this Pokémon form was introduced in.
    #' @param form_names The form specific form name of this Pokémon form, or empty if the form does not have a specific name.
    #' @param names The form specific full name of this Pokémon form, or empty if the form does not have a specific name.
    #' @param types A list of details showing types this Pokémon form has.
    #' @param trigger_conditions The conditions that trigger this form. Resource names and URLs are included when the trigger requires a resource.
    #' @param flavor_text_entries The flavor text of this form listed in different languages and versions.
    #' @param order The order in which forms should be sorted within all forms. Multiple forms may have equal order, in which case they should fall back on sorting by name.
    #' @param form_order The order in which forms should be sorted within a species' forms.
    #' @param is_default True for exactly one form used as the default for each Pokémon.
    #' @param is_battle_only Whether or not this form can only happen during battle.
    #' @param is_mega Whether or not this form requires mega evolution.
    #' @param ... Other optional arguments.
    initialize = function(`id`, `name`, `form_name`, `pokemon`, `sprites`, `version_group`, `form_names`, `names`, `types`, `trigger_conditions`, `flavor_text_entries`, `order` = NULL, `form_order` = NULL, `is_default` = NULL, `is_battle_only` = NULL, `is_mega` = NULL, ...) {
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
      if (!missing(`trigger_conditions`)) {
        stopifnot(is.vector(`trigger_conditions`), length(`trigger_conditions`) != 0)
        sapply(`trigger_conditions`, function(x) stopifnot(R6::is.R6(x)))
        self$`trigger_conditions` <- `trigger_conditions`
      }
      if (!missing(`flavor_text_entries`)) {
        stopifnot(is.vector(`flavor_text_entries`), length(`flavor_text_entries`) != 0)
        sapply(`flavor_text_entries`, function(x) stopifnot(R6::is.R6(x)))
        self$`flavor_text_entries` <- `flavor_text_entries`
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
          self$extractSimpleType(self$`pokemon`)
      }
      if (!is.null(self$`sprites`)) {
        PokemonFormDetailObject[["sprites"]] <-
          self$extractSimpleType(self$`sprites`)
      }
      if (!is.null(self$`version_group`)) {
        PokemonFormDetailObject[["version_group"]] <-
          self$extractSimpleType(self$`version_group`)
      }
      if (!is.null(self$`form_names`)) {
        PokemonFormDetailObject[["form_names"]] <-
          self$extractSimpleType(self$`form_names`)
      }
      if (!is.null(self$`names`)) {
        PokemonFormDetailObject[["names"]] <-
          self$extractSimpleType(self$`names`)
      }
      if (!is.null(self$`types`)) {
        PokemonFormDetailObject[["types"]] <-
          self$extractSimpleType(self$`types`)
      }
      if (!is.null(self$`trigger_conditions`)) {
        PokemonFormDetailObject[["trigger_conditions"]] <-
          self$extractSimpleType(self$`trigger_conditions`)
      }
      if (!is.null(self$`flavor_text_entries`)) {
        PokemonFormDetailObject[["flavor_text_entries"]] <-
          self$extractSimpleType(self$`flavor_text_entries`)
      }
      return(PokemonFormDetailObject)
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
        `sprites_object` <- PokemonFormSprites$new()
        `sprites_object`$fromJSON(jsonlite::toJSON(this_object$`sprites`, auto_unbox = TRUE, digits = NA))
        self$`sprites` <- `sprites_object`
      }
      if (!is.null(this_object$`version_group`)) {
        `version_group_object` <- VersionGroupSummary$new()
        `version_group_object`$fromJSON(jsonlite::toJSON(this_object$`version_group`, auto_unbox = TRUE, digits = NA))
        self$`version_group` <- `version_group_object`
      }
      if (!is.null(this_object$`form_names`)) {
        self$`form_names` <- ApiClient$new()$deserializeObj(this_object$`form_names`, "array[PokemonFormName]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`names`)) {
        self$`names` <- ApiClient$new()$deserializeObj(this_object$`names`, "array[PokemonFormName]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`types`)) {
        self$`types` <- ApiClient$new()$deserializeObj(this_object$`types`, "array[PokemonFormType]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`trigger_conditions`)) {
        self$`trigger_conditions` <- ApiClient$new()$deserializeObj(this_object$`trigger_conditions`, "array[PokemonFormTriggerCondition]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`flavor_text_entries`)) {
        self$`flavor_text_entries` <- ApiClient$new()$deserializeObj(this_object$`flavor_text_entries`, "array[PokemonFormFlavorText]", loadNamespace("openapi"))
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
      self$`sprites` <- PokemonFormSprites$new()$fromJSON(jsonlite::toJSON(this_object$`sprites`, auto_unbox = TRUE, digits = NA))
      self$`version_group` <- VersionGroupSummary$new()$fromJSON(jsonlite::toJSON(this_object$`version_group`, auto_unbox = TRUE, digits = NA))
      self$`form_names` <- ApiClient$new()$deserializeObj(this_object$`form_names`, "array[PokemonFormName]", loadNamespace("openapi"))
      self$`names` <- ApiClient$new()$deserializeObj(this_object$`names`, "array[PokemonFormName]", loadNamespace("openapi"))
      self$`types` <- ApiClient$new()$deserializeObj(this_object$`types`, "array[PokemonFormType]", loadNamespace("openapi"))
      self$`trigger_conditions` <- ApiClient$new()$deserializeObj(this_object$`trigger_conditions`, "array[PokemonFormTriggerCondition]", loadNamespace("openapi"))
      self$`flavor_text_entries` <- ApiClient$new()$deserializeObj(this_object$`flavor_text_entries`, "array[PokemonFormFlavorText]", loadNamespace("openapi"))
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
      # check the required field `trigger_conditions`
      if (!is.null(input_json$`trigger_conditions`)) {
        stopifnot(is.vector(input_json$`trigger_conditions`), length(input_json$`trigger_conditions`) != 0)
        tmp <- sapply(input_json$`trigger_conditions`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonFormDetail: the required field `trigger_conditions` is missing."))
      }
      # check the required field `flavor_text_entries`
      if (!is.null(input_json$`flavor_text_entries`)) {
        stopifnot(is.vector(input_json$`flavor_text_entries`), length(input_json$`flavor_text_entries`) != 0)
        tmp <- sapply(input_json$`flavor_text_entries`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonFormDetail: the required field `flavor_text_entries` is missing."))
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

      if (nchar(self$`name`) > 200) {
        return(FALSE)
      }

      if (self$`order` > 2147483647) {
        return(FALSE)
      }
      if (self$`order` < -2147483648) {
        return(FALSE)
      }

      if (self$`form_order` > 2147483647) {
        return(FALSE)
      }
      if (self$`form_order` < -2147483648) {
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

      # check if the required `trigger_conditions` is null
      if (is.null(self$`trigger_conditions`)) {
        return(FALSE)
      }

      # check if the required `flavor_text_entries` is null
      if (is.null(self$`flavor_text_entries`)) {
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

      if (self$`order` > 2147483647) {
        invalid_fields["order"] <- "Invalid value for `order`, must be smaller than or equal to 2147483647."
      }
      if (self$`order` < -2147483648) {
        invalid_fields["order"] <- "Invalid value for `order`, must be bigger than or equal to -2147483648."
      }

      if (self$`form_order` > 2147483647) {
        invalid_fields["form_order"] <- "Invalid value for `form_order`, must be smaller than or equal to 2147483647."
      }
      if (self$`form_order` < -2147483648) {
        invalid_fields["form_order"] <- "Invalid value for `form_order`, must be bigger than or equal to -2147483648."
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

      # check if the required `trigger_conditions` is null
      if (is.null(self$`trigger_conditions`)) {
        invalid_fields["trigger_conditions"] <- "Non-nullable required field `trigger_conditions` cannot be null."
      }

      # check if the required `flavor_text_entries` is null
      if (is.null(self$`flavor_text_entries`)) {
        invalid_fields["flavor_text_entries"] <- "Non-nullable required field `flavor_text_entries` cannot be null."
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

