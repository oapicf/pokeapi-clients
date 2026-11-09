<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class PokemonDetail
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
     * The base experience gained for defeating this Pokémon.
     * @DTA\Data(field="base_experience", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":-2147483648, "max":2147483647})
     */
    public ?int $base_experience = null;

    /**
     * The height of this Pokémon in decimetres.
     * @DTA\Data(field="height", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":-2147483648, "max":2147483647})
     */
    public ?int $height = null;

    /**
     * Set for exactly one Pokémon used as the default for each species.
     * @DTA\Data(field="is_default", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $is_default = null;

    /**
     * Order for sorting. Almost national order, except families are grouped together.
     * @DTA\Data(field="order", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":-2147483648, "max":2147483647})
     */
    public ?int $order = null;

    /**
     * The weight of this Pokémon in hectograms.
     * @DTA\Data(field="weight", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":-2147483648, "max":2147483647})
     */
    public ?int $weight = null;

    /**
     * A list of abilities this Pokémon could potentially have.
     * @DTA\Data(field="abilities")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection138::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection138::class})
     */
    public ?\App\DTO\Collection138 $abilities = null;

    /**
     * A list of details showing abilities this pokémon had in previous generations
     * @DTA\Data(field="past_abilities")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection140::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection140::class})
     */
    public ?\App\DTO\Collection140 $past_abilities = null;

    /**
     * A list of forms this Pokémon can take on.
     * @DTA\Data(field="forms")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection141::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection141::class})
     */
    public ?\App\DTO\Collection141 $forms = null;

    /**
     * A list of game indices relevent to Pokémon item by generation.
     * @DTA\Data(field="game_indices")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection142::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection142::class})
     */
    public ?\App\DTO\Collection142 $game_indices = null;

    /**
     * A list of items this Pokémon may be holding when encountered.
     * @DTA\Data(field="held_items")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection144::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection144::class})
     */
    public ?\App\DTO\Collection144 $held_items = null;

    /**
     * A link to a list of location areas, as well as encounter details pertaining to specific versions.
     * @DTA\Data(field="location_area_encounters")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $location_area_encounters = null;

    /**
     * A list of moves along with learn methods and level details pertaining to specific version groups.
     * @DTA\Data(field="moves")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection146::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection146::class})
     */
    public ?\App\DTO\Collection146 $moves = null;

    /**
     * The species this Pokémon belongs to.
     * @DTA\Data(field="species")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PokemonSpeciesSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PokemonSpeciesSummary::class})
     */
    public ?\App\DTO\PokemonSpeciesSummary $species = null;

    /**
     * A set of sprites used to depict this Pokémon in the game. A visual representation of the various sprites can be found at &lt;a href&#x3D;&#39;https://github.com/PokeAPI/sprites#sprites&#39;&gt;PokeAPI/sprites&lt;/a&gt;
     * @DTA\Data(field="sprites")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PokemonSprites::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PokemonSprites::class})
     */
    public ?\App\DTO\PokemonSprites $sprites = null;

    /**
     * A set of cries used to depict this Pokémon in the game. A visual representation of the various cries can be found at &lt;a href&#x3D;&#39;https://github.com/PokeAPI/cries#cries&#39;&gt;PokeAPI/cries&lt;/a&gt;
     * @DTA\Data(field="cries")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PokemonCries::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PokemonCries::class})
     */
    public ?\App\DTO\PokemonCries $cries = null;

    /**
     * A list of base stat values for this Pokémon.
     * @DTA\Data(field="stats")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection147::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection147::class})
     */
    public ?\App\DTO\Collection147 $stats = null;

    /**
     * A list of details showing stats this pokémon had in previous generations
     * @DTA\Data(field="past_stats")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection149::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection149::class})
     */
    public ?\App\DTO\Collection149 $past_stats = null;

    /**
     * A list of details showing types this Pokémon has.
     * @DTA\Data(field="types")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection150::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection150::class})
     */
    public ?\App\DTO\Collection150 $types = null;

    /**
     * A list of details showing types this pokémon had in previous generations
     * @DTA\Data(field="past_types")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection152::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection152::class})
     */
    public ?\App\DTO\Collection152 $past_types = null;

}
