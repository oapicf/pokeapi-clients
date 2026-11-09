<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class LocationAreaDetail
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
     * The internal id of an API resource within game data.
     * @DTA\Data(field="game_index")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":-2147483648, "max":2147483647})
     */
    public ?int $game_index = null;

    /**
     * A list of methods in which Pokémon may be encountered in this area and how likely the method will occur depending on the version of the game.
     * @DTA\Data(field="encounter_method_rates")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection87::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection87::class})
     */
    public ?\App\DTO\Collection87 $encounter_method_rates = null;

    /**
     * The region this location area can be found in.
     * @DTA\Data(field="location")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\LocationSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\LocationSummary::class})
     */
    public ?\App\DTO\LocationSummary $location = null;

    /**
     * The name of this resource listed in different languages.
     * @DTA\Data(field="names")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection88::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection88::class})
     */
    public ?\App\DTO\Collection88 $names = null;

    /**
     * A list of Pokémon that can be encountered in this area along with version specific details about the encounter.
     * @DTA\Data(field="pokemon_encounters")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection92::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection92::class})
     */
    public ?\App\DTO\Collection92 $pokemon_encounters = null;

}
