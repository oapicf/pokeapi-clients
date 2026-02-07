<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class MoveDetailMachinesInner
{
    /**
     * @DTA\Data(field="machine")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MoveDetailMachinesInnerMachine::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MoveDetailMachinesInnerMachine::class})
     */
    public ?\App\DTO\MoveDetailMachinesInnerMachine $machine = null;

    /**
     * @DTA\Data(field="version_group")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AbilityDetailPokemonInnerPokemon::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AbilityDetailPokemonInnerPokemon::class})
     */
    public ?\App\DTO\AbilityDetailPokemonInnerPokemon $version_group = null;

}
