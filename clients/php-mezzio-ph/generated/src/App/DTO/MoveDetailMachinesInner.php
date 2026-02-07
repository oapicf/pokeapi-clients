<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class MoveDetailMachinesInner
{
    /**
     * @DTA\Data(field="machine")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MoveDetailMachinesInnerMachine::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MoveDetailMachinesInnerMachine::class})
     * @var \App\DTO\MoveDetailMachinesInnerMachine|null
     */
    public $machine;

    /**
     * @DTA\Data(field="version_group")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AbilityDetailPokemonInnerPokemon::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AbilityDetailPokemonInnerPokemon::class})
     * @var \App\DTO\AbilityDetailPokemonInnerPokemon|null
     */
    public $version_group;

}
