<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class TypeDetailPastDamageRelationsInner
{
    /**
     * @DTA\Data(field="generation")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AbilityDetailPokemonInnerPokemon::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AbilityDetailPokemonInnerPokemon::class})
     */
    public ?\App\DTO\AbilityDetailPokemonInnerPokemon $generation = null;

    /**
     * @DTA\Data(field="damage_relations")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TypeDetailPastDamageRelationsInnerDamageRelations::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TypeDetailPastDamageRelationsInnerDamageRelations::class})
     */
    public ?\App\DTO\TypeDetailPastDamageRelationsInnerDamageRelations $damage_relations = null;

}
