<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class PokemonSpeciesDetail
{
    /**
     * The identifier for this resource.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $id = null;

    /**
     * The name for this resource.
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":200})
     */
    public ?string $name = null;

    /**
     * The order in which species should be sorted. Based on National Dex order, except families are grouped together and sorted by stage.
     * @DTA\Data(field="order", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":-2147483648, "max":2147483647})
     */
    public ?int $order = null;

    /**
     * The chance of this Pokémon being female, in eighths; or -1 for genderless.
     * @DTA\Data(field="gender_rate", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":-2147483648, "max":2147483647})
     */
    public ?int $gender_rate = null;

    /**
     * The base capture rate; up to 255. The higher the number, the easier the catch.
     * @DTA\Data(field="capture_rate", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":-2147483648, "max":2147483647})
     */
    public ?int $capture_rate = null;

    /**
     * The happiness when caught by a normal Pokéball; up to 255. The higher the number, the happier the Pokémon.
     * @DTA\Data(field="base_happiness", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":-2147483648, "max":2147483647})
     */
    public ?int $base_happiness = null;

    /**
     * Whether or not this is a baby Pokémon.
     * @DTA\Data(field="is_baby", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $is_baby = null;

    /**
     * Whether or not this is a legendary Pokémon.
     * @DTA\Data(field="is_legendary", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $is_legendary = null;

    /**
     * Whether or not this is a mythical Pokémon.
     * @DTA\Data(field="is_mythical", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $is_mythical = null;

    /**
     * Initial hatch counter: one must walk Y × (hatch_counter + 1) steps before this Pokémon&#39;s egg hatches, unless utilizing bonuses like Flame Body&#39;s. Y varies per generation. In Generations II, III, and VII, Egg cycles are 256 steps long. In Generation IV, Egg cycles are 255 steps long. In Pokémon Brilliant Diamond and Shining Pearl, Egg cycles are also 255 steps long, but are shorter on special dates. In Generations V and VI, Egg cycles are 257 steps long. In Pokémon Sword and Shield, and in Pokémon Scarlet and Violet, Egg cycles are 128 steps long.
     * @DTA\Data(field="hatch_counter", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":-2147483648, "max":2147483647})
     */
    public ?int $hatch_counter = null;

    /**
     * Whether or not this Pokémon has visual gender differences.
     * @DTA\Data(field="has_gender_differences", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $has_gender_differences = null;

    /**
     * Whether or not this Pokémon has multiple forms and can switch between them.
     * @DTA\Data(field="forms_switchable", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $forms_switchable = null;

    /**
     * The rate at which this Pokémon species gains levels.
     * @DTA\Data(field="growth_rate")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\GrowthRateSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\GrowthRateSummary::class})
     */
    public ?\App\DTO\GrowthRateSummary $growth_rate = null;

    /**
     * A list of Pokedexes and the indexes reserved within them for this Pokémon species.
     * @DTA\Data(field="pokedex_numbers")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection170::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection170::class})
     */
    public ?\App\DTO\Collection170 $pokedex_numbers = null;

    /**
     * A list of egg groups this Pokémon species is a member of.
     * @DTA\Data(field="egg_groups")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection171::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection171::class})
     */
    public ?\App\DTO\Collection171 $egg_groups = null;

    /**
     * The color of this Pokémon for Pokédex search.
     * @DTA\Data(field="color")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PokemonColorSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PokemonColorSummary::class})
     */
    public ?\App\DTO\PokemonColorSummary $color = null;

    /**
     * The shape of this Pokémon for Pokédex search.
     * @DTA\Data(field="shape")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PokemonShapeSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PokemonShapeSummary::class})
     */
    public ?\App\DTO\PokemonShapeSummary $shape = null;

    /**
     * The Pokémon species that evolves into this Pokemon_species.
     * @DTA\Data(field="evolves_from_species")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PokemonSpeciesSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PokemonSpeciesSummary::class})
     */
    public ?\App\DTO\PokemonSpeciesSummary $evolves_from_species = null;

    /**
     * The evolution chain this Pokémon species is a member of.
     * @DTA\Data(field="evolution_chain")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\EvolutionChainSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\EvolutionChainSummary::class})
     */
    public ?\App\DTO\EvolutionChainSummary $evolution_chain = null;

    /**
     * The habitat this Pokémon species can be encountered in.
     * @DTA\Data(field="habitat")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PokemonHabitatSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PokemonHabitatSummary::class})
     */
    public ?\App\DTO\PokemonHabitatSummary $habitat = null;

    /**
     * The generation this Pokémon species was introduced in.
     * @DTA\Data(field="generation")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\GenerationSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\GenerationSummary::class})
     */
    public ?\App\DTO\GenerationSummary $generation = null;

    /**
     * The name of this resource listed in different languages.
     * @DTA\Data(field="names")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection172::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection172::class})
     */
    public ?\App\DTO\Collection172 $names = null;

    /**
     * A list of encounters that can be had with this Pokémon species in pal park.
     * @DTA\Data(field="pal_park_encounters")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection173::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection173::class})
     */
    public ?\App\DTO\Collection173 $pal_park_encounters = null;

    /**
     * Descriptions of different forms Pokémon take on within the Pokémon species.
     * @DTA\Data(field="form_descriptions")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection174::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection174::class})
     */
    public ?\App\DTO\Collection174 $form_descriptions = null;

    /**
     * A list of flavor text entries for this Pokémon species.
     * @DTA\Data(field="flavor_text_entries")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection175::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection175::class})
     */
    public ?\App\DTO\Collection175 $flavor_text_entries = null;

    /**
     * The genus of this Pokémon species listed in multiple languages.
     * @DTA\Data(field="genera")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection176::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection176::class})
     */
    public ?\App\DTO\Collection176 $genera = null;

    /**
     * A list of the Pokémon that exist within this Pokémon species.
     * @DTA\Data(field="varieties")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection177::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection177::class})
     */
    public ?\App\DTO\Collection177 $varieties = null;

}
