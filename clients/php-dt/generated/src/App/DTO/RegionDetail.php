<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class RegionDetail
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
     * A list of locations that can be found in this region.
     * @DTA\Data(field="locations")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection181::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection181::class})
     */
    public ?\App\DTO\Collection181 $locations = null;

    /**
     * The generation this region was introduced in.
     * @DTA\Data(field="main_generation")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\GenerationSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\GenerationSummary::class})
     */
    public ?\App\DTO\GenerationSummary $main_generation = null;

    /**
     * The name of this resource listed in different languages.
     * @DTA\Data(field="names")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection182::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection182::class})
     */
    public ?\App\DTO\Collection182 $names = null;

    /**
     * A list of pokédexes that catalogue Pokémon in this region.
     * @DTA\Data(field="pokedexes")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection183::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection183::class})
     */
    public ?\App\DTO\Collection183 $pokedexes = null;

    /**
     * A list of version groups where this region can be visited.
     * @DTA\Data(field="version_groups")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection184::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection184::class})
     */
    public ?\App\DTO\Collection184 $version_groups = null;

}
