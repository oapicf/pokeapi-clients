<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Serializer for the Type resource
 */
class TypeDetail
{
    /**
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $id = null;

    /**
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":100})
     */
    public ?string $name = null;

    /**
     * @DTA\Data(field="damage_relations")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TypeDetailDamageRelations::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TypeDetailDamageRelations::class})
     */
    public ?\App\DTO\TypeDetailDamageRelations $damage_relations = null;

    /**
     * @DTA\Data(field="past_damage_relations")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection205::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection205::class})
     */
    public ?\App\DTO\Collection205 $past_damage_relations = null;

    /**
     * @DTA\Data(field="game_indices")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection206::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection206::class})
     */
    public ?\App\DTO\Collection206 $game_indices = null;

    /**
     * @DTA\Data(field="generation")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\GenerationSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\GenerationSummary::class})
     */
    public ?\App\DTO\GenerationSummary $generation = null;

    /**
     * @DTA\Data(field="move_damage_class")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MoveDamageClassSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MoveDamageClassSummary::class})
     */
    public ?\App\DTO\MoveDamageClassSummary $move_damage_class = null;

    /**
     * @DTA\Data(field="names")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection207::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection207::class})
     */
    public ?\App\DTO\Collection207 $names = null;

    /**
     * @DTA\Data(field="pokemon")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection208::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection208::class})
     */
    public ?\App\DTO\Collection208 $pokemon = null;

    /**
     * @DTA\Data(field="moves")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection209::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection209::class})
     */
    public ?\App\DTO\Collection209 $moves = null;

    /**
     * @DTA\Data(field="sprites")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection211::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection211::class})
     */
    public ?\App\DTO\Collection211 $sprites = null;

}
