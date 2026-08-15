//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/ability_detail_pokemon_inner_pokemon.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pokemon_detail_moves_inner_version_group_details_inner.g.dart';

/// PokemonDetailMovesInnerVersionGroupDetailsInner
///
/// Properties:
/// * [levelLearnedAt] 
/// * [moveLearnMethod] 
/// * [versionGroup] 
@BuiltValue()
abstract class PokemonDetailMovesInnerVersionGroupDetailsInner implements Built<PokemonDetailMovesInnerVersionGroupDetailsInner, PokemonDetailMovesInnerVersionGroupDetailsInnerBuilder> {
  @BuiltValueField(wireName: r'level_learned_at')
  int get levelLearnedAt;

  @BuiltValueField(wireName: r'move_learn_method')
  AbilityDetailPokemonInnerPokemon get moveLearnMethod;

  @BuiltValueField(wireName: r'version_group')
  AbilityDetailPokemonInnerPokemon get versionGroup;

  PokemonDetailMovesInnerVersionGroupDetailsInner._();

  factory PokemonDetailMovesInnerVersionGroupDetailsInner([void updates(PokemonDetailMovesInnerVersionGroupDetailsInnerBuilder b)]) = _$PokemonDetailMovesInnerVersionGroupDetailsInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PokemonDetailMovesInnerVersionGroupDetailsInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PokemonDetailMovesInnerVersionGroupDetailsInner> get serializer => _$PokemonDetailMovesInnerVersionGroupDetailsInnerSerializer();
}

class _$PokemonDetailMovesInnerVersionGroupDetailsInnerSerializer implements PrimitiveSerializer<PokemonDetailMovesInnerVersionGroupDetailsInner> {
  @override
  final Iterable<Type> types = const [PokemonDetailMovesInnerVersionGroupDetailsInner, _$PokemonDetailMovesInnerVersionGroupDetailsInner];

  @override
  final String wireName = r'PokemonDetailMovesInnerVersionGroupDetailsInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PokemonDetailMovesInnerVersionGroupDetailsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'level_learned_at';
    yield serializers.serialize(
      object.levelLearnedAt,
      specifiedType: const FullType(int),
    );
    yield r'move_learn_method';
    yield serializers.serialize(
      object.moveLearnMethod,
      specifiedType: const FullType(AbilityDetailPokemonInnerPokemon),
    );
    yield r'version_group';
    yield serializers.serialize(
      object.versionGroup,
      specifiedType: const FullType(AbilityDetailPokemonInnerPokemon),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    PokemonDetailMovesInnerVersionGroupDetailsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PokemonDetailMovesInnerVersionGroupDetailsInnerBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'level_learned_at':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.levelLearnedAt = valueDes;
          break;
        case r'move_learn_method':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AbilityDetailPokemonInnerPokemon),
          ) as AbilityDetailPokemonInnerPokemon;
          result.moveLearnMethod.replace(valueDes);
          break;
        case r'version_group':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AbilityDetailPokemonInnerPokemon),
          ) as AbilityDetailPokemonInnerPokemon;
          result.versionGroup.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  PokemonDetailMovesInnerVersionGroupDetailsInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PokemonDetailMovesInnerVersionGroupDetailsInnerBuilder();
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

