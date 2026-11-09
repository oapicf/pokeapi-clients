<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class PokedexDetail
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
     * Whether or not this Pokédex originated in the main series of the video games.
     * @DTA\Data(field="is_main_series", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $is_main_series = null;

    /**
     * The description of this resource listed in different languages.
     * @DTA\Data(field="descriptions")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection133::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection133::class})
     */
    public ?\App\DTO\Collection133 $descriptions = null;

    /**
     * The name of this resource listed in different languages.
     * @DTA\Data(field="names")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection134::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection134::class})
     */
    public ?\App\DTO\Collection134 $names = null;

    /**
     * A list of Pokémon catalogued in this Pokédex and their indexes.
     * @DTA\Data(field="pokemon_entries")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection135::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection135::class})
     */
    public ?\App\DTO\Collection135 $pokemon_entries = null;

    /**
     * The region this Pokédex catalogues Pokémon for.
     * @DTA\Data(field="region")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RegionSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RegionSummary::class})
     */
    public ?\App\DTO\RegionSummary $region = null;

    /**
     * A list of version groups this Pokédex is relevant to.
     * @DTA\Data(field="version_groups")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection136::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection136::class})
     */
    public ?\App\DTO\Collection136 $version_groups = null;

}
