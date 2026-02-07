#' Create a new ItemDetail
#'
#' @description
#' ItemDetail Class
#'
#' @docType class
#' @title ItemDetail
#' @description ItemDetail Class
#' @format An \code{R6Class} generator object
#' @field id  integer
#' @field name  character
#' @field cost  integer [optional]
#' @field fling_power  integer [optional]
#' @field fling_effect  \link{ItemFlingEffectSummary}
#' @field attributes  list(\link{AbilityDetailPokemonInnerPokemon})
#' @field category  \link{ItemCategorySummary}
#' @field effect_entries  list(\link{ItemEffectText})
#' @field flavor_text_entries  list(\link{ItemFlavorText})
#' @field game_indices  list(\link{ItemGameIndex})
#' @field names  list(\link{ItemName})
#' @field held_by_pokemon  list(\link{ItemDetailHeldByPokemonInner})
#' @field sprites  \link{ItemDetailSprites}
#' @field baby_trigger_for  \link{ItemDetailBabyTriggerFor}
#' @field machines  list(\link{ItemDetailMachinesInner})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ItemDetail <- R6::R6Class(
  "ItemDetail",
  public = list(
    `id` = NULL,
    `name` = NULL,
    `cost` = NULL,
    `fling_power` = NULL,
    `fling_effect` = NULL,
    `attributes` = NULL,
    `category` = NULL,
    `effect_entries` = NULL,
    `flavor_text_entries` = NULL,
    `game_indices` = NULL,
    `names` = NULL,
    `held_by_pokemon` = NULL,
    `sprites` = NULL,
    `baby_trigger_for` = NULL,
    `machines` = NULL,

    #' @description
    #' Initialize a new ItemDetail class.
    #'
    #' @param id id
    #' @param name name
    #' @param fling_effect fling_effect
    #' @param attributes attributes
    #' @param category category
    #' @param effect_entries effect_entries
    #' @param flavor_text_entries flavor_text_entries
    #' @param game_indices game_indices
    #' @param names names
    #' @param held_by_pokemon held_by_pokemon
    #' @param sprites sprites
    #' @param baby_trigger_for baby_trigger_for
    #' @param machines machines
    #' @param cost cost
    #' @param fling_power fling_power
    #' @param ... Other optional arguments.
    initialize = function(`id`, `name`, `fling_effect`, `attributes`, `category`, `effect_entries`, `flavor_text_entries`, `game_indices`, `names`, `held_by_pokemon`, `sprites`, `baby_trigger_for`, `machines`, `cost` = NULL, `fling_power` = NULL, ...) {
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
      if (!missing(`fling_effect`)) {
        stopifnot(R6::is.R6(`fling_effect`))
        self$`fling_effect` <- `fling_effect`
      }
      if (!missing(`attributes`)) {
        stopifnot(is.vector(`attributes`), length(`attributes`) != 0)
        sapply(`attributes`, function(x) stopifnot(R6::is.R6(x)))
        self$`attributes` <- `attributes`
      }
      if (!missing(`category`)) {
        stopifnot(R6::is.R6(`category`))
        self$`category` <- `category`
      }
      if (!missing(`effect_entries`)) {
        stopifnot(is.vector(`effect_entries`), length(`effect_entries`) != 0)
        sapply(`effect_entries`, function(x) stopifnot(R6::is.R6(x)))
        self$`effect_entries` <- `effect_entries`
      }
      if (!missing(`flavor_text_entries`)) {
        stopifnot(is.vector(`flavor_text_entries`), length(`flavor_text_entries`) != 0)
        sapply(`flavor_text_entries`, function(x) stopifnot(R6::is.R6(x)))
        self$`flavor_text_entries` <- `flavor_text_entries`
      }
      if (!missing(`game_indices`)) {
        stopifnot(is.vector(`game_indices`), length(`game_indices`) != 0)
        sapply(`game_indices`, function(x) stopifnot(R6::is.R6(x)))
        self$`game_indices` <- `game_indices`
      }
      if (!missing(`names`)) {
        stopifnot(is.vector(`names`), length(`names`) != 0)
        sapply(`names`, function(x) stopifnot(R6::is.R6(x)))
        self$`names` <- `names`
      }
      if (!missing(`held_by_pokemon`)) {
        stopifnot(is.vector(`held_by_pokemon`), length(`held_by_pokemon`) != 0)
        sapply(`held_by_pokemon`, function(x) stopifnot(R6::is.R6(x)))
        self$`held_by_pokemon` <- `held_by_pokemon`
      }
      if (!missing(`sprites`)) {
        stopifnot(R6::is.R6(`sprites`))
        self$`sprites` <- `sprites`
      }
      if (!missing(`baby_trigger_for`)) {
        stopifnot(R6::is.R6(`baby_trigger_for`))
        self$`baby_trigger_for` <- `baby_trigger_for`
      }
      if (!missing(`machines`)) {
        stopifnot(is.vector(`machines`), length(`machines`) != 0)
        sapply(`machines`, function(x) stopifnot(R6::is.R6(x)))
        self$`machines` <- `machines`
      }
      if (!is.null(`cost`)) {
        if (!(is.numeric(`cost`) && length(`cost`) == 1)) {
          stop(paste("Error! Invalid data for `cost`. Must be an integer:", `cost`))
        }
        self$`cost` <- `cost`
      }
      if (!is.null(`fling_power`)) {
        if (!(is.numeric(`fling_power`) && length(`fling_power`) == 1)) {
          stop(paste("Error! Invalid data for `fling_power`. Must be an integer:", `fling_power`))
        }
        self$`fling_power` <- `fling_power`
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
    #' @return ItemDetail as a base R list.
    #' @examples
    #' # convert array of ItemDetail (x) to a data frame
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
    #' Convert ItemDetail to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      ItemDetailObject <- list()
      if (!is.null(self$`id`)) {
        ItemDetailObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`name`)) {
        ItemDetailObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`cost`)) {
        ItemDetailObject[["cost"]] <-
          self$`cost`
      }
      if (!is.null(self$`fling_power`)) {
        ItemDetailObject[["fling_power"]] <-
          self$`fling_power`
      }
      if (!is.null(self$`fling_effect`)) {
        ItemDetailObject[["fling_effect"]] <-
          self$`fling_effect`$toSimpleType()
      }
      if (!is.null(self$`attributes`)) {
        ItemDetailObject[["attributes"]] <-
          lapply(self$`attributes`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`category`)) {
        ItemDetailObject[["category"]] <-
          self$`category`$toSimpleType()
      }
      if (!is.null(self$`effect_entries`)) {
        ItemDetailObject[["effect_entries"]] <-
          lapply(self$`effect_entries`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`flavor_text_entries`)) {
        ItemDetailObject[["flavor_text_entries"]] <-
          lapply(self$`flavor_text_entries`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`game_indices`)) {
        ItemDetailObject[["game_indices"]] <-
          lapply(self$`game_indices`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`names`)) {
        ItemDetailObject[["names"]] <-
          lapply(self$`names`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`held_by_pokemon`)) {
        ItemDetailObject[["held_by_pokemon"]] <-
          lapply(self$`held_by_pokemon`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`sprites`)) {
        ItemDetailObject[["sprites"]] <-
          self$`sprites`$toSimpleType()
      }
      if (!is.null(self$`baby_trigger_for`)) {
        ItemDetailObject[["baby_trigger_for"]] <-
          self$`baby_trigger_for`$toSimpleType()
      }
      if (!is.null(self$`machines`)) {
        ItemDetailObject[["machines"]] <-
          lapply(self$`machines`, function(x) x$toSimpleType())
      }
      return(ItemDetailObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of ItemDetail
    #'
    #' @param input_json the JSON input
    #' @return the instance of ItemDetail
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`cost`)) {
        self$`cost` <- this_object$`cost`
      }
      if (!is.null(this_object$`fling_power`)) {
        self$`fling_power` <- this_object$`fling_power`
      }
      if (!is.null(this_object$`fling_effect`)) {
        `fling_effect_object` <- ItemFlingEffectSummary$new()
        `fling_effect_object`$fromJSON(jsonlite::toJSON(this_object$`fling_effect`, auto_unbox = TRUE, digits = NA))
        self$`fling_effect` <- `fling_effect_object`
      }
      if (!is.null(this_object$`attributes`)) {
        self$`attributes` <- ApiClient$new()$deserializeObj(this_object$`attributes`, "array[AbilityDetailPokemonInnerPokemon]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`category`)) {
        `category_object` <- ItemCategorySummary$new()
        `category_object`$fromJSON(jsonlite::toJSON(this_object$`category`, auto_unbox = TRUE, digits = NA))
        self$`category` <- `category_object`
      }
      if (!is.null(this_object$`effect_entries`)) {
        self$`effect_entries` <- ApiClient$new()$deserializeObj(this_object$`effect_entries`, "array[ItemEffectText]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`flavor_text_entries`)) {
        self$`flavor_text_entries` <- ApiClient$new()$deserializeObj(this_object$`flavor_text_entries`, "array[ItemFlavorText]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`game_indices`)) {
        self$`game_indices` <- ApiClient$new()$deserializeObj(this_object$`game_indices`, "array[ItemGameIndex]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`names`)) {
        self$`names` <- ApiClient$new()$deserializeObj(this_object$`names`, "array[ItemName]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`held_by_pokemon`)) {
        self$`held_by_pokemon` <- ApiClient$new()$deserializeObj(this_object$`held_by_pokemon`, "array[ItemDetailHeldByPokemonInner]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`sprites`)) {
        `sprites_object` <- ItemDetailSprites$new()
        `sprites_object`$fromJSON(jsonlite::toJSON(this_object$`sprites`, auto_unbox = TRUE, digits = NA))
        self$`sprites` <- `sprites_object`
      }
      if (!is.null(this_object$`baby_trigger_for`)) {
        `baby_trigger_for_object` <- ItemDetailBabyTriggerFor$new()
        `baby_trigger_for_object`$fromJSON(jsonlite::toJSON(this_object$`baby_trigger_for`, auto_unbox = TRUE, digits = NA))
        self$`baby_trigger_for` <- `baby_trigger_for_object`
      }
      if (!is.null(this_object$`machines`)) {
        self$`machines` <- ApiClient$new()$deserializeObj(this_object$`machines`, "array[ItemDetailMachinesInner]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return ItemDetail in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of ItemDetail
    #'
    #' @param input_json the JSON input
    #' @return the instance of ItemDetail
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`name` <- this_object$`name`
      self$`cost` <- this_object$`cost`
      self$`fling_power` <- this_object$`fling_power`
      self$`fling_effect` <- ItemFlingEffectSummary$new()$fromJSON(jsonlite::toJSON(this_object$`fling_effect`, auto_unbox = TRUE, digits = NA))
      self$`attributes` <- ApiClient$new()$deserializeObj(this_object$`attributes`, "array[AbilityDetailPokemonInnerPokemon]", loadNamespace("openapi"))
      self$`category` <- ItemCategorySummary$new()$fromJSON(jsonlite::toJSON(this_object$`category`, auto_unbox = TRUE, digits = NA))
      self$`effect_entries` <- ApiClient$new()$deserializeObj(this_object$`effect_entries`, "array[ItemEffectText]", loadNamespace("openapi"))
      self$`flavor_text_entries` <- ApiClient$new()$deserializeObj(this_object$`flavor_text_entries`, "array[ItemFlavorText]", loadNamespace("openapi"))
      self$`game_indices` <- ApiClient$new()$deserializeObj(this_object$`game_indices`, "array[ItemGameIndex]", loadNamespace("openapi"))
      self$`names` <- ApiClient$new()$deserializeObj(this_object$`names`, "array[ItemName]", loadNamespace("openapi"))
      self$`held_by_pokemon` <- ApiClient$new()$deserializeObj(this_object$`held_by_pokemon`, "array[ItemDetailHeldByPokemonInner]", loadNamespace("openapi"))
      self$`sprites` <- ItemDetailSprites$new()$fromJSON(jsonlite::toJSON(this_object$`sprites`, auto_unbox = TRUE, digits = NA))
      self$`baby_trigger_for` <- ItemDetailBabyTriggerFor$new()$fromJSON(jsonlite::toJSON(this_object$`baby_trigger_for`, auto_unbox = TRUE, digits = NA))
      self$`machines` <- ApiClient$new()$deserializeObj(this_object$`machines`, "array[ItemDetailMachinesInner]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to ItemDetail and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for ItemDetail: the required field `id` is missing."))
      }
      # check the required field `name`
      if (!is.null(input_json$`name`)) {
        if (!(is.character(input_json$`name`) && length(input_json$`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", input_json$`name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ItemDetail: the required field `name` is missing."))
      }
      # check the required field `fling_effect`
      if (!is.null(input_json$`fling_effect`)) {
        stopifnot(R6::is.R6(input_json$`fling_effect`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ItemDetail: the required field `fling_effect` is missing."))
      }
      # check the required field `attributes`
      if (!is.null(input_json$`attributes`)) {
        stopifnot(is.vector(input_json$`attributes`), length(input_json$`attributes`) != 0)
        tmp <- sapply(input_json$`attributes`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ItemDetail: the required field `attributes` is missing."))
      }
      # check the required field `category`
      if (!is.null(input_json$`category`)) {
        stopifnot(R6::is.R6(input_json$`category`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ItemDetail: the required field `category` is missing."))
      }
      # check the required field `effect_entries`
      if (!is.null(input_json$`effect_entries`)) {
        stopifnot(is.vector(input_json$`effect_entries`), length(input_json$`effect_entries`) != 0)
        tmp <- sapply(input_json$`effect_entries`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ItemDetail: the required field `effect_entries` is missing."))
      }
      # check the required field `flavor_text_entries`
      if (!is.null(input_json$`flavor_text_entries`)) {
        stopifnot(is.vector(input_json$`flavor_text_entries`), length(input_json$`flavor_text_entries`) != 0)
        tmp <- sapply(input_json$`flavor_text_entries`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ItemDetail: the required field `flavor_text_entries` is missing."))
      }
      # check the required field `game_indices`
      if (!is.null(input_json$`game_indices`)) {
        stopifnot(is.vector(input_json$`game_indices`), length(input_json$`game_indices`) != 0)
        tmp <- sapply(input_json$`game_indices`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ItemDetail: the required field `game_indices` is missing."))
      }
      # check the required field `names`
      if (!is.null(input_json$`names`)) {
        stopifnot(is.vector(input_json$`names`), length(input_json$`names`) != 0)
        tmp <- sapply(input_json$`names`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ItemDetail: the required field `names` is missing."))
      }
      # check the required field `held_by_pokemon`
      if (!is.null(input_json$`held_by_pokemon`)) {
        stopifnot(is.vector(input_json$`held_by_pokemon`), length(input_json$`held_by_pokemon`) != 0)
        tmp <- sapply(input_json$`held_by_pokemon`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ItemDetail: the required field `held_by_pokemon` is missing."))
      }
      # check the required field `sprites`
      if (!is.null(input_json$`sprites`)) {
        stopifnot(R6::is.R6(input_json$`sprites`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ItemDetail: the required field `sprites` is missing."))
      }
      # check the required field `baby_trigger_for`
      if (!is.null(input_json$`baby_trigger_for`)) {
        stopifnot(R6::is.R6(input_json$`baby_trigger_for`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ItemDetail: the required field `baby_trigger_for` is missing."))
      }
      # check the required field `machines`
      if (!is.null(input_json$`machines`)) {
        stopifnot(is.vector(input_json$`machines`), length(input_json$`machines`) != 0)
        tmp <- sapply(input_json$`machines`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ItemDetail: the required field `machines` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ItemDetail
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

      # check if the required `fling_effect` is null
      if (is.null(self$`fling_effect`)) {
        return(FALSE)
      }

      # check if the required `attributes` is null
      if (is.null(self$`attributes`)) {
        return(FALSE)
      }

      # check if the required `category` is null
      if (is.null(self$`category`)) {
        return(FALSE)
      }

      # check if the required `effect_entries` is null
      if (is.null(self$`effect_entries`)) {
        return(FALSE)
      }

      # check if the required `flavor_text_entries` is null
      if (is.null(self$`flavor_text_entries`)) {
        return(FALSE)
      }

      # check if the required `game_indices` is null
      if (is.null(self$`game_indices`)) {
        return(FALSE)
      }

      # check if the required `names` is null
      if (is.null(self$`names`)) {
        return(FALSE)
      }

      # check if the required `held_by_pokemon` is null
      if (is.null(self$`held_by_pokemon`)) {
        return(FALSE)
      }

      # check if the required `sprites` is null
      if (is.null(self$`sprites`)) {
        return(FALSE)
      }

      # check if the required `baby_trigger_for` is null
      if (is.null(self$`baby_trigger_for`)) {
        return(FALSE)
      }

      # check if the required `machines` is null
      if (is.null(self$`machines`)) {
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

      # check if the required `fling_effect` is null
      if (is.null(self$`fling_effect`)) {
        invalid_fields["fling_effect"] <- "Non-nullable required field `fling_effect` cannot be null."
      }

      # check if the required `attributes` is null
      if (is.null(self$`attributes`)) {
        invalid_fields["attributes"] <- "Non-nullable required field `attributes` cannot be null."
      }

      # check if the required `category` is null
      if (is.null(self$`category`)) {
        invalid_fields["category"] <- "Non-nullable required field `category` cannot be null."
      }

      # check if the required `effect_entries` is null
      if (is.null(self$`effect_entries`)) {
        invalid_fields["effect_entries"] <- "Non-nullable required field `effect_entries` cannot be null."
      }

      # check if the required `flavor_text_entries` is null
      if (is.null(self$`flavor_text_entries`)) {
        invalid_fields["flavor_text_entries"] <- "Non-nullable required field `flavor_text_entries` cannot be null."
      }

      # check if the required `game_indices` is null
      if (is.null(self$`game_indices`)) {
        invalid_fields["game_indices"] <- "Non-nullable required field `game_indices` cannot be null."
      }

      # check if the required `names` is null
      if (is.null(self$`names`)) {
        invalid_fields["names"] <- "Non-nullable required field `names` cannot be null."
      }

      # check if the required `held_by_pokemon` is null
      if (is.null(self$`held_by_pokemon`)) {
        invalid_fields["held_by_pokemon"] <- "Non-nullable required field `held_by_pokemon` cannot be null."
      }

      # check if the required `sprites` is null
      if (is.null(self$`sprites`)) {
        invalid_fields["sprites"] <- "Non-nullable required field `sprites` cannot be null."
      }

      # check if the required `baby_trigger_for` is null
      if (is.null(self$`baby_trigger_for`)) {
        invalid_fields["baby_trigger_for"] <- "Non-nullable required field `baby_trigger_for` cannot be null."
      }

      # check if the required `machines` is null
      if (is.null(self$`machines`)) {
        invalid_fields["machines"] <- "Non-nullable required field `machines` cannot be null."
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
# ItemDetail$unlock()
#
## Below is an example to define the print function
# ItemDetail$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ItemDetail$lock()

