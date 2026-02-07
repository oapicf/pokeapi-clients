#' Create a new PokemonSpeciesDetail
#'
#' @description
#' PokemonSpeciesDetail Class
#'
#' @docType class
#' @title PokemonSpeciesDetail
#' @description PokemonSpeciesDetail Class
#' @format An \code{R6Class} generator object
#' @field id  integer
#' @field name  character
#' @field order  integer [optional]
#' @field gender_rate  integer [optional]
#' @field capture_rate  integer [optional]
#' @field base_happiness  integer [optional]
#' @field is_baby  character [optional]
#' @field is_legendary  character [optional]
#' @field is_mythical  character [optional]
#' @field hatch_counter  integer [optional]
#' @field has_gender_differences  character [optional]
#' @field forms_switchable  character [optional]
#' @field growth_rate  \link{GrowthRateSummary}
#' @field pokedex_numbers  list(\link{PokemonDexEntry})
#' @field egg_groups  list(\link{AbilityDetailPokemonInnerPokemon})
#' @field color  \link{PokemonColorSummary}
#' @field shape  \link{PokemonShapeSummary}
#' @field evolves_from_species  \link{PokemonSpeciesSummary}
#' @field evolution_chain  \link{EvolutionChainSummary}
#' @field habitat  \link{PokemonHabitatSummary}
#' @field generation  \link{GenerationSummary}
#' @field names  list(\link{PokemonFormDetailFormNamesInner})
#' @field pal_park_encounters  list(\link{PokemonSpeciesDetailPalParkEncountersInner})
#' @field form_descriptions  list(\link{PokemonSpeciesDescription})
#' @field flavor_text_entries  list(\link{PokemonSpeciesFlavorText})
#' @field genera  list(\link{PokemonSpeciesDetailGeneraInner})
#' @field varieties  list(\link{PokemonSpeciesDetailVarietiesInner})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PokemonSpeciesDetail <- R6::R6Class(
  "PokemonSpeciesDetail",
  public = list(
    `id` = NULL,
    `name` = NULL,
    `order` = NULL,
    `gender_rate` = NULL,
    `capture_rate` = NULL,
    `base_happiness` = NULL,
    `is_baby` = NULL,
    `is_legendary` = NULL,
    `is_mythical` = NULL,
    `hatch_counter` = NULL,
    `has_gender_differences` = NULL,
    `forms_switchable` = NULL,
    `growth_rate` = NULL,
    `pokedex_numbers` = NULL,
    `egg_groups` = NULL,
    `color` = NULL,
    `shape` = NULL,
    `evolves_from_species` = NULL,
    `evolution_chain` = NULL,
    `habitat` = NULL,
    `generation` = NULL,
    `names` = NULL,
    `pal_park_encounters` = NULL,
    `form_descriptions` = NULL,
    `flavor_text_entries` = NULL,
    `genera` = NULL,
    `varieties` = NULL,

    #' @description
    #' Initialize a new PokemonSpeciesDetail class.
    #'
    #' @param id id
    #' @param name name
    #' @param growth_rate growth_rate
    #' @param pokedex_numbers pokedex_numbers
    #' @param egg_groups egg_groups
    #' @param color color
    #' @param shape shape
    #' @param evolves_from_species evolves_from_species
    #' @param evolution_chain evolution_chain
    #' @param habitat habitat
    #' @param generation generation
    #' @param names names
    #' @param pal_park_encounters pal_park_encounters
    #' @param form_descriptions form_descriptions
    #' @param flavor_text_entries flavor_text_entries
    #' @param genera genera
    #' @param varieties varieties
    #' @param order order
    #' @param gender_rate gender_rate
    #' @param capture_rate capture_rate
    #' @param base_happiness base_happiness
    #' @param is_baby is_baby
    #' @param is_legendary is_legendary
    #' @param is_mythical is_mythical
    #' @param hatch_counter hatch_counter
    #' @param has_gender_differences has_gender_differences
    #' @param forms_switchable forms_switchable
    #' @param ... Other optional arguments.
    initialize = function(`id`, `name`, `growth_rate`, `pokedex_numbers`, `egg_groups`, `color`, `shape`, `evolves_from_species`, `evolution_chain`, `habitat`, `generation`, `names`, `pal_park_encounters`, `form_descriptions`, `flavor_text_entries`, `genera`, `varieties`, `order` = NULL, `gender_rate` = NULL, `capture_rate` = NULL, `base_happiness` = NULL, `is_baby` = NULL, `is_legendary` = NULL, `is_mythical` = NULL, `hatch_counter` = NULL, `has_gender_differences` = NULL, `forms_switchable` = NULL, ...) {
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
      if (!missing(`growth_rate`)) {
        stopifnot(R6::is.R6(`growth_rate`))
        self$`growth_rate` <- `growth_rate`
      }
      if (!missing(`pokedex_numbers`)) {
        stopifnot(is.vector(`pokedex_numbers`), length(`pokedex_numbers`) != 0)
        sapply(`pokedex_numbers`, function(x) stopifnot(R6::is.R6(x)))
        self$`pokedex_numbers` <- `pokedex_numbers`
      }
      if (!missing(`egg_groups`)) {
        stopifnot(is.vector(`egg_groups`), length(`egg_groups`) != 0)
        sapply(`egg_groups`, function(x) stopifnot(R6::is.R6(x)))
        self$`egg_groups` <- `egg_groups`
      }
      if (!missing(`color`)) {
        stopifnot(R6::is.R6(`color`))
        self$`color` <- `color`
      }
      if (!missing(`shape`)) {
        stopifnot(R6::is.R6(`shape`))
        self$`shape` <- `shape`
      }
      if (!missing(`evolves_from_species`)) {
        stopifnot(R6::is.R6(`evolves_from_species`))
        self$`evolves_from_species` <- `evolves_from_species`
      }
      if (!missing(`evolution_chain`)) {
        stopifnot(R6::is.R6(`evolution_chain`))
        self$`evolution_chain` <- `evolution_chain`
      }
      if (!missing(`habitat`)) {
        stopifnot(R6::is.R6(`habitat`))
        self$`habitat` <- `habitat`
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
      if (!missing(`pal_park_encounters`)) {
        stopifnot(is.vector(`pal_park_encounters`), length(`pal_park_encounters`) != 0)
        sapply(`pal_park_encounters`, function(x) stopifnot(R6::is.R6(x)))
        self$`pal_park_encounters` <- `pal_park_encounters`
      }
      if (!missing(`form_descriptions`)) {
        stopifnot(is.vector(`form_descriptions`), length(`form_descriptions`) != 0)
        sapply(`form_descriptions`, function(x) stopifnot(R6::is.R6(x)))
        self$`form_descriptions` <- `form_descriptions`
      }
      if (!missing(`flavor_text_entries`)) {
        stopifnot(is.vector(`flavor_text_entries`), length(`flavor_text_entries`) != 0)
        sapply(`flavor_text_entries`, function(x) stopifnot(R6::is.R6(x)))
        self$`flavor_text_entries` <- `flavor_text_entries`
      }
      if (!missing(`genera`)) {
        stopifnot(is.vector(`genera`), length(`genera`) != 0)
        sapply(`genera`, function(x) stopifnot(R6::is.R6(x)))
        self$`genera` <- `genera`
      }
      if (!missing(`varieties`)) {
        stopifnot(is.vector(`varieties`), length(`varieties`) != 0)
        sapply(`varieties`, function(x) stopifnot(R6::is.R6(x)))
        self$`varieties` <- `varieties`
      }
      if (!is.null(`order`)) {
        if (!(is.numeric(`order`) && length(`order`) == 1)) {
          stop(paste("Error! Invalid data for `order`. Must be an integer:", `order`))
        }
        self$`order` <- `order`
      }
      if (!is.null(`gender_rate`)) {
        if (!(is.numeric(`gender_rate`) && length(`gender_rate`) == 1)) {
          stop(paste("Error! Invalid data for `gender_rate`. Must be an integer:", `gender_rate`))
        }
        self$`gender_rate` <- `gender_rate`
      }
      if (!is.null(`capture_rate`)) {
        if (!(is.numeric(`capture_rate`) && length(`capture_rate`) == 1)) {
          stop(paste("Error! Invalid data for `capture_rate`. Must be an integer:", `capture_rate`))
        }
        self$`capture_rate` <- `capture_rate`
      }
      if (!is.null(`base_happiness`)) {
        if (!(is.numeric(`base_happiness`) && length(`base_happiness`) == 1)) {
          stop(paste("Error! Invalid data for `base_happiness`. Must be an integer:", `base_happiness`))
        }
        self$`base_happiness` <- `base_happiness`
      }
      if (!is.null(`is_baby`)) {
        if (!(is.logical(`is_baby`) && length(`is_baby`) == 1)) {
          stop(paste("Error! Invalid data for `is_baby`. Must be a boolean:", `is_baby`))
        }
        self$`is_baby` <- `is_baby`
      }
      if (!is.null(`is_legendary`)) {
        if (!(is.logical(`is_legendary`) && length(`is_legendary`) == 1)) {
          stop(paste("Error! Invalid data for `is_legendary`. Must be a boolean:", `is_legendary`))
        }
        self$`is_legendary` <- `is_legendary`
      }
      if (!is.null(`is_mythical`)) {
        if (!(is.logical(`is_mythical`) && length(`is_mythical`) == 1)) {
          stop(paste("Error! Invalid data for `is_mythical`. Must be a boolean:", `is_mythical`))
        }
        self$`is_mythical` <- `is_mythical`
      }
      if (!is.null(`hatch_counter`)) {
        if (!(is.numeric(`hatch_counter`) && length(`hatch_counter`) == 1)) {
          stop(paste("Error! Invalid data for `hatch_counter`. Must be an integer:", `hatch_counter`))
        }
        self$`hatch_counter` <- `hatch_counter`
      }
      if (!is.null(`has_gender_differences`)) {
        if (!(is.logical(`has_gender_differences`) && length(`has_gender_differences`) == 1)) {
          stop(paste("Error! Invalid data for `has_gender_differences`. Must be a boolean:", `has_gender_differences`))
        }
        self$`has_gender_differences` <- `has_gender_differences`
      }
      if (!is.null(`forms_switchable`)) {
        if (!(is.logical(`forms_switchable`) && length(`forms_switchable`) == 1)) {
          stop(paste("Error! Invalid data for `forms_switchable`. Must be a boolean:", `forms_switchable`))
        }
        self$`forms_switchable` <- `forms_switchable`
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
    #' @return PokemonSpeciesDetail as a base R list.
    #' @examples
    #' # convert array of PokemonSpeciesDetail (x) to a data frame
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
    #' Convert PokemonSpeciesDetail to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      PokemonSpeciesDetailObject <- list()
      if (!is.null(self$`id`)) {
        PokemonSpeciesDetailObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`name`)) {
        PokemonSpeciesDetailObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`order`)) {
        PokemonSpeciesDetailObject[["order"]] <-
          self$`order`
      }
      if (!is.null(self$`gender_rate`)) {
        PokemonSpeciesDetailObject[["gender_rate"]] <-
          self$`gender_rate`
      }
      if (!is.null(self$`capture_rate`)) {
        PokemonSpeciesDetailObject[["capture_rate"]] <-
          self$`capture_rate`
      }
      if (!is.null(self$`base_happiness`)) {
        PokemonSpeciesDetailObject[["base_happiness"]] <-
          self$`base_happiness`
      }
      if (!is.null(self$`is_baby`)) {
        PokemonSpeciesDetailObject[["is_baby"]] <-
          self$`is_baby`
      }
      if (!is.null(self$`is_legendary`)) {
        PokemonSpeciesDetailObject[["is_legendary"]] <-
          self$`is_legendary`
      }
      if (!is.null(self$`is_mythical`)) {
        PokemonSpeciesDetailObject[["is_mythical"]] <-
          self$`is_mythical`
      }
      if (!is.null(self$`hatch_counter`)) {
        PokemonSpeciesDetailObject[["hatch_counter"]] <-
          self$`hatch_counter`
      }
      if (!is.null(self$`has_gender_differences`)) {
        PokemonSpeciesDetailObject[["has_gender_differences"]] <-
          self$`has_gender_differences`
      }
      if (!is.null(self$`forms_switchable`)) {
        PokemonSpeciesDetailObject[["forms_switchable"]] <-
          self$`forms_switchable`
      }
      if (!is.null(self$`growth_rate`)) {
        PokemonSpeciesDetailObject[["growth_rate"]] <-
          self$`growth_rate`$toSimpleType()
      }
      if (!is.null(self$`pokedex_numbers`)) {
        PokemonSpeciesDetailObject[["pokedex_numbers"]] <-
          lapply(self$`pokedex_numbers`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`egg_groups`)) {
        PokemonSpeciesDetailObject[["egg_groups"]] <-
          lapply(self$`egg_groups`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`color`)) {
        PokemonSpeciesDetailObject[["color"]] <-
          self$`color`$toSimpleType()
      }
      if (!is.null(self$`shape`)) {
        PokemonSpeciesDetailObject[["shape"]] <-
          self$`shape`$toSimpleType()
      }
      if (!is.null(self$`evolves_from_species`)) {
        PokemonSpeciesDetailObject[["evolves_from_species"]] <-
          self$`evolves_from_species`$toSimpleType()
      }
      if (!is.null(self$`evolution_chain`)) {
        PokemonSpeciesDetailObject[["evolution_chain"]] <-
          self$`evolution_chain`$toSimpleType()
      }
      if (!is.null(self$`habitat`)) {
        PokemonSpeciesDetailObject[["habitat"]] <-
          self$`habitat`$toSimpleType()
      }
      if (!is.null(self$`generation`)) {
        PokemonSpeciesDetailObject[["generation"]] <-
          self$`generation`$toSimpleType()
      }
      if (!is.null(self$`names`)) {
        PokemonSpeciesDetailObject[["names"]] <-
          lapply(self$`names`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`pal_park_encounters`)) {
        PokemonSpeciesDetailObject[["pal_park_encounters"]] <-
          lapply(self$`pal_park_encounters`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`form_descriptions`)) {
        PokemonSpeciesDetailObject[["form_descriptions"]] <-
          lapply(self$`form_descriptions`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`flavor_text_entries`)) {
        PokemonSpeciesDetailObject[["flavor_text_entries"]] <-
          lapply(self$`flavor_text_entries`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`genera`)) {
        PokemonSpeciesDetailObject[["genera"]] <-
          lapply(self$`genera`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`varieties`)) {
        PokemonSpeciesDetailObject[["varieties"]] <-
          lapply(self$`varieties`, function(x) x$toSimpleType())
      }
      return(PokemonSpeciesDetailObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of PokemonSpeciesDetail
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokemonSpeciesDetail
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
      if (!is.null(this_object$`gender_rate`)) {
        self$`gender_rate` <- this_object$`gender_rate`
      }
      if (!is.null(this_object$`capture_rate`)) {
        self$`capture_rate` <- this_object$`capture_rate`
      }
      if (!is.null(this_object$`base_happiness`)) {
        self$`base_happiness` <- this_object$`base_happiness`
      }
      if (!is.null(this_object$`is_baby`)) {
        self$`is_baby` <- this_object$`is_baby`
      }
      if (!is.null(this_object$`is_legendary`)) {
        self$`is_legendary` <- this_object$`is_legendary`
      }
      if (!is.null(this_object$`is_mythical`)) {
        self$`is_mythical` <- this_object$`is_mythical`
      }
      if (!is.null(this_object$`hatch_counter`)) {
        self$`hatch_counter` <- this_object$`hatch_counter`
      }
      if (!is.null(this_object$`has_gender_differences`)) {
        self$`has_gender_differences` <- this_object$`has_gender_differences`
      }
      if (!is.null(this_object$`forms_switchable`)) {
        self$`forms_switchable` <- this_object$`forms_switchable`
      }
      if (!is.null(this_object$`growth_rate`)) {
        `growth_rate_object` <- GrowthRateSummary$new()
        `growth_rate_object`$fromJSON(jsonlite::toJSON(this_object$`growth_rate`, auto_unbox = TRUE, digits = NA))
        self$`growth_rate` <- `growth_rate_object`
      }
      if (!is.null(this_object$`pokedex_numbers`)) {
        self$`pokedex_numbers` <- ApiClient$new()$deserializeObj(this_object$`pokedex_numbers`, "array[PokemonDexEntry]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`egg_groups`)) {
        self$`egg_groups` <- ApiClient$new()$deserializeObj(this_object$`egg_groups`, "array[AbilityDetailPokemonInnerPokemon]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`color`)) {
        `color_object` <- PokemonColorSummary$new()
        `color_object`$fromJSON(jsonlite::toJSON(this_object$`color`, auto_unbox = TRUE, digits = NA))
        self$`color` <- `color_object`
      }
      if (!is.null(this_object$`shape`)) {
        `shape_object` <- PokemonShapeSummary$new()
        `shape_object`$fromJSON(jsonlite::toJSON(this_object$`shape`, auto_unbox = TRUE, digits = NA))
        self$`shape` <- `shape_object`
      }
      if (!is.null(this_object$`evolves_from_species`)) {
        `evolves_from_species_object` <- PokemonSpeciesSummary$new()
        `evolves_from_species_object`$fromJSON(jsonlite::toJSON(this_object$`evolves_from_species`, auto_unbox = TRUE, digits = NA))
        self$`evolves_from_species` <- `evolves_from_species_object`
      }
      if (!is.null(this_object$`evolution_chain`)) {
        `evolution_chain_object` <- EvolutionChainSummary$new()
        `evolution_chain_object`$fromJSON(jsonlite::toJSON(this_object$`evolution_chain`, auto_unbox = TRUE, digits = NA))
        self$`evolution_chain` <- `evolution_chain_object`
      }
      if (!is.null(this_object$`habitat`)) {
        `habitat_object` <- PokemonHabitatSummary$new()
        `habitat_object`$fromJSON(jsonlite::toJSON(this_object$`habitat`, auto_unbox = TRUE, digits = NA))
        self$`habitat` <- `habitat_object`
      }
      if (!is.null(this_object$`generation`)) {
        `generation_object` <- GenerationSummary$new()
        `generation_object`$fromJSON(jsonlite::toJSON(this_object$`generation`, auto_unbox = TRUE, digits = NA))
        self$`generation` <- `generation_object`
      }
      if (!is.null(this_object$`names`)) {
        self$`names` <- ApiClient$new()$deserializeObj(this_object$`names`, "array[PokemonFormDetailFormNamesInner]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`pal_park_encounters`)) {
        self$`pal_park_encounters` <- ApiClient$new()$deserializeObj(this_object$`pal_park_encounters`, "array[PokemonSpeciesDetailPalParkEncountersInner]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`form_descriptions`)) {
        self$`form_descriptions` <- ApiClient$new()$deserializeObj(this_object$`form_descriptions`, "array[PokemonSpeciesDescription]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`flavor_text_entries`)) {
        self$`flavor_text_entries` <- ApiClient$new()$deserializeObj(this_object$`flavor_text_entries`, "array[PokemonSpeciesFlavorText]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`genera`)) {
        self$`genera` <- ApiClient$new()$deserializeObj(this_object$`genera`, "array[PokemonSpeciesDetailGeneraInner]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`varieties`)) {
        self$`varieties` <- ApiClient$new()$deserializeObj(this_object$`varieties`, "array[PokemonSpeciesDetailVarietiesInner]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return PokemonSpeciesDetail in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of PokemonSpeciesDetail
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokemonSpeciesDetail
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`name` <- this_object$`name`
      self$`order` <- this_object$`order`
      self$`gender_rate` <- this_object$`gender_rate`
      self$`capture_rate` <- this_object$`capture_rate`
      self$`base_happiness` <- this_object$`base_happiness`
      self$`is_baby` <- this_object$`is_baby`
      self$`is_legendary` <- this_object$`is_legendary`
      self$`is_mythical` <- this_object$`is_mythical`
      self$`hatch_counter` <- this_object$`hatch_counter`
      self$`has_gender_differences` <- this_object$`has_gender_differences`
      self$`forms_switchable` <- this_object$`forms_switchable`
      self$`growth_rate` <- GrowthRateSummary$new()$fromJSON(jsonlite::toJSON(this_object$`growth_rate`, auto_unbox = TRUE, digits = NA))
      self$`pokedex_numbers` <- ApiClient$new()$deserializeObj(this_object$`pokedex_numbers`, "array[PokemonDexEntry]", loadNamespace("openapi"))
      self$`egg_groups` <- ApiClient$new()$deserializeObj(this_object$`egg_groups`, "array[AbilityDetailPokemonInnerPokemon]", loadNamespace("openapi"))
      self$`color` <- PokemonColorSummary$new()$fromJSON(jsonlite::toJSON(this_object$`color`, auto_unbox = TRUE, digits = NA))
      self$`shape` <- PokemonShapeSummary$new()$fromJSON(jsonlite::toJSON(this_object$`shape`, auto_unbox = TRUE, digits = NA))
      self$`evolves_from_species` <- PokemonSpeciesSummary$new()$fromJSON(jsonlite::toJSON(this_object$`evolves_from_species`, auto_unbox = TRUE, digits = NA))
      self$`evolution_chain` <- EvolutionChainSummary$new()$fromJSON(jsonlite::toJSON(this_object$`evolution_chain`, auto_unbox = TRUE, digits = NA))
      self$`habitat` <- PokemonHabitatSummary$new()$fromJSON(jsonlite::toJSON(this_object$`habitat`, auto_unbox = TRUE, digits = NA))
      self$`generation` <- GenerationSummary$new()$fromJSON(jsonlite::toJSON(this_object$`generation`, auto_unbox = TRUE, digits = NA))
      self$`names` <- ApiClient$new()$deserializeObj(this_object$`names`, "array[PokemonFormDetailFormNamesInner]", loadNamespace("openapi"))
      self$`pal_park_encounters` <- ApiClient$new()$deserializeObj(this_object$`pal_park_encounters`, "array[PokemonSpeciesDetailPalParkEncountersInner]", loadNamespace("openapi"))
      self$`form_descriptions` <- ApiClient$new()$deserializeObj(this_object$`form_descriptions`, "array[PokemonSpeciesDescription]", loadNamespace("openapi"))
      self$`flavor_text_entries` <- ApiClient$new()$deserializeObj(this_object$`flavor_text_entries`, "array[PokemonSpeciesFlavorText]", loadNamespace("openapi"))
      self$`genera` <- ApiClient$new()$deserializeObj(this_object$`genera`, "array[PokemonSpeciesDetailGeneraInner]", loadNamespace("openapi"))
      self$`varieties` <- ApiClient$new()$deserializeObj(this_object$`varieties`, "array[PokemonSpeciesDetailVarietiesInner]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to PokemonSpeciesDetail and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for PokemonSpeciesDetail: the required field `id` is missing."))
      }
      # check the required field `name`
      if (!is.null(input_json$`name`)) {
        if (!(is.character(input_json$`name`) && length(input_json$`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", input_json$`name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonSpeciesDetail: the required field `name` is missing."))
      }
      # check the required field `growth_rate`
      if (!is.null(input_json$`growth_rate`)) {
        stopifnot(R6::is.R6(input_json$`growth_rate`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonSpeciesDetail: the required field `growth_rate` is missing."))
      }
      # check the required field `pokedex_numbers`
      if (!is.null(input_json$`pokedex_numbers`)) {
        stopifnot(is.vector(input_json$`pokedex_numbers`), length(input_json$`pokedex_numbers`) != 0)
        tmp <- sapply(input_json$`pokedex_numbers`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonSpeciesDetail: the required field `pokedex_numbers` is missing."))
      }
      # check the required field `egg_groups`
      if (!is.null(input_json$`egg_groups`)) {
        stopifnot(is.vector(input_json$`egg_groups`), length(input_json$`egg_groups`) != 0)
        tmp <- sapply(input_json$`egg_groups`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonSpeciesDetail: the required field `egg_groups` is missing."))
      }
      # check the required field `color`
      if (!is.null(input_json$`color`)) {
        stopifnot(R6::is.R6(input_json$`color`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonSpeciesDetail: the required field `color` is missing."))
      }
      # check the required field `shape`
      if (!is.null(input_json$`shape`)) {
        stopifnot(R6::is.R6(input_json$`shape`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonSpeciesDetail: the required field `shape` is missing."))
      }
      # check the required field `evolves_from_species`
      if (!is.null(input_json$`evolves_from_species`)) {
        stopifnot(R6::is.R6(input_json$`evolves_from_species`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonSpeciesDetail: the required field `evolves_from_species` is missing."))
      }
      # check the required field `evolution_chain`
      if (!is.null(input_json$`evolution_chain`)) {
        stopifnot(R6::is.R6(input_json$`evolution_chain`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonSpeciesDetail: the required field `evolution_chain` is missing."))
      }
      # check the required field `habitat`
      if (!is.null(input_json$`habitat`)) {
        stopifnot(R6::is.R6(input_json$`habitat`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonSpeciesDetail: the required field `habitat` is missing."))
      }
      # check the required field `generation`
      if (!is.null(input_json$`generation`)) {
        stopifnot(R6::is.R6(input_json$`generation`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonSpeciesDetail: the required field `generation` is missing."))
      }
      # check the required field `names`
      if (!is.null(input_json$`names`)) {
        stopifnot(is.vector(input_json$`names`), length(input_json$`names`) != 0)
        tmp <- sapply(input_json$`names`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonSpeciesDetail: the required field `names` is missing."))
      }
      # check the required field `pal_park_encounters`
      if (!is.null(input_json$`pal_park_encounters`)) {
        stopifnot(is.vector(input_json$`pal_park_encounters`), length(input_json$`pal_park_encounters`) != 0)
        tmp <- sapply(input_json$`pal_park_encounters`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonSpeciesDetail: the required field `pal_park_encounters` is missing."))
      }
      # check the required field `form_descriptions`
      if (!is.null(input_json$`form_descriptions`)) {
        stopifnot(is.vector(input_json$`form_descriptions`), length(input_json$`form_descriptions`) != 0)
        tmp <- sapply(input_json$`form_descriptions`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonSpeciesDetail: the required field `form_descriptions` is missing."))
      }
      # check the required field `flavor_text_entries`
      if (!is.null(input_json$`flavor_text_entries`)) {
        stopifnot(is.vector(input_json$`flavor_text_entries`), length(input_json$`flavor_text_entries`) != 0)
        tmp <- sapply(input_json$`flavor_text_entries`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonSpeciesDetail: the required field `flavor_text_entries` is missing."))
      }
      # check the required field `genera`
      if (!is.null(input_json$`genera`)) {
        stopifnot(is.vector(input_json$`genera`), length(input_json$`genera`) != 0)
        tmp <- sapply(input_json$`genera`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonSpeciesDetail: the required field `genera` is missing."))
      }
      # check the required field `varieties`
      if (!is.null(input_json$`varieties`)) {
        stopifnot(is.vector(input_json$`varieties`), length(input_json$`varieties`) != 0)
        tmp <- sapply(input_json$`varieties`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonSpeciesDetail: the required field `varieties` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PokemonSpeciesDetail
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

      # check if the required `growth_rate` is null
      if (is.null(self$`growth_rate`)) {
        return(FALSE)
      }

      # check if the required `pokedex_numbers` is null
      if (is.null(self$`pokedex_numbers`)) {
        return(FALSE)
      }

      # check if the required `egg_groups` is null
      if (is.null(self$`egg_groups`)) {
        return(FALSE)
      }

      # check if the required `color` is null
      if (is.null(self$`color`)) {
        return(FALSE)
      }

      # check if the required `shape` is null
      if (is.null(self$`shape`)) {
        return(FALSE)
      }

      # check if the required `evolves_from_species` is null
      if (is.null(self$`evolves_from_species`)) {
        return(FALSE)
      }

      # check if the required `evolution_chain` is null
      if (is.null(self$`evolution_chain`)) {
        return(FALSE)
      }

      # check if the required `habitat` is null
      if (is.null(self$`habitat`)) {
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

      # check if the required `pal_park_encounters` is null
      if (is.null(self$`pal_park_encounters`)) {
        return(FALSE)
      }

      # check if the required `form_descriptions` is null
      if (is.null(self$`form_descriptions`)) {
        return(FALSE)
      }

      # check if the required `flavor_text_entries` is null
      if (is.null(self$`flavor_text_entries`)) {
        return(FALSE)
      }

      # check if the required `genera` is null
      if (is.null(self$`genera`)) {
        return(FALSE)
      }

      # check if the required `varieties` is null
      if (is.null(self$`varieties`)) {
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

      # check if the required `growth_rate` is null
      if (is.null(self$`growth_rate`)) {
        invalid_fields["growth_rate"] <- "Non-nullable required field `growth_rate` cannot be null."
      }

      # check if the required `pokedex_numbers` is null
      if (is.null(self$`pokedex_numbers`)) {
        invalid_fields["pokedex_numbers"] <- "Non-nullable required field `pokedex_numbers` cannot be null."
      }

      # check if the required `egg_groups` is null
      if (is.null(self$`egg_groups`)) {
        invalid_fields["egg_groups"] <- "Non-nullable required field `egg_groups` cannot be null."
      }

      # check if the required `color` is null
      if (is.null(self$`color`)) {
        invalid_fields["color"] <- "Non-nullable required field `color` cannot be null."
      }

      # check if the required `shape` is null
      if (is.null(self$`shape`)) {
        invalid_fields["shape"] <- "Non-nullable required field `shape` cannot be null."
      }

      # check if the required `evolves_from_species` is null
      if (is.null(self$`evolves_from_species`)) {
        invalid_fields["evolves_from_species"] <- "Non-nullable required field `evolves_from_species` cannot be null."
      }

      # check if the required `evolution_chain` is null
      if (is.null(self$`evolution_chain`)) {
        invalid_fields["evolution_chain"] <- "Non-nullable required field `evolution_chain` cannot be null."
      }

      # check if the required `habitat` is null
      if (is.null(self$`habitat`)) {
        invalid_fields["habitat"] <- "Non-nullable required field `habitat` cannot be null."
      }

      # check if the required `generation` is null
      if (is.null(self$`generation`)) {
        invalid_fields["generation"] <- "Non-nullable required field `generation` cannot be null."
      }

      # check if the required `names` is null
      if (is.null(self$`names`)) {
        invalid_fields["names"] <- "Non-nullable required field `names` cannot be null."
      }

      # check if the required `pal_park_encounters` is null
      if (is.null(self$`pal_park_encounters`)) {
        invalid_fields["pal_park_encounters"] <- "Non-nullable required field `pal_park_encounters` cannot be null."
      }

      # check if the required `form_descriptions` is null
      if (is.null(self$`form_descriptions`)) {
        invalid_fields["form_descriptions"] <- "Non-nullable required field `form_descriptions` cannot be null."
      }

      # check if the required `flavor_text_entries` is null
      if (is.null(self$`flavor_text_entries`)) {
        invalid_fields["flavor_text_entries"] <- "Non-nullable required field `flavor_text_entries` cannot be null."
      }

      # check if the required `genera` is null
      if (is.null(self$`genera`)) {
        invalid_fields["genera"] <- "Non-nullable required field `genera` cannot be null."
      }

      # check if the required `varieties` is null
      if (is.null(self$`varieties`)) {
        invalid_fields["varieties"] <- "Non-nullable required field `varieties` cannot be null."
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
# PokemonSpeciesDetail$unlock()
#
## Below is an example to define the print function
# PokemonSpeciesDetail$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PokemonSpeciesDetail$lock()

