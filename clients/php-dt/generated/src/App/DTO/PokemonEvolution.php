<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class PokemonEvolution
{
    /**
     * The version group in which these evolution requirements apply.
     * @DTA\Data(field="version_group")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\VersionGroupSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\VersionGroupSummary::class})
     */
    public ?\App\DTO\VersionGroupSummary $version_group = null;

    /**
     * Whether the evolution is considered as the expected evolution in a main series game. Each unique Pokémon variety of a line capable of evolution should have exactly one &#39;default&#39; evolution. For example, the Meowth species has three default evolutions as there are three distinct varieties it can evolve into: Persian, Alolan Persian, and Perrserker.
     * @DTA\Data(field="is_default", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $is_default = null;

    /**
     * The item required to cause evolution this into Pokémon species.
     * @DTA\Data(field="item")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ItemSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ItemSummary::class})
     */
    public ?\App\DTO\ItemSummary $item = null;

    /**
     * The type of event that triggers evolution into this Pokémon species.
     * @DTA\Data(field="trigger")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\EvolutionTriggerSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\EvolutionTriggerSummary::class})
     */
    public ?\App\DTO\EvolutionTriggerSummary $trigger = null;

    /**
     * The id of the gender of the evolving Pokémon species must be in order to evolve into this Pokémon species.
     * @DTA\Data(field="gender", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $gender = null;

    /**
     * The item the evolving Pokémon species must be holding during the evolution trigger event to evolve into this Pokémon species.
     * @DTA\Data(field="held_item")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ItemSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ItemSummary::class})
     */
    public ?\App\DTO\ItemSummary $held_item = null;

    /**
     * @DTA\Data(field="known_move")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PokemonEvolutionKnownMove::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PokemonEvolutionKnownMove::class})
     */
    public ?\App\DTO\PokemonEvolutionKnownMove $known_move = null;

    /**
     * @DTA\Data(field="known_move_type")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PokemonEvolutionKnownMove::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PokemonEvolutionKnownMove::class})
     */
    public ?\App\DTO\PokemonEvolutionKnownMove $known_move_type = null;

    /**
     * The location the evolution must be triggered at.
     * @DTA\Data(field="location")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\LocationSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\LocationSummary::class})
     */
    public ?\App\DTO\LocationSummary $location = null;

    /**
     * The minimum required level of the evolving Pokémon species to evolve into this Pokémon species.
     * @DTA\Data(field="min_level", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":-2147483648, "max":2147483647})
     */
    public ?int $min_level = null;

    /**
     * The minimum required level of happiness the evolving Pokémon species to evolve into this Pokémon species.
     * @DTA\Data(field="min_happiness", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":-2147483648, "max":2147483647})
     */
    public ?int $min_happiness = null;

    /**
     * The minimum required level of beauty the evolving Pokémon species to evolve into this Pokémon species.
     * @DTA\Data(field="min_beauty", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":-2147483648, "max":2147483647})
     */
    public ?int $min_beauty = null;

    /**
     * The minimum required level of affection the evolving Pokémon species to evolve into this Pokémon species.
     * @DTA\Data(field="min_affection", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":-2147483648, "max":2147483647})
     */
    public ?int $min_affection = null;

    /**
     * Whether or not you need to be near a Moss Rock or Icy Rock to evolve into this Pokémon species.
     * @DTA\Data(field="near_special_rock", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $near_special_rock = null;

    /**
     * Whether or not multiplayer link play is needed to evolve into this Pokémon species (e.g. Union Circle).
     * @DTA\Data(field="needs_multiplayer", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $needs_multiplayer = null;

    /**
     * Whether or not it must be raining in the overworld to cause evolution this Pokémon species.
     * @DTA\Data(field="needs_overworld_rain", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $needs_overworld_rain = null;

    /**
     * The Pokémon species that must be in the players party in order for the evolving Pokémon species to evolve into this Pokémon species.
     * @DTA\Data(field="party_species")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PokemonSpeciesSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PokemonSpeciesSummary::class})
     */
    public ?\App\DTO\PokemonSpeciesSummary $party_species = null;

    /**
     * The player must have a Pokémon of this type in their party during the evolution trigger event in order for the evolving Pokémon species to evolve into this Pokémon species.
     * @DTA\Data(field="party_type")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TypeSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TypeSummary::class})
     */
    public ?\App\DTO\TypeSummary $party_type = null;

    /**
     * The required relation between the Pokémon&#39;s Attack and Defense stats. 1 means Attack &gt; Defense. 0 means Attack &#x3D; Defense. -1 means Attack &lt; Defense.
     * @DTA\Data(field="relative_physical_stats", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":-2147483648, "max":2147483647})
     */
    public ?int $relative_physical_stats = null;

    /**
     * The required time of day. Day or night.
     * @DTA\Data(field="time_of_day", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":10})
     */
    public ?string $time_of_day = null;

    /**
     * Pokémon species for which this one must be traded.
     * @DTA\Data(field="trade_species")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PokemonSpeciesSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PokemonSpeciesSummary::class})
     */
    public ?\App\DTO\PokemonSpeciesSummary $trade_species = null;

    /**
     * Whether or not the 3DS needs to be turned upside-down as this Pokémon levels up.
     * @DTA\Data(field="turn_upside_down", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $turn_upside_down = null;

    /**
     * The required region in which this evolution can occur.
     * @DTA\Data(field="region")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RegionSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RegionSummary::class})
     */
    public ?\App\DTO\RegionSummary $region = null;

    /**
     * The Pokémon form required before evolving, or null if unrestricted.
     * @DTA\Data(field="required_pokemon_form")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PokemonFormSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PokemonFormSummary::class})
     */
    public ?\App\DTO\PokemonFormSummary $required_pokemon_form = null;

    /**
     * The Pokémon form produced by this evolution, or null if unspecified.
     * @DTA\Data(field="evolved_pokemon_form")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PokemonFormSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PokemonFormSummary::class})
     */
    public ?\App\DTO\PokemonFormSummary $evolved_pokemon_form = null;

    /**
     * The move that must be used by the evolving Pokémon species during the evolution trigger event in order to evolve into this Pokémon species.
     * @DTA\Data(field="used_move")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MoveSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MoveSummary::class})
     */
    public ?\App\DTO\MoveSummary $used_move = null;

    /**
     * The minimum number of times a move must be used in order to evolve into this Pokémon species.
     * @DTA\Data(field="min_move_count", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":-2147483648, "max":2147483647})
     */
    public ?int $min_move_count = null;

    /**
     * The minimum number of steps that must be taken in order to evolve into this Pokémon species.
     * @DTA\Data(field="min_steps", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":-2147483648, "max":2147483647})
     */
    public ?int $min_steps = null;

    /**
     * The minimum amount of damage taken during the evolution trigger event in order to evolve into this Pokémon species.
     * @DTA\Data(field="min_damage_taken", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":-2147483648, "max":2147483647})
     */
    public ?int $min_damage_taken = null;

    /**
     * The natures that allow this evolution, or null if unrestricted.
     * @DTA\Data(field="allowed_natures")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $allowed_natures = null;

    /**
     * An additional evolution condition expressed in reverse Polish notation, or null if none.
     * @DTA\Data(field="condition_expression")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\EvolutionConditionExpression::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\EvolutionConditionExpression::class})
     */
    public ?\App\DTO\EvolutionConditionExpression $condition_expression = null;

}
