<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class PokemonMoveVersionGroup
{
    /**
     * The minimum level to learn the move.
     * @DTA\Data(field="level_learned_at")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $level_learned_at = null;

    /**
     * The method by which the move is learned.
     * @DTA\Data(field="move_learn_method")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MoveLearnMethodSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MoveLearnMethodSummary::class})
     */
    public ?\App\DTO\MoveLearnMethodSummary $move_learn_method = null;

    /**
     * The version group in which the move is learned.
     * @DTA\Data(field="version_group")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\VersionGroupSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\VersionGroupSummary::class})
     */
    public ?\App\DTO\VersionGroupSummary $version_group = null;

    /**
     * Order by which the pokemon will learn the move. A newly learnt move will replace the move with lowest order.
     * @DTA\Data(field="order", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $order = null;

}
