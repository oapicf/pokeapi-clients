<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class GenerationDetail
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
     * A list of abilities that were introduced in this generation.
     * @DTA\Data(field="abilities")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection41::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection41::class})
     */
    public ?\App\DTO\Collection41 $abilities = null;

    /**
     * The main region travelled in this generation.
     * @DTA\Data(field="main_region")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RegionSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RegionSummary::class})
     */
    public ?\App\DTO\RegionSummary $main_region = null;

    /**
     * A list of moves that were introduced in this generation.
     * @DTA\Data(field="moves")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection42::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection42::class})
     */
    public ?\App\DTO\Collection42 $moves = null;

    /**
     * The name of this resource listed in different languages.
     * @DTA\Data(field="names")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection43::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection43::class})
     */
    public ?\App\DTO\Collection43 $names = null;

    /**
     * A list of Pokémon species that were introduced in this generation.
     * @DTA\Data(field="pokemon_species")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection44::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection44::class})
     */
    public ?\App\DTO\Collection44 $pokemon_species = null;

    /**
     * A list of types that were introduced in this generation.
     * @DTA\Data(field="types")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection45::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection45::class})
     */
    public ?\App\DTO\Collection45 $types = null;

    /**
     * A list of version groups that were introduced in this generation.
     * @DTA\Data(field="version_groups")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection46::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection46::class})
     */
    public ?\App\DTO\Collection46 $version_groups = null;

}
