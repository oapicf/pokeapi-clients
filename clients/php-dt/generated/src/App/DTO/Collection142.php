<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * @DTA\Strategy(name="ObjectList", options={"type":\App\DTO\PokemonDetailMovesInnerVersionGroupDetailsInner::class})
 * @DTA\Validator(name="Collection", options={"validators":{
 *     {"name":"TypeCompliant", "options":{"type":\App\DTO\PokemonDetailMovesInnerVersionGroupDetailsInner::class}}
 * }})
 */
class Collection142 extends \ArrayObject
{
}
