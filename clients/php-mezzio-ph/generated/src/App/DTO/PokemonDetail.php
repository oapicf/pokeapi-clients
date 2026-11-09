<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class PokemonDetail
{
    /**
     * The identifier for this resource.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $id;

    /**
     * The name for this resource.
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":200})
     * @var string|null
     */
    public $name;

    /**
     * The base experience gained for defeating this Pokémon.
     * @DTA\Data(field="base_experience", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":-2147483648, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":2147483647, "inclusive":true})
     * @var int|null
     */
    public $base_experience;

    /**
     * The height of this Pokémon in decimetres.
     * @DTA\Data(field="height", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":-2147483648, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":2147483647, "inclusive":true})
     * @var int|null
     */
    public $height;

    /**
     * Set for exactly one Pokémon used as the default for each species.
     * @DTA\Data(field="is_default", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $is_default;

    /**
     * Order for sorting. Almost national order, except families are grouped together.
     * @DTA\Data(field="order", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":-2147483648, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":2147483647, "inclusive":true})
     * @var int|null
     */
    public $order;

    /**
     * The weight of this Pokémon in hectograms.
     * @DTA\Data(field="weight", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":-2147483648, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":2147483647, "inclusive":true})
     * @var int|null
     */
    public $weight;

    /**
     * A list of abilities this Pokémon could potentially have.
     * @DTA\Data(field="abilities")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection138::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection138::class})
     * @var \App\DTO\Collection138|null
     */
    public $abilities;

    /**
     * A list of details showing abilities this pokémon had in previous generations
     * @DTA\Data(field="past_abilities")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection140::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection140::class})
     * @var \App\DTO\Collection140|null
     */
    public $past_abilities;

    /**
     * A list of forms this Pokémon can take on.
     * @DTA\Data(field="forms")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection141::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection141::class})
     * @var \App\DTO\Collection141|null
     */
    public $forms;

    /**
     * A list of game indices relevent to Pokémon item by generation.
     * @DTA\Data(field="game_indices")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection142::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection142::class})
     * @var \App\DTO\Collection142|null
     */
    public $game_indices;

    /**
     * A list of items this Pokémon may be holding when encountered.
     * @DTA\Data(field="held_items")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection144::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection144::class})
     * @var \App\DTO\Collection144|null
     */
    public $held_items;

    /**
     * A link to a list of location areas, as well as encounter details pertaining to specific versions.
     * @DTA\Data(field="location_area_encounters")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $location_area_encounters;

    /**
     * A list of moves along with learn methods and level details pertaining to specific version groups.
     * @DTA\Data(field="moves")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection146::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection146::class})
     * @var \App\DTO\Collection146|null
     */
    public $moves;

    /**
     * The species this Pokémon belongs to.
     * @DTA\Data(field="species")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PokemonSpeciesSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PokemonSpeciesSummary::class})
     * @var \App\DTO\PokemonSpeciesSummary|null
     */
    public $species;

    /**
     * A set of sprites used to depict this Pokémon in the game. A visual representation of the various sprites can be found at &lt;a href&#x3D;&#39;https://github.com/PokeAPI/sprites#sprites&#39;&gt;PokeAPI/sprites&lt;/a&gt;
     * @DTA\Data(field="sprites")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PokemonSprites::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PokemonSprites::class})
     * @var \App\DTO\PokemonSprites|null
     */
    public $sprites;

    /**
     * A set of cries used to depict this Pokémon in the game. A visual representation of the various cries can be found at &lt;a href&#x3D;&#39;https://github.com/PokeAPI/cries#cries&#39;&gt;PokeAPI/cries&lt;/a&gt;
     * @DTA\Data(field="cries")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PokemonCries::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PokemonCries::class})
     * @var \App\DTO\PokemonCries|null
     */
    public $cries;

    /**
     * A list of base stat values for this Pokémon.
     * @DTA\Data(field="stats")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection147::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection147::class})
     * @var \App\DTO\Collection147|null
     */
    public $stats;

    /**
     * A list of details showing stats this pokémon had in previous generations
     * @DTA\Data(field="past_stats")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection149::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection149::class})
     * @var \App\DTO\Collection149|null
     */
    public $past_stats;

    /**
     * A list of details showing types this Pokémon has.
     * @DTA\Data(field="types")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection150::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection150::class})
     * @var \App\DTO\Collection150|null
     */
    public $types;

    /**
     * A list of details showing types this pokémon had in previous generations
     * @DTA\Data(field="past_types")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection152::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection152::class})
     * @var \App\DTO\Collection152|null
     */
    public $past_types;

}
