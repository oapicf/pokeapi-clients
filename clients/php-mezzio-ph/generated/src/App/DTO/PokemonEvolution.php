<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class PokemonEvolution
{
    /**
     * The version group in which these evolution requirements apply.
     * @DTA\Data(field="version_group")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\VersionGroupSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\VersionGroupSummary::class})
     * @var \App\DTO\VersionGroupSummary|null
     */
    public $version_group;

    /**
     * Whether the evolution is considered as the expected evolution in a main series game. Each unique Pokémon variety of a line capable of evolution should have exactly one &#39;default&#39; evolution. For example, the Meowth species has three default evolutions as there are three distinct varieties it can evolve into: Persian, Alolan Persian, and Perrserker.
     * @DTA\Data(field="is_default", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $is_default;

    /**
     * The item required to cause evolution this into Pokémon species.
     * @DTA\Data(field="item")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ItemSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ItemSummary::class})
     * @var \App\DTO\ItemSummary|null
     */
    public $item;

    /**
     * The type of event that triggers evolution into this Pokémon species.
     * @DTA\Data(field="trigger")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\EvolutionTriggerSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\EvolutionTriggerSummary::class})
     * @var \App\DTO\EvolutionTriggerSummary|null
     */
    public $trigger;

    /**
     * The id of the gender of the evolving Pokémon species must be in order to evolve into this Pokémon species.
     * @DTA\Data(field="gender", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $gender;

    /**
     * The item the evolving Pokémon species must be holding during the evolution trigger event to evolve into this Pokémon species.
     * @DTA\Data(field="held_item")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ItemSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ItemSummary::class})
     * @var \App\DTO\ItemSummary|null
     */
    public $held_item;

    /**
     * @DTA\Data(field="known_move")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PokemonEvolutionKnownMove::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PokemonEvolutionKnownMove::class})
     * @var \App\DTO\PokemonEvolutionKnownMove|null
     */
    public $known_move;

    /**
     * @DTA\Data(field="known_move_type")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PokemonEvolutionKnownMove::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PokemonEvolutionKnownMove::class})
     * @var \App\DTO\PokemonEvolutionKnownMove|null
     */
    public $known_move_type;

    /**
     * The location the evolution must be triggered at.
     * @DTA\Data(field="location")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\LocationSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\LocationSummary::class})
     * @var \App\DTO\LocationSummary|null
     */
    public $location;

    /**
     * The minimum required level of the evolving Pokémon species to evolve into this Pokémon species.
     * @DTA\Data(field="min_level", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":-2147483648, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":2147483647, "inclusive":true})
     * @var int|null
     */
    public $min_level;

    /**
     * The minimum required level of happiness the evolving Pokémon species to evolve into this Pokémon species.
     * @DTA\Data(field="min_happiness", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":-2147483648, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":2147483647, "inclusive":true})
     * @var int|null
     */
    public $min_happiness;

    /**
     * The minimum required level of beauty the evolving Pokémon species to evolve into this Pokémon species.
     * @DTA\Data(field="min_beauty", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":-2147483648, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":2147483647, "inclusive":true})
     * @var int|null
     */
    public $min_beauty;

    /**
     * The minimum required level of affection the evolving Pokémon species to evolve into this Pokémon species.
     * @DTA\Data(field="min_affection", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":-2147483648, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":2147483647, "inclusive":true})
     * @var int|null
     */
    public $min_affection;

    /**
     * Whether or not you need to be near a Moss Rock or Icy Rock to evolve into this Pokémon species.
     * @DTA\Data(field="near_special_rock", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $near_special_rock;

    /**
     * Whether or not multiplayer link play is needed to evolve into this Pokémon species (e.g. Union Circle).
     * @DTA\Data(field="needs_multiplayer", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $needs_multiplayer;

    /**
     * Whether or not it must be raining in the overworld to cause evolution this Pokémon species.
     * @DTA\Data(field="needs_overworld_rain", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $needs_overworld_rain;

    /**
     * The Pokémon species that must be in the players party in order for the evolving Pokémon species to evolve into this Pokémon species.
     * @DTA\Data(field="party_species")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PokemonSpeciesSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PokemonSpeciesSummary::class})
     * @var \App\DTO\PokemonSpeciesSummary|null
     */
    public $party_species;

    /**
     * The player must have a Pokémon of this type in their party during the evolution trigger event in order for the evolving Pokémon species to evolve into this Pokémon species.
     * @DTA\Data(field="party_type")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TypeSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TypeSummary::class})
     * @var \App\DTO\TypeSummary|null
     */
    public $party_type;

    /**
     * The required relation between the Pokémon&#39;s Attack and Defense stats. 1 means Attack &gt; Defense. 0 means Attack &#x3D; Defense. -1 means Attack &lt; Defense.
     * @DTA\Data(field="relative_physical_stats", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":-2147483648, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":2147483647, "inclusive":true})
     * @var int|null
     */
    public $relative_physical_stats;

    /**
     * The required time of day. Day or night.
     * @DTA\Data(field="time_of_day", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":10})
     * @var string|null
     */
    public $time_of_day;

    /**
     * Pokémon species for which this one must be traded.
     * @DTA\Data(field="trade_species")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PokemonSpeciesSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PokemonSpeciesSummary::class})
     * @var \App\DTO\PokemonSpeciesSummary|null
     */
    public $trade_species;

    /**
     * Whether or not the 3DS needs to be turned upside-down as this Pokémon levels up.
     * @DTA\Data(field="turn_upside_down", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $turn_upside_down;

    /**
     * The required region in which this evolution can occur.
     * @DTA\Data(field="region")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RegionSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RegionSummary::class})
     * @var \App\DTO\RegionSummary|null
     */
    public $region;

    /**
     * The Pokémon form required before evolving, or null if unrestricted.
     * @DTA\Data(field="required_pokemon_form")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PokemonFormSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PokemonFormSummary::class})
     * @var \App\DTO\PokemonFormSummary|null
     */
    public $required_pokemon_form;

    /**
     * The Pokémon form produced by this evolution, or null if unspecified.
     * @DTA\Data(field="evolved_pokemon_form")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PokemonFormSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PokemonFormSummary::class})
     * @var \App\DTO\PokemonFormSummary|null
     */
    public $evolved_pokemon_form;

    /**
     * The move that must be used by the evolving Pokémon species during the evolution trigger event in order to evolve into this Pokémon species.
     * @DTA\Data(field="used_move")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MoveSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MoveSummary::class})
     * @var \App\DTO\MoveSummary|null
     */
    public $used_move;

    /**
     * The minimum number of times a move must be used in order to evolve into this Pokémon species.
     * @DTA\Data(field="min_move_count", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":-2147483648, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":2147483647, "inclusive":true})
     * @var int|null
     */
    public $min_move_count;

    /**
     * The minimum number of steps that must be taken in order to evolve into this Pokémon species.
     * @DTA\Data(field="min_steps", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":-2147483648, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":2147483647, "inclusive":true})
     * @var int|null
     */
    public $min_steps;

    /**
     * The minimum amount of damage taken during the evolution trigger event in order to evolve into this Pokémon species.
     * @DTA\Data(field="min_damage_taken", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":-2147483648, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":2147483647, "inclusive":true})
     * @var int|null
     */
    public $min_damage_taken;

    /**
     * The natures that allow this evolution, or null if unrestricted.
     * @DTA\Data(field="allowed_natures")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\NatureSummary[]|null
     */
    public $allowed_natures;

    /**
     * An additional evolution condition expressed in reverse Polish notation, or null if none.
     * @DTA\Data(field="condition_expression")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\EvolutionConditionExpression::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\EvolutionConditionExpression::class})
     * @var \App\DTO\EvolutionConditionExpression|null
     */
    public $condition_expression;

}
