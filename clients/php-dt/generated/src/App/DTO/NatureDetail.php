<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class NatureDetail
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
     * The stat decreased by 10% in Pokémon with this nature.
     * @DTA\Data(field="decreased_stat")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\StatSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\StatSummary::class})
     */
    public ?\App\DTO\StatSummary $decreased_stat = null;

    /**
     * The stat increased by 10% in Pokémon with this nature.
     * @DTA\Data(field="increased_stat")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\StatSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\StatSummary::class})
     */
    public ?\App\DTO\StatSummary $increased_stat = null;

    /**
     * The flavor liked by Pokémon with this nature.
     * @DTA\Data(field="likes_flavor")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BerryFlavorSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BerryFlavorSummary::class})
     */
    public ?\App\DTO\BerryFlavorSummary $likes_flavor = null;

    /**
     * The flavor hated by Pokémon with this nature.
     * @DTA\Data(field="hates_flavor")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BerryFlavorSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BerryFlavorSummary::class})
     */
    public ?\App\DTO\BerryFlavorSummary $hates_flavor = null;

    /**
     * A list of Pokéathlon stats this nature effects and how much it effects them.
     * @DTA\Data(field="pokeathlon_stat_changes")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection126::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection126::class})
     */
    public ?\App\DTO\Collection126 $pokeathlon_stat_changes = null;

    /**
     * A list of battle styles and how likely a Pokémon with this nature is to use them in the Battle Palace or Battle Tent.
     * @DTA\Data(field="move_battle_style_preferences")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection127::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection127::class})
     */
    public ?\App\DTO\Collection127 $move_battle_style_preferences = null;

    /**
     * The name of this resource listed in different languages.
     * @DTA\Data(field="names")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection128::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection128::class})
     */
    public ?\App\DTO\Collection128 $names = null;

}
