<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for pokemonEncountersRetrieve
 */
class PokemonEncountersRetrieveParameterData
{
    /**
     * @DTA\Data(subset="path", field="pokemon_id")
     * @DTA\Strategy(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $pokemon_id = null;

}
