<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class PokedexDetail
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
     * Whether or not this Pokédex originated in the main series of the video games.
     * @DTA\Data(field="is_main_series", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $is_main_series;

    /**
     * The description of this resource listed in different languages.
     * @DTA\Data(field="descriptions")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection133::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection133::class})
     * @var \App\DTO\Collection133|null
     */
    public $descriptions;

    /**
     * The name of this resource listed in different languages.
     * @DTA\Data(field="names")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection134::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection134::class})
     * @var \App\DTO\Collection134|null
     */
    public $names;

    /**
     * A list of Pokémon catalogued in this Pokédex and their indexes.
     * @DTA\Data(field="pokemon_entries")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection135::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection135::class})
     * @var \App\DTO\Collection135|null
     */
    public $pokemon_entries;

    /**
     * The region this Pokédex catalogues Pokémon for.
     * @DTA\Data(field="region")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RegionSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RegionSummary::class})
     * @var \App\DTO\RegionSummary|null
     */
    public $region;

    /**
     * A list of version groups this Pokédex is relevant to.
     * @DTA\Data(field="version_groups")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection136::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection136::class})
     * @var \App\DTO\Collection136|null
     */
    public $version_groups;

}
