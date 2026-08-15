//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/ability_detail_pokemon_inner_pokemon.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'move_detail_contest_combos_normal.g.dart';

/// MoveDetailContestCombosNormal
///
/// Properties:
/// * [useBefore] 
/// * [useAfter] 
@BuiltValue()
abstract class MoveDetailContestCombosNormal implements Built<MoveDetailContestCombosNormal, MoveDetailContestCombosNormalBuilder> {
  @BuiltValueField(wireName: r'use_before')
  BuiltList<AbilityDetailPokemonInnerPokemon> get useBefore;

  @BuiltValueField(wireName: r'use_after')
  BuiltList<AbilityDetailPokemonInnerPokemon> get useAfter;

  MoveDetailContestCombosNormal._();

  factory MoveDetailContestCombosNormal([void updates(MoveDetailContestCombosNormalBuilder b)]) = _$MoveDetailContestCombosNormal;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(MoveDetailContestCombosNormalBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<MoveDetailContestCombosNormal> get serializer => _$MoveDetailContestCombosNormalSerializer();
}

class _$MoveDetailContestCombosNormalSerializer implements PrimitiveSerializer<MoveDetailContestCombosNormal> {
  @override
  final Iterable<Type> types = const [MoveDetailContestCombosNormal, _$MoveDetailContestCombosNormal];

  @override
  final String wireName = r'MoveDetailContestCombosNormal';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    MoveDetailContestCombosNormal object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'use_before';
    yield serializers.serialize(
      object.useBefore,
      specifiedType: const FullType(BuiltList, [FullType(AbilityDetailPokemonInnerPokemon)]),
    );
    yield r'use_after';
    yield serializers.serialize(
      object.useAfter,
      specifiedType: const FullType(BuiltList, [FullType(AbilityDetailPokemonInnerPokemon)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    MoveDetailContestCombosNormal object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required MoveDetailContestCombosNormalBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'use_before':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(AbilityDetailPokemonInnerPokemon)]),
          ) as BuiltList<AbilityDetailPokemonInnerPokemon>;
          result.useBefore.replace(valueDes);
          break;
        case r'use_after':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(AbilityDetailPokemonInnerPokemon)]),
          ) as BuiltList<AbilityDetailPokemonInnerPokemon>;
          result.useAfter.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  MoveDetailContestCombosNormal deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = MoveDetailContestCombosNormalBuilder();
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

