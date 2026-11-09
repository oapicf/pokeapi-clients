#' Create a new MoveDetail
#'
#' @description
#' MoveDetail Class
#'
#' @docType class
#' @title MoveDetail
#' @description MoveDetail Class
#' @format An \code{R6Class} generator object
#' @field id The identifier for this resource. integer
#' @field name The name for this resource. character
#' @field accuracy The percent value of how likely this move is to be successful. integer [optional]
#' @field effect_chance The percent value of how likely it is this moves effect will happen. integer
#' @field pp Power points. The number of times this move can be used. integer [optional]
#' @field priority A value between -8 and 8. Sets the order in which moves are executed during battle. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Priority) for greater detail. integer [optional]
#' @field power The base power of this move, or null if it has no fixed base power. integer [optional]
#' @field contest_combos A detail of normal and super contest combos that require this move. \link{MoveCombos}
#' @field contest_type The type of appeal this move gives a Pokémon when used in a contest. \link{ContestTypeSummary}
#' @field contest_effect The effect the move has when used in a contest. \link{ContestEffectSummary}
#' @field damage_class The type of damage the move inflicts on the target, e.g. physical. \link{MoveDamageClassSummary}
#' @field effect_entries The effect of this move listed in different languages. list(\link{MoveEffectEffectText})
#' @field effect_changes The list of previous effects this move has had across version groups of the games. list(\link{MoveEffectChange})
#' @field generation The generation in which this move was introduced. \link{GenerationSummary}
#' @field meta Metadata about this move \link{MoveMeta}
#' @field names The name of this resource listed in different languages. list(\link{MoveName})
#' @field past_values A list of move resource value changes across version groups of the game. list(\link{MoveChange})
#' @field stat_changes A list of stats this moves effects and how much it effects them. list(\link{MoveMetaStatChange})
#' @field super_contest_effect The effect the move has when used in a super contest. \link{SuperContestEffectSummary}
#' @field target The type of target that will receive the effects of the attack. \link{MoveTargetSummary}
#' @field type The elemental type of this move. \link{TypeSummary}
#' @field machines A list of the machines that teach this move. list(\link{ItemMachine})
#' @field flavor_text_entries The flavor text of this move listed in different languages. list(\link{MoveFlavorText})
#' @field learned_by_pokemon List of Pokemon that can learn the move list(\link{PokemonSummary})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
MoveDetail <- R6::R6Class(
  "MoveDetail",
  public = list(
    `id` = NULL,
    `name` = NULL,
    `accuracy` = NULL,
    `effect_chance` = NULL,
    `pp` = NULL,
    `priority` = NULL,
    `power` = NULL,
    `contest_combos` = NULL,
    `contest_type` = NULL,
    `contest_effect` = NULL,
    `damage_class` = NULL,
    `effect_entries` = NULL,
    `effect_changes` = NULL,
    `generation` = NULL,
    `meta` = NULL,
    `names` = NULL,
    `past_values` = NULL,
    `stat_changes` = NULL,
    `super_contest_effect` = NULL,
    `target` = NULL,
    `type` = NULL,
    `machines` = NULL,
    `flavor_text_entries` = NULL,
    `learned_by_pokemon` = NULL,

    #' @description
    #' Initialize a new MoveDetail class.
    #'
    #' @param id The identifier for this resource.
    #' @param name The name for this resource.
    #' @param effect_chance The percent value of how likely it is this moves effect will happen.
    #' @param contest_combos A detail of normal and super contest combos that require this move.
    #' @param contest_type The type of appeal this move gives a Pokémon when used in a contest.
    #' @param contest_effect The effect the move has when used in a contest.
    #' @param damage_class The type of damage the move inflicts on the target, e.g. physical.
    #' @param effect_entries The effect of this move listed in different languages.
    #' @param effect_changes The list of previous effects this move has had across version groups of the games.
    #' @param generation The generation in which this move was introduced.
    #' @param meta Metadata about this move
    #' @param names The name of this resource listed in different languages.
    #' @param past_values A list of move resource value changes across version groups of the game.
    #' @param stat_changes A list of stats this moves effects and how much it effects them.
    #' @param super_contest_effect The effect the move has when used in a super contest.
    #' @param target The type of target that will receive the effects of the attack.
    #' @param type The elemental type of this move.
    #' @param machines A list of the machines that teach this move.
    #' @param flavor_text_entries The flavor text of this move listed in different languages.
    #' @param learned_by_pokemon List of Pokemon that can learn the move
    #' @param accuracy The percent value of how likely this move is to be successful.
    #' @param pp Power points. The number of times this move can be used.
    #' @param priority A value between -8 and 8. Sets the order in which moves are executed during battle. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Priority) for greater detail.
    #' @param power The base power of this move, or null if it has no fixed base power.
    #' @param ... Other optional arguments.
    initialize = function(`id`, `name`, `effect_chance`, `contest_combos`, `contest_type`, `contest_effect`, `damage_class`, `effect_entries`, `effect_changes`, `generation`, `meta`, `names`, `past_values`, `stat_changes`, `super_contest_effect`, `target`, `type`, `machines`, `flavor_text_entries`, `learned_by_pokemon`, `accuracy` = NULL, `pp` = NULL, `priority` = NULL, `power` = NULL, ...) {
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
      if (!missing(`effect_chance`)) {
        if (!(is.numeric(`effect_chance`) && length(`effect_chance`) == 1)) {
          stop(paste("Error! Invalid data for `effect_chance`. Must be an integer:", `effect_chance`))
        }
        self$`effect_chance` <- `effect_chance`
      }
      if (!missing(`contest_combos`)) {
        stopifnot(R6::is.R6(`contest_combos`))
        self$`contest_combos` <- `contest_combos`
      }
      if (!missing(`contest_type`)) {
        stopifnot(R6::is.R6(`contest_type`))
        self$`contest_type` <- `contest_type`
      }
      if (!missing(`contest_effect`)) {
        stopifnot(R6::is.R6(`contest_effect`))
        self$`contest_effect` <- `contest_effect`
      }
      if (!missing(`damage_class`)) {
        stopifnot(R6::is.R6(`damage_class`))
        self$`damage_class` <- `damage_class`
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
      if (!missing(`generation`)) {
        stopifnot(R6::is.R6(`generation`))
        self$`generation` <- `generation`
      }
      if (!missing(`meta`)) {
        stopifnot(R6::is.R6(`meta`))
        self$`meta` <- `meta`
      }
      if (!missing(`names`)) {
        stopifnot(is.vector(`names`), length(`names`) != 0)
        sapply(`names`, function(x) stopifnot(R6::is.R6(x)))
        self$`names` <- `names`
      }
      if (!missing(`past_values`)) {
        stopifnot(is.vector(`past_values`), length(`past_values`) != 0)
        sapply(`past_values`, function(x) stopifnot(R6::is.R6(x)))
        self$`past_values` <- `past_values`
      }
      if (!missing(`stat_changes`)) {
        stopifnot(is.vector(`stat_changes`), length(`stat_changes`) != 0)
        sapply(`stat_changes`, function(x) stopifnot(R6::is.R6(x)))
        self$`stat_changes` <- `stat_changes`
      }
      if (!missing(`super_contest_effect`)) {
        stopifnot(R6::is.R6(`super_contest_effect`))
        self$`super_contest_effect` <- `super_contest_effect`
      }
      if (!missing(`target`)) {
        stopifnot(R6::is.R6(`target`))
        self$`target` <- `target`
      }
      if (!missing(`type`)) {
        stopifnot(R6::is.R6(`type`))
        self$`type` <- `type`
      }
      if (!missing(`machines`)) {
        stopifnot(is.vector(`machines`), length(`machines`) != 0)
        sapply(`machines`, function(x) stopifnot(R6::is.R6(x)))
        self$`machines` <- `machines`
      }
      if (!missing(`flavor_text_entries`)) {
        stopifnot(is.vector(`flavor_text_entries`), length(`flavor_text_entries`) != 0)
        sapply(`flavor_text_entries`, function(x) stopifnot(R6::is.R6(x)))
        self$`flavor_text_entries` <- `flavor_text_entries`
      }
      if (!missing(`learned_by_pokemon`)) {
        stopifnot(is.vector(`learned_by_pokemon`), length(`learned_by_pokemon`) != 0)
        sapply(`learned_by_pokemon`, function(x) stopifnot(R6::is.R6(x)))
        self$`learned_by_pokemon` <- `learned_by_pokemon`
      }
      if (!is.null(`accuracy`)) {
        if (!(is.numeric(`accuracy`) && length(`accuracy`) == 1)) {
          stop(paste("Error! Invalid data for `accuracy`. Must be an integer:", `accuracy`))
        }
        self$`accuracy` <- `accuracy`
      }
      if (!is.null(`pp`)) {
        if (!(is.numeric(`pp`) && length(`pp`) == 1)) {
          stop(paste("Error! Invalid data for `pp`. Must be an integer:", `pp`))
        }
        self$`pp` <- `pp`
      }
      if (!is.null(`priority`)) {
        if (!(is.numeric(`priority`) && length(`priority`) == 1)) {
          stop(paste("Error! Invalid data for `priority`. Must be an integer:", `priority`))
        }
        self$`priority` <- `priority`
      }
      if (!is.null(`power`)) {
        if (!(is.numeric(`power`) && length(`power`) == 1)) {
          stop(paste("Error! Invalid data for `power`. Must be an integer:", `power`))
        }
        self$`power` <- `power`
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
    #' @return MoveDetail as a base R list.
    #' @examples
    #' # convert array of MoveDetail (x) to a data frame
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
    #' Convert MoveDetail to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      MoveDetailObject <- list()
      if (!is.null(self$`id`)) {
        MoveDetailObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`name`)) {
        MoveDetailObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`accuracy`)) {
        MoveDetailObject[["accuracy"]] <-
          self$`accuracy`
      }
      if (!is.null(self$`effect_chance`)) {
        MoveDetailObject[["effect_chance"]] <-
          self$`effect_chance`
      }
      if (!is.null(self$`pp`)) {
        MoveDetailObject[["pp"]] <-
          self$`pp`
      }
      if (!is.null(self$`priority`)) {
        MoveDetailObject[["priority"]] <-
          self$`priority`
      }
      if (!is.null(self$`power`)) {
        MoveDetailObject[["power"]] <-
          self$`power`
      }
      if (!is.null(self$`contest_combos`)) {
        MoveDetailObject[["contest_combos"]] <-
          self$extractSimpleType(self$`contest_combos`)
      }
      if (!is.null(self$`contest_type`)) {
        MoveDetailObject[["contest_type"]] <-
          self$extractSimpleType(self$`contest_type`)
      }
      if (!is.null(self$`contest_effect`)) {
        MoveDetailObject[["contest_effect"]] <-
          self$extractSimpleType(self$`contest_effect`)
      }
      if (!is.null(self$`damage_class`)) {
        MoveDetailObject[["damage_class"]] <-
          self$extractSimpleType(self$`damage_class`)
      }
      if (!is.null(self$`effect_entries`)) {
        MoveDetailObject[["effect_entries"]] <-
          self$extractSimpleType(self$`effect_entries`)
      }
      if (!is.null(self$`effect_changes`)) {
        MoveDetailObject[["effect_changes"]] <-
          self$extractSimpleType(self$`effect_changes`)
      }
      if (!is.null(self$`generation`)) {
        MoveDetailObject[["generation"]] <-
          self$extractSimpleType(self$`generation`)
      }
      if (!is.null(self$`meta`)) {
        MoveDetailObject[["meta"]] <-
          self$extractSimpleType(self$`meta`)
      }
      if (!is.null(self$`names`)) {
        MoveDetailObject[["names"]] <-
          self$extractSimpleType(self$`names`)
      }
      if (!is.null(self$`past_values`)) {
        MoveDetailObject[["past_values"]] <-
          self$extractSimpleType(self$`past_values`)
      }
      if (!is.null(self$`stat_changes`)) {
        MoveDetailObject[["stat_changes"]] <-
          self$extractSimpleType(self$`stat_changes`)
      }
      if (!is.null(self$`super_contest_effect`)) {
        MoveDetailObject[["super_contest_effect"]] <-
          self$extractSimpleType(self$`super_contest_effect`)
      }
      if (!is.null(self$`target`)) {
        MoveDetailObject[["target"]] <-
          self$extractSimpleType(self$`target`)
      }
      if (!is.null(self$`type`)) {
        MoveDetailObject[["type"]] <-
          self$extractSimpleType(self$`type`)
      }
      if (!is.null(self$`machines`)) {
        MoveDetailObject[["machines"]] <-
          self$extractSimpleType(self$`machines`)
      }
      if (!is.null(self$`flavor_text_entries`)) {
        MoveDetailObject[["flavor_text_entries"]] <-
          self$extractSimpleType(self$`flavor_text_entries`)
      }
      if (!is.null(self$`learned_by_pokemon`)) {
        MoveDetailObject[["learned_by_pokemon"]] <-
          self$extractSimpleType(self$`learned_by_pokemon`)
      }
      return(MoveDetailObject)
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
    #' Deserialize JSON string into an instance of MoveDetail
    #'
    #' @param input_json the JSON input
    #' @return the instance of MoveDetail
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`accuracy`)) {
        self$`accuracy` <- this_object$`accuracy`
      }
      if (!is.null(this_object$`effect_chance`)) {
        self$`effect_chance` <- this_object$`effect_chance`
      }
      if (!is.null(this_object$`pp`)) {
        self$`pp` <- this_object$`pp`
      }
      if (!is.null(this_object$`priority`)) {
        self$`priority` <- this_object$`priority`
      }
      if (!is.null(this_object$`power`)) {
        self$`power` <- this_object$`power`
      }
      if (!is.null(this_object$`contest_combos`)) {
        `contest_combos_object` <- MoveCombos$new()
        `contest_combos_object`$fromJSON(jsonlite::toJSON(this_object$`contest_combos`, auto_unbox = TRUE, digits = NA))
        self$`contest_combos` <- `contest_combos_object`
      }
      if (!is.null(this_object$`contest_type`)) {
        `contest_type_object` <- ContestTypeSummary$new()
        `contest_type_object`$fromJSON(jsonlite::toJSON(this_object$`contest_type`, auto_unbox = TRUE, digits = NA))
        self$`contest_type` <- `contest_type_object`
      }
      if (!is.null(this_object$`contest_effect`)) {
        `contest_effect_object` <- ContestEffectSummary$new()
        `contest_effect_object`$fromJSON(jsonlite::toJSON(this_object$`contest_effect`, auto_unbox = TRUE, digits = NA))
        self$`contest_effect` <- `contest_effect_object`
      }
      if (!is.null(this_object$`damage_class`)) {
        `damage_class_object` <- MoveDamageClassSummary$new()
        `damage_class_object`$fromJSON(jsonlite::toJSON(this_object$`damage_class`, auto_unbox = TRUE, digits = NA))
        self$`damage_class` <- `damage_class_object`
      }
      if (!is.null(this_object$`effect_entries`)) {
        self$`effect_entries` <- ApiClient$new()$deserializeObj(this_object$`effect_entries`, "array[MoveEffectEffectText]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`effect_changes`)) {
        self$`effect_changes` <- ApiClient$new()$deserializeObj(this_object$`effect_changes`, "array[MoveEffectChange]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`generation`)) {
        `generation_object` <- GenerationSummary$new()
        `generation_object`$fromJSON(jsonlite::toJSON(this_object$`generation`, auto_unbox = TRUE, digits = NA))
        self$`generation` <- `generation_object`
      }
      if (!is.null(this_object$`meta`)) {
        `meta_object` <- MoveMeta$new()
        `meta_object`$fromJSON(jsonlite::toJSON(this_object$`meta`, auto_unbox = TRUE, digits = NA))
        self$`meta` <- `meta_object`
      }
      if (!is.null(this_object$`names`)) {
        self$`names` <- ApiClient$new()$deserializeObj(this_object$`names`, "array[MoveName]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`past_values`)) {
        self$`past_values` <- ApiClient$new()$deserializeObj(this_object$`past_values`, "array[MoveChange]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`stat_changes`)) {
        self$`stat_changes` <- ApiClient$new()$deserializeObj(this_object$`stat_changes`, "array[MoveMetaStatChange]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`super_contest_effect`)) {
        `super_contest_effect_object` <- SuperContestEffectSummary$new()
        `super_contest_effect_object`$fromJSON(jsonlite::toJSON(this_object$`super_contest_effect`, auto_unbox = TRUE, digits = NA))
        self$`super_contest_effect` <- `super_contest_effect_object`
      }
      if (!is.null(this_object$`target`)) {
        `target_object` <- MoveTargetSummary$new()
        `target_object`$fromJSON(jsonlite::toJSON(this_object$`target`, auto_unbox = TRUE, digits = NA))
        self$`target` <- `target_object`
      }
      if (!is.null(this_object$`type`)) {
        `type_object` <- TypeSummary$new()
        `type_object`$fromJSON(jsonlite::toJSON(this_object$`type`, auto_unbox = TRUE, digits = NA))
        self$`type` <- `type_object`
      }
      if (!is.null(this_object$`machines`)) {
        self$`machines` <- ApiClient$new()$deserializeObj(this_object$`machines`, "array[ItemMachine]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`flavor_text_entries`)) {
        self$`flavor_text_entries` <- ApiClient$new()$deserializeObj(this_object$`flavor_text_entries`, "array[MoveFlavorText]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`learned_by_pokemon`)) {
        self$`learned_by_pokemon` <- ApiClient$new()$deserializeObj(this_object$`learned_by_pokemon`, "array[PokemonSummary]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return MoveDetail in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of MoveDetail
    #'
    #' @param input_json the JSON input
    #' @return the instance of MoveDetail
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`name` <- this_object$`name`
      self$`accuracy` <- this_object$`accuracy`
      self$`effect_chance` <- this_object$`effect_chance`
      self$`pp` <- this_object$`pp`
      self$`priority` <- this_object$`priority`
      self$`power` <- this_object$`power`
      self$`contest_combos` <- MoveCombos$new()$fromJSON(jsonlite::toJSON(this_object$`contest_combos`, auto_unbox = TRUE, digits = NA))
      self$`contest_type` <- ContestTypeSummary$new()$fromJSON(jsonlite::toJSON(this_object$`contest_type`, auto_unbox = TRUE, digits = NA))
      self$`contest_effect` <- ContestEffectSummary$new()$fromJSON(jsonlite::toJSON(this_object$`contest_effect`, auto_unbox = TRUE, digits = NA))
      self$`damage_class` <- MoveDamageClassSummary$new()$fromJSON(jsonlite::toJSON(this_object$`damage_class`, auto_unbox = TRUE, digits = NA))
      self$`effect_entries` <- ApiClient$new()$deserializeObj(this_object$`effect_entries`, "array[MoveEffectEffectText]", loadNamespace("openapi"))
      self$`effect_changes` <- ApiClient$new()$deserializeObj(this_object$`effect_changes`, "array[MoveEffectChange]", loadNamespace("openapi"))
      self$`generation` <- GenerationSummary$new()$fromJSON(jsonlite::toJSON(this_object$`generation`, auto_unbox = TRUE, digits = NA))
      self$`meta` <- MoveMeta$new()$fromJSON(jsonlite::toJSON(this_object$`meta`, auto_unbox = TRUE, digits = NA))
      self$`names` <- ApiClient$new()$deserializeObj(this_object$`names`, "array[MoveName]", loadNamespace("openapi"))
      self$`past_values` <- ApiClient$new()$deserializeObj(this_object$`past_values`, "array[MoveChange]", loadNamespace("openapi"))
      self$`stat_changes` <- ApiClient$new()$deserializeObj(this_object$`stat_changes`, "array[MoveMetaStatChange]", loadNamespace("openapi"))
      self$`super_contest_effect` <- SuperContestEffectSummary$new()$fromJSON(jsonlite::toJSON(this_object$`super_contest_effect`, auto_unbox = TRUE, digits = NA))
      self$`target` <- MoveTargetSummary$new()$fromJSON(jsonlite::toJSON(this_object$`target`, auto_unbox = TRUE, digits = NA))
      self$`type` <- TypeSummary$new()$fromJSON(jsonlite::toJSON(this_object$`type`, auto_unbox = TRUE, digits = NA))
      self$`machines` <- ApiClient$new()$deserializeObj(this_object$`machines`, "array[ItemMachine]", loadNamespace("openapi"))
      self$`flavor_text_entries` <- ApiClient$new()$deserializeObj(this_object$`flavor_text_entries`, "array[MoveFlavorText]", loadNamespace("openapi"))
      self$`learned_by_pokemon` <- ApiClient$new()$deserializeObj(this_object$`learned_by_pokemon`, "array[PokemonSummary]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to MoveDetail and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for MoveDetail: the required field `id` is missing."))
      }
      # check the required field `name`
      if (!is.null(input_json$`name`)) {
        if (!(is.character(input_json$`name`) && length(input_json$`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", input_json$`name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MoveDetail: the required field `name` is missing."))
      }
      # check the required field `effect_chance`
      if (!is.null(input_json$`effect_chance`)) {
        if (!(is.numeric(input_json$`effect_chance`) && length(input_json$`effect_chance`) == 1)) {
          stop(paste("Error! Invalid data for `effect_chance`. Must be an integer:", input_json$`effect_chance`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MoveDetail: the required field `effect_chance` is missing."))
      }
      # check the required field `contest_combos`
      if (!is.null(input_json$`contest_combos`)) {
        stopifnot(R6::is.R6(input_json$`contest_combos`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MoveDetail: the required field `contest_combos` is missing."))
      }
      # check the required field `contest_type`
      if (!is.null(input_json$`contest_type`)) {
        stopifnot(R6::is.R6(input_json$`contest_type`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MoveDetail: the required field `contest_type` is missing."))
      }
      # check the required field `contest_effect`
      if (!is.null(input_json$`contest_effect`)) {
        stopifnot(R6::is.R6(input_json$`contest_effect`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MoveDetail: the required field `contest_effect` is missing."))
      }
      # check the required field `damage_class`
      if (!is.null(input_json$`damage_class`)) {
        stopifnot(R6::is.R6(input_json$`damage_class`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MoveDetail: the required field `damage_class` is missing."))
      }
      # check the required field `effect_entries`
      if (!is.null(input_json$`effect_entries`)) {
        stopifnot(is.vector(input_json$`effect_entries`), length(input_json$`effect_entries`) != 0)
        tmp <- sapply(input_json$`effect_entries`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MoveDetail: the required field `effect_entries` is missing."))
      }
      # check the required field `effect_changes`
      if (!is.null(input_json$`effect_changes`)) {
        stopifnot(is.vector(input_json$`effect_changes`), length(input_json$`effect_changes`) != 0)
        tmp <- sapply(input_json$`effect_changes`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MoveDetail: the required field `effect_changes` is missing."))
      }
      # check the required field `generation`
      if (!is.null(input_json$`generation`)) {
        stopifnot(R6::is.R6(input_json$`generation`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MoveDetail: the required field `generation` is missing."))
      }
      # check the required field `meta`
      if (!is.null(input_json$`meta`)) {
        stopifnot(R6::is.R6(input_json$`meta`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MoveDetail: the required field `meta` is missing."))
      }
      # check the required field `names`
      if (!is.null(input_json$`names`)) {
        stopifnot(is.vector(input_json$`names`), length(input_json$`names`) != 0)
        tmp <- sapply(input_json$`names`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MoveDetail: the required field `names` is missing."))
      }
      # check the required field `past_values`
      if (!is.null(input_json$`past_values`)) {
        stopifnot(is.vector(input_json$`past_values`), length(input_json$`past_values`) != 0)
        tmp <- sapply(input_json$`past_values`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MoveDetail: the required field `past_values` is missing."))
      }
      # check the required field `stat_changes`
      if (!is.null(input_json$`stat_changes`)) {
        stopifnot(is.vector(input_json$`stat_changes`), length(input_json$`stat_changes`) != 0)
        tmp <- sapply(input_json$`stat_changes`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MoveDetail: the required field `stat_changes` is missing."))
      }
      # check the required field `super_contest_effect`
      if (!is.null(input_json$`super_contest_effect`)) {
        stopifnot(R6::is.R6(input_json$`super_contest_effect`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MoveDetail: the required field `super_contest_effect` is missing."))
      }
      # check the required field `target`
      if (!is.null(input_json$`target`)) {
        stopifnot(R6::is.R6(input_json$`target`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MoveDetail: the required field `target` is missing."))
      }
      # check the required field `type`
      if (!is.null(input_json$`type`)) {
        stopifnot(R6::is.R6(input_json$`type`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MoveDetail: the required field `type` is missing."))
      }
      # check the required field `machines`
      if (!is.null(input_json$`machines`)) {
        stopifnot(is.vector(input_json$`machines`), length(input_json$`machines`) != 0)
        tmp <- sapply(input_json$`machines`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MoveDetail: the required field `machines` is missing."))
      }
      # check the required field `flavor_text_entries`
      if (!is.null(input_json$`flavor_text_entries`)) {
        stopifnot(is.vector(input_json$`flavor_text_entries`), length(input_json$`flavor_text_entries`) != 0)
        tmp <- sapply(input_json$`flavor_text_entries`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MoveDetail: the required field `flavor_text_entries` is missing."))
      }
      # check the required field `learned_by_pokemon`
      if (!is.null(input_json$`learned_by_pokemon`)) {
        stopifnot(is.vector(input_json$`learned_by_pokemon`), length(input_json$`learned_by_pokemon`) != 0)
        tmp <- sapply(input_json$`learned_by_pokemon`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MoveDetail: the required field `learned_by_pokemon` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of MoveDetail
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

      if (self$`accuracy` > 2147483647) {
        return(FALSE)
      }
      if (self$`accuracy` < -2147483648) {
        return(FALSE)
      }

      if (self$`pp` > 2147483647) {
        return(FALSE)
      }
      if (self$`pp` < -2147483648) {
        return(FALSE)
      }

      if (self$`priority` > 2147483647) {
        return(FALSE)
      }
      if (self$`priority` < -2147483648) {
        return(FALSE)
      }

      if (self$`power` > 2147483647) {
        return(FALSE)
      }
      if (self$`power` < -2147483648) {
        return(FALSE)
      }

      # check if the required `damage_class` is null
      if (is.null(self$`damage_class`)) {
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

      # check if the required `generation` is null
      if (is.null(self$`generation`)) {
        return(FALSE)
      }

      # check if the required `names` is null
      if (is.null(self$`names`)) {
        return(FALSE)
      }

      # check if the required `past_values` is null
      if (is.null(self$`past_values`)) {
        return(FALSE)
      }

      # check if the required `stat_changes` is null
      if (is.null(self$`stat_changes`)) {
        return(FALSE)
      }

      # check if the required `target` is null
      if (is.null(self$`target`)) {
        return(FALSE)
      }

      # check if the required `type` is null
      if (is.null(self$`type`)) {
        return(FALSE)
      }

      # check if the required `machines` is null
      if (is.null(self$`machines`)) {
        return(FALSE)
      }

      # check if the required `flavor_text_entries` is null
      if (is.null(self$`flavor_text_entries`)) {
        return(FALSE)
      }

      # check if the required `learned_by_pokemon` is null
      if (is.null(self$`learned_by_pokemon`)) {
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

      if (self$`accuracy` > 2147483647) {
        invalid_fields["accuracy"] <- "Invalid value for `accuracy`, must be smaller than or equal to 2147483647."
      }
      if (self$`accuracy` < -2147483648) {
        invalid_fields["accuracy"] <- "Invalid value for `accuracy`, must be bigger than or equal to -2147483648."
      }

      if (self$`pp` > 2147483647) {
        invalid_fields["pp"] <- "Invalid value for `pp`, must be smaller than or equal to 2147483647."
      }
      if (self$`pp` < -2147483648) {
        invalid_fields["pp"] <- "Invalid value for `pp`, must be bigger than or equal to -2147483648."
      }

      if (self$`priority` > 2147483647) {
        invalid_fields["priority"] <- "Invalid value for `priority`, must be smaller than or equal to 2147483647."
      }
      if (self$`priority` < -2147483648) {
        invalid_fields["priority"] <- "Invalid value for `priority`, must be bigger than or equal to -2147483648."
      }

      if (self$`power` > 2147483647) {
        invalid_fields["power"] <- "Invalid value for `power`, must be smaller than or equal to 2147483647."
      }
      if (self$`power` < -2147483648) {
        invalid_fields["power"] <- "Invalid value for `power`, must be bigger than or equal to -2147483648."
      }

      # check if the required `damage_class` is null
      if (is.null(self$`damage_class`)) {
        invalid_fields["damage_class"] <- "Non-nullable required field `damage_class` cannot be null."
      }

      # check if the required `effect_entries` is null
      if (is.null(self$`effect_entries`)) {
        invalid_fields["effect_entries"] <- "Non-nullable required field `effect_entries` cannot be null."
      }

      # check if the required `effect_changes` is null
      if (is.null(self$`effect_changes`)) {
        invalid_fields["effect_changes"] <- "Non-nullable required field `effect_changes` cannot be null."
      }

      # check if the required `generation` is null
      if (is.null(self$`generation`)) {
        invalid_fields["generation"] <- "Non-nullable required field `generation` cannot be null."
      }

      # check if the required `names` is null
      if (is.null(self$`names`)) {
        invalid_fields["names"] <- "Non-nullable required field `names` cannot be null."
      }

      # check if the required `past_values` is null
      if (is.null(self$`past_values`)) {
        invalid_fields["past_values"] <- "Non-nullable required field `past_values` cannot be null."
      }

      # check if the required `stat_changes` is null
      if (is.null(self$`stat_changes`)) {
        invalid_fields["stat_changes"] <- "Non-nullable required field `stat_changes` cannot be null."
      }

      # check if the required `target` is null
      if (is.null(self$`target`)) {
        invalid_fields["target"] <- "Non-nullable required field `target` cannot be null."
      }

      # check if the required `type` is null
      if (is.null(self$`type`)) {
        invalid_fields["type"] <- "Non-nullable required field `type` cannot be null."
      }

      # check if the required `machines` is null
      if (is.null(self$`machines`)) {
        invalid_fields["machines"] <- "Non-nullable required field `machines` cannot be null."
      }

      # check if the required `flavor_text_entries` is null
      if (is.null(self$`flavor_text_entries`)) {
        invalid_fields["flavor_text_entries"] <- "Non-nullable required field `flavor_text_entries` cannot be null."
      }

      # check if the required `learned_by_pokemon` is null
      if (is.null(self$`learned_by_pokemon`)) {
        invalid_fields["learned_by_pokemon"] <- "Non-nullable required field `learned_by_pokemon` cannot be null."
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
# MoveDetail$unlock()
#
## Below is an example to define the print function
# MoveDetail$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# MoveDetail$lock()

