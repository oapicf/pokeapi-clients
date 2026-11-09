//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/pokemon_form_sprites.dart';
import 'package:openapi/src/model/pokemon_summary.dart';
import 'package:openapi/src/model/pokemon_form_type.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/pokemon_form_name.dart';
import 'package:openapi/src/model/version_group_summary.dart';
import 'package:openapi/src/model/pokemon_form_flavor_text.dart';
import 'package:openapi/src/model/pokemon_form_trigger_condition.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pokemon_form_detail.g.dart';

/// PokemonFormDetail
///
/// Properties:
/// * [id] - The identifier for this resource.
/// * [name] - The name for this resource.
/// * [order] - The order in which forms should be sorted within all forms. Multiple forms may have equal order, in which case they should fall back on sorting by name.
/// * [formOrder] - The order in which forms should be sorted within a species' forms.
/// * [isDefault] - True for exactly one form used as the default for each Pokémon.
/// * [isBattleOnly] - Whether or not this form can only happen during battle.
/// * [isMega] - Whether or not this form requires mega evolution.
/// * [formName] - The name of this form.
/// * [pokemon] - The Pokémon that can take on this form.
/// * [sprites] - A set of sprites used to depict this Pokémon form in the game.
/// * [versionGroup] - The version group this Pokémon form was introduced in.
/// * [formNames] - The form specific form name of this Pokémon form, or empty if the form does not have a specific name.
/// * [names] - The form specific full name of this Pokémon form, or empty if the form does not have a specific name.
/// * [types] - A list of details showing types this Pokémon form has.
/// * [triggerConditions] - The conditions that trigger this form. Resource names and URLs are included when the trigger requires a resource.
/// * [flavorTextEntries] - The flavor text of this form listed in different languages and versions.
@BuiltValue()
abstract class PokemonFormDetail implements Built<PokemonFormDetail, PokemonFormDetailBuilder> {
  /// The identifier for this resource.
  @BuiltValueField(wireName: r'id')
  int get id;

  /// The name for this resource.
  @BuiltValueField(wireName: r'name')
  String get name;

  /// The order in which forms should be sorted within all forms. Multiple forms may have equal order, in which case they should fall back on sorting by name.
  @BuiltValueField(wireName: r'order')
  int? get order;

  /// The order in which forms should be sorted within a species' forms.
  @BuiltValueField(wireName: r'form_order')
  int? get formOrder;

  /// True for exactly one form used as the default for each Pokémon.
  @BuiltValueField(wireName: r'is_default')
  bool? get isDefault;

  /// Whether or not this form can only happen during battle.
  @BuiltValueField(wireName: r'is_battle_only')
  bool? get isBattleOnly;

  /// Whether or not this form requires mega evolution.
  @BuiltValueField(wireName: r'is_mega')
  bool? get isMega;

  /// The name of this form.
  @BuiltValueField(wireName: r'form_name')
  String get formName;

  /// The Pokémon that can take on this form.
  @BuiltValueField(wireName: r'pokemon')
  PokemonSummary get pokemon;

  /// A set of sprites used to depict this Pokémon form in the game.
  @BuiltValueField(wireName: r'sprites')
  PokemonFormSprites get sprites;

  /// The version group this Pokémon form was introduced in.
  @BuiltValueField(wireName: r'version_group')
  VersionGroupSummary get versionGroup;

  /// The form specific form name of this Pokémon form, or empty if the form does not have a specific name.
  @BuiltValueField(wireName: r'form_names')
  BuiltList<PokemonFormName> get formNames;

  /// The form specific full name of this Pokémon form, or empty if the form does not have a specific name.
  @BuiltValueField(wireName: r'names')
  BuiltList<PokemonFormName> get names;

  /// A list of details showing types this Pokémon form has.
  @BuiltValueField(wireName: r'types')
  BuiltList<PokemonFormType> get types;

  /// The conditions that trigger this form. Resource names and URLs are included when the trigger requires a resource.
  @BuiltValueField(wireName: r'trigger_conditions')
  BuiltList<PokemonFormTriggerCondition> get triggerConditions;

  /// The flavor text of this form listed in different languages and versions.
  @BuiltValueField(wireName: r'flavor_text_entries')
  BuiltList<PokemonFormFlavorText> get flavorTextEntries;

  PokemonFormDetail._();

  factory PokemonFormDetail([void updates(PokemonFormDetailBuilder b)]) = _$PokemonFormDetail;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PokemonFormDetailBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PokemonFormDetail> get serializer => _$PokemonFormDetailSerializer();
}

class _$PokemonFormDetailSerializer implements PrimitiveSerializer<PokemonFormDetail> {
  @override
  final Iterable<Type> types = const [PokemonFormDetail, _$PokemonFormDetail];

  @override
  final String wireName = r'PokemonFormDetail';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PokemonFormDetail object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(int),
    );
    yield r'name';
    yield serializers.serialize(
      object.name,
      specifiedType: const FullType(String),
    );
    if (object.order != null) {
      yield r'order';
      yield serializers.serialize(
        object.order,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.formOrder != null) {
      yield r'form_order';
      yield serializers.serialize(
        object.formOrder,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.isDefault != null) {
      yield r'is_default';
      yield serializers.serialize(
        object.isDefault,
        specifiedType: const FullType(bool),
      );
    }
    if (object.isBattleOnly != null) {
      yield r'is_battle_only';
      yield serializers.serialize(
        object.isBattleOnly,
        specifiedType: const FullType(bool),
      );
    }
    if (object.isMega != null) {
      yield r'is_mega';
      yield serializers.serialize(
        object.isMega,
        specifiedType: const FullType(bool),
      );
    }
    yield r'form_name';
    yield serializers.serialize(
      object.formName,
      specifiedType: const FullType(String),
    );
    yield r'pokemon';
    yield serializers.serialize(
      object.pokemon,
      specifiedType: const FullType(PokemonSummary),
    );
    yield r'sprites';
    yield serializers.serialize(
      object.sprites,
      specifiedType: const FullType(PokemonFormSprites),
    );
    yield r'version_group';
    yield serializers.serialize(
      object.versionGroup,
      specifiedType: const FullType(VersionGroupSummary),
    );
    yield r'form_names';
    yield serializers.serialize(
      object.formNames,
      specifiedType: const FullType(BuiltList, [FullType(PokemonFormName)]),
    );
    yield r'names';
    yield serializers.serialize(
      object.names,
      specifiedType: const FullType(BuiltList, [FullType(PokemonFormName)]),
    );
    yield r'types';
    yield serializers.serialize(
      object.types,
      specifiedType: const FullType(BuiltList, [FullType(PokemonFormType)]),
    );
    yield r'trigger_conditions';
    yield serializers.serialize(
      object.triggerConditions,
      specifiedType: const FullType(BuiltList, [FullType(PokemonFormTriggerCondition)]),
    );
    yield r'flavor_text_entries';
    yield serializers.serialize(
      object.flavorTextEntries,
      specifiedType: const FullType(BuiltList, [FullType(PokemonFormFlavorText)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    PokemonFormDetail object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PokemonFormDetailBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.id = valueDes;
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        case r'order':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.order = valueDes;
          break;
        case r'form_order':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.formOrder = valueDes;
          break;
        case r'is_default':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.isDefault = valueDes;
          break;
        case r'is_battle_only':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.isBattleOnly = valueDes;
          break;
        case r'is_mega':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.isMega = valueDes;
          break;
        case r'form_name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.formName = valueDes;
          break;
        case r'pokemon':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(PokemonSummary),
          ) as PokemonSummary;
          result.pokemon.replace(valueDes);
          break;
        case r'sprites':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(PokemonFormSprites),
          ) as PokemonFormSprites;
          result.sprites.replace(valueDes);
          break;
        case r'version_group':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(VersionGroupSummary),
          ) as VersionGroupSummary;
          result.versionGroup.replace(valueDes);
          break;
        case r'form_names':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(PokemonFormName)]),
          ) as BuiltList<PokemonFormName>;
          result.formNames.replace(valueDes);
          break;
        case r'names':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(PokemonFormName)]),
          ) as BuiltList<PokemonFormName>;
          result.names.replace(valueDes);
          break;
        case r'types':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(PokemonFormType)]),
          ) as BuiltList<PokemonFormType>;
          result.types.replace(valueDes);
          break;
        case r'trigger_conditions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(PokemonFormTriggerCondition)]),
          ) as BuiltList<PokemonFormTriggerCondition>;
          result.triggerConditions.replace(valueDes);
          break;
        case r'flavor_text_entries':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(PokemonFormFlavorText)]),
          ) as BuiltList<PokemonFormFlavorText>;
          result.flavorTextEntries.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  PokemonFormDetail deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PokemonFormDetailBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}


