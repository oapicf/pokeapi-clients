<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class PokemonFormDetail
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
     * @DTA\Data(field="order", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $order = null;

    /**
     * @DTA\Data(field="form_order", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $form_order = null;

    /**
     * @DTA\Data(field="is_default", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $is_default = null;

    /**
     * @DTA\Data(field="is_battle_only", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $is_battle_only = null;

    /**
     * @DTA\Data(field="is_mega", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $is_mega = null;

    /**
     * @DTA\Data(field="form_name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":30})
     */
    public ?string $form_name = null;

    /**
     * @DTA\Data(field="pokemon")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PokemonSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PokemonSummary::class})
     */
    public ?\App\DTO\PokemonSummary $pokemon = null;

    /**
     * @DTA\Data(field="sprites")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PokemonFormDetailSprites::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PokemonFormDetailSprites::class})
     */
    public ?\App\DTO\PokemonFormDetailSprites $sprites = null;

    /**
     * @DTA\Data(field="version_group")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\VersionGroupSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\VersionGroupSummary::class})
     */
    public ?\App\DTO\VersionGroupSummary $version_group = null;

    /**
     * @DTA\Data(field="form_names")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection154::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection154::class})
     */
    public ?\App\DTO\Collection154 $form_names = null;

    /**
     * @DTA\Data(field="names")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection155::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection155::class})
     */
    public ?\App\DTO\Collection155 $names = null;

    /**
     * @DTA\Data(field="types")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection156::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection156::class})
     */
    public ?\App\DTO\Collection156 $types = null;

}
