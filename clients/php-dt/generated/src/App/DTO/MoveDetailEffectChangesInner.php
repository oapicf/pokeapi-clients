<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class MoveDetailEffectChangesInner
{
    /**
     * @DTA\Data(field="effect_entries")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection93::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection93::class})
     */
    public ?\App\DTO\Collection93 $effect_entries = null;

    /**
     * @DTA\Data(field="version_group")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AbilityDetailPokemonInnerPokemon::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AbilityDetailPokemonInnerPokemon::class})
     */
    public ?\App\DTO\AbilityDetailPokemonInnerPokemon $version_group = null;

}
